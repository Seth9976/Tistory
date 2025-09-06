package com.google.android.material.dialog;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.android.material.R.dimen;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.ThemeEnforcement;

@RestrictTo({Scope.LIBRARY_GROUP})
public class MaterialDialogs {
    @NonNull
    public static Rect getDialogBackgroundInsets(@NonNull Context context0, @AttrRes int v, int v1) {
        TypedArray typedArray0 = ThemeEnforcement.obtainStyledAttributes(context0, null, styleable.MaterialAlertDialog, v, v1, new int[0]);
        int v2 = typedArray0.getDimensionPixelSize(styleable.MaterialAlertDialog_backgroundInsetStart, context0.getResources().getDimensionPixelSize(dimen.mtrl_alert_dialog_background_inset_start));
        int v3 = typedArray0.getDimensionPixelSize(styleable.MaterialAlertDialog_backgroundInsetTop, context0.getResources().getDimensionPixelSize(dimen.mtrl_alert_dialog_background_inset_top));
        int v4 = typedArray0.getDimensionPixelSize(styleable.MaterialAlertDialog_backgroundInsetEnd, context0.getResources().getDimensionPixelSize(dimen.mtrl_alert_dialog_background_inset_end));
        int v5 = typedArray0.getDimensionPixelSize(styleable.MaterialAlertDialog_backgroundInsetBottom, context0.getResources().getDimensionPixelSize(dimen.mtrl_alert_dialog_background_inset_bottom));
        typedArray0.recycle();
        if(context0.getResources().getConfiguration().getLayoutDirection() == 1) {
            int v6 = v4;
            v4 = v2;
            v2 = v6;
        }
        return new Rect(v2, v3, v4, v5);
    }

    @NonNull
    public static InsetDrawable insetDrawable(@Nullable Drawable drawable0, @NonNull Rect rect0) {
        return new InsetDrawable(drawable0, rect0.left, rect0.top, rect0.right, rect0.bottom);
    }
}

