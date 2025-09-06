package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A<\u0010\b\u001A\u00020\u0000*\u00020\u00002\'\u0010\u0007\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001AD\u0010\b\u001A\u00020\u0000*\u00020\u00002\b\u0010\n\u001A\u0004\u0018\u00010\u00052\'\u0010\u0007\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006¢\u0006\u0004\b\b\u0010\u000B\u001AN\u0010\b\u001A\u00020\u0000*\u00020\u00002\b\u0010\n\u001A\u0004\u0018\u00010\u00052\b\u0010\f\u001A\u0004\u0018\u00010\u00052\'\u0010\u0007\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006¢\u0006\u0004\b\b\u0010\r\u001AR\u0010\b\u001A\u00020\u0000*\u00020\u00002\u0016\u0010\u000F\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u000E\"\u0004\u0018\u00010\u00052\'\u0010\u0007\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006¢\u0006\u0004\b\b\u0010\u0010\u001A6\u0010\u0013\u001A\u00020\u00122\'\u0010\u0011\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "pointerInput", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "key1", "(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "key2", "(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "", "keys", "(Landroidx/compose/ui/Modifier;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "pointerInputHandler", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "SuspendingPointerInputModifierNode", "(Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,831:1\n26#2:832\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt\n*L\n790#1:832\n*E\n"})
public final class SuspendingPointerInputFilterKt {
    public static final PointerEvent a;
    public static final StackTraceElement[] b;

    static {
        SuspendingPointerInputFilterKt.a = new PointerEvent(CollectionsKt__CollectionsKt.emptyList());
        SuspendingPointerInputFilterKt.b = new StackTraceElement[0];
    }

    @NotNull
    public static final SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode(@NotNull Function2 function20) {
        return new SuspendingPointerInputModifierNodeImpl(null, null, null, function20);
    }

    @NotNull
    public static final Modifier pointerInput(@NotNull Modifier modifier0, @Nullable Object object0, @Nullable Object object1, @NotNull Function2 function20) {
        return modifier0.then(new SuspendPointerInputElement(object0, object1, null, function20, 4, null));
    }

    @NotNull
    public static final Modifier pointerInput(@NotNull Modifier modifier0, @Nullable Object object0, @NotNull Function2 function20) {
        return modifier0.then(new SuspendPointerInputElement(object0, null, null, function20, 6, null));
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Modifier.pointerInput must provide one or more \'key\' parameters that define the identity of the modifier and determine when its previous input processing coroutine should be cancelled and a new effect launched for the new key.")
    @NotNull
    public static final Modifier pointerInput(@NotNull Modifier modifier0, @NotNull Function2 function20) {
        throw new IllegalStateException("Modifier.pointerInput must provide one or more \'key\' parameters that define the identity of the modifier and determine when its previous input processing coroutine should be cancelled and a new effect launched for the new key.");
    }

    @NotNull
    public static final Modifier pointerInput(@NotNull Modifier modifier0, @NotNull Object[] arr_object, @NotNull Function2 function20) {
        return modifier0.then(new SuspendPointerInputElement(null, null, arr_object, function20, 3, null));
    }
}

