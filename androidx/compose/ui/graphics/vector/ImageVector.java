package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b*\b\u0007\u0018\u0000 :2\u00020\u0001:\u0002;:B[\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\t\u001A\u00020\u0007\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000F\u001A\u00020\u000E\u0012\u0006\u0010\u0011\u001A\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001A\u00020\u0012\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0017\u001A\u00020\u00102\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u000F\u0010\u0019\u001A\u00020\u0012H\u0016\u00A2\u0006\u0004\b\u0019\u0010\u001AR\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001ER\u001D\u0010\u0005\u001A\u00020\u00048\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"R\u001D\u0010\u0006\u001A\u00020\u00048\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b#\u0010 \u001A\u0004\b$\u0010\"R\u0017\u0010\b\u001A\u00020\u00078\u0006\u00A2\u0006\f\n\u0004\b%\u0010 \u001A\u0004\b&\u0010\"R\u0017\u0010\t\u001A\u00020\u00078\u0006\u00A2\u0006\f\n\u0004\b\'\u0010 \u001A\u0004\b(\u0010\"R\u0017\u0010\u000B\u001A\u00020\n8\u0006\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010,R\u001D\u0010\r\u001A\u00020\f8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b/\u00100R\u001D\u0010\u000F\u001A\u00020\u000E8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b1\u00102\u001A\u0004\b3\u0010\u001AR\u0017\u0010\u0011\u001A\u00020\u00108\u0006\u00A2\u0006\f\n\u0004\b4\u00105\u001A\u0004\b6\u00107R\u001A\u0010\u0013\u001A\u00020\u00128\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b8\u00102\u001A\u0004\b9\u0010\u001A\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006<"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", "", "", "name", "Landroidx/compose/ui/unit/Dp;", "defaultWidth", "defaultHeight", "", "viewportWidth", "viewportHeight", "Landroidx/compose/ui/graphics/vector/VectorGroup;", "root", "Landroidx/compose/ui/graphics/Color;", "tintColor", "Landroidx/compose/ui/graphics/BlendMode;", "tintBlendMode", "", "autoMirror", "", "genId", "<init>", "(Ljava/lang/String;FFFFLandroidx/compose/ui/graphics/vector/VectorGroup;JIZILkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "F", "getDefaultWidth-D9Ej5fM", "()F", "c", "getDefaultHeight-D9Ej5fM", "d", "getViewportWidth", "e", "getViewportHeight", "f", "Landroidx/compose/ui/graphics/vector/VectorGroup;", "getRoot", "()Landroidx/compose/ui/graphics/vector/VectorGroup;", "g", "J", "getTintColor-0d7_KjU", "()J", "h", "I", "getTintBlendMode-0nO6VwU", "i", "Z", "getAutoMirror", "()Z", "j", "getGenId$ui_release", "Companion", "Builder", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ImageVector {
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000B\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u00018BO\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\t\u001A\u00020\u0007\u0012\b\b\u0002\u0010\u000B\u001A\u00020\n\u0012\b\b\u0002\u0010\r\u001A\u00020\f\u0012\b\b\u0002\u0010\u000F\u001A\u00020\u000E\u00A2\u0006\u0004\b\u0010\u0010\u0011BG\b\u0017\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\t\u001A\u00020\u0007\u0012\b\b\u0002\u0010\u000B\u001A\u00020\n\u0012\b\b\u0002\u0010\r\u001A\u00020\f\u00A2\u0006\u0004\b\u0010\u0010\u0012Jm\u0010\u001D\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0013\u001A\u00020\u00072\b\b\u0002\u0010\u0014\u001A\u00020\u00072\b\b\u0002\u0010\u0015\u001A\u00020\u00072\b\b\u0002\u0010\u0016\u001A\u00020\u00072\b\b\u0002\u0010\u0017\u001A\u00020\u00072\b\b\u0002\u0010\u0018\u001A\u00020\u00072\b\b\u0002\u0010\u0019\u001A\u00020\u00072\u000E\b\u0002\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u001B0\u001A\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\r\u0010\u001F\u001A\u00020\u0000\u00A2\u0006\u0004\b\u001F\u0010 J\u00A4\u0001\u00104\u001A\u00020\u00002\f\u0010!\u001A\b\u0012\u0004\u0012\u00020\u001B0\u001A2\b\b\u0002\u0010#\u001A\u00020\"2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010%\u001A\u0004\u0018\u00010$2\b\b\u0002\u0010&\u001A\u00020\u00072\n\b\u0002\u0010\'\u001A\u0004\u0018\u00010$2\b\b\u0002\u0010(\u001A\u00020\u00072\b\b\u0002\u0010)\u001A\u00020\u00072\b\b\u0002\u0010+\u001A\u00020*2\b\b\u0002\u0010-\u001A\u00020,2\b\b\u0002\u0010.\u001A\u00020\u00072\b\b\u0002\u0010/\u001A\u00020\u00072\b\b\u0002\u00100\u001A\u00020\u00072\b\b\u0002\u00101\u001A\u00020\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b2\u00103J\r\u00106\u001A\u000205\u00A2\u0006\u0004\b6\u00107\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u00069"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "", "", "name", "Landroidx/compose/ui/unit/Dp;", "defaultWidth", "defaultHeight", "", "viewportWidth", "viewportHeight", "Landroidx/compose/ui/graphics/Color;", "tintColor", "Landroidx/compose/ui/graphics/BlendMode;", "tintBlendMode", "", "autoMirror", "<init>", "(Ljava/lang/String;FFFFJIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;FFFFJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "rotate", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "clipPathData", "addGroup", "(Ljava/lang/String;FFFFFFFLjava/util/List;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "clearGroup", "()Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "pathData", "Landroidx/compose/ui/graphics/PathFillType;", "pathFillType", "Landroidx/compose/ui/graphics/Brush;", "fill", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineJoin", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "addPath-oIyEayM", "(Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFF)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "addPath", "Landroidx/compose/ui/graphics/vector/ImageVector;", "build", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "androidx/compose/ui/graphics/vector/a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nImageVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVector$Builder\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,783:1\n42#2,7:784\n*S KotlinDebug\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVector$Builder\n*L\n369#1:784,7\n*E\n"})
    public static final class Builder {
        public static final int $stable = 8;
        public final String a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final long f;
        public final int g;
        public final boolean h;
        public final ArrayList i;
        public final a j;
        public boolean k;

        // 去混淆评级： 低(20)
        public Builder(String s, float f, float f1, float f2, float f3, long v, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
            this(((v2 & 1) == 0 ? s : ""), f, f1, f2, f3, ((v2 & 0x20) == 0 ? v : 0L), ((v2 & 0x40) == 0 ? v1 : 5), null);
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replace with ImageVector.Builder that consumes an optional auto mirror parameter", replaceWith = @ReplaceWith(expression = "Builder(name, defaultWidth, defaultHeight, viewportWidth, viewportHeight, tintColor, tintBlendMode, false)", imports = {"androidx.compose.ui.graphics.vector"}))
        public Builder(String s, float f, float f1, float f2, float f3, long v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            this(s, f, f1, f2, f3, v, v1, false, null);
        }

        // 去混淆评级： 低(20)
        public Builder(String s, float f, float f1, float f2, float f3, long v, int v1, boolean z, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
            this(((v2 & 1) == 0 ? s : ""), f, f1, f2, f3, ((v2 & 0x20) == 0 ? v : 0L), ((v2 & 0x40) == 0 ? v1 : 5), ((v2 & 0x80) == 0 ? z : false), null);
        }

        public Builder(String s, float f, float f1, float f2, float f3, long v, int v1, boolean z, DefaultConstructorMarker defaultConstructorMarker0) {
            this.a = s;
            this.b = f;
            this.c = f1;
            this.d = f2;
            this.e = f3;
            this.f = v;
            this.g = v1;
            this.h = z;
            ArrayList arrayList0 = new ArrayList();
            this.i = arrayList0;
            a a0 = new a(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 0x3FF);
            this.j = a0;
            ImageVectorKt.access$push(arrayList0, a0);
        }

        @NotNull
        public final Builder addGroup(@NotNull String s, float f, float f1, float f2, float f3, float f4, float f5, float f6, @NotNull List list0) {
            if(this.k) {
                InlineClassHelperKt.throwIllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            a a0 = new a(s, f, f1, f2, f3, f4, f5, f6, list0, 0x200);
            ImageVectorKt.access$push(this.i, a0);
            return this;
        }

        public static Builder addGroup$default(Builder imageVector$Builder0, String s, float f, float f1, float f2, float f3, float f4, float f5, float f6, List list0, int v, Object object0) {
            String s1 = (v & 1) == 0 ? s : "";
            float f7 = 0.0f;
            float f8 = (v & 2) == 0 ? f : 0.0f;
            float f9 = (v & 4) == 0 ? f1 : 0.0f;
            float f10 = (v & 8) == 0 ? f2 : 0.0f;
            float f11 = 1.0f;
            float f12 = (v & 16) == 0 ? f3 : 1.0f;
            if((v & 0x20) == 0) {
                f11 = f4;
            }
            float f13 = (v & 0x40) == 0 ? f5 : 0.0f;
            if((v & 0x80) == 0) {
                f7 = f6;
            }
            return (v & 0x100) == 0 ? imageVector$Builder0.addGroup(s1, f8, f9, f10, f12, f11, f13, f7, list0) : imageVector$Builder0.addGroup(s1, f8, f9, f10, f12, f11, f13, f7, VectorKt.getEmptyPath());
        }

        @NotNull
        public final Builder addPath-oIyEayM(@NotNull List list0, int v, @NotNull String s, @Nullable Brush brush0, float f, @Nullable Brush brush1, float f1, float f2, int v1, int v2, float f3, float f4, float f5, float f6) {
            if(this.k) {
                InlineClassHelperKt.throwIllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            ((a)ImageVectorKt.access$peek(this.i)).j.add(new VectorPath(s, list0, v, brush0, f, brush1, f1, f2, v1, v2, f3, f4, f5, f6, null));
            return this;
        }

        public static Builder addPath-oIyEayM$default(Builder imageVector$Builder0, List list0, int v, String s, Brush brush0, float f, Brush brush1, float f1, float f2, int v1, int v2, float f3, float f4, float f5, float f6, int v3, Object object0) {
            Brush brush2 = null;
            float f7 = 1.0f;
            if((v3 & 0x20) == 0) {
                brush2 = brush1;
            }
            float f8 = 0.0f;
            if((v3 & 0x1000) == 0) {
                f7 = f5;
            }
            if((v3 & 0x2000) == 0) {
                f8 = f6;
            }
            return imageVector$Builder0.addPath-oIyEayM(list0, ((v3 & 2) == 0 ? v : 0), ((v3 & 4) == 0 ? s : ""), ((v3 & 8) == 0 ? brush0 : null), ((v3 & 16) == 0 ? f : 1.0f), brush2, ((v3 & 0x40) == 0 ? f1 : 1.0f), ((v3 & 0x80) == 0 ? f2 : 0.0f), ((v3 & 0x100) == 0 ? v1 : 0), ((v3 & 0x200) == 0 ? v2 : 0), ((v3 & 0x400) == 0 ? f3 : 4.0f), ((v3 & 0x800) == 0 ? f4 : 0.0f), f7, f8);
        }

        @NotNull
        public final ImageVector build() {
            if(this.k) {
                InlineClassHelperKt.throwIllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            while(this.i.size() > 1) {
                this.clearGroup();
            }
            VectorGroup vectorGroup0 = new VectorGroup(this.j.a, this.j.b, this.j.c, this.j.d, this.j.e, this.j.f, this.j.g, this.j.h, this.j.i, this.j.j);
            ImageVector imageVector0 = new ImageVector(this.a, this.b, this.c, this.d, this.e, vectorGroup0, this.f, this.g, this.h, 0, 0x200, null);
            this.k = true;
            return imageVector0;
        }

        @NotNull
        public final Builder clearGroup() {
            if(this.k) {
                InlineClassHelperKt.throwIllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            a a0 = (a)ImageVectorKt.access$pop(this.i);
            ((a)ImageVectorKt.access$peek(this.i)).j.add(new VectorGroup(a0.a, a0.b, a0.c, a0.d, a0.e, a0.f, a0.g, a0.h, a0.i, a0.j));
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000F\u0010\u0005\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001A\u00020\u00028\u0002@\u0002X\u0082\u000E¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Companion;", "", "", "generateImageVectorId$ui_release", "()I", "generateImageVectorId", "imageVectorCount", "I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final int generateImageVectorId$ui_release() {
            synchronized(this) {
                ImageVector.k = 1;
                return 0;
            }
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final VectorGroup f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;
    public static int k;

    static {
        ImageVector.Companion = new Companion(null);
    }

    public ImageVector(String s, float f, float f1, float f2, float f3, VectorGroup vectorGroup0, long v, int v1, boolean z, int v2, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this(s, f, f1, f2, f3, vectorGroup0, v, v1, z, ((v3 & 0x200) == 0 ? v2 : ImageVector.Companion.generateImageVectorId$ui_release()), null);
    }

    public ImageVector(String s, float f, float f1, float f2, float f3, VectorGroup vectorGroup0, long v, int v1, boolean z, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = s;
        this.b = f;
        this.c = f1;
        this.d = f2;
        this.e = f3;
        this.f = vectorGroup0;
        this.g = v;
        this.h = v1;
        this.i = z;
        this.j = v2;
    }

    public static final int access$getImageVectorCount$cp() [...] // 潜在的解密器

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ImageVector)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((ImageVector)object0).a)) {
            return false;
        }
        if(!Dp.equals-impl0(this.b, ((ImageVector)object0).b)) {
            return false;
        }
        if(!Dp.equals-impl0(this.c, ((ImageVector)object0).c)) {
            return false;
        }
        if(this.d != ((ImageVector)object0).d || this.e != ((ImageVector)object0).e || !Intrinsics.areEqual(this.f, ((ImageVector)object0).f)) {
            return false;
        }
        if(!Color.equals-impl0(this.g, ((ImageVector)object0).g)) {
            return false;
        }
        return BlendMode.equals-impl0(this.h, ((ImageVector)object0).h) ? this.i == ((ImageVector)object0).i : false;
    }

    public final boolean getAutoMirror() {
        return this.i;
    }

    public final float getDefaultHeight-D9Ej5fM() {
        return this.c;
    }

    public final float getDefaultWidth-D9Ej5fM() {
        return this.b;
    }

    public final int getGenId$ui_release() {
        return this.j;
    }

    @NotNull
    public final String getName() {
        return this.a;
    }

    @NotNull
    public final VectorGroup getRoot() {
        return this.f;
    }

    public final int getTintBlendMode-0nO6VwU() {
        return this.h;
    }

    public final long getTintColor-0d7_KjU() {
        return this.g;
    }

    public final float getViewportHeight() {
        return this.e;
    }

    public final float getViewportWidth() {
        return this.d;
    }

    @Override
    public int hashCode() {
        return Boolean.hashCode(this.i) + (BlendMode.hashCode-impl(this.h) + wb.a.a(this.g, (this.f.hashCode() + r0.a.b(this.e, r0.a.b(this.d, r0.a.C(this.c, r0.a.C(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F)) * 0x1F, 0x1F)) * 0x1F;
    }
}

