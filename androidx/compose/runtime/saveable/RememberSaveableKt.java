package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import h1.a;
import h1.b;
import h1.c;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001Ac\u0010\n\u001A\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0016\u0010\u0003\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u0002\"\u0004\u0018\u00010\u00002\u0016\b\u0002\u0010\u0005\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\f\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\n\u0010\u000B\u001Ai\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00012\u0016\u0010\u0003\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u0002\"\u0004\u0018\u00010\u00002\u0014\u0010\f\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\u0012\u0010\t\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\bH\u0007¢\u0006\u0004\b\n\u0010\u000E\u001A\u0017\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "T", "", "inputs", "Landroidx/compose/runtime/saveable/Saver;", "saver", "", "key", "Lkotlin/Function0;", "init", "rememberSaveable", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "stateSaver", "Landroidx/compose/runtime/MutableState;", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/MutableState;", "value", "generateCannotBeSavedErrorMessage", "(Ljava/lang/Object;)Ljava/lang/String;", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRememberSaveable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/RememberSaveableKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,274:1\n77#2:275\n1223#3,6:276\n1223#3,6:282\n*S KotlinDebug\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/RememberSaveableKt\n*L\n82#1:275\n84#1:276,6\n94#1:282,6\n*E\n"})
public final class RememberSaveableKt {
    public static final void access$requireCanBeSaved(SaveableStateRegistry saveableStateRegistry0, Object object0) {
        String s;
        if(object0 != null && !saveableStateRegistry0.canBeSaved(object0)) {
            if(!(object0 instanceof SnapshotMutableState)) {
                s = object0 + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
            }
            else if(((SnapshotMutableState)object0).getPolicy() != SnapshotStateKt.neverEqualPolicy() && ((SnapshotMutableState)object0).getPolicy() != SnapshotStateKt.structuralEqualityPolicy() && ((SnapshotMutableState)object0).getPolicy() != SnapshotStateKt.referentialEqualityPolicy()) {
                s = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
            else {
                s = "MutableState containing " + ((SnapshotMutableState)object0).getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            }
            throw new IllegalArgumentException(s);
        }
    }

    @NotNull
    public static final String generateCannotBeSavedErrorMessage(@NotNull Object object0) [...] // Inlined contents

    @Composable
    @NotNull
    public static final MutableState rememberSaveable(@NotNull Object[] arr_object, @NotNull Saver saver0, @Nullable String s, @NotNull Function0 function00, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 4) != 0) {
            s = null;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-202053668, v, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:127)");
        }
        Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
        Intrinsics.checkNotNull(saver0, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>");
        MutableState mutableState0 = (MutableState)RememberSaveableKt.rememberSaveable(arr_object1, SaverKt.Saver(new a(saver0, 0), new b(saver0, 0)), s, function00, composer0, v & 0x1F80, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState0;
    }

    @Composable
    @NotNull
    public static final Object rememberSaveable(@NotNull Object[] arr_object, @Nullable Saver saver0, @Nullable String s, @NotNull Function0 function00, @Nullable Composer composer0, int v, int v1) {
        Object object3;
        Saver saver1 = (v1 & 2) == 0 ? saver0 : SaverKt.autoSaver();
        Object object0 = null;
        String s1 = (v1 & 4) == 0 ? s : null;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x1A56BFAB, v, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:70)");
        }
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        if(s1 == null || s1.length() == 0) {
            s1 = Integer.toString(v2, kotlin.text.b.checkRadix(36));
            Intrinsics.checkNotNullExpressionValue(s1, "toString(this, checkRadix(radix))");
        }
        Intrinsics.checkNotNull(saver1, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        Object object1 = composer0.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
        androidx.compose.runtime.saveable.a a0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(a0 == composer$Companion0.getEmpty()) {
            if(((SaveableStateRegistry)object1) == null) {
                object3 = null;
            }
            else {
                Object object2 = ((SaveableStateRegistry)object1).consumeRestored(s1);
                object3 = object2 == null ? null : saver1.restore(object2);
            }
            if(object3 == null) {
                object3 = function00.invoke();
            }
            a0 = new androidx.compose.runtime.saveable.a(saver1, ((SaveableStateRegistry)object1), s1, object3, arr_object);
            composer0.updateRememberedValue(a0);
        }
        if(Arrays.equals(arr_object, a0.e)) {
            object0 = a0.d;
        }
        if(object0 == null) {
            object0 = function00.invoke();
        }
        boolean z = composer0.changedInstance(a0);
        boolean z1 = (v & 0x70 ^ 0x30) > 0x20 && composer0.changedInstance(saver1) || (v & 0x30) == 0x20;
        boolean z2 = composer0.changedInstance(((SaveableStateRegistry)object1));
        boolean z3 = composer0.changed(s1);
        boolean z4 = composer0.changedInstance(object0);
        boolean z5 = composer0.changedInstance(arr_object);
        c c0 = composer0.rememberedValue();
        if((z | z1 | z2 | z3 | z4 | z5) != 0 || c0 == composer$Companion0.getEmpty()) {
            c c1 = new c(a0, saver1, ((SaveableStateRegistry)object1), s1, object0, arr_object);
            composer0.updateRememberedValue(c1);
            c0 = c1;
        }
        EffectsKt.SideEffect(c0, composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return object0;
    }
}

