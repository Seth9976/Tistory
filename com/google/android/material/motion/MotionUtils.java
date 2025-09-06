package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.core.graphics.PathParser;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.google.android.material.resources.MaterialAttributes;

public class MotionUtils {
    public static float a(int v, String[] arr_s) {
        float f = Float.parseFloat(arr_s[v]);
        if(f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
        }
        return f;
    }

    // 去混淆评级： 低(20)
    public static boolean b(String s, String s1) {
        return s.startsWith(s1 + "(") && s.endsWith(")");
    }

    public static int resolveThemeDuration(@NonNull Context context0, @AttrRes int v, int v1) {
        return MaterialAttributes.resolveInteger(context0, v, v1);
    }

    @NonNull
    public static TimeInterpolator resolveThemeInterpolator(@NonNull Context context0, @AttrRes int v, @NonNull TimeInterpolator timeInterpolator0) {
        TypedValue typedValue0 = new TypedValue();
        if(!context0.getTheme().resolveAttribute(v, typedValue0, true)) {
            return timeInterpolator0;
        }
        if(typedValue0.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String s = String.valueOf(typedValue0.string);
        if(!MotionUtils.b(s, "cubic-bezier") && !MotionUtils.b(s, "path")) {
            return AnimationUtils.loadInterpolator(context0, typedValue0.resourceId);
        }
        if(MotionUtils.b(s, "cubic-bezier")) {
            String[] arr_s = s.substring(13, s.length() - 1).split(",");
            if(arr_s.length != 4) {
                throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + arr_s.length);
            }
            return PathInterpolatorCompat.create(MotionUtils.a(0, arr_s), MotionUtils.a(1, arr_s), MotionUtils.a(2, arr_s), MotionUtils.a(3, arr_s));
        }
        if(!MotionUtils.b(s, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: " + s);
        }
        return PathInterpolatorCompat.create(PathParser.createPathFromPathData(s.substring(5, s.length() - 1)));
    }
}

