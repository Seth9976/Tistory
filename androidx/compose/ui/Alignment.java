package androidx.compose.ui;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bç\u0080\u0001\u0018\u0000 \u000B2\u00020\u0001:\u0003\u000B\f\rJ*\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\u000EÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/Alignment;", "", "align", "Landroidx/compose/ui/unit/IntOffset;", "size", "Landroidx/compose/ui/unit/IntSize;", "space", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "align-KFBX0sM", "(JJLandroidx/compose/ui/unit/LayoutDirection;)J", "Companion", "Horizontal", "Vertical", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface Alignment {
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\'\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u000F\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\t\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006R \u0010\r\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b\n\u0010\u0004\u0012\u0004\b\f\u0010\b\u001A\u0004\b\u000B\u0010\u0006R \u0010\u0011\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b\u000E\u0010\u0004\u0012\u0004\b\u0010\u0010\b\u001A\u0004\b\u000F\u0010\u0006R \u0010\u0015\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u0012\u0004\b\u0014\u0010\b\u001A\u0004\b\u0013\u0010\u0006R \u0010\u0019\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u0012\u0004\b\u0018\u0010\b\u001A\u0004\b\u0017\u0010\u0006R \u0010\u001D\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b\u001A\u0010\u0004\u0012\u0004\b\u001C\u0010\b\u001A\u0004\b\u001B\u0010\u0006R \u0010!\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b\u001E\u0010\u0004\u0012\u0004\b \u0010\b\u001A\u0004\b\u001F\u0010\u0006R \u0010%\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b\"\u0010\u0004\u0012\u0004\b$\u0010\b\u001A\u0004\b#\u0010\u0006R \u0010)\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b&\u0010\u0004\u0012\u0004\b(\u0010\b\u001A\u0004\b\'\u0010\u0006R \u00100\u001A\u00020*8\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u0010\b\u001A\u0004\b-\u0010.R \u00104\u001A\u00020*8\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b1\u0010,\u0012\u0004\b3\u0010\b\u001A\u0004\b2\u0010.R \u00108\u001A\u00020*8\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b5\u0010,\u0012\u0004\b7\u0010\b\u001A\u0004\b6\u0010.R \u0010?\u001A\u0002098\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b>\u0010\b\u001A\u0004\b<\u0010=R \u0010C\u001A\u0002098\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b@\u0010;\u0012\u0004\bB\u0010\b\u001A\u0004\bA\u0010=R \u0010G\u001A\u0002098\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\bD\u0010;\u0012\u0004\bF\u0010\b\u001A\u0004\bE\u0010=\u00A8\u0006H"}, d2 = {"Landroidx/compose/ui/Alignment$Companion;", "", "Landroidx/compose/ui/Alignment;", "b", "Landroidx/compose/ui/Alignment;", "getTopStart", "()Landroidx/compose/ui/Alignment;", "getTopStart$annotations", "()V", "TopStart", "c", "getTopCenter", "getTopCenter$annotations", "TopCenter", "d", "getTopEnd", "getTopEnd$annotations", "TopEnd", "e", "getCenterStart", "getCenterStart$annotations", "CenterStart", "f", "getCenter", "getCenter$annotations", "Center", "g", "getCenterEnd", "getCenterEnd$annotations", "CenterEnd", "h", "getBottomStart", "getBottomStart$annotations", "BottomStart", "i", "getBottomCenter", "getBottomCenter$annotations", "BottomCenter", "j", "getBottomEnd", "getBottomEnd$annotations", "BottomEnd", "Landroidx/compose/ui/Alignment$Vertical;", "k", "Landroidx/compose/ui/Alignment$Vertical;", "getTop", "()Landroidx/compose/ui/Alignment$Vertical;", "getTop$annotations", "Top", "l", "getCenterVertically", "getCenterVertically$annotations", "CenterVertically", "m", "getBottom", "getBottom$annotations", "Bottom", "Landroidx/compose/ui/Alignment$Horizontal;", "n", "Landroidx/compose/ui/Alignment$Horizontal;", "getStart", "()Landroidx/compose/ui/Alignment$Horizontal;", "getStart$annotations", "Start", "o", "getCenterHorizontally", "getCenterHorizontally$annotations", "CenterHorizontally", "p", "getEnd", "getEnd$annotations", "End", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public static final Companion a;
        public static final BiasAlignment b;
        public static final BiasAlignment c;
        public static final BiasAlignment d;
        public static final BiasAlignment e;
        public static final BiasAlignment f;
        public static final BiasAlignment g;
        public static final BiasAlignment h;
        public static final BiasAlignment i;
        public static final BiasAlignment j;
        public static final Vertical k;
        public static final Vertical l;
        public static final Vertical m;
        public static final Horizontal n;
        public static final Horizontal o;
        public static final Horizontal p;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
            Companion.b = new BiasAlignment(-1.0f, -1.0f);
            Companion.c = new BiasAlignment(0.0f, -1.0f);
            Companion.d = new BiasAlignment(1.0f, -1.0f);
            Companion.e = new BiasAlignment(-1.0f, 0.0f);
            Companion.f = new BiasAlignment(0.0f, 0.0f);
            Companion.g = new BiasAlignment(1.0f, 0.0f);
            Companion.h = new BiasAlignment(-1.0f, 1.0f);
            Companion.i = new BiasAlignment(0.0f, 1.0f);
            Companion.j = new BiasAlignment(1.0f, 1.0f);
            Companion.k = new Vertical(-1.0f);
            Companion.l = new Vertical(0.0f);
            Companion.m = new Vertical(1.0f);
            Companion.n = new Horizontal(-1.0f);
            Companion.o = new Horizontal(0.0f);
            Companion.p = new Horizontal(1.0f);
        }

        @NotNull
        public final androidx.compose.ui.Alignment.Vertical getBottom() {
            return Companion.m;
        }

        @Stable
        public static void getBottom$annotations() {
        }

        @NotNull
        public final Alignment getBottomCenter() {
            return Companion.i;
        }

        @Stable
        public static void getBottomCenter$annotations() {
        }

        @NotNull
        public final Alignment getBottomEnd() {
            return Companion.j;
        }

        @Stable
        public static void getBottomEnd$annotations() {
        }

        @NotNull
        public final Alignment getBottomStart() {
            return Companion.h;
        }

        @Stable
        public static void getBottomStart$annotations() {
        }

        @NotNull
        public final Alignment getCenter() {
            return Companion.f;
        }

        @Stable
        public static void getCenter$annotations() {
        }

        @NotNull
        public final Alignment getCenterEnd() {
            return Companion.g;
        }

        @Stable
        public static void getCenterEnd$annotations() {
        }

        @NotNull
        public final androidx.compose.ui.Alignment.Horizontal getCenterHorizontally() {
            return Companion.o;
        }

        @Stable
        public static void getCenterHorizontally$annotations() {
        }

        @NotNull
        public final Alignment getCenterStart() {
            return Companion.e;
        }

        @Stable
        public static void getCenterStart$annotations() {
        }

        @NotNull
        public final androidx.compose.ui.Alignment.Vertical getCenterVertically() {
            return Companion.l;
        }

        @Stable
        public static void getCenterVertically$annotations() {
        }

        @NotNull
        public final androidx.compose.ui.Alignment.Horizontal getEnd() {
            return Companion.p;
        }

        @Stable
        public static void getEnd$annotations() {
        }

        @NotNull
        public final androidx.compose.ui.Alignment.Horizontal getStart() {
            return Companion.n;
        }

        @Stable
        public static void getStart$annotations() {
        }

        @NotNull
        public final androidx.compose.ui.Alignment.Vertical getTop() {
            return Companion.k;
        }

        @Stable
        public static void getTop$annotations() {
        }

        @NotNull
        public final Alignment getTopCenter() {
            return Companion.c;
        }

        @Stable
        public static void getTopCenter$annotations() {
        }

        @NotNull
        public final Alignment getTopEnd() {
            return Companion.d;
        }

        @Stable
        public static void getTopEnd$annotations() {
        }

        @NotNull
        public final Alignment getTopStart() {
            return Companion.b;
        }

        @Stable
        public static void getTopStart$annotations() {
        }
    }

    @Stable
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bç\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/Alignment$Horizontal;", "", "align", "", "size", "space", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface androidx.compose.ui.Alignment.Horizontal {
        int align(int arg1, int arg2, @NotNull LayoutDirection arg3);
    }

    @Stable
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/Alignment$Vertical;", "", "align", "", "size", "space", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface androidx.compose.ui.Alignment.Vertical {
        int align(int arg1, int arg2);
    }

    @NotNull
    public static final Companion Companion;

    static {
        Alignment.Companion = Companion.a;
    }

    long align-KFBX0sM(long arg1, long arg2, @NotNull LayoutDirection arg3);
}

