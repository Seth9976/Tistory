package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.R.attr;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.os.BuildCompat;
import androidx.core.widget.ListViewAutoScrollHelper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class s1 extends ListView {
    public static final int INVALID_POSITION = -1;
    public static final int NO_POSITION = -1;
    public final Rect a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public q1 g;
    public boolean h;
    public final boolean i;
    public boolean j;
    public ListViewAutoScrollHelper k;
    public a l;

    public s1(Context context0, boolean z) {
        super(context0, null, attr.dropDownListViewStyle);
        this.a = new Rect();
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.i = z;
        this.setCacheColorHint(0);
    }

    @Override  // android.widget.ListView
    public void dispatchDraw(Canvas canvas0) {
        Rect rect0 = this.a;
        if(!rect0.isEmpty()) {
            Drawable drawable0 = this.getSelector();
            if(drawable0 != null) {
                drawable0.setBounds(rect0);
                drawable0.draw(canvas0);
            }
        }
        super.dispatchDraw(canvas0);
    }

    @Override  // android.widget.AbsListView
    public void drawableStateChanged() {
        if(this.l != null) {
            return;
        }
        super.drawableStateChanged();
        q1 q10 = this.g;
        if(q10 != null) {
            q10.b = true;
        }
        Drawable drawable0 = this.getSelector();
        if(drawable0 != null && this.j && this.isPressed()) {
            drawable0.setState(this.getDrawableState());
        }
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public boolean hasFocus() {
        return this.i || super.hasFocus();
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.View
    public boolean hasWindowFocus() {
        return this.i || super.hasWindowFocus();
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.View
    public boolean isFocused() {
        return this.i || super.isFocused();
    }

    // 去混淆评级： 低(30)
    @Override  // android.view.View
    public boolean isInTouchMode() {
        return this.i && this.h || super.isInTouchMode();
    }

    public int lookForSelectablePosition(int v, boolean z) {
        ListAdapter listAdapter0 = this.getAdapter();
        if(listAdapter0 != null && !this.isInTouchMode()) {
            int v1 = listAdapter0.getCount();
            if(!this.getAdapter().areAllItemsEnabled()) {
                if(z) {
                    int v2;
                    for(v2 = Math.max(0, v); v2 < v1 && !listAdapter0.isEnabled(v2); ++v2) {
                    }
                    return v2 < 0 || v2 >= v1 ? -1 : v2;
                }
                for(v2 = Math.min(v, v1 - 1); v2 >= 0 && !listAdapter0.isEnabled(v2); --v2) {
                }
                return v2 < 0 || v2 >= v1 ? -1 : v2;
            }
            return v < 0 || v >= v1 ? -1 : v;
        }
        return -1;
    }

    public int measureHeightOfChildrenCompat(int v, int v1, int v2, int v3, int v4) {
        int v5 = this.getListPaddingTop();
        int v6 = this.getListPaddingBottom();
        int v7 = this.getDividerHeight();
        Drawable drawable0 = this.getDivider();
        ListAdapter listAdapter0 = this.getAdapter();
        if(listAdapter0 == null) {
            return v5 + v6;
        }
        int v8 = v5 + v6;
        if(v7 <= 0 || drawable0 == null) {
            v7 = 0;
        }
        int v9 = listAdapter0.getCount();
        int v11 = 0;
        int v12 = 0;
        View view0 = null;
        for(int v10 = 0; v10 < v9; ++v10) {
            int v13 = listAdapter0.getItemViewType(v10);
            if(v13 != v11) {
                view0 = null;
                v11 = v13;
            }
            view0 = listAdapter0.getView(v10, view0, this);
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
            if(viewGroup$LayoutParams0 == null) {
                viewGroup$LayoutParams0 = this.generateDefaultLayoutParams();
                view0.setLayoutParams(viewGroup$LayoutParams0);
            }
            view0.measure(v, (viewGroup$LayoutParams0.height <= 0 ? 0 : View.MeasureSpec.makeMeasureSpec(viewGroup$LayoutParams0.height, 0x40000000)));
            view0.forceLayout();
            if(v10 > 0) {
                v8 += v7;
            }
            v8 += view0.getMeasuredHeight();
            if(v8 >= v3) {
                return v4 < 0 || v10 <= v4 || v12 <= 0 || v8 == v3 ? v3 : v12;
            }
            if(v4 >= 0 && v10 >= v4) {
                v12 = v8;
            }
        }
        return v8;
    }

    @Override  // android.widget.ListView
    public void onDetachedFromWindow() {
        this.l = null;
        super.onDetachedFromWindow();
    }

    public boolean onForwardedEvent(MotionEvent motionEvent0, int v) {
        boolean z1;
        boolean z3;
        int v1 = motionEvent0.getActionMasked();
        boolean z = false;
        switch(v1) {
            case 1: {
                z1 = false;
                goto label_8;
            }
            case 2: {
                z1 = true;
            label_8:
                int v2 = motionEvent0.findPointerIndex(v);
                if(v2 >= 0) {
                    int v3 = (int)motionEvent0.getX(v2);
                    int v4 = (int)motionEvent0.getY(v2);
                    int v5 = this.pointToPosition(v3, v4);
                    if(v5 == -1) {
                        z = true;
                    }
                    else {
                        View view0 = this.getChildAt(v5 - this.getFirstVisiblePosition());
                        this.j = true;
                        n1.a(this, ((float)v3), ((float)v4));
                        if(!this.isPressed()) {
                            this.setPressed(true);
                        }
                        this.layoutChildren();
                        int v6 = this.f;
                        if(v6 != -1) {
                            View view1 = this.getChildAt(v6 - this.getFirstVisiblePosition());
                            if(view1 != null && view1 != view0 && view1.isPressed()) {
                                view1.setPressed(false);
                            }
                        }
                        this.f = v5;
                        n1.a(view0, ((float)v3) - ((float)view0.getLeft()), ((float)v4) - ((float)view0.getTop()));
                        if(!view0.isPressed()) {
                            view0.setPressed(true);
                        }
                        Drawable drawable0 = this.getSelector();
                        boolean z2 = drawable0 != null && v5 != -1;
                        if(z2) {
                            drawable0.setVisible(false, false);
                        }
                        int v7 = view0.getLeft();
                        int v8 = view0.getTop();
                        int v9 = view0.getRight();
                        int v10 = view0.getBottom();
                        Rect rect0 = this.a;
                        rect0.set(v7, v8, v9, v10);
                        rect0.left -= this.b;
                        rect0.top -= this.c;
                        rect0.right += this.d;
                        rect0.bottom += this.e;
                        if(BuildCompat.isAtLeastT()) {
                            z3 = p1.a(this);
                        }
                        else {
                            Field field0 = r1.a;
                            if(field0 == null) {
                                z3 = false;
                            }
                            else {
                                try {
                                    z3 = field0.getBoolean(this);
                                }
                                catch(IllegalAccessException illegalAccessException0) {
                                    illegalAccessException0.printStackTrace();
                                    z3 = false;
                                }
                            }
                        }
                        if(view0.isEnabled() != z3) {
                            if(BuildCompat.isAtLeastT()) {
                                p1.b(this, !z3);
                            }
                            else {
                                Field field1 = r1.a;
                                if(field1 != null) {
                                    try {
                                        field1.set(this, Boolean.valueOf(!z3));
                                    }
                                    catch(IllegalAccessException illegalAccessException1) {
                                        illegalAccessException1.printStackTrace();
                                    }
                                }
                            }
                            this.refreshDrawableState();
                        }
                        if(z2) {
                            float f = rect0.exactCenterX();
                            float f1 = rect0.exactCenterY();
                            drawable0.setVisible(this.getVisibility() == 0, false);
                            DrawableCompat.setHotspot(drawable0, f, f1);
                        }
                        Drawable drawable1 = this.getSelector();
                        if(drawable1 != null && v5 != -1) {
                            DrawableCompat.setHotspot(drawable1, ((float)v3), ((float)v4));
                        }
                        q1 q10 = this.g;
                        if(q10 != null) {
                            q10.b = false;
                        }
                        this.refreshDrawableState();
                        if(v1 == 1) {
                            this.performItemClick(view0, v5, this.getItemIdAtPosition(v5));
                        }
                        z1 = true;
                    }
                }
                else {
                    z1 = false;
                }
                break;
            }
            case 3: {
                z1 = false;
                break;
            }
            default: {
                z1 = true;
            }
        }
        if(!z1 || z) {
            this.j = false;
            this.setPressed(false);
            this.drawableStateChanged();
            View view2 = this.getChildAt(this.f - this.getFirstVisiblePosition());
            if(view2 != null) {
                view2.setPressed(false);
            }
        }
        if(z1) {
            if(this.k == null) {
                this.k = new ListViewAutoScrollHelper(this);
            }
            this.k.setEnabled(true);
            this.k.onTouch(this, motionEvent0);
            return true;
        }
        ListViewAutoScrollHelper listViewAutoScrollHelper0 = this.k;
        if(listViewAutoScrollHelper0 != null) {
            listViewAutoScrollHelper0.setEnabled(false);
        }
        return false;
    }

    @Override  // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent0) {
        int v = Build.VERSION.SDK_INT;
        int v1 = motionEvent0.getActionMasked();
        if(v1 == 10 && this.l == null) {
            a a0 = new a(this, 1);
            this.l = a0;
            this.post(a0);
        }
        boolean z = super.onHoverEvent(motionEvent0);
        if(v1 != 7 && v1 != 9) {
            this.setSelection(-1);
            return z;
        }
        int v2 = this.pointToPosition(((int)motionEvent0.getX()), ((int)motionEvent0.getY()));
        if(v2 != -1 && v2 != this.getSelectedItemPosition()) {
            View view0 = this.getChildAt(v2 - this.getFirstVisiblePosition());
            if(view0.isEnabled()) {
                this.requestFocus();
                if(v < 30 || !o1.d) {
                    this.setSelectionFromTop(v2, view0.getTop() - this.getTop());
                }
                else {
                    try {
                        o1.a.invoke(this, v2, view0, Boolean.FALSE, -1, -1);
                        o1.b.invoke(this, v2);
                        o1.c.invoke(this, v2);
                    }
                    catch(IllegalAccessException illegalAccessException0) {
                        illegalAccessException0.printStackTrace();
                    }
                    catch(InvocationTargetException invocationTargetException0) {
                        invocationTargetException0.printStackTrace();
                    }
                }
            }
            Drawable drawable0 = this.getSelector();
            if(drawable0 != null && this.j && this.isPressed()) {
                drawable0.setState(this.getDrawableState());
            }
        }
        return z;
    }

    @Override  // android.widget.AbsListView
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        if(motionEvent0.getAction() == 0) {
            this.f = this.pointToPosition(((int)motionEvent0.getX()), ((int)motionEvent0.getY()));
        }
        a a0 = this.l;
        if(a0 != null) {
            ((s1)a0.b).l = null;
            ((s1)a0.b).removeCallbacks(a0);
        }
        return super.onTouchEvent(motionEvent0);
    }

    public void setListSelectionHidden(boolean z) {
        this.h = z;
    }

    @Override  // android.widget.AbsListView
    public void setSelector(Drawable drawable0) {
        q1 q10;
        if(drawable0 == null) {
            q10 = null;
        }
        else {
            q10 = new q1(drawable0);  // 初始化器: Landroidx/appcompat/graphics/drawable/DrawableWrapperCompat;-><init>(Landroid/graphics/drawable/Drawable;)V
            q10.b = true;
        }
        this.g = q10;
        super.setSelector(q10);
        Rect rect0 = new Rect();
        if(drawable0 != null) {
            drawable0.getPadding(rect0);
        }
        this.b = rect0.left;
        this.c = rect0.top;
        this.d = rect0.right;
        this.e = rect0.bottom;
    }
}

