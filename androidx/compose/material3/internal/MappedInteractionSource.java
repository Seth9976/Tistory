package androidx.compose.material3.internal;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001A\u00020\u0001\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001A\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\f¨\u0006\u000E"}, d2 = {"Landroidx/compose/material3/internal/MappedInteractionSource;", "Landroidx/compose/foundation/interaction/InteractionSource;", "underlyingInteractionSource", "Landroidx/compose/ui/geometry/Offset;", "delta", "<init>", "(Landroidx/compose/foundation/interaction/InteractionSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/compose/foundation/interaction/Interaction;", "c", "Lkotlinx/coroutines/flow/Flow;", "getInteractions", "()Lkotlinx/coroutines/flow/Flow;", "interactions", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMappedInteractionSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MappedInteractionSource.kt\nandroidx/compose/material3/internal/MappedInteractionSource\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,65:1\n53#2:66\n55#2:70\n50#3:67\n55#3:69\n107#4:68\n*S KotlinDebug\n*F\n+ 1 MappedInteractionSource.kt\nandroidx/compose/material3/internal/MappedInteractionSource\n*L\n35#1:66\n35#1:70\n35#1:67\n35#1:69\n35#1:68\n*E\n"})
public final class MappedInteractionSource implements InteractionSource {
    public static final int $stable;
    public final long a;
    public final LinkedHashMap b;
    public final MappedInteractionSource.special..inlined.map.1 c;

    public MappedInteractionSource(InteractionSource interactionSource0, long v, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = new LinkedHashMap();
        this.c = new MappedInteractionSource.special..inlined.map.1(interactionSource0.getInteractions(), this);
    }

    public static final Press access$mapPress(MappedInteractionSource mappedInteractionSource0, Press pressInteraction$Press0) {
        mappedInteractionSource0.getClass();
        return new Press(Offset.minus-MK-Hz9U(pressInteraction$Press0.getPressPosition-F1C5BW0(), mappedInteractionSource0.a), null);
    }

    @Override  // androidx.compose.foundation.interaction.InteractionSource
    @NotNull
    public Flow getInteractions() {
        return this.c;
    }
}

