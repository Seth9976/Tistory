package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.id;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class CollapsingToolbarLayout extends FrameLayout {
    public static class LayoutParams extends FrameLayout.LayoutParams {
        public static final int COLLAPSE_MODE_OFF = 0;
        public static final int COLLAPSE_MODE_PARALLAX = 2;
        public static final int COLLAPSE_MODE_PIN = 1;
        public int a;
        public float b;

        public LayoutParams(int v, int v1) {
            super(v, v1);
            this.a = 0;
            this.b = 0.5f;
        }

        public LayoutParams(int v, int v1, int v2) {
            super(v, v1, v2);
            this.a = 0;
            this.b = 0.5f;
        }

        public LayoutParams(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.a = 0;
            this.b = 0.5f;
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.CollapsingToolbarLayout_Layout);
            this.a = typedArray0.getInt(styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            this.setParallaxMultiplier(typedArray0.getFloat(styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            typedArray0.recycle();
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
            this.a = 0;
            this.b = 0.5f;
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
            this.a = 0;
            this.b = 0.5f;
        }

        @RequiresApi(19)
        public LayoutParams(@NonNull FrameLayout.LayoutParams frameLayout$LayoutParams0) {
            super(frameLayout$LayoutParams0);
            this.a = 0;
            this.b = 0.5f;
        }

        @RequiresApi(19)
        public LayoutParams(@NonNull LayoutParams collapsingToolbarLayout$LayoutParams0) {
            super(collapsingToolbarLayout$LayoutParams0);
            this.a = collapsingToolbarLayout$LayoutParams0.a;
            this.b = collapsingToolbarLayout$LayoutParams0.b;
        }

        public int getCollapseMode() {
            return this.a;
        }

        public float getParallaxMultiplier() {
            return this.b;
        }

        public void setCollapseMode(int v) {
            this.a = v;
        }

        public void setParallaxMultiplier(float f) {
            this.b = f;
        }
    }

    @RequiresApi(23)
    @RestrictTo({Scope.LIBRARY_GROUP})
    public interface StaticLayoutBuilderConfigurer extends com.google.android.material.internal.StaticLayoutBuilderConfigurer {
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface TitleCollapseMode {
    }

    public WindowInsetsCompat A;
    public int B;
    public boolean C;
    public int D;
    public boolean E;
    public static final int F = 0;
    public static final int TITLE_COLLAPSE_MODE_FADE = 1;
    public static final int TITLE_COLLAPSE_MODE_SCALE;
    public boolean a;
    public final int b;
    public ViewGroup c;
    public View d;
    public View e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final Rect j;
    public final CollapsingTextHelper k;
    public final ElevationOverlayProvider l;
    public boolean m;
    public boolean n;
    public Drawable o;
    public Drawable p;
    public int q;
    public boolean r;
    public ValueAnimator s;
    public long t;
    public final TimeInterpolator u;
    public final TimeInterpolator v;
    public int w;
    public h x;
    public int y;
    public int z;

    static {
        CollapsingToolbarLayout.F = style.Widget_Design_CollapsingToolbar;
    }

    public CollapsingToolbarLayout(@NonNull Context context0) {
        this(context0, null);
    }

    public CollapsingToolbarLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.collapsingToolbarLayoutStyle);
    }

    public CollapsingToolbarLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(MaterialThemeOverlay.wrap(context0, attributeSet0, v, CollapsingToolbarLayout.F), attributeSet0, v);
        TextUtils.TruncateAt textUtils$TruncateAt0;
        this.a = true;
        this.j = new Rect();
        this.w = -1;
        this.B = 0;
        this.D = 0;
        Context context1 = this.getContext();
        CollapsingTextHelper collapsingTextHelper0 = new CollapsingTextHelper(this);
        this.k = collapsingTextHelper0;
        collapsingTextHelper0.setTextSizeInterpolator(AnimationUtils.DECELERATE_INTERPOLATOR);
        collapsingTextHelper0.setRtlTextDirectionHeuristicsEnabled(false);
        this.l = new ElevationOverlayProvider(context1);
        TypedArray typedArray0 = ThemeEnforcement.obtainStyledAttributes(context1, attributeSet0, styleable.CollapsingToolbarLayout, v, CollapsingToolbarLayout.F, new int[0]);
        collapsingTextHelper0.setExpandedTextGravity(typedArray0.getInt(styleable.CollapsingToolbarLayout_expandedTitleGravity, 0x800053));
        collapsingTextHelper0.setCollapsedTextGravity(typedArray0.getInt(styleable.CollapsingToolbarLayout_collapsedTitleGravity, 0x800013));
        int v1 = typedArray0.getDimensionPixelSize(styleable.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.i = v1;
        this.h = v1;
        this.g = v1;
        this.f = v1;
        if(typedArray0.hasValue(styleable.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.f = typedArray0.getDimensionPixelSize(styleable.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if(typedArray0.hasValue(styleable.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.h = typedArray0.getDimensionPixelSize(styleable.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if(typedArray0.hasValue(styleable.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.g = typedArray0.getDimensionPixelSize(styleable.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if(typedArray0.hasValue(styleable.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.i = typedArray0.getDimensionPixelSize(styleable.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        this.m = typedArray0.getBoolean(styleable.CollapsingToolbarLayout_titleEnabled, true);
        this.setTitle(typedArray0.getText(styleable.CollapsingToolbarLayout_title));
        collapsingTextHelper0.setExpandedTextAppearance(style.TextAppearance_Design_CollapsingToolbar_Expanded);
        collapsingTextHelper0.setCollapsedTextAppearance(androidx.appcompat.R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if(typedArray0.hasValue(styleable.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            collapsingTextHelper0.setExpandedTextAppearance(typedArray0.getResourceId(styleable.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if(typedArray0.hasValue(styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            collapsingTextHelper0.setCollapsedTextAppearance(typedArray0.getResourceId(styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        if(typedArray0.hasValue(styleable.CollapsingToolbarLayout_titleTextEllipsize)) {
            int v2 = typedArray0.getInt(styleable.CollapsingToolbarLayout_titleTextEllipsize, -1);
            switch(v2) {
                case 0: {
                    textUtils$TruncateAt0 = TextUtils.TruncateAt.START;
                    break;
                }
                case 1: {
                    textUtils$TruncateAt0 = TextUtils.TruncateAt.MIDDLE;
                    break;
                }
                default: {
                    textUtils$TruncateAt0 = v2 == 3 ? TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.END;
                }
            }
            this.setTitleEllipsize(textUtils$TruncateAt0);
        }
        if(typedArray0.hasValue(styleable.CollapsingToolbarLayout_expandedTitleTextColor)) {
            collapsingTextHelper0.setExpandedTextColor(MaterialResources.getColorStateList(context1, typedArray0, styleable.CollapsingToolbarLayout_expandedTitleTextColor));
        }
        if(typedArray0.hasValue(styleable.CollapsingToolbarLayout_collapsedTitleTextColor)) {
            collapsingTextHelper0.setCollapsedTextColor(MaterialResources.getColorStateList(context1, typedArray0, styleable.CollapsingToolbarLayout_collapsedTitleTextColor));
        }
        this.w = typedArray0.getDimensionPixelSize(styleable.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        if(typedArray0.hasValue(styleable.CollapsingToolbarLayout_maxLines)) {
            collapsingTextHelper0.setMaxLines(typedArray0.getInt(styleable.CollapsingToolbarLayout_maxLines, 1));
        }
        if(typedArray0.hasValue(styleable.CollapsingToolbarLayout_titlePositionInterpolator)) {
            collapsingTextHelper0.setPositionInterpolator(android.view.animation.AnimationUtils.loadInterpolator(context1, typedArray0.getResourceId(styleable.CollapsingToolbarLayout_titlePositionInterpolator, 0)));
        }
        this.t = (long)typedArray0.getInt(styleable.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        this.u = MotionUtils.resolveThemeInterpolator(context1, attr.motionEasingStandardInterpolator, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        this.v = MotionUtils.resolveThemeInterpolator(context1, attr.motionEasingStandardInterpolator, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        this.setContentScrim(typedArray0.getDrawable(styleable.CollapsingToolbarLayout_contentScrim));
        this.setStatusBarScrim(typedArray0.getDrawable(styleable.CollapsingToolbarLayout_statusBarScrim));
        this.setTitleCollapseMode(typedArray0.getInt(styleable.CollapsingToolbarLayout_titleCollapseMode, 0));
        this.b = typedArray0.getResourceId(styleable.CollapsingToolbarLayout_toolbarId, -1);
        this.C = typedArray0.getBoolean(styleable.CollapsingToolbarLayout_forceApplySystemWindowInsetTop, false);
        this.E = typedArray0.getBoolean(styleable.CollapsingToolbarLayout_extraMultilineHeightEnabled, false);
        typedArray0.recycle();
        this.setWillNotDraw(false);
        ViewCompat.setOnApplyWindowInsetsListener(this, new f(this, 12));
    }

    public final void a() {
        if(!this.a) {
            return;
        }
        ViewGroup viewGroup0 = null;
        this.c = null;
        this.d = null;
        int v = this.b;
        if(v != -1) {
            View view0 = (ViewGroup)this.findViewById(v);
            this.c = view0;
            if(view0 != null) {
                for(ViewParent viewParent0 = view0.getParent(); viewParent0 != this && viewParent0 != null; viewParent0 = viewParent0.getParent()) {
                    if(viewParent0 instanceof View) {
                        view0 = (View)viewParent0;
                    }
                }
                this.d = view0;
            }
        }
        if(this.c == null) {
            int v1 = this.getChildCount();
            int v2 = 0;
            while(v2 < v1) {
                View view1 = this.getChildAt(v2);
                if(!(view1 instanceof Toolbar) && !(view1 instanceof android.widget.Toolbar)) {
                    ++v2;
                }
                else {
                    viewGroup0 = (ViewGroup)view1;
                    if(true) {
                        break;
                    }
                }
            }
            this.c = viewGroup0;
        }
        this.c();
        this.a = false;
    }

    public static j b(View view0) {
        j j0 = (j)view0.getTag(id.view_offset_helper);
        if(j0 == null) {
            j0 = new j(view0);
            view0.setTag(id.view_offset_helper, j0);
        }
        return j0;
    }

    public final void c() {
        if(!this.m) {
            View view0 = this.e;
            if(view0 != null) {
                ViewParent viewParent0 = view0.getParent();
                if(viewParent0 instanceof ViewGroup) {
                    ((ViewGroup)viewParent0).removeView(this.e);
                }
            }
        }
        if(this.m && this.c != null) {
            if(this.e == null) {
                this.e = new View(this.getContext());
            }
            if(this.e.getParent() == null) {
                this.c.addView(this.e, -1, -1);
            }
        }
    }

    @Override  // android.widget.FrameLayout
    public boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof LayoutParams;
    }

    public final void d() {
        if(this.o != null || this.p != null) {
            this.setScrimsShown(this.getHeight() + this.y < this.getScrimVisibleHeightTrigger());
        }
    }

    @Override  // android.view.View
    public void draw(@NonNull Canvas canvas0) {
        super.draw(canvas0);
        this.a();
        if(this.c == null) {
            Drawable drawable0 = this.o;
            if(drawable0 != null && this.q > 0) {
                drawable0.mutate().setAlpha(this.q);
                this.o.draw(canvas0);
            }
        }
        if(this.m && this.n) {
            CollapsingTextHelper collapsingTextHelper0 = this.k;
            if(this.c == null || this.o == null || this.q <= 0 || this.z != 1 || collapsingTextHelper0.getExpansionFraction() >= collapsingTextHelper0.getFadeModeThresholdFraction()) {
                collapsingTextHelper0.draw(canvas0);
            }
            else {
                int v = canvas0.save();
                canvas0.clipRect(this.o.getBounds(), Region.Op.DIFFERENCE);
                collapsingTextHelper0.draw(canvas0);
                canvas0.restoreToCount(v);
            }
        }
        if(this.p != null && this.q > 0) {
            int v1 = this.A == null ? 0 : this.A.getSystemWindowInsetTop();
            if(v1 > 0) {
                this.p.setBounds(0, -this.y, this.getWidth(), v1 - this.y);
                this.p.mutate().setAlpha(this.q);
                this.p.draw(canvas0);
            }
        }
    }

    @Override  // android.view.ViewGroup
    public boolean drawChild(Canvas canvas0, View view0, long v) {
        Drawable drawable0 = this.o;
        if(drawable0 != null && this.q > 0) {
            View view1 = this.d;
            if(view1 == null || view1 == this) {
                if(view0 == this.c) {
                label_7:
                    int v1 = this.getWidth();
                    int v2 = this.getHeight();
                    if(this.z == 1 && view0 != null && this.m) {
                        v2 = view0.getBottom();
                    }
                    drawable0.setBounds(0, 0, v1, v2);
                    this.o.mutate().setAlpha(this.q);
                    this.o.draw(canvas0);
                    return super.drawChild(canvas0, view0, v) || true;
                }
            }
            else if(view0 == view1) {
                goto label_7;
            }
        }
        return super.drawChild(canvas0, view0, v);
    }

    @Override  // android.view.ViewGroup
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] arr_v = this.getDrawableState();
        Drawable drawable0 = this.p;
        boolean z = drawable0 == null || !drawable0.isStateful() ? false : drawable0.setState(arr_v);
        Drawable drawable1 = this.o;
        if(drawable1 != null && drawable1.isStateful()) {
            z |= drawable1.setState(arr_v);
        }
        CollapsingTextHelper collapsingTextHelper0 = this.k;
        if(collapsingTextHelper0 != null) {
            z |= collapsingTextHelper0.setState(arr_v);
        }
        if(z) {
            this.invalidate();
        }
    }

    public final void e(int v, int v1, int v2, int v3, boolean z) {
        int v8;
        int v7;
        int v6;
        if(this.m) {
            View view0 = this.e;
            if(view0 != null) {
                int v4 = 0;
                boolean z1 = true;
                boolean z2 = ViewCompat.isAttachedToWindow(view0) && this.e.getVisibility() == 0;
                this.n = z2;
                if(z2 || z) {
                    if(ViewCompat.getLayoutDirection(this) != 1) {
                        z1 = false;
                    }
                    View view1 = this.d;
                    if(view1 == null) {
                        view1 = this.c;
                    }
                    j j0 = CollapsingToolbarLayout.b(view1);
                    LayoutParams collapsingToolbarLayout$LayoutParams0 = (LayoutParams)view1.getLayoutParams();
                    int v5 = this.getHeight() - j0.b - view1.getHeight() - collapsingToolbarLayout$LayoutParams0.bottomMargin;
                    Rect rect0 = this.j;
                    DescendantOffsetUtils.getDescendantRect(this, this.e, rect0);
                    ViewGroup viewGroup0 = this.c;
                    if(viewGroup0 instanceof Toolbar) {
                        v4 = ((Toolbar)viewGroup0).getTitleMarginStart();
                        v6 = ((Toolbar)viewGroup0).getTitleMarginEnd();
                        v7 = ((Toolbar)viewGroup0).getTitleMarginTop();
                        v8 = ((Toolbar)viewGroup0).getTitleMarginBottom();
                    }
                    else if(viewGroup0 instanceof android.widget.Toolbar) {
                        v4 = ((android.widget.Toolbar)viewGroup0).getTitleMarginStart();
                        v6 = ((android.widget.Toolbar)viewGroup0).getTitleMarginEnd();
                        v7 = ((android.widget.Toolbar)viewGroup0).getTitleMarginTop();
                        v8 = ((android.widget.Toolbar)viewGroup0).getTitleMarginBottom();
                    }
                    else {
                        v8 = 0;
                        v6 = 0;
                        v7 = 0;
                    }
                    int v9 = rect0.left;
                    int v10 = z1 ? v6 : v4;
                    int v11 = rect0.top + v5 + v7;
                    int v12 = rect0.right;
                    if(!z1) {
                        v4 = v6;
                    }
                    this.k.setCollapsedBounds(v9 + v10, v11, v12 - v4, rect0.bottom + v5 - v8);
                    this.k.setExpandedBounds((z1 ? this.h : this.f), rect0.top + this.g, v2 - v - (z1 ? this.f : this.h), v3 - v1 - this.i);
                    this.k.recalculate(z);
                }
            }
        }
    }

    public final void f() {
        CharSequence charSequence0;
        if(this.c != null && this.m && TextUtils.isEmpty(this.k.getText())) {
            ViewGroup viewGroup0 = this.c;
            if(viewGroup0 instanceof Toolbar) {
                charSequence0 = ((Toolbar)viewGroup0).getTitle();
            }
            else {
                charSequence0 = viewGroup0 instanceof android.widget.Toolbar ? ((android.widget.Toolbar)viewGroup0).getTitle() : null;
            }
            this.setTitle(charSequence0);
        }
    }

    @Override  // android.widget.FrameLayout
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return this.generateDefaultLayoutParams();
    }

    @Override  // android.widget.FrameLayout
    public FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return this.generateDefaultLayoutParams();
    }

    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override  // android.widget.FrameLayout
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.generateLayoutParams(attributeSet0);
    }

    @Override  // android.widget.FrameLayout
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return this.generateLayoutParams(viewGroup$LayoutParams0);
    }

    @Override  // android.widget.FrameLayout
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return new LayoutParams(this.getContext(), attributeSet0);
    }

    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return new LayoutParams(viewGroup$LayoutParams0);
    }

    public int getCollapsedTitleGravity() {
        return this.k.getCollapsedTextGravity();
    }

    public float getCollapsedTitleTextSize() {
        return this.k.getCollapsedTextSize();
    }

    @NonNull
    public Typeface getCollapsedTitleTypeface() {
        return this.k.getCollapsedTypeface();
    }

    @Nullable
    public Drawable getContentScrim() {
        return this.o;
    }

    @ColorInt
    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        ColorStateList colorStateList0 = MaterialColors.getColorStateListOrNull(this.getContext(), attr.colorSurfaceContainer);
        if(colorStateList0 != null) {
            return colorStateList0.getDefaultColor();
        }
        float f = this.getResources().getDimension(dimen.design_appbar_elevation);
        return this.l.compositeOverlayWithThemeSurfaceColorIfNeeded(f);
    }

    public int getExpandedTitleGravity() {
        return this.k.getExpandedTextGravity();
    }

    public int getExpandedTitleMarginBottom() {
        return this.i;
    }

    public int getExpandedTitleMarginEnd() {
        return this.h;
    }

    public int getExpandedTitleMarginStart() {
        return this.f;
    }

    public int getExpandedTitleMarginTop() {
        return this.g;
    }

    public float getExpandedTitleTextSize() {
        return this.k.getExpandedTextSize();
    }

    @NonNull
    public Typeface getExpandedTitleTypeface() {
        return this.k.getExpandedTypeface();
    }

    @RequiresApi(23)
    @RestrictTo({Scope.LIBRARY_GROUP})
    public int getHyphenationFrequency() {
        return this.k.getHyphenationFrequency();
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public int getLineCount() {
        return this.k.getLineCount();
    }

    @RequiresApi(23)
    @RestrictTo({Scope.LIBRARY_GROUP})
    public float getLineSpacingAdd() {
        return this.k.getLineSpacingAdd();
    }

    @RequiresApi(23)
    @RestrictTo({Scope.LIBRARY_GROUP})
    public float getLineSpacingMultiplier() {
        return this.k.getLineSpacingMultiplier();
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public int getMaxLines() {
        return this.k.getMaxLines();
    }

    public int getScrimAlpha() {
        return this.q;
    }

    public long getScrimAnimationDuration() {
        return this.t;
    }

    public int getScrimVisibleHeightTrigger() {
        int v = this.w;
        if(v >= 0) {
            return v + this.B + this.D;
        }
        int v1 = this.A == null ? 0 : this.A.getSystemWindowInsetTop();
        int v2 = ViewCompat.getMinimumHeight(this);
        return v2 <= 0 ? this.getHeight() / 3 : Math.min(v2 * 2 + v1, this.getHeight());
    }

    @Nullable
    public Drawable getStatusBarScrim() {
        return this.p;
    }

    // 去混淆评级： 低(20)
    @Nullable
    public CharSequence getTitle() {
        return this.m ? this.k.getText() : null;
    }

    public int getTitleCollapseMode() {
        return this.z;
    }

    @Nullable
    public TimeInterpolator getTitlePositionInterpolator() {
        return this.k.getPositionInterpolator();
    }

    @NonNull
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.k.getTitleTextEllipsize();
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public boolean isExtraMultilineHeightEnabled() {
        return this.E;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public boolean isForceApplySystemWindowInsetTop() {
        return this.C;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public boolean isRtlTextDirectionHeuristicsEnabled() {
        return this.k.isRtlTextDirectionHeuristicsEnabled();
    }

    public boolean isTitleEnabled() {
        return this.m;
    }

    @Override  // android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent viewParent0 = this.getParent();
        if(viewParent0 instanceof AppBarLayout) {
            if(this.z == 1) {
                ((AppBarLayout)viewParent0).setLiftOnScroll(false);
            }
            ViewCompat.setFitsSystemWindows(this, ViewCompat.getFitsSystemWindows(((AppBarLayout)viewParent0)));
            if(this.x == null) {
                this.x = new h(this);
            }
            ((AppBarLayout)viewParent0).addOnOffsetChangedListener(this.x);
            ViewCompat.requestApplyInsets(this);
        }
    }

    @Override  // android.view.View
    public void onConfigurationChanged(@NonNull Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        this.k.maybeUpdateFontWeightAdjustment(configuration0);
    }

    @Override  // android.view.ViewGroup
    public void onDetachedFromWindow() {
        ViewParent viewParent0 = this.getParent();
        h h0 = this.x;
        if(h0 != null && viewParent0 instanceof AppBarLayout) {
            ((AppBarLayout)viewParent0).removeOnOffsetChangedListener(h0);
        }
        super.onDetachedFromWindow();
    }

    @Override  // android.widget.FrameLayout
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        WindowInsetsCompat windowInsetsCompat0 = this.A;
        if(windowInsetsCompat0 != null) {
            int v5 = windowInsetsCompat0.getSystemWindowInsetTop();
            int v6 = this.getChildCount();
            for(int v7 = 0; v7 < v6; ++v7) {
                View view0 = this.getChildAt(v7);
                if(!ViewCompat.getFitsSystemWindows(view0) && view0.getTop() < v5) {
                    ViewCompat.offsetTopAndBottom(view0, v5);
                }
            }
        }
        int v8 = this.getChildCount();
        for(int v9 = 0; v9 < v8; ++v9) {
            j j0 = CollapsingToolbarLayout.b(this.getChildAt(v9));
            j0.b = j0.a.getTop();
            j0.c = j0.a.getLeft();
        }
        this.e(v, v1, v2, v3, false);
        this.f();
        this.d();
        int v10 = this.getChildCount();
        for(int v4 = 0; v4 < v10; ++v4) {
            CollapsingToolbarLayout.b(this.getChildAt(v4)).a();
        }
    }

    @Override  // android.widget.FrameLayout
    public void onMeasure(int v, int v1) {
        this.a();
        super.onMeasure(v, v1);
        int v2 = View.MeasureSpec.getMode(v1);
        int v3 = this.A == null ? 0 : this.A.getSystemWindowInsetTop();
        if((v2 == 0 || this.C) && v3 > 0) {
            this.B = v3;
            super.onMeasure(v, View.MeasureSpec.makeMeasureSpec(this.getMeasuredHeight() + v3, 0x40000000));
        }
        if(this.E) {
            CollapsingTextHelper collapsingTextHelper0 = this.k;
            if(collapsingTextHelper0.getMaxLines() > 1) {
                this.f();
                this.e(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight(), true);
                int v4 = collapsingTextHelper0.getExpandedLineCount();
                if(v4 > 1) {
                    this.D = (v4 - 1) * Math.round(collapsingTextHelper0.getExpandedTextFullHeight());
                    super.onMeasure(v, View.MeasureSpec.makeMeasureSpec(this.getMeasuredHeight() + this.D, 0x40000000));
                }
            }
        }
        ViewGroup viewGroup0 = this.c;
        if(viewGroup0 != null) {
            View view0 = this.d;
            if(view0 != null && view0 != this) {
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
                this.setMinimumHeight((viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? view0.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).topMargin + ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).bottomMargin : view0.getMeasuredHeight()));
                return;
            }
            ViewGroup.LayoutParams viewGroup$LayoutParams1 = viewGroup0.getLayoutParams();
            this.setMinimumHeight((viewGroup$LayoutParams1 instanceof ViewGroup.MarginLayoutParams ? viewGroup0.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams1).topMargin + ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams1).bottomMargin : viewGroup0.getMeasuredHeight()));
        }
    }

    @Override  // android.view.View
    public void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        Drawable drawable0 = this.o;
        if(drawable0 != null) {
            ViewGroup viewGroup0 = this.c;
            if(this.z == 1 && viewGroup0 != null && this.m) {
                v1 = viewGroup0.getBottom();
            }
            drawable0.setBounds(0, 0, v, v1);
        }
    }

    public void setCollapsedTitleGravity(int v) {
        this.k.setCollapsedTextGravity(v);
    }

    public void setCollapsedTitleTextAppearance(@StyleRes int v) {
        this.k.setCollapsedTextAppearance(v);
    }

    public void setCollapsedTitleTextColor(@ColorInt int v) {
        this.setCollapsedTitleTextColor(ColorStateList.valueOf(v));
    }

    public void setCollapsedTitleTextColor(@NonNull ColorStateList colorStateList0) {
        this.k.setCollapsedTextColor(colorStateList0);
    }

    public void setCollapsedTitleTextSize(float f) {
        this.k.setCollapsedTextSize(f);
    }

    public void setCollapsedTitleTypeface(@Nullable Typeface typeface0) {
        this.k.setCollapsedTypeface(typeface0);
    }

    public void setContentScrim(@Nullable Drawable drawable0) {
        Drawable drawable1 = null;
        Drawable drawable2 = this.o;
        if(drawable2 != drawable0) {
            if(drawable2 != null) {
                drawable2.setCallback(null);
            }
            if(drawable0 != null) {
                drawable1 = drawable0.mutate();
            }
            this.o = drawable1;
            if(drawable1 != null) {
                int v = this.getWidth();
                int v1 = this.getHeight();
                ViewGroup viewGroup0 = this.c;
                if(this.z == 1 && viewGroup0 != null && this.m) {
                    v1 = viewGroup0.getBottom();
                }
                drawable1.setBounds(0, 0, v, v1);
                this.o.setCallback(this);
                this.o.setAlpha(this.q);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setContentScrimColor(@ColorInt int v) {
        this.setContentScrim(new ColorDrawable(v));
    }

    public void setContentScrimResource(@DrawableRes int v) {
        this.setContentScrim(ContextCompat.getDrawable(this.getContext(), v));
    }

    public void setExpandedTitleColor(@ColorInt int v) {
        this.setExpandedTitleTextColor(ColorStateList.valueOf(v));
    }

    public void setExpandedTitleGravity(int v) {
        this.k.setExpandedTextGravity(v);
    }

    public void setExpandedTitleMargin(int v, int v1, int v2, int v3) {
        this.f = v;
        this.g = v1;
        this.h = v2;
        this.i = v3;
        this.requestLayout();
    }

    public void setExpandedTitleMarginBottom(int v) {
        this.i = v;
        this.requestLayout();
    }

    public void setExpandedTitleMarginEnd(int v) {
        this.h = v;
        this.requestLayout();
    }

    public void setExpandedTitleMarginStart(int v) {
        this.f = v;
        this.requestLayout();
    }

    public void setExpandedTitleMarginTop(int v) {
        this.g = v;
        this.requestLayout();
    }

    public void setExpandedTitleTextAppearance(@StyleRes int v) {
        this.k.setExpandedTextAppearance(v);
    }

    public void setExpandedTitleTextColor(@NonNull ColorStateList colorStateList0) {
        this.k.setExpandedTextColor(colorStateList0);
    }

    public void setExpandedTitleTextSize(float f) {
        this.k.setExpandedTextSize(f);
    }

    public void setExpandedTitleTypeface(@Nullable Typeface typeface0) {
        this.k.setExpandedTypeface(typeface0);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setExtraMultilineHeightEnabled(boolean z) {
        this.E = z;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.C = z;
    }

    @RequiresApi(23)
    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setHyphenationFrequency(int v) {
        this.k.setHyphenationFrequency(v);
    }

    @RequiresApi(23)
    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setLineSpacingAdd(float f) {
        this.k.setLineSpacingAdd(f);
    }

    @RequiresApi(23)
    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setLineSpacingMultiplier(@FloatRange(from = 0.0) float f) {
        this.k.setLineSpacingMultiplier(f);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setMaxLines(int v) {
        this.k.setMaxLines(v);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.k.setRtlTextDirectionHeuristicsEnabled(z);
    }

    public void setScrimAlpha(int v) {
        if(v != this.q) {
            if(this.o != null) {
                ViewGroup viewGroup0 = this.c;
                if(viewGroup0 != null) {
                    ViewCompat.postInvalidateOnAnimation(viewGroup0);
                }
            }
            this.q = v;
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setScrimAnimationDuration(@IntRange(from = 0L) long v) {
        this.t = v;
    }

    public void setScrimVisibleHeightTrigger(@IntRange(from = 0L) int v) {
        if(this.w != v) {
            this.w = v;
            this.d();
        }
    }

    public void setScrimsShown(boolean z) {
        this.setScrimsShown(z, ViewCompat.isLaidOut(this) && !this.isInEditMode());
    }

    public void setScrimsShown(boolean z, boolean z1) {
        int v = 0;
        if(this.r != z) {
            if(z1) {
                if(z) {
                    v = 0xFF;
                }
                this.a();
                ValueAnimator valueAnimator0 = this.s;
                if(valueAnimator0 == null) {
                    ValueAnimator valueAnimator1 = new ValueAnimator();
                    this.s = valueAnimator1;
                    valueAnimator1.setInterpolator((v <= this.q ? this.v : this.u));
                    this.s.addUpdateListener(new g(this, 0));
                }
                else if(valueAnimator0.isRunning()) {
                    this.s.cancel();
                }
                this.s.setDuration(this.t);
                this.s.setIntValues(new int[]{this.q, v});
                this.s.start();
            }
            else {
                if(z) {
                    v = 0xFF;
                }
                this.setScrimAlpha(v);
            }
            this.r = z;
        }
    }

    @RequiresApi(23)
    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setStaticLayoutBuilderConfigurer(@Nullable StaticLayoutBuilderConfigurer collapsingToolbarLayout$StaticLayoutBuilderConfigurer0) {
        this.k.setStaticLayoutBuilderConfigurer(collapsingToolbarLayout$StaticLayoutBuilderConfigurer0);
    }

    public void setStatusBarScrim(@Nullable Drawable drawable0) {
        Drawable drawable1 = null;
        Drawable drawable2 = this.p;
        if(drawable2 != drawable0) {
            if(drawable2 != null) {
                drawable2.setCallback(null);
            }
            if(drawable0 != null) {
                drawable1 = drawable0.mutate();
            }
            this.p = drawable1;
            if(drawable1 != null) {
                if(drawable1.isStateful()) {
                    this.p.setState(this.getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.p, ViewCompat.getLayoutDirection(this));
                this.p.setVisible(this.getVisibility() == 0, false);
                this.p.setCallback(this);
                this.p.setAlpha(this.q);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setStatusBarScrimColor(@ColorInt int v) {
        this.setStatusBarScrim(new ColorDrawable(v));
    }

    public void setStatusBarScrimResource(@DrawableRes int v) {
        this.setStatusBarScrim(ContextCompat.getDrawable(this.getContext(), v));
    }

    public void setTitle(@Nullable CharSequence charSequence0) {
        this.k.setText(charSequence0);
        this.setContentDescription(this.getTitle());
    }

    public void setTitleCollapseMode(int v) {
        this.z = v;
        this.k.setFadeModeEnabled(v == 1);
        ViewParent viewParent0 = this.getParent();
        if(viewParent0 instanceof AppBarLayout && this.z == 1) {
            ((AppBarLayout)viewParent0).setLiftOnScroll(false);
        }
        if(v == 1 && this.o == null) {
            this.setContentScrimColor(this.getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(@NonNull TextUtils.TruncateAt textUtils$TruncateAt0) {
        this.k.setTitleTextEllipsize(textUtils$TruncateAt0);
    }

    public void setTitleEnabled(boolean z) {
        if(z != this.m) {
            this.m = z;
            this.setContentDescription(this.getTitle());
            this.c();
            this.requestLayout();
        }
    }

    public void setTitlePositionInterpolator(@Nullable TimeInterpolator timeInterpolator0) {
        this.k.setPositionInterpolator(timeInterpolator0);
    }

    @Override  // android.view.View
    public void setVisibility(int v) {
        super.setVisibility(v);
        if(this.p != null && this.p.isVisible() != (v == 0)) {
            this.p.setVisible(v == 0, false);
        }
        if(this.o != null && this.o.isVisible() != (v == 0)) {
            this.o.setVisible(v == 0, false);
        }
    }

    @Override  // android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable0) {
        return super.verifyDrawable(drawable0) || drawable0 == this.o || drawable0 == this.p;
    }
}

