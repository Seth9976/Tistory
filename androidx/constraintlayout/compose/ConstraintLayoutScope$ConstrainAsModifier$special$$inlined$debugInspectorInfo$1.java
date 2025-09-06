package androidx.constraintlayout.compose;

import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 5, 1}, xi = 0x30)
public final class ConstraintLayoutScope.ConstrainAsModifier.special..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
    public final ConstrainedLayoutReference w;
    public final Function1 x;

    public ConstraintLayoutScope.ConstrainAsModifier.special..inlined.debugInspectorInfo.1(ConstrainedLayoutReference constrainedLayoutReference0, Function1 function10) {
        this.w = constrainedLayoutReference0;
        this.x = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.invoke(((InspectorInfo)object0));
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
        Intrinsics.checkNotNullParameter(inspectorInfo0, "$this$null");
        inspectorInfo0.setName("constrainAs");
        inspectorInfo0.getProperties().set("ref", this.w);
        inspectorInfo0.getProperties().set("constrainBlock", this.x);
    }
}

