package androidx.compose.ui.graphics.vector;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\'\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007\u00A2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001A\u00020\u0000\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u001D\u0010\t\u001A\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0006\u00A2\u0006\u0004\b\t\u0010\nJ\u001D\u0010\r\u001A\u00020\u00002\u0006\u0010\u000B\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u0006\u00A2\u0006\u0004\b\r\u0010\nJ\u001D\u0010\u000E\u001A\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0006\u00A2\u0006\u0004\b\u000E\u0010\nJ\u001D\u0010\u000F\u001A\u00020\u00002\u0006\u0010\u000B\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u0006\u00A2\u0006\u0004\b\u000F\u0010\nJ\u0015\u0010\u0010\u001A\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001A\u00020\u00002\u0006\u0010\u000B\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0013\u001A\u00020\u00002\u0006\u0010\b\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0013\u0010\u0011J\u0015\u0010\u0014\u001A\u00020\u00002\u0006\u0010\f\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0014\u0010\u0011J=\u0010\u001B\u001A\u00020\u00002\u0006\u0010\u0015\u001A\u00020\u00062\u0006\u0010\u0016\u001A\u00020\u00062\u0006\u0010\u0017\u001A\u00020\u00062\u0006\u0010\u0018\u001A\u00020\u00062\u0006\u0010\u0019\u001A\u00020\u00062\u0006\u0010\u001A\u001A\u00020\u0006\u00A2\u0006\u0004\b\u001B\u0010\u001CJ=\u0010#\u001A\u00020\u00002\u0006\u0010\u001D\u001A\u00020\u00062\u0006\u0010\u001E\u001A\u00020\u00062\u0006\u0010\u001F\u001A\u00020\u00062\u0006\u0010 \u001A\u00020\u00062\u0006\u0010!\u001A\u00020\u00062\u0006\u0010\"\u001A\u00020\u0006\u00A2\u0006\u0004\b#\u0010\u001CJ-\u0010$\u001A\u00020\u00002\u0006\u0010\u0015\u001A\u00020\u00062\u0006\u0010\u0016\u001A\u00020\u00062\u0006\u0010\u0017\u001A\u00020\u00062\u0006\u0010\u0018\u001A\u00020\u0006\u00A2\u0006\u0004\b$\u0010%J-\u0010&\u001A\u00020\u00002\u0006\u0010\u001D\u001A\u00020\u00062\u0006\u0010\u001E\u001A\u00020\u00062\u0006\u0010\u001F\u001A\u00020\u00062\u0006\u0010 \u001A\u00020\u0006\u00A2\u0006\u0004\b&\u0010%J-\u0010\'\u001A\u00020\u00002\u0006\u0010\u0015\u001A\u00020\u00062\u0006\u0010\u0016\u001A\u00020\u00062\u0006\u0010\u0017\u001A\u00020\u00062\u0006\u0010\u0018\u001A\u00020\u0006\u00A2\u0006\u0004\b\'\u0010%J-\u0010(\u001A\u00020\u00002\u0006\u0010\u001D\u001A\u00020\u00062\u0006\u0010\u001E\u001A\u00020\u00062\u0006\u0010\u001F\u001A\u00020\u00062\u0006\u0010 \u001A\u00020\u0006\u00A2\u0006\u0004\b(\u0010%J\u001D\u0010)\u001A\u00020\u00002\u0006\u0010\u0015\u001A\u00020\u00062\u0006\u0010\u0016\u001A\u00020\u0006\u00A2\u0006\u0004\b)\u0010\nJ\u001D\u0010*\u001A\u00020\u00002\u0006\u0010\u001D\u001A\u00020\u00062\u0006\u0010\u001E\u001A\u00020\u0006\u00A2\u0006\u0004\b*\u0010\nJE\u00101\u001A\u00020\u00002\u0006\u0010+\u001A\u00020\u00062\u0006\u0010,\u001A\u00020\u00062\u0006\u0010-\u001A\u00020\u00062\u0006\u0010/\u001A\u00020.2\u0006\u00100\u001A\u00020.2\u0006\u0010\u0015\u001A\u00020\u00062\u0006\u0010\u0016\u001A\u00020\u0006\u00A2\u0006\u0004\b1\u00102JE\u00105\u001A\u00020\u00002\u0006\u00103\u001A\u00020\u00062\u0006\u00104\u001A\u00020\u00062\u0006\u0010-\u001A\u00020\u00062\u0006\u0010/\u001A\u00020.2\u0006\u00100\u001A\u00020.2\u0006\u0010\u001D\u001A\u00020\u00062\u0006\u0010\u001E\u001A\u00020\u0006\u00A2\u0006\u0004\b5\u00102R\u0017\u0010:\u001A\b\u0012\u0004\u0012\u000207068F\u00A2\u0006\u0006\u001A\u0004\b8\u00109\u00A8\u0006;"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "<init>", "()V", "close", "()Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "x", "y", "moveTo", "(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;", "dx", "dy", "moveToRelative", "lineTo", "lineToRelative", "horizontalLineTo", "(F)Landroidx/compose/ui/graphics/vector/PathBuilder;", "horizontalLineToRelative", "verticalLineTo", "verticalLineToRelative", "x1", "y1", "x2", "y2", "x3", "y3", "curveTo", "(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;", "dx1", "dy1", "dx2", "dy2", "dx3", "dy3", "curveToRelative", "reflectiveCurveTo", "(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;", "reflectiveCurveToRelative", "quadTo", "quadToRelative", "reflectiveQuadTo", "reflectiveQuadToRelative", "horizontalEllipseRadius", "verticalEllipseRadius", "theta", "", "isMoreThanHalf", "isPositiveArc", "arcTo", "(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;", "a", "b", "arcToRelative", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "getNodes", "()Ljava/util/List;", "nodes", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PathBuilder {
    public final ArrayList a;

    public PathBuilder() {
        this.a = new ArrayList(0x20);
    }

    @NotNull
    public final PathBuilder arcTo(float f, float f1, float f2, boolean z, boolean z1, float f3, float f4) {
        ArcTo pathNode$ArcTo0 = new ArcTo(f, f1, f2, z, z1, f3, f4);
        this.a.add(pathNode$ArcTo0);
        return this;
    }

    @NotNull
    public final PathBuilder arcToRelative(float f, float f1, float f2, boolean z, boolean z1, float f3, float f4) {
        RelativeArcTo pathNode$RelativeArcTo0 = new RelativeArcTo(f, f1, f2, z, z1, f3, f4);
        this.a.add(pathNode$RelativeArcTo0);
        return this;
    }

    @NotNull
    public final PathBuilder close() {
        this.a.add(Close.INSTANCE);
        return this;
    }

    @NotNull
    public final PathBuilder curveTo(float f, float f1, float f2, float f3, float f4, float f5) {
        CurveTo pathNode$CurveTo0 = new CurveTo(f, f1, f2, f3, f4, f5);
        this.a.add(pathNode$CurveTo0);
        return this;
    }

    @NotNull
    public final PathBuilder curveToRelative(float f, float f1, float f2, float f3, float f4, float f5) {
        RelativeCurveTo pathNode$RelativeCurveTo0 = new RelativeCurveTo(f, f1, f2, f3, f4, f5);
        this.a.add(pathNode$RelativeCurveTo0);
        return this;
    }

    @NotNull
    public final List getNodes() {
        return this.a;
    }

    @NotNull
    public final PathBuilder horizontalLineTo(float f) {
        HorizontalTo pathNode$HorizontalTo0 = new HorizontalTo(f);
        this.a.add(pathNode$HorizontalTo0);
        return this;
    }

    @NotNull
    public final PathBuilder horizontalLineToRelative(float f) {
        RelativeHorizontalTo pathNode$RelativeHorizontalTo0 = new RelativeHorizontalTo(f);
        this.a.add(pathNode$RelativeHorizontalTo0);
        return this;
    }

    @NotNull
    public final PathBuilder lineTo(float f, float f1) {
        LineTo pathNode$LineTo0 = new LineTo(f, f1);
        this.a.add(pathNode$LineTo0);
        return this;
    }

    @NotNull
    public final PathBuilder lineToRelative(float f, float f1) {
        RelativeLineTo pathNode$RelativeLineTo0 = new RelativeLineTo(f, f1);
        this.a.add(pathNode$RelativeLineTo0);
        return this;
    }

    @NotNull
    public final PathBuilder moveTo(float f, float f1) {
        MoveTo pathNode$MoveTo0 = new MoveTo(f, f1);
        this.a.add(pathNode$MoveTo0);
        return this;
    }

    @NotNull
    public final PathBuilder moveToRelative(float f, float f1) {
        RelativeMoveTo pathNode$RelativeMoveTo0 = new RelativeMoveTo(f, f1);
        this.a.add(pathNode$RelativeMoveTo0);
        return this;
    }

    @NotNull
    public final PathBuilder quadTo(float f, float f1, float f2, float f3) {
        QuadTo pathNode$QuadTo0 = new QuadTo(f, f1, f2, f3);
        this.a.add(pathNode$QuadTo0);
        return this;
    }

    @NotNull
    public final PathBuilder quadToRelative(float f, float f1, float f2, float f3) {
        RelativeQuadTo pathNode$RelativeQuadTo0 = new RelativeQuadTo(f, f1, f2, f3);
        this.a.add(pathNode$RelativeQuadTo0);
        return this;
    }

    @NotNull
    public final PathBuilder reflectiveCurveTo(float f, float f1, float f2, float f3) {
        ReflectiveCurveTo pathNode$ReflectiveCurveTo0 = new ReflectiveCurveTo(f, f1, f2, f3);
        this.a.add(pathNode$ReflectiveCurveTo0);
        return this;
    }

    @NotNull
    public final PathBuilder reflectiveCurveToRelative(float f, float f1, float f2, float f3) {
        RelativeReflectiveCurveTo pathNode$RelativeReflectiveCurveTo0 = new RelativeReflectiveCurveTo(f, f1, f2, f3);
        this.a.add(pathNode$RelativeReflectiveCurveTo0);
        return this;
    }

    @NotNull
    public final PathBuilder reflectiveQuadTo(float f, float f1) {
        ReflectiveQuadTo pathNode$ReflectiveQuadTo0 = new ReflectiveQuadTo(f, f1);
        this.a.add(pathNode$ReflectiveQuadTo0);
        return this;
    }

    @NotNull
    public final PathBuilder reflectiveQuadToRelative(float f, float f1) {
        RelativeReflectiveQuadTo pathNode$RelativeReflectiveQuadTo0 = new RelativeReflectiveQuadTo(f, f1);
        this.a.add(pathNode$RelativeReflectiveQuadTo0);
        return this;
    }

    @NotNull
    public final PathBuilder verticalLineTo(float f) {
        VerticalTo pathNode$VerticalTo0 = new VerticalTo(f);
        this.a.add(pathNode$VerticalTo0);
        return this;
    }

    @NotNull
    public final PathBuilder verticalLineToRelative(float f) {
        RelativeVerticalTo pathNode$RelativeVerticalTo0 = new RelativeVerticalTo(f);
        this.a.add(pathNode$RelativeVerticalTo0);
        return this;
    }
}

