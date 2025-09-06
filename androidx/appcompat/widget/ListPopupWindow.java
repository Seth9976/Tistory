package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent.DispatcherState;
import android.view.KeyEvent;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.styleable;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.core.view.ViewCompat;
import androidx.core.widget.PopupWindowCompat;
import java.lang.reflect.Method;

public class ListPopupWindow implements ShowableListMenu {
    public u1 A;
    public final Handler B;
    public final Rect C;
    public Rect D;
    public boolean E;
    public final PopupWindow F;
    public static final Method G = null;
    public static final Method H = null;
    public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;
    public static final int INPUT_METHOD_NEEDED = 1;
    public static final int INPUT_METHOD_NOT_NEEDED = 2;
    public static final int MATCH_PARENT = -1;
    public static final int POSITION_PROMPT_ABOVE = 0;
    public static final int POSITION_PROMPT_BELOW = 1;
    public static final int WRAP_CONTENT = -2;
    public final Context a;
    public ListAdapter b;
    public s1 c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public final int o;
    public View p;
    public int q;
    public y1 r;
    public View s;
    public Drawable t;
    public AdapterView.OnItemClickListener u;
    public AdapterView.OnItemSelectedListener v;
    public final u1 w;
    public final a2 x;
    public final z1 y;
    public final u1 z;

    static {
        Class class0 = PopupWindow.class;
        if(Build.VERSION.SDK_INT <= 28) {
            try {
                ListPopupWindow.G = class0.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            }
            catch(NoSuchMethodException unused_ex) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                ListPopupWindow.H = class0.getDeclaredMethod("setEpicenterBounds", Rect.class);
            }
            catch(NoSuchMethodException unused_ex) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public ListPopupWindow(@NonNull Context context0) {
        this(context0, null, attr.listPopupWindowStyle);
    }

    public ListPopupWindow(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.listPopupWindowStyle);
    }

    public ListPopupWindow(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v) {
        this(context0, attributeSet0, v, 0);
    }

