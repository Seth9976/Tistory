package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout.LayoutParams;
import androidx.annotation.GravityInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.styleable;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class LinearLayoutCompat extends ViewGroup {
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface DividerMode {
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public LayoutParams(int v, int v1) {
            super(v, v1);
        }

        public LayoutParams(int v, int v1, float f) {
            super(v, v1, f);
        }

        public LayoutParams(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
        }

        public LayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface OrientationMode {
    }

    public static final int HORIZONTAL = 0;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public float g;
    public boolean h;
    public int[] i;
    public int[] j;
    public Drawable k;
    public int l;
    public int m;
    public int n;
    public int o;

    public LinearLayoutCompat(@NonNull Context context0) {
        this(context0, null);
    }

    public LinearLayoutCompat(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public LinearLayoutCompat(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = true;
        this.b = -1;
        this.c = 0;
        this.e = 0x800033;
        TintTypedArray tintTypedArray0 = TintTypedArray.obtainStyledAttributes(context0, attributeSet0, styleable.LinearLayoutCompat, v, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context0, styleable.LinearLayoutCompat, attributeSet0, tintTypedArray0.getWrappedTypeArray(), v, 0);
        int v1 = tintTypedArray0.getInt(styleable.LinearLayoutCompat_android_orientation, -1);
        if(v1 >= 0) {
            this.setOrientation(v1);
        }
        int v2 = tintTypedArray0.getInt(styleable.LinearLayoutCompat_android_gravity, -1);
        if(v2 >= 0) {
            this.setGravity(v2);
        }
        if(!tintTypedArray0.getBoolean(styleable.LinearLayoutCompat_android_baselineAligned, true)) {
            this.setBaselineAligned(false);
        }
        this.g = tintTypedArray0.getFloat(styleable.LinearLayoutCompat_android_weightSum, -1.0f);
        this.b = tintTypedArray0.getInt(styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.h = tintTypedArray0.getBoolean(styleable.LinearLayoutCompat_measureWithLargestChild, false);
        this.setDividerDrawable(tintTypedArray0.getDrawable(styleable.LinearLayoutCompat_divider));
        this.n = tintTypedArray0.getInt(styleable.LinearLayoutCompat_showDividers, 0);
        this.o = tintTypedArray0.getDimensionPixelSize(styleable.LinearLayoutCompat_dividerPadding, 0);
        tintTypedArray0.recycle();
    }

    public final void a(Canvas canvas0, int v) {
        this.k.setBounds(this.getPaddingLeft() + this.o, v, this.getWidth() - this.getPaddingRight() - this.o, this.m + v);
        this.k.draw(canvas0);
    }

    public final void b(Canvas canvas0, int v) {
        this.k.setBounds(v, this.getPaddingTop() + this.o, this.l + v, this.getHeight() - this.getPaddingBottom() - this.o);
        this.k.draw(canvas0);
    }

    @Override  // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof LayoutParams;
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return this.generateDefaultLayoutParams();
    }

    public LayoutParams generateDefaultLayoutParams() {
        int v = this.d;
        if(v == 0) {
            return new LayoutParams(-2, -2);
        }
        return v == 1 ? new LayoutParams(-1, -2) : null;
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.generateLayoutParams(attributeSet0);
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return this.generateLayoutParams(viewGroup$LayoutParams0);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return new LayoutParams(this.getContext(), attributeSet0);
    }

    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return new LayoutParams(viewGroup$LayoutParams0);
    }

    @Override  // android.view.View
    public int getBaseline() {
        if(this.b < 0) {
            return super.getBaseline();
        }
        int v = this.getChildCount();
        int v1 = this.b;
        if(v <= v1) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View view0 = this.getChildAt(v1);
        int v2 = view0.getBaseline();
        if(v2 == -1) {
            if(this.b != 0) {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn\'t know how to get its baseline.");
            }
            return -1;
        }
        int v3 = this.c;
        if(this.d == 1) {
            switch(this.e & 0x70) {
                case 16: {
                    v3 += (this.getBottom() - this.getTop() - this.getPaddingTop() - this.getPaddingBottom() - this.f) / 2;
                    break;
                }
                case 80: {
                    return this.getBottom() - this.getTop() - this.getPaddingBottom() - this.f + ((LayoutParams)view0.getLayoutParams()).topMargin + v2;
                }
                default: {
                    return v3 + ((LayoutParams)view0.getLayoutParams()).topMargin + v2;
                }
            }
        }
        return v3 + ((LayoutParams)view0.getLayoutParams()).topMargin + v2;
    }

    public int getBaselineAlignedChildIndex() {
        return this.b;
    }

    public Drawable getDividerDrawable() {
        return this.k;
    }

    public int getDividerPadding() {
        return this.o;
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public int getDividerWidth() {
        return this.l;
    }

    @GravityInt
    public int getGravity() {
        return this.e;
    }

    public int getOrientation() {
        return this.d;
    }

    public int getShowDividers() {
        return this.n;
    }

    public int getVirtualChildCount() {
        return this.getChildCount();
    }

    public float getWeightSum() {
        return this.g;
    }

    @RestrictTo({Scope.LIBRARY})
    public boolean hasDividerBeforeChildAt(int v) {
        if(v == 0) {
            return (this.n & 1) != 0;
        }
        if(v == this.getChildCount()) {
            return (this.n & 4) != 0;
        }
        if((this.n & 2) != 0) {
            for(int v1 = v - 1; v1 >= 0; --v1) {
                if(this.getChildAt(v1).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isBaselineAligned() {
        return this.a;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.h;
    }

    @Override  // android.view.View
    public void onDraw(Canvas canvas0) {
        int v4;
        int v2;
        int v = 0;
        if(this.k == null) {
            return;
        }
        if(this.d == 1) {
            int v1 = this.getVirtualChildCount();
            while(v < v1) {
                View view0 = this.getChildAt(v);
                if(view0 != null && view0.getVisibility() != 8 && this.hasDividerBeforeChildAt(v)) {
                    LayoutParams linearLayoutCompat$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                    this.a(canvas0, view0.getTop() - linearLayoutCompat$LayoutParams0.topMargin - this.m);
                }
                ++v;
            }
            if(this.hasDividerBeforeChildAt(v1)) {
                View view1 = this.getChildAt(v1 - 1);
                if(view1 == null) {
                    v2 = this.getHeight() - this.getPaddingBottom() - this.m;
                }
                else {
                    LayoutParams linearLayoutCompat$LayoutParams1 = (LayoutParams)view1.getLayoutParams();
                    v2 = view1.getBottom() + linearLayoutCompat$LayoutParams1.bottomMargin;
                }
                this.a(canvas0, v2);
            }
        }
        else {
            int v3 = this.getVirtualChildCount();
            boolean z = ViewUtils.isLayoutRtl(this);
            while(v < v3) {
                View view2 = this.getChildAt(v);
                if(view2 != null && view2.getVisibility() != 8 && this.hasDividerBeforeChildAt(v)) {
                    LayoutParams linearLayoutCompat$LayoutParams2 = (LayoutParams)view2.getLayoutParams();
                    this.b(canvas0, (z ? view2.getRight() + linearLayoutCompat$LayoutParams2.rightMargin : view2.getLeft() - linearLayoutCompat$LayoutParams2.leftMargin - this.l));
                }
                ++v;
            }
            if(this.hasDividerBeforeChildAt(v3)) {
                View view3 = this.getChildAt(v3 - 1);
                if(view3 != null) {
                    LayoutParams linearLayoutCompat$LayoutParams3 = (LayoutParams)view3.getLayoutParams();
                    v4 = z ? view3.getLeft() - linearLayoutCompat$LayoutParams3.leftMargin - this.l : view3.getRight() + linearLayoutCompat$LayoutParams3.rightMargin;
                }
                else if(z) {
                    v4 = this.getPaddingLeft();
                }
                else {
                    v4 = this.getWidth() - this.getPaddingRight() - this.l;
                }
                this.b(canvas0, v4);
            }
        }
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        super.onInitializeAccessibilityEvent(accessibilityEvent0);
        accessibilityEvent0.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        accessibilityNodeInfo0.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override  // android.view.ViewGroup
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v34;
        int v33;
        int v32;
        int v31;
        int v30;
        int v27;
        int v24;
        int v23;
        int v22;
        int v14;
        int v10;
        if(this.d == 1) {
            int v4 = this.getPaddingLeft();
            int v5 = v2 - v;
            int v6 = this.getPaddingRight();
            int v7 = this.getPaddingRight();
            int v8 = this.getVirtualChildCount();
            int v9 = 0x800007 & this.e;
            switch(this.e & 0x70) {
                case 16: {
                    v10 = this.getPaddingTop() + (v3 - v1 - this.f) / 2;
                    break;
                }
                case 80: {
                    v10 = this.getPaddingTop() + v3 - v1 - this.f;
                    break;
                }
                default: {
                    v10 = this.getPaddingTop();
                }
            }
            for(int v11 = 0; v11 < v8; ++v11) {
                View view0 = this.getChildAt(v11);
                if(view0 != null && view0.getVisibility() != 8) {
                    int v12 = view0.getMeasuredWidth();
                    int v13 = view0.getMeasuredHeight();
                    LayoutParams linearLayoutCompat$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                    switch(GravityCompat.getAbsoluteGravity((linearLayoutCompat$LayoutParams0.gravity >= 0 ? linearLayoutCompat$LayoutParams0.gravity : v9), ViewCompat.getLayoutDirection(this)) & 7) {
                        case 1: {
                            v14 = (v5 - v4 - v7 - v12) / 2 + v4 + linearLayoutCompat$LayoutParams0.leftMargin - linearLayoutCompat$LayoutParams0.rightMargin;
                            break;
                        }
                        case 5: {
                            v14 = v5 - v6 - v12 - linearLayoutCompat$LayoutParams0.rightMargin;
                            break;
                        }
                        default: {
                            v14 = linearLayoutCompat$LayoutParams0.leftMargin + v4;
                        }
                    }
                    if(this.hasDividerBeforeChildAt(v11)) {
                        v10 += this.m;
                    }
                    int v15 = v10 + linearLayoutCompat$LayoutParams0.topMargin;
                    view0.layout(v14, v15, v12 + v14, v15 + v13);
                    v10 = v13 + linearLayoutCompat$LayoutParams0.bottomMargin + v15;
                }
            }
            return;
        }
        boolean z1 = ViewUtils.isLayoutRtl(this);
        int v16 = this.getPaddingTop();
        int v17 = v3 - v1;
        int v18 = this.getPaddingBottom();
        int v19 = this.getPaddingBottom();
        int v20 = this.getVirtualChildCount();
        int v21 = this.e & 0x70;
        boolean z2 = this.a;
        int[] arr_v = this.i;
        int[] arr_v1 = this.j;
        switch(GravityCompat.getAbsoluteGravity(0x800007 & this.e, ViewCompat.getLayoutDirection(this))) {
            case 1: {
                v22 = this.getPaddingLeft() + (v2 - v - this.f) / 2;
                break;
            }
            case 5: {
                v22 = this.getPaddingLeft() + v2 - v - this.f;
                break;
            }
            default: {
                v22 = this.getPaddingLeft();
            }
        }
        if(z1) {
            v23 = v20 - 1;
            v24 = -1;
        }
        else {
            v24 = 1;
            v23 = 0;
        }
        int v25 = 0;
        while(v25 < v20) {
            int v26 = v24 * v25 + v23;
            View view1 = this.getChildAt(v26);
            if(view1 == null) {
                v27 = v23;
            }
            else {
                v27 = v23;
                if(view1.getVisibility() != 8) {
                    int v28 = view1.getMeasuredWidth();
                    int v29 = view1.getMeasuredHeight();
                    LayoutParams linearLayoutCompat$LayoutParams1 = (LayoutParams)view1.getLayoutParams();
                    v30 = v24;
                    if(z2) {
                        v31 = v20;
                        if(linearLayoutCompat$LayoutParams1.height != -1) {
                            v32 = view1.getBaseline();
                            goto label_76;
                        }
                    }
                    else {
                        v31 = v20;
                    }
                    v32 = -1;
                label_76:
                    v33 = v21;
                    switch((linearLayoutCompat$LayoutParams1.gravity >= 0 ? linearLayoutCompat$LayoutParams1.gravity : v21) & 0x70) {
                        case 16: {
                            v34 = (v17 - v16 - v19 - v29) / 2 + v16 + linearLayoutCompat$LayoutParams1.topMargin - linearLayoutCompat$LayoutParams1.bottomMargin;
                            break;
                        }
                        case 0x30: {
                            v34 = linearLayoutCompat$LayoutParams1.topMargin + v16;
                            if(v32 != -1) {
                                v34 = arr_v[1] - v32 + v34;
                            }
                            break;
                        }
                        case 80: {
                            v34 = v17 - v18 - v29 - linearLayoutCompat$LayoutParams1.bottomMargin;
                            if(v32 != -1) {
                                int v35 = view1.getMeasuredHeight();
                                v34 -= arr_v1[2] - (v35 - v32);
                            }
                            break;
                        }
                        default: {
                            v34 = v16;
                        }
                    }
                    if(this.hasDividerBeforeChildAt(v26)) {
                        v22 += this.l;
                    }
                    int v36 = v22 + linearLayoutCompat$LayoutParams1.leftMargin;
                    view1.layout(v36, v34, v36 + v28, v34 + v29);
                    v22 = v28 + linearLayoutCompat$LayoutParams1.rightMargin + v36;
                    goto label_99;
                }
            }
            v30 = v24;
            v31 = v20;
            v33 = v21;
        label_99:
            ++v25;
            v23 = v27;
            v24 = v30;
            v20 = v31;
            v21 = v33;
        }
    }

    @Override  // android.view.View
    public void onMeasure(int v, int v1) {
        int v93;
        int v92;
        int v97;
        int v96;
        int v105;
        float f9;
        int v103;
        int v84;
        int v83;
        int v79;
        boolean z8;
        int v71;
        int v70;
        int v69;
        LayoutParams linearLayoutCompat$LayoutParams6;
        int v68;
        int v72;
        boolean z7;
        boolean z6;
        int v67;
        int v39;
        int v24;
        boolean z2;
        int v21;
        int v18;
        LayoutParams linearLayoutCompat$LayoutParams1;
        int v17;
        int v16;
        int v15;
        int v14;
        int v19;
        if(this.d == 1) {
            this.f = 0;
            int v2 = this.getVirtualChildCount();
            int v3 = View.MeasureSpec.getMode(v);
            int v4 = View.MeasureSpec.getMode(v1);
            int v5 = this.b;
            boolean z = this.h;
            int v6 = 1;
            int v7 = 0;
            int v8 = 0;
            int v9 = 0;
            int v10 = 0;
            int v11 = 0;
            int v12 = 0;
            int v13 = 0;
            boolean z1 = false;
            float f = 0.0f;
            while(v7 < v2) {
                View view0 = this.getChildAt(v7);
                if(view0 == null) {
                    this.f = this.f;
                }
                else if(view0.getVisibility() != 8) {
                    if(this.hasDividerBeforeChildAt(v7)) {
                        this.f += this.m;
                    }
                    LayoutParams linearLayoutCompat$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                    float f1 = linearLayoutCompat$LayoutParams0.weight;
                    f += f1;
                    if(v4 != 0x40000000 || linearLayoutCompat$LayoutParams0.height != 0 || f1 <= 0.0f) {
                        if(linearLayoutCompat$LayoutParams0.height != 0 || f1 <= 0.0f) {
                            v19 = 0x80000000;
                        }
                        else {
                            linearLayoutCompat$LayoutParams0.height = -2;
                            v19 = 0;
                        }
                        v14 = v5;
                        v15 = v4;
                        v16 = v3;
                        v17 = v2;
                        linearLayoutCompat$LayoutParams1 = linearLayoutCompat$LayoutParams0;
                        this.measureChildWithMargins(view0, v, 0, v1, (f == 0.0f ? this.f : 0));
                        if(v19 != 0x80000000) {
                            linearLayoutCompat$LayoutParams1.height = v19;
                        }
                        int v20 = view0.getMeasuredHeight();
                        this.f = Math.max(this.f, this.f + v20 + linearLayoutCompat$LayoutParams1.topMargin + linearLayoutCompat$LayoutParams1.bottomMargin);
                        if(z) {
                            v11 = Math.max(v20, v11);
                        }
                        v18 = v10;
                    }
                    else {
                        this.f = Math.max(this.f, linearLayoutCompat$LayoutParams0.topMargin + this.f + linearLayoutCompat$LayoutParams0.bottomMargin);
                        v14 = v5;
                        v15 = 0x40000000;
                        v16 = v3;
                        v17 = v2;
                        linearLayoutCompat$LayoutParams1 = linearLayoutCompat$LayoutParams0;
                        v18 = 1;
                    }
                    if(v14 >= 0 && v14 == v7 + 1) {
                        this.c = this.f;
                    }
                    if(v7 < v14 && linearLayoutCompat$LayoutParams1.weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won\'t work.  Either remove the weight, or don\'t set mBaselineAlignedChildIndex.");
                    }
                    v21 = v16;
                    if(v21 == 0x40000000 || linearLayoutCompat$LayoutParams1.width != -1) {
                        z2 = false;
                    }
                    else {
                        z2 = true;
                        z1 = true;
                    }
                    int v22 = linearLayoutCompat$LayoutParams1.leftMargin + linearLayoutCompat$LayoutParams1.rightMargin;
                    int v23 = view0.getMeasuredWidth() + v22;
                    v24 = Math.max(v12, v23);
                    int v25 = View.combineMeasuredStates(v13, view0.getMeasuredState());
                    int v26 = v6 == 0 || linearLayoutCompat$LayoutParams1.width != -1 ? 0 : 1;
                    if(linearLayoutCompat$LayoutParams1.weight > 0.0f) {
                        if(!z2) {
                            v22 = v23;
                        }
                        v9 = Math.max(v9, v22);
                    }
                    else {
                        if(!z2) {
                            v22 = v23;
                        }
                        v8 = Math.max(v8, v22);
                    }
                    v10 = v18;
                    v13 = v25;
                    v6 = v26;
                    goto label_87;
                }
                v14 = v5;
                v15 = v4;
                v21 = v3;
                v17 = v2;
                v24 = v12;
            label_87:
                ++v7;
                v3 = v21;
                v12 = v24;
                v5 = v14;
                v4 = v15;
                v2 = v17;
            }
            int v27 = v8;
            int v28 = v12;
            int v29 = v13;
            if(this.f > 0 && this.hasDividerBeforeChildAt(v2)) {
                this.f += this.m;
            }
            int v30 = v4;
            if(z && (v30 == 0x80000000 || v30 == 0)) {
                this.f = 0;
                for(int v31 = 0; v31 < v2; ++v31) {
                    View view1 = this.getChildAt(v31);
                    if(view1 == null) {
                        this.f = this.f;
                    }
                    else if(view1.getVisibility() != 8) {
                        LayoutParams linearLayoutCompat$LayoutParams2 = (LayoutParams)view1.getLayoutParams();
                        this.f = Math.max(this.f, this.f + v11 + linearLayoutCompat$LayoutParams2.topMargin + linearLayoutCompat$LayoutParams2.bottomMargin);
                    }
                }
            }
            int v32 = this.f;
            int v33 = this.getPaddingTop();
            int v34 = this.getPaddingBottom() + v33 + v32;
            this.f = v34;
            int v35 = View.resolveSizeAndState(Math.max(v34, this.getSuggestedMinimumHeight()), v1, 0);
            int v36 = (0xFFFFFF & v35) - this.f;
            if(v10 != 0 || v36 != 0 && f > 0.0f) {
                float f2 = this.g;
                if(f2 > 0.0f) {
                    f = f2;
                }
                this.f = 0;
                int v38 = 0;
                while(v38 < v2) {
                    View view3 = this.getChildAt(v38);
                    if(view3.getVisibility() == 8) {
                        v39 = v30;
                    }
                    else {
                        LayoutParams linearLayoutCompat$LayoutParams3 = (LayoutParams)view3.getLayoutParams();
                        float f3 = linearLayoutCompat$LayoutParams3.weight;
                        if(f3 > 0.0f) {
                            int v40 = (int)(((float)v36) * f3 / f);
                            f -= f3;
                            int v41 = this.getPaddingLeft();
                            int v42 = v36 - v40;
                            int v43 = ViewGroup.getChildMeasureSpec(v, this.getPaddingRight() + v41 + linearLayoutCompat$LayoutParams3.leftMargin + linearLayoutCompat$LayoutParams3.rightMargin, linearLayoutCompat$LayoutParams3.width);
                            if(linearLayoutCompat$LayoutParams3.height != 0 || v30 != 0x40000000) {
                                int v44 = view3.getMeasuredHeight() + v40;
                                if(v44 < 0) {
                                    v44 = 0;
                                }
                                view3.measure(v43, View.MeasureSpec.makeMeasureSpec(v44, 0x40000000));
                            }
                            else {
                                if(v40 <= 0) {
                                    v40 = 0;
                                }
                                view3.measure(v43, View.MeasureSpec.makeMeasureSpec(v40, 0x40000000));
                            }
                            v29 = View.combineMeasuredStates(v29, view3.getMeasuredState() & 0xFFFFFF00);
                            v36 = v42;
                        }
                        int v45 = linearLayoutCompat$LayoutParams3.leftMargin + linearLayoutCompat$LayoutParams3.rightMargin;
                        int v46 = view3.getMeasuredWidth() + v45;
                        int v47 = Math.max(v28, v46);
                        if(v3 == 0x40000000) {
                            v39 = v30;
                        }
                        else {
                            v39 = v30;
                            if(linearLayoutCompat$LayoutParams3.width == -1) {
                                goto label_168;
                            }
                        }
                        v45 = v46;
                    label_168:
                        v27 = Math.max(v27, v45);
                        int v48 = v6 == 0 || linearLayoutCompat$LayoutParams3.width != -1 ? 0 : 1;
                        int v49 = this.f;
                        this.f = Math.max(v49, view3.getMeasuredHeight() + v49 + linearLayoutCompat$LayoutParams3.topMargin + linearLayoutCompat$LayoutParams3.bottomMargin);
                        v6 = v48;
                        v28 = v47;
                    }
                    ++v38;
                    v30 = v39;
                }
                int v50 = this.f;
                int v51 = this.getPaddingTop();
                this.f = this.getPaddingBottom() + v51 + v50;
            }
            else {
                v27 = Math.max(v27, v9);
                if(z && v30 != 0x40000000) {
                    for(int v37 = 0; v37 < v2; ++v37) {
                        View view2 = this.getChildAt(v37);
                        if(view2 != null && view2.getVisibility() != 8 && ((LayoutParams)view2.getLayoutParams()).weight > 0.0f) {
                            view2.measure(View.MeasureSpec.makeMeasureSpec(view2.getMeasuredWidth(), 0x40000000), View.MeasureSpec.makeMeasureSpec(v11, 0x40000000));
                        }
                    }
                }
            }
            if(v6 != 0 || v3 == 0x40000000) {
                v27 = v28;
            }
            int v52 = this.getPaddingLeft();
            this.setMeasuredDimension(View.resolveSizeAndState(Math.max(this.getPaddingRight() + v52 + v27, this.getSuggestedMinimumWidth()), v, v29), v35);
            if(z1) {
                int v53 = View.MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0x40000000);
                for(int v54 = 0; v54 < v2; ++v54) {
                    View view4 = this.getChildAt(v54);
                    if(view4.getVisibility() != 8) {
                        LayoutParams linearLayoutCompat$LayoutParams4 = (LayoutParams)view4.getLayoutParams();
                        if(linearLayoutCompat$LayoutParams4.width == -1) {
                            int v55 = linearLayoutCompat$LayoutParams4.height;
                            linearLayoutCompat$LayoutParams4.height = view4.getMeasuredHeight();
                            this.measureChildWithMargins(view4, v53, 0, v1, 0);
                            linearLayoutCompat$LayoutParams4.height = v55;
                        }
                    }
                }
            }
        }
        else {
            this.f = 0;
            int v56 = this.getVirtualChildCount();
            int v57 = View.MeasureSpec.getMode(v);
            int v58 = View.MeasureSpec.getMode(v1);
            if(this.i == null || this.j == null) {
                this.i = new int[4];
                this.j = new int[4];
            }
            int[] arr_v = this.i;
            int[] arr_v1 = this.j;
            arr_v[3] = -1;
            arr_v[2] = -1;
            arr_v[1] = -1;
            arr_v[0] = -1;
            arr_v1[3] = -1;
            arr_v1[2] = -1;
            arr_v1[1] = -1;
            arr_v1[0] = -1;
            boolean z3 = this.a;
            boolean z4 = this.h;
            int v59 = 1;
            int v60 = 0;
            float f4 = 0.0f;
            int v61 = 0;
            int v62 = 0;
            int v63 = 0;
            int v64 = 0;
            int v65 = 0;
            int v66 = 0;
            boolean z5 = false;
            while(v62 < v56) {
                View view5 = this.getChildAt(v62);
                if(view5 == null) {
                    this.f = this.f;
                    v67 = v62;
                    z6 = z4;
                    z7 = z3;
                }
                else if(view5.getVisibility() == 8) {
                    z7 = z3;
                    v67 = v62;
                    z6 = z4;
                }
                else {
                    if(this.hasDividerBeforeChildAt(v62)) {
                        this.f += this.l;
                    }
                    LayoutParams linearLayoutCompat$LayoutParams5 = (LayoutParams)view5.getLayoutParams();
                    float f5 = linearLayoutCompat$LayoutParams5.weight;
                    float f6 = f4 + f5;
                    if(v57 != 0x40000000 || linearLayoutCompat$LayoutParams5.width != 0 || f5 <= 0.0f) {
                    label_270:
                        if(linearLayoutCompat$LayoutParams5.width != 0 || f5 <= 0.0f) {
                            v72 = 0x80000000;
                        }
                        else {
                            linearLayoutCompat$LayoutParams5.width = -2;
                            v72 = 0;
                        }
                        v69 = v60;
                        v70 = v61;
                        v67 = v62;
                        z6 = z4;
                        z7 = z3;
                        this.measureChildWithMargins(view5, v, (f6 == 0.0f ? this.f : 0), v1, 0);
                        if(v72 == 0x80000000) {
                            linearLayoutCompat$LayoutParams6 = linearLayoutCompat$LayoutParams5;
                        }
                        else {
                            linearLayoutCompat$LayoutParams6 = linearLayoutCompat$LayoutParams5;
                            linearLayoutCompat$LayoutParams6.width = v72;
                        }
                        int v73 = view5.getMeasuredWidth();
                        this.f = v57 == 0x40000000 ? linearLayoutCompat$LayoutParams6.leftMargin + v73 + linearLayoutCompat$LayoutParams6.rightMargin + this.f : Math.max(this.f, this.f + v73 + linearLayoutCompat$LayoutParams6.leftMargin + linearLayoutCompat$LayoutParams6.rightMargin);
                        if(z6) {
                            v64 = Math.max(v73, v64);
                        }
                    }
                    else {
                        if(v57 == 0x40000000) {
                            v68 = v62;
                            this.f = linearLayoutCompat$LayoutParams5.leftMargin + linearLayoutCompat$LayoutParams5.rightMargin + this.f;
                        }
                        else {
                            v68 = v62;
                            this.f = Math.max(this.f, linearLayoutCompat$LayoutParams5.leftMargin + this.f + linearLayoutCompat$LayoutParams5.rightMargin);
                        }
                        if(z3) {
                            view5.measure(0, 0);
                            linearLayoutCompat$LayoutParams6 = linearLayoutCompat$LayoutParams5;
                            v69 = v60;
                            v70 = v61;
                            v67 = v68;
                            z6 = z4;
                            z7 = true;
                            goto label_293;
                        }
                        else {
                            linearLayoutCompat$LayoutParams6 = linearLayoutCompat$LayoutParams5;
                            v69 = v60;
                            v70 = v61;
                            v67 = v68;
                            z6 = z4;
                            z7 = false;
                            v71 = 1;
                            goto label_294;
                        }
                        goto label_270;
                    }
                label_293:
                    v71 = v66;
                label_294:
                    if(v58 == 0x40000000 || linearLayoutCompat$LayoutParams6.height != -1) {
                        z8 = false;
                    }
                    else {
                        z8 = true;
                        z5 = true;
                    }
                    int v74 = linearLayoutCompat$LayoutParams6.topMargin + linearLayoutCompat$LayoutParams6.bottomMargin;
                    int v75 = view5.getMeasuredHeight() + v74;
                    int v76 = View.combineMeasuredStates(v63, view5.getMeasuredState());
                    if(z7) {
                        int v77 = view5.getBaseline();
                        if(v77 != -1) {
                            int v78 = (((linearLayoutCompat$LayoutParams6.gravity >= 0 ? linearLayoutCompat$LayoutParams6.gravity : this.e) & 0x70) >> 4 & -2) >> 1;
                            v79 = v74;
                            arr_v[v78] = Math.max(arr_v[v78], v77);
                            arr_v1[v78] = Math.max(arr_v1[v78], v75 - v77);
                        }
                    }
                    else {
                        v79 = v74;
                    }
                    int v80 = Math.max(v70, v75);
                    int v81 = v59 == 0 || linearLayoutCompat$LayoutParams6.height != -1 ? 0 : 1;
                    if(linearLayoutCompat$LayoutParams6.weight > 0.0f) {
                        if(z8) {
                            v75 = v79;
                        }
                        v65 = Math.max(v65, v75);
                        v60 = v69;
                    }
                    else {
                        if(z8) {
                            v75 = v79;
                        }
                        v60 = Math.max(v69, v75);
                    }
                    v61 = v80;
                    v63 = v76;
                    v66 = v71;
                    v59 = v81;
                    f4 = f6;
                }
                v62 = v67 + 1;
                z4 = z6;
                z3 = z7;
            }
            if(this.f > 0 && this.hasDividerBeforeChildAt(v56)) {
                this.f += this.l;
            }
            int v82 = arr_v[1];
            if(v82 != -1 || arr_v[0] != -1 || arr_v[2] != -1 || arr_v[3] != -1) {
                v84 = v63;
                v83 = Math.max(v61, Math.max(arr_v1[3], Math.max(arr_v1[0], Math.max(arr_v1[1], arr_v1[2]))) + Math.max(arr_v[3], Math.max(arr_v[0], Math.max(v82, arr_v[2]))));
            }
            else {
                v83 = v61;
                v84 = v63;
            }
            if(z4 && (v57 == 0x80000000 || v57 == 0)) {
                this.f = 0;
                for(int v85 = 0; v85 < v56; ++v85) {
                    View view6 = this.getChildAt(v85);
                    if(view6 == null) {
                        this.f = this.f;
                    }
                    else if(view6.getVisibility() != 8) {
                        LayoutParams linearLayoutCompat$LayoutParams7 = (LayoutParams)view6.getLayoutParams();
                        this.f = v57 == 0x40000000 ? linearLayoutCompat$LayoutParams7.leftMargin + v64 + linearLayoutCompat$LayoutParams7.rightMargin + this.f : Math.max(this.f, this.f + v64 + linearLayoutCompat$LayoutParams7.leftMargin + linearLayoutCompat$LayoutParams7.rightMargin);
                    }
                }
            }
            int v86 = this.f;
            int v87 = this.getPaddingLeft();
            int v88 = this.getPaddingRight() + v87 + v86;
            this.f = v88;
            int v89 = View.resolveSizeAndState(Math.max(v88, this.getSuggestedMinimumWidth()), v, 0);
            int v90 = (0xFFFFFF & v89) - this.f;
            if(v66 != 0 || v90 != 0 && f4 > 0.0f) {
                float f7 = this.g;
                if(f7 > 0.0f) {
                    f4 = f7;
                }
                arr_v[3] = -1;
                arr_v[2] = -1;
                arr_v[1] = -1;
                arr_v[0] = -1;
                arr_v1[3] = -1;
                arr_v1[2] = -1;
                arr_v1[1] = -1;
                arr_v1[0] = -1;
                this.f = 0;
                int v94 = v84;
                v83 = -1;
                int v95 = 0;
                while(v95 < v56) {
                    View view8 = this.getChildAt(v95);
                    if(view8 != null && view8.getVisibility() != 8) {
                        LayoutParams linearLayoutCompat$LayoutParams8 = (LayoutParams)view8.getLayoutParams();
                        float f8 = linearLayoutCompat$LayoutParams8.weight;
                        if(f8 > 0.0f) {
                            v97 = v56;
                            int v98 = (int)(((float)v90) * f8 / f4);
                            int v99 = this.getPaddingTop();
                            int v100 = v90 - v98;
                            int v101 = ViewGroup.getChildMeasureSpec(v1, this.getPaddingBottom() + v99 + linearLayoutCompat$LayoutParams8.topMargin + linearLayoutCompat$LayoutParams8.bottomMargin, linearLayoutCompat$LayoutParams8.height);
                            if(linearLayoutCompat$LayoutParams8.width != 0 || v57 != 0x40000000) {
                                int v102 = view8.getMeasuredWidth() + v98;
                                if(v102 < 0) {
                                    v102 = 0;
                                }
                                view8.measure(View.MeasureSpec.makeMeasureSpec(v102, 0x40000000), v101);
                            }
                            else {
                                if(v98 <= 0) {
                                    v98 = 0;
                                }
                                view8.measure(View.MeasureSpec.makeMeasureSpec(v98, 0x40000000), v101);
                            }
                            v94 = View.combineMeasuredStates(v94, view8.getMeasuredState() & 0xFF000000);
                            f4 -= f8;
                            v103 = v100;
                        }
                        else {
                            v103 = v90;
                            v97 = v56;
                        }
                        if(v57 == 0x40000000) {
                            int v104 = this.f;
                            f9 = f4;
                            this.f = view8.getMeasuredWidth() + linearLayoutCompat$LayoutParams8.leftMargin + linearLayoutCompat$LayoutParams8.rightMargin + v104;
                            v105 = v103;
                        }
                        else {
                            f9 = f4;
                            int v106 = this.f;
                            v105 = v103;
                            this.f = Math.max(v106, view8.getMeasuredWidth() + v106 + linearLayoutCompat$LayoutParams8.leftMargin + linearLayoutCompat$LayoutParams8.rightMargin);
                        }
                        boolean z9 = v58 != 0x40000000 && linearLayoutCompat$LayoutParams8.height == -1;
                        int v107 = linearLayoutCompat$LayoutParams8.topMargin + linearLayoutCompat$LayoutParams8.bottomMargin;
                        int v108 = view8.getMeasuredHeight() + v107;
                        v83 = Math.max(v83, v108);
                        if(!z9) {
                            v107 = v108;
                        }
                        v60 = Math.max(v60, v107);
                        int v109 = v59 == 0 || linearLayoutCompat$LayoutParams8.height != -1 ? 0 : 1;
                        if(z3) {
                            int v110 = view8.getBaseline();
                            if(v110 != -1) {
                                int v111 = (((linearLayoutCompat$LayoutParams8.gravity >= 0 ? linearLayoutCompat$LayoutParams8.gravity : this.e) & 0x70) >> 4 & -2) >> 1;
                                arr_v[v111] = Math.max(arr_v[v111], v110);
                                arr_v1[v111] = Math.max(arr_v1[v111], v108 - v110);
                            }
                        }
                        v59 = v109;
                        v96 = v105;
                        f4 = f9;
                    }
                    else {
                        v96 = v90;
                        v97 = v56;
                    }
                    ++v95;
                    v90 = v96;
                    v56 = v97;
                }
                v92 = v56;
                int v112 = this.f;
                int v113 = this.getPaddingLeft();
                this.f = this.getPaddingRight() + v113 + v112;
                int v114 = arr_v[1];
                if(v114 != -1 || arr_v[0] != -1 || arr_v[2] != -1 || arr_v[3] != -1) {
                    v93 = 0;
                    v83 = Math.max(v83, Math.max(arr_v1[3], Math.max(arr_v1[0], Math.max(arr_v1[1], arr_v1[2]))) + Math.max(arr_v[3], Math.max(arr_v[0], Math.max(v114, arr_v[2]))));
                }
                else {
                    v93 = 0;
                }
                v84 = v94;
            }
            else {
                v60 = Math.max(v60, v65);
                if(z4 && v57 != 0x40000000) {
                    for(int v91 = 0; v91 < v56; ++v91) {
                        View view7 = this.getChildAt(v91);
                        if(view7 != null && view7.getVisibility() != 8 && ((LayoutParams)view7.getLayoutParams()).weight > 0.0f) {
                            view7.measure(View.MeasureSpec.makeMeasureSpec(v64, 0x40000000), View.MeasureSpec.makeMeasureSpec(view7.getMeasuredHeight(), 0x40000000));
                        }
                    }
                }
                v92 = v56;
                v93 = 0;
            }
            if(v59 != 0 || v58 == 0x40000000) {
                v60 = v83;
            }
            int v115 = this.getPaddingTop();
            this.setMeasuredDimension(v84 & 0xFF000000 | v89, View.resolveSizeAndState(Math.max(this.getPaddingBottom() + v115 + v60, this.getSuggestedMinimumHeight()), v1, v84 << 16));
            if(z5) {
                int v116 = View.MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0x40000000);
                while(v93 < v92) {
                    View view9 = this.getChildAt(v93);
                    if(view9.getVisibility() != 8) {
                        LayoutParams linearLayoutCompat$LayoutParams9 = (LayoutParams)view9.getLayoutParams();
                        if(linearLayoutCompat$LayoutParams9.height == -1) {
                            int v117 = linearLayoutCompat$LayoutParams9.width;
                            linearLayoutCompat$LayoutParams9.width = view9.getMeasuredWidth();
                            this.measureChildWithMargins(view9, v, 0, v116, 0);
                            linearLayoutCompat$LayoutParams9.width = v117;
                        }
                    }
                    ++v93;
                }
            }
        }
    }

    public void setBaselineAligned(boolean z) {
        this.a = z;
    }

    public void setBaselineAlignedChildIndex(int v) {
        if(v < 0 || v >= this.getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + this.getChildCount() + ")");
        }
        this.b = v;
    }

    public void setDividerDrawable(Drawable drawable0) {
        if(drawable0 == this.k) {
            return;
        }
        this.k = drawable0;
        boolean z = false;
        if(drawable0 == null) {
            this.l = 0;
            this.m = 0;
        }
        else {
            this.l = drawable0.getIntrinsicWidth();
            this.m = drawable0.getIntrinsicHeight();
        }
        if(drawable0 == null) {
            z = true;
        }
        this.setWillNotDraw(z);
        this.requestLayout();
    }

    public void setDividerPadding(int v) {
        this.o = v;
    }

    public void setGravity(@GravityInt int v) {
        if(this.e != v) {
            if((0x800007 & v) == 0) {
                v |= 0x800003;
            }
            if((v & 0x70) == 0) {
                v |= 0x30;
            }
            this.e = v;
            this.requestLayout();
        }
    }

    public void setHorizontalGravity(int v) {
        int v1 = this.e;
        if((0x800007 & v1) != (v & 0x800007)) {
            this.e = v & 0x800007 | 0xFF7FFFF8 & v1;
            this.requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.h = z;
    }

    public void setOrientation(int v) {
        if(this.d != v) {
            this.d = v;
            this.requestLayout();
        }
    }

    public void setShowDividers(int v) {
        if(v != this.n) {
            this.requestLayout();
        }
        this.n = v;
    }

    public void setVerticalGravity(int v) {
        int v1 = this.e;
        if((v1 & 0x70) != (v & 0x70)) {
            this.e = v & 0x70 | v1 & 0xFFFFFF8F;
            this.requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.g = Math.max(0.0f, f);
    }

    @Override  // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}

