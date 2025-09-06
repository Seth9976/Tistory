package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import r0.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/x4;", "Companion", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
final class WrapContentElement extends ModifierNodeElement {
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001F\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001F\u0010\n\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\t2\u0006\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000BJ\u001F\u0010\r\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\f2\u0006\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement$Companion;", "", "Landroidx/compose/ui/Alignment$Horizontal;", "align", "", "unbounded", "Landroidx/compose/foundation/layout/WrapContentElement;", "width", "(Landroidx/compose/ui/Alignment$Horizontal;Z)Landroidx/compose/foundation/layout/WrapContentElement;", "Landroidx/compose/ui/Alignment$Vertical;", "height", "(Landroidx/compose/ui/Alignment$Vertical;Z)Landroidx/compose/foundation/layout/WrapContentElement;", "Landroidx/compose/ui/Alignment;", "size", "(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/foundation/layout/WrapContentElement;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @Stable
        @NotNull
        public final WrapContentElement height(@NotNull Vertical alignment$Vertical0, boolean z) {
            t4 t40 = new t4(alignment$Vertical0);
            return new WrapContentElement(Direction.Vertical, z, t40, alignment$Vertical0, "wrapContentHeight");
        }

        @Stable
        @NotNull
        public final WrapContentElement size(@NotNull Alignment alignment0, boolean z) {
            u4 u40 = new u4(alignment0);
            return new WrapContentElement(Direction.Both, z, u40, alignment0, "wrapContentSize");
        }

        @Stable
        @NotNull
        public final WrapContentElement width(@NotNull Horizontal alignment$Horizontal0, boolean z) {
            v4 v40 = new v4(alignment$Horizontal0);
            return new WrapContentElement(Direction.Horizontal, z, v40, alignment$Horizontal0, "wrapContentWidth");
        }
    }

    public final Direction b;
    public final boolean c;
    public final Lambda d;
    public final Object e;
    public final String f;
    public static final Companion g;

    static {
        WrapContentElement.g = new Companion(null);
    }

    public WrapContentElement(Direction direction0, boolean z, Function2 function20, Object object0, String s) {
        this.b = direction0;
        this.c = z;
        this.d = (Lambda)function20;
        this.e = object0;
        this.f = s;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final Node create() {
        Node modifier$Node0 = new x4();  // 初始化器: Landroidx/compose/ui/Modifier$Node;-><init>()V
        modifier$Node0.n = this.b;
        modifier$Node0.o = this.c;
        modifier$Node0.p = this.d;
        return modifier$Node0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        Class class0 = object0.getClass();
        if(WrapContentElement.class != class0) {
            return false;
        }
        if(this.b != ((WrapContentElement)object0).b) {
            return false;
        }
        return this.c == ((WrapContentElement)object0).c ? Intrinsics.areEqual(this.e, ((WrapContentElement)object0).e) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.e.hashCode() + a.e(this.b.hashCode() * 0x1F, 0x1F, this.c);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName(this.f);
        inspectorInfo0.getProperties().set("align", this.e);
        inspectorInfo0.getProperties().set("unbounded", Boolean.valueOf(this.c));
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Node modifier$Node0) {
        ((x4)modifier$Node0).n = this.b;
        ((x4)modifier$Node0).o = this.c;
        ((x4)modifier$Node0).p = this.d;
    }
}

