package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.PluralsRes;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.XmlRes;
import androidx.core.provider.q;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.id;
import com.google.android.material.R.string;
import com.google.android.material.R.style;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.Locale;

public class BadgeDrawable extends Drawable implements TextDrawableDelegate {
    @Retention(RetentionPolicy.SOURCE)
    public @interface BadgeGravity {
    }

    public static final int BADGE_CONTENT_NOT_TRUNCATED = -2;
    @Deprecated
    public static final int BOTTOM_END = 0x800055;
    @Deprecated
    public static final int BOTTOM_START = 0x800053;
    public static final int TOP_END = 0x800035;
    public static final int TOP_START = 0x800033;
    public final WeakReference a;
    public final MaterialShapeDrawable b;
    public final TextDrawableHelper c;
    public final Rect d;
    public final BadgeState e;
    public float f;
    public float g;
    public int h;
    public float i;
    public float j;
    public float k;
    public WeakReference l;
    public WeakReference m;
    public static final int n;
    public static final int o;

    static {
        BadgeDrawable.n = style.Widget_MaterialComponents_Badge;
        BadgeDrawable.o = attr.badgeStyle;
    }

    public BadgeDrawable(Context context0, int v, int v1, int v2, State badgeState$State0) {
        this.a = new WeakReference(context0);
        ThemeEnforcement.checkMaterialTheme(context0);
        this.d = new Rect();
        TextDrawableHelper textDrawableHelper0 = new TextDrawableHelper(this);
        this.c = textDrawableHelper0;
        textDrawableHelper0.getTextPaint().setTextAlign(Paint.Align.CENTER);
        BadgeState badgeState0 = new BadgeState(context0, v, v1, v2, badgeState$State0);
        this.e = badgeState0;
        MaterialShapeDrawable materialShapeDrawable0 = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context0, (this.c() ? ((int)badgeState0.b.g) : ((int)badgeState0.b.e)), (this.c() ? ((int)badgeState0.b.h) : ((int)badgeState0.b.f))).build());
        this.b = materialShapeDrawable0;
        this.f();
        this.g();
        this.i();
        this.d();
        textDrawableHelper0.getTextPaint().setAlpha(this.getAlpha());
        this.invalidateSelf();
        ColorStateList colorStateList0 = ColorStateList.valueOf(((int)badgeState0.b.b));
        if(materialShapeDrawable0.getFillColor() != colorStateList0) {
            materialShapeDrawable0.setFillColor(colorStateList0);
            this.invalidateSelf();
        }
        this.h();
        this.e();
        this.k();
        this.j();
    }

    public final void a(View view0) {
        float f8;
        float f7;
        float f2;
        float f1;
        View view1 = this.getCustomBadgeParent();
        if(view1 == null) {
            if(!(view0.getParent() instanceof View)) {
                return;
            }
            float f = view0.getY();
            f1 = view0.getX();
            view1 = (View)view0.getParent();
            f2 = f;
        }
        else {
            FrameLayout frameLayout0 = this.getCustomBadgeParent();
            if(frameLayout0 == null || frameLayout0.getId() != id.mtrl_anchor_parent) {
                f2 = 0.0f;
                f1 = 0.0f;
            }
            else {
                if(!(view1.getParent() instanceof View)) {
                    return;
                }
                f2 = view1.getY();
                f1 = view1.getX();
                view1 = (View)view1.getParent();
            }
        }
        float f3 = this.g - this.k;
        float f4 = view1.getY() + f3 + f2;
        float f5 = this.f - this.j;
        float f6 = view1.getX() + f5 + f1;
        if(view1.getParent() instanceof View) {
            View view2 = (View)view1.getParent();
            f7 = this.g + this.k - (((float)view2.getHeight()) - view1.getY()) + f2;
        }
        else {
            f7 = 0.0f;
        }
        if(view1.getParent() instanceof View) {
            View view3 = (View)view1.getParent();
            f8 = this.f + this.j - (((float)view3.getWidth()) - view1.getX()) + f1;
        }
        else {
            f8 = 0.0f;
        }
        if(f4 < 0.0f) {
            this.g = Math.abs(f4) + this.g;
        }
        if(f6 < 0.0f) {
            this.f = Math.abs(f6) + this.f;
        }
        if(f7 > 0.0f) {
            this.g -= Math.abs(f7);
        }
        if(f8 > 0.0f) {
            this.f -= Math.abs(f8);
        }
    }

    public final String b() {
        WeakReference weakReference0 = this.a;
        if(this.hasText()) {
            String s = this.getText();
            int v = this.getMaxCharacterCount();
            if(v != -2 && (s != null && s.length() > v)) {
                Context context0 = (Context)weakReference0.get();
                return context0 == null ? "" : String.format(context0.getString(string.m3_exceed_max_badge_text_suffix), s.substring(0, v - 1), "…");
            }
            return s;
        }
        if(this.hasNumber()) {
            BadgeState badgeState0 = this.e;
            if(this.h != -2 && this.getNumber() > this.h) {
                Context context1 = (Context)weakReference0.get();
                return context1 == null ? "" : String.format(badgeState0.b.n, context1.getString(string.mtrl_exceed_max_badge_number_suffix), this.h, "+");
            }
            return NumberFormat.getInstance(badgeState0.b.n).format(((long)this.getNumber()));
        }
        return null;
    }

    // 去混淆评级： 低(20)
    public final boolean c() {
        return this.hasText() || this.hasNumber();
    }

    public void clearNumber() {
        BadgeState badgeState0 = this.e;
        State badgeState$State0 = badgeState0.b;
        if(badgeState$State0.k != -1) {
            badgeState0.a.k = -1;
            badgeState$State0.k = -1;
            if(!this.hasText()) {
                this.d();
            }
        }
    }

    public void clearText() {
        BadgeState badgeState0 = this.e;
        State badgeState$State0 = badgeState0.b;
        if(badgeState$State0.j != null) {
            badgeState0.a.j = null;
            badgeState$State0.j = null;
            this.d();
        }
    }

    @NonNull
    public static BadgeDrawable create(@NonNull Context context0) {
        return new BadgeDrawable(context0, 0, BadgeDrawable.o, BadgeDrawable.n, null);
    }

    @NonNull
    public static BadgeDrawable createFromResource(@NonNull Context context0, @XmlRes int v) {
        return new BadgeDrawable(context0, v, BadgeDrawable.o, BadgeDrawable.n, null);
    }

    public final void d() {
        this.c.setTextSizeDirty(true);
        this.f();
        this.k();
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas0) {
        if(!this.getBounds().isEmpty() && this.getAlpha() != 0 && this.isVisible()) {
            this.b.draw(canvas0);
            if(this.c()) {
                String s = this.b();
                if(s != null) {
                    Rect rect0 = new Rect();
                    this.c.getTextPaint().getTextBounds(s, 0, s.length(), rect0);
                    float f = this.g - rect0.exactCenterY();
                    canvas0.drawText(s, this.f, ((float)(rect0.bottom > 0 ? Math.round(f) : ((int)f))), this.c.getTextPaint());
                }
            }
        }
    }

    public final void e() {
        if(this.l != null && this.l.get() != null) {
            this.updateBadgeCoordinates(((View)this.l.get()), (this.m == null ? null : ((FrameLayout)this.m.get())));
        }
    }

    public final void f() {
        Context context0 = (Context)this.a.get();
        if(context0 == null) {
            return;
        }
        ShapeAppearanceModel shapeAppearanceModel0 = ShapeAppearanceModel.builder(context0, (this.c() ? ((int)this.e.b.g) : ((int)this.e.b.e)), (this.c() ? ((int)this.e.b.h) : ((int)this.e.b.f))).build();
        this.b.setShapeAppearanceModel(shapeAppearanceModel0);
        this.invalidateSelf();
    }

    public final void g() {
        Context context0 = (Context)this.a.get();
        if(context0 == null) {
            return;
        }
        TextAppearance textAppearance0 = new TextAppearance(context0, ((int)this.e.b.d));
        TextDrawableHelper textDrawableHelper0 = this.c;
        if(textDrawableHelper0.getTextAppearance() == textAppearance0) {
            return;
        }
        textDrawableHelper0.setTextAppearance(textAppearance0, context0);
        this.h();
        this.k();
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.e.b.i;
    }

    @ColorInt
    public int getBackgroundColor() {
        return this.b.getFillColor().getDefaultColor();
    }

    public int getBadgeGravity() {
        return (int)this.e.b.s;
    }

    @NonNull
    public Locale getBadgeNumberLocale() {
        return this.e.b.n;
    }

    @ColorInt
    public int getBadgeTextColor() {
        return this.c.getTextPaint().getColor();
    }

    @Nullable
    public CharSequence getContentDescription() {
        if(!this.isVisible()) {
            return null;
        }
        BadgeState badgeState0 = this.e;
        if(this.hasText()) {
            CharSequence charSequence0 = badgeState0.b.o;
            return charSequence0 == null ? this.getText() : charSequence0;
        }
        if(this.hasNumber()) {
            if(badgeState0.b.q != 0) {
                Context context0 = (Context)this.a.get();
                if(context0 != null) {
                    State badgeState$State0 = badgeState0.b;
                    if(this.h != -2) {
                        int v = this.h;
                        return this.getNumber() <= v ? context0.getResources().getQuantityString(badgeState$State0.q, this.getNumber(), new Object[]{this.getNumber()}) : context0.getString(badgeState$State0.r, new Object[]{v});
                    }
                    return context0.getResources().getQuantityString(badgeState$State0.q, this.getNumber(), new Object[]{this.getNumber()});
                }
            }
            return null;
        }
        return badgeState0.b.p;
    }

    @Nullable
    public FrameLayout getCustomBadgeParent() {
        return this.m == null ? null : ((FrameLayout)this.m.get());
    }

    public int getHorizontalOffset() {
        return (int)this.e.b.w;
    }

    @Px
    public int getHorizontalOffsetWithText() {
        return (int)this.e.b.y;
    }

    @Px
    public int getHorizontalOffsetWithoutText() {
        return (int)this.e.b.w;
    }

    @Px
    public int getHorizontalPadding() {
        return (int)this.e.b.u;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.d.height();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.d.width();
    }

    @Px
    public int getLargeFontVerticalOffsetAdjustment() {
        return (int)this.e.b.C;
    }

    public int getMaxCharacterCount() {
        return this.e.b.l;
    }

    public int getMaxNumber() {
        return this.e.b.m;
    }

    public int getNumber() {
        int v = this.e.b.k;
        return v == -1 ? 0 : v;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Nullable
    public String getText() {
        return this.e.b.j;
    }

    public int getVerticalOffset() {
        return (int)this.e.b.x;
    }

    @Px
    public int getVerticalOffsetWithText() {
        return (int)this.e.b.z;
    }

    @Px
    public int getVerticalOffsetWithoutText() {
        return (int)this.e.b.x;
    }

    @Px
    public int getVerticalPadding() {
        return (int)this.e.b.v;
    }

    public final void h() {
        this.c.getTextPaint().setColor(((int)this.e.b.c));
        this.invalidateSelf();
    }

    public boolean hasNumber() {
        State badgeState$State0 = this.e.b;
        return badgeState$State0.j == null && badgeState$State0.k != -1;
    }

    public boolean hasText() {
        return this.e.b.j != null;
    }

    public final void i() {
        this.h = this.getMaxCharacterCount() == -2 ? this.getMaxNumber() : ((int)Math.pow(10.0, ((double)this.getMaxCharacterCount()) - 1.0)) - 1;
        this.c.setTextSizeDirty(true);
        this.k();
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public final void j() {
        boolean z = this.e.b.t.booleanValue();
        this.setVisible(z, false);
        if(BadgeUtils.USE_COMPAT_PARENT && this.getCustomBadgeParent() != null && !z) {
            ((ViewGroup)this.getCustomBadgeParent().getParent()).invalidate();
        }
    }

    public final void k() {
        WeakReference weakReference0 = this.a;
        Context context0 = (Context)weakReference0.get();
        ViewGroup viewGroup0 = null;
        View view0 = this.l == null ? null : ((View)this.l.get());
        if(context0 != null && view0 != null) {
            Rect rect0 = new Rect();
            Rect rect1 = this.d;
            rect0.set(rect1);
            Rect rect2 = new Rect();
            view0.getDrawingRect(rect2);
            WeakReference weakReference1 = this.m;
            if(weakReference1 != null) {
                viewGroup0 = (ViewGroup)weakReference1.get();
            }
            if(viewGroup0 != null || BadgeUtils.USE_COMPAT_PARENT) {
                if(viewGroup0 == null) {
                    viewGroup0 = (ViewGroup)view0.getParent();
                }
                viewGroup0.offsetDescendantRectToMyCoords(view0, rect2);
            }
            BadgeState badgeState0 = this.e;
            float f = this.c() ? badgeState0.d : badgeState0.c;
            this.i = f;
            if(Float.compare(f, -1.0f) == 0) {
                this.j = (float)Math.round((this.c() ? badgeState0.g : badgeState0.e) / 2.0f);
                this.k = (float)Math.round((this.c() ? badgeState0.h : badgeState0.f) / 2.0f);
            }
            else {
                this.j = f;
                this.k = f;
            }
            if(this.c()) {
                String s = this.b();
                this.j = Math.max(this.j, this.c.getTextWidth(s) / 2.0f + ((float)(((int)badgeState0.b.u))));
                float f1 = Math.max(this.k, this.c.getTextHeight(s) / 2.0f + ((float)(((int)badgeState0.b.v))));
                this.k = f1;
                this.j = Math.max(this.j, f1);
            }
            int v = (int)badgeState0.b.x;
            State badgeState$State0 = badgeState0.b;
            if(this.c()) {
                v = (int)badgeState$State0.z;
                Context context1 = (Context)weakReference0.get();
                if(context1 != null) {
                    float f2 = AnimationUtils.lerp(0.0f, 1.0f, 0.3f, 1.0f, MaterialResources.getFontScale(context1) - 1.0f);
                    v = AnimationUtils.lerp(v, v - ((int)badgeState$State0.C), f2);
                }
            }
            int v1 = badgeState0.k;
            if(v1 == 0) {
                v -= Math.round(this.k);
            }
            int v2 = ((int)badgeState$State0.B) + v;
            switch(((int)badgeState$State0.s)) {
                case 0x800053: 
                case 0x800055: {
                    this.g = (float)(rect2.bottom - v2);
                    break;
                }
                default: {
                    this.g = (float)(rect2.top + v2);
                }
            }
            int v3 = this.c() ? ((int)badgeState$State0.y) : ((int)badgeState$State0.w);
            if(v1 == 1) {
                v3 += (this.c() ? badgeState0.j : badgeState0.i);
            }
            int v4 = ((int)badgeState$State0.A) + v3;
            switch(((int)badgeState$State0.s)) {
                case 0x800033: 
                case 0x800053: {
                    this.f = ViewCompat.getLayoutDirection(view0) == 0 ? ((float)rect2.left) - this.j + ((float)v4) : ((float)rect2.right) + this.j - ((float)v4);
                    break;
                }
                default: {
                    this.f = ViewCompat.getLayoutDirection(view0) == 0 ? ((float)rect2.right) + this.j - ((float)v4) : ((float)rect2.left) - this.j + ((float)v4);
                }
            }
            if(badgeState$State0.D.booleanValue()) {
                this.a(view0);
            }
            BadgeUtils.updateBadgeBounds(rect1, this.f, this.g, this.j, this.k);
            float f3 = this.i;
            MaterialShapeDrawable materialShapeDrawable0 = this.b;
            if(Float.compare(f3, -1.0f) != 0) {
                materialShapeDrawable0.setCornerSize(f3);
            }
            if(!rect0.equals(rect1)) {
                materialShapeDrawable0.setBounds(rect1);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper$TextDrawableDelegate
    public boolean onStateChange(int[] arr_v) {
        return super.onStateChange(arr_v);
    }

    @Override  // com.google.android.material.internal.TextDrawableHelper$TextDrawableDelegate
    @RestrictTo({Scope.LIBRARY_GROUP})
    public void onTextSizeChange() {
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        this.e.a.i = v;
        this.e.b.i = v;
        this.c.getTextPaint().setAlpha(this.getAlpha());
        this.invalidateSelf();
    }

    public void setAutoAdjustToWithinGrandparentBounds(boolean z) {
        BadgeState badgeState0 = this.e;
        if(badgeState0.b.D.booleanValue() == z) {
            return;
        }
        badgeState0.a.D = Boolean.valueOf(z);
        badgeState0.b.D = Boolean.valueOf(z);
        if(this.l != null && this.l.get() != null) {
            this.a(((View)this.l.get()));
        }
    }

    public void setBackgroundColor(@ColorInt int v) {
        this.e.a.b = v;
        this.e.b.b = v;
        ColorStateList colorStateList0 = ColorStateList.valueOf(((int)this.e.b.b));
        MaterialShapeDrawable materialShapeDrawable0 = this.b;
        if(materialShapeDrawable0.getFillColor() != colorStateList0) {
            materialShapeDrawable0.setFillColor(colorStateList0);
            this.invalidateSelf();
        }
    }

    public void setBadgeGravity(int v) {
        if(v == 0x800053 || v == 0x800055) {
            Log.w("Badge", "Bottom badge gravities are deprecated; please use a top gravity instead.");
        }
        BadgeState badgeState0 = this.e;
        if(((int)badgeState0.b.s) != v) {
            badgeState0.a.s = v;
            badgeState0.b.s = v;
            this.e();
        }
    }

    public void setBadgeNumberLocale(@NonNull Locale locale0) {
        BadgeState badgeState0 = this.e;
        if(!locale0.equals(badgeState0.b.n)) {
            badgeState0.a.n = locale0;
            badgeState0.b.n = locale0;
            this.invalidateSelf();
        }
    }

    public void setBadgeTextColor(@ColorInt int v) {
        if(this.c.getTextPaint().getColor() != v) {
            this.e.a.c = v;
            this.e.b.c = v;
            this.h();
        }
    }

    public void setBadgeWithTextShapeAppearance(@StyleRes int v) {
        this.e.a.g = v;
        this.e.b.g = v;
        this.f();
    }

    public void setBadgeWithTextShapeAppearanceOverlay(@StyleRes int v) {
        this.e.a.h = v;
        this.e.b.h = v;
        this.f();
    }

    public void setBadgeWithoutTextShapeAppearance(@StyleRes int v) {
        this.e.a.e = v;
        this.e.b.e = v;
        this.f();
    }

    public void setBadgeWithoutTextShapeAppearanceOverlay(@StyleRes int v) {
        this.e.a.f = v;
        this.e.b.f = v;
        this.f();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
    }

    public void setContentDescriptionExceedsMaxBadgeNumberStringResource(@StringRes int v) {
        this.e.a.r = v;
        this.e.b.r = v;
    }

    public void setContentDescriptionForText(@Nullable CharSequence charSequence0) {
        this.e.a.o = charSequence0;
        this.e.b.o = charSequence0;
    }

    public void setContentDescriptionNumberless(CharSequence charSequence0) {
        this.e.a.p = charSequence0;
        this.e.b.p = charSequence0;
    }

    public void setContentDescriptionQuantityStringsResource(@PluralsRes int v) {
        this.e.a.q = v;
        this.e.b.q = v;
    }

    public void setHorizontalOffset(int v) {
        this.setHorizontalOffsetWithoutText(v);
        this.setHorizontalOffsetWithText(v);
    }

    public void setHorizontalOffsetWithText(@Px int v) {
        this.e.a.y = v;
        this.e.b.y = v;
        this.k();
    }

    public void setHorizontalOffsetWithoutText(@Px int v) {
        this.e.a.w = v;
        this.e.b.w = v;
        this.k();
    }

    public void setHorizontalPadding(@Px int v) {
        BadgeState badgeState0 = this.e;
        if(v != ((int)badgeState0.b.u)) {
            badgeState0.a.u = v;
            badgeState0.b.u = v;
            this.k();
        }
    }

    public void setLargeFontVerticalOffsetAdjustment(@Px int v) {
        this.e.a.C = v;
        this.e.b.C = v;
        this.k();
    }

    public void setMaxCharacterCount(int v) {
        BadgeState badgeState0 = this.e;
        State badgeState$State0 = badgeState0.b;
        if(badgeState$State0.l != v) {
            badgeState0.a.l = v;
            badgeState$State0.l = v;
            this.i();
        }
    }

    public void setMaxNumber(int v) {
        BadgeState badgeState0 = this.e;
        State badgeState$State0 = badgeState0.b;
        if(badgeState$State0.m != v) {
            badgeState0.a.m = v;
            badgeState$State0.m = v;
            this.i();
        }
    }

    public void setNumber(int v) {
        int v1 = Math.max(0, v);
        BadgeState badgeState0 = this.e;
        State badgeState$State0 = badgeState0.b;
        if(badgeState$State0.k != v1) {
            badgeState0.a.k = v1;
            badgeState$State0.k = v1;
            if(!this.hasText()) {
                this.d();
            }
        }
    }

    public void setText(@Nullable String s) {
        BadgeState badgeState0 = this.e;
        if(!TextUtils.equals(badgeState0.b.j, s)) {
            badgeState0.a.j = s;
            badgeState0.b.j = s;
            this.d();
        }
    }

    public void setTextAppearance(@StyleRes int v) {
        this.e.a.d = v;
        this.e.b.d = v;
        this.g();
    }

    public void setVerticalOffset(int v) {
        this.setVerticalOffsetWithoutText(v);
        this.setVerticalOffsetWithText(v);
    }

    public void setVerticalOffsetWithText(@Px int v) {
        this.e.a.z = v;
        this.e.b.z = v;
        this.k();
    }

    public void setVerticalOffsetWithoutText(@Px int v) {
        this.e.a.x = v;
        this.e.b.x = v;
        this.k();
    }

    public void setVerticalPadding(@Px int v) {
        BadgeState badgeState0 = this.e;
        if(v != ((int)badgeState0.b.v)) {
            badgeState0.a.v = v;
            badgeState0.b.v = v;
            this.k();
        }
    }

    public void setVisible(boolean z) {
        this.e.a.t = Boolean.valueOf(z);
        this.e.b.t = Boolean.valueOf(z);
        this.j();
    }

    public void updateBadgeCoordinates(@NonNull View view0) {
        this.updateBadgeCoordinates(view0, null);
    }

    @Deprecated
    public void updateBadgeCoordinates(@NonNull View view0, @Nullable ViewGroup viewGroup0) {
        if(!(viewGroup0 instanceof FrameLayout)) {
            throw new IllegalArgumentException("customBadgeParent must be a FrameLayout");
        }
        this.updateBadgeCoordinates(view0, ((FrameLayout)viewGroup0));
    }

    public void updateBadgeCoordinates(@NonNull View view0, @Nullable FrameLayout frameLayout0) {
        this.l = new WeakReference(view0);
        boolean z = BadgeUtils.USE_COMPAT_PARENT;
        if(!z || frameLayout0 != null) {
            this.m = new WeakReference(frameLayout0);
        }
        else {
            ViewGroup viewGroup0 = (ViewGroup)view0.getParent();
            if((viewGroup0 == null || viewGroup0.getId() != id.mtrl_anchor_parent) && (this.m == null || this.m.get() != viewGroup0)) {
                ViewGroup viewGroup1 = (ViewGroup)view0.getParent();
                viewGroup1.setClipChildren(false);
                viewGroup1.setClipToPadding(false);
                FrameLayout frameLayout1 = new FrameLayout(view0.getContext());
                frameLayout1.setId(id.mtrl_anchor_parent);
                frameLayout1.setClipChildren(false);
                frameLayout1.setClipToPadding(false);
                frameLayout1.setLayoutParams(view0.getLayoutParams());
                frameLayout1.setMinimumWidth(view0.getWidth());
                frameLayout1.setMinimumHeight(view0.getHeight());
                int v = viewGroup0.indexOfChild(view0);
                viewGroup0.removeViewAt(v);
                view0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout1.addView(view0);
                viewGroup0.addView(frameLayout1, v);
                this.m = new WeakReference(frameLayout1);
                frameLayout1.post(new q(this, view0, 5, frameLayout1));
            }
        }
        if(!z) {
            ViewGroup viewGroup2 = (ViewGroup)view0.getParent();
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
        }
        this.k();
        this.invalidateSelf();
    }
}

