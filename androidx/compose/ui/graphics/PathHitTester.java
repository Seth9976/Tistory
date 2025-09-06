package androidx.compose.ui.graphics;

import androidx.annotation.FloatRange;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001F\u0010\t\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00042\b\b\u0003\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001B\u0010\u0010\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u000BH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000F\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/graphics/PathHitTester;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Path;", "path", "", "tolerance", "", "updatePath", "(Landroidx/compose/ui/graphics/Path;F)V", "Landroidx/compose/ui/geometry/Offset;", "position", "", "contains-k-4lQ0M", "(J)Z", "contains", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPathHitTester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathHitTester.kt\nandroidx/compose/ui/graphics/PathHitTester\n+ 2 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 3 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 IntervalTree.kt\nandroidx/compose/ui/graphics/IntervalTree\n*L\n1#1,171:1\n67#2:172\n81#2:174\n22#3:173\n70#4:175\n73#4:176\n166#5,21:177\n*S KotlinDebug\n*F\n+ 1 PathHitTester.kt\nandroidx/compose/ui/graphics/PathHitTester\n*L\n108#1:172\n108#1:174\n108#1:173\n130#1:175\n133#1:176\n139#1:177,21\n*E\n"})
public final class PathHitTester {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Type.values().length];
            try {
                arr_v[Type.Line.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.Quadratic.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.Cubic.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.Done.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public Path a;
    public Rect b;
    public final IntervalTree c;
    public final float[] d;
    public final float[] e;

    public PathHitTester() {
        this.a = PathHitTesterKt.access$getEmptyPath$p();
        this.b = Rect.Companion.getZero();
        this.c = new IntervalTree();
        this.d = new float[20];
        this.e = new float[2];
    }

    public final boolean contains-k-4lQ0M(long v) {
        int v3;
        int v1;
        if(!this.a.isEmpty() && this.b.contains-k-4lQ0M(v)) {
            float f = Offset.getX-impl(v);
            float f1 = Offset.getY-impl(v);
            IntervalTree intervalTree0 = this.c;
            if(intervalTree0.b == intervalTree0.a) {
                v1 = 0;
            }
            else {
                ArrayList arrayList0 = intervalTree0.c;
                arrayList0.add(intervalTree0.b);
                v1 = 0;
                while(arrayList0.size() > 0) {
                    Node intervalTree$Node0 = (Node)o.removeLast(arrayList0);
                    if(intervalTree$Node0.overlaps(f1, f1)) {
                        Object object0 = intervalTree$Node0.getData();
                        Intrinsics.checkNotNull(object0);
                        float[] arr_f = ((PathSegment)object0).getPoints();
                        int v2 = WhenMappings.$EnumSwitchMapping$0[((PathSegment)object0).getType().ordinal()];
                        if(v2 == 1) {
                            v3 = BezierKt.lineWinding(arr_f, f, f1);
                        }
                        else {
                            float[] arr_f1 = this.d;
                            float[] arr_f2 = this.e;
                            switch(v2) {
                                case 2: {
                                    v3 = BezierKt.quadraticWinding(arr_f, f, f1, arr_f1, arr_f2);
                                    break;
                                }
                                case 3: {
                                    v3 = BezierKt.cubicWinding(arr_f, f, f1, arr_f1, arr_f2);
                                    break;
                                }
                                default: {
                                    goto label_26;
                                }
                            }
                        }
                        v1 += v3;
                    }
                label_26:
                    if(intervalTree$Node0.getLeft() != intervalTree0.a && intervalTree$Node0.getLeft().getMax() >= f1) {
                        arrayList0.add(intervalTree$Node0.getLeft());
                    }
                    if(intervalTree$Node0.getRight() != intervalTree0.a && intervalTree$Node0.getRight().getMin() <= f1) {
                        arrayList0.add(intervalTree$Node0.getRight());
                    }
                }
                arrayList0.clear();
            }
            if(PathFillType.equals-impl0(this.a.getFillType-Rg-k1Os(), 1)) {
                v1 &= 1;
            }
            return v1 != 0;
        }
        return false;
    }

    public final void updatePath(@NotNull Path path0, @FloatRange(from = 0.0) float f) {
        this.a = path0;
        this.b = path0.getBounds();
        IntervalTree intervalTree0 = this.c;
        intervalTree0.clear();
        PathIterator pathIterator0 = path0.iterator(ConicEvaluation.AsQuadratics, f);
    label_5:
        while(pathIterator0.hasNext()) {
            PathSegment pathSegment0 = pathIterator0.next();
            switch(WhenMappings.$EnumSwitchMapping$0[pathSegment0.getType().ordinal()]) {
                case 1: 
                case 2: 
                case 3: {
                    long v = BezierKt.computeVerticalBounds$default(pathSegment0, this.d, 0, 4, null);
                    intervalTree0.addInterval(Float.intBitsToFloat(((int)(v >> 0x20))), Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))), pathSegment0);
                    continue;
                }
                case 4: {
                    break label_5;
                }
            }
        }
    }

    public static void updatePath$default(PathHitTester pathHitTester0, Path path0, float f, int v, Object object0) {
        if((v & 2) != 0) {
            f = 0.5f;
        }
        pathHitTester0.updatePath(path0, f);
    }
}

