package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.R.attr;
import com.google.android.material.R.styleable;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(@NonNull Context context0) {
        this(context0, null);
    }

    public MaterialTextView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0x1010084);
    }

    public MaterialTextView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(MaterialThemeOverlay.wrap(context0, attributeSet0, v, 0), attributeSet0, v);
        this.n(attributeSet0, v, 0);
    }

    @Deprecated
    public MaterialTextView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v, int v1) {
        super(MaterialThemeOverlay.wrap(context0, attributeSet0, v, v1), attributeSet0, v);
        this.n(attributeSet0, v, v1);
    }

    public final void n(AttributeSet attributeSet0, int v, int v1) {
        Context context0 = this.getContext();
        if(MaterialAttributes.resolveBoolean(context0, attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme resources$Theme0 = context0.getTheme();
            TypedArray typedArray0 = resources$Theme0.obtainStyledAttributes(attributeSet0, styleable.MaterialTextView, v, v1);
            int[] arr_v = {styleable.MaterialTextView_android_lineHeight, styleable.MaterialTextView_lineHeight};
            int v4 = -1;
            for(int v3 = 0; v3 < 2 && v4 < 0; ++v3) {
                v4 = MaterialResources.getDimensionPixelSize(context0, typedArray0, arr_v[v3], -1);
            }
            typedArray0.recycle();
            if(v4 == -1) {
                TypedArray typedArray1 = resources$Theme0.obtainStyledAttributes(attributeSet0, styleable.MaterialTextView, v, v1);
                int v5 = typedArray1.getResourceId(styleable.MaterialTextView_android_textAppearance, -1);
                typedArray1.recycle();
                if(v5 != -1) {
                    TypedArray typedArray2 = resources$Theme0.obtainStyledAttributes(v5, styleable.MaterialTextAppearance);
                    Context context1 = this.getContext();
                    int[] arr_v1 = {styleable.MaterialTextAppearance_android_lineHeight, styleable.MaterialTextAppearance_lineHeight};
                    int v6 = -1;
                    for(int v2 = 0; v2 < 2 && v6 < 0; ++v2) {
                        v6 = MaterialResources.getDimensionPixelSize(context1, typedArray2, arr_v1[v2], -1);
                    }
                    typedArray2.recycle();
                    if(v6 >= 0) {
                        this.setLineHeight(v6);
                    }
                }
            }
        }
    }

    @Override  // androidx.appcompat.widget.AppCompatTextView
    public void setTextAppearance(@NonNull Context context0, int v) {
        super.setTextAppearance(context0, v);
        if(MaterialAttributes.resolveBoolean(context0, attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(v, styleable.MaterialTextAppearance);
            Context context1 = this.getContext();
            int[] arr_v = {styleable.MaterialTextAppearance_android_lineHeight, styleable.MaterialTextAppearance_lineHeight};
            int v2 = -1;
            for(int v1 = 0; v1 < 2 && v2 < 0; ++v1) {
                v2 = MaterialResources.getDimensionPixelSize(context1, typedArray0, arr_v[v1], -1);
            }
            typedArray0.recycle();
            if(v2 >= 0) {
                this.setLineHeight(v2);
            }
        }
    }
}

