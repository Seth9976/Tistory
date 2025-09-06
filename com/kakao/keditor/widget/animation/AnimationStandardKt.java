package com.kakao.keditor.widget.animation;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.search.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001A8\u0010\u0002\u001A\u00020\u0003*\u00020\u00042\b\b\u0002\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00012\u0010\b\u0002\u0010\t\u001A\n\u0012\u0004\u0012\u00020\u000B\u0018\u00010\n\u001A6\u0010\f\u001A\u00020\u0003*\u00020\u00042\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010\u000E\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00012\u0010\b\u0002\u0010\t\u001A\n\u0012\u0004\u0012\u00020\u000B\u0018\u00010\n\u001A.\u0010\u000F\u001A\u00020\u0003*\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00012\u0010\b\u0002\u0010\t\u001A\n\u0012\u0004\u0012\u00020\u000B\u0018\u00010\n\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"DEFAULT_ANIM_DURATION", "", "animateToAlpha", "Landroid/animation/Animator;", "Landroid/view/View;", "from", "", "to", "duration", "afterAnimation", "Lkotlin/Function0;", "", "animateToMoveY", "fromY", "toY", "animateToScale", "scale", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class AnimationStandardKt {
    public static final long DEFAULT_ANIM_DURATION = 400L;

    public static void a(ValueAnimator valueAnimator0, View view0) {
        AnimationStandardKt.animateToMoveY$lambda$5$lambda$4(view0, valueAnimator0);
    }

    @NotNull
    public static final Animator animateToAlpha(@NotNull View view0, float f, float f1, long v, @Nullable Function0 function00) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        Animator animator0 = ValueAnimator.ofFloat(new float[]{view0.getScaleX(), f1});
        ((ValueAnimator)animator0).setDuration(v);
        ((ValueAnimator)animator0).addUpdateListener(new d(3, view0));
        animator0.addListener(new Animator.AnimatorListener() {
            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator0) {
                Intrinsics.checkNotNullParameter(animator0, "animation");
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator0) {
                Intrinsics.checkNotNullParameter(animator0, "animation");
                view0.setAlpha(f1);
                Function0 function00 = function00;
                if(function00 != null) {
                    function00.invoke();
                }
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator0) {
                Intrinsics.checkNotNullParameter(animator0, "animation");
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationStart(@NotNull Animator animator0) {
                Intrinsics.checkNotNullParameter(animator0, "animation");
            }
        });
        ((ValueAnimator)animator0).start();
        Intrinsics.checkNotNullExpressionValue(animator0, "apply(...)");
        return animator0;
    }

    public static Animator animateToAlpha$default(View view0, float f, float f1, long v, Function0 function00, int v1, Object object0) {
        if((v1 & 1) != 0) {
            f = view0.getAlpha();
        }
        if((v1 & 4) != 0) {
            v = 400L;
        }
        if((v1 & 8) != 0) {
            function00 = null;
        }
        return AnimationStandardKt.animateToAlpha(view0, f, f1, v, function00);
    }

    private static final void animateToAlpha$lambda$3$lambda$2(View view0, ValueAnimator valueAnimator0) {
        Intrinsics.checkNotNullParameter(view0, "$this_animateToAlpha");
        Intrinsics.checkNotNullParameter(valueAnimator0, "it");
        Object object0 = valueAnimator0.getAnimatedValue();
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Float");
        view0.setAlpha(((float)(((Float)object0))));
    }

    @NotNull
    public static final Animator animateToMoveY(@NotNull View view0, float f, float f1, long v, @Nullable Function0 function00) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        Animator animator0 = ValueAnimator.ofFloat(new float[]{f, f1});
        ((ValueAnimator)animator0).setDuration(v);
        ((ValueAnimator)animator0).addUpdateListener(new d(2, view0));
        animator0.addListener(new Animator.AnimatorListener() {
            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator0) {
                Intrinsics.checkNotNullParameter(animator0, "animation");
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator0) {
                Intrinsics.checkNotNullParameter(animator0, "animation");
                view0.setY(f1);
                Function0 function00 = function00;
                if(function00 != null) {
                    function00.invoke();
                }
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator0) {
                Intrinsics.checkNotNullParameter(animator0, "animation");
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationStart(@NotNull Animator animator0) {
                Intrinsics.checkNotNullParameter(animator0, "animation");
            }
        });
        ((ValueAnimator)animator0).start();
        Intrinsics.checkNotNullExpressionValue(animator0, "apply(...)");
        return animator0;
    }

    public static Animator animateToMoveY$default(View view0, float f, float f1, long v, Function0 function00, int v1, Object object0) {
        if((v1 & 4) != 0) {
            v = 400L;
        }
        if((v1 & 8) != 0) {
            function00 = null;
        }
        return AnimationStandardKt.animateToMoveY(view0, f, f1, v, function00);
    }

    private static final void animateToMoveY$lambda$5$lambda$4(View view0, ValueAnimator valueAnimator0) {
        Intrinsics.checkNotNullParameter(view0, "$this_animateToMoveY");
        Intrinsics.checkNotNullParameter(valueAnimator0, "it");
        Object object0 = valueAnimator0.getAnimatedValue();
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Float");
        view0.setY(((float)(((Float)object0))));
    }

    @NotNull
    public static final Animator animateToScale(@NotNull View view0, float f, long v, @Nullable Function0 function00) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        Animator animator0 = ValueAnimator.ofFloat(new float[]{view0.getScaleX(), f});
        ((ValueAnimator)animator0).setDuration(v);
        ((ValueAnimator)animator0).addUpdateListener(new d(1, view0));
        animator0.addListener(new Animator.AnimatorListener() {
            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator0) {
                Intrinsics.checkNotNullParameter(animator0, "animation");
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator0) {
                Intrinsics.checkNotNullParameter(animator0, "animation");
                view0.setScaleX(f);
                view0.setScaleY(f);
                Function0 function00 = function00;
                if(function00 != null) {
                    function00.invoke();
                }
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator0) {
                Intrinsics.checkNotNullParameter(animator0, "animation");
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationStart(@NotNull Animator animator0) {
                Intrinsics.checkNotNullParameter(animator0, "animation");
            }
        });
        ((ValueAnimator)animator0).start();
        Intrinsics.checkNotNullExpressionValue(animator0, "apply(...)");
        return animator0;
    }

    public static Animator animateToScale$default(View view0, float f, long v, Function0 function00, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 400L;
        }
        if((v1 & 4) != 0) {
            function00 = null;
        }
        return AnimationStandardKt.animateToScale(view0, f, v, function00);
    }

    private static final void animateToScale$lambda$1$lambda$0(View view0, ValueAnimator valueAnimator0) {
        Intrinsics.checkNotNullParameter(view0, "$this_animateToScale");
        Intrinsics.checkNotNullParameter(valueAnimator0, "it");
        Object object0 = valueAnimator0.getAnimatedValue();
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Float");
        view0.setScaleX(((float)(((Float)object0))));
        view0.setScaleY(view0.getScaleX());
    }

    public static void b(ValueAnimator valueAnimator0, View view0) {
        AnimationStandardKt.animateToAlpha$lambda$3$lambda$2(view0, valueAnimator0);
    }

    public static void c(ValueAnimator valueAnimator0, View view0) {
        AnimationStandardKt.animateToScale$lambda$1$lambda$0(view0, valueAnimator0);
    }
}

