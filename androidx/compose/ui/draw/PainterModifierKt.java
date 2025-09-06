package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u001AF\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\r¨\u0006\u000E"}, d2 = {"paint", "Landroidx/compose/ui/Modifier;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "sizeToIntrinsics", "", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class PainterModifierKt {
    @NotNull
    public static final Modifier paint(@NotNull Modifier modifier0, @NotNull Painter painter0, boolean z, @NotNull Alignment alignment0, @NotNull ContentScale contentScale0, float f, @Nullable ColorFilter colorFilter0) {
        return modifier0.then(new PainterElement(painter0, z, alignment0, contentScale0, f, colorFilter0));
    }

    public static Modifier paint$default(Modifier modifier0, Painter painter0, boolean z, Alignment alignment0, ContentScale contentScale0, float f, ColorFilter colorFilter0, int v, Object object0) {
        if((v & 2) != 0) {
            z = true;
        }
        if((v & 4) != 0) {
            alignment0 = Alignment.Companion.getCenter();
        }
        if((v & 8) != 0) {
            contentScale0 = ContentScale.Companion.getInside();
        }
        if((v & 16) != 0) {
            f = 1.0f;
        }
        if((v & 0x20) != 0) {
            colorFilter0 = null;
        }
        return PainterModifierKt.paint(modifier0, painter0, z, alignment0, contentScale0, f, colorFilter0);
    }
}

