package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SpinnerAdapter;
import androidx.appcompat.view.menu.c;

public final class r0 extends ListPopupWindow implements SpinnerPopup {
    public CharSequence I;
    public ListAdapter J;
    public final Rect K;
    public int L;
    public final AppCompatSpinner M;

    public r0(AppCompatSpinner appCompatSpinner0, Context context0, AttributeSet attributeSet0, int v) {
        this.M = appCompatSpinner0;
        super(context0, attributeSet0, v);
        this.K = new Rect();
        this.setAnchorView(appCompatSpinner0);
        this.setModal(true);
        this.setPromptPosition(0);
        this.setOnItemClickListener(new p0(this, 0));
    }

    public final void c() {
        int v;
        Drawable drawable0 = this.getBackground();
        AppCompatSpinner appCompatSpinner0 = this.M;
        if(drawable0 == null) {
            appCompatSpinner0.h.right = 0;
            appCompatSpinner0.h.left = 0;
            v = 0;
        }
        else {
            drawable0.getPadding(appCompatSpinner0.h);
            v = ViewUtils.isLayoutRtl(appCompatSpinner0) ? appCompatSpinner0.h.right : -appCompatSpinner0.h.left;
        }
        int v1 = appCompatSpinner0.getPaddingLeft();
        int v2 = appCompatSpinner0.getPaddingRight();
        int v3 = appCompatSpinner0.getWidth();
        int v4 = appCompatSpinner0.g;
        if(v4 == -2) {
            int v5 = appCompatSpinner0.a(((SpinnerAdapter)this.J), this.getBackground());
            int v6 = appCompatSpinner0.getContext().getResources().getDisplayMetrics().widthPixels - appCompatSpinner0.h.left - appCompatSpinner0.h.right;
            if(v5 > v6) {
                v5 = v6;
            }
            this.setContentWidth(Math.max(v5, v3 - v1 - v2));
        }
        else if(v4 == -1) {
            this.setContentWidth(v3 - v1 - v2);
        }
        else {
            this.setContentWidth(v4);
        }
        this.setHorizontalOffset((ViewUtils.isLayoutRtl(appCompatSpinner0) ? v3 - v2 - this.getWidth() - this.L + v : v1 + this.L + v));
    }

    @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
    public final CharSequence getHintText() {
        return this.I;
    }

    @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
    public final int getHorizontalOriginalOffset() {
        return this.L;
    }

    @Override  // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
    public final void setAdapter(ListAdapter listAdapter0) {
        super.setAdapter(listAdapter0);
        this.J = listAdapter0;
    }

    @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
    public final void setHorizontalOriginalOffset(int v) {
        this.L = v;
    }

    @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
    public final void setPromptText(CharSequence charSequence0) {
        this.I = charSequence0;
    }

    @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
    public final void show(int v, int v1) {
        boolean z = this.isShowing();
        this.c();
        this.setInputMethodMode(2);
        super.show();
        ListView listView0 = this.getListView();
        listView0.setChoiceMode(1);
        l0.d(listView0, v);
        l0.c(listView0, v1);
        AppCompatSpinner appCompatSpinner0 = this.M;
        this.setSelection(appCompatSpinner0.getSelectedItemPosition());
        if(z) {
            return;
        }
        ViewTreeObserver viewTreeObserver0 = appCompatSpinner0.getViewTreeObserver();
        if(viewTreeObserver0 != null) {
            c c0 = new c(this, 3);
            viewTreeObserver0.addOnGlobalLayoutListener(c0);
            this.setOnDismissListener(new q0(this, c0));
        }
    }
}

