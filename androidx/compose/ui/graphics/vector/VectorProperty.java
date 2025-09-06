package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 2)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0010\u0003\u0004\u0005\u0006\u0007\b\t\n\u000B\f\r\u000E\u000F\u0010\u0011\u0012\u0082\u0001\u0010\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001A\u001B\u001C\u001D\u001E\u001F !\"¨\u0006#"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty;", "T", "", "Fill", "FillAlpha", "PathData", "PivotX", "PivotY", "Rotation", "ScaleX", "ScaleY", "Stroke", "StrokeAlpha", "StrokeLineWidth", "TranslateX", "TranslateY", "TrimPathEnd", "TrimPathOffset", "TrimPathStart", "Landroidx/compose/ui/graphics/vector/VectorProperty$Fill;", "Landroidx/compose/ui/graphics/vector/VectorProperty$FillAlpha;", "Landroidx/compose/ui/graphics/vector/VectorProperty$PathData;", "Landroidx/compose/ui/graphics/vector/VectorProperty$PivotX;", "Landroidx/compose/ui/graphics/vector/VectorProperty$PivotY;", "Landroidx/compose/ui/graphics/vector/VectorProperty$Rotation;", "Landroidx/compose/ui/graphics/vector/VectorProperty$ScaleX;", "Landroidx/compose/ui/graphics/vector/VectorProperty$ScaleY;", "Landroidx/compose/ui/graphics/vector/VectorProperty$Stroke;", "Landroidx/compose/ui/graphics/vector/VectorProperty$StrokeAlpha;", "Landroidx/compose/ui/graphics/vector/VectorProperty$StrokeLineWidth;", "Landroidx/compose/ui/graphics/vector/VectorProperty$TranslateX;", "Landroidx/compose/ui/graphics/vector/VectorProperty$TranslateY;", "Landroidx/compose/ui/graphics/vector/VectorProperty$TrimPathEnd;", "Landroidx/compose/ui/graphics/vector/VectorProperty$TrimPathOffset;", "Landroidx/compose/ui/graphics/vector/VectorProperty$TrimPathStart;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class VectorProperty {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$Fill;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "Landroidx/compose/ui/graphics/Brush;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Fill extends VectorProperty {
        public static final int $stable;
        @NotNull
        public static final Fill INSTANCE;

        static {
            Fill.INSTANCE = new Fill(null);  // 初始化器: Landroidx/compose/ui/graphics/vector/VectorProperty;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$FillAlpha;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class FillAlpha extends VectorProperty {
        public static final int $stable;
        @NotNull
        public static final FillAlpha INSTANCE;

        static {
            FillAlpha.INSTANCE = new FillAlpha(null);  // 初始化器: Landroidx/compose/ui/graphics/vector/VectorProperty;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$PathData;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class PathData extends VectorProperty {
        public static final int $stable;
        @NotNull
        public static final PathData INSTANCE;

        static {
            PathData.INSTANCE = new PathData(null);  // 初始化器: Landroidx/compose/ui/graphics/vector/VectorProperty;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$PivotX;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class PivotX extends VectorProperty {
        public static final int $stable;
        @NotNull
        public static final PivotX INSTANCE;

        static {
            PivotX.INSTANCE = new PivotX(null);  // 初始化器: Landroidx/compose/ui/graphics/vector/VectorProperty;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$PivotY;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class PivotY extends VectorProperty {
        public static final int $stable;
        @NotNull
        public static final PivotY INSTANCE;

        static {
            PivotY.INSTANCE = new PivotY(null);  // 初始化器: Landroidx/compose/ui/graphics/vector/VectorProperty;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$Rotation;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Rotation extends VectorProperty {
        public static final int $stable;
        @NotNull
        public static final Rotation INSTANCE;

        static {
            Rotation.INSTANCE = new Rotation(null);  // 初始化器: Landroidx/compose/ui/graphics/vector/VectorProperty;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$ScaleX;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class ScaleX extends VectorProperty {
        public static final int $stable;
        @NotNull
        public static final ScaleX INSTANCE;

        static {
            ScaleX.INSTANCE = new ScaleX(null);  // 初始化器: Landroidx/compose/ui/graphics/vector/VectorProperty;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$ScaleY;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class ScaleY extends VectorProperty {
        public static final int $stable;
        @NotNull
        public static final ScaleY INSTANCE;

        static {
            ScaleY.INSTANCE = new ScaleY(null);  // 初始化器: Landroidx/compose/ui/graphics/vector/VectorProperty;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$Stroke;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "Landroidx/compose/ui/graphics/Brush;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Stroke extends VectorProperty {
        public static final int $stable;
        @NotNull
        public static final Stroke INSTANCE;

        static {
            Stroke.INSTANCE = new Stroke(null);  // 初始化器: Landroidx/compose/ui/graphics/vector/VectorProperty;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$StrokeAlpha;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class StrokeAlpha extends VectorProperty {
        public static final int $stable;
        @NotNull
        public static final StrokeAlpha INSTANCE;

        static {
            StrokeAlpha.INSTANCE = new StrokeAlpha(null);  // 初始化器: Landroidx/compose/ui/graphics/vector/VectorProperty;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$StrokeLineWidth;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class StrokeLineWidth extends VectorProperty {
        public static final int $stable;
        @NotNull
        public static final StrokeLineWidth INSTANCE;

        static {
            StrokeLineWidth.INSTANCE = new StrokeLineWidth(null);  // 初始化器: Landroidx/compose/ui/graphics/vector/VectorProperty;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$TranslateX;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class TranslateX extends VectorProperty {
        public static final int $stable;
        @NotNull
        public static final TranslateX INSTANCE;

        static {
            TranslateX.INSTANCE = new TranslateX(null);  // 初始化器: Landroidx/compose/ui/graphics/vector/VectorProperty;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$TranslateY;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class TranslateY extends VectorProperty {
        public static final int $stable;
        @NotNull
        public static final TranslateY INSTANCE;

        static {
            TranslateY.INSTANCE = new TranslateY(null);  // 初始化器: Landroidx/compose/ui/graphics/vector/VectorProperty;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$TrimPathEnd;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class TrimPathEnd extends VectorProperty {
        public static final int $stable;
        @NotNull
        public static final TrimPathEnd INSTANCE;

        static {
            TrimPathEnd.INSTANCE = new TrimPathEnd(null);  // 初始化器: Landroidx/compose/ui/graphics/vector/VectorProperty;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$TrimPathOffset;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class TrimPathOffset extends VectorProperty {
        public static final int $stable;
        @NotNull
        public static final TrimPathOffset INSTANCE;

        static {
            TrimPathOffset.INSTANCE = new TrimPathOffset(null);  // 初始化器: Landroidx/compose/ui/graphics/vector/VectorProperty;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$TrimPathStart;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class TrimPathStart extends VectorProperty {
        public static final int $stable;
        @NotNull
        public static final TrimPathStart INSTANCE;

        static {
            TrimPathStart.INSTANCE = new TrimPathStart(null);  // 初始化器: Landroidx/compose/ui/graphics/vector/VectorProperty;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    public static final int $stable;

    public VectorProperty(DefaultConstructorMarker defaultConstructorMarker0) {
    }
}

