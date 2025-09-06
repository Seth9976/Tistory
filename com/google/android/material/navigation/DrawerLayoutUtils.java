package com.google.android.material.navigation;

import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Color;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.view.a1;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.motion.e;

@RestrictTo({Scope.LIBRARY_GROUP})
public class DrawerLayoutUtils {
    public static final int a;

    static {
        DrawerLayoutUtils.a = Color.alpha(0x99000000);
    }

    @NonNull
    public static Animator.AnimatorListener getScrimCloseAnimatorListener(@NonNull DrawerLayout drawerLayout0, @NonNull View view0) {
        return new a1(drawerLayout0, view0, 4);
    }

    @NonNull
    public static ValueAnimator.AnimatorUpdateListener getScrimCloseAnimatorUpdateListener(@NonNull DrawerLayout drawerLayout0) {
        return new e(drawerLayout0, 6);
    }
}

