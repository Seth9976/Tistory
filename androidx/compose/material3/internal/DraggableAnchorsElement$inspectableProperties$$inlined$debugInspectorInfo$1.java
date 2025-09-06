package androidx.compose.material3.internal;

import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 AnchoredDraggable.kt\nandroidx/compose/material3/internal/DraggableAnchorsElement\n*L\n1#1,178:1\n822#2,4:179\n*E\n"})
public final class DraggableAnchorsElement.inspectableProperties..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
    public final DraggableAnchorsElement w;

    public DraggableAnchorsElement.inspectableProperties..inlined.debugInspectorInfo.1(DraggableAnchorsElement draggableAnchorsElement0) {
        this.w = draggableAnchorsElement0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.invoke(((InspectorInfo)object0));
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
        inspectorInfo0.getProperties().set("state", this.w.b);
        inspectorInfo0.getProperties().set("anchors", this.w.c);
        inspectorInfo0.getProperties().set("orientation", this.w.d);
    }
}

