package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.OffsetKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001A\u00020\u000B2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\r\u0010\u000EJ!\u0010\u0012\u001A\u00020\u00112\b\u0010\u000F\u001A\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001D\u0010\u0018\u001A\u00020\u00152\u0006\u0010\u0014\u001A\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001D\u0010\u001A\u001A\u00020\u00152\u0006\u0010\u0014\u001A\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001D\u001A\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u001C\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006\u001E"}, d2 = {"Landroidx/compose/ui/graphics/AndroidPathMeasure;", "Landroidx/compose/ui/graphics/PathMeasure;", "Landroid/graphics/PathMeasure;", "internalPathMeasure", "<init>", "(Landroid/graphics/PathMeasure;)V", "", "startDistance", "stopDistance", "Landroidx/compose/ui/graphics/Path;", "destination", "", "startWithMoveTo", "getSegment", "(FFLandroidx/compose/ui/graphics/Path;Z)Z", "path", "forceClosed", "", "setPath", "(Landroidx/compose/ui/graphics/Path;Z)V", "distance", "Landroidx/compose/ui/geometry/Offset;", "getPosition-tuRUvjQ", "(F)J", "getPosition", "getTangent-tuRUvjQ", "getTangent", "getLength", "()F", "length", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidPathMeasure.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPathMeasure.android.kt\nandroidx/compose/ui/graphics/AndroidPathMeasure\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,86:1\n38#2,5:87\n38#2,5:92\n*S KotlinDebug\n*F\n+ 1 AndroidPathMeasure.android.kt\nandroidx/compose/ui/graphics/AndroidPathMeasure\n*L\n43#1:87,5\n49#1:92,5\n*E\n"})
public final class AndroidPathMeasure implements PathMeasure {
    public final android.graphics.PathMeasure a;
    public float[] b;
    public float[] c;

    public AndroidPathMeasure(@NotNull android.graphics.PathMeasure pathMeasure0) {
        this.a = pathMeasure0;
    }

    @Override  // androidx.compose.ui.graphics.PathMeasure
    public float getLength() {
        return this.a.getLength();
    }

    @Override  // androidx.compose.ui.graphics.PathMeasure
    public long getPosition-tuRUvjQ(float f) {
        if(this.b == null) {
            this.b = new float[2];
        }
        if(this.c == null) {
            this.c = new float[2];
        }
        if(this.a.getPosTan(f, this.b, this.c)) {
            float[] arr_f = this.b;
            Intrinsics.checkNotNull(arr_f);
            float f1 = arr_f[0];
            float[] arr_f1 = this.b;
            Intrinsics.checkNotNull(arr_f1);
            return OffsetKt.Offset(f1, arr_f1[1]);
        }
        return 0x7FC000007FC00000L;
    }

    @Override  // androidx.compose.ui.graphics.PathMeasure
    public boolean getSegment(float f, float f1, @NotNull Path path0, boolean z) {
        if(!(path0 instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path path1 = ((AndroidPath)path0).getInternalPath();
        return this.a.getSegment(f, f1, path1, z);
    }

    @Override  // androidx.compose.ui.graphics.PathMeasure
    public long getTangent-tuRUvjQ(float f) {
        if(this.b == null) {
            this.b = new float[2];
        }
        if(this.c == null) {
            this.c = new float[2];
        }
        if(this.a.getPosTan(f, this.b, this.c)) {
            float[] arr_f = this.c;
            Intrinsics.checkNotNull(arr_f);
            float f1 = arr_f[0];
            float[] arr_f1 = this.c;
            Intrinsics.checkNotNull(arr_f1);
            return OffsetKt.Offset(f1, arr_f1[1]);
        }
        return 0x7FC000007FC00000L;
    }

    @Override  // androidx.compose.ui.graphics.PathMeasure
    public void setPath(@Nullable Path path0, boolean z) {
        android.graphics.Path path1;
        if(path0 == null) {
            path1 = null;
        }
        else {
            if(!(path0 instanceof AndroidPath)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            path1 = ((AndroidPath)path0).getInternalPath();
        }
        this.a.setPath(path1, z);
    }
}

