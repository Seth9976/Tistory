package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition.Segment;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001#JO\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000F2\u000E\b\u0002\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00120\u00112#\b\u0002\u0010\u0013\u001A\u001D\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00150\u0014H&ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001AJO\u0010\u001B\u001A\u00020\b2\u0006\u0010\u000E\u001A\u00020\u000F2\u000E\b\u0002\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00120\u00112#\b\u0002\u0010\u001C\u001A\u001D\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00150\u0014H&ø\u0001\u0000¢\u0006\u0004\b\u001D\u0010\u001EJ\u0017\u0010\u001F\u001A\u00020 *\u00020 2\b\u0010!\u001A\u0004\u0018\u00010\"H¦\u0004R\u0012\u0010\u0003\u001A\u00020\u0004X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001A\u00020\b*\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\n\u0010\u000B\u0082\u0001\u0001$ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006%À\u0006\u0001"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScope;", "S", "Landroidx/compose/animation/core/Transition$Segment;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "getContentAlignment", "()Landroidx/compose/ui/Alignment;", "KeepUntilTransitionsFinished", "Landroidx/compose/animation/ExitTransition;", "Landroidx/compose/animation/ExitTransition$Companion;", "getKeepUntilTransitionsFinished", "(Landroidx/compose/animation/ExitTransition$Companion;)Landroidx/compose/animation/ExitTransition;", "slideIntoContainer", "Landroidx/compose/animation/EnterTransition;", "towards", "Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntOffset;", "initialOffset", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "offsetForFullSlide", "slideIntoContainer-mOhB8PU", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/EnterTransition;", "slideOutOfContainer", "targetOffset", "slideOutOfContainer-mOhB8PU", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/ExitTransition;", "using", "Landroidx/compose/animation/ContentTransform;", "sizeTransform", "Landroidx/compose/animation/SizeTransform;", "SlideDirection", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface AnimatedContentTransitionScope extends Segment {
    @Immutable
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\t\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000B\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001A\u0010\u0010\u001A\u00020\r2\b\u0010\f\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000E\u0010\u000F\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "Companion", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @JvmInline
    public static final class SlideDirection {
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000F\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006R\u001D\u0010\t\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0004\u001A\u0004\b\n\u0010\u0006R\u001D\u0010\u000B\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000B\u0010\u0004\u001A\u0004\b\f\u0010\u0006R\u001D\u0010\r\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0004\u001A\u0004\b\u000E\u0010\u0006R\u001D\u0010\u000F\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000F\u0010\u0004\u001A\u0004\b\u0010\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection$Companion;", "", "Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection;", "Left", "I", "getLeft-DKzdypw", "()I", "Right", "getRight-DKzdypw", "Up", "getUp-DKzdypw", "Down", "getDown-DKzdypw", "Start", "getStart-DKzdypw", "End", "getEnd-DKzdypw", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            // 去混淆评级： 低(20)
            public final int getDown-DKzdypw() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int getEnd-DKzdypw() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int getLeft-DKzdypw() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int getRight-DKzdypw() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int getStart-DKzdypw() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int getUp-DKzdypw() [...] // 潜在的解密器
        }

        @NotNull
        public static final Companion Companion;
        public final int a;
        public static final int b;
        public static final int c;
        public static final int d;
        public static final int e;
        public static final int f;
        public static final int g;

        static {
            SlideDirection.Companion = new Companion(null);
            SlideDirection.b = 0;
            SlideDirection.c = 1;
            SlideDirection.d = 2;
            SlideDirection.e = 3;
            SlideDirection.f = 4;
            SlideDirection.g = 5;
        }

        public SlideDirection(int v) {
            this.a = v;
        }

        public static final int access$getDown$cp() [...] // 潜在的解密器

        public static final int access$getEnd$cp() [...] // 潜在的解密器

        public static final int access$getLeft$cp() [...] // 潜在的解密器

        public static final int access$getRight$cp() [...] // 潜在的解密器

        public static final int access$getStart$cp() [...] // 潜在的解密器

        public static final int access$getUp$cp() [...] // 潜在的解密器

        public static final SlideDirection box-impl(int v) {
            return new SlideDirection(v);
        }

        public static int constructor-impl(int v) [...] // Inlined contents

        @Override
        public boolean equals(Object object0) {
            return SlideDirection.equals-impl(this.a, object0);
        }

        public static boolean equals-impl(int v, Object object0) {
            return object0 instanceof SlideDirection ? v == ((SlideDirection)object0).unbox-impl() : false;
        }

        public static final boolean equals-impl0(int v, int v1) {
            return v == v1;
        }

        @Override
        public int hashCode() {
            return SlideDirection.hashCode-impl(this.a);
        }

        public static int hashCode-impl(int v) {
            return v;
        }

        @Override
        @NotNull
        public String toString() {
            return SlideDirection.toString-impl(this.a);
        }

        @NotNull
        public static String toString-impl(int v) {
            if(SlideDirection.equals-impl0(v, SlideDirection.b)) {
                return "Left";
            }
            if(SlideDirection.equals-impl0(v, SlideDirection.c)) {
                return "Right";
            }
            if(SlideDirection.equals-impl0(v, SlideDirection.d)) {
                return "Up";
            }
            if(SlideDirection.equals-impl0(v, SlideDirection.e)) {
                return "Down";
            }
            if(SlideDirection.equals-impl0(v, SlideDirection.f)) {
                return "Start";
            }
            return SlideDirection.equals-impl0(v, SlideDirection.g) ? "End" : "Invalid";
        }

        public final int unbox-impl() {
            return this.a;
        }
    }

    @NotNull
    Alignment getContentAlignment();

    @NotNull
    default ExitTransition getKeepUntilTransitionsFinished(@NotNull androidx.compose.animation.ExitTransition.Companion exitTransition$Companion0) {
        return exitTransition$Companion0.getKeepUntilTransitionsFinished$animation_release();
    }

    @NotNull
    EnterTransition slideIntoContainer-mOhB8PU(int arg1, @NotNull FiniteAnimationSpec arg2, @NotNull Function1 arg3);

    static EnterTransition slideIntoContainer-mOhB8PU$default(AnimatedContentTransitionScope animatedContentTransitionScope0, int v, FiniteAnimationSpec finiteAnimationSpec0, Function1 function10, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideIntoContainer-mOhB8PU");
        }
        if((v1 & 2) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.box-impl(0x100000001L), 3, null);
        }
        if((v1 & 4) != 0) {
            function10 = c.w;
        }
        return animatedContentTransitionScope0.slideIntoContainer-mOhB8PU(v, finiteAnimationSpec0, function10);
    }

    @NotNull
    ExitTransition slideOutOfContainer-mOhB8PU(int arg1, @NotNull FiniteAnimationSpec arg2, @NotNull Function1 arg3);

    static ExitTransition slideOutOfContainer-mOhB8PU$default(AnimatedContentTransitionScope animatedContentTransitionScope0, int v, FiniteAnimationSpec finiteAnimationSpec0, Function1 function10, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideOutOfContainer-mOhB8PU");
        }
        if((v1 & 2) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.box-impl(0x100000001L), 3, null);
        }
        if((v1 & 4) != 0) {
            function10 = d.w;
        }
        return animatedContentTransitionScope0.slideOutOfContainer-mOhB8PU(v, finiteAnimationSpec0, function10);
    }

    @NotNull
    ContentTransform using(@NotNull ContentTransform arg1, @Nullable SizeTransform arg2);
}

