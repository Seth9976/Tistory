package androidx.compose.ui.tooling.animation.states;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\n\b\u0081@\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015J\u000F\u0010\u0005\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001A\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001A\u0010\u000F\u001A\u00020\f2\b\u0010\u000B\u001A\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000ER\u0017\u0010\u0014\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013\u0088\u0001\u0014\u0092\u0001\u00020\u0002¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/tooling/animation/states/AnimatedVisibilityState;", "Landroidx/compose/ui/tooling/animation/states/ComposeAnimationState;", "", "toString-impl", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Ljava/lang/String;)I", "hashCode", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "Companion", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
public final class AnimatedVisibilityState implements ComposeAnimationState {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/ui/tooling/animation/states/AnimatedVisibilityState$Companion;", "", "Landroidx/compose/ui/tooling/animation/states/AnimatedVisibilityState;", "Enter", "Ljava/lang/String;", "getEnter-jXw82LU", "()Ljava/lang/String;", "Exit", "getExit-jXw82LU", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        @NotNull
        public final String getEnter-jXw82LU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        @NotNull
        public final String getExit-jXw82LU() [...] // 潜在的解密器
    }

    @NotNull
    public static final Companion Companion;
    public final String a;
    public static final String b;
    public static final String c;

    static {
        AnimatedVisibilityState.Companion = new Companion(null);
        AnimatedVisibilityState.b = "Enter";
        AnimatedVisibilityState.c = "Exit";
    }

    public AnimatedVisibilityState(String s) {
        this.a = s;
    }

    public static final String access$getEnter$cp() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    public static final String access$getExit$cp() [...] // 潜在的解密器

    public static final AnimatedVisibilityState box-impl(String s) {
        return new AnimatedVisibilityState(s);
    }

    @Override
    public boolean equals(Object object0) {
        return AnimatedVisibilityState.equals-impl(this.a, object0);
    }

    // 去混淆评级： 低(20)
    public static boolean equals-impl(String s, Object object0) {
        return object0 instanceof AnimatedVisibilityState ? Intrinsics.areEqual(s, ((AnimatedVisibilityState)object0).unbox-impl()) : false;
    }

    public static final boolean equals-impl0(String s, String s1) {
        return Intrinsics.areEqual(s, s1);
    }

    @NotNull
    public final String getValue() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return AnimatedVisibilityState.hashCode-impl(this.a);
    }

    public static int hashCode-impl(String s) {
        return s.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return this.a;
    }

    @NotNull
    public static String toString-impl(String s) [...] // Inlined contents

    public final String unbox-impl() {
        return this.a;
    }
}

