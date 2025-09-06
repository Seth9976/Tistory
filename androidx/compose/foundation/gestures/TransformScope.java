package androidx.compose.foundation.gestures;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\u000BÀ\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/TransformScope;", "", "transformBy", "", "zoomChange", "", "panChange", "Landroidx/compose/ui/geometry/Offset;", "rotationChange", "transformBy-d-4ec7I", "(FJF)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface TransformScope {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void transformBy-d-4ec7I$default(TransformScope transformScope0, float f, long v, float f1, int v1, Object object0) {
            TransformScope.transformBy-d-4ec7I$default(transformScope0, f, v, f1, v1, object0);
        }
    }

    void transformBy-d-4ec7I(float arg1, long arg2, float arg3);

    static void transformBy-d-4ec7I$default(TransformScope transformScope0, float f, long v, float f1, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transformBy-d-4ec7I");
        }
        if((v1 & 1) != 0) {
            f = 1.0f;
        }
        if((v1 & 2) != 0) {
            v = 0L;
        }
        if((v1 & 4) != 0) {
            f1 = 0.0f;
        }
        transformScope0.transformBy-d-4ec7I(f, v, f1);
    }
}

