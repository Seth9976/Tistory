package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\n\u001A@\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\u00062\u0010\b\u0002\u0010\b\u001A\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0000\u001AD\u0010\u000B\u001A\u00020\f*\u001E\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\rj\u0002`\u00112\u0006\u0010\u0012\u001A\u00020\u000E2\b\b\u0002\u0010\u0013\u001A\u00020\u0010H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0014\u0010\u0015\u001AL\u0010\u0016\u001A\u00020\f*\u001E\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\rj\u0002`\u00112\u0006\u0010\u0012\u001A\u00020\u000E2\u0006\u0010\u0017\u001A\u00020\u000F2\b\b\u0002\u0010\u0013\u001A\u00020\u0010H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0018\u0010\u0019\u001AX\u0010\u001A\u001A\u00020\f*\u001E\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\rj\u0002`\u00112\u0006\u0010\u0012\u001A\u00020\u000E2\u0012\u0010\u001B\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u000F0\u001C\"\u00020\u000F2\b\b\u0002\u0010\u0013\u001A\u00020\u0010H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001D\u0010\u001E\u001AR\u0010\u001A\u001A\u00020\f*\u001E\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\rj\u0002`\u00112\u0006\u0010\u0012\u001A\u00020\u000E2\f\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u000F0\t2\b\b\u0002\u0010\u0013\u001A\u00020\u0010H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001D\u0010\u001F\u001A(\u0010 \u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010!\u001A\u00020\u00062\b\b\u0002\u0010\"\u001A\u00020\u0006H\u0000\u001A(\u0010#\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\u0006H\u0000\u001A\u0014\u0010$\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u0003H\u0000*<\b\u0000\u0010%\"\u001A\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\r2\u001A\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\r\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006&"}, d2 = {"down", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "id", "", "durationMillis", "x", "", "y", "historicalData", "", "Landroidx/compose/ui/input/pointer/HistoricalChange;", "invokeOverAllPasses", "", "Lkotlin/Function3;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/input/pointer/PointerInputHandler;", "pointerEvent", "size", "invokeOverAllPasses-H0pRuoY", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;J)V", "invokeOverPass", "pointerEventPass", "invokeOverPass-hUlJWOE", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "invokeOverPasses", "pointerEventPasses", "", "invokeOverPasses-hUlJWOE", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;[Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;Ljava/util/List;J)V", "moveBy", "dx", "dy", "moveTo", "up", "PointerInputHandler", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPointerInputTestUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputTestUtil.kt\nandroidx/compose/ui/input/pointer/PointerInputTestUtilKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,158:1\n1#2:159\n33#3,6:160\n*S KotlinDebug\n*F\n+ 1 PointerInputTestUtil.kt\nandroidx/compose/ui/input/pointer/PointerInputTestUtilKt\n*L\n154#1:160,6\n*E\n"})
public final class PointerInputTestUtilKt {
    @NotNull
    public static final PointerInputChange down(long v, long v1, float f, float f1, @Nullable List list0) {
        PointerInputChange pointerInputChange0 = new PointerInputChange(v, v1, OffsetKt.Offset(f, f1), true, 1.0f, v1, OffsetKt.Offset(f, f1), false, false, 0, 0L, 0x600, null);
        return list0 == null || list0.isEmpty() ? pointerInputChange0 : PointerInputChange.copy-OHpmEuE$default(pointerInputChange0, 0L, 0L, 0L, false, 0L, 0L, false, 0, list0, 0L, 0x2FF, null);
    }

