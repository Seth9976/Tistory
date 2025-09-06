package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;
import z.b;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+Bµ\u0001\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\b\u0010\n\u001A\u0004\u0018\u00010\t\u0012\u0006\u0010\u000B\u001A\u00020\u0007\u0012<\u0010\u0016\u001A8\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0013\u0012\u00110\u000E¢\u0006\f\b\u000F\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00140\f¢\u0006\u0002\b\u0015\u0012<\u0010\u0019\u001A8\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u000F\u0012\b\b\u0010\u0012\u0004\b\b(\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00140\f¢\u0006\u0002\b\u0015\u0012\u0006\u0010\u001A\u001A\u00020\u0007¢\u0006\u0004\b\u001B\u0010\u001CJ\u000F\u0010\u001D\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u001D\u0010\u001EJ\u0017\u0010 \u001A\u00020\u00132\u0006\u0010\u001F\u001A\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u001A\u0010#\u001A\u00020\u00072\b\u0010\"\u001A\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000F\u0010&\u001A\u00020%H\u0016¢\u0006\u0004\b&\u0010\'J\u0013\u0010)\u001A\u00020\u0013*\u00020(H\u0016¢\u0006\u0004\b)\u0010*¨\u0006,"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/gestures/DraggableNode;", "Landroidx/compose/foundation/gestures/DraggableState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "name", "startedPosition", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "onDragStarted", "", "velocity", "onDragStopped", "reverseDirection", "<init>", "(Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)V", "create", "()Landroidx/compose/foundation/gestures/DraggableNode;", "node", "update", "(Landroidx/compose/foundation/gestures/DraggableNode;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DraggableElement extends ModifierNodeElement {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R#\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001A\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableElement$Companion;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "CanDrag", "Lkotlin/jvm/functions/Function1;", "getCanDrag", "()Lkotlin/jvm/functions/Function1;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Function1 getCanDrag() {
            return DraggableElement.j;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final DraggableState b;
    public final Orientation c;
    public final boolean d;
    public final MutableInteractionSource e;
    public final boolean f;
    public final Function3 g;
    public final Function3 h;
    public final boolean i;
    public static final b j;

    static {
        DraggableElement.Companion = new Companion(null);
        DraggableElement.j = b.I;
    }

    public DraggableElement(@NotNull DraggableState draggableState0, @NotNull Orientation orientation0, boolean z, @Nullable MutableInteractionSource mutableInteractionSource0, boolean z1, @NotNull Function3 function30, @NotNull Function3 function31, boolean z2) {
        this.b = draggableState0;
        this.c = orientation0;
        this.d = z;
        this.e = mutableInteractionSource0;
        this.f = z1;
        this.g = function30;
        this.h = function31;
        this.i = z2;
    }

    @NotNull
    public DraggableNode create() {
        return new DraggableNode(this.b, DraggableElement.j, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public Node create() {
        return this.create();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        Class class0 = object0.getClass();
        if(DraggableElement.class != class0) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((DraggableElement)object0).b)) {
            return false;
        }
        if(this.c != ((DraggableElement)object0).c) {
            return false;
        }
        if(this.d != ((DraggableElement)object0).d) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, ((DraggableElement)object0).e)) {
            return false;
        }
        if(this.f != ((DraggableElement)object0).f) {
            return false;
        }
        if(!Intrinsics.areEqual(this.g, ((DraggableElement)object0).g)) {
            return false;
        }
        return Intrinsics.areEqual(this.h, ((DraggableElement)object0).h) ? this.i == ((DraggableElement)object0).i : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int v = a.e((this.c.hashCode() + this.b.hashCode() * 0x1F) * 0x1F, 0x1F, this.d);
        return this.e == null ? Boolean.hashCode(this.i) + (this.h.hashCode() + (this.g.hashCode() + a.e(v * 0x1F, 0x1F, this.f)) * 0x1F) * 0x1F : Boolean.hashCode(this.i) + (this.h.hashCode() + (this.g.hashCode() + a.e((v + this.e.hashCode()) * 0x1F, 0x1F, this.f)) * 0x1F) * 0x1F;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("draggable");
        inspectorInfo0.getProperties().set("orientation", this.c);
        ValueElementSequence valueElementSequence0 = a.k(this.d, inspectorInfo0.getProperties(), "enabled", inspectorInfo0);
        a.k(this.i, valueElementSequence0, "reverseDirection", inspectorInfo0).set("interactionSource", this.e);
        a.k(this.f, inspectorInfo0.getProperties(), "startDragImmediately", inspectorInfo0).set("onDragStarted", this.g);
        inspectorInfo0.getProperties().set("onDragStopped", this.h);
        inspectorInfo0.getProperties().set("state", this.b);
    }

    public void update(@NotNull DraggableNode draggableNode0) {
        draggableNode0.update(this.b, DraggableElement.j, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void update(Node modifier$Node0) {
        this.update(((DraggableNode)modifier$Node0));
    }
}

