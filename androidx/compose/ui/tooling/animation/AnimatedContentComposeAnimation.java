package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001D*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u001DR \u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00000\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001A\u0004\b\u0007\u0010\bR \u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000B0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000FR\u001C\u0010\u0016\u001A\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R\u001A\u0010\u001C\u001A\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B¨\u0006\u001E"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimatedContentComposeAnimation;", "T", "Landroidx/compose/animation/tooling/ComposeAnimation;", "Landroidx/compose/ui/tooling/animation/TransitionBasedAnimation;", "Landroidx/compose/animation/core/Transition;", "a", "Landroidx/compose/animation/core/Transition;", "getAnimationObject", "()Landroidx/compose/animation/core/Transition;", "animationObject", "", "", "b", "Ljava/util/Set;", "getStates", "()Ljava/util/Set;", "states", "", "c", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "label", "Landroidx/compose/animation/tooling/ComposeAnimationType;", "d", "Landroidx/compose/animation/tooling/ComposeAnimationType;", "getType", "()Landroidx/compose/animation/tooling/ComposeAnimationType;", "type", "Companion", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAnimatedContentComposeAnimation.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContentComposeAnimation.android.kt\nandroidx/compose/ui/tooling/animation/AnimatedContentComposeAnimation\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,64:1\n12744#2,2:65\n*S KotlinDebug\n*F\n+ 1 AnimatedContentComposeAnimation.android.kt\nandroidx/compose/ui/tooling/animation/AnimatedContentComposeAnimation\n*L\n41#1:65,2\n*E\n"})
public final class AnimatedContentComposeAnimation implements ComposeAnimation, TransitionBasedAnimation {
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001B\u0010\u0004\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\f\u001A\u00020\u00062\u0006\u0010\u000B\u001A\u00020\u00068\u0006@BX\u0086\u000E¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimatedContentComposeAnimation$Companion;", "", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/ui/tooling/animation/AnimatedContentComposeAnimation;", "parseAnimatedContent", "(Landroidx/compose/animation/core/Transition;)Landroidx/compose/ui/tooling/animation/AnimatedContentComposeAnimation;", "", "override", "", "testOverrideAvailability", "(Z)V", "<set-?>", "apiAvailable", "Z", "getApiAvailable", "()Z", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final boolean getApiAvailable() [...] // 潜在的解密器

        // 去混淆评级： 低(40)
        @Nullable
        public final AnimatedContentComposeAnimation parseAnimatedContent(@NotNull Transition transition0) {
            return null;
        }

        @TestOnly
        public final void testOverrideAvailability(boolean z) {
            AnimatedContentComposeAnimation.e = z;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final Transition a;
    public final Set b;
    public final String c;
    public final ComposeAnimationType d;
    public static boolean e;

    static {
        AnimatedContentComposeAnimation.Companion = new Companion(null);
        AnimatedContentComposeAnimation.$stable = 8;
        ComposeAnimationType[] arr_composeAnimationType = ComposeAnimationType.values();
        boolean z = false;
        for(int v = 0; v < arr_composeAnimationType.length; ++v) {
            if(Intrinsics.areEqual(arr_composeAnimationType[v].name(), "ANIMATED_CONTENT")) {
                z = true;
                break;
            }
        }
        AnimatedContentComposeAnimation.e = z;
    }

    public AnimatedContentComposeAnimation(Transition transition0, Set set0, String s) {
        this.a = transition0;
        this.b = set0;
        this.c = s;
        this.d = ComposeAnimationType.ANIMATED_CONTENT;
    }

    public AnimatedContentComposeAnimation(Transition transition0, Set set0, String s, DefaultConstructorMarker defaultConstructorMarker0) {
        this(transition0, set0, s);
    }

    @Override  // androidx.compose.ui.tooling.animation.TransitionBasedAnimation
    @NotNull
    public Transition getAnimationObject() {
        return this.a;
    }

    public Object getAnimationObject() {
        return this.getAnimationObject();
    }

    @Nullable
    public String getLabel() {
        return this.c;
    }

    @NotNull
    public Set getStates() {
        return this.b;
    }

    @NotNull
    public ComposeAnimationType getType() {
        return this.d;
    }
}

