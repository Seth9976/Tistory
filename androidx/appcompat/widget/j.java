package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.R.attr;
import androidx.core.graphics.drawable.DrawableCompat;

public final class j extends AppCompatImageView implements ActionMenuChildView {
    public final o a;

    public j(o o0, Context context0) {
        this.a = o0;
        super(context0, null, attr.actionOverflowButtonStyle);
        this.setClickable(true);
        this.setFocusable(true);
        this.setVisibility(0);
        this.setEnabled(true);
        TooltipCompat.setTooltipText(this, this.getContentDescription());
        this.setOnTouchListener(new i(this, this, 0));
    }

    @Override  // androidx.appcompat.widget.ActionMenuView$ActionMenuChildView
    public final boolean needsDividerAfter() {
        return false;
    }

    @Override  // androidx.appcompat.widget.ActionMenuView$ActionMenuChildView
    public final boolean needsDividerBefore() {
        return false;
    }

    @Override  // android.view.View
    public final boolean performClick() {
        if(super.performClick()) {
            return true;
        }
        this.playSoundEffect(0);
        this.a.l();
        return true;
    }

    @Override  // android.widget.ImageView
    public final boolean setFrame(int v, int v1, int v2, int v3) {
        boolean z = super.setFrame(v, v1, v2, v3);
        Drawable drawable0 = this.getDrawable();
        Drawable drawable1 = this.getBackground();
        if(drawable0 != null && drawable1 != null) {
            int v4 = this.getWidth();
            int v5 = this.getHeight();
            int v6 = Math.max(v4, v5);
            int v7 = (v4 + (this.getPaddingLeft() - this.getPaddingRight())) / 2;
            int v8 = (v5 + (this.getPaddingTop() - this.getPaddingBottom())) / 2;
            DrawableCompat.setHotspotBounds(drawable1, v7 - v6 / 2, v8 - v6 / 2, v7 + v6 / 2, v8 + v6 / 2);
        }
        return z;
    }
}

