package com.google.android.material.shape;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.internal.ViewUtils;

public class MaterialShapeUtils {
    public static CornerTreatment a(int v) {
        switch(v) {
            case 0: {
                return new RoundedCornerTreatment();
            }
            case 1: {
                return new CutCornerTreatment();
            }
            default: {
                return new RoundedCornerTreatment();
            }
        }
    }

    public static void setElevation(@NonNull View view0, float f) {
        Drawable drawable0 = view0.getBackground();
        if(drawable0 instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable)drawable0).setElevation(f);
        }
    }

    public static void setParentAbsoluteElevation(@NonNull View view0) {
        Drawable drawable0 = view0.getBackground();
        if(drawable0 instanceof MaterialShapeDrawable) {
            MaterialShapeUtils.setParentAbsoluteElevation(view0, ((MaterialShapeDrawable)drawable0));
        }
    }

    public static void setParentAbsoluteElevation(@NonNull View view0, @NonNull MaterialShapeDrawable materialShapeDrawable0) {
        if(materialShapeDrawable0.isElevationOverlayEnabled()) {
            materialShapeDrawable0.setParentAbsoluteElevation(ViewUtils.getParentAbsoluteElevation(view0));
        }
    }
}

