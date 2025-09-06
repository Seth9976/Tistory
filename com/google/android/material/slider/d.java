package com.google.android.material.slider;

import android.graphics.Rect;
import android.os.Bundle;
import androidx.core.math.MathUtils;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.RangeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.material.R.string;
import java.util.List;

public final class d extends ExploreByTouchHelper {
    public final BaseSlider q;
    public final Rect r;

    public d(BaseSlider baseSlider0) {
        super(baseSlider0);
        this.r = new Rect();
        this.q = baseSlider0;
    }

    @Override  // androidx.customview.widget.ExploreByTouchHelper
    public final int getVirtualViewAt(float f, float f1) {
        for(int v = 0; true; ++v) {
            BaseSlider baseSlider0 = this.q;
            if(v >= baseSlider0.getValues().size()) {
                break;
            }
            baseSlider0.t(v, this.r);
            if(this.r.contains(((int)f), ((int)f1))) {
                return v;
            }
        }
        return -1;
    }

    @Override  // androidx.customview.widget.ExploreByTouchHelper
    public final void getVisibleVirtualViews(List list0) {
        for(int v = 0; v < this.q.getValues().size(); ++v) {
            list0.add(v);
        }
    }

    @Override  // androidx.customview.widget.ExploreByTouchHelper
    public final boolean onPerformActionForVirtualView(int v, int v1, Bundle bundle0) {
        BaseSlider baseSlider0 = this.q;
        if(!baseSlider0.isEnabled()) {
            return false;
        }
        if(v1 != 0x1000 && v1 != 0x2000) {
            if(v1 != 0x102003D) {
                return false;
            }
            if(bundle0 != null && bundle0.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") && baseSlider0.r(bundle0.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"), v)) {
                baseSlider0.u();
                baseSlider0.postInvalidate();
                this.invalidateVirtualView(v);
                return true;
            }
            return false;
        }
        float f = baseSlider0.O == 0.0f ? 1.0f : baseSlider0.O;
        float f1 = (baseSlider0.K - baseSlider0.J) / f;
        if(f1 > 20.0f) {
            f *= (float)Math.round(f1 / 20.0f);
        }
        if(v1 == 0x2000) {
            f = -f;
        }
        if(baseSlider0.j()) {
            f = -f;
        }
        if(baseSlider0.r(MathUtils.clamp(((float)(((Float)baseSlider0.getValues().get(v)))) + f, baseSlider0.getValueFrom(), baseSlider0.getValueTo()), v)) {
            baseSlider0.u();
            baseSlider0.postInvalidate();
            this.invalidateVirtualView(v);
            return true;
        }
        return false;
    }

    @Override  // androidx.customview.widget.ExploreByTouchHelper
    public final void onPopulateNodeForVirtualView(int v, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        String s2;
        accessibilityNodeInfoCompat0.addAction(AccessibilityActionCompat.ACTION_SET_PROGRESS);
        BaseSlider baseSlider0 = this.q;
        List list0 = baseSlider0.getValues();
        float f = (float)(((Float)list0.get(v)));
        float f1 = baseSlider0.getValueFrom();
        float f2 = baseSlider0.getValueTo();
        if(baseSlider0.isEnabled()) {
            if(f > f1) {
                accessibilityNodeInfoCompat0.addAction(0x2000);
            }
            if(f < f2) {
                accessibilityNodeInfoCompat0.addAction(0x1000);
            }
        }
        accessibilityNodeInfoCompat0.setRangeInfo(RangeInfoCompat.obtain(1, f1, f2, f));
        accessibilityNodeInfoCompat0.setClassName("android.widget.SeekBar");
        StringBuilder stringBuilder0 = new StringBuilder();
        if(baseSlider0.getContentDescription() != null) {
            stringBuilder0.append(baseSlider0.getContentDescription());
            stringBuilder0.append(",");
        }
        String s = baseSlider0.e(f);
        String s1 = baseSlider0.getContext().getString(string.material_slider_value);
        if(list0.size() > 1) {
            if(v == baseSlider0.getValues().size() - 1) {
                s2 = baseSlider0.getContext().getString(string.material_slider_range_end);
            }
            else {
                s2 = v == 0 ? baseSlider0.getContext().getString(string.material_slider_range_start) : "";
            }
            s1 = s2;
        }
        stringBuilder0.append(s1 + ", " + s);
        accessibilityNodeInfoCompat0.setContentDescription(stringBuilder0.toString());
        baseSlider0.t(v, this.r);
        accessibilityNodeInfoCompat0.setBoundsInParent(this.r);
    }
}

