package com.google.accompanist.drawablepainter;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001A\u00020\u0003*\u00020\u0002H\u0014¢\u0006\u0004\b\u0004\u0010\u0005R\u001D\u0010\t\u001A\u00020\u00068VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001A\u0004\b\u0007\u0010\b\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Lcom/google/accompanist/drawablepainter/EmptyPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "onDraw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "drawablepainter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EmptyPainter extends Painter {
    @NotNull
    public static final EmptyPainter INSTANCE;

    static {
        EmptyPainter.INSTANCE = new EmptyPainter();  // 初始化器: Landroidx/compose/ui/graphics/painter/Painter;-><init>()V
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.graphics.painter.Painter
    public long getIntrinsicSize-NH-jbRc() {
        return 0x7FC000007FC00000L;
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(@NotNull DrawScope drawScope0) {
        Intrinsics.checkNotNullParameter(drawScope0, "<this>");
    }
}

