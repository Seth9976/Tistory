package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
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
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)B­\u0001\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001A\u00020\u0005\u0012<\u0010\u0014\u001A8\b\u0001\u0012\u0004\u0012\u00020\u000B\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u000F\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\n¢\u0006\u0002\b\u0013\u0012<\u0010\u0017\u001A8\b\u0001\u0012\u0004\u0012\u00020\u000B\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\n¢\u0006\u0002\b\u0013\u0012\u0006\u0010\u0018\u001A\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001AJ\u000F\u0010\u001B\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u001B\u0010\u001CJ\u0017\u0010\u001E\u001A\u00020\u00112\u0006\u0010\u001D\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u001E\u0010\u001FJ\u001A\u0010!\u001A\u00020\u00052\b\u0010 \u001A\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000F\u0010$\u001A\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0013\u0010\'\u001A\u00020\u0011*\u00020&H\u0016¢\u0006\u0004\b\'\u0010(¨\u0006*"}, d2 = {"Landroidx/compose/foundation/gestures/Draggable2DCompatElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/gestures/Draggable2DNode;", "Landroidx/compose/foundation/gestures/Draggable2DState;", "state", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "name", "startedPosition", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "onDragStarted", "Landroidx/compose/ui/unit/Velocity;", "velocity", "onDragStopped", "reverseDirection", "<init>", "(Landroidx/compose/foundation/gestures/Draggable2DState;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)V", "create", "()Landroidx/compose/foundation/gestures/Draggable2DNode;", "node", "update", "(Landroidx/compose/foundation/gestures/Draggable2DNode;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Draggable2DCompatElement extends ModifierNodeElement {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R#\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001A\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/gestures/Draggable2DCompatElement$Companion;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "CanDrag", "Lkotlin/jvm/functions/Function1;", "getCanDrag", "()Lkotlin/jvm/functions/Function1;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Function1 getCanDrag() {
            return Draggable2DCompatElement.i;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final Draggable2DState b;
    public final boolean c;
    public final MutableInteractionSource d;
    public final boolean e;
    public final Function3 f;
    public final Function3 g;
    public final boolean h;
    public static final b i;

    static {
        Draggable2DCompatElement.Companion = new Companion(null);
        Draggable2DCompatElement.i = b.E;
    }

    public Draggable2DCompatElement(@NotNull Draggable2DState draggable2DState0, boolean z, @Nullable MutableInteractionSource mutableInteractionSource0, boolean z1, @NotNull Function3 function30, @NotNull Function3 function31, boolean z2) {
        this.b = draggable2DState0;
        this.c = z;
        this.d = mutableInteractionSource0;
        this.e = z1;
        this.f = function30;
        this.g = function31;
        this.h = z2;
    }

    @NotNull
    public Draggable2DNode create() {
        return new Draggable2DNode(this.b, Draggable2DCompatElement.i, this.c, this.d, this.e, this.h, this.f, null, this.g, null, 640, null);
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
        if(Draggable2DCompatElement.class != class0) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((Draggable2DCompatElement)object0).b)) {
            return false;
        }
        if(this.c != ((Draggable2DCompatElement)object0).c) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((Draggable2DCompatElement)object0).d)) {
            return false;
        }
        if(this.e != ((Draggable2DCompatElement)object0).e) {
            return false;
        }
        if(this.f != ((Draggable2DCompatElement)object0).f) {
            return false;
        }
        return this.g == ((Draggable2DCompatElement)object0).g ? this.h == ((Draggable2DCompatElement)object0).h : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int v = a.e(this.b.hashCode() * 0x1F, 0x1F, this.c);
        return this.d == null ? Boolean.hashCode(this.h) + (this.g.hashCode() + (this.f.hashCode() + a.e(v * 0x1F, 0x1F, this.e)) * 0x1F) * 0x1F : Boolean.hashCode(this.h) + (this.g.hashCode() + (this.f.hashCode() + a.e((v + this.d.hashCode()) * 0x1F, 0x1F, this.e)) * 0x1F) * 0x1F;
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
        Draggable2DNode.update$default(draggable2DNode0, this.b, Draggable2DCompatElement.i, this.c, this.d, this.e, this.h, this.f, this.g, null, null, 0x300, null);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void update(Node modifier$Node0) {
        this.update(((Draggable2DNode)modifier$Node0));
    }
}

