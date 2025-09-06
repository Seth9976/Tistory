package com.futuremind.fastscroll;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.a2;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.futuremind.fastscroll.viewprovider.DefaultScrollerViewProvider;
import com.futuremind.fastscroll.viewprovider.ScrollerViewProvider;
import com.kakao.kphotopicker.R.attr;
import com.kakao.kphotopicker.R.styleable;
import k6.a;

public class FastScroller extends LinearLayout {
    public final RecyclerViewScrollListener a;
    public RecyclerView b;
    public View c;
    public View d;
    public TextView e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public ScrollerViewProvider m;
    public SectionTitleProvider n;
    public float o;
    public float p;
    public float q;
    public float r;
    public int s;
    public int t;
    public int u;
    public static final int v;

    public FastScroller(Context context0) {
        this(context0, null);
    }

    public FastScroller(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public FastScroller(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = new RecyclerViewScrollListener(this);
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0.0f;
        this.r = 0.0f;
        this.s = -1;
        this.setClipChildren(false);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.fastscroll__fastScroller, attr.fastscroll__style, 0);
        try {
            this.h = typedArray0.getColor(styleable.fastscroll__fastScroller_fastscroll__bubbleColor, -1);
            this.g = typedArray0.getColor(styleable.fastscroll__fastScroller_fastscroll__handleColor, -1);
            this.i = typedArray0.getResourceId(styleable.fastscroll__fastScroller_fastscroll__bubbleTextAppearance, -1);
        }
        finally {
            typedArray0.recycle();
        }
        this.k = this.getVisibility();
        this.setViewProvider(new DefaultScrollerViewProvider());
    }

    public void addScrollerListener(ScrollerListener recyclerViewScrollListener$ScrollerListener0) {
        this.a.addScrollerListener(recyclerViewScrollListener$ScrollerListener0);
    }

    public final void b() {
        if(this.b.getAdapter() != null && this.b.getAdapter().getItemCount() != 0 && this.b.getChildAt(0) != null) {
            if(this.isVertical()) {
                int v = this.b.getChildAt(0).getHeight();
                if(this.b.getAdapter().getItemCount() * v > this.b.getHeight()) {
                    goto label_7;
                }
            }
            else {
                int v1 = this.b.getChildAt(0).getWidth();
                if(this.b.getAdapter().getItemCount() * v1 > this.b.getWidth()) {
                label_7:
                    if(this.k == 0) {
                        super.setVisibility(0);
                        return;
                    }
                }
            }
        }
        super.setVisibility(4);
    }

    public ScrollerViewProvider getViewProvider() {
        return this.m;
    }

    public boolean isVertical() {
        return this.j == 1;
    }

