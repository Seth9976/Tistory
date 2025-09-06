package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\b\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000E\u001A\u00020\t2\u001D\u0010\u000B\u001A\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0086\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0012\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0016\u001A\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u001B\u001A\u00020\u00182\b\u0010\u0017\u001A\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001AR\u001A\u0010\u0004\u001A\u00020\u00038\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u0012\u0004\b\u001E\u0010\u001F\u0088\u0001\u0004\u0092\u0001\u00020\u0003¨\u0006 "}, d2 = {"Landroidx/compose/runtime/SkippableUpdater;", "T", "", "Landroidx/compose/runtime/Composer;", "composer", "constructor-impl", "(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;", "Lkotlin/Function1;", "Landroidx/compose/runtime/Updater;", "", "Lkotlin/ExtensionFunctionType;", "block", "update-impl", "(Landroidx/compose/runtime/Composer;Lkotlin/jvm/functions/Function1;)V", "update", "", "toString-impl", "(Landroidx/compose/runtime/Composer;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Landroidx/compose/runtime/Composer;)I", "hashCode", "other", "", "equals-impl", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;)Z", "equals", "a", "Landroidx/compose/runtime/Composer;", "getComposer$annotations", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
public final class SkippableUpdater {
    public final Composer a;

    public SkippableUpdater(Composer composer0) {
        this.a = composer0;
    }

    public static final SkippableUpdater box-impl(Composer composer0) {
        return new SkippableUpdater(composer0);
    }

    @NotNull
    public static Composer constructor-impl(@NotNull Composer composer0) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return SkippableUpdater.equals-impl(this.a, object0);
    }

    // 去混淆评级： 低(20)
    public static boolean equals-impl(Composer composer0, Object object0) {
        return object0 instanceof SkippableUpdater ? Intrinsics.areEqual(composer0, ((SkippableUpdater)object0).unbox-impl()) : false;
    }

    public static final boolean equals-impl0(Composer composer0, Composer composer1) {
        return Intrinsics.areEqual(composer0, composer1);
    }

    @PublishedApi
    public static void getComposer$annotations() {
    }

    @Override
    public int hashCode() {
        return SkippableUpdater.hashCode-impl(this.a);
    }

    public static int hashCode-impl(Composer composer0) {
        return composer0.hashCode();
    }

    @Override
    public String toString() {
        return "SkippableUpdater(composer=" + this.a + ')';
    }

    public static String toString-impl(Composer composer0) [...] // Inlined contents

    public final Composer unbox-impl() {
        return this.a;
    }

    public static final void update-impl(Composer composer0, @NotNull Function1 function10) {
        composer0.startReplaceableGroup(509942095);
        function10.invoke(Updater.box-impl(composer0));
        composer0.endReplaceableGroup();
    }
}

