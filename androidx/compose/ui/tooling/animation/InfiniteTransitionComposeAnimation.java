package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0007\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001A\u0010\f\u001A\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR\u001A\u0010\u0012\u001A\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011R \u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00140\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018R\u001A\u0010\u001F\u001A\u00020\u001A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001E¨\u0006!"}, d2 = {"Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation;", "Landroidx/compose/animation/tooling/ComposeAnimation;", "", "playTimeNanos", "", "setTimeNanos", "(J)V", "Landroidx/compose/animation/core/InfiniteTransition;", "b", "Landroidx/compose/animation/core/InfiniteTransition;", "getAnimationObject", "()Landroidx/compose/animation/core/InfiniteTransition;", "animationObject", "Landroidx/compose/animation/tooling/ComposeAnimationType;", "c", "Landroidx/compose/animation/tooling/ComposeAnimationType;", "getType", "()Landroidx/compose/animation/tooling/ComposeAnimationType;", "type", "", "", "d", "Ljava/util/Set;", "getStates", "()Ljava/util/Set;", "states", "", "e", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "label", "Companion", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nInfiniteTransitionComposeAnimation.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransitionComposeAnimation.android.kt\nandroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,69:1\n12744#2,2:70\n*S KotlinDebug\n*F\n+ 1 InfiniteTransitionComposeAnimation.android.kt\nandroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation\n*L\n51#1:70,2\n*E\n"})
public final class InfiniteTransitionComposeAnimation implements ComposeAnimation {
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0006\u001A\u0004\u0018\u00010\u0003*\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\n\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000BR$\u0010\r\u001A\u00020\u00072\u0006\u0010\f\u001A\u00020\u00078\u0006@BX\u0086\u000E¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation$Companion;", "", "Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearchInfo;", "Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation;", "parse$ui_tooling_release", "(Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearchInfo;)Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation;", "parse", "", "override", "", "testOverrideAvailability", "(Z)V", "<set-?>", "apiAvailable", "Z", "getApiAvailable", "()Z", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final boolean getApiAvailable() [...] // 潜在的解密器

        // 去混淆评级： 低(30)
        @Nullable
        public final InfiniteTransitionComposeAnimation parse$ui_tooling_release(@NotNull InfiniteTransitionSearchInfo animationSearch$InfiniteTransitionSearchInfo0) {
            return null;
        }

        @TestOnly
        public final void testOverrideAvailability(boolean z) {
            InfiniteTransitionComposeAnimation.f = z;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final ToolingState a;
    public final InfiniteTransition b;
    public final ComposeAnimationType c;
    public final Set d;
    public final String e;
    public static boolean f;

    static {
        InfiniteTransitionComposeAnimation.Companion = new Companion(null);
        InfiniteTransitionComposeAnimation.$stable = 8;
        ComposeAnimationType[] arr_composeAnimationType = ComposeAnimationType.values();
        boolean z = false;
        for(int v = 0; v < arr_composeAnimationType.length; ++v) {
            if(Intrinsics.areEqual(arr_composeAnimationType[v].name(), "INFINITE_TRANSITION")) {
                z = true;
                break;
            }
        }
        InfiniteTransitionComposeAnimation.f = z;
    }

    public InfiniteTransitionComposeAnimation(InfiniteTransition infiniteTransition0, ToolingState toolingState0) {
        this.a = toolingState0;
        this.b = infiniteTransition0;
        this.c = ComposeAnimationType.INFINITE_TRANSITION;
        this.d = e0.setOf(0);
        this.e = this.getAnimationObject().getLabel();
    }

    public InfiniteTransitionComposeAnimation(ToolingState toolingState0, InfiniteTransition infiniteTransition0, DefaultConstructorMarker defaultConstructorMarker0) {
        this(infiniteTransition0, toolingState0);
    }

    @NotNull
    public InfiniteTransition getAnimationObject() {
        return this.b;
    }

    public Object getAnimationObject() {
        return this.getAnimationObject();
    }

    @NotNull
    public String getLabel() {
        return this.e;
    }

    @NotNull
    public Set getStates() {
        return this.d;
    }

    @NotNull
    public ComposeAnimationType getType() {
        return this.c;
    }

    public final void setTimeNanos(long v) {
        this.a.setValue(v);
    }
}

