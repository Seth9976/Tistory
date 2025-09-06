package androidx.compose.ui.scrollcapture;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import f2.h;
import f2.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import l1.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\"E\u0010\n\u001A/\b\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\t¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/Function2;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "name", "offset", "Lkotlin/coroutines/Continuation;", "", "getScrollCaptureScrollByAction", "(Landroidx/compose/ui/semantics/SemanticsNode;)Lkotlin/jvm/functions/Function2;", "scrollCaptureScrollByAction", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nScrollCapture.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollCapture.android.kt\nandroidx/compose/ui/scrollcapture/ScrollCapture_androidKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,238:1\n205#1:239\n206#1:243\n207#1,2:245\n209#1:248\n210#1,5:258\n1208#2:240\n1187#2,2:241\n1208#2:263\n1187#2,2:264\n138#3:244\n48#3:247\n138#3:266\n48#3:267\n138#3:268\n66#4,9:249\n*S KotlinDebug\n*F\n+ 1 ScrollCapture.android.kt\nandroidx/compose/ui/scrollcapture/ScrollCapture_androidKt\n*L\n135#1:239\n135#1:243\n135#1:245,2\n135#1:248\n135#1:258,5\n135#1:240\n135#1:241,2\n205#1:263\n205#1:264,2\n135#1:244\n135#1:247\n206#1:266\n208#1:267\n211#1:268\n141#1:249,9\n*E\n"})
public final class ScrollCapture_androidKt {
    public static final void a(SemanticsNode semanticsNode0, int v, h h0) {
        MutableVector mutableVector0 = new MutableVector(new SemanticsNode[16], 0);
        List list0 = semanticsNode0.getChildren$ui_release(false, false, false);
    alab1:
        while(true) {
            mutableVector0.addAll(mutableVector0.getSize(), list0);
            while(true) {
                if(!mutableVector0.isNotEmpty()) {
                    break alab1;
                }
                SemanticsNode semanticsNode1 = (SemanticsNode)q.j(mutableVector0, 1);
                if(!semanticsNode1.isTransparent$ui_release()) {
                    SemanticsProperties semanticsProperties0 = SemanticsProperties.INSTANCE;
                    if(!semanticsNode1.getUnmergedConfig$ui_release().contains(semanticsProperties0.getInvisibleToUser()) && !semanticsNode1.getUnmergedConfig$ui_release().contains(semanticsProperties0.getDisabled())) {
                        NodeCoordinator nodeCoordinator0 = semanticsNode1.findCoordinatorToGetBounds$ui_release();
                        if(nodeCoordinator0 == null) {
                            throw a.b("Expected semantics node to have a coordinator.");
                        }
                        IntRect intRect0 = IntRectKt.roundToIntRect(LayoutCoordinatesKt.boundsInWindow(nodeCoordinator0));
                        if(!intRect0.isEmpty()) {
                            Function2 function20 = ScrollCapture_androidKt.getScrollCaptureScrollByAction(semanticsNode1);
                            ScrollAxisRange scrollAxisRange0 = (ScrollAxisRange)SemanticsConfigurationKt.getOrNull(semanticsNode1.getUnmergedConfig$ui_release(), semanticsProperties0.getVerticalScrollAxisRange());
                            if(function20 == null || scrollAxisRange0 == null || ((Number)scrollAxisRange0.getMaxValue().invoke()).floatValue() <= 0.0f) {
                                list0 = semanticsNode1.getChildren$ui_release(false, false, false);
                                break;
                            }
                            h0.invoke(new i(semanticsNode1, v + 1, intRect0, nodeCoordinator0));
                            ScrollCapture_androidKt.a(semanticsNode1, v + 1, h0);
                        }
                    }
                }
            }
        }
    }

    @Nullable
    public static final Function2 getScrollCaptureScrollByAction(@NotNull SemanticsNode semanticsNode0) {
        return (Function2)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getScrollByOffset());
    }
}

