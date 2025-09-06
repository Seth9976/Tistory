package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposeCompilerApi;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001A0\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u00052\u0006\u0010\t\u001A\u00020\nH\u0007\u001A(\u0010\u000B\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u00052\u0006\u0010\t\u001A\u00020\nH\u0007\u001A-\u0010\f\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u00052\u0006\u0010\t\u001A\u00020\nH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000E"}, d2 = {"composableLambdaN", "Landroidx/compose/runtime/internal/ComposableLambdaN;", "composer", "Landroidx/compose/runtime/Composer;", "key", "", "tracked", "", "arity", "block", "", "composableLambdaNInstance", "rememberComposableLambdaN", "(IZILjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambdaN;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nComposableLambdaN.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaN_jvmKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,193:1\n1223#2,6:194\n1#3:200\n*S KotlinDebug\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaN_jvmKt\n*L\n177#1:194,6\n*E\n"})
public final class ComposableLambdaN_jvmKt {
    @ComposeCompilerApi
    @NotNull
    public static final ComposableLambdaN composableLambdaN(@NotNull Composer composer0, int v, boolean z, int v1, @NotNull Object object0) {
        ComposableLambdaN composableLambdaN0;
        composer0.startReplaceableGroup(v);
        Object object1 = composer0.rememberedValue();
        if(object1 == Composer.Companion.getEmpty()) {
            composableLambdaN0 = new ComposableLambdaNImpl(v, z, v1);
            composer0.updateRememberedValue(composableLambdaN0);
        }
        else {
            Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaNImpl");
            composableLambdaN0 = (ComposableLambdaNImpl)object1;
        }
        ((ComposableLambdaNImpl)composableLambdaN0).update(object0);
        composer0.endReplaceableGroup();
        return composableLambdaN0;
    }

    @ComposeCompilerApi
    @NotNull
    public static final ComposableLambdaN composableLambdaNInstance(int v, boolean z, int v1, @NotNull Object object0) {
        ComposableLambdaN composableLambdaN0 = new ComposableLambdaNImpl(v, z, v1);
        ((ComposableLambdaNImpl)composableLambdaN0).update(object0);
        return composableLambdaN0;
    }

    @Composable
    @ComposeCompilerApi
    @NotNull
    public static final ComposableLambdaN rememberComposableLambdaN(int v, boolean z, int v1, @NotNull Object object0, @Nullable Composer composer0, int v2) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xEE823626, v2, -1, "androidx.compose.runtime.internal.rememberComposableLambdaN (ComposableLambdaN.jvm.kt:176)");
        }
        ComposableLambdaNImpl composableLambdaNImpl0 = composer0.rememberedValue();
        if(composableLambdaNImpl0 == Composer.Companion.getEmpty()) {
            composableLambdaNImpl0 = new ComposableLambdaNImpl(v, z, v1);
            composer0.updateRememberedValue(composableLambdaNImpl0);
        }
        composableLambdaNImpl0.update(object0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return composableLambdaNImpl0;
    }
}

