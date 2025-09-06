package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import androidx.appcompat.R.attr;
import androidx.appcompat.app.ActionBar.Tab;

public final class l2 extends LinearLayout {
    public Tab a;
    public AppCompatTextView b;
    public AppCompatImageView c;
    public View d;
    public final ScrollingTabContainerView e;

    public l2(ScrollingTabContainerView scrollingTabContainerView0, Context context0, Tab actionBar$Tab0, boolean z) {
        this.e = scrollingTabContainerView0;
        super(context0, null, attr.actionBarTabStyle);
        this.a = actionBar$Tab0;
        TintTypedArray tintTypedArray0 = TintTypedArray.obtainStyledAttributes(context0, null, new int[]{0x10100D4}, attr.actionBarTabStyle, 0);
        if(tintTypedArray0.hasValue(0)) {
            this.setBackgroundDrawable(tintTypedArray0.getDrawable(0));
        }
        tintTypedArray0.recycle();
        if(z) {
            this.setGravity(0x800013);
        }
        this.a();
    }

    public final void a() {
        Tab actionBar$Tab0 = this.a;
        View view0 = actionBar$Tab0.getCustomView();
        CharSequence charSequence0 = null;
        if(view0 == null) {
            View view1 = this.d;
            if(view1 != null) {
                this.removeView(view1);
                this.d = null;
            }
            Drawable drawable0 = actionBar$Tab0.getIcon();
            CharSequence charSequence1 = actionBar$Tab0.getText();
            if(drawable0 == null) {
                AppCompatImageView appCompatImageView2 = this.c;
                if(appCompatImageView2 != null) {
                    appCompatImageView2.setVisibility(8);
                    this.c.setImageDrawable(null);
                }
            }
            else {
                if(this.c == null) {
                    AppCompatImageView appCompatImageView1 = new AppCompatImageView(this.getContext());
                    LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-2, -2);
                    linearLayout$LayoutParams0.gravity = 16;
                    appCompatImageView1.setLayoutParams(linearLayout$LayoutParams0);
                    this.addView(appCompatImageView1, 0);
                    this.c = appCompatImageView1;
                }
                this.c.setImageDrawable(drawable0);
                this.c.setVisibility(0);
            }
            boolean z = TextUtils.isEmpty(charSequence1);
            if(z) {
                AppCompatTextView appCompatTextView2 = this.b;
                if(appCompatTextView2 != null) {
                    appCompatTextView2.setVisibility(8);
                    this.b.setText(null);
                }
            }
            else {
                if(this.b == null) {
                    AppCompatTextView appCompatTextView1 = new AppCompatTextView(this.getContext(), null, attr.actionBarTabTextStyle);
                    appCompatTextView1.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-2, -2);
                    linearLayout$LayoutParams1.gravity = 16;
                    appCompatTextView1.setLayoutParams(linearLayout$LayoutParams1);
                    this.addView(appCompatTextView1);
                    this.b = appCompatTextView1;
                }
                this.b.setText(charSequence1);
                this.b.setVisibility(0);
            }
            AppCompatImageView appCompatImageView3 = this.c;
            if(appCompatImageView3 != null) {
                appCompatImageView3.setContentDescription(actionBar$Tab0.getContentDescription());
            }
            if(z) {
                charSequence0 = actionBar$Tab0.getContentDescription();
            }
            TooltipCompat.setTooltipText(this, charSequence0);
        }
        else {
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 != this) {
                if(viewParent0 != null) {
                    ((ViewGroup)viewParent0).removeView(view0);
                }
                this.addView(view0);
            }
            this.d = view0;
            AppCompatTextView appCompatTextView0 = this.b;
            if(appCompatTextView0 != null) {
                appCompatTextView0.setVisibility(8);
            }
            AppCompatImageView appCompatImageView0 = this.c;
            if(appCompatImageView0 != null) {
                appCompatImageView0.setVisibility(8);
                this.c.setImageDrawable(null);
            }
        }
    }

    @Override  // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        super.onInitializeAccessibilityEvent(accessibilityEvent0);
        accessibilityEvent0.setClassName("androidx.appcompat.app.ActionBar$Tab");
    }

    @Override  // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        accessibilityNodeInfo0.setClassName("androidx.appcompat.app.ActionBar$Tab");
    }

    @Override  // android.widget.LinearLayout
    public final void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        ScrollingTabContainerView scrollingTabContainerView0 = this.e;
        if(scrollingTabContainerView0.f > 0) {
            int v2 = this.getMeasuredWidth();
            int v3 = scrollingTabContainerView0.f;
            if(v2 > v3) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(v3, 0x40000000), v1);
            }
        }
    }

    @Override  // android.view.View
    public final void setSelected(boolean z) {
        boolean z1 = this.isSelected() != z;
        super.setSelected(z);
        if(z1 && z) {
            this.sendAccessibilityEvent(4);
        }
    }
}

