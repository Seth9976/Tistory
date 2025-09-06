package androidx.cardview.widget;

import android.graphics.drawable.Drawable;
import android.view.View;

public final class a implements CardViewDelegate {
    public Drawable a;
    public final CardView b;

    public a(CardView cardView0) {
        this.b = cardView0;
    }

    @Override  // androidx.cardview.widget.CardViewDelegate
    public final Drawable getCardBackground() {
        return this.a;
    }

    @Override  // androidx.cardview.widget.CardViewDelegate
    public final View getCardView() {
        return this.b;
    }

    @Override  // androidx.cardview.widget.CardViewDelegate
    public final boolean getPreventCornerOverlap() {
        return this.b.getPreventCornerOverlap();
    }

    @Override  // androidx.cardview.widget.CardViewDelegate
    public final boolean getUseCompatPadding() {
        return this.b.getUseCompatPadding();
    }

    @Override  // androidx.cardview.widget.CardViewDelegate
    public final void setCardBackground(Drawable drawable0) {
        this.a = drawable0;
        this.b.setBackgroundDrawable(drawable0);
    }

    @Override  // androidx.cardview.widget.CardViewDelegate
    public final void setMinWidthHeightInternal(int v, int v1) {
        CardView cardView0 = this.b;
        if(v > cardView0.c) {
            cardView0.super.setMinimumWidth(v);
        }
        if(v1 > cardView0.d) {
            cardView0.super.setMinimumHeight(v1);
        }
    }

    @Override  // androidx.cardview.widget.CardViewDelegate
    public final void setShadowPadding(int v, int v1, int v2, int v3) {
        this.b.f.set(v, v1, v2, v3);
        this.b.super.setPadding(v + this.b.e.left, v1 + this.b.e.top, v2 + this.b.e.right, v3 + this.b.e.bottom);
    }
}

