package com.kakao.tistory.presentation.common.extension;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import md.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u001A1\u0010\u0005\u001A\u00020\u0002*\u00020\u00002\u000E\b\u0002\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00020\u00012\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001A;\u0010\t\u001A\u00020\u0002*\u00020\u00002\u000E\b\u0002\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00020\u00012\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroid/view/View;", "Lkotlin/Function0;", "", "onStart", "onEnd", "animShow", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "hideVisibility", "animHide", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class AnimationExtensionKt {
    public static final Lazy a;

    static {
        AnimationExtensionKt.a = c.lazy(a.a);
    }

    public static final void animHide(@NotNull View view0, @NotNull Function0 function00, @NotNull Function0 function01, int v) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        Intrinsics.checkNotNullParameter(function00, "onStart");
        Intrinsics.checkNotNullParameter(function01, "onEnd");
        view0.animate().cancel();
        view0.animate().alpha(0.0f).setInterpolator(((AccelerateInterpolator)AnimationExtensionKt.a.getValue())).setDuration(200L).setListener(new AnimatorListenerAdapter() {
            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(@NotNull Animator animator0) {
                Intrinsics.checkNotNullParameter(animator0, "animation");
                function01.invoke();
                view0.setVisibility(v);
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(@NotNull Animator animator0) {
                Intrinsics.checkNotNullParameter(animator0, "animation");
                function00.invoke();
                view0.setVisibility(v);
            }
        });
    }

    public static void animHide$default(View view0, Function0 function00, Function0 function01, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            function00 = b.a;
        }
        if((v1 & 2) != 0) {
            function01 = com.kakao.tistory.presentation.common.extension.c.a;
        }
        if((v1 & 4) != 0) {
            v = 8;
        }
        AnimationExtensionKt.animHide(view0, function00, function01, v);
    }

    public static final void animShow(@NotNull View view0, @NotNull Function0 function00, @NotNull Function0 function01) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        Intrinsics.checkNotNullParameter(function00, "onStart");
        Intrinsics.checkNotNullParameter(function01, "onEnd");
        view0.animate().cancel();
        view0.animate().alpha(1.0f).setInterpolator(((AccelerateInterpolator)AnimationExtensionKt.a.getValue())).setDuration(200L).setListener(new AnimatorListenerAdapter() {
            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(@NotNull Animator animator0) {
                Intrinsics.checkNotNullParameter(animator0, "animator");
                function01.invoke();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(@NotNull Animator animator0) {
                Intrinsics.checkNotNullParameter(animator0, "animator");
                function00.invoke();
                view0.setVisibility(0);
            }
        });
    }

    public static void animShow$default(View view0, Function0 function00, Function0 function01, int v, Object object0) {
        if((v & 1) != 0) {
            function00 = d.a;
        }
        if((v & 2) != 0) {
            function01 = e.a;
        }
        AnimationExtensionKt.animShow(view0, function00, function01);
    }
}

