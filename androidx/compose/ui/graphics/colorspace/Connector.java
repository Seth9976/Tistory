package androidx.compose.ui.graphics.colorspace;

import androidx.annotation.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0016\u0018\u0000 $2\u00020\u0001:\u0002$%B;\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\b\u0010\n\u001A\u0004\u0018\u00010\t¢\u0006\u0004\b\u000B\u0010\fB!\b\u0010\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\r\u001A\u00020\u0007¢\u0006\u0004\b\u000B\u0010\u000EJ\'\u0010\n\u001A\u00020\t2\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0011\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\u000FH\u0007¢\u0006\u0004\b\n\u0010\u0013J\u0019\u0010\n\u001A\u00020\t2\b\b\u0001\u0010\u0014\u001A\u00020\tH\u0017¢\u0006\u0004\b\n\u0010\u0015J\u001A\u0010\u001A\u001A\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u0016H\u0010ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001ER\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001C\u001A\u0004\b\u001F\u0010\u001ER\u001D\u0010\b\u001A\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010#\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector;", "", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "source", "destination", "transformSource", "transformDestination", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "renderIntent", "", "transform", "<init>", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I[FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "intent", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "r", "g", "b", "(FFF)[F", "v", "([F)[F", "Landroidx/compose/ui/graphics/Color;", "color", "transformToColor-l2rxGTc$ui_graphics_release", "(J)J", "transformToColor", "a", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getSource", "()Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getDestination", "e", "I", "getRenderIntent-uksYyKA", "()I", "Companion", "RgbConnector", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nConnector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector\n+ 2 Color.kt\nandroidx/compose/ui/graphics/Color\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,349:1\n231#2:350\n235#2,9:351\n72#3:360\n86#3:362\n22#4:361\n22#4:363\n*S KotlinDebug\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector\n*L\n-1#1:350\n163#1:351,9\n165#1:360\n166#1:362\n165#1:361\n166#1:363\n*E\n"})
public class Connector {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector$Companion;", "", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "source", "Landroidx/compose/ui/graphics/colorspace/Connector;", "identity$ui_graphics_release", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroidx/compose/ui/graphics/colorspace/Connector;", "identity", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static final float[] access$computeTransform-YBCOT_4(Companion connector$Companion0, ColorSpace colorSpace0, ColorSpace colorSpace1, int v) {
            float[] arr_f1;
            connector$Companion0.getClass();
            if(RenderIntent.equals-impl0(v, 3)) {
                boolean z = ColorModel.equals-impl0(colorSpace0.getModel-xdoWZVw(), 0x300000000L);
                boolean z1 = ColorModel.equals-impl0(colorSpace1.getModel-xdoWZVw(), 0x300000000L);
                if((!z || !z1) && (z || z1)) {
                    if(!z) {
                        colorSpace0 = colorSpace1;
                    }
                    Intrinsics.checkNotNull(colorSpace0, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
                    float[] arr_f = z ? ((Rgb)colorSpace0).getWhitePoint().toXyz$ui_graphics_release() : Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
                    if(z1) {
                        arr_f1 = ((Rgb)colorSpace0).getWhitePoint().toXyz$ui_graphics_release();
                        return new float[]{arr_f[0] / arr_f1[0], arr_f[1] / arr_f1[1], arr_f[2] / arr_f1[2]};
                    }
                    arr_f1 = Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
                    return new float[]{arr_f[0] / arr_f1[0], arr_f[1] / arr_f1[1], arr_f[2] / arr_f1[2]};
                }
            }
            return null;
        }

