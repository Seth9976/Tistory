package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Path.Op;
import android.graphics.Path;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"ClassVerificationFailure"})
@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001C\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\u001A\u0015\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0001H\u0086\f\u001A\u001C\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00012\b\b\u0002\u0010\u0006\u001A\u00020\u0007H\u0007\u001A\u0015\u0010\b\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0001H\u0086\n\u001A\u0015\u0010\t\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0001H\u0086\f\u001A\u0015\u0010\n\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0001H\u0086\n\u001A\u0015\u0010\u000B\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0001H\u0086\f¨\u0006\f"}, d2 = {"and", "Landroid/graphics/Path;", "p", "flatten", "", "Landroidx/core/graphics/PathSegment;", "error", "", "minus", "or", "plus", "xor", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nandroidx/core/graphics/PathKt\n*L\n1#1,80:1\n43#1,3:81\n*S KotlinDebug\n*F\n+ 1 Path.kt\nandroidx/core/graphics/PathKt\n*L\n60#1:81,3\n*E\n"})
public final class PathKt {
    @NotNull
    public static final Path and(@NotNull Path path0, @NotNull Path path1) {
        Path path2 = new Path();
        path2.op(path0, path1, Path.Op.INTERSECT);
        return path2;
    }

    @RequiresApi(26)
    @NotNull
    public static final Iterable flatten(@NotNull Path path0, float f) {
        return PathUtils.flatten(path0, f);
    }

    public static Iterable flatten$default(Path path0, float f, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.5f;
        }
        return PathKt.flatten(path0, f);
    }

    @NotNull
    public static final Path minus(@NotNull Path path0, @NotNull Path path1) {
        Path path2 = new Path(path0);
        path2.op(path1, Path.Op.DIFFERENCE);
        return path2;
    }

    @NotNull
    public static final Path or(@NotNull Path path0, @NotNull Path path1) {
        Path path2 = new Path(path0);
        path2.op(path1, Path.Op.UNION);
        return path2;
    }

    @NotNull
    public static final Path plus(@NotNull Path path0, @NotNull Path path1) {
        Path path2 = new Path(path0);
        path2.op(path1, Path.Op.UNION);
        return path2;
    }

    @NotNull
    public static final Path xor(@NotNull Path path0, @NotNull Path path1) {
        Path path2 = new Path(path0);
        path2.op(path1, Path.Op.XOR);
        return path2;
    }
}

