package androidx.lifecycle.compose;

import androidx.annotation.CheckResult;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleOwner;
import i4.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001A-\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0001\u001A\u00020\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001A-\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0001\u001A\u00020\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function0;", "", "block", "dropUnlessStarted", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function0;", "dropUnlessResumed", "lifecycle-runtime-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDropUnlessLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DropUnlessLifecycle.kt\nandroidx/lifecycle/compose/DropUnlessLifecycleKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,108:1\n74#2:109\n74#2:116\n74#2:117\n1116#3,6:110\n*S KotlinDebug\n*F\n+ 1 DropUnlessLifecycle.kt\nandroidx/lifecycle/compose/DropUnlessLifecycleKt\n*L\n49#1:109\n81#1:116\n105#1:117\n57#1:110,6\n*E\n"})
public final class DropUnlessLifecycleKt {
    public static final Function0 a(State lifecycle$State0, LifecycleOwner lifecycleOwner0, Function0 function00, Composer composer0, int v) {
        composer0.startReplaceableGroup(-2057956404);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2057956404, v, -1, "androidx.lifecycle.compose.dropUnlessStateIsAtLeast (DropUnlessLifecycle.kt:50)");
        }
        if(lifecycle$State0 == State.DESTROYED) {
            throw new IllegalArgumentException("Target state is not allowed to be `Lifecycle.State.DESTROYED` because Compose disposes of the composition before `Lifecycle.Event.ON_DESTROY` observers are invoked.");
        }
        composer0.startReplaceableGroup(0x21B3D20C);
        boolean z = composer0.changedInstance(lifecycleOwner0);
        int v1 = 0;
        boolean z1 = (v & 14 ^ 6) > 4 && composer0.changed(lifecycle$State0) || (v & 6) == 4;
        if((v & 0x380 ^ 0x180) > 0x100 && composer0.changed(function00) || (v & 0x180) == 0x100) {
            v1 = 1;
        }
        a a0 = composer0.rememberedValue();
        if((z | z1 | v1) != 0 || a0 == Composer.Companion.getEmpty()) {
            a0 = new a(lifecycleOwner0, lifecycle$State0, function00);
            composer0.updateRememberedValue(a0);
        }
        composer0.endReplaceableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return a0;
    }

    @CheckResult
    @Composable
    @NotNull
    public static final Function0 dropUnlessResumed(@Nullable LifecycleOwner lifecycleOwner0, @NotNull Function0 function00, @Nullable Composer composer0, int v, int v1) {
        composer0.startReplaceableGroup(0x4F5774C5);
        if((v1 & 1) != 0) {
            lifecycleOwner0 = (LifecycleOwner)composer0.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x4F5774C5, v, -1, "androidx.lifecycle.compose.dropUnlessResumed (DropUnlessLifecycle.kt:106)");
        }
        Function0 function01 = DropUnlessLifecycleKt.a(State.RESUMED, lifecycleOwner0, function00, composer0, v << 3 & 0x380 | (v << 3 & 0x70 | 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return function01;
    }

    @CheckResult
    @Composable
    @NotNull
    public static final Function0 dropUnlessStarted(@Nullable LifecycleOwner lifecycleOwner0, @NotNull Function0 function00, @Nullable Composer composer0, int v, int v1) {
        composer0.startReplaceableGroup(0x47FEA1EF);
        if((v1 & 1) != 0) {
            lifecycleOwner0 = (LifecycleOwner)composer0.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x47FEA1EF, v, -1, "androidx.lifecycle.compose.dropUnlessStarted (DropUnlessLifecycle.kt:82)");
        }
        Function0 function01 = DropUnlessLifecycleKt.a(State.STARTED, lifecycleOwner0, function00, composer0, v << 3 & 0x380 | (v << 3 & 0x70 | 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return function01;
    }
}

