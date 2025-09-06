package androidx.compose.ui.graphics;

import android.graphics.Shader;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A\u0012\u0010\u0000\u001A\u00020\u00012\n\u0010\u0002\u001A\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"ShaderBrush", "Landroidx/compose/ui/graphics/ShaderBrush;", "shader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class BrushKt {
    @NotNull
    public static final ShaderBrush ShaderBrush(@NotNull Shader shader0) {
        return new ShaderBrush() {
            @Override  // androidx.compose.ui.graphics.ShaderBrush
            @NotNull
            public Shader createShader-uvyYCjk(long v) {
                return shader0;
            }
        };
    }
}