    public ListPopupWindow(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v, @StyleRes int v1) {
        this.d = -2;
        this.e = -2;
        this.h = 1002;
        this.l = 0;
        this.m = false;
        this.n = false;
        this.o = 0x7FFFFFFF;
        this.q = 0;
        this.w = new u1(this, 2);
        this.x = new a2(this, 0);
        this.y = new z1(this);
        this.z = new u1(this, 1);
        this.C = new Rect();
        this.a = context0;
        this.B = new Handler(context0.getMainLooper());
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.ListPopupWindow, v, v1);
        this.f = typedArray0.getDimensionPixelOffset(styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int v2 = typedArray0.getDimensionPixelOffset(styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.g = v2;
        if(v2 != 0) {
            this.i = true;
        }
        typedArray0.recycle();
        AppCompatPopupWindow appCompatPopupWindow0 = new AppCompatPopupWindow(context0, attributeSet0, v, v1);  // 初始化器: Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
        appCompatPopupWindow0.a(context0, attributeSet0, v, v1);
        this.F = appCompatPopupWindow0;
        appCompatPopupWindow0.setInputMethodMode(1);
    }

    public s1 a(Context context0, boolean z) {
        return new s1(context0, z);
    }

    public void clearListSelection() {
        s1 s10 = this.c;
        if(s10 != null) {
            s10.setListSelectionHidden(true);
            s10.requestLayout();
        }
    }

    public View.OnTouchListener createDragToOpenListener(View view0) {
        return new i(this, view0, 2);
    }

    @Override  // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
        PopupWindow popupWindow0 = this.F;
        popupWindow0.dismiss();
        View view0 = this.p;
        if(view0 != null) {
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 instanceof ViewGroup) {
                ((ViewGroup)viewParent0).removeView(this.p);
            }
        }
        popupWindow0.setContentView(null);
        this.c = null;
        this.B.removeCallbacks(this.w);
    }

    @Nullable
    public View getAnchorView() {
        return this.s;
    }

    @StyleRes
    public int getAnimationStyle() {
        return this.F.getAnimationStyle();
    }

    @Nullable
    public Drawable getBackground() {
        return this.F.getBackground();
    }

    @Nullable
    public Rect getEpicenterBounds() {
        return this.D == null ? null : new Rect(this.D);
    }

    public int getHeight() {
        return this.d;
    }

    public int getHorizontalOffset() {
        return this.f;
    }

    public int getInputMethodMode() {
        return this.F.getInputMethodMode();
    }

    @Override  // androidx.appcompat.view.menu.ShowableListMenu
    @Nullable
    public ListView getListView() {
        return this.c;
    }

    public int getPromptPosition() {
        return this.q;
    }

    @Nullable
    public Object getSelectedItem() {
        return this.isShowing() ? this.c.getSelectedItem() : null;
    }

    public long getSelectedItemId() {
        return this.isShowing() ? this.c.getSelectedItemId() : 0x8000000000000000L;
    }

    public int getSelectedItemPosition() {
        return this.isShowing() ? this.c.getSelectedItemPosition() : -1;
    }

    @Nullable
    public View getSelectedView() {
        return this.isShowing() ? this.c.getSelectedView() : null;
    }

    public int getSoftInputMode() {
        return this.F.getSoftInputMode();
    }

    public int getVerticalOffset() {
        return this.i ? this.g : 0;
    }

    public int getWidth() {
        return this.e;
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public boolean isDropDownAlwaysVisible() {
        return this.m;
    }

    public boolean isInputMethodNotNeeded() {
        return this.F.getInputMethodMode() == 2;
    }

    public boolean isModal() {
        return this.E;
    }

    @Override  // androidx.appcompat.view.menu.ShowableListMenu
    public boolean isShowing() {
        return this.F.isShowing();
    }

    public boolean onKeyDown(int v, @NonNull KeyEvent keyEvent0) {
        int v3;
        int v2;
        if(this.isShowing() && v != 62 && (this.c.getSelectedItemPosition() >= 0 || v != 23 && v != 66)) {
            int v1 = this.c.getSelectedItemPosition();
            PopupWindow popupWindow0 = this.F;
            boolean z = popupWindow0.isAboveAnchor();
            ListAdapter listAdapter0 = this.b;
            if(listAdapter0 == null) {
                v2 = 0x7FFFFFFF;
                v3 = 0x80000000;
            }
            else {
                boolean z1 = listAdapter0.areAllItemsEnabled();
                v2 = z1 ? 0 : this.c.lookForSelectablePosition(0, true);
                v3 = z1 ? listAdapter0.getCount() - 1 : this.c.lookForSelectablePosition(listAdapter0.getCount() - 1, false);
            }
            if(!z && v == 19 && v1 <= v2 || z && v == 20 && v1 >= v3) {
                this.clearListSelection();
                popupWindow0.setInputMethodMode(1);
                this.show();
                return true;
            }
            this.c.setListSelectionHidden(false);
            if(this.c.onKeyDown(v, keyEvent0)) {
                popupWindow0.setInputMethodMode(2);
                this.c.requestFocusFromTouch();
                this.show();
                return v == 19 || v == 20 || v == 23 || v == 66;
            }
            return z || v != 20 ? z && v == 19 && v1 == v2 : v1 == v3;
        }
        return false;
    }

    public boolean onKeyPreIme(int v, @NonNull KeyEvent keyEvent0) {
        if(v == 4 && this.isShowing()) {
            View view0 = this.s;
            if(keyEvent0.getAction() == 0 && keyEvent0.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyEvent$DispatcherState0 = view0.getKeyDispatcherState();
                if(keyEvent$DispatcherState0 != null) {
                    keyEvent$DispatcherState0.startTracking(keyEvent0, this);
                }
                return true;
            }
            if(keyEvent0.getAction() == 1) {
                KeyEvent.DispatcherState keyEvent$DispatcherState1 = view0.getKeyDispatcherState();
                if(keyEvent$DispatcherState1 != null) {
                    keyEvent$DispatcherState1.handleUpEvent(keyEvent0);
                }
                if(keyEvent0.isTracking() && !keyEvent0.isCanceled()) {
                    this.dismiss();
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onKeyUp(int v, @NonNull KeyEvent keyEvent0) {
        if(this.isShowing() && this.c.getSelectedItemPosition() >= 0) {
            boolean z = this.c.onKeyUp(v, keyEvent0);
            if(z && (v == 23 || v == 66)) {
                this.dismiss();
            }
            return z;
        }
        return false;
    }

    public boolean performItemClick(int v) {
        if(this.isShowing()) {
            if(this.u != null) {
                s1 s10 = this.c;
                View view0 = s10.getChildAt(v - s10.getFirstVisiblePosition());
                ListAdapter listAdapter0 = s10.getAdapter();
                this.u.onItemClick(s10, view0, v, listAdapter0.getItemId(v));
            }
            return true;
        }
        return false;
    }

    public void postShow() {
        this.B.post(this.A);
    }

    public void setAdapter(@Nullable ListAdapter listAdapter0) {
        y1 y10 = this.r;
        if(y10 == null) {
            this.r = new y1(this, 0);
        }
        else {
            ListAdapter listAdapter1 = this.b;
            if(listAdapter1 != null) {
                listAdapter1.unregisterDataSetObserver(y10);
            }
        }
        this.b = listAdapter0;
        if(listAdapter0 != null) {
            listAdapter0.registerDataSetObserver(this.r);
        }
        s1 s10 = this.c;
        if(s10 != null) {
            s10.setAdapter(this.b);
        }
    }

    public void setAnchorView(@Nullable View view0) {
        this.s = view0;
    }

    public void setAnimationStyle(@StyleRes int v) {
        this.F.setAnimationStyle(v);
    }

    public void setBackgroundDrawable(@Nullable Drawable drawable0) {
        this.F.setBackgroundDrawable(drawable0);
    }

    public void setContentWidth(int v) {
        Drawable drawable0 = this.F.getBackground();
        if(drawable0 != null) {
            drawable0.getPadding(this.C);
            this.e = this.C.left + this.C.right + v;
            return;
        }
        this.setWidth(v);
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setDropDownAlwaysVisible(boolean z) {
        this.m = z;
    }

    public void setDropDownGravity(int v) {
        this.l = v;
    }

    public void setEpicenterBounds(@Nullable Rect rect0) {
        this.D = rect0 == null ? null : new Rect(rect0);
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setForceIgnoreOutsideTouch(boolean z) {
        this.n = z;
    }

    public void setHeight(int v) {
        if(v < 0 && -2 != v && -1 != v) {
            throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
        }
        this.d = v;
    }

    public void setHorizontalOffset(int v) {
        this.f = v;
    }

    public void setInputMethodMode(int v) {
        this.F.setInputMethodMode(v);
    }

    public void setListSelector(Drawable drawable0) {
        this.t = drawable0;
    }

    public void setModal(boolean z) {
        this.E = z;
        this.F.setFocusable(z);
    }

    public void setOnDismissListener(@Nullable PopupWindow.OnDismissListener popupWindow$OnDismissListener0) {
        this.F.setOnDismissListener(popupWindow$OnDismissListener0);
    }

    public void setOnItemClickListener(@Nullable AdapterView.OnItemClickListener adapterView$OnItemClickListener0) {
        this.u = adapterView$OnItemClickListener0;
    }

    public void setOnItemSelectedListener(@Nullable AdapterView.OnItemSelectedListener adapterView$OnItemSelectedListener0) {
        this.v = adapterView$OnItemSelectedListener0;
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setOverlapAnchor(boolean z) {
        this.k = true;
        this.j = z;
    }

    public void setPromptPosition(int v) {
        this.q = v;
    }

    public void setPromptView(@Nullable View view0) {
        boolean z = this.isShowing();
        if(z) {
            View view1 = this.p;
            if(view1 != null) {
                ViewParent viewParent0 = view1.getParent();
                if(viewParent0 instanceof ViewGroup) {
                    ((ViewGroup)viewParent0).removeView(this.p);
                }
            }
        }
        this.p = view0;
        if(z) {
            this.show();
        }
    }

    public void setSelection(int v) {
        s1 s10 = this.c;
        if(this.isShowing() && s10 != null) {
            s10.setListSelectionHidden(false);
            s10.setSelection(v);
            if(s10.getChoiceMode() != 0) {
                s10.setItemChecked(v, true);
            }
        }
    }

    public void setSoftInputMode(int v) {
        this.F.setSoftInputMode(v);
    }

    public void setVerticalOffset(int v) {
        this.g = v;
        this.i = true;
    }

    public void setWidth(int v) {
        this.e = v;
    }

    public void setWindowLayoutType(int v) {
        this.h = v;
    }

    @Override  // androidx.appcompat.view.menu.ShowableListMenu
    public void show() {
        int v12;
        int v9;
        int v6;
        int v3;
        int v2;
        PopupWindow popupWindow0 = this.F;
        Context context0 = this.a;
        boolean z = true;
        int v = -1;
        if(this.c == null) {
            this.A = new u1(this, 0);
            s1 s10 = this.a(context0, !this.E);
            this.c = s10;
            Drawable drawable0 = this.t;
            if(drawable0 != null) {
                s10.setSelector(drawable0);
            }
            this.c.setAdapter(this.b);
            this.c.setOnItemClickListener(this.u);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new v1(this, 0));
            this.c.setOnScrollListener(this.y);
            AdapterView.OnItemSelectedListener adapterView$OnItemSelectedListener0 = this.v;
            if(adapterView$OnItemSelectedListener0 != null) {
                this.c.setOnItemSelectedListener(adapterView$OnItemSelectedListener0);
            }
            s1 s11 = this.c;
            View view0 = this.p;
            if(view0 == null) {
                v3 = 0;
            }
            else {
                LinearLayout linearLayout0 = new LinearLayout(context0);
                linearLayout0.setOrientation(1);
                LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                switch(this.q) {
                    case 0: {
                        linearLayout0.addView(view0);
                        linearLayout0.addView(s11, linearLayout$LayoutParams0);
                        break;
                    }
                    case 1: {
                        linearLayout0.addView(s11, linearLayout$LayoutParams0);
                        linearLayout0.addView(view0);
                        break;
                    }
                    default: {
                        Log.e("ListPopupWindow", "Invalid hint position " + this.q);
                    }
                }
                int v1 = this.e;
                if(v1 >= 0) {
                    v2 = 0x80000000;
                }
                else {
                    v1 = 0;
                    v2 = 0;
                }
                view0.measure(View.MeasureSpec.makeMeasureSpec(v1, v2), 0);
                LinearLayout.LayoutParams linearLayout$LayoutParams1 = (LinearLayout.LayoutParams)view0.getLayoutParams();
                v3 = view0.getMeasuredHeight() + linearLayout$LayoutParams1.topMargin + linearLayout$LayoutParams1.bottomMargin;
                s11 = linearLayout0;
            }
            popupWindow0.setContentView(s11);
        }
        else {
            ViewGroup viewGroup0 = (ViewGroup)popupWindow0.getContentView();
            View view1 = this.p;
            if(view1 == null) {
                v3 = 0;
            }
            else {
                LinearLayout.LayoutParams linearLayout$LayoutParams2 = (LinearLayout.LayoutParams)view1.getLayoutParams();
                int v4 = view1.getMeasuredHeight();
                v3 = linearLayout$LayoutParams2.bottomMargin + (v4 + linearLayout$LayoutParams2.topMargin);
            }
        }
        Drawable drawable1 = popupWindow0.getBackground();
        Rect rect0 = this.C;
        if(drawable1 == null) {
            rect0.setEmpty();
            v6 = 0;
        }
        else {
            drawable1.getPadding(rect0);
            int v5 = rect0.top;
            v6 = rect0.bottom + v5;
            if(!this.i) {
                this.g = -v5;
            }
        }
        boolean z1 = popupWindow0.getInputMethodMode() == 2;
        int v7 = w1.a(popupWindow0, this.getAnchorView(), this.g, z1);
        if(this.m || this.d == -1) {
            v12 = v7 + v6;
        }
        else {
            int v8 = this.e;
            switch(v8) {
                case -2: {
                    v9 = View.MeasureSpec.makeMeasureSpec(context0.getResources().getDisplayMetrics().widthPixels - (rect0.left + rect0.right), 0x80000000);
                    break;
                }
                case -1: {
                    v9 = View.MeasureSpec.makeMeasureSpec(context0.getResources().getDisplayMetrics().widthPixels - (rect0.left + rect0.right), 0x40000000);
                    break;
                }
                default: {
                    v9 = View.MeasureSpec.makeMeasureSpec(v8, 0x40000000);
                }
            }
            int v10 = this.c.measureHeightOfChildrenCompat(v9, 0, -1, v7 - v3, -1);
            if(v10 > 0) {
                int v11 = this.c.getPaddingTop();
                v3 += this.c.getPaddingBottom() + v11 + v6;
            }
            v12 = v10 + v3;
        }
        boolean z2 = this.isInputMethodNotNeeded();
        PopupWindowCompat.setWindowLayoutType(popupWindow0, this.h);
        if(popupWindow0.isShowing()) {
            if(!ViewCompat.isAttachedToWindow(this.getAnchorView())) {
                return;
            }
            int v13 = this.e;
            if(v13 == -1) {
                v13 = -1;
            }
            else if(v13 == -2) {
                v13 = this.getAnchorView().getWidth();
            }
            int v14 = this.d;
            if(v14 == -1) {
                if(!z2) {
                    v12 = -1;
                }
                if(z2) {
                    popupWindow0.setWidth((this.e == -1 ? -1 : 0));
                    popupWindow0.setHeight(0);
                }
                else {
                    popupWindow0.setWidth((this.e == -1 ? -1 : 0));
                    popupWindow0.setHeight(-1);
                }
            }
            else if(v14 != -2) {
                v12 = v14;
            }
            if(this.n || this.m) {
                z = false;
            }
            popupWindow0.setOutsideTouchable(z);
            View view2 = this.getAnchorView();
            int v15 = this.f;
            int v16 = this.g;
            if(v12 >= 0) {
                v = v12;
            }
            popupWindow0.update(view2, v15, v16, (v13 >= 0 ? v13 : -1), v);
            return;
        }
        int v17 = this.e;
        if(v17 == -1) {
            v17 = -1;
        }
        else if(v17 == -2) {
            v17 = this.getAnchorView().getWidth();
        }
        int v18 = this.d;
        if(v18 == -1) {
            v12 = -1;
        }
        else if(v18 != -2) {
            v12 = v18;
        }
        popupWindow0.setWidth(v17);
        popupWindow0.setHeight(v12);
        if(Build.VERSION.SDK_INT <= 28) {
            Method method0 = ListPopupWindow.G;
            if(method0 != null) {
                try {
                    method0.invoke(popupWindow0, Boolean.TRUE);
                }
                catch(Exception unused_ex) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        }
        else {
            x1.b(popupWindow0, true);
        }
        if(this.n || this.m) {
            z = false;
        }
        popupWindow0.setOutsideTouchable(z);
        popupWindow0.setTouchInterceptor(this.x);
        if(this.k) {
            PopupWindowCompat.setOverlapAnchor(popupWindow0, this.j);
        }
        if(Build.VERSION.SDK_INT <= 28) {
            Method method1 = ListPopupWindow.H;
            if(method1 != null) {
                try {
                    method1.invoke(popupWindow0, this.D);
                }
                catch(Exception exception0) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", exception0);
                }
            }
        }
        else {
            x1.a(popupWindow0, this.D);
        }
        PopupWindowCompat.showAsDropDown(popupWindow0, this.getAnchorView(), this.f, this.g, this.l);
        this.c.setSelection(-1);
        if(!this.E || this.c.isInTouchMode()) {
            this.clearListSelection();
        }
        if(!this.E) {
            this.B.post(this.z);
        }
    }
}