    @Override  // android.widget.LinearLayout
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        this.d.setOnTouchListener(new a2(this, 1));
        this.f = this.m.getBubbleOffset();
        int v4 = this.h;
        if(v4 != -1) {
            TextView textView0 = this.e;
            Drawable drawable0 = DrawableCompat.wrap(textView0.getBackground());
            if(drawable0 != null) {
                DrawableCompat.setTint(drawable0.mutate(), v4);
                Utils.setBackground(textView0, drawable0);
            }
        }
        int v5 = this.g;
        if(v5 != -1) {
            View view0 = this.d;
            Drawable drawable1 = DrawableCompat.wrap(view0.getBackground());
            if(drawable1 != null) {
                DrawableCompat.setTint(drawable1.mutate(), v5);
                Utils.setBackground(view0, drawable1);
            }
        }
        int v6 = this.i;
        if(v6 != -1) {
            TextViewCompat.setTextAppearance(this.e, v6);
        }
        if(!this.isInEditMode()) {
            this.a.a(this.b);
        }
    }

    public void setBubbleColor(int v) {
        this.h = v;
        this.invalidate();
    }

    public void setBubbleTextAppearance(int v) {
        this.i = v;
        this.invalidate();
    }

    public void setHandleColor(int v) {
        this.g = v;
        this.invalidate();
    }

    public void setItemHeightAndColCount(int v, int v1) {
        this.t = v;
        this.u = v1;
    }

    @Override  // android.widget.LinearLayout
    public void setOrientation(int v) {
        this.j = v;
        super.setOrientation((v == 0 ? 1 : 0));
    }

    public void setRecyclerView(RecyclerView recyclerView0) {
        this.b = recyclerView0;
        if(recyclerView0.getAdapter() instanceof SectionTitleProvider) {
            this.n = (SectionTitleProvider)recyclerView0.getAdapter();
        }
        recyclerView0.addOnScrollListener(this.a);
        this.b();
        recyclerView0.setOnHierarchyChangeListener(new a(this, 0));
    }

    private void setRecyclerViewPosition(float f) {
        if(this.b != null && this.b.getAdapter() != null) {
            int v = this.b.getAdapter().getItemCount();
            int v1 = (int)Utils.getValueInRange(0.0f, v - 1, ((int)(((float)v) * f)));
            if(this.t <= 0 || this.u <= 0 || !this.isVertical()) {
                this.s = v1;
                this.b.scrollToPosition(v1);
            }
            else if(this.s / this.u != v1 / this.u) {
                this.s = v1;
                int v2 = this.b.computeVerticalScrollRange();
                int v3 = this.b.computeVerticalScrollOffset();
                int v4 = ((int)Utils.getValueInRange(0.0f, v2, ((int)(f * ((float)(v2 - this.b.getHeight())))))) - v3;
                if(v4 != 0) {
                    if(this.b.getLayoutManager() instanceof LinearLayoutManager) {
                        int v5 = this.s / this.u;
                        int v6 = v5 == 0 ? 0 : v3 + v4 - v5 * this.t;
                        if(v6 > 0) {
                            v6 = Math.min(v6, ((int)(Math.random() * ((double)this.t))));
                        }
                        else if(v6 < 0) {
                            v6 = Math.max(v6, ((int)(Math.random() * ((double)(-this.t)))));
                        }
                        ((LinearLayoutManager)this.b.getLayoutManager()).scrollToPositionWithOffset(this.s, v6);
                    }
                    else {
                        this.b.scrollToPosition(this.s);
                    }
                }
            }
            SectionTitleProvider sectionTitleProvider0 = this.n;
            if(sectionTitleProvider0 != null && this.e != null) {
                String s = sectionTitleProvider0.getSectionTitle(v1);
                this.e.setText(s);
                if(s != null && !s.isEmpty()) {
                    this.e.setVisibility(0);
                    return;
                }
                this.e.setVisibility(8);
            }
        }
    }

    public void setScrollerPosition(float f) {
        if(this.isVertical()) {
            this.c.setY(Utils.getValueInRange(0.0f, this.getHeight() - this.c.getHeight(), ((float)(this.getHeight() - this.d.getHeight())) * f + ((float)this.f)));
            this.d.setY(Utils.getValueInRange(0.0f, this.getHeight() - this.d.getHeight(), f * ((float)(this.getHeight() - this.d.getHeight()))));
            return;
        }
        this.c.setX(Utils.getValueInRange(0.0f, this.getWidth() - this.c.getWidth(), ((float)(this.getWidth() - this.d.getWidth())) * f + ((float)this.f)));
        this.d.setX(Utils.getValueInRange(0.0f, this.getWidth() - this.d.getWidth(), f * ((float)(this.getWidth() - this.d.getWidth()))));
    }

    public void setViewProvider(ScrollerViewProvider scrollerViewProvider0) {
        this.removeAllViews();
        this.m = scrollerViewProvider0;
        scrollerViewProvider0.setFastScroller(this);
        this.c = scrollerViewProvider0.provideBubbleView(this);
        this.d = scrollerViewProvider0.provideHandleView(this);
        this.e = scrollerViewProvider0.provideBubbleTextView();
        this.addView(this.c);
        this.addView(this.d);
    }

    @Override  // android.view.View
    public void setVisibility(int v) {
        this.k = v;
        this.b();
    }
}

