package androidx.compose.foundation;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import r0.a;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Scroll.kt\nandroidx/compose/foundation/ScrollKt\n*L\n1#1,178:1\n298#2,7:179\n*E\n"})
public final class ScrollKt.scroll..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
    public final boolean A;
    public final ScrollState w;
    public final boolean x;
    public final FlingBehavior y;
    public final boolean z;

    public ScrollKt.scroll..inlined.debugInspectorInfo.1(ScrollState scrollState0, boolean z, FlingBehavior flingBehavior0, boolean z1, boolean z2) {
        this.w = scrollState0;
        this.x = z;
        this.y = flingBehavior0;
        this.z = z1;
        this.A = z2;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.invoke(((InspectorInfo)object0));
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("scroll");
        inspectorInfo0.getProperties().set("state", this.w);
        a.k(this.x, inspectorInfo0.getProperties(), "reverseScrolling", inspectorInfo0).set("flingBehavior", this.y);
        a.k(this.z, inspectorInfo0.getProperties(), "isScrollable", inspectorInfo0).set("isVertical", Boolean.valueOf(this.A));
    }
}

