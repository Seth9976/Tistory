package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import d0.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001A\u00020\b*\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\n2\b\b\u0002\u0010\u000B\u001A\u00020\f2\b\b\u0002\u0010\r\u001A\u00020\u000EH\u0016R\u0018\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000FÀ\u0006\u0003"}, d2 = {"Landroidx/compose/animation/AnimatedVisibilityScope;", "", "transition", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "getTransition", "()Landroidx/compose/animation/core/Transition;", "animateEnterExit", "Landroidx/compose/ui/Modifier;", "enter", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "label", "", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityScope\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,885:1\n135#2:886\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityScope\n*L\n662#1:886\n*E\n"})
public interface AnimatedVisibilityScope {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated
        @NotNull
        public static Modifier animateEnterExit(@NotNull AnimatedVisibilityScope animatedVisibilityScope0, @NotNull Modifier modifier0, @NotNull EnterTransition enterTransition0, @NotNull ExitTransition exitTransition0, @NotNull String s) {
            return animatedVisibilityScope0.super.animateEnterExit(modifier0, enterTransition0, exitTransition0, s);
        }

        public static Modifier animateEnterExit$default(AnimatedVisibilityScope animatedVisibilityScope0, Modifier modifier0, EnterTransition enterTransition0, ExitTransition exitTransition0, String s, int v, Object object0) {
            return AnimatedVisibilityScope.animateEnterExit$default(animatedVisibilityScope0, modifier0, enterTransition0, exitTransition0, s, v, object0);
        }
    }

    // 去混淆评级： 低(30)
    @NotNull
    default Modifier animateEnterExit(@NotNull Modifier modifier0, @NotNull EnterTransition enterTransition0, @NotNull ExitTransition exitTransition0, @NotNull String s) {
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new x(2, this, enterTransition0, exitTransition0, s));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityScope\n*L\n1#1,178:1\n663#2,5:179\n*E\n"})
        public final class androidx.compose.animation.AnimatedVisibilityScope.animateEnterExit..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final EnterTransition w;
            public final ExitTransition x;
            public final String y;

            public androidx.compose.animation.AnimatedVisibilityScope.animateEnterExit..inlined.debugInspectorInfo.1(EnterTransition enterTransition0, ExitTransition exitTransition0, String s) {
                this.w = enterTransition0;
                this.x = exitTransition0;
                this.y = s;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("animateEnterExit");
                inspectorInfo0.getProperties().set("enter", this.w);
                inspectorInfo0.getProperties().set("exit", this.x);
                inspectorInfo0.getProperties().set("label", this.y);
            }
        }

    }

    static Modifier animateEnterExit$default(AnimatedVisibilityScope animatedVisibilityScope0, Modifier modifier0, EnterTransition enterTransition0, ExitTransition exitTransition0, String s, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateEnterExit");
        }
        if((v & 1) != 0) {
            enterTransition0 = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
        }
        if((v & 2) != 0) {
            exitTransition0 = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null);
        }
        if((v & 4) != 0) {
            s = "animateEnterExit";
        }
        return animatedVisibilityScope0.animateEnterExit(modifier0, enterTransition0, exitTransition0, s);
    }

    @NotNull
    Transition getTransition();
}

