package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0007\b\u0000\u0018\u0000 .*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004:\u0001.J\u0015\u0010\b\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u001D\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\n8\u0006¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000ER\u001D\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014R&\u0010\u001B\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001AR\u001A\u0010!\u001A\u00020\u001C8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 R \u0010\'\u001A\b\u0012\u0004\u0012\u00020\u00050\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&R\u001A\u0010-\u001A\u00020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010,¨\u0006/"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/tooling/ComposeAnimation;", "", "value", "", "setState", "(Ljava/lang/Object;)V", "Landroidx/compose/ui/tooling/animation/ToolingState;", "a", "Landroidx/compose/ui/tooling/animation/ToolingState;", "getToolingState", "()Landroidx/compose/ui/tooling/animation/ToolingState;", "toolingState", "Landroidx/compose/animation/core/AnimationSpec;", "b", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Landroidx/compose/animation/core/Animatable;", "c", "Landroidx/compose/animation/core/Animatable;", "getAnimationObject", "()Landroidx/compose/animation/core/Animatable;", "animationObject", "Landroidx/compose/animation/tooling/ComposeAnimationType;", "d", "Landroidx/compose/animation/tooling/ComposeAnimationType;", "getType", "()Landroidx/compose/animation/tooling/ComposeAnimationType;", "type", "", "e", "Ljava/util/Set;", "getStates", "()Ljava/util/Set;", "states", "", "f", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "label", "Companion", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAnimateXAsStateComposeAnimation.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimateXAsStateComposeAnimation.android.kt\nandroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,78:1\n12744#2,2:79\n*S KotlinDebug\n*F\n+ 1 AnimateXAsStateComposeAnimation.android.kt\nandroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation\n*L\n57#1:79,2\n*E\n"})
public final class AnimateXAsStateComposeAnimation implements ComposeAnimation {
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001J9\u0010\t\u001A\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0006\"\u0004\b\u0002\u0010\u0002\"\b\b\u0003\u0010\u0004*\u00020\u0003*\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000ER$\u0010\u0010\u001A\u00020\n2\u0006\u0010\u000F\u001A\u00020\n8\u0006@BX\u0086\u000E¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation$Companion;", "", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearchInfo;", "Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation;", "parse$ui_tooling_release", "(Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearchInfo;)Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation;", "parse", "", "override", "", "testOverrideAvailability", "(Z)V", "<set-?>", "apiAvailable", "Z", "getApiAvailable", "()Z", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final boolean getApiAvailable() [...] // 潜在的解密器

        // 去混淆评级： 低(40)
        @Nullable
        public final AnimateXAsStateComposeAnimation parse$ui_tooling_release(@NotNull AnimateXAsStateSearchInfo animationSearch$AnimateXAsStateSearchInfo0) {
            return null;
        }

        @TestOnly
        public final void testOverrideAvailability(boolean z) {
            AnimateXAsStateComposeAnimation.g = z;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final ToolingState a;
    public final AnimationSpec b;
    public final Animatable c;
    public final ComposeAnimationType d;
    public final Set e;
    public final String f;
    public static boolean g;

    static {
        AnimateXAsStateComposeAnimation.Companion = new Companion(null);
        AnimateXAsStateComposeAnimation.$stable = 8;
        ComposeAnimationType[] arr_composeAnimationType = ComposeAnimationType.values();
        boolean z = false;
        for(int v = 0; v < arr_composeAnimationType.length; ++v) {
            if(Intrinsics.areEqual(arr_composeAnimationType[v].name(), "ANIMATE_X_AS_STATE")) {
                z = true;
                break;
            }
        }
        AnimateXAsStateComposeAnimation.g = z;
    }

    public AnimateXAsStateComposeAnimation(Animatable animatable0, AnimationSpec animationSpec0, ToolingState toolingState0) {
        Set set0;
        this.a = toolingState0;
        this.b = animationSpec0;
        this.c = animatable0;
        this.d = ComposeAnimationType.ANIMATE_X_AS_STATE;
        Object object0 = this.getAnimationObject().getValue();
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Any");
        Object[] arr_object = object0.getClass().getEnumConstants();
        if(arr_object == null) {
            set0 = e0.setOf(object0);
        }
        else {
            set0 = ArraysKt___ArraysKt.toSet(arr_object);
            if(set0 == null) {
                set0 = e0.setOf(object0);
            }
        }
        this.e = set0;
        this.f = this.getAnimationObject().getLabel();
    }

    public AnimateXAsStateComposeAnimation(ToolingState toolingState0, AnimationSpec animationSpec0, Animatable animatable0, DefaultConstructorMarker defaultConstructorMarker0) {
        this(animatable0, animationSpec0, toolingState0);
    }

    @NotNull
    public Animatable getAnimationObject() {
        return this.c;
    }

    public Object getAnimationObject() {
        return this.getAnimationObject();
    }

    @NotNull
    public final AnimationSpec getAnimationSpec() {
        return this.b;
    }

    @NotNull
    public String getLabel() {
        return this.f;
    }

    @NotNull
    public Set getStates() {
        return this.e;
    }

    @NotNull
    public final ToolingState getToolingState() {
        return this.a;
    }

    @NotNull
    public ComposeAnimationType getType() {
        return this.d;
    }

    public final void setState(@NotNull Object object0) {
        this.a.setValue(object0);
    }
}

