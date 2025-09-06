package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p3.d;

public class ContentLoadingProgressBar extends ProgressBar {
    public long a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final d e;
    public final d f;

    public ContentLoadingProgressBar(@NonNull Context context0) {
        this(context0, null);
    }

    public ContentLoadingProgressBar(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0, 0);
        this.a = -1L;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = new d(this, 0);
        this.f = new d(this, 1);
    }

    public void hide() {
        this.post(new d(this, 3));
    }

    @Override  // android.widget.ProgressBar
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.removeCallbacks(this.e);
        this.removeCallbacks(this.f);
    }

    @Override  // android.widget.ProgressBar
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.removeCallbacks(this.e);
        this.removeCallbacks(this.f);
    }

    public void show() {
        this.post(new d(this, 2));
    }
}

