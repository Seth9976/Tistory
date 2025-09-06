package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposeCompilerApi;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001A\u001F\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001A\u0017\u0010\u0005\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001A\u0017\u0010\u0007\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001A\u001D\u0010\u000B\u001A\u00020\n*\u0004\u0018\u00010\b2\u0006\u0010\t\u001A\u00020\bH\u0000¢\u0006\u0004\b\u000B\u0010\f\u001A/\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\u00002\u0006\u0010\u0010\u001A\u00020\n2\u0006\u0010\u0012\u001A\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001A\'\u0010\u0016\u001A\u00020\u00132\u0006\u0010\u000F\u001A\u00020\u00002\u0006\u0010\u0010\u001A\u00020\n2\u0006\u0010\u0012\u001A\u00020\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001A\'\u0010\u0018\u001A\u00020\u00132\u0006\u0010\u000F\u001A\u00020\u00002\u0006\u0010\u0010\u001A\u00020\n2\u0006\u0010\u0012\u001A\u00020\u0011H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001A\u001A\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001A\u0010\u001B¨\u0006\u001C"}, d2 = {"", "bits", "slot", "bitsForSlot", "(II)I", "sameBits", "(I)I", "differentBits", "Landroidx/compose/runtime/RecomposeScope;", "other", "", "replacableWith", "(Landroidx/compose/runtime/RecomposeScope;Landroidx/compose/runtime/RecomposeScope;)Z", "Landroidx/compose/runtime/Composer;", "composer", "key", "tracked", "", "block", "Landroidx/compose/runtime/internal/ComposableLambda;", "composableLambda", "(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;", "composableLambdaInstance", "(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;", "rememberComposableLambda", "(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;", "SLOTS_PER_INT", "I", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nComposableLambda.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambda.kt\nandroidx/compose/runtime/internal/ComposableLambdaKt\n+ 2 BitwiseOperators.kt\nandroidx/compose/runtime/BitwiseOperatorsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,632:1\n26#2:633\n1223#3,6:634\n*S KotlinDebug\n*F\n+ 1 ComposableLambda.kt\nandroidx/compose/runtime/internal/ComposableLambdaKt\n*L\n596#1:633\n629#1:634,6\n*E\n"})
public final class ComposableLambdaKt {
    public static final int SLOTS_PER_INT = 10;
    public static final Object a;

    static {
        ComposableLambdaKt.a = new Object();
    }

    public static final int bitsForSlot(int v, int v1) [...] // Inlined contents

    @ComposeCompilerApi
    @NotNull
    public static final ComposableLambda composableLambda(@NotNull Composer composer0, int v, boolean z, @NotNull Object object0) {
        ComposableLambda composableLambda0;
        composer0.startMovableGroup(Integer.rotateLeft(v, 1), ComposableLambdaKt.a);
        Object object1 = composer0.rememberedValue();
        if(object1 == Composer.Companion.getEmpty()) {
            composableLambda0 = new ComposableLambdaImpl(v, z, object0);
            composer0.updateRememberedValue(composableLambda0);
        }
        else {
            Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            composableLambda0 = (ComposableLambdaImpl)object1;
            ((ComposableLambdaImpl)composableLambda0).update(object0);
        }
        composer0.endMovableGroup();
        return composableLambda0;
    }

    @ComposeCompilerApi
    @NotNull
    public static final ComposableLambda composableLambdaInstance(int v, boolean z, @NotNull Object object0) {
        return new ComposableLambdaImpl(v, z, object0);
    }

    public static final int differentBits(int v) {
        return 2 << v % 10 * 3 + 1;
    }

    @Composable
    @ComposeCompilerApi
    @NotNull
    public static final ComposableLambda rememberComposableLambda(int v, boolean z, @NotNull Object object0, @Nullable Composer composer0, int v1) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1573003438, v1, -1, "androidx.compose.runtime.internal.rememberComposableLambda (ComposableLambda.kt:628)");
        }
        ComposableLambdaImpl composableLambdaImpl0 = composer0.rememberedValue();
        if(composableLambdaImpl0 == Composer.Companion.getEmpty()) {
            composableLambdaImpl0 = new ComposableLambdaImpl(v, z, object0);
            composer0.updateRememberedValue(composableLambdaImpl0);
        }
        composableLambdaImpl0.update(object0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return composableLambdaImpl0;
    }

    // 去混淆评级： 中等(50)
    public static final boolean replacableWith(@Nullable RecomposeScope recomposeScope0, @NotNull RecomposeScope recomposeScope1) {
        return recomposeScope0 == null || recomposeScope0 instanceof RecomposeScopeImpl && recomposeScope1 instanceof RecomposeScopeImpl && (!((RecomposeScopeImpl)recomposeScope0).getValid() || Intrinsics.areEqual(recomposeScope0, recomposeScope1) || Intrinsics.areEqual(((RecomposeScopeImpl)recomposeScope0).getAnchor(), ((RecomposeScopeImpl)recomposeScope1).getAnchor()));
    }

    public static final int sameBits(int v) {
        return 1 << v % 10 * 3 + 1;
    }
}

