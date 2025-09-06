package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow.OnDismissListener;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.dimen;
import androidx.appcompat.R.id;
import androidx.appcompat.R.layout;
import androidx.appcompat.R.string;
import androidx.appcompat.R.styleable;
import androidx.appcompat.view.menu.c;
import androidx.core.view.ActionProvider;
import androidx.core.view.ViewCompat;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class ActivityChooserView extends ViewGroup implements ActivityChooserModel.ActivityChooserModelClient {
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public static class InnerLayout extends LinearLayout {
        public static final int[] a;

        static {
            InnerLayout.a = new int[]{0x10100D4};
        }

        public InnerLayout(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            TintTypedArray tintTypedArray0 = TintTypedArray.obtainStyledAttributes(context0, attributeSet0, InnerLayout.a);
            this.setBackgroundDrawable(tintTypedArray0.getDrawable(0));
            tintTypedArray0.recycle();
        }
    }

    public final w a;
    public final x b;
    public final View c;
    public final Drawable d;
    public final FrameLayout e;
    public final ImageView f;
    public final FrameLayout g;
    public final ImageView h;
    public final int i;
    public ActionProvider j;
    public final u k;
    public final c l;
    public ListPopupWindow m;
    public PopupWindow.OnDismissListener n;
    public boolean o;
    public int p;
    public boolean q;
    public int r;

    public ActivityChooserView(@NonNull Context context0) {
        this(context0, null);
    }

    public ActivityChooserView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public ActivityChooserView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.k = new u(this, 0);
        this.l = new c(this, 2);
        this.p = 4;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.ActivityChooserView, v, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context0, styleable.ActivityChooserView, attributeSet0, typedArray0, v, 0);
        this.p = typedArray0.getInt(styleable.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable0 = typedArray0.getDrawable(styleable.ActivityChooserView_expandActivityOverflowButtonDrawable);
        typedArray0.recycle();
        LayoutInflater.from(this.getContext()).inflate(layout.abc_activity_chooser_view, this, true);
        x x0 = new x(this);
        this.b = x0;
        View view0 = this.findViewById(id.activity_chooser_view_content);
        this.c = view0;
        this.d = view0.getBackground();
        FrameLayout frameLayout0 = (FrameLayout)this.findViewById(id.default_activity_button);
        this.g = frameLayout0;
        frameLayout0.setOnClickListener(x0);
        frameLayout0.setOnLongClickListener(x0);
        this.h = (ImageView)frameLayout0.findViewById(id.image);
        FrameLayout frameLayout1 = (FrameLayout)this.findViewById(id.expand_activities_button);
        frameLayout1.setOnClickListener(x0);
        frameLayout1.setAccessibilityDelegate(new v());  // 初始化器: Landroid/view/View$AccessibilityDelegate;-><init>()V
        frameLayout1.setOnTouchListener(new i(this, frameLayout1, 1));
        this.e = frameLayout1;
        ImageView imageView0 = (ImageView)frameLayout1.findViewById(id.image);
        this.f = imageView0;
        imageView0.setImageDrawable(drawable0);
        w w0 = new w(this);
        this.a = w0;
        w0.registerDataSetObserver(new u(this, 1));
        Resources resources0 = context0.getResources();
        this.i = Math.max(resources0.getDisplayMetrics().widthPixels / 2, resources0.getDimensionPixelSize(dimen.abc_config_prefDialogWidth));
    }

    public final void a(int v) {
        w w0 = this.a;
        if(w0.a == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        this.getViewTreeObserver().addOnGlobalLayoutListener(this.l);
        int v1 = this.g.getVisibility() == 0 ? 1 : 0;
        if(v == 0x7FFFFFFF || w0.a.f() <= v + v1) {
            if(w0.e) {
                w0.e = false;
                w0.notifyDataSetChanged();
            }
            if(w0.b != v) {
                w0.b = v;
                w0.notifyDataSetChanged();
            }
        }
        else {
            if(!w0.e) {
                w0.e = true;
                w0.notifyDataSetChanged();
            }
            if(w0.b != v - 1) {
                w0.b = v - 1;
                w0.notifyDataSetChanged();
            }
        }
        ListPopupWindow listPopupWindow0 = this.getListPopupWindow();
        if(!listPopupWindow0.isShowing()) {
            if(this.o || v1 == 0) {
                if(!w0.c || w0.d != v1) {
                    w0.c = true;
                    w0.d = v1;
                    w0.notifyDataSetChanged();
                }
            }
            else if(w0.c || w0.d) {
                w0.c = false;
                w0.d = false;
                w0.notifyDataSetChanged();
            }
            int v2 = w0.b;
            w0.b = 0x7FFFFFFF;
            int v3 = w0.getCount();
            int v5 = 0;
            View view0 = null;
            for(int v4 = 0; v4 < v3; ++v4) {
                view0 = w0.getView(v4, view0, null);
                view0.measure(0, 0);
                v5 = Math.max(v5, view0.getMeasuredWidth());
            }
            w0.b = v2;
            listPopupWindow0.setContentWidth(Math.min(v5, this.i));
            listPopupWindow0.show();
            ActionProvider actionProvider0 = this.j;
            if(actionProvider0 != null) {
                actionProvider0.subUiVisibilityChanged(true);
            }
            listPopupWindow0.getListView().setContentDescription(this.getContext().getString(string.abc_activitychooserview_choose_application));
            listPopupWindow0.getListView().setSelector(new ColorDrawable(0));
        }
    }

    public boolean dismissPopup() {
        if(this.isShowingPopup()) {
            this.getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver0 = this.getViewTreeObserver();
            if(viewTreeObserver0.isAlive()) {
                viewTreeObserver0.removeGlobalOnLayoutListener(this.l);
            }
        }
        return true;
    }

    @RestrictTo({Scope.LIBRARY})
    public t getDataModel() {
        return this.a.a;
    }

    public ListPopupWindow getListPopupWindow() {
        if(this.m == null) {
            ListPopupWindow listPopupWindow0 = new ListPopupWindow(this.getContext());
            this.m = listPopupWindow0;
            listPopupWindow0.setAdapter(this.a);
            this.m.setAnchorView(this);
            this.m.setModal(true);
            this.m.setOnItemClickListener(this.b);
            this.m.setOnDismissListener(this.b);
        }
        return this.m;
    }

    public boolean isShowingPopup() {
        return this.getListPopupWindow().isShowing();
    }

    @Override  // android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        t t0 = this.a.a;
        if(t0 != null) {
            t0.registerObserver(this.k);
        }
        this.q = true;
    }

    @Override  // android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t t0 = this.a.a;
        if(t0 != null) {
            t0.unregisterObserver(this.k);
        }
        ViewTreeObserver viewTreeObserver0 = this.getViewTreeObserver();
        if(viewTreeObserver0.isAlive()) {
            viewTreeObserver0.removeGlobalOnLayoutListener(this.l);
        }
        if(this.isShowingPopup()) {
            this.dismissPopup();
        }
        this.q = false;
    }

    @Override  // android.view.ViewGroup
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        this.c.layout(0, 0, v2 - v, v3 - v1);
        if(!this.isShowingPopup()) {
            this.dismissPopup();
        }
    }

    @Override  // android.view.View
    public void onMeasure(int v, int v1) {
        if(this.g.getVisibility() != 0) {
            v1 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(v1), 0x40000000);
        }
        this.measureChild(this.c, v, v1);
        this.setMeasuredDimension(this.c.getMeasuredWidth(), this.c.getMeasuredHeight());
    }

    @Override  // androidx.appcompat.widget.ActivityChooserModel$ActivityChooserModelClient
    @RestrictTo({Scope.LIBRARY})
    public void setActivityChooserModel(t t0) {
        w w0 = this.a;
        ActivityChooserView activityChooserView0 = w0.f;
        t t1 = activityChooserView0.a.a;
        u u0 = activityChooserView0.k;
        if(t1 != null && activityChooserView0.isShown()) {
            t1.unregisterObserver(u0);
        }
        w0.a = t0;
        if(t0 != null && activityChooserView0.isShown()) {
            t0.registerObserver(u0);
        }
        w0.notifyDataSetChanged();
        if(this.isShowingPopup()) {
            this.dismissPopup();
            this.showPopup();
        }
    }

    public void setDefaultActionButtonContentDescription(int v) {
        this.r = v;
    }

    public void setExpandActivityOverflowButtonContentDescription(int v) {
        String s = this.getContext().getString(v);
        this.f.setContentDescription(s);
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable0) {
        this.f.setImageDrawable(drawable0);
    }

    public void setInitialActivityCount(int v) {
        this.p = v;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener popupWindow$OnDismissListener0) {
        this.n = popupWindow$OnDismissListener0;
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setProvider(ActionProvider actionProvider0) {
        this.j = actionProvider0;
    }

    public boolean showPopup() {
        if(!this.isShowingPopup() && this.q) {
            this.o = false;
            this.a(this.p);
            return true;
        }
        return false;
    }
}

