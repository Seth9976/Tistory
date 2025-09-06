package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.app.ActionBar.Tab;
import androidx.appcompat.view.ActionBarPolicy;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    public class VisibilityAnimListener extends AnimatorListenerAdapter {
        public boolean a;
        public int b;
        public final ScrollingTabContainerView c;

        public VisibilityAnimListener() {
            this.a = false;
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationCancel(Animator animator0) {
            this.a = true;
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationEnd(Animator animator0) {
            if(this.a) {
                return;
            }
            ScrollingTabContainerView.this.mVisibilityAnim = null;
            ScrollingTabContainerView.this.setVisibility(this.b);
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationStart(Animator animator0) {
            ScrollingTabContainerView.this.setVisibility(0);
            this.a = false;
        }

        public VisibilityAnimListener withFinalVisibility(ViewPropertyAnimator viewPropertyAnimator0, int v) {
            this.b = v;
            ScrollingTabContainerView.this.mVisibilityAnim = viewPropertyAnimator0;
            return this;
        }
    }

    public h a;
    public k2 b;
    public final LinearLayoutCompat c;
    public AppCompatSpinner d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public static final DecelerateInterpolator j;
    protected final VisibilityAnimListener mVisAnimListener;
    protected ViewPropertyAnimator mVisibilityAnim;

    static {
        ScrollingTabContainerView.j = new DecelerateInterpolator();
    }

    public ScrollingTabContainerView(@NonNull Context context0) {
        super(context0);
        this.mVisAnimListener = new VisibilityAnimListener(this);
        this.setHorizontalScrollBarEnabled(false);
        ActionBarPolicy actionBarPolicy0 = ActionBarPolicy.get(context0);
        this.setContentHeight(actionBarPolicy0.getTabContainerHeight());
        this.g = actionBarPolicy0.getStackedTabMaxWidth();
        LinearLayoutCompat linearLayoutCompat0 = new LinearLayoutCompat(this.getContext(), null, attr.actionBarTabBarStyle);
        linearLayoutCompat0.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat0.setGravity(17);
        linearLayoutCompat0.setLayoutParams(new LayoutParams(-2, -1));
        this.c = linearLayoutCompat0;
        this.addView(linearLayoutCompat0, new ViewGroup.LayoutParams(-2, -1));
    }

    public final l2 a(Tab actionBar$Tab0, boolean z) {
        l2 l20 = new l2(this, this.getContext(), actionBar$Tab0, z);
        if(z) {
            l20.setBackgroundDrawable(null);
            l20.setLayoutParams(new AbsListView.LayoutParams(-1, this.h));
            return l20;
        }
        l20.setFocusable(true);
        if(this.b == null) {
            this.b = new k2(this);
        }
        l20.setOnClickListener(this.b);
        return l20;
    }

    public void addTab(Tab actionBar$Tab0, int v, boolean z) {
        l2 l20 = this.a(actionBar$Tab0, false);
        LayoutParams linearLayoutCompat$LayoutParams0 = new LayoutParams(0, -1, 1.0f);
        this.c.addView(l20, v, linearLayoutCompat$LayoutParams0);
        AppCompatSpinner appCompatSpinner0 = this.d;
        if(appCompatSpinner0 != null) {
            ((j2)appCompatSpinner0.getAdapter()).notifyDataSetChanged();
        }
        if(z) {
            l20.setSelected(true);
        }
        if(this.e) {
            this.requestLayout();
        }
    }

    public void addTab(Tab actionBar$Tab0, boolean z) {
        l2 l20 = this.a(actionBar$Tab0, false);
        LayoutParams linearLayoutCompat$LayoutParams0 = new LayoutParams(0, -1, 1.0f);
        this.c.addView(l20, linearLayoutCompat$LayoutParams0);
        AppCompatSpinner appCompatSpinner0 = this.d;
        if(appCompatSpinner0 != null) {
            ((j2)appCompatSpinner0.getAdapter()).notifyDataSetChanged();
        }
        if(z) {
            l20.setSelected(true);
        }
        if(this.e) {
            this.requestLayout();
        }
    }

    public void animateToTab(int v) {
        View view0 = this.c.getChildAt(v);
        h h0 = this.a;
        if(h0 != null) {
            this.removeCallbacks(h0);
        }
        h h1 = new h(1, this, view0);
        this.a = h1;
        this.post(h1);
    }

    public void animateToVisibility(int v) {
        ViewPropertyAnimator viewPropertyAnimator0 = this.mVisibilityAnim;
        if(viewPropertyAnimator0 != null) {
            viewPropertyAnimator0.cancel();
        }
        DecelerateInterpolator decelerateInterpolator0 = ScrollingTabContainerView.j;
        if(v == 0) {
            if(this.getVisibility() != 0) {
                this.setAlpha(0.0f);
            }
            ViewPropertyAnimator viewPropertyAnimator1 = this.animate().alpha(1.0f);
            viewPropertyAnimator1.setDuration(200L);
            viewPropertyAnimator1.setInterpolator(decelerateInterpolator0);
            viewPropertyAnimator1.setListener(this.mVisAnimListener.withFinalVisibility(viewPropertyAnimator1, 0));
            viewPropertyAnimator1.start();
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.animate().alpha(0.0f);
        viewPropertyAnimator2.setDuration(200L);
        viewPropertyAnimator2.setInterpolator(decelerateInterpolator0);
        viewPropertyAnimator2.setListener(this.mVisAnimListener.withFinalVisibility(viewPropertyAnimator2, v));
        viewPropertyAnimator2.start();
    }

    public final void b() {
        if(this.d == null || this.d.getParent() != this) {
            return;
        }
        this.removeView(this.d);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-2, -1);
        this.addView(this.c, viewGroup$LayoutParams0);
        this.setTabSelected(this.d.getSelectedItemPosition());
    }

    @Override  // android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h h0 = this.a;
        if(h0 != null) {
            this.post(h0);
        }
    }

    @Override  // android.view.View
    public void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        ActionBarPolicy actionBarPolicy0 = ActionBarPolicy.get(this.getContext());
        this.setContentHeight(actionBarPolicy0.getTabContainerHeight());
        this.g = actionBarPolicy0.getStackedTabMaxWidth();
    }

    @Override  // android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h h0 = this.a;
        if(h0 != null) {
            this.removeCallbacks(h0);
        }
    }

    @Override  // android.widget.AdapterView$OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView0, View view0, int v, long v1) {
        ((l2)view0).a.select();
    }

    @Override  // android.widget.HorizontalScrollView
    public void onMeasure(int v, int v1) {
        int v2 = View.MeasureSpec.getMode(v);
        this.setFillViewport(v2 == 0x40000000);
        LinearLayoutCompat linearLayoutCompat0 = this.c;
        int v3 = linearLayoutCompat0.getChildCount();
        if(v3 <= 1 || v2 != 0x80000000 && v2 != 0x40000000) {
            this.f = -1;
        }
        else {
            this.f = v3 > 2 ? ((int)(((float)View.MeasureSpec.getSize(v)) * 0.4f)) : View.MeasureSpec.getSize(v) / 2;
            this.f = Math.min(this.f, this.g);
        }
        int v4 = View.MeasureSpec.makeMeasureSpec(this.h, 0x40000000);
        if(v2 == 0x40000000 || !this.e) {
            this.b();
        }
        else {
            linearLayoutCompat0.measure(0, v4);
            if(linearLayoutCompat0.getMeasuredWidth() <= View.MeasureSpec.getSize(v)) {
                this.b();
            }
            else if(this.d == null || this.d.getParent() != this) {
                if(this.d == null) {
                    AppCompatSpinner appCompatSpinner0 = new AppCompatSpinner(this.getContext(), null, attr.actionDropDownStyle);
                    appCompatSpinner0.setLayoutParams(new LayoutParams(-2, -1));
                    appCompatSpinner0.setOnItemSelectedListener(this);
                    this.d = appCompatSpinner0;
                }
                this.removeView(linearLayoutCompat0);
                this.addView(this.d, new ViewGroup.LayoutParams(-2, -1));
                if(this.d.getAdapter() == null) {
                    this.d.setAdapter(new j2(this));
                }
                h h0 = this.a;
                if(h0 != null) {
                    this.removeCallbacks(h0);
                    this.a = null;
                }
                this.d.setSelection(this.i);
            }
        }
        int v5 = this.getMeasuredWidth();
        super.onMeasure(v, v4);
        if(v2 == 0x40000000 && v5 != this.getMeasuredWidth()) {
            this.setTabSelected(this.i);
        }
    }

    @Override  // android.widget.AdapterView$OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView0) {
    }

    public void removeAllTabs() {
        this.c.removeAllViews();
        AppCompatSpinner appCompatSpinner0 = this.d;
        if(appCompatSpinner0 != null) {
            ((j2)appCompatSpinner0.getAdapter()).notifyDataSetChanged();
        }
        if(this.e) {
            this.requestLayout();
        }
    }

    public void removeTabAt(int v) {
        this.c.removeViewAt(v);
        AppCompatSpinner appCompatSpinner0 = this.d;
        if(appCompatSpinner0 != null) {
            ((j2)appCompatSpinner0.getAdapter()).notifyDataSetChanged();
        }
        if(this.e) {
            this.requestLayout();
        }
    }

    public void setAllowCollapse(boolean z) {
        this.e = z;
    }

    public void setContentHeight(int v) {
        this.h = v;
        this.requestLayout();
    }

    public void setTabSelected(int v) {
        this.i = v;
        LinearLayoutCompat linearLayoutCompat0 = this.c;
        int v1 = linearLayoutCompat0.getChildCount();
        for(int v2 = 0; v2 < v1; ++v2) {
            boolean z = v2 == v;
            linearLayoutCompat0.getChildAt(v2).setSelected(z);
            if(z) {
                this.animateToTab(v);
            }
        }
        AppCompatSpinner appCompatSpinner0 = this.d;
        if(appCompatSpinner0 != null && v >= 0) {
            appCompatSpinner0.setSelection(v);
        }
    }

    public void updateTab(int v) {
        ((l2)this.c.getChildAt(v)).a();
        AppCompatSpinner appCompatSpinner0 = this.d;
        if(appCompatSpinner0 != null) {
            ((j2)appCompatSpinner0.getAdapter()).notifyDataSetChanged();
        }
        if(this.e) {
            this.requestLayout();
        }
    }
}

