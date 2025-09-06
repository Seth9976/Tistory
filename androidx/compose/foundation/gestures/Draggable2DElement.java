package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;
import z.b;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&Bw\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001A\u00020\u0005\u0012!\u0010\u0010\u001A\u001D\u0012\u0013\u0012\u00110\u000B¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u00020\u000F0\n\u0012!\u0010\u0013\u001A\u001D\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000F0\n\u0012\u0006\u0010\u0014\u001A\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u0017\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001A\u001A\u00020\u000F2\u0006\u0010\u0019\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u001A\u0010\u001BJ\u001A\u0010\u001E\u001A\u00020\u00052\b\u0010\u001D\u001A\u0004\u0018\u00010\u001CH\u0096\u0002¢\u0006\u0004\b\u001E\u0010\u001FJ\u000F\u0010!\u001A\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001A\u00020\u000F*\u00020#H\u0016¢\u0006\u0004\b$\u0010%¨\u0006\'"}, d2 = {"Landroidx/compose/foundation/gestures/Draggable2DElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/gestures/Draggable2DNode;", "Landroidx/compose/foundation/gestures/Draggable2DState;", "state", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "startDragImmediately", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "name", "startedPosition", "", "onDragStarted", "Landroidx/compose/ui/unit/Velocity;", "velocity", "onDragStopped", "reverseDirection", "<init>", "(Landroidx/compose/foundation/gestures/Draggable2DState;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)V", "create", "()Landroidx/compose/foundation/gestures/Draggable2DNode;", "node", "update", "(Landroidx/compose/foundation/gestures/Draggable2DNode;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Draggable2DElement extends ModifierNodeElement {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R#\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001A\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/gestures/Draggable2DElement$Companion;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "CanDrag", "Lkotlin/jvm/functions/Function1;", "getCanDrag", "()Lkotlin/jvm/functions/Function1;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Function1 getCanDrag() {
            return Draggable2DElement.i;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final Draggable2DState b;
    public final boolean c;
    public final MutableInteractionSource d;
    public final boolean e;
    public final Function1 f;
    public final Function1 g;
    public final boolean h;
    public static final b i;

    static {
        Draggable2DElement.Companion = new Companion(null);
        Draggable2DElement.i = b.F;
    }

    public Draggable2DElement(@NotNull Draggable2DState draggable2DState0, boolean z, @Nullable MutableInteractionSource mutableInteractionSource0, boolean z1, @NotNull Function1 function10, @NotNull Function1 function11, boolean z2) {
        this.b = draggable2DState0;
        this.c = z;
        this.d = mutableInteractionSource0;
        this.e = z1;
        this.f = function10;
        this.g = function11;
        this.h = z2;
    }

    @NotNull
    public Draggable2DNode create() {
        return new Draggable2DNode(this.b, Draggable2DElement.i, this.c, this.d, this.e, this.h, null, this.f, null, this.g, 320, null);
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
        if(Draggable2DElement.class != class0) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((Draggable2DElement)object0).b)) {
            return false;
        }
        if(this.c != ((Draggable2DElement)object0).c) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((Draggable2DElement)object0).d)) {
            return false;
        }
        if(this.e != ((Draggable2DElement)object0).e) {
            return false;
        }
        if(this.f != ((Draggable2DElement)object0).f) {
            return false;
        }
        return this.g == ((Draggable2DElement)object0).g ? this.h == ((Draggable2DElement)object0).h : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int v = a.e(this.b.hashCode() * 0x1F, 0x1F, this.c);
        return this.d == null ? Boolean.hashCode(this.h) + a.d(a.d(a.e(v * 0x1F, 0x1F, this.e), 0x1F, this.f), 0x1F, this.g) : Boolean.hashCode(this.h) + a.d(a.d(a.e((v + this.d.hashCode()) * 0x1F, 0x1F, this.e), 0x1F, this.f), 0x1F, this.g);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("draggable2D");
        a.k(this.c, inspectorInfo0.getProperties(), "enabled", inspectorInfo0).set("interactionSource", this.d);
        a.k(this.e, inspectorInfo0.getProperties(), "startDragImmediately", inspectorInfo0).set("onDragStarted", this.f);
        inspectorInfo0.getProperties().set("onDragStopped", this.g);
        a.k(this.h, inspectorInfo0.getProperties(), "reverseDirection", inspectorInfo0).set("state", this.b);
    }

    public void update(@NotNull Draggable2DNode draggable2DNode0) {
        Draggable2DNode.update$default(draggable2DNode0, this.b, Draggable2DElement.i, this.c, this.d, this.e, this.h, null, null, this.f, this.g, 0xC0, null);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void update(Node modifier$Node0) {
        this.update(((Draggable2DNode)modifier$Node0));
    }
}

