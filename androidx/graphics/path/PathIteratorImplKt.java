package androidx.graphics.path;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"graphics-path_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class PathIteratorImplKt {
    public static final Type[] a;

    static {
        PathIteratorImplKt.a = Type.values();
    }

    public static final Type access$platformToAndroidXSegmentType(int v) {
        switch(v) {
            case 0: {
                return Type.Move;
            }
            case 1: {
                return Type.Line;
            }
            case 2: {
                return Type.Quadratic;
            }
            case 3: {
                return Type.Conic;
            }
            case 4: {
                return Type.Cubic;
            }
            case 5: {
                return Type.Close;
            }
            case 6: {
                return Type.Done;
            }
            default: {
                throw new IllegalArgumentException("Unknown path segment type " + v);
            }
        }
    }
}

