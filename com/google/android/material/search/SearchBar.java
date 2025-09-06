package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.id;
import com.google.android.material.R.layout;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.animation.AnimatableView;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.AppBarLayout.LayoutParams;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.List;

public class SearchBar extends Toolbar {
    public static abstract class OnLoadAnimationCallback {
        public void onAnimationEnd() {
        }

        public void onAnimationStart() {
        }
    }

    public static class ScrollingViewBehavior extends com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior {
        public boolean v;

        public ScrollingViewBehavior() {
            this.v = false;
        }

        public ScrollingViewBehavior(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.v = false;
        }

        @Override  // com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior
        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1) {
            boolean z = super.onDependentViewChanged(coordinatorLayout0, view0, view1);
            if(!this.v && view1 instanceof AppBarLayout) {
                this.v = true;
                ((AppBarLayout)view1).setBackgroundColor(0);
                ((AppBarLayout)view1).setTargetElevation(0.0f);
            }
            return z;
        }

        @Override  // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public boolean shouldHeaderOverlapScrollingChild() {
            return true;
        }
    }

    public final TextView d0;
    public final boolean e0;
    public final boolean f0;
    public final h g0;
    public final Drawable h0;
    public final boolean i0;
    public final boolean j0;
    public View k0;
    public final Integer l0;
    public Drawable m0;
    public int n0;
    public boolean o0;
    public final MaterialShapeDrawable p0;
    public final AccessibilityManager q0;
    public final androidx.core.app.h r0;
    public static final int s0;

    static {
        SearchBar.s0 = style.Widget_Material3_SearchBar;
    }

    public SearchBar(@NonNull Context context0) {
        this(context0, null);
    }

    public SearchBar(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.materialSearchBarStyle);
    }

    public SearchBar(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        int v1 = SearchBar.s0;
        super(MaterialThemeOverlay.wrap(context0, attributeSet0, v, v1), attributeSet0, v);
        this.n0 = -1;
        this.r0 = new androidx.core.app.h(this, 4);
        Context context1 = this.getContext();
        if(attributeSet0 != null) {
            if(attributeSet0.getAttributeValue("http://schemas.android.com/apk/res-auto", "title") != null) {
                throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
            }
            if(attributeSet0.getAttributeValue("http://schemas.android.com/apk/res-auto", "subtitle") != null) {
                throw new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
            }
        }
        Drawable drawable0 = AppCompatResources.getDrawable(context1, 0x7F070176);  // drawable:ic_search_black_24
        this.h0 = drawable0;
        this.g0 = new h();
        TypedArray typedArray0 = ThemeEnforcement.obtainStyledAttributes(context1, attributeSet0, styleable.SearchBar, v, v1, new int[0]);
        ShapeAppearanceModel shapeAppearanceModel0 = ShapeAppearanceModel.builder(context1, attributeSet0, v, v1).build();
        int v2 = typedArray0.getColor(styleable.SearchBar_backgroundTint, 0);
        float f = typedArray0.getDimension(styleable.SearchBar_elevation, 0.0f);
        this.f0 = typedArray0.getBoolean(styleable.SearchBar_defaultMarginsEnabled, true);
        this.o0 = typedArray0.getBoolean(styleable.SearchBar_defaultScrollFlagsEnabled, true);
        boolean z = typedArray0.getBoolean(styleable.SearchBar_hideNavigationIcon, false);
        this.j0 = typedArray0.getBoolean(styleable.SearchBar_forceDefaultNavigationOnClickListener, false);
        this.i0 = typedArray0.getBoolean(styleable.SearchBar_tintNavigationIcon, true);
        if(typedArray0.hasValue(styleable.SearchBar_navigationIconTint)) {
            this.l0 = typedArray0.getColor(styleable.SearchBar_navigationIconTint, -1);
        }
        int v3 = typedArray0.getResourceId(styleable.SearchBar_android_textAppearance, -1);
        String s = typedArray0.getString(styleable.SearchBar_android_text);
        String s1 = typedArray0.getString(styleable.SearchBar_android_hint);
        float f1 = typedArray0.getDimension(styleable.SearchBar_strokeWidth, -1.0f);
        int v4 = typedArray0.getColor(styleable.SearchBar_strokeColor, 0);
        typedArray0.recycle();
        if(!z) {
            if(this.getNavigationIcon() != null) {
                drawable0 = this.getNavigationIcon();
            }
            this.setNavigationIcon(drawable0);
            this.setNavigationIconDecorative(true);
        }
        this.setClickable(true);
        this.setFocusable(true);
        LayoutInflater.from(context1).inflate(layout.mtrl_search_bar, this);
        this.e0 = true;
        TextView textView0 = (TextView)this.findViewById(id.open_search_bar_text_view);
        this.d0 = textView0;
        ViewCompat.setElevation(this, f);
        if(v3 != -1) {
            TextViewCompat.setTextAppearance(textView0, v3);
        }
        this.setText(s);
        this.setHint(s1);
        if(this.getNavigationIcon() == null) {
            MarginLayoutParamsCompat.setMarginStart(((ViewGroup.MarginLayoutParams)textView0.getLayoutParams()), this.getResources().getDimensionPixelSize(dimen.m3_searchbar_text_margin_start_no_navigation_icon));
        }
        MaterialShapeDrawable materialShapeDrawable0 = new MaterialShapeDrawable(shapeAppearanceModel0);
        this.p0 = materialShapeDrawable0;
        materialShapeDrawable0.initializeElevationOverlay(this.getContext());
        this.p0.setElevation(f);
        if(f1 >= 0.0f) {
            this.p0.setStroke(f1, v4);
        }
        int v5 = MaterialColors.getColor(this, attr.colorControlHighlight);
        ColorStateList colorStateList0 = ColorStateList.valueOf(v2);
        this.p0.setFillColor(colorStateList0);
        ViewCompat.setBackground(this, new RippleDrawable(ColorStateList.valueOf(v5), this.p0, this.p0));
        AccessibilityManager accessibilityManager0 = (AccessibilityManager)this.getContext().getSystemService("accessibility");
        this.q0 = accessibilityManager0;
        if(accessibilityManager0 != null) {
            if(accessibilityManager0.isEnabled() && accessibilityManager0.isTouchExplorationEnabled()) {
                this.setFocusableInTouchMode(true);
            }
            this.addOnAttachStateChangeListener(new a(this));
        }
    }

    public void addCollapseAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter0) {
        this.g0.c.add(animatorListenerAdapter0);
    }

    public void addExpandAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter0) {
        this.g0.b.add(animatorListenerAdapter0);
    }

    public void addOnLoadAnimationCallback(@NonNull OnLoadAnimationCallback searchBar$OnLoadAnimationCallback0) {
        this.g0.a.add(searchBar$OnLoadAnimationCallback0);
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(this.e0 && this.k0 == null && !(view0 instanceof ActionMenuView)) {
            this.k0 = view0;
            view0.setAlpha(0.0f);
        }
        super.addView(view0, v, viewGroup$LayoutParams0);
    }

    public void clearText() {
        this.d0.setText("");
    }

    @CanIgnoreReturnValue
    public boolean collapse(@NonNull View view0) {
        return this.collapse(view0, null);
    }

    @CanIgnoreReturnValue
    public boolean collapse(@NonNull View view0, @Nullable AppBarLayout appBarLayout0) {
        return this.collapse(view0, appBarLayout0, false);
    }

    @CanIgnoreReturnValue
    public boolean collapse(@NonNull View view0, @Nullable AppBarLayout appBarLayout0, boolean z) {
        if(view0.getVisibility() == 0 && !this.isCollapsing() || this.isExpanding()) {
            h h0 = this.g0;
            if(h0.f) {
                AnimatorSet animatorSet0 = h0.i;
                if(animatorSet0 != null) {
                    animatorSet0.cancel();
                }
            }
            h0.g = true;
            AnimatorSet animatorSet1 = new AnimatorSet();
            Animator animator0 = h.a(this, view0, appBarLayout0).setDuration(0xFAL).addListener(new g(h0, this, 1)).getCollapseAnimator();
            List list0 = ViewUtils.getChildren(this);
            if(this.getCenterView() != null) {
                list0.remove(this.getCenterView());
            }
            ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            valueAnimator0.addUpdateListener(MultiViewUpdateListener.alphaListener(list0));
            valueAnimator0.setDuration(100L);
            valueAnimator0.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
            animatorSet1.playSequentially(new Animator[]{animator0, valueAnimator0});
            animatorSet1.addListener(new f(h0, 1));
            for(Object object0: h0.c) {
                animatorSet1.addListener(((AnimatorListenerAdapter)object0));
            }
            if(z) {
                animatorSet1.setDuration(0L);
            }
            animatorSet1.start();
            h0.i = animatorSet1;
            return true;
        }
        return false;
    }

    @CanIgnoreReturnValue
    public boolean expand(@NonNull View view0) {
        return this.expand(view0, null);
    }

    @CanIgnoreReturnValue
    public boolean expand(@NonNull View view0, @Nullable AppBarLayout appBarLayout0) {
        return this.expand(view0, appBarLayout0, false);
    }

    @CanIgnoreReturnValue
    public boolean expand(@NonNull View view0, @Nullable AppBarLayout appBarLayout0, boolean z) {
        if(view0.getVisibility() != 0 && !this.isExpanding() || this.isCollapsing()) {
            h h0 = this.g0;
            if(h0.g) {
                AnimatorSet animatorSet0 = h0.i;
                if(animatorSet0 != null) {
                    animatorSet0.cancel();
                }
            }
            h0.f = true;
            view0.setVisibility(4);
            view0.post(new c(h0, this, view0, appBarLayout0, z));
            return true;
        }
        return false;
    }

    @Nullable
    public View getCenterView() {
        return this.k0;
    }

    public float getCompatElevation() {
        return this.p0 == null ? ViewCompat.getElevation(this) : this.p0.getElevation();
    }

    public float getCornerSize() {
        return this.p0.getTopLeftCornerResolvedSize();
    }

    @DimenRes
    @RestrictTo({Scope.LIBRARY_GROUP})
    public int getDefaultMarginVerticalResource() [...] // 潜在的解密器

    @DrawableRes
    @RestrictTo({Scope.LIBRARY_GROUP})
    public int getDefaultNavigationIconResource() [...] // 潜在的解密器

    @Nullable
    public CharSequence getHint() {
        return this.d0.getHint();
    }

    public int getMenuResId() {
        return this.n0;
    }

    @ColorInt
    public int getStrokeColor() {
        return this.p0.getStrokeColor().getDefaultColor();
    }

    @Dimension
    public float getStrokeWidth() {
        return this.p0.getStrokeWidth();
    }

    @NonNull
    public CharSequence getText() {
        return this.d0.getText();
    }

    @NonNull
    public TextView getTextView() {
        return this.d0;
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void inflateMenu(@MenuRes int v) {
        Menu menu0 = this.getMenu();
        if(menu0 instanceof MenuBuilder) {
            ((MenuBuilder)menu0).stopDispatchingItemsChanged();
        }
        super.inflateMenu(v);
        this.n0 = v;
        if(menu0 instanceof MenuBuilder) {
            ((MenuBuilder)menu0).startDispatchingItemsChanged();
        }
    }

    public boolean isCollapsing() {
        return this.g0.g;
    }

    public boolean isDefaultScrollFlagsEnabled() {
        return this.o0;
    }

    public boolean isExpanding() {
        return this.g0.f;
    }

    public boolean isOnLoadAnimationFadeInEnabled() {
        return this.g0.h;
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this, this.p0);
        if(this.f0 && this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            Resources resources0 = this.getResources();
            int v = resources0.getDimensionPixelSize(dimen.m3_searchbar_margin_horizontal);
            int v1 = resources0.getDimensionPixelSize(0x7F06020F);  // dimen:m3_searchbar_margin_vertical
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)this.getLayoutParams();
            viewGroup$MarginLayoutParams0.leftMargin = viewGroup$MarginLayoutParams0.leftMargin == 0 ? v : viewGroup$MarginLayoutParams0.leftMargin;
            viewGroup$MarginLayoutParams0.topMargin = viewGroup$MarginLayoutParams0.topMargin == 0 ? v1 : viewGroup$MarginLayoutParams0.topMargin;
            int v2 = viewGroup$MarginLayoutParams0.rightMargin;
            if(v2 != 0) {
                v = v2;
            }
            viewGroup$MarginLayoutParams0.rightMargin = v;
            int v3 = viewGroup$MarginLayoutParams0.bottomMargin;
            if(v3 != 0) {
                v1 = v3;
            }
            viewGroup$MarginLayoutParams0.bottomMargin = v1;
        }
        this.r();
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        accessibilityNodeInfo0.setClassName("android.widget.EditText");
        accessibilityNodeInfo0.setEditable(this.isEnabled());
        CharSequence charSequence0 = this.getText();
        boolean z = TextUtils.isEmpty(charSequence0);
        accessibilityNodeInfo0.setHintText(this.getHint());
        accessibilityNodeInfo0.setShowingHintText(z);
        if(z) {
            charSequence0 = this.getHint();
        }
        accessibilityNodeInfo0.setText(charSequence0);
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        View view0 = this.k0;
        if(view0 != null) {
            int v4 = view0.getMeasuredWidth();
            int v5 = this.getMeasuredWidth() / 2 - v4 / 2;
            int v6 = v4 + v5;
            int v7 = this.k0.getMeasuredHeight();
            int v8 = this.getMeasuredHeight() / 2 - v7 / 2;
            int v9 = v7 + v8;
            View view1 = this.k0;
            if(ViewCompat.getLayoutDirection(this) == 1) {
                view1.layout(this.getMeasuredWidth() - v6, v8, this.getMeasuredWidth() - v5, v9);
                return;
            }
            view1.layout(v5, v8, v6, v9);
        }
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        View view0 = this.k0;
        if(view0 != null) {
            view0.measure(v, v1);
        }
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof b)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((b)parcelable0).getSuperState());
        this.setText(((b)parcelable0).b);
    }

    @Override  // androidx.appcompat.widget.Toolbar
    @NonNull
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new b(super.onSaveInstanceState());  // 初始化器: Landroidx/customview/view/AbsSavedState;-><init>(Landroid/os/Parcelable;)V
        CharSequence charSequence0 = this.getText();
        parcelable0.b = charSequence0 == null ? null : charSequence0.toString();
        return parcelable0;
    }

    public final void r() {
        if(this.getLayoutParams() instanceof LayoutParams) {
            LayoutParams appBarLayout$LayoutParams0 = (LayoutParams)this.getLayoutParams();
            if(this.o0) {
                if(appBarLayout$LayoutParams0.getScrollFlags() == 0) {
                    appBarLayout$LayoutParams0.setScrollFlags(53);
                }
            }
            else if(appBarLayout$LayoutParams0.getScrollFlags() == 53) {
                appBarLayout$LayoutParams0.setScrollFlags(0);
            }
        }
    }

    public boolean removeCollapseAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter0) {
        return this.g0.c.remove(animatorListenerAdapter0);
    }

    public boolean removeExpandAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter0) {
        return this.g0.b.remove(animatorListenerAdapter0);
    }

    public boolean removeOnLoadAnimationCallback(@NonNull OnLoadAnimationCallback searchBar$OnLoadAnimationCallback0) {
        return this.g0.a.remove(searchBar$OnLoadAnimationCallback0);
    }

    public void setCenterView(@Nullable View view0) {
        View view1 = this.k0;
        if(view1 != null) {
            this.removeView(view1);
            this.k0 = null;
        }
        if(view0 != null) {
            this.addView(view0);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z) {
        this.o0 = z;
        this.r();
    }

    @Override  // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeDrawable materialShapeDrawable0 = this.p0;
        if(materialShapeDrawable0 != null) {
            materialShapeDrawable0.setElevation(f);
        }
    }

    public void setHint(@StringRes int v) {
        this.d0.setHint(v);
    }

    public void setHint(@Nullable CharSequence charSequence0) {
        this.d0.setHint(charSequence0);
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable0) {
        if(this.i0 && drawable0 != null) {
            int v = this.l0 == null ? MaterialColors.getColor(this, (drawable0 == this.h0 ? attr.colorOnSurfaceVariant : attr.colorOnSurface)) : ((int)this.l0);
            drawable0 = DrawableCompat.wrap(drawable0.mutate());
            DrawableCompat.setTint(drawable0, v);
        }
        super.setNavigationIcon(drawable0);
    }

    private void setNavigationIconDecorative(boolean z) {
        ImageButton imageButton0 = ToolbarUtils.getNavigationIconButton(this);
        if(imageButton0 == null) {
            return;
        }
        imageButton0.setClickable(!z);
        imageButton0.setFocusable(!z);
        Drawable drawable0 = imageButton0.getBackground();
        if(drawable0 != null) {
            this.m0 = drawable0;
        }
        imageButton0.setBackgroundDrawable((z ? null : this.m0));
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener view$OnClickListener0) {
        if(this.j0) {
            return;
        }
        super.setNavigationOnClickListener(view$OnClickListener0);
        this.setNavigationIconDecorative(view$OnClickListener0 == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z) {
        this.g0.h = z;
    }

    public void setStrokeColor(@ColorInt int v) {
        if(this.getStrokeColor() != v) {
            ColorStateList colorStateList0 = ColorStateList.valueOf(v);
            this.p0.setStrokeColor(colorStateList0);
        }
    }

    public void setStrokeWidth(@Dimension float f) {
        if(this.getStrokeWidth() != f) {
            this.p0.setStrokeWidth(f);
        }
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence0) {
    }

    public void setText(@StringRes int v) {
        this.d0.setText(v);
    }

    public void setText(@Nullable CharSequence charSequence0) {
        this.d0.setText(charSequence0);
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence0) {
    }

    public void startOnLoadAnimation() {
        this.post(new androidx.activity.h(this, 12));
    }

    public void stopOnLoadAnimation() {
        h h0 = this.g0;
        AnimatorSet animatorSet0 = h0.d;
        if(animatorSet0 != null) {
            animatorSet0.end();
        }
        AnimatorSet animatorSet1 = h0.e;
        if(animatorSet1 != null) {
            animatorSet1.end();
        }
        View view0 = this.getCenterView();
        if(view0 instanceof AnimatableView) {
            ((AnimatableView)view0).stopAnimation();
        }
        if(view0 != null) {
            view0.setAlpha(0.0f);
        }
    }
}

