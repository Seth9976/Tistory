package androidx.compose.ui.node;

import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\ba\u0018\u0000 .2\u00020\u0001:\u0001.R\"\u0010\u0002\u001A\u00020\u00038&@&X§\u000E¢\u0006\u0012\u0012\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0018\u0010\n\u001A\u00020\u000BX¦\u000E¢\u0006\f\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000FR\u0018\u0010\u0010\u001A\u00020\u0011X¦\u000E¢\u0006\f\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001A\u00020\u0017X¦\u000E¢\u0006\f\u001A\u0004\b\u0018\u0010\u0019\"\u0004\b\u001A\u0010\u001BR\u0018\u0010\u001C\u001A\u00020\u001DX¦\u000E¢\u0006\f\u001A\u0004\b\u001E\u0010\u001F\"\u0004\b \u0010!R\u0018\u0010\"\u001A\u00020#X¦\u000E¢\u0006\f\u001A\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u0018\u0010(\u001A\u00020)X¦\u000E¢\u0006\f\u001A\u0004\b*\u0010+\"\u0004\b,\u0010-ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006/À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/ComposeUiNode;", "", "compositeKeyHash", "", "getCompositeKeyHash$annotations", "()V", "getCompositeKeyHash", "()I", "setCompositeKeyHash", "(I)V", "compositionLocalMap", "Landroidx/compose/runtime/CompositionLocalMap;", "getCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "setCompositionLocalMap", "(Landroidx/compose/runtime/CompositionLocalMap;)V", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "setMeasurePolicy", "(Landroidx/compose/ui/layout/MeasurePolicy;)V", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "setViewConfiguration", "(Landroidx/compose/ui/platform/ViewConfiguration;)V", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@PublishedApi
public interface ComposeUiNode {
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007R\u001D\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00A2\u0006\f\n\u0004\b\t\u0010\u0005\u001A\u0004\b\n\u0010\u0007R.\u0010\u0014\u001A\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000E0\f\u00A2\u0006\u0002\b\u000F8\u0006\u00A2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013R.\u0010\u0018\u001A\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000E0\f\u00A2\u0006\u0002\b\u000F8\u0006\u00A2\u0006\f\n\u0004\b\u0016\u0010\u0011\u001A\u0004\b\u0017\u0010\u0013R.\u0010\u001C\u001A\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000E0\f\u00A2\u0006\u0002\b\u000F8\u0006\u00A2\u0006\f\n\u0004\b\u001A\u0010\u0011\u001A\u0004\b\u001B\u0010\u0013R.\u0010 \u001A\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001D\u0012\u0004\u0012\u00020\u000E0\f\u00A2\u0006\u0002\b\u000F8\u0006\u00A2\u0006\f\n\u0004\b\u001E\u0010\u0011\u001A\u0004\b\u001F\u0010\u0013R.\u0010$\u001A\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000E0\f\u00A2\u0006\u0002\b\u000F8\u0006\u00A2\u0006\f\n\u0004\b\"\u0010\u0011\u001A\u0004\b#\u0010\u0013R.\u0010(\u001A\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000E0\f\u00A2\u0006\u0002\b\u000F8\u0006\u00A2\u0006\f\n\u0004\b&\u0010\u0011\u001A\u0004\b\'\u0010\u0013R7\u0010.\u001A\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u000E0\f\u00A2\u0006\u0002\b\u000F8GX\u0087\u0004\u00A2\u0006\u0012\n\u0004\b*\u0010\u0011\u0012\u0004\b,\u0010-\u001A\u0004\b+\u0010\u0013\u00A8\u0006/"}, d2 = {"Landroidx/compose/ui/node/ComposeUiNode$Companion;", "", "Lkotlin/Function0;", "Landroidx/compose/ui/node/ComposeUiNode;", "b", "Lkotlin/jvm/functions/Function0;", "getConstructor", "()Lkotlin/jvm/functions/Function0;", "Constructor", "c", "getVirtualConstructor", "VirtualConstructor", "Lkotlin/Function2;", "Landroidx/compose/ui/Modifier;", "", "Lkotlin/ExtensionFunctionType;", "d", "Lkotlin/jvm/functions/Function2;", "getSetModifier", "()Lkotlin/jvm/functions/Function2;", "SetModifier", "Landroidx/compose/ui/unit/Density;", "e", "getSetDensity", "SetDensity", "Landroidx/compose/runtime/CompositionLocalMap;", "f", "getSetResolvedCompositionLocals", "SetResolvedCompositionLocals", "Landroidx/compose/ui/layout/MeasurePolicy;", "g", "getSetMeasurePolicy", "SetMeasurePolicy", "Landroidx/compose/ui/unit/LayoutDirection;", "h", "getSetLayoutDirection", "SetLayoutDirection", "Landroidx/compose/ui/platform/ViewConfiguration;", "i", "getSetViewConfiguration", "SetViewConfiguration", "", "j", "getSetCompositeKeyHash", "getSetCompositeKeyHash$annotations", "()V", "SetCompositeKeyHash", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public static final Companion a;
        public static final Function0 b;
        public static final h c;
        public static final e d;
        public static final b e;
        public static final f f;
        public static final d g;
        public static final c h;
        public static final g i;
        public static final a j;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
            Companion.b = LayoutNode.Companion.getConstructor$ui_release();
            Companion.c = h.w;
            Companion.d = e.w;
            Companion.e = b.w;
            Companion.f = f.w;
            Companion.g = d.w;
            Companion.h = c.w;
            Companion.i = g.w;
            Companion.j = a.w;
        }

        @NotNull
        public final Function0 getConstructor() {
            return Companion.b;
        }

        @ExperimentalComposeUiApi
        @NotNull
        public final Function2 getSetCompositeKeyHash() {
            return Companion.j;
        }

        @ExperimentalComposeUiApi
        public static void getSetCompositeKeyHash$annotations() {
        }

        @NotNull
        public final Function2 getSetDensity() {
            return Companion.e;
        }

        @NotNull
        public final Function2 getSetLayoutDirection() {
            return Companion.h;
        }

        @NotNull
        public final Function2 getSetMeasurePolicy() {
            return Companion.g;
        }

        @NotNull
        public final Function2 getSetModifier() {
            return Companion.d;
        }

        @NotNull
        public final Function2 getSetResolvedCompositionLocals() {
            return Companion.f;
        }

        @NotNull
        public final Function2 getSetViewConfiguration() {
            return Companion.i;
        }

        @NotNull
        public final Function0 getVirtualConstructor() {
            return Companion.c;
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        ComposeUiNode.Companion = Companion.a;
    }

    int getCompositeKeyHash();

    @ExperimentalComposeUiApi
    static void getCompositeKeyHash$annotations() {
    }

    @NotNull
    CompositionLocalMap getCompositionLocalMap();

    @NotNull
    Density getDensity();

    @NotNull
    LayoutDirection getLayoutDirection();

    @NotNull
    MeasurePolicy getMeasurePolicy();

    @NotNull
    Modifier getModifier();

    @NotNull
    ViewConfiguration getViewConfiguration();

    void setCompositeKeyHash(int arg1);

    void setCompositionLocalMap(@NotNull CompositionLocalMap arg1);

    void setDensity(@NotNull Density arg1);

    void setLayoutDirection(@NotNull LayoutDirection arg1);

    void setMeasurePolicy(@NotNull MeasurePolicy arg1);

    void setModifier(@NotNull Modifier arg1);

    void setViewConfiguration(@NotNull ViewConfiguration arg1);
}

