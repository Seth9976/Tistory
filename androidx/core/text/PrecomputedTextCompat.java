package androidx.core.text;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.Trace;
import android.text.PrecomputedText.Params;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.activity.p;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PrecomputedTextCompat implements Spannable {
    public static final class Params {
        public static class Builder {
            public final TextPaint a;
            public TextDirectionHeuristic b;
            public int c;
            public int d;

            public Builder(@NonNull TextPaint textPaint0) {
                this.a = textPaint0;
                this.c = 1;
                this.d = 1;
                this.b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }

            @NonNull
            public Params build() {
                return new Params(this.a, this.b, this.c, this.d);
            }

            @RequiresApi(23)
            public Builder setBreakStrategy(int v) {
                this.c = v;
                return this;
            }

            @RequiresApi(23)
            public Builder setHyphenationFrequency(int v) {
                this.d = v;
                return this;
            }

            public Builder setTextDirection(@NonNull TextDirectionHeuristic textDirectionHeuristic0) {
                this.b = textDirectionHeuristic0;
                return this;
            }
        }

        public final TextPaint a;
        public final TextDirectionHeuristic b;
        public final int c;
        public final int d;
        public final PrecomputedText.Params e;

        @RequiresApi(28)
        public Params(@NonNull PrecomputedText.Params precomputedText$Params0) {
            this.a = precomputedText$Params0.getTextPaint();
            this.b = precomputedText$Params0.getTextDirection();
            this.c = precomputedText$Params0.getBreakStrategy();
            this.d = precomputedText$Params0.getHyphenationFrequency();
            if(Build.VERSION.SDK_INT < 29) {
                precomputedText$Params0 = null;
            }
            this.e = precomputedText$Params0;
        }

        public Params(TextPaint textPaint0, TextDirectionHeuristic textDirectionHeuristic0, int v, int v1) {
            this.e = Build.VERSION.SDK_INT >= 29 ? p.k(textPaint0).setBreakStrategy(v).setHyphenationFrequency(v1).setTextDirection(textDirectionHeuristic0).build() : null;
            this.a = textPaint0;
            this.b = textDirectionHeuristic0;
            this.c = v;
            this.d = v1;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(object0 == this) {
                return true;
            }
            if(!(object0 instanceof Params)) {
                return false;
            }
            return this.equalsWithoutTextDirection(((Params)object0)) ? this.b == ((Params)object0).getTextDirection() : false;
        }

        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public boolean equalsWithoutTextDirection(@NonNull Params precomputedTextCompat$Params0) {
            if(this.c != precomputedTextCompat$Params0.getBreakStrategy()) {
                return false;
            }
            if(this.d != precomputedTextCompat$Params0.getHyphenationFrequency()) {
                return false;
            }
            TextPaint textPaint0 = this.a;
            if(textPaint0.getTextSize() != precomputedTextCompat$Params0.getTextPaint().getTextSize()) {
                return false;
            }
            if(textPaint0.getTextScaleX() != precomputedTextCompat$Params0.getTextPaint().getTextScaleX()) {
                return false;
            }
            if(textPaint0.getTextSkewX() != precomputedTextCompat$Params0.getTextPaint().getTextSkewX()) {
                return false;
            }
            if(textPaint0.getLetterSpacing() != precomputedTextCompat$Params0.getTextPaint().getLetterSpacing()) {
                return false;
            }
            if(!TextUtils.equals(textPaint0.getFontFeatureSettings(), precomputedTextCompat$Params0.getTextPaint().getFontFeatureSettings())) {
                return false;
            }
            if(textPaint0.getFlags() != precomputedTextCompat$Params0.getTextPaint().getFlags()) {
                return false;
            }
            if(!textPaint0.getTextLocales().equals(precomputedTextCompat$Params0.getTextPaint().getTextLocales())) {
                return false;
            }
            return textPaint0.getTypeface() == null ? precomputedTextCompat$Params0.getTextPaint().getTypeface() == null : textPaint0.getTypeface().equals(precomputedTextCompat$Params0.getTextPaint().getTypeface());
        }

        @RequiresApi(23)
        public int getBreakStrategy() {
            return this.c;
        }

        @RequiresApi(23)
        public int getHyphenationFrequency() {
            return this.d;
        }

        @Nullable
        public TextDirectionHeuristic getTextDirection() {
            return this.b;
        }

        @NonNull
        public TextPaint getTextPaint() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return ObjectsCompat.hash(new Object[]{this.a.getTextSize(), this.a.getTextScaleX(), this.a.getTextSkewX(), this.a.getLetterSpacing(), this.a.getFlags(), this.a.getTextLocales(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, this.c, this.d});
        }

        @Override
        public String toString() {
            return "{" + ("textSize=" + this.a.getTextSize()) + (", textScaleX=" + this.a.getTextScaleX()) + (", textSkewX=" + this.a.getTextSkewX()) + (", letterSpacing=" + this.a.getLetterSpacing()) + (", elegantTextHeight=" + this.a.isElegantTextHeight()) + (", textLocale=" + this.a.getTextLocales()) + (", typeface=" + this.a.getTypeface()) + (", variationSettings=" + this.a.getFontVariationSettings()) + (", textDir=" + this.b) + (", breakStrategy=" + this.c) + (", hyphenationFrequency=" + this.d) + "}";
        }
    }

    public final Spannable a;
    public final Params b;
    public final int[] c;
    public final PrecomputedText d;
    public static final Object e;
    public static ExecutorService f;

    static {
        PrecomputedTextCompat.e = new Object();
    }

    public PrecomputedTextCompat(PrecomputedText precomputedText0, Params precomputedTextCompat$Params0) {
        this.a = precomputedText0;
        this.b = precomputedTextCompat$Params0;
        this.c = null;
        if(Build.VERSION.SDK_INT < 29) {
            precomputedText0 = null;
        }
        this.d = precomputedText0;
    }

    public PrecomputedTextCompat(CharSequence charSequence0, Params precomputedTextCompat$Params0, int[] arr_v) {
        this.a = new SpannableString(charSequence0);
        this.b = precomputedTextCompat$Params0;
        this.c = arr_v;
        this.d = null;
    }

    @Override
    public char charAt(int v) {
        return this.a.charAt(v);
    }

    // 检测为 Lambda 实现
    @SuppressLint({"WrongConstant"})
    public static PrecomputedTextCompat create(@NonNull CharSequence charSequence0, @NonNull Params precomputedTextCompat$Params0) [...]

    @IntRange(from = 0L)
    public int getParagraphCount() {
        return Build.VERSION.SDK_INT < 29 ? this.c.length : this.d.getParagraphCount();
    }

    @IntRange(from = 0L)
    public int getParagraphEnd(@IntRange(from = 0L) int v) {
        Preconditions.checkArgumentInRange(v, 0, this.getParagraphCount(), "paraIndex");
        return Build.VERSION.SDK_INT < 29 ? this.c[v] : this.d.getParagraphEnd(v);
    }

    @IntRange(from = 0L)
    public int getParagraphStart(@IntRange(from = 0L) int v) {
        Preconditions.checkArgumentInRange(v, 0, this.getParagraphCount(), "paraIndex");
        if(Build.VERSION.SDK_INT >= 29) {
            return this.d.getParagraphStart(v);
        }
        return v == 0 ? 0 : this.c[v - 1];
    }

    @NonNull
    public Params getParams() {
        return this.b;
    }

    // 去混淆评级： 低(20)
    @Nullable
    @RequiresApi(28)
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public PrecomputedText getPrecomputedText() {
        return p.y(this.a) ? ((PrecomputedText)this.a) : null;
    }

    @Override  // android.text.Spanned
    public int getSpanEnd(Object object0) {
        return this.a.getSpanEnd(object0);
    }

    @Override  // android.text.Spanned
    public int getSpanFlags(Object object0) {
        return this.a.getSpanFlags(object0);
    }

    @Override  // android.text.Spanned
    public int getSpanStart(Object object0) {
        return this.a.getSpanStart(object0);
    }

    @Override  // android.text.Spanned
    public Object[] getSpans(int v, int v1, Class class0) {
        return Build.VERSION.SDK_INT < 29 ? this.a.getSpans(v, v1, class0) : this.d.getSpans(v, v1, class0);
    }

    @UiThread
    public static Future getTextFuture(@NonNull CharSequence charSequence0, @NonNull Params precomputedTextCompat$Params0, @Nullable Executor executor0) {
        e e0 = () -> {
            Preconditions.checkNotNull(this.b);
            Preconditions.checkNotNull(this.a);
            try {
                Trace.beginSection("PrecomputedText");
                if(Build.VERSION.SDK_INT >= 29) {
                    PrecomputedText.Params precomputedText$Params0 = this.a.e;
                    if(precomputedText$Params0 != null) {
                        return new PrecomputedTextCompat(PrecomputedText.create(this.b, precomputedText$Params0), this.a);
                    }
                }
                ArrayList arrayList0 = new ArrayList();
                int v1 = this.b.length();
                int v2 = 0;
                while(v2 < v1) {
                    int v3 = TextUtils.indexOf(this.b, '\n', v2, v1);
                    v2 = v3 >= 0 ? v3 + 1 : v1;
                    arrayList0.add(v2);
                }
                int[] arr_v = new int[arrayList0.size()];
                for(int v4 = 0; v4 < arrayList0.size(); ++v4) {
                    arr_v[v4] = (int)(((Integer)arrayList0.get(v4)));
                }
                StaticLayout.Builder.obtain(this.b, 0, this.b.length(), this.a.getTextPaint(), 0x7FFFFFFF).setBreakStrategy(this.a.getBreakStrategy()).setHyphenationFrequency(this.a.getHyphenationFrequency()).setTextDirection(this.a.getTextDirection()).build();
                return new PrecomputedTextCompat(this.b, this.a, arr_v);
            }
            finally {
                Trace.endSection();
            }
        };
        e0.a = precomputedTextCompat$Params0;
        e0.b = charSequence0;
        Future future0 = new f(e0);  // 初始化器: Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V
        if(executor0 == null) {
            synchronized(PrecomputedTextCompat.e) {
                if(PrecomputedTextCompat.f == null) {
                    PrecomputedTextCompat.f = Executors.newFixedThreadPool(1);
                }
                executor0 = PrecomputedTextCompat.f;
            }
        }
        executor0.execute(((Runnable)future0));
        return future0;
    }

    @Override
    public int length() {
        return this.a.length();
    }

    @Override  // android.text.Spanned
    public int nextSpanTransition(int v, int v1, Class class0) {
        return this.a.nextSpanTransition(v, v1, class0);
    }

    @Override  // android.text.Spannable
    public void removeSpan(Object object0) {
        if(object0 instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if(Build.VERSION.SDK_INT >= 29) {
            this.d.removeSpan(object0);
            return;
        }
        this.a.removeSpan(object0);
    }

    @Override  // android.text.Spannable
    public void setSpan(Object object0, int v, int v1, int v2) {
        if(object0 instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if(Build.VERSION.SDK_INT >= 29) {
            this.d.setSpan(object0, v, v1, v2);
            return;
        }
        this.a.setSpan(object0, v, v1, v2);
    }

    @Override
    public CharSequence subSequence(int v, int v1) {
        return this.a.subSequence(v, v1);
    }

    @Override
    @NonNull
    public String toString() {
        return this.a.toString();
    }
}

