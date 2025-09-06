package androidx.compose.foundation.contextmenu;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@VisibleForTesting
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u00C1\u0002\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0005\u0010\u0006R\u001D\u0010\r\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u001D\u0010\u0010\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u000E\u0010\n\u001A\u0004\b\u000F\u0010\fR\u001D\u0010\u0013\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u0011\u0010\n\u001A\u0004\b\u0012\u0010\fR\u001D\u0010\u0016\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u0014\u0010\n\u001A\u0004\b\u0015\u0010\fR\u001D\u0010\u0019\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u0017\u0010\n\u001A\u0004\b\u0018\u0010\fR\u0017\u0010\u001F\u001A\u00020\u001A8\u0006\u00A2\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001ER\u001D\u0010%\u001A\u00020 8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$R\u001D\u0010(\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b&\u0010\n\u001A\u0004\b\'\u0010\fR\u001D\u0010+\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b)\u0010\n\u001A\u0004\b*\u0010\fR\u001D\u0010.\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b,\u0010\n\u001A\u0004\b-\u0010\fR\u001D\u00104\u001A\u00020/8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u00103R\u0017\u0010:\u001A\u0002058\u0006\u00A2\u0006\f\n\u0004\b6\u00107\u001A\u0004\b8\u00109R\u001D\u0010=\u001A\u00020/8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b;\u00101\u001A\u0004\b<\u00103R\u001D\u0010@\u001A\u00020/8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b>\u00101\u001A\u0004\b?\u00103\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006A"}, d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuSpec;", "", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/text/TextStyle;", "textStyle-8_81llA", "(J)Landroidx/compose/ui/text/TextStyle;", "textStyle", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getContainerWidthMin-D9Ej5fM", "()F", "ContainerWidthMin", "b", "getContainerWidthMax-D9Ej5fM", "ContainerWidthMax", "c", "getListItemHeight-D9Ej5fM", "ListItemHeight", "d", "getMenuContainerElevation-D9Ej5fM", "MenuContainerElevation", "e", "getCornerRadius-D9Ej5fM", "CornerRadius", "Landroidx/compose/ui/Alignment$Vertical;", "f", "Landroidx/compose/ui/Alignment$Vertical;", "getLabelVerticalTextAlignment", "()Landroidx/compose/ui/Alignment$Vertical;", "LabelVerticalTextAlignment", "Landroidx/compose/ui/text/style/TextAlign;", "g", "I", "getLabelHorizontalTextAlignment-e0LSkKk", "()I", "LabelHorizontalTextAlignment", "h", "getHorizontalPadding-D9Ej5fM", "HorizontalPadding", "i", "getVerticalPadding-D9Ej5fM", "VerticalPadding", "j", "getIconSize-D9Ej5fM", "IconSize", "Landroidx/compose/ui/unit/TextUnit;", "k", "J", "getFontSize-XSAIIZE", "()J", "FontSize", "Landroidx/compose/ui/text/font/FontWeight;", "l", "Landroidx/compose/ui/text/font/FontWeight;", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "FontWeight", "m", "getLineHeight-XSAIIZE", "LineHeight", "n", "getLetterSpacing-XSAIIZE", "LetterSpacing", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nContextMenuUi.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuSpec\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,415:1\n148#2:416\n148#2:417\n148#2:418\n148#2:419\n148#2:420\n148#2:421\n148#2:422\n148#2:423\n*S KotlinDebug\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuSpec\n*L\n70#1:416\n71#1:417\n72#1:418\n73#1:419\n74#1:420\n77#1:421\n78#1:422\n79#1:423\n*E\n"})
public final class ContextMenuSpec {
    public static final int $stable;
    @NotNull
    public static final ContextMenuSpec INSTANCE;
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final Vertical f;
    public static final int g;
    public static final float h;
    public static final float i;
    public static final float j;
    public static final long k;
    public static final FontWeight l;
    public static final long m;
    public static final long n;

    static {
        ContextMenuSpec.INSTANCE = new ContextMenuSpec();  // 初始化器: Ljava/lang/Object;-><init>()V
        ContextMenuSpec.a = 112.0f;
        ContextMenuSpec.b = 280.0f;
        ContextMenuSpec.c = 48.0f;
        ContextMenuSpec.d = 3.0f;
        ContextMenuSpec.e = 4.0f;
        ContextMenuSpec.f = Alignment.Companion.getCenterVertically();
        ContextMenuSpec.g = 5;
        ContextMenuSpec.h = 12.0f;
        ContextMenuSpec.i = 8.0f;
        ContextMenuSpec.j = 24.0f;
        ContextMenuSpec.k = 0x141600000L;
        ContextMenuSpec.l = FontWeight.Companion.getMedium();
        ContextMenuSpec.m = 0x141A00000L;
        ContextMenuSpec.n = TextUnitKt.getSp(0.1f);
    }

    public final float getContainerWidthMax-D9Ej5fM() [...] // 潜在的解密器

    public final float getContainerWidthMin-D9Ej5fM() [...] // 潜在的解密器

    public final float getCornerRadius-D9Ej5fM() [...] // 潜在的解密器

    public final long getFontSize-XSAIIZE() {
        return ContextMenuSpec.k;
    }

    @NotNull
    public final FontWeight getFontWeight() {
        return ContextMenuSpec.l;
    }

    public final float getHorizontalPadding-D9Ej5fM() [...] // 潜在的解密器

    public final float getIconSize-D9Ej5fM() [...] // 潜在的解密器

    public final int getLabelHorizontalTextAlignment-e0LSkKk() {
        return ContextMenuSpec.g;
    }

    @NotNull
    public final Vertical getLabelVerticalTextAlignment() {
        return ContextMenuSpec.f;
    }

    public final long getLetterSpacing-XSAIIZE() {
        return ContextMenuSpec.n;
    }

    public final long getLineHeight-XSAIIZE() {
        return ContextMenuSpec.m;
    }

    public final float getListItemHeight-D9Ej5fM() [...] // 潜在的解密器

    public final float getMenuContainerElevation-D9Ej5fM() [...] // 潜在的解密器

    public final float getVerticalPadding-D9Ej5fM() [...] // 潜在的解密器

    @NotNull
    public final TextStyle textStyle-8_81llA(long v) {
        return new TextStyle(v, ContextMenuSpec.k, ContextMenuSpec.l, null, null, null, null, ContextMenuSpec.n, null, null, null, 0L, null, null, null, ContextMenuSpec.g, 0, ContextMenuSpec.m, null, null, null, 0, 0, null, 0xFD7F78, null);
    }
}

