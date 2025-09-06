package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.annotation.IdRes;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.layout;
import com.google.android.material.R.styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.internal.b;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseTransientBottomBar {
    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface AnimationMode {
    }

    public static abstract class BaseCallback {
        @RestrictTo({Scope.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        public @interface DismissEvent {
        }

        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        public void onDismissed(Object object0, int v) {
        }

        public void onShown(Object object0) {
        }
    }

    public static class Behavior extends SwipeDismissBehavior {
        public final BehaviorDelegate z;

        public Behavior() {
            this.z = new BehaviorDelegate(this);
        }

        @Override  // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean canSwipeDismissView(View view0) {
            return this.z.canSwipeDismissView(view0);
        }

        @Override  // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull MotionEvent motionEvent0) {
            this.z.onInterceptTouchEvent(coordinatorLayout0, view0, motionEvent0);
            return super.onInterceptTouchEvent(coordinatorLayout0, view0, motionEvent0);
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public static class BehaviorDelegate {
        public j a;

        public BehaviorDelegate(@NonNull SwipeDismissBehavior swipeDismissBehavior0) {
            swipeDismissBehavior0.setStartAlphaSwipeDistance(0.1f);
            swipeDismissBehavior0.setEndAlphaSwipeDistance(0.6f);
            swipeDismissBehavior0.setSwipeDirection(0);
        }

        public boolean canSwipeDismissView(View view0) {
            return view0 instanceof SnackbarBaseLayout;
        }

        public void onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull MotionEvent motionEvent0) {
            switch(motionEvent0.getActionMasked()) {
                case 0: {
                    if(coordinatorLayout0.isPointInChildBounds(view0, ((int)motionEvent0.getX()), ((int)motionEvent0.getY()))) {
                        s.b().d(this.a);
                    }
                    return;
                }
                case 1: 
                case 3: {
                    s.b().e(this.a);
                }
            }
        }

        public void setBaseTransientBottomBar(@NonNull BaseTransientBottomBar baseTransientBottomBar0) {
            this.a = baseTransientBottomBar0.y;
        }
    }

    @Deprecated
    public interface ContentViewCallback extends com.google.android.material.snackbar.ContentViewCallback {
    }

    @IntRange(from = -2L)
    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Duration {
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public static class SnackbarBaseLayout extends FrameLayout {
        public BaseTransientBottomBar a;
        public final ShapeAppearanceModel b;
        public int c;
        public final float d;
        public final float e;
        public final int f;
        public final int g;
        public ColorStateList h;
        public PorterDuff.Mode i;
        public Rect j;
        public boolean k;
        public static final o l;

        static {
            SnackbarBaseLayout.l = new o();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        public SnackbarBaseLayout(@NonNull Context context0) {
            this(context0, null);
        }

        public SnackbarBaseLayout(@NonNull Context context0, AttributeSet attributeSet0) {
            super(MaterialThemeOverlay.wrap(context0, attributeSet0, 0, 0), attributeSet0);
            Drawable drawable0;
            MaterialShapeDrawable materialShapeDrawable0;
            Context context1 = this.getContext();
            TypedArray typedArray0 = context1.obtainStyledAttributes(attributeSet0, styleable.SnackbarLayout);
            if(typedArray0.hasValue(styleable.SnackbarLayout_elevation)) {
                ViewCompat.setElevation(this, ((float)typedArray0.getDimensionPixelSize(styleable.SnackbarLayout_elevation, 0)));
            }
            this.c = typedArray0.getInt(styleable.SnackbarLayout_animationMode, 0);
            if(typedArray0.hasValue(styleable.SnackbarLayout_shapeAppearance) || typedArray0.hasValue(styleable.SnackbarLayout_shapeAppearanceOverlay)) {
                this.b = ShapeAppearanceModel.builder(context1, attributeSet0, 0, 0).build();
            }
            this.d = typedArray0.getFloat(styleable.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            this.setBackgroundTintList(MaterialResources.getColorStateList(context1, typedArray0, styleable.SnackbarLayout_backgroundTint));
            this.setBackgroundTintMode(ViewUtils.parseTintMode(typedArray0.getInt(styleable.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.e = typedArray0.getFloat(styleable.SnackbarLayout_actionTextColorAlpha, 1.0f);
            this.f = typedArray0.getDimensionPixelSize(styleable.SnackbarLayout_android_maxWidth, -1);
            this.g = typedArray0.getDimensionPixelSize(styleable.SnackbarLayout_maxActionInlineWidth, -1);
            typedArray0.recycle();
            this.setOnTouchListener(SnackbarBaseLayout.l);
            this.setFocusable(true);
            if(this.getBackground() == null) {
                int v = MaterialColors.layer(this, attr.colorSurface, attr.colorOnSurface, this.getBackgroundOverlayColorAlpha());
                ShapeAppearanceModel shapeAppearanceModel0 = this.b;
                if(shapeAppearanceModel0 == null) {
                    float f = this.getResources().getDimension(dimen.mtrl_snackbar_background_corner_radius);
                    GradientDrawable gradientDrawable0 = new GradientDrawable();
                    gradientDrawable0.setShape(0);
                    gradientDrawable0.setCornerRadius(f);
                    gradientDrawable0.setColor(v);
                    materialShapeDrawable0 = gradientDrawable0;
                }
                else {
                    materialShapeDrawable0 = new MaterialShapeDrawable(shapeAppearanceModel0);
                    materialShapeDrawable0.setFillColor(ColorStateList.valueOf(v));
                }
                if(this.h == null) {
                    drawable0 = materialShapeDrawable0;
                }
                else {
                    drawable0 = materialShapeDrawable0;
                    DrawableCompat.setTintList(drawable0, this.h);
                }
                ViewCompat.setBackground(this, drawable0);
            }
        }

        public static void a(SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout0, BaseTransientBottomBar baseTransientBottomBar0) {
            baseTransientBottomBar$SnackbarBaseLayout0.setBaseTransientBottomBar(baseTransientBottomBar0);
        }

        public float getActionTextColorAlpha() {
            return this.e;
        }

        public int getAnimationMode() {
            return this.c;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.d;
        }

        public int getMaxInlineActionWidth() {
            return this.g;
        }

        public int getMaxWidth() {
            return this.f;
        }

        @Override  // android.view.ViewGroup
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar baseTransientBottomBar0 = this.a;
            if(baseTransientBottomBar0 != null && Build.VERSION.SDK_INT >= 29) {
                WindowInsets windowInsets0 = baseTransientBottomBar0.view.getRootWindowInsets();
                if(windowInsets0 != null) {
                    baseTransientBottomBar0.s = windowInsets0.getMandatorySystemGestureInsets().bottom;
                    baseTransientBottomBar0.e();
                }
            }
            ViewCompat.requestApplyInsets(this);
        }

        @Override  // android.view.ViewGroup
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar baseTransientBottomBar0 = this.a;
            if(baseTransientBottomBar0 != null && baseTransientBottomBar0.isShownOrQueued()) {
                k k0 = new k(baseTransientBottomBar0);
                BaseTransientBottomBar.C.post(k0);
            }
        }

        @Override  // android.widget.FrameLayout
        public void onLayout(boolean z, int v, int v1, int v2, int v3) {
            super.onLayout(z, v, v1, v2, v3);
            BaseTransientBottomBar baseTransientBottomBar0 = this.a;
            if(baseTransientBottomBar0 != null && baseTransientBottomBar0.u) {
                baseTransientBottomBar0.d();
                baseTransientBottomBar0.u = false;
            }
        }

        @Override  // android.widget.FrameLayout
        public void onMeasure(int v, int v1) {
            super.onMeasure(v, v1);
            int v2 = this.f;
            if(v2 > 0 && this.getMeasuredWidth() > v2) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(v2, 0x40000000), v1);
            }
        }

        public void setAnimationMode(int v) {
            this.c = v;
        }

        @Override  // android.view.View
        public void setBackground(@Nullable Drawable drawable0) {
            this.setBackgroundDrawable(drawable0);
        }

        @Override  // android.view.View
        public void setBackgroundDrawable(@Nullable Drawable drawable0) {
            if(drawable0 != null && this.h != null) {
                drawable0 = DrawableCompat.wrap(drawable0.mutate());
                DrawableCompat.setTintList(drawable0, this.h);
                DrawableCompat.setTintMode(drawable0, this.i);
            }
            super.setBackgroundDrawable(drawable0);
        }

        @Override  // android.view.View
        public void setBackgroundTintList(@Nullable ColorStateList colorStateList0) {
            this.h = colorStateList0;
            if(this.getBackground() != null) {
                Drawable drawable0 = DrawableCompat.wrap(this.getBackground().mutate());
                DrawableCompat.setTintList(drawable0, colorStateList0);
                DrawableCompat.setTintMode(drawable0, this.i);
                if(drawable0 != this.getBackground()) {
                    super.setBackgroundDrawable(drawable0);
                }
            }
        }

        @Override  // android.view.View
        public void setBackgroundTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
            this.i = porterDuff$Mode0;
            if(this.getBackground() != null) {
                Drawable drawable0 = DrawableCompat.wrap(this.getBackground().mutate());
                DrawableCompat.setTintMode(drawable0, porterDuff$Mode0);
                if(drawable0 != this.getBackground()) {
                    super.setBackgroundDrawable(drawable0);
                }
            }
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar0) {
            this.a = baseTransientBottomBar0;
        }

        @Override  // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super.setLayoutParams(viewGroup$LayoutParams0);
            if(!this.k && viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams) {
                this.j = new Rect(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).leftMargin, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).topMargin, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).rightMargin, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).bottomMargin);
                BaseTransientBottomBar baseTransientBottomBar0 = this.a;
                if(baseTransientBottomBar0 != null) {
                    baseTransientBottomBar0.e();
                }
            }
        }

        @Override  // android.view.View
        public void setOnClickListener(@Nullable View.OnClickListener view$OnClickListener0) {
            this.setOnTouchListener((view$OnClickListener0 == null ? SnackbarBaseLayout.l : null));
            super.setOnClickListener(view$OnClickListener0);
        }
    }

    public static final TimeInterpolator A = null;
    public static final int ANIMATION_MODE_FADE = 1;
    public static final int ANIMATION_MODE_SLIDE = 0;
    public static final TimeInterpolator B = null;
    public static final Handler C = null;
    public static final int[] D = null;
    public static final String E = null;
    public static final int LENGTH_INDEFINITE = -2;
    public static final int LENGTH_LONG = 0;
    public static final int LENGTH_SHORT = -1;
    public final int a;
    public final int b;
    public final int c;
    public final TimeInterpolator d;
    public final TimeInterpolator e;
    public final TimeInterpolator f;
    public final ViewGroup g;
    public final Context h;
    public final com.google.android.material.snackbar.ContentViewCallback i;
    public int j;
    public boolean k;
    public n l;
    public boolean m;
    public final h n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public ArrayList v;
    @NonNull
    protected final SnackbarBaseLayout view;
    public Behavior w;
    public final AccessibilityManager x;
    public final j y;
    public static final TimeInterpolator z;

    static {
        BaseTransientBottomBar.z = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        BaseTransientBottomBar.A = AnimationUtils.LINEAR_INTERPOLATOR;
        BaseTransientBottomBar.B = AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR;
        BaseTransientBottomBar.D = new int[]{attr.snackbarStyle};
        BaseTransientBottomBar.E = "BaseTransientBottomBar";
        BaseTransientBottomBar.C = new Handler(Looper.getMainLooper(), new g());  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public BaseTransientBottomBar(@NonNull Context context0, @NonNull ViewGroup viewGroup0, @NonNull View view0, @NonNull com.google.android.material.snackbar.ContentViewCallback contentViewCallback0) {
        this.m = false;
        this.n = new h(this);
        this.y = new j(this);
        if(viewGroup0 == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if(view0 == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if(contentViewCallback0 == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.g = viewGroup0;
        this.i = contentViewCallback0;
        this.h = context0;
        ThemeEnforcement.checkAppCompatTheme(context0);
        SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout0 = (SnackbarBaseLayout)LayoutInflater.from(context0).inflate(this.getSnackbarBaseLayoutResId(), viewGroup0, false);
        this.view = baseTransientBottomBar$SnackbarBaseLayout0;
        SnackbarBaseLayout.a(baseTransientBottomBar$SnackbarBaseLayout0, this);
        if(view0 instanceof SnackbarContentLayout) {
            float f = baseTransientBottomBar$SnackbarBaseLayout0.getActionTextColorAlpha();
            if(f != 1.0f) {
                int v = ((SnackbarContentLayout)view0).b.getCurrentTextColor();
                int v1 = MaterialColors.layer(MaterialColors.getColor(((SnackbarContentLayout)view0), attr.colorSurface), v, f);
                ((SnackbarContentLayout)view0).b.setTextColor(v1);
            }
            ((SnackbarContentLayout)view0).setMaxInlineActionWidth(baseTransientBottomBar$SnackbarBaseLayout0.getMaxInlineActionWidth());
        }
        baseTransientBottomBar$SnackbarBaseLayout0.addView(view0);
        ViewCompat.setAccessibilityLiveRegion(baseTransientBottomBar$SnackbarBaseLayout0, 1);
        ViewCompat.setImportantForAccessibility(baseTransientBottomBar$SnackbarBaseLayout0, 1);
        ViewCompat.setFitsSystemWindows(baseTransientBottomBar$SnackbarBaseLayout0, true);
        ViewCompat.setOnApplyWindowInsetsListener(baseTransientBottomBar$SnackbarBaseLayout0, new i(this));
        ViewCompat.setAccessibilityDelegate(baseTransientBottomBar$SnackbarBaseLayout0, new b(this, 3));
        this.x = (AccessibilityManager)context0.getSystemService("accessibility");
        this.c = MotionUtils.resolveThemeDuration(context0, attr.motionDurationLong2, 0xFA);
        this.a = MotionUtils.resolveThemeDuration(context0, attr.motionDurationLong2, 150);
        this.b = MotionUtils.resolveThemeDuration(context0, attr.motionDurationMedium1, 75);
        this.d = MotionUtils.resolveThemeInterpolator(context0, attr.motionEasingEmphasizedInterpolator, BaseTransientBottomBar.A);
        this.f = MotionUtils.resolveThemeInterpolator(context0, attr.motionEasingEmphasizedInterpolator, BaseTransientBottomBar.B);
        this.e = MotionUtils.resolveThemeInterpolator(context0, attr.motionEasingEmphasizedInterpolator, BaseTransientBottomBar.z);
    }

    public BaseTransientBottomBar(@NonNull ViewGroup viewGroup0, @NonNull View view0, @NonNull com.google.android.material.snackbar.ContentViewCallback contentViewCallback0) {
        this(viewGroup0.getContext(), viewGroup0, view0, contentViewCallback0);
    }

    public final void a(int v) {
        s s0 = s.b();
        synchronized(s0.a) {
            if(s0.c(this.y)) {
                s0.c = null;
                r r0 = s0.d;
                if(r0 != null) {
                    s0.c = r0;
                    s0.d = null;
                    SnackbarManager.Callback snackbarManager$Callback0 = (SnackbarManager.Callback)r0.a.get();
                    if(snackbarManager$Callback0 == null) {
                        s0.c = null;
                    }
                    else {
                        snackbarManager$Callback0.show();
                    }
                }
            }
        }
        ArrayList arrayList0 = this.v;
        if(arrayList0 != null) {
            for(int v2 = arrayList0.size() - 1; v2 >= 0; --v2) {
                ((BaseCallback)this.v.get(v2)).onDismissed(this, v);
            }
        }
        ViewParent viewParent0 = this.view.getParent();
        if(viewParent0 instanceof ViewGroup) {
            ((ViewGroup)viewParent0).removeView(this.view);
        }
    }

    @NonNull
    public BaseTransientBottomBar addCallback(@Nullable BaseCallback baseTransientBottomBar$BaseCallback0) {
        if(baseTransientBottomBar$BaseCallback0 == null) {
            return this;
        }
        if(this.v == null) {
            this.v = new ArrayList();
        }
        this.v.add(baseTransientBottomBar$BaseCallback0);
        return this;
    }

    public final void b() {
        s s0 = s.b();
        synchronized(s0.a) {
            if(s0.c(this.y)) {
                s0.f(s0.c);
            }
        }
        ArrayList arrayList0 = this.v;
        if(arrayList0 != null) {
            for(int v1 = arrayList0.size() - 1; v1 >= 0; --v1) {
                ((BaseCallback)this.v.get(v1)).onShown(this);
            }
        }
    }

    public final void c() {
        int v;
        if(this.getAnchorView() == null) {
            v = 0;
        }
        else {
            int[] arr_v = new int[2];
            this.getAnchorView().getLocationOnScreen(arr_v);
            int v1 = arr_v[1];
            int[] arr_v1 = new int[2];
            this.g.getLocationOnScreen(arr_v1);
            int v2 = arr_v1[1];
            v = this.g.getHeight() + v2 - v1;
        }
        this.r = v;
        this.e();
    }

    public final void d() {
        AccessibilityManager accessibilityManager0 = this.x;
        if(accessibilityManager0 != null) {
            List list0 = accessibilityManager0.getEnabledAccessibilityServiceList(1);
            if(list0 == null || !list0.isEmpty()) {
                if(this.view.getParent() != null) {
                    this.view.setVisibility(0);
                }
                this.b();
                return;
            }
        }
        m m0 = new m(this);
        this.view.post(m0);
    }

    public void dismiss() {
        this.dispatchDismiss(3);
    }

    public void dispatchDismiss(int v) {
        s s0 = s.b();
        j j0 = this.y;
        synchronized(s0.a) {
            if(s0.c(j0)) {
                s0.a(s0.c, v);
            }
            else if(s0.d != null && j0 != null && s0.d.a.get() == j0) {
                s0.a(s0.d, v);
            }
        }
    }

    public final void e() {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.view.getLayoutParams();
        if(!(viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams)) {
            Log.w("BaseTransientBottomBar", "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout0 = this.view;
        if(baseTransientBottomBar$SnackbarBaseLayout0.j == null) {
            Log.w("BaseTransientBottomBar", "Unable to update margins because original view margins are not set");
            return;
        }
        if(baseTransientBottomBar$SnackbarBaseLayout0.getParent() == null) {
            return;
        }
        int v = this.getAnchorView() == null ? this.o : this.r;
        SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout1 = this.view;
        int v1 = baseTransientBottomBar$SnackbarBaseLayout1.j.bottom + v;
        int v2 = baseTransientBottomBar$SnackbarBaseLayout1.j.left + this.p;
        int v3 = baseTransientBottomBar$SnackbarBaseLayout1.j.right + this.q;
        int v4 = baseTransientBottomBar$SnackbarBaseLayout1.j.top;
        boolean z = ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).bottomMargin != v1 || ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).leftMargin != v2 || ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).rightMargin != v3 || ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).topMargin != v4;
        if(z) {
            ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).bottomMargin = v1;
            ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).leftMargin = v2;
            ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).rightMargin = v3;
            ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).topMargin = v4;
            baseTransientBottomBar$SnackbarBaseLayout1.requestLayout();
        }
        if((z || this.t != this.s) && Build.VERSION.SDK_INT >= 29 && this.s > 0 && !this.k) {
            ViewGroup.LayoutParams viewGroup$LayoutParams1 = this.view.getLayoutParams();
            if(viewGroup$LayoutParams1 instanceof LayoutParams && ((LayoutParams)viewGroup$LayoutParams1).getBehavior() instanceof SwipeDismissBehavior) {
                this.view.removeCallbacks(this.n);
                this.view.post(this.n);
            }
        }
    }

    @Nullable
    public View getAnchorView() {
        return this.l == null ? null : ((View)this.l.b.get());
    }

    public int getAnimationMode() {
        return this.view.getAnimationMode();
    }

    public Behavior getBehavior() {
        return this.w;
    }

    @NonNull
    public Context getContext() {
        return this.h;
    }

    public int getDuration() {
        return this.j;
    }

    @NonNull
    public SwipeDismissBehavior getNewBehavior() {
        return new Behavior();
    }

    // 去混淆评级： 低(20)
    @LayoutRes
    public int getSnackbarBaseLayoutResId() {
        return this.hasSnackbarStyleAttr() ? layout.mtrl_layout_snackbar : layout.design_layout_snackbar;
    }

    @NonNull
    public View getView() {
        return this.view;
    }

    public boolean hasSnackbarStyleAttr() {
        TypedArray typedArray0 = this.h.obtainStyledAttributes(BaseTransientBottomBar.D);
        int v = typedArray0.getResourceId(0, -1);
        typedArray0.recycle();
        return v != -1;
    }

    public boolean isAnchorViewLayoutListenerEnabled() {
        return this.m;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.k;
    }

    public boolean isShown() {
        s s0 = s.b();
        synchronized(s0.a) {
        }
        return s0.c(this.y);
    }

    public boolean isShownOrQueued() {
        boolean z = true;
        s s0 = s.b();
        synchronized(s0.a) {
            if(!s0.c(this.y) && (s0.d == null || this.y == null || s0.d.a.get() != this.y)) {
                z = false;
            }
            return z;
        }
    }

    @NonNull
    public BaseTransientBottomBar removeCallback(@Nullable BaseCallback baseTransientBottomBar$BaseCallback0) {
        if(baseTransientBottomBar$BaseCallback0 == null) {
            return this;
        }
        ArrayList arrayList0 = this.v;
        if(arrayList0 == null) {
            return this;
        }
        arrayList0.remove(baseTransientBottomBar$BaseCallback0);
        return this;
    }

    @NonNull
    public BaseTransientBottomBar setAnchorView(@IdRes int v) {
        View view0 = this.g.findViewById(v);
        if(view0 == null) {
            throw new IllegalArgumentException("Unable to find anchor view with id: " + v);
        }
        return this.setAnchorView(view0);
    }

    @NonNull
    public BaseTransientBottomBar setAnchorView(@Nullable View view0) {
        n n1;
        n n0 = this.l;
        if(n0 != null) {
            n0.a();
        }
        if(view0 == null) {
            n1 = null;
        }
        else {
            n n2 = new n(this, view0);
            if(ViewCompat.isAttachedToWindow(view0)) {
                ViewUtils.addOnGlobalLayoutListener(view0, n2);
            }
            view0.addOnAttachStateChangeListener(n2);
            n1 = n2;
        }
        this.l = n1;
        return this;
    }

    public void setAnchorViewLayoutListenerEnabled(boolean z) {
        this.m = z;
    }

    @NonNull
    public BaseTransientBottomBar setAnimationMode(int v) {
        this.view.setAnimationMode(v);
        return this;
    }

    @NonNull
    public BaseTransientBottomBar setBehavior(Behavior baseTransientBottomBar$Behavior0) {
        this.w = baseTransientBottomBar$Behavior0;
        return this;
    }

    @NonNull
    public BaseTransientBottomBar setDuration(int v) {
        this.j = v;
        return this;
    }

    @NonNull
    public BaseTransientBottomBar setGestureInsetBottomIgnored(boolean z) {
        this.k = z;
        return this;
    }

    public void show() {
        s s0 = s.b();
        int v = this.getDuration();
        j j0 = this.y;
        synchronized(s0.a) {
            if(s0.c(j0)) {
                s0.c.b = v;
                s0.b.removeCallbacksAndMessages(s0.c);
                s0.f(s0.c);
                return;
            }
            if(s0.d == null || j0 == null || s0.d.a.get() != j0) {
                s0.d = new r(v, j0);
            }
            else {
                s0.d.b = v;
            }
            if(s0.c != null && s0.a(s0.c, 4)) {
                return;
            }
            s0.c = null;
            r r0 = s0.d;
            if(r0 != null) {
                s0.c = r0;
                s0.d = null;
                SnackbarManager.Callback snackbarManager$Callback0 = (SnackbarManager.Callback)r0.a.get();
                if(snackbarManager$Callback0 == null) {
                    s0.c = null;
                }
                else {
                    snackbarManager$Callback0.show();
                }
            }
        }
    }
}

