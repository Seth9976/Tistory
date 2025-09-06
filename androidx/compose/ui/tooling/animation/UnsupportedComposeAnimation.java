package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001B2\u00020\u0001:\u0001\u001BR\u001C\u0010\u0007\u001A\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001A\u0010\r\u001A\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u001A\u0010\u0013\u001A\u00020\u000E8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R \u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u00150\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019¨\u0006\u001C"}, d2 = {"Landroidx/compose/ui/tooling/animation/UnsupportedComposeAnimation;", "Landroidx/compose/animation/tooling/ComposeAnimation;", "", "a", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "label", "Landroidx/compose/animation/tooling/ComposeAnimationType;", "b", "Landroidx/compose/animation/tooling/ComposeAnimationType;", "getType", "()Landroidx/compose/animation/tooling/ComposeAnimationType;", "type", "", "c", "Ljava/lang/Object;", "getAnimationObject", "()Ljava/lang/Object;", "animationObject", "", "", "d", "Ljava/util/Set;", "getStates", "()Ljava/util/Set;", "states", "Companion", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nUnsupportedComposeAnimation.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnsupportedComposeAnimation.android.kt\nandroidx/compose/ui/tooling/animation/UnsupportedComposeAnimation\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,53:1\n12744#2,2:54\n*S KotlinDebug\n*F\n+ 1 UnsupportedComposeAnimation.android.kt\nandroidx/compose/ui/tooling/animation/UnsupportedComposeAnimation\n*L\n40#1:54,2\n*E\n"})
public final class UnsupportedComposeAnimation implements ComposeAnimation {
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00042\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000BR$\u0010\r\u001A\u00020\u00072\u0006\u0010\f\u001A\u00020\u00078\u0006@BX\u0086\u000E¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/tooling/animation/UnsupportedComposeAnimation$Companion;", "", "", "label", "Landroidx/compose/ui/tooling/animation/UnsupportedComposeAnimation;", "create", "(Ljava/lang/String;)Landroidx/compose/ui/tooling/animation/UnsupportedComposeAnimation;", "", "override", "", "testOverrideAvailability", "(Z)V", "<set-?>", "apiAvailable", "Z", "getApiAvailable", "()Z", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(40)
        @Nullable
        public final UnsupportedComposeAnimation create(@Nullable String s) {
            return null;
        }

        public final boolean getApiAvailable() [...] // 潜在的解密器

        @TestOnly
        public final void testOverrideAvailability(boolean z) {
            UnsupportedComposeAnimation.e = z;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final String a;
    public final ComposeAnimationType b;
    public final Integer c;
    public final Set d;
    public static boolean e;

    static {
        UnsupportedComposeAnimation.Companion = new Companion(null);
        UnsupportedComposeAnimation.$stable = 8;
        ComposeAnimationType[] arr_composeAnimationType = ComposeAnimationType.values();
        boolean z = false;
        for(int v = 0; v < arr_composeAnimationType.length; ++v) {
            if(Intrinsics.areEqual(arr_composeAnimationType[v].name(), "UNSUPPORTED")) {
                z = true;
                break;
            }
        }
        UnsupportedComposeAnimation.e = z;
    }

    public UnsupportedComposeAnimation(String s) {
        this.a = s;
        this.b = ComposeAnimationType.UNSUPPORTED;
        this.c = 0;
        this.d = f0.emptySet();
    }

    public UnsupportedComposeAnimation(String s, DefaultConstructorMarker defaultConstructorMarker0) {
        this(s);
    }

    @NotNull
    public Object getAnimationObject() {
        return this.c;
    }

    @Nullable
    public String getLabel() {
        return this.a;
    }

    @NotNull
    public Set getStates() {
        return this.d;
    }

    @NotNull
    public ComposeAnimationType getType() {
        return this.b;
    }
}

