package com.google.android.material.animation;

import android.util.Property;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.material.R.id;

public class ChildrenAlphaProperty extends Property {
    public static final Property CHILDREN_ALPHA;

    static {
        ChildrenAlphaProperty.CHILDREN_ALPHA = new ChildrenAlphaProperty(Float.class, "childrenAlpha");  // 初始化器: Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V
    }

    @NonNull
    public Float get(@NonNull ViewGroup viewGroup0) {
        Float float0 = (Float)viewGroup0.getTag(id.mtrl_internal_children_alpha_tag);
        return float0 == null ? 1.0f : float0;
    }

    @Override  // android.util.Property
    @NonNull
    public Object get(@NonNull Object object0) {
        return this.get(((ViewGroup)object0));
    }

    public void set(@NonNull ViewGroup viewGroup0, @NonNull Float float0) {
        float f = (float)float0;
        viewGroup0.setTag(id.mtrl_internal_children_alpha_tag, float0);
        int v = viewGroup0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            viewGroup0.getChildAt(v1).setAlpha(f);
        }
    }

    @Override  // android.util.Property
    public void set(@NonNull Object object0, @NonNull Object object1) {
        this.set(((ViewGroup)object0), ((Float)object1));
    }
}