        // 去混淆评级： 低(20)
        @NotNull
        public final Connector identity$ui_graphics_release(@NotNull ColorSpace colorSpace0) {
            return new Connector(colorSpace0, 1, null) {  // 初始化器: Landroidx/compose/ui/graphics/colorspace/Connector;-><init>(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
                @Override  // androidx.compose.ui.graphics.colorspace.Connector
                @NotNull
                public float[] transform(@NotNull float[] arr_f) {
                    return arr_f;
                }

                @Override  // androidx.compose.ui.graphics.colorspace.Connector
                public long transformToColor-l2rxGTc$ui_graphics_release(long v) {
                    return v;
                }
            };
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000B\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u001A\u0010\u0011\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\rH\u0010ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector$RgbConnector;", "Landroidx/compose/ui/graphics/colorspace/Connector;", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "mSource", "mDestination", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "intent", "<init>", "(Landroidx/compose/ui/graphics/colorspace/Rgb;Landroidx/compose/ui/graphics/colorspace/Rgb;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "v", "transform", "([F)[F", "Landroidx/compose/ui/graphics/Color;", "color", "transformToColor-l2rxGTc$ui_graphics_release", "(J)J", "transformToColor", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nConnector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector$RgbConnector\n+ 2 Color.kt\nandroidx/compose/ui/graphics/Color\n+ 3 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n*L\n1#1,349:1\n231#2:350\n235#2,9:351\n716#3:360\n735#3:361\n754#3:362\n*S KotlinDebug\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector$RgbConnector\n*L\n-1#1:350\n202#1:351,9\n206#1:360\n207#1:361\n208#1:362\n*E\n"})
    public static final class RgbConnector extends Connector {
        public final Rgb g;
        public final Rgb h;
        public final float[] i;

        public RgbConnector(Rgb rgb0, Rgb rgb1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            super(rgb0, rgb1, rgb0, rgb1, v, null, null);
            float[] arr_f;
            this.g = rgb0;
            this.h = rgb1;
            if(ColorSpaceKt.compare(rgb0.getWhitePoint(), rgb1.getWhitePoint())) {
                arr_f = ColorSpaceKt.mul3x3(rgb1.getInverseTransform$ui_graphics_release(), rgb0.getTransform$ui_graphics_release());
            }
            else {
                float[] arr_f1 = rgb0.getTransform$ui_graphics_release();
                float[] arr_f2 = rgb1.getInverseTransform$ui_graphics_release();
                float[] arr_f3 = rgb0.getWhitePoint().toXyz$ui_graphics_release();
                float[] arr_f4 = rgb1.getWhitePoint().toXyz$ui_graphics_release();
                Illuminant illuminant0 = Illuminant.INSTANCE;
                if(!ColorSpaceKt.compare(rgb0.getWhitePoint(), illuminant0.getD50())) {
                    float[] arr_f5 = illuminant0.getD50Xyz$ui_graphics_release();
                    float[] arr_f6 = Arrays.copyOf(arr_f5, arr_f5.length);
                    Intrinsics.checkNotNullExpressionValue(arr_f6, "copyOf(this, size)");
                    arr_f1 = ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(Adaptation.Companion.getBradford().getTransform$ui_graphics_release(), arr_f3, arr_f6), rgb0.getTransform$ui_graphics_release());
                }
                if(!ColorSpaceKt.compare(rgb1.getWhitePoint(), illuminant0.getD50())) {
                    float[] arr_f7 = illuminant0.getD50Xyz$ui_graphics_release();
                    float[] arr_f8 = Arrays.copyOf(arr_f7, arr_f7.length);
                    Intrinsics.checkNotNullExpressionValue(arr_f8, "copyOf(this, size)");
                    arr_f2 = ColorSpaceKt.inverse3x3(ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(Adaptation.Companion.getBradford().getTransform$ui_graphics_release(), arr_f4, arr_f8), rgb1.getTransform$ui_graphics_release()));
                }
                if(RenderIntent.equals-impl0(v, 3)) {
                    arr_f1 = ColorSpaceKt.mul3x3Diag(new float[]{arr_f3[0] / arr_f4[0], arr_f3[1] / arr_f4[1], arr_f3[2] / arr_f4[2]}, arr_f1);
                }
                arr_f = ColorSpaceKt.mul3x3(arr_f2, arr_f1);
            }
            this.i = arr_f;
        }

        @Override  // androidx.compose.ui.graphics.colorspace.Connector
        @NotNull
        public float[] transform(@NotNull float[] arr_f) {
            arr_f[0] = (float)this.g.getEotfFunc$ui_graphics_release().invoke(((double)arr_f[0]));
            arr_f[1] = (float)this.g.getEotfFunc$ui_graphics_release().invoke(((double)arr_f[1]));
            arr_f[2] = (float)this.g.getEotfFunc$ui_graphics_release().invoke(((double)arr_f[2]));
            ColorSpaceKt.mul3x3Float3(this.i, arr_f);
            arr_f[0] = (float)this.h.getOetfFunc$ui_graphics_release().invoke(((double)arr_f[0]));
            arr_f[1] = (float)this.h.getOetfFunc$ui_graphics_release().invoke(((double)arr_f[1]));
            arr_f[2] = (float)this.h.getOetfFunc$ui_graphics_release().invoke(((double)arr_f[2]));
            return arr_f;
        }

        @Override  // androidx.compose.ui.graphics.colorspace.Connector
        public long transformToColor-l2rxGTc$ui_graphics_release(long v) {
            float f = Color.getRed-impl(v);
            float f1 = Color.getGreen-impl(v);
            float f2 = Color.getBlue-impl(v);
            float f3 = (float)this.g.getEotfFunc$ui_graphics_release().invoke(((double)f));
            float f4 = (float)this.g.getEotfFunc$ui_graphics_release().invoke(((double)f1));
            float f5 = (float)this.g.getEotfFunc$ui_graphics_release().invoke(((double)f2));
            float f6 = this.i[6] * f5 + (this.i[3] * f4 + this.i[0] * f3);
            float f7 = this.i[7] * f5 + (this.i[4] * f4 + this.i[1] * f3);
            float f8 = this.i[8] * f5 + (this.i[5] * f4 + this.i[2] * f3);
            return ColorKt.Color(((float)this.h.getOetfFunc$ui_graphics_release().invoke(((double)f6))), ((float)this.h.getOetfFunc$ui_graphics_release().invoke(((double)f7))), ((float)this.h.getOetfFunc$ui_graphics_release().invoke(((double)f8))), Color.getAlpha-impl(v), this.h);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final ColorSpace a;
    public final ColorSpace b;
    public final ColorSpace c;
    public final ColorSpace d;
    public final int e;
    public final float[] f;

    static {
        Connector.Companion = new Companion(null);
    }

    // 去混淆评级： 低(40)
    public Connector(ColorSpace colorSpace0, ColorSpace colorSpace1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(colorSpace0, colorSpace1, (ColorModel.equals-impl0(colorSpace0.getModel-xdoWZVw(), 0x300000000L) ? ColorSpaceKt.adapt$default(colorSpace0, Illuminant.INSTANCE.getD50(), null, 2, null) : colorSpace0), (ColorModel.equals-impl0(colorSpace1.getModel-xdoWZVw(), 0x300000000L) ? ColorSpaceKt.adapt$default(colorSpace1, Illuminant.INSTANCE.getD50(), null, 2, null) : colorSpace1), v, Companion.access$computeTransform-YBCOT_4(Connector.Companion, colorSpace0, colorSpace1, v), null);
    }

    public Connector(ColorSpace colorSpace0, ColorSpace colorSpace1, ColorSpace colorSpace2, ColorSpace colorSpace3, int v, float[] arr_f, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = colorSpace0;
        this.b = colorSpace1;
        this.c = colorSpace2;
        this.d = colorSpace3;
        this.e = v;
        this.f = arr_f;
    }

    @NotNull
    public final ColorSpace getDestination() {
        return this.b;
    }

    public final int getRenderIntent-uksYyKA() {
        return this.e;
    }

    @NotNull
    public final ColorSpace getSource() {
        return this.a;
    }

    @Size(3L)
    @NotNull
    public final float[] transform(float f, float f1, float f2) {
        return this.transform(new float[]{f, f1, f2});
    }

    @Size(min = 3L)
    @NotNull
    public float[] transform(@Size(min = 3L) @NotNull float[] arr_f) {
        float[] arr_f1 = this.c.toXyz(arr_f);
        float[] arr_f2 = this.f;
        if(arr_f2 != null) {
            arr_f1[0] *= arr_f2[0];
            arr_f1[1] *= arr_f2[1];
            arr_f1[2] *= arr_f2[2];
        }
        return this.d.fromXyz(arr_f1);
    }

    public long transformToColor-l2rxGTc$ui_graphics_release(long v) {
        float f = Color.getRed-impl(v);
        float f1 = Color.getGreen-impl(v);
        float f2 = Color.getBlue-impl(v);
        float f3 = Color.getAlpha-impl(v);
        long v1 = this.c.toXy$ui_graphics_release(f, f1, f2);
        float f4 = Float.intBitsToFloat(((int)(v1 >> 0x20)));
        float f5 = Float.intBitsToFloat(((int)(v1 & 0xFFFFFFFFL)));
        float f6 = this.c.toZ$ui_graphics_release(f, f1, f2);
        float[] arr_f = this.f;
        if(arr_f != null) {
            f4 *= arr_f[0];
            f5 *= arr_f[1];
            f6 *= arr_f[2];
        }
        return this.d.xyzaToColor-JlNiLsg$ui_graphics_release(f4, f5, f6, f3, this.b);
    }
}

