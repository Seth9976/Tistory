package androidx.emoji2.text;

import a7.c;
import android.os.Build.VERSION;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

public final class d0 implements Spannable {
    public boolean a;
    public Spannable b;

    public d0(Spannable spannable0) {
        this.a = false;
        this.b = spannable0;
    }

    public final void a() {
        Spannable spannable0 = this.b;
        if(!this.a) {
            c c0 = Build.VERSION.SDK_INT < 28 ? new c(1) : new c0(1);  // 初始化器: La7/c;-><init>(I)V
            if(c0.b(spannable0)) {
                this.b = new SpannableString(spannable0);
            }
        }
        this.a = true;
    }

    @Override
    public final char charAt(int v) {
        return this.b.charAt(v);
    }

    @Override
    public final IntStream chars() {
        return this.b.chars();
    }

    @Override
    public final IntStream codePoints() {
        return this.b.codePoints();
    }

    @Override  // android.text.Spanned
    public final int getSpanEnd(Object object0) {
        return this.b.getSpanEnd(object0);
    }

    @Override  // android.text.Spanned
    public final int getSpanFlags(Object object0) {
        return this.b.getSpanFlags(object0);
    }

    @Override  // android.text.Spanned
    public final int getSpanStart(Object object0) {
        return this.b.getSpanStart(object0);
    }

    @Override  // android.text.Spanned
    public final Object[] getSpans(int v, int v1, Class class0) {
        return this.b.getSpans(v, v1, class0);
    }

    @Override
    public final int length() {
        return this.b.length();
    }

    @Override  // android.text.Spanned
    public final int nextSpanTransition(int v, int v1, Class class0) {
        return this.b.nextSpanTransition(v, v1, class0);
    }

    @Override  // android.text.Spannable
    public final void removeSpan(Object object0) {
        this.a();
        this.b.removeSpan(object0);
    }

    @Override  // android.text.Spannable
    public final void setSpan(Object object0, int v, int v1, int v2) {
        this.a();
        this.b.setSpan(object0, v, v1, v2);
    }

    @Override
    public final CharSequence subSequence(int v, int v1) {
        return this.b.subSequence(v, v1);
    }

    @Override
    public final String toString() {
        return this.b.toString();
    }
}

