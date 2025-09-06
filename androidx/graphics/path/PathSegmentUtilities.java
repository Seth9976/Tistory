package androidx.graphics.path;

import android.graphics.PointF;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\t\"\u0017\u0010\u0005\u001A\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001A\u0004\b\u0003\u0010\u0004\"\u0017\u0010\b\u001A\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001A\u0004\b\u0007\u0010\u0004¨\u0006\t"}, d2 = {"Landroidx/graphics/path/PathSegment;", "a", "Landroidx/graphics/path/PathSegment;", "getDoneSegment", "()Landroidx/graphics/path/PathSegment;", "DoneSegment", "b", "getCloseSegment", "CloseSegment", "graphics-path_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "PathSegmentUtilities")
@SourceDebugExtension({"SMAP\nPathSegment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathSegment.kt\nandroidx/graphics/path/PathSegmentUtilities\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,138:1\n26#2:139\n26#2:140\n*S KotlinDebug\n*F\n+ 1 PathSegment.kt\nandroidx/graphics/path/PathSegmentUtilities\n*L\n130#1:139\n137#1:140\n*E\n"})
public final class PathSegmentUtilities {
    public static final PathSegment a;
    public static final PathSegment b;

    static {
        PathSegmentUtilities.a = new PathSegment(Type.Done, new PointF[0], 0.0f);
        PathSegmentUtilities.b = new PathSegment(Type.Close, new PointF[0], 0.0f);
    }

    @NotNull
    public static final PathSegment getCloseSegment() {
        return PathSegmentUtilities.b;
    }

    @NotNull
    public static final PathSegment getDoneSegment() {
        return PathSegmentUtilities.a;
    }
}

