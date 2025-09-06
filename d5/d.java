package d5;

import android.animation.TypeEvaluator;
import androidx.core.graphics.PathParser.PathDataNode;
import androidx.core.graphics.PathParser;

public final class d implements TypeEvaluator {
    public PathDataNode[] a;

    @Override  // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object object0, Object object1) {
        if(!PathParser.canMorph(((PathDataNode[])object0), ((PathDataNode[])object1))) {
            throw new IllegalArgumentException("Can\'t interpolate between two incompatible pathData");
        }
        if(!PathParser.canMorph(this.a, ((PathDataNode[])object0))) {
            this.a = PathParser.deepCopyNodes(((PathDataNode[])object0));
        }
        for(int v = 0; v < ((PathDataNode[])object0).length; ++v) {
            this.a[v].interpolatePathDataNode(((PathDataNode[])object0)[v], ((PathDataNode[])object1)[v], f);
        }
        return this.a;
    }
}

