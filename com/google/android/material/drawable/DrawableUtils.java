package com.google.android.material.drawable;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.XmlResourceParser;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.XmlRes;
import androidx.core.graphics.drawable.DrawableCompat;
import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;
import s1.c;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class DrawableUtils {
    public static final int INTRINSIC_SIZE = -1;

    @Nullable
    public static Drawable compositeTwoLayeredDrawable(@Nullable Drawable drawable0, @Nullable Drawable drawable1) {
        return DrawableUtils.compositeTwoLayeredDrawable(drawable0, drawable1, -1, -1);
    }

    @Nullable
    public static Drawable compositeTwoLayeredDrawable(@Nullable Drawable drawable0, @Nullable Drawable drawable1, @Px int v, @Px int v1) {
        if(drawable0 == null) {
            return drawable1;
        }
        if(drawable1 == null) {
            return drawable0;
        }
        if(v == -1) {
            v = drawable1.getIntrinsicWidth();
            if(v == -1) {
                v = drawable0.getIntrinsicWidth();
            }
        }
        if(v1 == -1) {
            v1 = drawable1.getIntrinsicHeight();
            if(v1 == -1) {
                v1 = drawable0.getIntrinsicHeight();
            }
        }
        if(v > drawable0.getIntrinsicWidth() || v1 > drawable0.getIntrinsicHeight()) {
            float f = ((float)v) / ((float)v1);
            if(f >= ((float)drawable0.getIntrinsicWidth()) / ((float)drawable0.getIntrinsicHeight())) {
                int v2 = drawable0.getIntrinsicWidth();
                v1 = (int)(((float)v2) / f);
                v = v2;
            }
            else {
                v1 = drawable0.getIntrinsicHeight();
                v = (int)(f * ((float)v1));
            }
        }
        Drawable drawable2 = new LayerDrawable(new Drawable[]{drawable0, drawable1});
        ((LayerDrawable)drawable2).setLayerSize(1, v, v1);
        ((LayerDrawable)drawable2).setLayerGravity(1, 17);
        return drawable2;
    }

    @Nullable
    public static Drawable createTintableDrawableIfNeeded(@Nullable Drawable drawable0, @Nullable ColorStateList colorStateList0, @Nullable PorterDuff.Mode porterDuff$Mode0) {
        if(drawable0 == null) {
            return null;
        }
        if(colorStateList0 != null) {
            drawable0 = drawable0.mutate();
            if(porterDuff$Mode0 != null) {
                DrawableCompat.setTintMode(drawable0, porterDuff$Mode0);
            }
        }
        return drawable0;
    }

    @Nullable
    public static Drawable createTintableMutatedDrawableIfNeeded(@Nullable Drawable drawable0, @Nullable ColorStateList colorStateList0, @Nullable PorterDuff.Mode porterDuff$Mode0) {
        if(drawable0 == null) {
            return null;
        }
        if(colorStateList0 != null) {
            drawable0 = drawable0.mutate();
            if(porterDuff$Mode0 != null) {
                DrawableCompat.setTintMode(drawable0, porterDuff$Mode0);
            }
        }
        return drawable0;
    }

    @NonNull
    public static int[] getCheckedState(@NonNull int[] arr_v) {
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(v1 == 0x10100A0) {
                return arr_v;
            }
            if(v1 == 0) {
                int[] arr_v1 = (int[])arr_v.clone();
                arr_v1[v] = 0x10100A0;
                return arr_v1;
            }
        }
        int[] arr_v2 = Arrays.copyOf(arr_v, arr_v.length + 1);
        arr_v2[arr_v.length] = 0x10100A0;
        return arr_v2;
    }

    @Nullable
    public static ColorStateList getColorStateListOrNull(@Nullable Drawable drawable0) {
        if(drawable0 instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable)drawable0).getColor());
        }
        return Build.VERSION.SDK_INT < 29 || !c.u(drawable0) ? null : ((ColorStateListDrawable)drawable0).getColorStateList();
    }

    @NonNull
    public static int[] getUncheckedState(@NonNull int[] arr_v) {
        int[] arr_v1 = new int[arr_v.length];
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            int v2 = arr_v[v];
            if(v2 != 0x10100A0) {
                arr_v1[v1] = v2;
                ++v1;
            }
        }
        return arr_v1;
    }

    @NonNull
    public static AttributeSet parseDrawableXml(@NonNull Context context0, @XmlRes int v, @NonNull CharSequence charSequence0) {
        try {
            XmlResourceParser xmlResourceParser0 = context0.getResources().getXml(v);
            do {
                int v1 = xmlResourceParser0.next();
            }
            while(v1 != 1 && v1 != 2);
            if(v1 != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if(!TextUtils.equals(xmlResourceParser0.getName(), charSequence0)) {
                throw new XmlPullParserException("Must have a <" + charSequence0 + "> start tag");
            }
            return Xml.asAttributeSet(xmlResourceParser0);
        }
        catch(XmlPullParserException | IOException xmlPullParserException0) {
        }
        Resources.NotFoundException resources$NotFoundException0 = new Resources.NotFoundException("Can\'t load badge resource ID #0x" + Integer.toHexString(v));
        resources$NotFoundException0.initCause(xmlPullParserException0);
        throw resources$NotFoundException0;
    }

    public static void setOutlineToPath(@NonNull Outline outline0, @NonNull Path path0) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 30) {
            outline0.setPath(path0);
            return;
        }
        if(v >= 29) {
            try {
                outline0.setConvexPath(path0);
            }
            catch(IllegalArgumentException unused_ex) {
            }
        }
        else if(path0.isConvex()) {
            outline0.setConvexPath(path0);
        }
    }

    @TargetApi(21)
    public static void setRippleDrawableRadius(@Nullable RippleDrawable rippleDrawable0, int v) {
        rippleDrawable0.setRadius(v);
    }

    public static void setTint(@NonNull Drawable drawable0, @ColorInt int v) {
        if(v != 0) {
            DrawableCompat.setTint(drawable0, v);
            return;
        }
        DrawableCompat.setTintList(drawable0, null);
    }

    @Nullable
    public static PorterDuffColorFilter updateTintFilter(@NonNull Drawable drawable0, @Nullable ColorStateList colorStateList0, @Nullable PorterDuff.Mode porterDuff$Mode0) {
        return colorStateList0 == null || porterDuff$Mode0 == null ? null : new PorterDuffColorFilter(colorStateList0.getColorForState(drawable0.getState(), 0), porterDuff$Mode0);
    }
}

