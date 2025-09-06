package androidx.compose.foundation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0099\u0001\u0012\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u0012\u001B\b\u0002\u0010\b\u001A\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006\u0012\u0016\b\u0002\u0010\u000B\u001A\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001A\u00020\f\u0012\b\b\u0002\u0010\u000F\u001A\u00020\u000E\u0012\b\b\u0002\u0010\u0010\u001A\u00020\t\u0012\b\b\u0002\u0010\u0012\u001A\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001A\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001A\u00020\u000E\u0012\u0006\u0010\u0016\u001A\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000F\u0010\u0019\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001AJ\u0017\u0010\u001C\u001A\u00020\n2\u0006\u0010\u001B\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u001C\u0010\u001DJ\u001A\u0010 \u001A\u00020\u000E2\b\u0010\u001F\u001A\u0004\u0018\u00010\u001EH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000F\u0010#\u001A\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001A\u00020\n*\u00020%H\u0016¢\u0006\u0004\b&\u0010\'¨\u0006("}, d2 = {"Landroidx/compose/foundation/MagnifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/MagnifierNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ExtensionFunctionType;", "sourceCenter", "magnifierCenter", "Landroidx/compose/ui/unit/DpSize;", "", "onSizeChanged", "", "zoom", "", "useTextDefault", "size", "Landroidx/compose/ui/unit/Dp;", "cornerRadius", "elevation", "clippingEnabled", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "platformMagnifierFactory", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FZJFFZLandroidx/compose/foundation/PlatformMagnifierFactory;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "create", "()Landroidx/compose/foundation/MagnifierNode;", "node", "update", "(Landroidx/compose/foundation/MagnifierNode;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class MagnifierElement extends ModifierNodeElement {
    public static final int $stable;
    public final Function1 b;
    public final Function1 c;
    public final Function1 d;
    public final float e;
    public final boolean f;
    public final long g;
    public final float h;
    public final float i;
    public final boolean j;
    public final PlatformMagnifierFactory k;

    // 去混淆评级： 低(30)
    public MagnifierElement(Function1 function10, Function1 function11, Function1 function12, float f, boolean z, long v, float f1, float f2, boolean z1, PlatformMagnifierFactory platformMagnifierFactory0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this(function10, ((v1 & 2) == 0 ? function11 : null), ((v1 & 4) == 0 ? function12 : null), ((v1 & 8) == 0 ? f : NaNf), ((v1 & 16) == 0 ? z : false), ((v1 & 0x20) == 0 ? v : 0x7FC000007FC00000L), ((v1 & 0x40) == 0 ? f1 : NaNf), ((v1 & 0x80) == 0 ? f2 : NaNf), ((v1 & 0x100) == 0 ? z1 : true), platformMagnifierFactory0, null);
    }

    public MagnifierElement(Function1 function10, Function1 function11, Function1 function12, float f, boolean z, long v, float f1, float f2, boolean z1, PlatformMagnifierFactory platformMagnifierFactory0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.b = function10;
        this.c = function11;
        this.d = function12;
        this.e = f;
        this.f = z;
        this.g = v;
        this.h = f1;
        this.i = f2;
        this.j = z1;
        this.k = platformMagnifierFactory0;
    }

    @NotNull
    public MagnifierNode create() {
        return new MagnifierNode(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, null);
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
        if(!(object0 instanceof MagnifierElement)) {
            return false;
        }
        if(this.b != ((MagnifierElement)object0).b) {
            return false;
        }
        if(this.c != ((MagnifierElement)object0).c) {
            return false;
        }
        if(this.e != ((MagnifierElement)object0).e || this.f != ((MagnifierElement)object0).f) {
            return false;
        }
        if(!DpSize.equals-impl0(this.g, ((MagnifierElement)object0).g)) {
            return false;
        }
        if(!Dp.equals-impl0(this.h, ((MagnifierElement)object0).h)) {
            return false;
        }
        if(!Dp.equals-impl0(this.i, ((MagnifierElement)object0).i)) {
            return false;
        }
        if(this.j != ((MagnifierElement)object0).j) {
            return false;
        }
        return this.d == ((MagnifierElement)object0).d ? Intrinsics.areEqual(this.k, ((MagnifierElement)object0).k) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int v = 0;
        int v1 = a.e(a.C(this.i, a.C(this.h, (DpSize.hashCode-impl(this.g) + a.e(a.b(this.e, (this.b.hashCode() * 0x1F + (this.c == null ? 0 : this.c.hashCode())) * 0x1F, 0x1F), 0x1F, this.f)) * 0x1F, 0x1F), 0x1F), 0x1F, this.j);
        Function1 function10 = this.d;
        if(function10 != null) {
            v = function10.hashCode();
        }
        return this.k.hashCode() + (v1 + v) * 0x1F;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("magnifier");
        inspectorInfo0.getProperties().set("sourceCenter", this.b);
        inspectorInfo0.getProperties().set("magnifierCenter", this.c);
        inspectorInfo0.getProperties().set("zoom", this.e);
        inspectorInfo0.getProperties().set("size", DpSize.box-impl(this.g));
        ValueElementSequence valueElementSequence0 = a.j(this.h, inspectorInfo0.getProperties(), "cornerRadius", inspectorInfo0);
        a.j(this.i, valueElementSequence0, "elevation", inspectorInfo0).set("clippingEnabled", Boolean.valueOf(this.j));
    }

    public void update(@NotNull MagnifierNode magnifierNode0) {
        magnifierNode0.update-5F03MCQ(this.b, this.c, this.e, this.f, this.g, this.h, this.i, this.j, this.d, this.k);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void update(Node modifier$Node0) {
        this.update(((MagnifierNode)modifier$Node0));
    }
}

