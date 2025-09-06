package androidx.compose.material;

import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import r0.a;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Slider.kt\nandroidx/compose/material/SliderKt\n*L\n1#1,170:1\n940#2,10:171\n*E\n"})
public final class SliderKt.sliderTapModifier..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
    public final State A;
    public final State B;
    public final MutableState C;
    public final boolean D;
    public final DraggableState w;
    public final MutableInteractionSource x;
    public final float y;
    public final boolean z;

    public SliderKt.sliderTapModifier..inlined.debugInspectorInfo.1(DraggableState draggableState0, MutableInteractionSource mutableInteractionSource0, float f, boolean z, State state0, State state1, MutableState mutableState0, boolean z1) {
        this.w = draggableState0;
        this.x = mutableInteractionSource0;
        this.y = f;
        this.z = z;
        this.A = state0;
        this.B = state1;
        this.C = mutableState0;
        this.D = z1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.invoke(((InspectorInfo)object0));
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("sliderTapModifier");
        inspectorInfo0.getProperties().set("draggableState", this.w);
        inspectorInfo0.getProperties().set("interactionSource", this.x);
        inspectorInfo0.getProperties().set("maxPx", this.y);
        a.k(this.z, inspectorInfo0.getProperties(), "isRtl", inspectorInfo0).set("rawOffset", this.A);
        inspectorInfo0.getProperties().set("gestureEndAction", this.B);
        inspectorInfo0.getProperties().set("pressOffset", this.C);
        inspectorInfo0.getProperties().set("enabled", Boolean.valueOf(this.D));
    }
}

