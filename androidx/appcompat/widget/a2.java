package androidx.appcompat.widget;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import com.futuremind.fastscroll.FastScroller;
import com.futuremind.fastscroll.Utils;
import com.futuremind.fastscroll.viewprovider.ScrollerViewProvider;

public final class a2 implements View.OnTouchListener {
    public final int a;
    public final Object b;

    public a2(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        int v1;
        int v;
        float f;
        if(this.a != 0) {
            FastScroller fastScroller0 = (FastScroller)this.b;
            fastScroller0.requestDisallowInterceptTouchEvent(true);
            if(motionEvent0.getAction() == 0) {
                ScrollerViewProvider scrollerViewProvider0 = fastScroller0.m;
                if(scrollerViewProvider0 != null) {
                    scrollerViewProvider0.onHandleGrabbed();
                }
                fastScroller0.l = true;
                fastScroller0.o = motionEvent0.getRawX();
                fastScroller0.p = motionEvent0.getRawY();
                fastScroller0.r = motionEvent0.getX();
                fastScroller0.q = motionEvent0.getY();
                return true;
            }
            switch(motionEvent0.getAction()) {
                case 1: {
                    fastScroller0.l = false;
                    ScrollerViewProvider scrollerViewProvider1 = fastScroller0.m;
                    if(scrollerViewProvider1 != null) {
                        scrollerViewProvider1.onHandleReleased();
                    }
                    fastScroller0.o = 0.0f;
                    fastScroller0.p = 0.0f;
                    fastScroller0.r = 0.0f;
                    fastScroller0.q = 0.0f;
                    return true;
                }
                case 2: {
                    fastScroller0.l = true;
                    if(fastScroller0.isVertical()) {
                        f = motionEvent0.getRawY() - (Utils.getViewRawY(fastScroller0.d) + fastScroller0.q);
                        v = fastScroller0.getHeight();
                        v1 = fastScroller0.d.getHeight();
                    }
                    else {
                        f = motionEvent0.getRawX() - (Utils.getViewRawX(fastScroller0.d) + fastScroller0.r);
                        v = fastScroller0.getWidth();
                        v1 = fastScroller0.d.getWidth();
                    }
                    float f1 = f / ((float)(v - v1));
                    float f2 = motionEvent0.getRawX() - fastScroller0.o;
                    float f3 = motionEvent0.getRawY() - fastScroller0.p;
                    if(!fastScroller0.isVertical()) {
                        if(Math.abs(f2 - ((float)(fastScroller0.d.getWidth() / 2))) > 2.0f) {
                            fastScroller0.setScrollerPosition(f1);
                            fastScroller0.setRecyclerViewPosition(f1);
                            return true;
                        }
                    }
                    else if(Math.abs(f3 - ((float)(fastScroller0.d.getHeight() / 2))) > 2.0f) {
                        fastScroller0.setScrollerPosition(f1);
                        fastScroller0.setRecyclerViewPosition(f1);
                        return true;
                    }
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        int v2 = motionEvent0.getAction();
        int v3 = (int)motionEvent0.getX();
        int v4 = (int)motionEvent0.getY();
        ListPopupWindow listPopupWindow0 = (ListPopupWindow)this.b;
        if(v2 == 0 && (listPopupWindow0.F != null && listPopupWindow0.F.isShowing() && v3 >= 0 && v3 < listPopupWindow0.F.getWidth() && v4 >= 0 && v4 < listPopupWindow0.F.getHeight())) {
            listPopupWindow0.B.postDelayed(listPopupWindow0.w, 0xFAL);
            return false;
        }
        if(v2 == 1) {
            listPopupWindow0.B.removeCallbacks(listPopupWindow0.w);
        }
        return false;
    }
}

