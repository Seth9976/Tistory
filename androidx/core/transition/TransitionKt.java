package androidx.core.transition;

import android.transition.Transition.TransitionListener;
import android.transition.Transition;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000B\u001AÆ\u0001\u0010\u0000\u001A\u00020\u0001*\u00020\u00022#\b\u0006\u0010\u0003\u001A\u001D\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\t\u001A\u001D\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\n\u001A\u001D\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\u000B\u001A\u001D\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\f\u001A\u001D\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b\u001A2\u0010\r\u001A\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000E\u001A\u001D\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b\u001A2\u0010\u000F\u001A\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000E\u001A\u001D\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b\u001A2\u0010\u0010\u001A\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000E\u001A\u001D\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b\u001A2\u0010\u0011\u001A\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000E\u001A\u001D\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b\u001A2\u0010\u0012\u001A\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000E\u001A\u001D\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b¨\u0006\u0013"}, d2 = {"addListener", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "onEnd", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "transition", "", "onStart", "onCancel", "onResume", "onPause", "doOnCancel", "action", "doOnEnd", "doOnPause", "doOnResume", "doOnStart", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt\n*L\n1#1,76:1\n59#1,16:77\n59#1,16:93\n59#1,16:109\n59#1,16:125\n59#1,16:141\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt\n*L\n26#1:77,16\n33#1:93,16\n40#1:109,16\n47#1:125,16\n54#1:141,16\n*E\n"})
public final class TransitionKt {
    @NotNull
    public static final Transition.TransitionListener addListener(@NotNull Transition transition0, @NotNull Function1 function10, @NotNull Function1 function11, @NotNull Function1 function12, @NotNull Function1 function13, @NotNull Function1 function14) {
        Transition.TransitionListener transition$TransitionListener0 = new Transition.TransitionListener() {
            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionCancel(@NotNull Transition transition0) {
                function12.invoke(transition0);
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionEnd(@NotNull Transition transition0) {
                function10.invoke(transition0);
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionPause(@NotNull Transition transition0) {
                function14.invoke(transition0);
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionResume(@NotNull Transition transition0) {
                function13.invoke(transition0);
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionStart(@NotNull Transition transition0) {
                function11.invoke(transition0);
            }
        };
        transition0.addListener(transition$TransitionListener0);
        return transition$TransitionListener0;
    }

    public static Transition.TransitionListener addListener$default(Transition transition0, Function1 function10, Function1 function11, Function1 function12, Function1 function13, Function1 function14, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = androidx.core.transition.TransitionKt.addListener.1.INSTANCE;
        }
        if((v & 2) != 0) {
            function11 = androidx.core.transition.TransitionKt.addListener.2.INSTANCE;
        }
        if((v & 4) != 0) {
            function12 = androidx.core.transition.TransitionKt.addListener.3.INSTANCE;
        }
        if((v & 8) != 0) {
            function13 = androidx.core.transition.TransitionKt.addListener.4.INSTANCE;
        }
        if((v & 16) != 0) {
            function14 = androidx.core.transition.TransitionKt.addListener.5.INSTANCE;
        }
        Transition.TransitionListener transition$TransitionListener0 = new androidx.core.transition.TransitionKt.addListener.listener.1(function10, function13, function14, function12, function11);
        transition0.addListener(transition$TransitionListener0);
        return transition$TransitionListener0;

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/transition/Transition;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$1\n*L\n1#1,76:1\n*E\n"})
        public final class androidx.core.transition.TransitionKt.addListener.1 extends Lambda implements Function1 {
            public static final androidx.core.transition.TransitionKt.addListener.1 INSTANCE;

            static {
                androidx.core.transition.TransitionKt.addListener.1.INSTANCE = new androidx.core.transition.TransitionKt.addListener.1();
            }

            public androidx.core.transition.TransitionKt.addListener.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Transition transition0) {
            }
        }


        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/transition/Transition;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$2\n*L\n1#1,76:1\n*E\n"})
        public final class androidx.core.transition.TransitionKt.addListener.2 extends Lambda implements Function1 {
            public static final androidx.core.transition.TransitionKt.addListener.2 INSTANCE;

            static {
                androidx.core.transition.TransitionKt.addListener.2.INSTANCE = new androidx.core.transition.TransitionKt.addListener.2();
            }

            public androidx.core.transition.TransitionKt.addListener.2() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Transition transition0) {
            }
        }


        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/transition/Transition;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$3\n*L\n1#1,76:1\n*E\n"})
        public final class androidx.core.transition.TransitionKt.addListener.3 extends Lambda implements Function1 {
            public static final androidx.core.transition.TransitionKt.addListener.3 INSTANCE;

            static {
                androidx.core.transition.TransitionKt.addListener.3.INSTANCE = new androidx.core.transition.TransitionKt.addListener.3();
            }

            public androidx.core.transition.TransitionKt.addListener.3() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Transition transition0) {
            }
        }


        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/transition/Transition;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$4\n*L\n1#1,76:1\n*E\n"})
        public final class androidx.core.transition.TransitionKt.addListener.4 extends Lambda implements Function1 {
            public static final androidx.core.transition.TransitionKt.addListener.4 INSTANCE;

            static {
                androidx.core.transition.TransitionKt.addListener.4.INSTANCE = new androidx.core.transition.TransitionKt.addListener.4();
            }

            public androidx.core.transition.TransitionKt.addListener.4() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Transition transition0) {
            }
        }


        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/transition/Transition;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$5\n*L\n1#1,76:1\n*E\n"})
        public final class androidx.core.transition.TransitionKt.addListener.5 extends Lambda implements Function1 {
            public static final androidx.core.transition.TransitionKt.addListener.5 INSTANCE;

