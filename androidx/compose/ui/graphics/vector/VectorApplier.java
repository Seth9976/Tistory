package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.AbstractApplier;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001F\u0010\n\u001A\u00020\t2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u001F\u0010\f\u001A\u00020\t2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000BJ\u001F\u0010\u000E\u001A\u00020\t2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\r\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0010\u001A\u00020\tH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\'\u0010\u0014\u001A\u00020\t2\u0006\u0010\u0012\u001A\u00020\u00062\u0006\u0010\u0013\u001A\u00020\u00062\u0006\u0010\r\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorApplier;", "Landroidx/compose/runtime/AbstractApplier;", "Landroidx/compose/ui/graphics/vector/VNode;", "root", "<init>", "(Landroidx/compose/ui/graphics/vector/VNode;)V", "", "index", "instance", "", "insertTopDown", "(ILandroidx/compose/ui/graphics/vector/VNode;)V", "insertBottomUp", "count", "remove", "(II)V", "onClear", "()V", "from", "to", "move", "(III)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nVectorCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorCompose.kt\nandroidx/compose/ui/graphics/vector/VectorApplier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
public final class VectorApplier extends AbstractApplier {
    public static final int $stable;

    public VectorApplier(@NotNull VNode vNode0) {
        super(vNode0);
    }

    public static GroupComponent a(VNode vNode0) {
        if(!(vNode0 instanceof GroupComponent)) {
            throw new IllegalStateException("Cannot only insert VNode into Group");
        }
        return (GroupComponent)vNode0;
    }

    public void insertBottomUp(int v, @NotNull VNode vNode0) {
        VectorApplier.a(((VNode)this.getCurrent())).insertAt(v, vNode0);
    }

    @Override  // androidx.compose.runtime.Applier
    public void insertBottomUp(int v, Object object0) {
        this.insertBottomUp(v, ((VNode)object0));
    }

    public void insertTopDown(int v, @NotNull VNode vNode0) {
    }

    @Override  // androidx.compose.runtime.Applier
    public void insertTopDown(int v, Object object0) {
    }

    @Override  // androidx.compose.runtime.Applier
    public void move(int v, int v1, int v2) {
        VectorApplier.a(((VNode)this.getCurrent())).move(v, v1, v2);
    }

    @Override  // androidx.compose.runtime.AbstractApplier
    public void onClear() {
        GroupComponent groupComponent0 = VectorApplier.a(((VNode)this.getRoot()));
        groupComponent0.remove(0, groupComponent0.getNumChildren());
    }

    @Override  // androidx.compose.runtime.Applier
    public void remove(int v, int v1) {
        VectorApplier.a(((VNode)this.getCurrent())).remove(v, v1);
    }
}

