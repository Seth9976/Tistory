package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.util.Pair;
import androidx.core.view.ViewCompat;
import c4.d;
import com.google.android.material.R.attr;
import com.google.android.material.R.id;
import com.google.android.material.internal.ViewUtils;
import java.util.Calendar;

final class MaterialCalendarGridView extends GridView {
    public final Calendar a;
    public final boolean b;

    public MaterialCalendarGridView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public MaterialCalendarGridView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = i0.g(null);
        if(MaterialDatePicker.k(this.getContext(), 0x101020D)) {
            this.setNextFocusLeftId(id.cancel_button);
            this.setNextFocusRightId(id.confirm_button);
        }
        this.b = MaterialDatePicker.k(this.getContext(), attr.nestedScrollable);
        ViewCompat.setAccessibilityDelegate(this, new d(3));
    }

    public final z a() {
        return (z)super.getAdapter();
    }

    public final View b(int v) {
        return this.getChildAt(v - this.getFirstVisiblePosition());
    }

    @Override  // android.widget.GridView
    public final Adapter getAdapter() {
        return (z)super.getAdapter();
    }

    @Override  // android.widget.GridView
    public final ListAdapter getAdapter() {
        return (z)super.getAdapter();
    }

    @Override  // android.widget.AbsListView
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((z)super.getAdapter()).notifyDataSetChanged();
    }

    @Override  // android.view.View
    public final void onDraw(Canvas canvas0) {
        int v20;
        int v19;
        int v10;
        int v9;
        int v6;
        int v5;
        int v4;
        super.onDraw(canvas0);
        z z0 = (z)super.getAdapter();
        c c0 = z0.d;
        int v = Math.max(z0.a(), this.getFirstVisiblePosition());
        int v1 = Math.min(z0.c(), this.getLastVisiblePosition());
        Long long0 = z0.b(v);
        Long long1 = z0.b(v1);
        for(Object object0: z0.b.getSelectedRanges()) {
            Pair pair0 = (Pair)object0;
            Object object1 = pair0.first;
            if(object1 != null && pair0.second != null) {
                long v2 = (long)(((Long)object1));
                long v3 = (long)(((Long)pair0.second));
                if(long0 != null && long1 != null && ((long)(((Long)object1))) <= ((long)long1) && ((long)(((Long)pair0.second))) >= ((long)long0)) {
                    boolean z1 = ViewUtils.isLayoutRtl(this);
                    Calendar calendar0 = this.a;
                    y y0 = z0.a;
                    if(Long.compare(v2, ((long)long0)) < 0) {
                        if(v % y0.d == 0) {
                            v4 = 0;
                        }
                        else {
                            v4 = z1 ? this.b(v - 1).getLeft() : this.b(v - 1).getRight();
                        }
                        v5 = v4;
                        v6 = v;
                    }
                    else {
                        calendar0.setTimeInMillis(v2);
                        int v7 = calendar0.get(5);
                        v6 = z0.a() + (v7 - 1);
                        View view0 = this.b(v6);
                        int v8 = view0.getLeft();
                        v5 = view0.getWidth() / 2 + v8;
                    }
                    if(v3 > ((long)long1)) {
                        if((v1 + 1) % y0.d == 0) {
                            v9 = this.getWidth();
                        }
                        else {
                            v9 = z1 ? this.b(v1).getLeft() : this.b(v1).getRight();
                        }
                        v10 = v1;
                    }
                    else {
                        calendar0.setTimeInMillis(v3);
                        int v11 = calendar0.get(5);
                        v10 = z0.a() + (v11 - 1);
                        View view1 = this.b(v10);
                        int v12 = view1.getLeft();
                        v9 = view1.getWidth() / 2 + v12;
                    }
                    int v13 = (int)z0.getItemId(v6);
                    int v14 = (int)z0.getItemId(v10);
                    while(v13 <= v14) {
                        int v15 = this.getNumColumns() * v13;
                        int v16 = this.getNumColumns() + v15 - 1;
                        View view2 = this.b(v15);
                        int v17 = view2.getTop() + c0.a.a.top;
                        int v18 = view2.getBottom() - c0.a.a.bottom;
                        if(z1) {
                            v19 = v10 <= v16 ? v9 : 0;
                            v20 = v15 <= v6 ? v5 : this.getWidth();
                        }
                        else {
                            v19 = v15 <= v6 ? v5 : 0;
                            v20 = v10 > v16 ? this.getWidth() : v9;
                        }
                        canvas0.drawRect(((float)v19), ((float)v17), ((float)v20), ((float)v18), c0.h);
                        ++v13;
                    }
                }
            }
        }
    }

    @Override  // android.widget.GridView
    public final void onFocusChanged(boolean z, int v, Rect rect0) {
        if(z) {
            switch(v) {
                case 33: {
                    this.setSelection(((z)super.getAdapter()).c());
                    return;
                }
                case 130: {
                    this.setSelection(((z)super.getAdapter()).a());
                    return;
                }
                default: {
                    super.onFocusChanged(true, v, rect0);
                    return;
                }
            }
        }
        super.onFocusChanged(false, v, rect0);
    }

    @Override  // android.widget.GridView
    public final boolean onKeyDown(int v, KeyEvent keyEvent0) {
        if(!super.onKeyDown(v, keyEvent0)) {
            return false;
        }
        if(this.getSelectedItemPosition() != -1 && this.getSelectedItemPosition() < ((z)super.getAdapter()).a()) {
            if(19 == v) {
                this.setSelection(((z)super.getAdapter()).a());
                return true;
            }
            return false;
        }
        return true;
    }

    @Override  // android.widget.GridView
    public final void onMeasure(int v, int v1) {
        if(this.b) {
            super.onMeasure(v, View.MeasureSpec.makeMeasureSpec(0xFFFFFF, 0x80000000));
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
            viewGroup$LayoutParams0.height = this.getMeasuredHeight();
            return;
        }
        super.onMeasure(v, v1);
    }

    @Override  // android.widget.GridView
    public final void setAdapter(Adapter adapter0) {
        this.setAdapter(((ListAdapter)adapter0));
    }

    @Override  // android.widget.GridView
    public final void setAdapter(ListAdapter listAdapter0) {
        if(!(listAdapter0 instanceof z)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), z.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter0);
    }

    @Override  // android.widget.GridView
    public final void setSelection(int v) {
        if(v < ((z)super.getAdapter()).a()) {
            super.setSelection(((z)super.getAdapter()).a());
            return;
        }
        super.setSelection(v);
    }
}

