package androidx.compose.runtime;

import androidx.compose.foundation.text.selection.b1;
import androidx.compose.material3.cg;
import androidx.compose.material3.e0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import org.jetbrains.annotations.NotNull;
import y0.q;
import y0.r;
import y0.s;
import y0.t;
import y0.u;
import y0.v;
import y0.w;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001A)\u0010\u0002\u001A\r\u0012\u0004\u0012\u00020\u00040\u0003\u00A2\u0006\u0002\b\u00052\u0011\u0010\u0006\u001A\r\u0012\u0004\u0012\u00020\u00040\u0003\u00A2\u0006\u0002\b\u0005\u00A2\u0006\u0002\u0010\u0007\u001A;\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u00040\b\u00A2\u0006\u0002\b\u0005\"\u0004\b\u0000\u0010\t2\u0017\u0010\u0006\u001A\u0013\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u00040\b\u00A2\u0006\u0002\b\u0005\u00A2\u0006\u0002\u0010\n\u001AM\u0010\u0002\u001A\u0019\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\u00040\u000B\u00A2\u0006\u0002\b\u0005\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r2\u001D\u0010\u0006\u001A\u0019\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\u00040\u000B\u00A2\u0006\u0002\b\u0005\u00A2\u0006\u0002\u0010\u000E\u001A_\u0010\u0002\u001A\u001F\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u00040\u000F\u00A2\u0006\u0002\b\u0005\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u00102#\u0010\u0006\u001A\u001F\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u00040\u000F\u00A2\u0006\u0002\b\u0005\u00A2\u0006\u0002\u0010\u0011\u001Aq\u0010\u0002\u001A%\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u00020\u00040\u0012\u00A2\u0006\u0002\b\u0005\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u0010\"\u0004\b\u0003\u0010\u00132)\u0010\u0006\u001A%\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u00020\u00040\u0012\u00A2\u0006\u0002\b\u0005\u00A2\u0006\u0002\u0010\u0014\u001AE\u0010\u0015\u001A\u0018\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u00020\u00040\b\u00A2\u0006\u0002\b\u0005\u00A2\u0006\u0002\b\u0017\"\u0004\b\u0000\u0010\u00162\u001C\u0010\u0006\u001A\u0018\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u00020\u00040\b\u00A2\u0006\u0002\b\u0005\u00A2\u0006\u0002\b\u0017\u00A2\u0006\u0002\u0010\n\u001AW\u0010\u0015\u001A\u001E\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u00040\u000B\u00A2\u0006\u0002\b\u0005\u00A2\u0006\u0002\b\u0017\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\t2\"\u0010\u0006\u001A\u001E\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u00040\u000B\u00A2\u0006\u0002\b\u0005\u00A2\u0006\u0002\b\u0017\u00A2\u0006\u0002\u0010\u000E\u001Ai\u0010\u0015\u001A$\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\u00040\u000F\u00A2\u0006\u0002\b\u0005\u00A2\u0006\u0002\b\u0017\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\f\"\u0004\b\u0002\u0010\r2(\u0010\u0006\u001A$\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\u00040\u000F\u00A2\u0006\u0002\b\u0005\u00A2\u0006\u0002\b\u0017\u00A2\u0006\u0002\u0010\u0011\u001A{\u0010\u0015\u001A*\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u00040\u0012\u00A2\u0006\u0002\b\u0005\u00A2\u0006\u0002\b\u0017\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\f\"\u0004\b\u0002\u0010\r\"\u0004\b\u0003\u0010\u00102.\u0010\u0006\u001A*\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u00040\u0012\u00A2\u0006\u0002\b\u0005\u00A2\u0006\u0002\b\u0017\u00A2\u0006\u0002\u0010\u0014\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0080T\u00A2\u0006\u0002\n\u0000\u00A8\u0006\u0018"}, d2 = {"movableContentKey", "", "movableContentOf", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "(Lkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function2;", "Lkotlin/Function1;", "P", "(Lkotlin/jvm/functions/Function3;)Lkotlin/jvm/functions/Function3;", "Lkotlin/Function2;", "P1", "P2", "(Lkotlin/jvm/functions/Function4;)Lkotlin/jvm/functions/Function4;", "Lkotlin/Function3;", "P3", "(Lkotlin/jvm/functions/Function5;)Lkotlin/jvm/functions/Function5;", "Lkotlin/Function4;", "P4", "(Lkotlin/jvm/functions/Function6;)Lkotlin/jvm/functions/Function6;", "movableContentWithReceiverOf", "R", "Lkotlin/ExtensionFunctionType;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class MovableContentKt {
    public static final int movableContentKey = 0x78CC281;

    @NotNull
    public static final Function2 movableContentOf(@NotNull Function2 function20) {
        return ComposableLambdaKt.composableLambdaInstance(0xD9B6ABEF, true, new b1(new MovableContent(ComposableLambdaKt.composableLambdaInstance(-1079330685, true, new cg(function20, 2))), 21));
    }

    @NotNull
    public static final Function3 movableContentOf(@NotNull Function3 function30) {
        return ComposableLambdaKt.composableLambdaInstance(-434707029, true, new q(new MovableContent(function30), 0));
    }

    @NotNull
    public static final Function4 movableContentOf(@NotNull Function4 function40) {
        return ComposableLambdaKt.composableLambdaInstance(-1200019734, true, new r(new MovableContent(ComposableLambdaKt.composableLambdaInstance(0x6E41EDF1, true, new u(function40, 0))), 0));
    }

    @NotNull
    public static final Function5 movableContentOf(@NotNull Function5 function50) {
        return ComposableLambdaKt.composableLambdaInstance(-1083870185, true, new s(new MovableContent(ComposableLambdaKt.composableLambdaInstance(0xEF0C23B3, true, new v(function50, 0))), 0));
    }

    @NotNull
    public static final Function6 movableContentOf(@NotNull Function6 function60) {
        return ComposableLambdaKt.composableLambdaInstance(0x982D0E4F, true, new t(new MovableContent(ComposableLambdaKt.composableLambdaInstance(0x6FD65975, true, new w(function60, 0))), 0));
    }

    @ComposableInferredTarget(scheme = "[0[0]:[_]]")
    @NotNull
    public static final Function3 movableContentWithReceiverOf(@NotNull Function3 function30) {
        return ComposableLambdaKt.composableLambdaInstance(506997506, true, new q(new MovableContent(ComposableLambdaKt.composableLambdaInstance(0xEF37CA2, true, new e0(function30, 15))), 1));
    }

    @NotNull
    public static final Function4 movableContentWithReceiverOf(@NotNull Function4 function40) {
        return ComposableLambdaKt.composableLambdaInstance(0x2564AA06, true, new r(new MovableContent(ComposableLambdaKt.composableLambdaInstance(0x306766A6, true, new u(function40, 1))), 1));
    }

    @NotNull
    public static final Function5 movableContentWithReceiverOf(@NotNull Function5 function50) {
        return ComposableLambdaKt.composableLambdaInstance(0x22C605C5, true, new s(new MovableContent(ComposableLambdaKt.composableLambdaInstance(-1322148760, true, new v(function50, 1))), 1));
    }

    @NotNull
    public static final Function6 movableContentWithReceiverOf(@NotNull Function6 function60) {
        return ComposableLambdaKt.composableLambdaInstance(1468683306, true, new t(new MovableContent(ComposableLambdaKt.composableLambdaInstance(0x31FBD22A, true, new w(function60, 1))), 1));
    }
}

