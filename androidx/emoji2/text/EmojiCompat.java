package androidx.emoji2.text;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.AnyThread;
import androidx.annotation.CheckResult;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.collection.ArraySet;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@AnyThread
public class EmojiCompat {
    @RestrictTo({Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface CodepointSequenceMatchResult {
    }

    public static abstract class Config {
        public final MetadataRepoLoader a;
        public SpanFactory b;
        public boolean c;
        public boolean d;
        public int[] e;
        public ArraySet f;
        public boolean g;
        public int h;
        public int i;
        public GlyphChecker j;

        public Config(@NonNull MetadataRepoLoader emojiCompat$MetadataRepoLoader0) {
            this.h = 0xFF00FF00;
            this.i = 0;
            this.j = new d();
            Preconditions.checkNotNull(emojiCompat$MetadataRepoLoader0, "metadataLoader cannot be null.");
            this.a = emojiCompat$MetadataRepoLoader0;
        }

        @NonNull
        public final MetadataRepoLoader getMetadataRepoLoader() {
            return this.a;
        }

        @NonNull
        public Config registerInitCallback(@NonNull InitCallback emojiCompat$InitCallback0) {
            Preconditions.checkNotNull(emojiCompat$InitCallback0, "initCallback cannot be null");
            if(this.f == null) {
                this.f = new ArraySet();
            }
            this.f.add(emojiCompat$InitCallback0);
            return this;
        }

        @NonNull
        public Config setEmojiSpanIndicatorColor(@ColorInt int v) {
            this.h = v;
            return this;
        }

        @NonNull
        public Config setEmojiSpanIndicatorEnabled(boolean z) {
            this.g = z;
            return this;
        }

        @NonNull
        public Config setGlyphChecker(@NonNull GlyphChecker emojiCompat$GlyphChecker0) {
            Preconditions.checkNotNull(emojiCompat$GlyphChecker0, "GlyphChecker cannot be null");
            this.j = emojiCompat$GlyphChecker0;
            return this;
        }

        @NonNull
        public Config setMetadataLoadStrategy(int v) {
            this.i = v;
            return this;
        }

        @NonNull
        public Config setReplaceAll(boolean z) {
            this.c = z;
            return this;
        }

        @NonNull
        public Config setSpanFactory(@NonNull SpanFactory emojiCompat$SpanFactory0) {
            this.b = emojiCompat$SpanFactory0;
            return this;
        }

        @NonNull
        public Config setUseEmojiAsDefaultStyle(boolean z) {
            return this.setUseEmojiAsDefaultStyle(z, null);
        }

        @NonNull
        public Config setUseEmojiAsDefaultStyle(boolean z, @Nullable List list0) {
            this.d = z;
            if(z && list0 != null) {
                this.e = new int[list0.size()];
                int v = 0;
                for(Object object0: list0) {
                    this.e[v] = (int)(((Integer)object0));
                    ++v;
                }
                Arrays.sort(this.e);
                return this;
            }
            this.e = null;
            return this;
        }

        @NonNull
        public Config unregisterInitCallback(@NonNull InitCallback emojiCompat$InitCallback0) {
            Preconditions.checkNotNull(emojiCompat$InitCallback0, "initCallback cannot be null");
            ArraySet arraySet0 = this.f;
            if(arraySet0 != null) {
                arraySet0.remove(emojiCompat$InitCallback0);
            }
            return this;
        }
    }

    @RestrictTo({Scope.LIBRARY})
    public static class DefaultSpanFactory implements SpanFactory {
        @Override  // androidx.emoji2.text.EmojiCompat$SpanFactory
        @NonNull
        @RequiresApi(19)
        public EmojiSpan createSpan(@NonNull TypefaceEmojiRasterizer typefaceEmojiRasterizer0) {
            return new TypefaceEmojiSpan(typefaceEmojiRasterizer0);
        }
    }

    public interface GlyphChecker {
        boolean hasGlyph(@NonNull CharSequence arg1, @IntRange(from = 0L) int arg2, @IntRange(from = 0L) int arg3, @IntRange(from = 0L) int arg4);
    }

    public static abstract class InitCallback {
        public void onFailed(@Nullable Throwable throwable0) {
        }

        public void onInitialized() {
        }
    }

    @RestrictTo({Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface LoadStrategy {
    }

    public interface MetadataRepoLoader {
        void load(@NonNull MetadataRepoLoaderCallback arg1);
    }

    public static abstract class MetadataRepoLoaderCallback {
        public abstract void onFailed(@Nullable Throwable arg1);

        public abstract void onLoaded(@NonNull MetadataRepo arg1);
    }

    @RestrictTo({Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ReplaceStrategy {
    }

    public interface SpanFactory {
        @NonNull
        @RequiresApi(19)
        EmojiSpan createSpan(@NonNull TypefaceEmojiRasterizer arg1);
    }

    public static final String EDITOR_INFO_METAVERSION_KEY = "android.support.text.emoji.emojiCompat_metadataVersion";
    public static final String EDITOR_INFO_REPLACE_ALL_KEY = "android.support.text.emoji.emojiCompat_replaceAll";
    public static final int EMOJI_FALLBACK = 2;
    public static final int EMOJI_SUPPORTED = 1;
    public static final int EMOJI_UNSUPPORTED = 0;
    public static final int LOAD_STATE_DEFAULT = 3;
    public static final int LOAD_STATE_FAILED = 2;
    public static final int LOAD_STATE_LOADING = 0;
    public static final int LOAD_STATE_SUCCEEDED = 1;
    public static final int LOAD_STRATEGY_DEFAULT = 0;
    public static final int LOAD_STRATEGY_MANUAL = 1;
    public static final int REPLACE_STRATEGY_ALL = 1;
    public static final int REPLACE_STRATEGY_DEFAULT = 0;
    public static final int REPLACE_STRATEGY_NON_EXISTENT = 2;
    public final ReentrantReadWriteLock a;
    public final ArraySet b;
    public volatile int c;
    public final Handler d;
    public final f e;
    public final MetadataRepoLoader f;
    public final SpanFactory g;
    public final boolean h;
    public final boolean i;
    public final int[] j;
    public final boolean k;
    public final int l;
    public final int m;
    public final GlyphChecker n;
    public static final Object o;
    public static final Object p;
    public static volatile EmojiCompat q;
    public static volatile boolean r;

    static {
        EmojiCompat.o = new Object();
        EmojiCompat.p = new Object();
    }

    public EmojiCompat(Config emojiCompat$Config0) {
        ReentrantReadWriteLock reentrantReadWriteLock0 = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock0;
        this.c = 3;
        this.h = emojiCompat$Config0.c;
        this.i = emojiCompat$Config0.d;
        this.j = emojiCompat$Config0.e;
        this.k = emojiCompat$Config0.g;
        this.l = emojiCompat$Config0.h;
        MetadataRepoLoader emojiCompat$MetadataRepoLoader0 = emojiCompat$Config0.a;
        this.f = emojiCompat$MetadataRepoLoader0;
        int v = emojiCompat$Config0.i;
        this.m = v;
        this.n = emojiCompat$Config0.j;
        this.d = new Handler(Looper.getMainLooper());
        ArraySet arraySet0 = new ArraySet();
        this.b = arraySet0;
        SpanFactory emojiCompat$SpanFactory0 = emojiCompat$Config0.b;
        if(emojiCompat$SpanFactory0 == null) {
            emojiCompat$SpanFactory0 = new DefaultSpanFactory();
        }
        this.g = emojiCompat$SpanFactory0;
        if(emojiCompat$Config0.f != null && !emojiCompat$Config0.f.isEmpty()) {
            arraySet0.addAll(emojiCompat$Config0.f);
        }
        f f0 = new f(this);  // 初始化器: Landroidx/emoji2/text/g;-><init>(Landroidx/emoji2/text/EmojiCompat;)V
        this.e = f0;
        reentrantReadWriteLock0.writeLock().lock();
        if(v == 0) {
            this.c = 0;
        }
        reentrantReadWriteLock0.writeLock().unlock();
        if(this.getLoadState() == 0) {
            try {
                emojiCompat$MetadataRepoLoader0.load(new e(f0));
            }
            catch(Throwable throwable0) {
                this.b(throwable0);
            }
        }
    }

    public final boolean a() {
        return this.getLoadState() == 1;
    }

    public final void b(Throwable throwable0) {
        ArrayList arrayList0 = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList0.addAll(this.b);
            this.b.clear();
        }
        finally {
            this.a.writeLock().unlock();
        }
        h h0 = new h(arrayList0, this.c, throwable0);
        this.d.post(h0);
    }

    @NonNull
    public static EmojiCompat get() {
        synchronized(EmojiCompat.o) {
            EmojiCompat emojiCompat0 = EmojiCompat.q;
            Preconditions.checkState(emojiCompat0 != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK\'s manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            return emojiCompat0;
        }
    }

    @NonNull
    public String getAssetSignature() {
        Preconditions.checkState(this.a(), "Not initialized yet");
        String s = this.e.c.getMetadataList().sourceSha();
        return s == null ? "" : s;
    }

    public int getEmojiEnd(@NonNull CharSequence charSequence0, @IntRange(from = 0L) int v) {
        t t0 = this.e.b;
        t0.getClass();
        if(v >= 0 && v < charSequence0.length()) {
            if(charSequence0 instanceof Spanned) {
                EmojiSpan[] arr_emojiSpan = (EmojiSpan[])((Spanned)charSequence0).getSpans(v, v + 1, EmojiSpan.class);
                return arr_emojiSpan.length <= 0 ? ((q)t0.c(charSequence0, Math.max(0, v - 16), Math.min(charSequence0.length(), v + 16), 0x7FFFFFFF, true, new q(v))).c : ((Spanned)charSequence0).getSpanEnd(arr_emojiSpan[0]);
            }
            return ((q)t0.c(charSequence0, Math.max(0, v - 16), Math.min(charSequence0.length(), v + 16), 0x7FFFFFFF, true, new q(v))).c;
        }
        return -1;
    }

    public int getEmojiMatch(@NonNull CharSequence charSequence0, @IntRange(from = 0L) int v) {
        Preconditions.checkState(this.a(), "Not initialized yet");
        Preconditions.checkNotNull(charSequence0, "sequence cannot be null");
        return this.e.b.b(charSequence0, v);
    }

    @ColorInt
    @RestrictTo({Scope.LIBRARY_GROUP})
    public int getEmojiSpanIndicatorColor() {
        return this.l;
    }

    public int getEmojiStart(@NonNull CharSequence charSequence0, @IntRange(from = 0L) int v) {
        t t0 = this.e.b;
        t0.getClass();
        if(v >= 0 && v < charSequence0.length()) {
            if(charSequence0 instanceof Spanned) {
                EmojiSpan[] arr_emojiSpan = (EmojiSpan[])((Spanned)charSequence0).getSpans(v, v + 1, EmojiSpan.class);
                return arr_emojiSpan.length <= 0 ? ((q)t0.c(charSequence0, Math.max(0, v - 16), Math.min(charSequence0.length(), v + 16), 0x7FFFFFFF, true, new q(v))).b : ((Spanned)charSequence0).getSpanStart(arr_emojiSpan[0]);
            }
            return ((q)t0.c(charSequence0, Math.max(0, v - 16), Math.min(charSequence0.length(), v + 16), 0x7FFFFFFF, true, new q(v))).b;
        }
        return -1;
    }

    public int getLoadState() {
        this.a.readLock().lock();
        int v = this.c;
        this.a.readLock().unlock();
        return v;
    }

    public static boolean handleDeleteSurroundingText(@NonNull InputConnection inputConnection0, @NonNull Editable editable0, @IntRange(from = 0L) int v, @IntRange(from = 0L) int v1, boolean z) {
        boolean z2;
        int v7;
        boolean z1;
        if(editable0 != null && inputConnection0 != null && v >= 0 && v1 >= 0) {
            int v2 = Selection.getSelectionStart(editable0);
            int v3 = Selection.getSelectionEnd(editable0);
            if(v2 != -1 && v3 != -1 && v2 == v3) {
                if(z) {
                    int v4 = Math.max(v, 0);
                    if(v2 >= 0 && editable0.length() >= v2 && v4 >= 0) {
                        while(true) {
                            z1 = false;
                        label_8:
                            if(v4 == 0) {
                                goto label_26;
                            }
                            --v2;
                            if(v2 < 0) {
                                if(z1) {
                                    goto label_25;
                                }
                                v2 = 0;
                                goto label_26;
                            }
                            int v5 = editable0.charAt(v2);
                            if(!z1) {
                                break;
                            }
                            if(!Character.isHighSurrogate(((char)v5))) {
                                goto label_25;
                            }
                            --v4;
                        }
                        if(!Character.isSurrogate(((char)v5))) {
                            --v4;
                            goto label_8;
                        }
                        else if(!Character.isHighSurrogate(((char)v5))) {
                            z1 = true;
                            goto label_8;
                        }
                    }
                label_25:
                    v2 = -1;
                label_26:
                    int v6 = Math.max(v1, 0);
                    v7 = editable0.length();
                    if(v3 >= 0 && v7 >= v3 && v6 >= 0) {
                        while(true) {
                            z2 = false;
                        label_30:
                            if(v6 == 0) {
                                v7 = v3;
                                goto label_51;
                            }
                            if(v3 >= v7) {
                                if(!z2) {
                                    goto label_51;
                                }
                                goto label_50;
                            }
                            int v8 = editable0.charAt(v3);
                            if(!z2) {
                                break;
                            }
                            if(!Character.isLowSurrogate(((char)v8))) {
                                goto label_50;
                            }
                            --v6;
                            ++v3;
                        }
                        if(!Character.isSurrogate(((char)v8))) {
                            --v6;
                            ++v3;
                            goto label_30;
                        }
                        else if(!Character.isLowSurrogate(((char)v8))) {
                            ++v3;
                            z2 = true;
                            goto label_30;
                        }
                    }
                label_50:
                    v7 = -1;
                label_51:
                    if(v2 == -1 || v7 == -1) {
                        return false;
                    }
                }
                else {
                    v2 = Math.max(v2 - v, 0);
                    v7 = Math.min(v3 + v1, editable0.length());
                }
                EmojiSpan[] arr_emojiSpan = (EmojiSpan[])editable0.getSpans(v2, v7, EmojiSpan.class);
                if(arr_emojiSpan != null && arr_emojiSpan.length > 0) {
                    for(int v9 = 0; v9 < arr_emojiSpan.length; ++v9) {
                        EmojiSpan emojiSpan0 = arr_emojiSpan[v9];
                        v2 = Math.min(editable0.getSpanStart(emojiSpan0), v2);
                        v7 = Math.max(editable0.getSpanEnd(emojiSpan0), v7);
                    }
                    int v10 = Math.min(v7, editable0.length());
                    inputConnection0.beginBatchEdit();
                    editable0.delete(Math.max(v2, 0), v10);
                    inputConnection0.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean handleOnKeyDown(@NonNull Editable editable0, int v, @NonNull KeyEvent keyEvent0) {
        boolean z;
        switch(v) {
            case 67: {
                z = t.a(editable0, keyEvent0, false);
                break;
            }
            case 0x70: {
                z = t.a(editable0, keyEvent0, true);
                break;
            }
            default: {
                z = false;
            }
        }
        if(z) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable0);
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean hasEmojiGlyph(@NonNull CharSequence charSequence0) {
        Preconditions.checkState(this.a(), "Not initialized yet");
        Preconditions.checkNotNull(charSequence0, "sequence cannot be null");
        t t0 = this.e.b;
        return t0.b(charSequence0, t0.b.a.version()) == 1;
    }

    @Deprecated
    public boolean hasEmojiGlyph(@NonNull CharSequence charSequence0, @IntRange(from = 0L) int v) {
        Preconditions.checkState(this.a(), "Not initialized yet");
        Preconditions.checkNotNull(charSequence0, "sequence cannot be null");
        return this.e.b.b(charSequence0, v) == 1;
    }

    @Nullable
    public static EmojiCompat init(@NonNull Context context0) {
        return EmojiCompat.init(context0, null);
    }

    @Nullable
    @RestrictTo({Scope.LIBRARY})
    public static EmojiCompat init(@NonNull Context context0, @Nullable DefaultEmojiCompatConfigFactory defaultEmojiCompatConfig$DefaultEmojiCompatConfigFactory0) {
        if(EmojiCompat.r) {
            return EmojiCompat.q;
        }
        if(defaultEmojiCompatConfig$DefaultEmojiCompatConfigFactory0 == null) {
            defaultEmojiCompatConfig$DefaultEmojiCompatConfigFactory0 = new DefaultEmojiCompatConfigFactory(null);
        }
        Config emojiCompat$Config0 = defaultEmojiCompatConfig$DefaultEmojiCompatConfigFactory0.create(context0);
        synchronized(EmojiCompat.p) {
            if(!EmojiCompat.r) {
                if(emojiCompat$Config0 != null) {
                    EmojiCompat.init(emojiCompat$Config0);
                }
                EmojiCompat.r = true;
            }
            return EmojiCompat.q;
        }
    }

    @NonNull
    public static EmojiCompat init(@NonNull Config emojiCompat$Config0) {
        EmojiCompat emojiCompat0 = EmojiCompat.q;
        if(emojiCompat0 == null) {
            synchronized(EmojiCompat.o) {
                emojiCompat0 = EmojiCompat.q;
                if(emojiCompat0 == null) {
                    emojiCompat0 = new EmojiCompat(emojiCompat$Config0);
                    EmojiCompat.q = emojiCompat0;
                }
            }
        }
        return emojiCompat0;
    }

    public static boolean isConfigured() [...] // 潜在的解密器

    @RestrictTo({Scope.LIBRARY_GROUP})
    public boolean isEmojiSpanIndicatorEnabled() {
        return this.k;
    }

    public void load() {
        Preconditions.checkState(this.m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if(this.a()) {
            return;
        }
        this.a.writeLock().lock();
        if(this.c == 0) {
            this.a.writeLock().unlock();
            return;
        }
        this.c = 0;
        this.a.writeLock().unlock();
        EmojiCompat emojiCompat0 = (EmojiCompat)this.e.a;
        try {
            e e0 = new e(this.e);
            emojiCompat0.f.load(e0);
        }
        catch(Throwable throwable0) {
            emojiCompat0.b(throwable0);
        }
    }

    @CheckResult
    @Nullable
    public CharSequence process(@Nullable CharSequence charSequence0) {
        return charSequence0 == null ? this.process(null, 0, 0) : this.process(charSequence0, 0, charSequence0.length());
    }

    @CheckResult
    @Nullable
    public CharSequence process(@Nullable CharSequence charSequence0, @IntRange(from = 0L) int v, @IntRange(from = 0L) int v1) {
        return this.process(charSequence0, v, v1, 0x7FFFFFFF);
    }

    @CheckResult
    @Nullable
    public CharSequence process(@Nullable CharSequence charSequence0, @IntRange(from = 0L) int v, @IntRange(from = 0L) int v1, @IntRange(from = 0L) int v2) {
        return this.process(charSequence0, v, v1, v2, 0);
    }

    @CheckResult
    @Nullable
    public CharSequence process(@Nullable CharSequence charSequence0, @IntRange(from = 0L) int v, @IntRange(from = 0L) int v1, @IntRange(from = 0L) int v2, int v3) {
        d0 d01;
        int v8;
        boolean z;
        Preconditions.checkState(this.a(), "Not initialized yet");
        Preconditions.checkArgumentNonnegative(v, "start cannot be negative");
        Preconditions.checkArgumentNonnegative(v1, "end cannot be negative");
        Preconditions.checkArgumentNonnegative(v2, "maxEmojiCount cannot be negative");
        Preconditions.checkArgument(v <= v1, "start should be <= than end");
        d0 d00 = null;
        if(charSequence0 == null) {
            return null;
        }
        Preconditions.checkArgument(v <= charSequence0.length(), "start should be < than charSequence length");
        Preconditions.checkArgument(v1 <= charSequence0.length(), "end should be < than charSequence length");
        if(charSequence0.length() != 0 && v != v1) {
            switch(v3) {
                case 1: {
                    z = true;
                    break;
                }
                case 2: {
                    z = false;
                    break;
                }
                default: {
                    z = this.h;
                }
            }
            t t0 = this.e.b;
            t0.getClass();
            if(charSequence0 instanceof SpannableBuilder) {
                ((SpannableBuilder)charSequence0).beginBatchEdit();
            }
            try {
                Class class0 = EmojiSpan.class;
                if(charSequence0 instanceof SpannableBuilder) {
                    d00 = new d0(((Spannable)charSequence0));
                }
                else if(charSequence0 instanceof Spannable) {
                    d00 = new d0(((Spannable)charSequence0));
                }
                else if(charSequence0 instanceof Spanned && ((Spanned)charSequence0).nextSpanTransition(v - 1, v1 + 1, class0) <= v1) {
                    d00 = new d0();  // 初始化器: Ljava/lang/Object;-><init>()V
                    d00.a = false;
                    d00.b = new SpannableString(charSequence0);
                }
                if(d00 != null) {
                    EmojiSpan[] arr_emojiSpan = (EmojiSpan[])d00.b.getSpans(v, v1, class0);
                    if(arr_emojiSpan != null && arr_emojiSpan.length > 0) {
                        for(int v4 = 0; v4 < arr_emojiSpan.length; ++v4) {
                            EmojiSpan emojiSpan0 = arr_emojiSpan[v4];
                            int v5 = d00.b.getSpanStart(emojiSpan0);
                            int v6 = d00.b.getSpanEnd(emojiSpan0);
                            if(v5 != v1) {
                                d00.removeSpan(emojiSpan0);
                            }
                            v = Math.min(v5, v);
                            v1 = Math.max(v6, v1);
                        }
                    }
                }
                if(v == v1 || v >= charSequence0.length()) {
                    goto label_65;
                }
                else {
                    if(v2 == 0x7FFFFFFF || d00 == null) {
                        v8 = v2;
                    }
                    else {
                        int v7 = d00.b.length();
                        v8 = v2 - ((EmojiSpan[])d00.b.getSpans(0, v7, class0)).length;
                    }
                    d01 = (d0)t0.c(charSequence0, v, v1, v8, z, new p(d00, t0.a));
                    if(d01 != null) {
                        goto label_59;
                    label_56:
                        if(!(charSequence0 instanceof SpannableBuilder)) {
                            throw throwable0;
                        }
                        goto label_57;
                    }
                    goto label_63;
                }
                goto label_67;
            }
            catch(Throwable throwable0) {
                goto label_56;
            }
        label_57:
            ((SpannableBuilder)charSequence0).endBatchEdit();
            throw throwable0;
        label_59:
            Spannable spannable0 = d01.b;
            if(charSequence0 instanceof SpannableBuilder) {
                ((SpannableBuilder)charSequence0).endBatchEdit();
            }
            return spannable0;
        label_63:
            if(!(charSequence0 instanceof SpannableBuilder)) {
                return charSequence0;
            }
            goto label_67;
        label_65:
            if(!(charSequence0 instanceof SpannableBuilder)) {
                return charSequence0;
            }
        label_67:
            ((SpannableBuilder)charSequence0).endBatchEdit();
            return charSequence0;
        }
        return charSequence0;
    }

    public void registerInitCallback(@NonNull InitCallback emojiCompat$InitCallback0) {
        Preconditions.checkNotNull(emojiCompat$InitCallback0, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if(this.c == 1 || this.c == 2) {
                int v1 = this.c;
                h h0 = new h(Arrays.asList(new InitCallback[]{((InitCallback)Preconditions.checkNotNull(emojiCompat$InitCallback0, "initCallback cannot be null"))}), v1, null);
                this.d.post(h0);
            }
            else {
                this.b.add(emojiCompat$InitCallback0);
            }
        }
        finally {
            this.a.writeLock().unlock();
        }
    }

    @NonNull
    public static EmojiCompat reset(@NonNull Config emojiCompat$Config0) {
        synchronized(EmojiCompat.o) {
            EmojiCompat emojiCompat0 = new EmojiCompat(emojiCompat$Config0);
            EmojiCompat.q = emojiCompat0;
            return emojiCompat0;
        }
    }

    @Nullable
    @RestrictTo({Scope.TESTS})
    public static EmojiCompat reset(@Nullable EmojiCompat emojiCompat0) {
        synchronized(EmojiCompat.o) {
            EmojiCompat.q = emojiCompat0;
        }
        return EmojiCompat.q;
    }

    @RestrictTo({Scope.TESTS})
    public static void skipDefaultConfigurationLookup(boolean z) {
        synchronized(EmojiCompat.p) {
            EmojiCompat.r = z;
        }
    }

    public void unregisterInitCallback(@NonNull InitCallback emojiCompat$InitCallback0) {
        Preconditions.checkNotNull(emojiCompat$InitCallback0, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            this.b.remove(emojiCompat$InitCallback0);
        }
        finally {
            this.a.writeLock().unlock();
        }
    }

    public void updateEditorInfo(@NonNull EditorInfo editorInfo0) {
        if(this.a() && editorInfo0 != null) {
            if(editorInfo0.extras == null) {
                editorInfo0.extras = new Bundle();
            }
            this.e.getClass();
            editorInfo0.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.e.c.a.version());
            editorInfo0.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", ((EmojiCompat)this.e.a).h);
        }
    }
}

