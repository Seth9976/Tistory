package androidx.compose.ui;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u001B\n\u0002\u0018\u0002\n\u0002\b\u000B\bÇ\u0002\u0018\u00002\u00020\u0001R \u0010\t\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006R \u0010\r\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u0012\u0004\b\f\u0010\b\u001A\u0004\b\u000B\u0010\u0006R \u0010\u0011\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000E\u0010\u0004\u0012\u0004\b\u0010\u0010\b\u001A\u0004\b\u000F\u0010\u0006R \u0010\u0015\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u0012\u0004\b\u0014\u0010\b\u001A\u0004\b\u0013\u0010\u0006R \u0010\u0019\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u0012\u0004\b\u0018\u0010\b\u001A\u0004\b\u0017\u0010\u0006R \u0010\u001D\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001A\u0010\u0004\u0012\u0004\b\u001C\u0010\b\u001A\u0004\b\u001B\u0010\u0006R \u0010$\u001A\u00020\u001E8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001F\u0010 \u0012\u0004\b#\u0010\b\u001A\u0004\b!\u0010\"R \u0010(\u001A\u00020\u001E8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010 \u0012\u0004\b\'\u0010\b\u001A\u0004\b&\u0010\"¨\u0006)"}, d2 = {"Landroidx/compose/ui/AbsoluteAlignment;", "", "Landroidx/compose/ui/Alignment;", "a", "Landroidx/compose/ui/Alignment;", "getTopLeft", "()Landroidx/compose/ui/Alignment;", "getTopLeft$annotations", "()V", "TopLeft", "b", "getTopRight", "getTopRight$annotations", "TopRight", "c", "getCenterLeft", "getCenterLeft$annotations", "CenterLeft", "d", "getCenterRight", "getCenterRight$annotations", "CenterRight", "e", "getBottomLeft", "getBottomLeft$annotations", "BottomLeft", "f", "getBottomRight", "getBottomRight$annotations", "BottomRight", "Landroidx/compose/ui/Alignment$Horizontal;", "g", "Landroidx/compose/ui/Alignment$Horizontal;", "getLeft", "()Landroidx/compose/ui/Alignment$Horizontal;", "getLeft$annotations", "Left", "h", "getRight", "getRight$annotations", "Right", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AbsoluteAlignment {
    public static final int $stable;
    @NotNull
    public static final AbsoluteAlignment INSTANCE;
    public static final BiasAbsoluteAlignment a;
    public static final BiasAbsoluteAlignment b;
    public static final BiasAbsoluteAlignment c;
    public static final BiasAbsoluteAlignment d;
    public static final BiasAbsoluteAlignment e;
    public static final BiasAbsoluteAlignment f;
    public static final Horizontal g;
    public static final Horizontal h;

    static {
        AbsoluteAlignment.INSTANCE = new AbsoluteAlignment();  // 初始化器: Ljava/lang/Object;-><init>()V
        AbsoluteAlignment.a = new BiasAbsoluteAlignment(-1.0f, -1.0f);
        AbsoluteAlignment.b = new BiasAbsoluteAlignment(1.0f, -1.0f);
        AbsoluteAlignment.c = new BiasAbsoluteAlignment(-1.0f, 0.0f);
        AbsoluteAlignment.d = new BiasAbsoluteAlignment(1.0f, 0.0f);
        AbsoluteAlignment.e = new BiasAbsoluteAlignment(-1.0f, 1.0f);
        AbsoluteAlignment.f = new BiasAbsoluteAlignment(1.0f, 1.0f);
        AbsoluteAlignment.g = new Horizontal(-1.0f);
        AbsoluteAlignment.h = new Horizontal(1.0f);
    }

    @NotNull
    public final Alignment getBottomLeft() {
        return AbsoluteAlignment.e;
    }

    @Stable
    public static void getBottomLeft$annotations() {
    }

    @NotNull
    public final Alignment getBottomRight() {
        return AbsoluteAlignment.f;
    }

    @Stable
    public static void getBottomRight$annotations() {
    }

    @NotNull
    public final Alignment getCenterLeft() {
        return AbsoluteAlignment.c;
    }

    @Stable
    public static void getCenterLeft$annotations() {
    }

    @NotNull
    public final Alignment getCenterRight() {
        return AbsoluteAlignment.d;
    }

    @Stable
    public static void getCenterRight$annotations() {
    }

    @NotNull
    public final androidx.compose.ui.Alignment.Horizontal getLeft() {
        return AbsoluteAlignment.g;
    }

    @Stable
    public static void getLeft$annotations() {
    }

    @NotNull
    public final androidx.compose.ui.Alignment.Horizontal getRight() {
        return AbsoluteAlignment.h;
    }

    @Stable
    public static void getRight$annotations() {
    }

    @NotNull
    public final Alignment getTopLeft() {
        return AbsoluteAlignment.a;
    }

    @Stable
    public static void getTopLeft$annotations() {
    }

    @NotNull
    public final Alignment getTopRight() {
        return AbsoluteAlignment.b;
    }

    @Stable
    public static void getTopRight$annotations() {
    }
}

