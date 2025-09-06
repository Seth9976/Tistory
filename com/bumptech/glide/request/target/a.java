package com.bumptech.glide.request.target;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class a implements ViewTreeObserver.OnPreDrawListener {
    public final int a;
    public final WeakReference b;

    public a(b b0) {
        this.a = 0;
        super();
        this.b = new WeakReference(b0);
    }

    public a(d d0) {
        this.a = 1;
        super();
        this.b = new WeakReference(d0);
    }

    @Override  // android.view.ViewTreeObserver$OnPreDrawListener
    public final boolean onPreDraw() {
        if(this.a != 0) {
            if(Log.isLoggable("ViewTarget", 2)) {
                Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
            }
            d d0 = (d)this.b.get();
            if(d0 != null) {
                ArrayList arrayList0 = d0.b;
                if(!arrayList0.isEmpty()) {
                    View view0 = d0.a;
                    int v = view0.getPaddingLeft();
                    int v1 = view0.getPaddingRight();
                    ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
                    int v2 = 0;
                    int v3 = viewGroup$LayoutParams0 == null ? 0 : viewGroup$LayoutParams0.width;
                    int v4 = d0.a(view0.getWidth(), v3, v1 + v);
                    int v5 = view0.getPaddingTop();
                    int v6 = view0.getPaddingBottom();
                    ViewGroup.LayoutParams viewGroup$LayoutParams1 = view0.getLayoutParams();
                    if(viewGroup$LayoutParams1 != null) {
                        v2 = viewGroup$LayoutParams1.height;
                    }
                    int v7 = d0.a(view0.getHeight(), v2, v6 + v5);
                    if((v4 > 0 || v4 == 0x80000000) && (v7 > 0 || v7 == 0x80000000)) {
                        for(Object object0: new ArrayList(arrayList0)) {
                            ((SizeReadyCallback)object0).onSizeReady(v4, v7);
                        }
                        ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
                        if(viewTreeObserver0.isAlive()) {
                            viewTreeObserver0.removeOnPreDrawListener(d0.d);
                        }
                        d0.d = null;
                        arrayList0.clear();
                    }
                }
            }
            return true;
        }
        if(Log.isLoggable("CustomViewTarget", 2)) {
            Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
        }
        b b0 = (b)this.b.get();
        if(b0 != null) {
            ArrayList arrayList1 = b0.b;
            if(!arrayList1.isEmpty()) {
                View view1 = b0.a;
                int v8 = view1.getPaddingLeft();
                int v9 = view1.getPaddingRight();
                ViewGroup.LayoutParams viewGroup$LayoutParams2 = view1.getLayoutParams();
                int v10 = 0;
                int v11 = viewGroup$LayoutParams2 == null ? 0 : viewGroup$LayoutParams2.width;
                int v12 = b0.a(view1.getWidth(), v11, v9 + v8);
                int v13 = view1.getPaddingTop();
                int v14 = view1.getPaddingBottom();
                ViewGroup.LayoutParams viewGroup$LayoutParams3 = view1.getLayoutParams();
                if(viewGroup$LayoutParams3 != null) {
                    v10 = viewGroup$LayoutParams3.height;
                }
                int v15 = b0.a(view1.getHeight(), v10, v14 + v13);
                if((v12 > 0 || v12 == 0x80000000) && (v15 > 0 || v15 == 0x80000000)) {
                    for(Object object1: new ArrayList(arrayList1)) {
                        ((SizeReadyCallback)object1).onSizeReady(v12, v15);
                    }
                    ViewTreeObserver viewTreeObserver1 = view1.getViewTreeObserver();
                    if(viewTreeObserver1.isAlive()) {
                        viewTreeObserver1.removeOnPreDrawListener(b0.d);
                    }
                    b0.d = null;
                    arrayList1.clear();
                }
            }
        }
        return true;
    }
}

