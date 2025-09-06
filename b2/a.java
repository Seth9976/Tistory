package b2;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.node.AlignmentLines;
import androidx.compose.ui.node.AlignmentLinesOwner;
import androidx.compose.ui.node.NodeCoordinator;
import java.util.Iterator;
import java.util.Map.Entry;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public final AlignmentLines w;

    public a(AlignmentLines alignmentLines0) {
        this.w = alignmentLines0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        AlignmentLines alignmentLines0;
        if(((AlignmentLinesOwner)object0).isPlaced()) {
            if(((AlignmentLinesOwner)object0).getAlignmentLines().getDirty$ui_release()) {
                ((AlignmentLinesOwner)object0).layoutChildren();
            }
            Iterator iterator0 = ((AlignmentLinesOwner)object0).getAlignmentLines().i.entrySet().iterator();
            while(true) {
                boolean z = iterator0.hasNext();
                alignmentLines0 = this.w;
                if(!z) {
                    break;
                }
                Object object1 = iterator0.next();
                AlignmentLines.access$addAlignmentLine(alignmentLines0, ((AlignmentLine)((Map.Entry)object1).getKey()), ((Number)((Map.Entry)object1).getValue()).intValue(), ((AlignmentLinesOwner)object0).getInnerCoordinator());
            }
            NodeCoordinator nodeCoordinator0 = ((AlignmentLinesOwner)object0).getInnerCoordinator().getWrappedBy$ui_release();
            Intrinsics.checkNotNull(nodeCoordinator0);
            while(!Intrinsics.areEqual(nodeCoordinator0, alignmentLines0.getAlignmentLinesOwner().getInnerCoordinator())) {
                for(Object object2: alignmentLines0.getAlignmentLinesMap(nodeCoordinator0).keySet()) {
                    AlignmentLines.access$addAlignmentLine(alignmentLines0, ((AlignmentLine)object2), alignmentLines0.getPositionFor(nodeCoordinator0, ((AlignmentLine)object2)), nodeCoordinator0);
                }
                nodeCoordinator0 = nodeCoordinator0.getWrappedBy$ui_release();
                Intrinsics.checkNotNull(nodeCoordinator0);
            }
        }
        return Unit.INSTANCE;
    }
}

