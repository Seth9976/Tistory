package androidx.compose.ui.node;

import androidx.compose.ui.Modifier.Node;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function0 {
    public final HitTestResult A;
    public final boolean B;
    public final boolean C;
    public final NodeCoordinator w;
    public final Node x;
    public final HitTestSource y;
    public final long z;

    public z(NodeCoordinator nodeCoordinator0, Node modifier$Node0, HitTestSource nodeCoordinator$HitTestSource0, long v, HitTestResult hitTestResult0, boolean z, boolean z1) {
        this.w = nodeCoordinator0;
        this.x = modifier$Node0;
        this.y = nodeCoordinator$HitTestSource0;
        this.z = v;
        this.A = hitTestResult0;
        this.B = z;
        this.C = z1;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int v = this.y.entityType-OLwlOKw();
        Node modifier$Node0 = NodeCoordinatorKt.access$nextUntil-hw7D004(this.x, v, 2);
        NodeCoordinator.access$hit-1hIXUjU(this.w, modifier$Node0, this.y, this.z, this.A, this.B, this.C);
        return Unit.INSTANCE;
    }
}

