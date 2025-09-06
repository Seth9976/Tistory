package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.CheckedTextViewCompat;

public final class z {
    public final AppCompatCheckedTextView a;
    public ColorStateList b;
    public PorterDuff.Mode c;
    public boolean d;
    public boolean e;
    public boolean f;

    public z(AppCompatCheckedTextView appCompatCheckedTextView0) {
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = false;
        this.a = appCompatCheckedTextView0;
    }

    public final void a() {
        AppCompatCheckedTextView appCompatCheckedTextView0 = this.a;
        Drawable drawable0 = CheckedTextViewCompat.getCheckMarkDrawable(appCompatCheckedTextView0);
        if(drawable0 != null && (this.d || this.e)) {
            Drawable drawable1 = drawable0.mutate();
            if(this.d) {
                DrawableCompat.setTintList(drawable1, this.b);
            }
            if(this.e) {
                DrawableCompat.setTintMode(drawable1, this.c);
            }
            if(drawable1.isStateful()) {
                drawable1.setState(appCompatCheckedTextView0.getDrawableState());
            }
            appCompatCheckedTextView0.setCheckMarkDrawable(drawable1);
        }
    }
}