            static {
                androidx.core.transition.TransitionKt.addListener.5.INSTANCE = new androidx.core.transition.TransitionKt.addListener.5();
            }

            public androidx.core.transition.TransitionKt.addListener.5() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Transition transition0) {
            }
        }

    }

    @NotNull
    public static final Transition.TransitionListener doOnCancel(@NotNull Transition transition0, @NotNull Function1 function10) {
        Transition.TransitionListener transition$TransitionListener0 = new Transition.TransitionListener() {
            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionCancel(@NotNull Transition transition0) {
                function10.invoke(transition0);
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionEnd(@NotNull Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionPause(@NotNull Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionResume(@NotNull Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionStart(@NotNull Transition transition0) {
            }
        };
        transition0.addListener(transition$TransitionListener0);
        return transition$TransitionListener0;
    }

    @NotNull
    public static final Transition.TransitionListener doOnEnd(@NotNull Transition transition0, @NotNull Function1 function10) {
        Transition.TransitionListener transition$TransitionListener0 = new Transition.TransitionListener() {
            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionCancel(@NotNull Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionEnd(@NotNull Transition transition0) {
                function10.invoke(transition0);
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionPause(@NotNull Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionResume(@NotNull Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionStart(@NotNull Transition transition0) {
            }
        };
        transition0.addListener(transition$TransitionListener0);
        return transition$TransitionListener0;
    }

    @NotNull
    public static final Transition.TransitionListener doOnPause(@NotNull Transition transition0, @NotNull Function1 function10) {
        Transition.TransitionListener transition$TransitionListener0 = new Transition.TransitionListener() {
            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionCancel(@NotNull Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionEnd(@NotNull Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionPause(@NotNull Transition transition0) {
                function10.invoke(transition0);
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionResume(@NotNull Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionStart(@NotNull Transition transition0) {
            }
        };
        transition0.addListener(transition$TransitionListener0);
        return transition$TransitionListener0;
    }

    @NotNull
    public static final Transition.TransitionListener doOnResume(@NotNull Transition transition0, @NotNull Function1 function10) {
        Transition.TransitionListener transition$TransitionListener0 = new Transition.TransitionListener() {
            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionCancel(@NotNull Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionEnd(@NotNull Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionPause(@NotNull Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionResume(@NotNull Transition transition0) {
                function10.invoke(transition0);
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionStart(@NotNull Transition transition0) {
            }
        };
        transition0.addListener(transition$TransitionListener0);
        return transition$TransitionListener0;
    }

    @NotNull
    public static final Transition.TransitionListener doOnStart(@NotNull Transition transition0, @NotNull Function1 function10) {
        Transition.TransitionListener transition$TransitionListener0 = new Transition.TransitionListener() {
            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionCancel(@NotNull Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionEnd(@NotNull Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionPause(@NotNull Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionResume(@NotNull Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionStart(@NotNull Transition transition0) {
                function10.invoke(transition0);
            }
        };
        transition0.addListener(transition$TransitionListener0);
        return transition$TransitionListener0;
    }
}

