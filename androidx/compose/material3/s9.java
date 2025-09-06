package androidx.compose.material3;

import androidx.compose.ui.node.NodeCoordinator;
import com.kakao.kandinsky.crop.contract.FlipType;
import com.kakao.kandinsky.crop.contract.RotateType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class s9 extends Lambda implements Function0 {
    public final int w;
    public final Function1 x;

    public s9(Function1 function10, int v) {
        this.w = v;
        this.x = function10;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                this.x.invoke(Boolean.FALSE);
                return Unit.INSTANCE;
            }
            case 1: {
                this.x.invoke(Boolean.FALSE);
                return Unit.INSTANCE;
            }
            case 2: {
                this.x.invoke(NodeCoordinator.access$getGraphicsLayerScope$cp());
                NodeCoordinator.access$getGraphicsLayerScope$cp().updateOutline$ui_release();
                return Unit.INSTANCE;
            }
            case 3: {
                this.x.invoke(RotateType.Right);
                return Unit.INSTANCE;
            }
            case 4: {
                this.x.invoke(FlipType.Horizontal);
                return Unit.INSTANCE;
            }
            default: {
                this.x.invoke(FlipType.Vertical);
                return Unit.INSTANCE;
            }
        }
    }
}

