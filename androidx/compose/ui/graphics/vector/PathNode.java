package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0013\t\n\u000B\f\r\u000E\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001A\u001BR\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006\u0082\u0001\u0013\u001C\u001D\u001E\u001F !\"#$%&\'()*+,-.¨\u0006/"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode;", "", "", "a", "Z", "isCurve", "()Z", "b", "isQuad", "ArcTo", "Close", "CurveTo", "HorizontalTo", "LineTo", "MoveTo", "QuadTo", "ReflectiveCurveTo", "ReflectiveQuadTo", "RelativeArcTo", "RelativeCurveTo", "RelativeHorizontalTo", "RelativeLineTo", "RelativeMoveTo", "RelativeQuadTo", "RelativeReflectiveCurveTo", "RelativeReflectiveQuadTo", "RelativeVerticalTo", "VerticalTo", "Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode$Close;", "Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode$LineTo;", "Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;", "Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class PathNode {
    @Immutable
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0011\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\u0002\u0012\u0006\u0010\n\u001A\u00020\u0002\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u000F\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0010\u0010\u000EJ\u0010\u0010\u0011\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u000EJ\u0010\u0010\u0015\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u000EJV\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\u0002H\u00C6\u0001\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001A\u00020\u0018H\u00D6\u0001\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0010\u0010\u001C\u001A\u00020\u001BH\u00D6\u0001\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u001A\u0010 \u001A\u00020\u00062\b\u0010\u001F\u001A\u0004\u0018\u00010\u001EH\u00D6\u0003\u00A2\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010\u000ER\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b%\u0010#\u001A\u0004\b&\u0010\u000ER\u0017\u0010\u0005\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\'\u0010#\u001A\u0004\b(\u0010\u000ER\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b\u0007\u0010\u0012R\u0017\u0010\b\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b+\u0010*\u001A\u0004\b\b\u0010\u0012R\u0017\u0010\t\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b,\u0010#\u001A\u0004\b-\u0010\u000ER\u0017\u0010\n\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b.\u0010#\u001A\u0004\b/\u0010\u000E\u00A8\u00060"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "horizontalEllipseRadius", "verticalEllipseRadius", "theta", "", "isMoreThanHalf", "isPositiveArc", "arcStartX", "arcStartY", "<init>", "(FFFZZFF)V", "component1", "()F", "component2", "component3", "component4", "()Z", "component5", "component6", "component7", "copy", "(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "F", "getHorizontalEllipseRadius", "d", "getVerticalEllipseRadius", "e", "getTheta", "f", "Z", "g", "h", "getArcStartX", "i", "getArcStartY", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class ArcTo extends PathNode {
        public final float c;
        public final float d;
        public final float e;
        public final boolean f;
        public final boolean g;
        public final float h;
        public final float i;

        public ArcTo(float f, float f1, float f2, boolean z, boolean z1, float f3, float f4) {
            super(false, false, 3, null);
            this.c = f;
            this.d = f1;
            this.e = f2;
            this.f = z;
            this.g = z1;
            this.h = f3;
            this.i = f4;
        }

        public final float component1() {
            return this.c;
        }

        public final float component2() {
            return this.d;
        }

        public final float component3() {
            return this.e;
        }

        public final boolean component4() {
            return this.f;
        }

        public final boolean component5() {
            return this.g;
        }

        public final float component6() {
            return this.h;
        }

        public final float component7() {
            return this.i;
        }

        @NotNull
        public final ArcTo copy(float f, float f1, float f2, boolean z, boolean z1, float f3, float f4) {
            return new ArcTo(f, f1, f2, z, z1, f3, f4);
        }

        public static ArcTo copy$default(ArcTo pathNode$ArcTo0, float f, float f1, float f2, boolean z, boolean z1, float f3, float f4, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$ArcTo0.c;
            }
            if((v & 2) != 0) {
                f1 = pathNode$ArcTo0.d;
            }
            if((v & 4) != 0) {
                f2 = pathNode$ArcTo0.e;
            }
            if((v & 8) != 0) {
                z = pathNode$ArcTo0.f;
            }
            if((v & 16) != 0) {
                z1 = pathNode$ArcTo0.g;
            }
            if((v & 0x20) != 0) {
                f3 = pathNode$ArcTo0.h;
            }
            if((v & 0x40) != 0) {
                f4 = pathNode$ArcTo0.i;
            }
            return pathNode$ArcTo0.copy(f, f1, f2, z, z1, f3, f4);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ArcTo)) {
                return false;
            }
            if(Float.compare(this.c, ((ArcTo)object0).c) != 0) {
                return false;
            }
            if(Float.compare(this.d, ((ArcTo)object0).d) != 0) {
                return false;
            }
            if(Float.compare(this.e, ((ArcTo)object0).e) != 0) {
                return false;
            }
            if(this.f != ((ArcTo)object0).f) {
                return false;
            }
            if(this.g != ((ArcTo)object0).g) {
                return false;
            }
            return Float.compare(this.h, ((ArcTo)object0).h) == 0 ? Float.compare(this.i, ((ArcTo)object0).i) == 0 : false;
        }

        public final float getArcStartX() {
            return this.h;
        }

        public final float getArcStartY() {
            return this.i;
        }

        public final float getHorizontalEllipseRadius() {
            return this.c;
        }

        public final float getTheta() {
            return this.e;
        }

        public final float getVerticalEllipseRadius() {
            return this.d;
        }

        @Override
        public int hashCode() {
            return Float.hashCode(this.i) + a.b(this.h, a.e(a.e(a.b(this.e, a.b(this.d, Float.hashCode(this.c) * 0x1F, 0x1F), 0x1F), 0x1F, this.f), 0x1F, this.g), 0x1F);
        }

        public final boolean isMoreThanHalf() {
            return this.f;
        }

        public final boolean isPositiveArc() {
            return this.g;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("ArcTo(horizontalEllipseRadius=");
            stringBuilder0.append(this.c);
            stringBuilder0.append(", verticalEllipseRadius=");
            stringBuilder0.append(this.d);
            stringBuilder0.append(", theta=");
            stringBuilder0.append(this.e);
            stringBuilder0.append(", isMoreThanHalf=");
            stringBuilder0.append(this.f);
            stringBuilder0.append(", isPositiveArc=");
            stringBuilder0.append(this.g);
            stringBuilder0.append(", arcStartX=");
            stringBuilder0.append(this.h);
            stringBuilder0.append(", arcStartY=");
            return a.n(stringBuilder0, this.i, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$Close;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Close extends PathNode {
        @NotNull
        public static final Close INSTANCE;

        static {
            Close.INSTANCE = new Close(false, false, 3, null);  // 初始化器: Landroidx/compose/ui/graphics/vector/PathNode;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0002\u00A2\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000E\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u000E\u0010\fJ\u0010\u0010\u000F\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u000F\u0010\fJ\u0010\u0010\u0010\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u0002H\u00C6\u0001\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001A\u00020\u0014H\u00D6\u0001\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001A\u00020\u0017H\u00D6\u0001\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u001A\u0010\u001D\u001A\u00020\u001C2\b\u0010\u001B\u001A\u0004\u0018\u00010\u001AH\u00D6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001ER\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\fR\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\"\u0010 \u001A\u0004\b#\u0010\fR\u0017\u0010\u0005\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b$\u0010 \u001A\u0004\b%\u0010\fR\u0017\u0010\u0006\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b&\u0010 \u001A\u0004\b\'\u0010\fR\u0017\u0010\u0007\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b(\u0010 \u001A\u0004\b)\u0010\fR\u0017\u0010\b\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b*\u0010 \u001A\u0004\b+\u0010\f\u00A8\u0006,"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "x1", "y1", "x2", "y2", "x3", "y3", "<init>", "(FFFFFF)V", "component1", "()F", "component2", "component3", "component4", "component5", "component6", "copy", "(FFFFFF)Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "F", "getX1", "d", "getY1", "e", "getX2", "f", "getY2", "g", "getX3", "h", "getY3", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class CurveTo extends PathNode {
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public final float h;

        public CurveTo(float f, float f1, float f2, float f3, float f4, float f5) {
            super(true, false, 2, null);
            this.c = f;
            this.d = f1;
            this.e = f2;
            this.f = f3;
            this.g = f4;
            this.h = f5;
        }

        public final float component1() {
            return this.c;
        }

        public final float component2() {
            return this.d;
        }

        public final float component3() {
            return this.e;
        }

        public final float component4() {
            return this.f;
        }

        public final float component5() {
            return this.g;
        }

        public final float component6() {
            return this.h;
        }

        @NotNull
        public final CurveTo copy(float f, float f1, float f2, float f3, float f4, float f5) {
            return new CurveTo(f, f1, f2, f3, f4, f5);
        }

        public static CurveTo copy$default(CurveTo pathNode$CurveTo0, float f, float f1, float f2, float f3, float f4, float f5, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$CurveTo0.c;
            }
            if((v & 2) != 0) {
                f1 = pathNode$CurveTo0.d;
            }
            if((v & 4) != 0) {
                f2 = pathNode$CurveTo0.e;
            }
            if((v & 8) != 0) {
                f3 = pathNode$CurveTo0.f;
            }
            if((v & 16) != 0) {
                f4 = pathNode$CurveTo0.g;
            }
            if((v & 0x20) != 0) {
                f5 = pathNode$CurveTo0.h;
            }
            return pathNode$CurveTo0.copy(f, f1, f2, f3, f4, f5);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof CurveTo)) {
                return false;
            }
            if(Float.compare(this.c, ((CurveTo)object0).c) != 0) {
                return false;
            }
            if(Float.compare(this.d, ((CurveTo)object0).d) != 0) {
                return false;
            }
            if(Float.compare(this.e, ((CurveTo)object0).e) != 0) {
                return false;
            }
            if(Float.compare(this.f, ((CurveTo)object0).f) != 0) {
                return false;
            }
            return Float.compare(this.g, ((CurveTo)object0).g) == 0 ? Float.compare(this.h, ((CurveTo)object0).h) == 0 : false;
        }

        public final float getX1() {
            return this.c;
        }

        public final float getX2() {
            return this.e;
        }

        public final float getX3() {
            return this.g;
        }

        public final float getY1() {
            return this.d;
        }

        public final float getY2() {
            return this.f;
        }

        public final float getY3() {
            return this.h;
        }

        @Override
        public int hashCode() {
            return Float.hashCode(this.h) + a.b(this.g, a.b(this.f, a.b(this.e, a.b(this.d, Float.hashCode(this.c) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("CurveTo(x1=");
            stringBuilder0.append(this.c);
            stringBuilder0.append(", y1=");
            stringBuilder0.append(this.d);
            stringBuilder0.append(", x2=");
            stringBuilder0.append(this.e);
            stringBuilder0.append(", y2=");
            stringBuilder0.append(this.f);
            stringBuilder0.append(", x3=");
            stringBuilder0.append(this.g);
            stringBuilder0.append(", y3=");
            return a.n(stringBuilder0, this.h, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "x", "<init>", "(F)V", "component1", "()F", "copy", "(F)Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "F", "getX", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class HorizontalTo extends PathNode {
        public final float c;

        public HorizontalTo(float f) {
            super(false, false, 3, null);
            this.c = f;
        }

        public final float component1() {
            return this.c;
        }

        @NotNull
        public final HorizontalTo copy(float f) {
            return new HorizontalTo(f);
        }

        public static HorizontalTo copy$default(HorizontalTo pathNode$HorizontalTo0, float f, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$HorizontalTo0.c;
            }
            return pathNode$HorizontalTo0.copy(f);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof HorizontalTo ? Float.compare(this.c, ((HorizontalTo)object0).c) == 0 : false;
        }

        public final float getX() {
            return this.c;
        }

        @Override
        public int hashCode() {
            return Float.hashCode(this.c);
        }

        @Override
        @NotNull
        public String toString() {
            return a.n(new StringBuilder("HorizontalTo(x="), this.c, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\r\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\bR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u0018\u001A\u0004\b\u001B\u0010\b¨\u0006\u001C"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$LineTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "x", "y", "<init>", "(FF)V", "component1", "()F", "component2", "copy", "(FF)Landroidx/compose/ui/graphics/vector/PathNode$LineTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "F", "getX", "d", "getY", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class LineTo extends PathNode {
        public final float c;
        public final float d;

        public LineTo(float f, float f1) {
            super(false, false, 3, null);
            this.c = f;
            this.d = f1;
        }

        public final float component1() {
            return this.c;
        }

        public final float component2() {
            return this.d;
        }

        @NotNull
        public final LineTo copy(float f, float f1) {
            return new LineTo(f, f1);
        }

        public static LineTo copy$default(LineTo pathNode$LineTo0, float f, float f1, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$LineTo0.c;
            }
            if((v & 2) != 0) {
                f1 = pathNode$LineTo0.d;
            }
            return pathNode$LineTo0.copy(f, f1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof LineTo)) {
                return false;
            }
            return Float.compare(this.c, ((LineTo)object0).c) == 0 ? Float.compare(this.d, ((LineTo)object0).d) == 0 : false;
        }

        public final float getX() {
            return this.c;
        }

        public final float getY() {
            return this.d;
        }

        @Override
        public int hashCode() {
            return Float.hashCode(this.d) + Float.hashCode(this.c) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("LineTo(x=");
            stringBuilder0.append(this.c);
            stringBuilder0.append(", y=");
            return a.n(stringBuilder0, this.d, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\r\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\bR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u0018\u001A\u0004\b\u001B\u0010\b¨\u0006\u001C"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "x", "y", "<init>", "(FF)V", "component1", "()F", "component2", "copy", "(FF)Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "F", "getX", "d", "getY", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class MoveTo extends PathNode {
        public final float c;
        public final float d;

        public MoveTo(float f, float f1) {
            super(false, false, 3, null);
            this.c = f;
            this.d = f1;
        }

        public final float component1() {
            return this.c;
        }

        public final float component2() {
            return this.d;
        }

        @NotNull
        public final MoveTo copy(float f, float f1) {
            return new MoveTo(f, f1);
        }

        public static MoveTo copy$default(MoveTo pathNode$MoveTo0, float f, float f1, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$MoveTo0.c;
            }
            if((v & 2) != 0) {
                f1 = pathNode$MoveTo0.d;
            }
            return pathNode$MoveTo0.copy(f, f1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof MoveTo)) {
                return false;
            }
            return Float.compare(this.c, ((MoveTo)object0).c) == 0 ? Float.compare(this.d, ((MoveTo)object0).d) == 0 : false;
        }

        public final float getX() {
            return this.c;
        }

        public final float getY() {
            return this.d;
        }

        @Override
        public int hashCode() {
            return Float.hashCode(this.d) + Float.hashCode(this.c) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("MoveTo(x=");
            stringBuilder0.append(this.c);
            stringBuilder0.append(", y=");
            return a.n(stringBuilder0, this.d, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\nJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0019\u001A\u00020\u00182\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001AR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\nR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001C\u001A\u0004\b\u001F\u0010\nR\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001C\u001A\u0004\b!\u0010\nR\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001C\u001A\u0004\b#\u0010\n¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "x1", "y1", "x2", "y2", "<init>", "(FFFF)V", "component1", "()F", "component2", "component3", "component4", "copy", "(FFFF)Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "F", "getX1", "d", "getY1", "e", "getX2", "f", "getY2", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class QuadTo extends PathNode {
        public final float c;
        public final float d;
        public final float e;
        public final float f;

        public QuadTo(float f, float f1, float f2, float f3) {
            super(false, true, 1, null);
            this.c = f;
            this.d = f1;
            this.e = f2;
            this.f = f3;
        }

        public final float component1() {
            return this.c;
        }

        public final float component2() {
            return this.d;
        }

        public final float component3() {
            return this.e;
        }

        public final float component4() {
            return this.f;
        }

        @NotNull
        public final QuadTo copy(float f, float f1, float f2, float f3) {
            return new QuadTo(f, f1, f2, f3);
        }

        public static QuadTo copy$default(QuadTo pathNode$QuadTo0, float f, float f1, float f2, float f3, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$QuadTo0.c;
            }
            if((v & 2) != 0) {
                f1 = pathNode$QuadTo0.d;
            }
            if((v & 4) != 0) {
                f2 = pathNode$QuadTo0.e;
            }
            if((v & 8) != 0) {
                f3 = pathNode$QuadTo0.f;
            }
            return pathNode$QuadTo0.copy(f, f1, f2, f3);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof QuadTo)) {
                return false;
            }
            if(Float.compare(this.c, ((QuadTo)object0).c) != 0) {
                return false;
            }
            if(Float.compare(this.d, ((QuadTo)object0).d) != 0) {
                return false;
            }
            return Float.compare(this.e, ((QuadTo)object0).e) == 0 ? Float.compare(this.f, ((QuadTo)object0).f) == 0 : false;
        }

        public final float getX1() {
            return this.c;
        }

        public final float getX2() {
            return this.e;
        }

        public final float getY1() {
            return this.d;
        }

        public final float getY2() {
            return this.f;
        }

        @Override
        public int hashCode() {
            return Float.hashCode(this.f) + a.b(this.e, a.b(this.d, Float.hashCode(this.c) * 0x1F, 0x1F), 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("QuadTo(x1=");
            stringBuilder0.append(this.c);
            stringBuilder0.append(", y1=");
            stringBuilder0.append(this.d);
            stringBuilder0.append(", x2=");
            stringBuilder0.append(this.e);
            stringBuilder0.append(", y2=");
            return a.n(stringBuilder0, this.f, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\nJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0019\u001A\u00020\u00182\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001AR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\nR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001C\u001A\u0004\b\u001F\u0010\nR\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001C\u001A\u0004\b!\u0010\nR\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001C\u001A\u0004\b#\u0010\n¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "x1", "y1", "x2", "y2", "<init>", "(FFFF)V", "component1", "()F", "component2", "component3", "component4", "copy", "(FFFF)Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "F", "getX1", "d", "getY1", "e", "getX2", "f", "getY2", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class ReflectiveCurveTo extends PathNode {
        public final float c;
        public final float d;
        public final float e;
        public final float f;

        public ReflectiveCurveTo(float f, float f1, float f2, float f3) {
            super(true, false, 2, null);
            this.c = f;
            this.d = f1;
            this.e = f2;
            this.f = f3;
        }

        public final float component1() {
            return this.c;
        }

        public final float component2() {
            return this.d;
        }

        public final float component3() {
            return this.e;
        }

        public final float component4() {
            return this.f;
        }

        @NotNull
        public final ReflectiveCurveTo copy(float f, float f1, float f2, float f3) {
            return new ReflectiveCurveTo(f, f1, f2, f3);
        }

        public static ReflectiveCurveTo copy$default(ReflectiveCurveTo pathNode$ReflectiveCurveTo0, float f, float f1, float f2, float f3, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$ReflectiveCurveTo0.c;
            }
            if((v & 2) != 0) {
                f1 = pathNode$ReflectiveCurveTo0.d;
            }
            if((v & 4) != 0) {
                f2 = pathNode$ReflectiveCurveTo0.e;
            }
            if((v & 8) != 0) {
                f3 = pathNode$ReflectiveCurveTo0.f;
            }
            return pathNode$ReflectiveCurveTo0.copy(f, f1, f2, f3);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ReflectiveCurveTo)) {
                return false;
            }
            if(Float.compare(this.c, ((ReflectiveCurveTo)object0).c) != 0) {
                return false;
            }
            if(Float.compare(this.d, ((ReflectiveCurveTo)object0).d) != 0) {
                return false;
            }
            return Float.compare(this.e, ((ReflectiveCurveTo)object0).e) == 0 ? Float.compare(this.f, ((ReflectiveCurveTo)object0).f) == 0 : false;
        }

        public final float getX1() {
            return this.c;
        }

        public final float getX2() {
            return this.e;
        }

        public final float getY1() {
            return this.d;
        }

        public final float getY2() {
            return this.f;
        }

        @Override
        public int hashCode() {
            return Float.hashCode(this.f) + a.b(this.e, a.b(this.d, Float.hashCode(this.c) * 0x1F, 0x1F), 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("ReflectiveCurveTo(x1=");
            stringBuilder0.append(this.c);
            stringBuilder0.append(", y1=");
            stringBuilder0.append(this.d);
            stringBuilder0.append(", x2=");
            stringBuilder0.append(this.e);
            stringBuilder0.append(", y2=");
            return a.n(stringBuilder0, this.f, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\r\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\bR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u0018\u001A\u0004\b\u001B\u0010\b¨\u0006\u001C"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "x", "y", "<init>", "(FF)V", "component1", "()F", "component2", "copy", "(FF)Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "F", "getX", "d", "getY", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class ReflectiveQuadTo extends PathNode {
        public final float c;
        public final float d;

        public ReflectiveQuadTo(float f, float f1) {
            super(false, true, 1, null);
            this.c = f;
            this.d = f1;
        }

        public final float component1() {
            return this.c;
        }

        public final float component2() {
            return this.d;
        }

        @NotNull
        public final ReflectiveQuadTo copy(float f, float f1) {
            return new ReflectiveQuadTo(f, f1);
        }

        public static ReflectiveQuadTo copy$default(ReflectiveQuadTo pathNode$ReflectiveQuadTo0, float f, float f1, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$ReflectiveQuadTo0.c;
            }
            if((v & 2) != 0) {
                f1 = pathNode$ReflectiveQuadTo0.d;
            }
            return pathNode$ReflectiveQuadTo0.copy(f, f1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ReflectiveQuadTo)) {
                return false;
            }
            return Float.compare(this.c, ((ReflectiveQuadTo)object0).c) == 0 ? Float.compare(this.d, ((ReflectiveQuadTo)object0).d) == 0 : false;
        }

        public final float getX() {
            return this.c;
        }

        public final float getY() {
            return this.d;
        }

        @Override
        public int hashCode() {
            return Float.hashCode(this.d) + Float.hashCode(this.c) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("ReflectiveQuadTo(x=");
            stringBuilder0.append(this.c);
            stringBuilder0.append(", y=");
            return a.n(stringBuilder0, this.d, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0011\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\u0002\u0012\u0006\u0010\n\u001A\u00020\u0002\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u000F\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0010\u0010\u000EJ\u0010\u0010\u0011\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u000EJ\u0010\u0010\u0015\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u000EJV\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\u0002H\u00C6\u0001\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001A\u00020\u0018H\u00D6\u0001\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0010\u0010\u001C\u001A\u00020\u001BH\u00D6\u0001\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u001A\u0010 \u001A\u00020\u00062\b\u0010\u001F\u001A\u0004\u0018\u00010\u001EH\u00D6\u0003\u00A2\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010\u000ER\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b%\u0010#\u001A\u0004\b&\u0010\u000ER\u0017\u0010\u0005\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\'\u0010#\u001A\u0004\b(\u0010\u000ER\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b\u0007\u0010\u0012R\u0017\u0010\b\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b+\u0010*\u001A\u0004\b\b\u0010\u0012R\u0017\u0010\t\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b,\u0010#\u001A\u0004\b-\u0010\u000ER\u0017\u0010\n\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b.\u0010#\u001A\u0004\b/\u0010\u000E\u00A8\u00060"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "horizontalEllipseRadius", "verticalEllipseRadius", "theta", "", "isMoreThanHalf", "isPositiveArc", "arcStartDx", "arcStartDy", "<init>", "(FFFZZFF)V", "component1", "()F", "component2", "component3", "component4", "()Z", "component5", "component6", "component7", "copy", "(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "F", "getHorizontalEllipseRadius", "d", "getVerticalEllipseRadius", "e", "getTheta", "f", "Z", "g", "h", "getArcStartDx", "i", "getArcStartDy", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class RelativeArcTo extends PathNode {
        public final float c;
        public final float d;
        public final float e;
        public final boolean f;
        public final boolean g;
        public final float h;
        public final float i;

        public RelativeArcTo(float f, float f1, float f2, boolean z, boolean z1, float f3, float f4) {
            super(false, false, 3, null);
            this.c = f;
            this.d = f1;
            this.e = f2;
            this.f = z;
            this.g = z1;
            this.h = f3;
            this.i = f4;
        }

        public final float component1() {
            return this.c;
        }

        public final float component2() {
            return this.d;
        }

        public final float component3() {
            return this.e;
        }

        public final boolean component4() {
            return this.f;
        }

        public final boolean component5() {
            return this.g;
        }

        public final float component6() {
            return this.h;
        }

        public final float component7() {
            return this.i;
        }

        @NotNull
        public final RelativeArcTo copy(float f, float f1, float f2, boolean z, boolean z1, float f3, float f4) {
            return new RelativeArcTo(f, f1, f2, z, z1, f3, f4);
        }

        public static RelativeArcTo copy$default(RelativeArcTo pathNode$RelativeArcTo0, float f, float f1, float f2, boolean z, boolean z1, float f3, float f4, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$RelativeArcTo0.c;
            }
            if((v & 2) != 0) {
                f1 = pathNode$RelativeArcTo0.d;
            }
            if((v & 4) != 0) {
                f2 = pathNode$RelativeArcTo0.e;
            }
            if((v & 8) != 0) {
                z = pathNode$RelativeArcTo0.f;
            }
            if((v & 16) != 0) {
                z1 = pathNode$RelativeArcTo0.g;
            }
            if((v & 0x20) != 0) {
                f3 = pathNode$RelativeArcTo0.h;
            }
            if((v & 0x40) != 0) {
                f4 = pathNode$RelativeArcTo0.i;
            }
            return pathNode$RelativeArcTo0.copy(f, f1, f2, z, z1, f3, f4);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RelativeArcTo)) {
                return false;
            }
            if(Float.compare(this.c, ((RelativeArcTo)object0).c) != 0) {
                return false;
            }
            if(Float.compare(this.d, ((RelativeArcTo)object0).d) != 0) {
                return false;
            }
            if(Float.compare(this.e, ((RelativeArcTo)object0).e) != 0) {
                return false;
            }
            if(this.f != ((RelativeArcTo)object0).f) {
                return false;
            }
            if(this.g != ((RelativeArcTo)object0).g) {
                return false;
            }
            return Float.compare(this.h, ((RelativeArcTo)object0).h) == 0 ? Float.compare(this.i, ((RelativeArcTo)object0).i) == 0 : false;
        }

        public final float getArcStartDx() {
            return this.h;
        }

        public final float getArcStartDy() {
            return this.i;
        }

        public final float getHorizontalEllipseRadius() {
            return this.c;
        }

        public final float getTheta() {
            return this.e;
        }

        public final float getVerticalEllipseRadius() {
            return this.d;
        }

        @Override
        public int hashCode() {
            return Float.hashCode(this.i) + a.b(this.h, a.e(a.e(a.b(this.e, a.b(this.d, Float.hashCode(this.c) * 0x1F, 0x1F), 0x1F), 0x1F, this.f), 0x1F, this.g), 0x1F);
        }

        public final boolean isMoreThanHalf() {
            return this.f;
        }

        public final boolean isPositiveArc() {
            return this.g;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
            stringBuilder0.append(this.c);
            stringBuilder0.append(", verticalEllipseRadius=");
            stringBuilder0.append(this.d);
            stringBuilder0.append(", theta=");
            stringBuilder0.append(this.e);
            stringBuilder0.append(", isMoreThanHalf=");
            stringBuilder0.append(this.f);
            stringBuilder0.append(", isPositiveArc=");
            stringBuilder0.append(this.g);
            stringBuilder0.append(", arcStartDx=");
            stringBuilder0.append(this.h);
            stringBuilder0.append(", arcStartDy=");
            return a.n(stringBuilder0, this.i, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0002\u00A2\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000E\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u000E\u0010\fJ\u0010\u0010\u000F\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u000F\u0010\fJ\u0010\u0010\u0010\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u0002H\u00C6\u0001\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001A\u00020\u0014H\u00D6\u0001\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001A\u00020\u0017H\u00D6\u0001\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u001A\u0010\u001D\u001A\u00020\u001C2\b\u0010\u001B\u001A\u0004\u0018\u00010\u001AH\u00D6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001ER\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\fR\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\"\u0010 \u001A\u0004\b#\u0010\fR\u0017\u0010\u0005\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b$\u0010 \u001A\u0004\b%\u0010\fR\u0017\u0010\u0006\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b&\u0010 \u001A\u0004\b\'\u0010\fR\u0017\u0010\u0007\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b(\u0010 \u001A\u0004\b)\u0010\fR\u0017\u0010\b\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b*\u0010 \u001A\u0004\b+\u0010\f\u00A8\u0006,"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "dx1", "dy1", "dx2", "dy2", "dx3", "dy3", "<init>", "(FFFFFF)V", "component1", "()F", "component2", "component3", "component4", "component5", "component6", "copy", "(FFFFFF)Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "F", "getDx1", "d", "getDy1", "e", "getDx2", "f", "getDy2", "g", "getDx3", "h", "getDy3", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class RelativeCurveTo extends PathNode {
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public final float h;

        public RelativeCurveTo(float f, float f1, float f2, float f3, float f4, float f5) {
            super(true, false, 2, null);
            this.c = f;
            this.d = f1;
            this.e = f2;
            this.f = f3;
            this.g = f4;
            this.h = f5;
        }

        public final float component1() {
            return this.c;
        }

        public final float component2() {
            return this.d;
        }

        public final float component3() {
            return this.e;
        }

        public final float component4() {
            return this.f;
        }

        public final float component5() {
            return this.g;
        }

        public final float component6() {
            return this.h;
        }

        @NotNull
        public final RelativeCurveTo copy(float f, float f1, float f2, float f3, float f4, float f5) {
            return new RelativeCurveTo(f, f1, f2, f3, f4, f5);
        }

        public static RelativeCurveTo copy$default(RelativeCurveTo pathNode$RelativeCurveTo0, float f, float f1, float f2, float f3, float f4, float f5, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$RelativeCurveTo0.c;
            }
            if((v & 2) != 0) {
                f1 = pathNode$RelativeCurveTo0.d;
            }
            if((v & 4) != 0) {
                f2 = pathNode$RelativeCurveTo0.e;
            }
            if((v & 8) != 0) {
                f3 = pathNode$RelativeCurveTo0.f;
            }
            if((v & 16) != 0) {
                f4 = pathNode$RelativeCurveTo0.g;
            }
            if((v & 0x20) != 0) {
                f5 = pathNode$RelativeCurveTo0.h;
            }
            return pathNode$RelativeCurveTo0.copy(f, f1, f2, f3, f4, f5);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RelativeCurveTo)) {
                return false;
            }
            if(Float.compare(this.c, ((RelativeCurveTo)object0).c) != 0) {
                return false;
            }
            if(Float.compare(this.d, ((RelativeCurveTo)object0).d) != 0) {
                return false;
            }
            if(Float.compare(this.e, ((RelativeCurveTo)object0).e) != 0) {
                return false;
            }
            if(Float.compare(this.f, ((RelativeCurveTo)object0).f) != 0) {
                return false;
            }
            return Float.compare(this.g, ((RelativeCurveTo)object0).g) == 0 ? Float.compare(this.h, ((RelativeCurveTo)object0).h) == 0 : false;
        }

        public final float getDx1() {
            return this.c;
        }

        public final float getDx2() {
            return this.e;
        }

        public final float getDx3() {
            return this.g;
        }

        public final float getDy1() {
            return this.d;
        }

        public final float getDy2() {
            return this.f;
        }

        public final float getDy3() {
            return this.h;
        }

        @Override
        public int hashCode() {
            return Float.hashCode(this.h) + a.b(this.g, a.b(this.f, a.b(this.e, a.b(this.d, Float.hashCode(this.c) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("RelativeCurveTo(dx1=");
            stringBuilder0.append(this.c);
            stringBuilder0.append(", dy1=");
            stringBuilder0.append(this.d);
            stringBuilder0.append(", dx2=");
            stringBuilder0.append(this.e);
            stringBuilder0.append(", dy2=");
            stringBuilder0.append(this.f);
            stringBuilder0.append(", dx3=");
            stringBuilder0.append(this.g);
            stringBuilder0.append(", dy3=");
            return a.n(stringBuilder0, this.h, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "dx", "<init>", "(F)V", "component1", "()F", "copy", "(F)Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "F", "getDx", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class RelativeHorizontalTo extends PathNode {
        public final float c;

        public RelativeHorizontalTo(float f) {
            super(false, false, 3, null);
            this.c = f;
        }

        public final float component1() {
            return this.c;
        }

        @NotNull
        public final RelativeHorizontalTo copy(float f) {
            return new RelativeHorizontalTo(f);
        }

        public static RelativeHorizontalTo copy$default(RelativeHorizontalTo pathNode$RelativeHorizontalTo0, float f, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$RelativeHorizontalTo0.c;
            }
            return pathNode$RelativeHorizontalTo0.copy(f);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof RelativeHorizontalTo ? Float.compare(this.c, ((RelativeHorizontalTo)object0).c) == 0 : false;
        }

        public final float getDx() {
            return this.c;
        }

        @Override
        public int hashCode() {
            return Float.hashCode(this.c);
        }

        @Override
        @NotNull
        public String toString() {
            return a.n(new StringBuilder("RelativeHorizontalTo(dx="), this.c, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\r\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\bR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u0018\u001A\u0004\b\u001B\u0010\b¨\u0006\u001C"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "dx", "dy", "<init>", "(FF)V", "component1", "()F", "component2", "copy", "(FF)Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "F", "getDx", "d", "getDy", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class RelativeLineTo extends PathNode {
        public final float c;
        public final float d;

        public RelativeLineTo(float f, float f1) {
            super(false, false, 3, null);
            this.c = f;
            this.d = f1;
        }

        public final float component1() {
            return this.c;
        }

        public final float component2() {
            return this.d;
        }

        @NotNull
        public final RelativeLineTo copy(float f, float f1) {
            return new RelativeLineTo(f, f1);
        }

        public static RelativeLineTo copy$default(RelativeLineTo pathNode$RelativeLineTo0, float f, float f1, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$RelativeLineTo0.c;
            }
            if((v & 2) != 0) {
                f1 = pathNode$RelativeLineTo0.d;
            }
            return pathNode$RelativeLineTo0.copy(f, f1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RelativeLineTo)) {
                return false;
            }
            return Float.compare(this.c, ((RelativeLineTo)object0).c) == 0 ? Float.compare(this.d, ((RelativeLineTo)object0).d) == 0 : false;
        }

        public final float getDx() {
            return this.c;
        }

        public final float getDy() {
            return this.d;
        }

        @Override
        public int hashCode() {
            return Float.hashCode(this.d) + Float.hashCode(this.c) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("RelativeLineTo(dx=");
            stringBuilder0.append(this.c);
            stringBuilder0.append(", dy=");
            return a.n(stringBuilder0, this.d, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\r\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\bR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u0018\u001A\u0004\b\u001B\u0010\b¨\u0006\u001C"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "dx", "dy", "<init>", "(FF)V", "component1", "()F", "component2", "copy", "(FF)Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "F", "getDx", "d", "getDy", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class RelativeMoveTo extends PathNode {
        public final float c;
        public final float d;

        public RelativeMoveTo(float f, float f1) {
            super(false, false, 3, null);
            this.c = f;
            this.d = f1;
        }

        public final float component1() {
            return this.c;
        }

        public final float component2() {
            return this.d;
        }

        @NotNull
        public final RelativeMoveTo copy(float f, float f1) {
            return new RelativeMoveTo(f, f1);
        }

        public static RelativeMoveTo copy$default(RelativeMoveTo pathNode$RelativeMoveTo0, float f, float f1, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$RelativeMoveTo0.c;
            }
            if((v & 2) != 0) {
                f1 = pathNode$RelativeMoveTo0.d;
            }
            return pathNode$RelativeMoveTo0.copy(f, f1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RelativeMoveTo)) {
                return false;
            }
            return Float.compare(this.c, ((RelativeMoveTo)object0).c) == 0 ? Float.compare(this.d, ((RelativeMoveTo)object0).d) == 0 : false;
        }

        public final float getDx() {
            return this.c;
        }

        public final float getDy() {
            return this.d;
        }

        @Override
        public int hashCode() {
            return Float.hashCode(this.d) + Float.hashCode(this.c) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("RelativeMoveTo(dx=");
            stringBuilder0.append(this.c);
            stringBuilder0.append(", dy=");
            return a.n(stringBuilder0, this.d, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\nJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0019\u001A\u00020\u00182\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001AR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\nR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001C\u001A\u0004\b\u001F\u0010\nR\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001C\u001A\u0004\b!\u0010\nR\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001C\u001A\u0004\b#\u0010\n¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "dx1", "dy1", "dx2", "dy2", "<init>", "(FFFF)V", "component1", "()F", "component2", "component3", "component4", "copy", "(FFFF)Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "F", "getDx1", "d", "getDy1", "e", "getDx2", "f", "getDy2", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class RelativeQuadTo extends PathNode {
        public final float c;
        public final float d;
        public final float e;
        public final float f;

        public RelativeQuadTo(float f, float f1, float f2, float f3) {
            super(false, true, 1, null);
            this.c = f;
            this.d = f1;
            this.e = f2;
            this.f = f3;
        }

        public final float component1() {
            return this.c;
        }

        public final float component2() {
            return this.d;
        }

        public final float component3() {
            return this.e;
        }

        public final float component4() {
            return this.f;
        }

        @NotNull
        public final RelativeQuadTo copy(float f, float f1, float f2, float f3) {
            return new RelativeQuadTo(f, f1, f2, f3);
        }

        public static RelativeQuadTo copy$default(RelativeQuadTo pathNode$RelativeQuadTo0, float f, float f1, float f2, float f3, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$RelativeQuadTo0.c;
            }
            if((v & 2) != 0) {
                f1 = pathNode$RelativeQuadTo0.d;
            }
            if((v & 4) != 0) {
                f2 = pathNode$RelativeQuadTo0.e;
            }
            if((v & 8) != 0) {
                f3 = pathNode$RelativeQuadTo0.f;
            }
            return pathNode$RelativeQuadTo0.copy(f, f1, f2, f3);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RelativeQuadTo)) {
                return false;
            }
            if(Float.compare(this.c, ((RelativeQuadTo)object0).c) != 0) {
                return false;
            }
            if(Float.compare(this.d, ((RelativeQuadTo)object0).d) != 0) {
                return false;
            }
            return Float.compare(this.e, ((RelativeQuadTo)object0).e) == 0 ? Float.compare(this.f, ((RelativeQuadTo)object0).f) == 0 : false;
        }

        public final float getDx1() {
            return this.c;
        }

        public final float getDx2() {
            return this.e;
        }

        public final float getDy1() {
            return this.d;
        }

        public final float getDy2() {
            return this.f;
        }

        @Override
        public int hashCode() {
            return Float.hashCode(this.f) + a.b(this.e, a.b(this.d, Float.hashCode(this.c) * 0x1F, 0x1F), 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("RelativeQuadTo(dx1=");
            stringBuilder0.append(this.c);
            stringBuilder0.append(", dy1=");
            stringBuilder0.append(this.d);
            stringBuilder0.append(", dx2=");
            stringBuilder0.append(this.e);
            stringBuilder0.append(", dy2=");
            return a.n(stringBuilder0, this.f, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\nJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0019\u001A\u00020\u00182\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001AR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\nR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001C\u001A\u0004\b\u001F\u0010\nR\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001C\u001A\u0004\b!\u0010\nR\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001C\u001A\u0004\b#\u0010\n¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "dx1", "dy1", "dx2", "dy2", "<init>", "(FFFF)V", "component1", "()F", "component2", "component3", "component4", "copy", "(FFFF)Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "F", "getDx1", "d", "getDy1", "e", "getDx2", "f", "getDy2", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class RelativeReflectiveCurveTo extends PathNode {
        public final float c;
        public final float d;
        public final float e;
        public final float f;

        public RelativeReflectiveCurveTo(float f, float f1, float f2, float f3) {
            super(true, false, 2, null);
            this.c = f;
            this.d = f1;
            this.e = f2;
            this.f = f3;
        }

        public final float component1() {
            return this.c;
        }

        public final float component2() {
            return this.d;
        }

        public final float component3() {
            return this.e;
        }

        public final float component4() {
            return this.f;
        }

        @NotNull
        public final RelativeReflectiveCurveTo copy(float f, float f1, float f2, float f3) {
            return new RelativeReflectiveCurveTo(f, f1, f2, f3);
        }

        public static RelativeReflectiveCurveTo copy$default(RelativeReflectiveCurveTo pathNode$RelativeReflectiveCurveTo0, float f, float f1, float f2, float f3, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$RelativeReflectiveCurveTo0.c;
            }
            if((v & 2) != 0) {
                f1 = pathNode$RelativeReflectiveCurveTo0.d;
            }
            if((v & 4) != 0) {
                f2 = pathNode$RelativeReflectiveCurveTo0.e;
            }
            if((v & 8) != 0) {
                f3 = pathNode$RelativeReflectiveCurveTo0.f;
            }
            return pathNode$RelativeReflectiveCurveTo0.copy(f, f1, f2, f3);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RelativeReflectiveCurveTo)) {
                return false;
            }
            if(Float.compare(this.c, ((RelativeReflectiveCurveTo)object0).c) != 0) {
                return false;
            }
            if(Float.compare(this.d, ((RelativeReflectiveCurveTo)object0).d) != 0) {
                return false;
            }
            return Float.compare(this.e, ((RelativeReflectiveCurveTo)object0).e) == 0 ? Float.compare(this.f, ((RelativeReflectiveCurveTo)object0).f) == 0 : false;
        }

        public final float getDx1() {
            return this.c;
        }

        public final float getDx2() {
            return this.e;
        }

        public final float getDy1() {
            return this.d;
        }

        public final float getDy2() {
            return this.f;
        }

        @Override
        public int hashCode() {
            return Float.hashCode(this.f) + a.b(this.e, a.b(this.d, Float.hashCode(this.c) * 0x1F, 0x1F), 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
            stringBuilder0.append(this.c);
            stringBuilder0.append(", dy1=");
            stringBuilder0.append(this.d);
            stringBuilder0.append(", dx2=");
            stringBuilder0.append(this.e);
            stringBuilder0.append(", dy2=");
            return a.n(stringBuilder0, this.f, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\r\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\bR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u0018\u001A\u0004\b\u001B\u0010\b¨\u0006\u001C"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "dx", "dy", "<init>", "(FF)V", "component1", "()F", "component2", "copy", "(FF)Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "F", "getDx", "d", "getDy", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class RelativeReflectiveQuadTo extends PathNode {
        public final float c;
        public final float d;

        public RelativeReflectiveQuadTo(float f, float f1) {
            super(false, true, 1, null);
            this.c = f;
            this.d = f1;
        }

        public final float component1() {
            return this.c;
        }

        public final float component2() {
            return this.d;
        }

        @NotNull
        public final RelativeReflectiveQuadTo copy(float f, float f1) {
            return new RelativeReflectiveQuadTo(f, f1);
        }

        public static RelativeReflectiveQuadTo copy$default(RelativeReflectiveQuadTo pathNode$RelativeReflectiveQuadTo0, float f, float f1, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$RelativeReflectiveQuadTo0.c;
            }
            if((v & 2) != 0) {
                f1 = pathNode$RelativeReflectiveQuadTo0.d;
            }
            return pathNode$RelativeReflectiveQuadTo0.copy(f, f1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RelativeReflectiveQuadTo)) {
                return false;
            }
            return Float.compare(this.c, ((RelativeReflectiveQuadTo)object0).c) == 0 ? Float.compare(this.d, ((RelativeReflectiveQuadTo)object0).d) == 0 : false;
        }

        public final float getDx() {
            return this.c;
        }

        public final float getDy() {
            return this.d;
        }

        @Override
        public int hashCode() {
            return Float.hashCode(this.d) + Float.hashCode(this.c) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("RelativeReflectiveQuadTo(dx=");
            stringBuilder0.append(this.c);
            stringBuilder0.append(", dy=");
            return a.n(stringBuilder0, this.d, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "dy", "<init>", "(F)V", "component1", "()F", "copy", "(F)Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "F", "getDy", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class RelativeVerticalTo extends PathNode {
        public final float c;

        public RelativeVerticalTo(float f) {
            super(false, false, 3, null);
            this.c = f;
        }

        public final float component1() {
            return this.c;
        }

        @NotNull
        public final RelativeVerticalTo copy(float f) {
            return new RelativeVerticalTo(f);
        }

        public static RelativeVerticalTo copy$default(RelativeVerticalTo pathNode$RelativeVerticalTo0, float f, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$RelativeVerticalTo0.c;
            }
            return pathNode$RelativeVerticalTo0.copy(f);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof RelativeVerticalTo ? Float.compare(this.c, ((RelativeVerticalTo)object0).c) == 0 : false;
        }

        public final float getDy() {
            return this.c;
        }

        @Override
        public int hashCode() {
            return Float.hashCode(this.c);
        }

        @Override
        @NotNull
        public String toString() {
            return a.n(new StringBuilder("RelativeVerticalTo(dy="), this.c, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "y", "<init>", "(F)V", "component1", "()F", "copy", "(F)Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "F", "getY", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class VerticalTo extends PathNode {
        public final float c;

        public VerticalTo(float f) {
            super(false, false, 3, null);
            this.c = f;
        }

        public final float component1() {
            return this.c;
        }

        @NotNull
        public final VerticalTo copy(float f) {
            return new VerticalTo(f);
        }

        public static VerticalTo copy$default(VerticalTo pathNode$VerticalTo0, float f, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$VerticalTo0.c;
            }
            return pathNode$VerticalTo0.copy(f);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof VerticalTo ? Float.compare(this.c, ((VerticalTo)object0).c) == 0 : false;
        }

        public final float getY() {
            return this.c;
        }

        @Override
        public int hashCode() {
            return Float.hashCode(this.c);
        }

        @Override
        @NotNull
        public String toString() {
            return a.n(new StringBuilder("VerticalTo(y="), this.c, ')');
        }
    }

    public final boolean a;
    public final boolean b;

    public PathNode(boolean z, boolean z1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            z = false;
        }
        if((v & 2) != 0) {
            z1 = false;
        }
        this(z, z1, null);
    }

    public PathNode(boolean z, boolean z1, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = z;
        this.b = z1;
    }

    public final boolean isCurve() {
        return this.a;
    }

    public final boolean isQuad() {
        return this.b;
    }
}