    public static PointerInputChange down$default(long v, long v1, float f, float f1, List list0, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 0L;
        }
        if((v2 & 16) != 0) {
            list0 = null;
        }
        return PointerInputTestUtilKt.down(v, v1, ((v2 & 4) == 0 ? f : 0.0f), ((v2 & 8) == 0 ? f1 : 0.0f), list0);
    }

    public static final void invokeOverAllPasses-H0pRuoY(@NotNull Function3 function30, @NotNull PointerEvent pointerEvent0, long v) {
        PointerInputTestUtilKt.invokeOverPasses-hUlJWOE(function30, pointerEvent0, CollectionsKt__CollectionsKt.listOf(new PointerEventPass[]{PointerEventPass.Initial, PointerEventPass.Main, PointerEventPass.Final}), v);
    }

    public static void invokeOverAllPasses-H0pRuoY$default(Function3 function30, PointerEvent pointerEvent0, long v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0x7FFFFFFF7FFFFFFFL;
        }
        PointerInputTestUtilKt.invokeOverAllPasses-H0pRuoY(function30, pointerEvent0, v);
    }

    public static final void invokeOverPass-hUlJWOE(@NotNull Function3 function30, @NotNull PointerEvent pointerEvent0, @NotNull PointerEventPass pointerEventPass0, long v) {
        PointerInputTestUtilKt.invokeOverPasses-hUlJWOE(function30, pointerEvent0, k.listOf(pointerEventPass0), v);
    }

    public static void invokeOverPass-hUlJWOE$default(Function3 function30, PointerEvent pointerEvent0, PointerEventPass pointerEventPass0, long v, int v1, Object object0) {
        if((v1 & 4) != 0) {
            v = 0x7FFFFFFF7FFFFFFFL;
        }
        PointerInputTestUtilKt.invokeOverPass-hUlJWOE(function30, pointerEvent0, pointerEventPass0, v);
    }

    public static final void invokeOverPasses-hUlJWOE(@NotNull Function3 function30, @NotNull PointerEvent pointerEvent0, @NotNull List list0, long v) {
        if(pointerEvent0.getChanges().isEmpty()) {
            throw new IllegalArgumentException("invokeOverPasses called with no changes");
        }
        if(list0.isEmpty()) {
            throw new IllegalArgumentException("invokeOverPasses called with no passes");
        }
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            function30.invoke(pointerEvent0, ((PointerEventPass)list0.get(v2)), IntSize.box-impl(v));
        }
    }

    public static final void invokeOverPasses-hUlJWOE(@NotNull Function3 function30, @NotNull PointerEvent pointerEvent0, @NotNull PointerEventPass[] arr_pointerEventPass, long v) {
        PointerInputTestUtilKt.invokeOverPasses-hUlJWOE(function30, pointerEvent0, ArraysKt___ArraysKt.toList(arr_pointerEventPass), v);
    }

    public static void invokeOverPasses-hUlJWOE$default(Function3 function30, PointerEvent pointerEvent0, List list0, long v, int v1, Object object0) {
        if((v1 & 4) != 0) {
            v = 0x7FFFFFFF7FFFFFFFL;
        }
        PointerInputTestUtilKt.invokeOverPasses-hUlJWOE(function30, pointerEvent0, list0, v);
    }

    public static void invokeOverPasses-hUlJWOE$default(Function3 function30, PointerEvent pointerEvent0, PointerEventPass[] arr_pointerEventPass, long v, int v1, Object object0) {
        if((v1 & 4) != 0) {
            v = 0x7FFFFFFF7FFFFFFFL;
        }
        PointerInputTestUtilKt.invokeOverPasses-hUlJWOE(function30, pointerEvent0, arr_pointerEventPass, v);
    }

    @NotNull
    public static final PointerInputChange moveBy(@NotNull PointerInputChange pointerInputChange0, long v, float f, float f1) {
        return new PointerInputChange(pointerInputChange0.getId-J3iCeTQ(), pointerInputChange0.getUptimeMillis() + v, OffsetKt.Offset(Offset.getX-impl(pointerInputChange0.getPosition-F1C5BW0()) + f, Offset.getY-impl(pointerInputChange0.getPosition-F1C5BW0()) + f1), true, 1.0f, pointerInputChange0.getUptimeMillis(), pointerInputChange0.getPosition-F1C5BW0(), pointerInputChange0.getPressed(), false, 0, 0L, 0x600, null);
    }

    public static PointerInputChange moveBy$default(PointerInputChange pointerInputChange0, long v, float f, float f1, int v1, Object object0) {
        if((v1 & 2) != 0) {
            f = 0.0f;
        }
        if((v1 & 4) != 0) {
            f1 = 0.0f;
        }
        return PointerInputTestUtilKt.moveBy(pointerInputChange0, v, f, f1);
    }

    @NotNull
    public static final PointerInputChange moveTo(@NotNull PointerInputChange pointerInputChange0, long v, float f, float f1) {
        return new PointerInputChange(pointerInputChange0.getId-J3iCeTQ(), v, OffsetKt.Offset(f, f1), true, 1.0f, pointerInputChange0.getUptimeMillis(), pointerInputChange0.getPosition-F1C5BW0(), pointerInputChange0.getPressed(), false, 0, 0L, 0x600, null);
    }

    public static PointerInputChange moveTo$default(PointerInputChange pointerInputChange0, long v, float f, float f1, int v1, Object object0) {
        if((v1 & 2) != 0) {
            f = 0.0f;
        }
        if((v1 & 4) != 0) {
            f1 = 0.0f;
        }
        return PointerInputTestUtilKt.moveTo(pointerInputChange0, v, f, f1);
    }

    @NotNull
    public static final PointerInputChange up(@NotNull PointerInputChange pointerInputChange0, long v) {
        return new PointerInputChange(pointerInputChange0.getId-J3iCeTQ(), v, pointerInputChange0.getPosition-F1C5BW0(), false, 1.0f, pointerInputChange0.getUptimeMillis(), pointerInputChange0.getPosition-F1C5BW0(), pointerInputChange0.getPressed(), false, 0, 0L, 0x600, null);
    }
}

