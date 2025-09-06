package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\n\u0010\u0000\u001A\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"copy", "Landroidx/compose/ui/graphics/Path;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nandroidx/compose/ui/graphics/PathKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,442:1\n1#2:443\n*E\n"})
public final class PathKt {
    @NotNull
    public static final Path copy(@NotNull Path path0) {
        Path path1 = AndroidPath_androidKt.Path();
        Path.addPath-Uv8p0NA$default(path1, path0, 0L, 2, null);
        return path1;
    }
}

