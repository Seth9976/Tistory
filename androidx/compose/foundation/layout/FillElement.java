package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/FillElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/h1;", "Companion", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class FillElement extends ModifierNodeElement {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/layout/FillElement$Companion;", "", "", "fraction", "Landroidx/compose/foundation/layout/FillElement;", "width", "(F)Landroidx/compose/foundation/layout/FillElement;", "height", "size", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @Stable
        @NotNull
        public final FillElement height(float f) {
            return new FillElement(Direction.Vertical, f, "fillMaxHeight");
        }

        @Stable
        @NotNull
        public final FillElement size(float f) {
            return new FillElement(Direction.Both, f, "fillMaxSize");
        }

        @Stable
        @NotNull
        public final FillElement width(float f) {
            return new FillElement(Direction.Horizontal, f, "fillMaxWidth");
        }
    }

    public final Direction b;
    public final float c;
    public final String d;
    public static final Companion e;

    static {
        FillElement.e = new Companion(null);
    }

    public FillElement(Direction direction0, float f, String s) {
        this.b = direction0;
        this.c = f;
        this.d = s;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        Node modifier$Node0 = new h1();  // 初始化器: Landroidx/compose/ui/Modifier$Node;-><init>()V
        modifier$Node0.n = this.b;
        modifier$Node0.o = this.c;
        return modifier$Node0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FillElement)) {
            return false;
        }
        return this.b == ((FillElement)object0).b ? this.c == ((FillElement)object0).c : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return Float.hashCode(this.c) + this.b.hashCode() * 0x1F;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName(this.d);
        inspectorInfo0.getProperties().set("fraction", this.c);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((h1)modifier$Node0).n = this.b;
        ((h1)modifier$Node0).o = this.c;
    }
}

