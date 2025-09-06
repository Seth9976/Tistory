package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

public final class b implements CardViewImpl {
    @Override  // androidx.cardview.widget.CardViewImpl
    public final ColorStateList getBackgroundColor(CardViewDelegate cardViewDelegate0) {
        return ((c)cardViewDelegate0.getCardBackground()).h;
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public final float getElevation(CardViewDelegate cardViewDelegate0) {
        return cardViewDelegate0.getCardView().getElevation();
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public final float getMaxElevation(CardViewDelegate cardViewDelegate0) {
        return ((c)cardViewDelegate0.getCardBackground()).e;
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public final float getMinHeight(CardViewDelegate cardViewDelegate0) {
        return this.getRadius(cardViewDelegate0) * 2.0f;
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public final float getMinWidth(CardViewDelegate cardViewDelegate0) {
        return this.getRadius(cardViewDelegate0) * 2.0f;
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public final float getRadius(CardViewDelegate cardViewDelegate0) {
        return ((c)cardViewDelegate0.getCardBackground()).a;
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public final void initStatic() {
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public final void initialize(CardViewDelegate cardViewDelegate0, Context context0, ColorStateList colorStateList0, float f, float f1, float f2) {
        cardViewDelegate0.setCardBackground(new c(f, colorStateList0));
        View view0 = cardViewDelegate0.getCardView();
        view0.setClipToOutline(true);
        view0.setElevation(f1);
        this.setMaxElevation(cardViewDelegate0, f2);
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public final void onCompatPaddingChanged(CardViewDelegate cardViewDelegate0) {
        this.setMaxElevation(cardViewDelegate0, this.getMaxElevation(cardViewDelegate0));
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public final void onPreventCornerOverlapChanged(CardViewDelegate cardViewDelegate0) {
        this.setMaxElevation(cardViewDelegate0, this.getMaxElevation(cardViewDelegate0));
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public final void setBackgroundColor(CardViewDelegate cardViewDelegate0, ColorStateList colorStateList0) {
        c c0 = (c)cardViewDelegate0.getCardBackground();
        if(colorStateList0 == null) {
            c0.getClass();
            colorStateList0 = ColorStateList.valueOf(0);
        }
        c0.h = colorStateList0;
        int v = colorStateList0.getColorForState(c0.getState(), c0.h.getDefaultColor());
        c0.b.setColor(v);
        c0.invalidateSelf();
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public final void setElevation(CardViewDelegate cardViewDelegate0, float f) {
        cardViewDelegate0.getCardView().setElevation(f);
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public final void setMaxElevation(CardViewDelegate cardViewDelegate0, float f) {
        c c0 = (c)cardViewDelegate0.getCardBackground();
        boolean z = cardViewDelegate0.getUseCompatPadding();
        boolean z1 = cardViewDelegate0.getPreventCornerOverlap();
        if(f != c0.e || c0.f != z || c0.g != z1) {
            c0.e = f;
            c0.f = z;
            c0.g = z1;
            c0.b(null);
            c0.invalidateSelf();
        }
        this.updatePadding(cardViewDelegate0);
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public final void setRadius(CardViewDelegate cardViewDelegate0, float f) {
        c c0 = (c)cardViewDelegate0.getCardBackground();
        if(f != c0.a) {
            c0.a = f;
            c0.b(null);
            c0.invalidateSelf();
        }
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public final void updatePadding(CardViewDelegate cardViewDelegate0) {
        if(!cardViewDelegate0.getUseCompatPadding()) {
            cardViewDelegate0.setShadowPadding(0, 0, 0, 0);
            return;
        }
        float f = ((c)cardViewDelegate0.getCardBackground()).e;
        float f1 = ((c)cardViewDelegate0.getCardBackground()).a;
        int v = (int)Math.ceil(d.a(f, f1, cardViewDelegate0.getPreventCornerOverlap()));
        int v1 = (int)Math.ceil(d.b(f, f1, cardViewDelegate0.getPreventCornerOverlap()));
        cardViewDelegate0.setShadowPadding(v, v1, v, v1);
    }
}

