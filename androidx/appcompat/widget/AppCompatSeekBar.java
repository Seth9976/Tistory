package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R.attr;

public class AppCompatSeekBar extends SeekBar {
    public final h0 a;

    public AppCompatSeekBar(@NonNull Context context0) {
        this(context0, null);
    }

    public AppCompatSeekBar(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.seekBarStyle);
    }

    public AppCompatSeekBar(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        ThemeUtils.checkAppCompatTheme(this, this.getContext());
        h0 h00 = new h0(this);
        this.a = h00;
        h00.a(attributeSet0, v);
    }

    @Override  // android.widget.AbsSeekBar
    public void drawableStateChanged() {
        super.drawableStateChanged();
        h0 h00 = this.a;
        Drawable drawable0 = h00.e;
        if(drawable0 != null && drawable0.isStateful()) {
            AppCompatSeekBar appCompatSeekBar0 = h00.d;
            if(drawable0.setState(appCompatSeekBar0.getDrawableState())) {
                appCompatSeekBar0.invalidateDrawable(drawable0);
            }
        }
    }

    @Override  // android.widget.AbsSeekBar
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable0 = this.a.e;
        if(drawable0 != null) {
            drawable0.jumpToCurrentState();
        }
    }

    @Override  // android.widget.AbsSeekBar
    public void onDraw(Canvas canvas0) {
        synchronized(this) {
            super.onDraw(canvas0);
            this.a.d(canvas0);
        }
    }
}

