package com.kakao.tistory.presentation.screen.blog.main.ui;

import android.graphics.Shader;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.ShaderKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u001E\u0010\b\u001A\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001A\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\t"}, d2 = {"com/kakao/tistory/presentation/screen/blog/main/ui/BlogMainInfoKt$creatorBackgroundBrush$1", "Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/geometry/Size;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "createShader", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BlogMainInfoKt.creatorBackgroundBrush.1 extends ShaderBrush {
    public final long a;
    public final long b;

    public BlogMainInfoKt.creatorBackgroundBrush.1(long v, long v1) {
        this.a = v;
        this.b = v1;
        super();
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.graphics.ShaderBrush
    @NotNull
    public Shader createShader-uvyYCjk(long v) {
        double f = 0.939693 * ((double)Size.getHeight-impl(v));
        List list0 = CollectionsKt__CollectionsKt.listOf(new Color[]{Color.box-impl(this.a), Color.box-impl(this.b)});
        return ShaderKt.LinearGradientShader-VjE6UOU$default(OffsetKt.Offset(Size.getWidth-impl(v), 0.0f), OffsetKt.Offset(Size.getWidth-impl(v) - ((float)(0.34202 * f)), ((float)(0.939693 * f))), list0, null, 0, 8, null);
    }
}

