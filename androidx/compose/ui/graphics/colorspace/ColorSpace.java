package androidx.compose.ui.graphics.colorspace;

import androidx.annotation.IntRange;
import androidx.annotation.Size;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0013\b&\u0018\u0000 A2\u00020\u0001:\u0001AB!\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\b\u0010\nJ\u0019\u0010\r\u001A\u00020\f2\b\b\u0001\u0010\u000B\u001A\u00020\u0006H&\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0019\u0010\u000F\u001A\u00020\f2\b\b\u0001\u0010\u000B\u001A\u00020\u0006H&\u00A2\u0006\u0004\b\u000F\u0010\u000EJ\'\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0010\u001A\u00020\f2\u0006\u0010\u0011\u001A\u00020\f2\u0006\u0010\u0012\u001A\u00020\fH\u0007\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0014\u001A\u00020\u00132\b\b\u0001\u0010\u0016\u001A\u00020\u0013H\'\u00A2\u0006\u0004\b\u0014\u0010\u0017J\'\u0010\u001E\u001A\u00020\u001B2\u0006\u0010\u0018\u001A\u00020\f2\u0006\u0010\u0019\u001A\u00020\f2\u0006\u0010\u001A\u001A\u00020\fH\u0010\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\'\u0010!\u001A\u00020\f2\u0006\u0010\u0018\u001A\u00020\f2\u0006\u0010\u0019\u001A\u00020\f2\u0006\u0010\u001A\u001A\u00020\fH\u0010\u00A2\u0006\u0004\b\u001F\u0010 J=\u0010*\u001A\u00020\'2\u0006\u0010\"\u001A\u00020\f2\u0006\u0010#\u001A\u00020\f2\u0006\u0010$\u001A\u00020\f2\u0006\u0010%\u001A\u00020\f2\u0006\u0010&\u001A\u00020\u0000H\u0010\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b(\u0010)J\'\u0010+\u001A\u00020\u00132\u0006\u0010\"\u001A\u00020\f2\u0006\u0010#\u001A\u00020\f2\u0006\u0010$\u001A\u00020\fH\u0007\u00A2\u0006\u0004\b+\u0010\u0015J\u0019\u0010+\u001A\u00020\u00132\b\b\u0001\u0010\u0016\u001A\u00020\u0013H\'\u00A2\u0006\u0004\b+\u0010\u0017J\u000F\u0010,\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b,\u0010-J\u001A\u00100\u001A\u00020/2\b\u0010.\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b0\u00101J\u000F\u00102\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b%\u00104\u001A\u0004\b5\u0010-R\u001D\u0010\u0005\u001A\u00020\u00048\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b\u0012\u00106\u001A\u0004\b7\u00108R\u001A\u0010\u0007\u001A\u00020\u00068\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b9\u0010:\u001A\u0004\b;\u00103R\u0011\u0010=\u001A\u00020\u00068G\u00A2\u0006\u0006\u001A\u0004\b<\u00103R\u0014\u0010>\u001A\u00020/8&X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b>\u0010?R\u0014\u0010@\u001A\u00020/8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b@\u0010?\u0082\u0002\u000B\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006B"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "", "name", "Landroidx/compose/ui/graphics/colorspace/ColorModel;", "model", "", "id", "<init>", "(Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component", "", "getMinValue", "(I)F", "getMaxValue", "r", "g", "b", "", "toXyz", "(FFF)[F", "v", "([F)[F", "v0", "v1", "v2", "", "toXy$ui_graphics_release", "(FFF)J", "toXy", "toZ$ui_graphics_release", "(FFF)F", "toZ", "x", "y", "z", "a", "colorSpace", "Landroidx/compose/ui/graphics/Color;", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "xyzaToColor", "fromXyz", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/String;", "getName", "J", "getModel-xdoWZVw", "()J", "c", "I", "getId$ui_graphics_release", "getComponentCount", "componentCount", "isWideGamut", "()Z", "isSrgb", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nColorSpace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpace\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,802:1\n63#2,3:803\n*S KotlinDebug\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpace\n*L\n290#1:803,3\n*E\n"})
public abstract class ColorSpace {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpace$Companion;", "", "", "MaxId", "I", "MinId", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion = null;
    public static final int MaxId = 0x3F;
    public static final int MinId = -1;
    public final String a;
    public final long b;
    public final int c;

    static {
        ColorSpace.Companion = new Companion(null);
    }

    public ColorSpace(String s, long v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = s;
        this.b = v;
        this.c = v1;
        if(s.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if(v1 < -1 || v1 > 0x3F) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public ColorSpace(String s, long v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(s, v, -1, null);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || this.getClass() != object0.getClass() || this.c != ((ColorSpace)object0).c) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((ColorSpace)object0).a) ? ColorModel.equals-impl0(this.b, ((ColorSpace)object0).b) : false;
    }

    @Size(min = 3L)
    @NotNull
    public final float[] fromXyz(float f, float f1, float f2) {
        float[] arr_f = new float[ColorModel.getComponentCount-impl(this.b)];
        arr_f[0] = f;
        arr_f[1] = f1;
        arr_f[2] = f2;
        return this.fromXyz(arr_f);
    }

    @Size(min = 3L)
    @NotNull
    public abstract float[] fromXyz(@Size(min = 3L) @NotNull float[] arg1);

    @IntRange(from = 1L, to = 4L)
    public final int getComponentCount() {
        return ColorModel.getComponentCount-impl(this.b);
    }

    public final int getId$ui_graphics_release() {
        return this.c;
    }

    public abstract float getMaxValue(@IntRange(from = 0L, to = 3L) int arg1);

    public abstract float getMinValue(@IntRange(from = 0L, to = 3L) int arg1);

    public final long getModel-xdoWZVw() {
        return this.b;
    }

    @NotNull
    public final String getName() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return (ColorModel.hashCode-impl(this.b) + this.a.hashCode() * 0x1F) * 0x1F + this.c;
    }

    public boolean isSrgb() {
        return false;
    }

    public abstract boolean isWideGamut();

    @Override
    @NotNull
    public String toString() {
        return this.a + " (id=" + this.c + ", model=" + ColorModel.toString-impl(this.b) + ')';
    }

    public long toXy$ui_graphics_release(float f, float f1, float f2) {
        float[] arr_f = this.toXyz(f, f1, f2);
        return ((long)Float.floatToRawIntBits(arr_f[0])) << 0x20 | ((long)Float.floatToRawIntBits(arr_f[1])) & 0xFFFFFFFFL;
    }

    @Size(3L)
    @NotNull
    public final float[] toXyz(float f, float f1, float f2) {
        return this.toXyz(new float[]{f, f1, f2});
    }

    @Size(min = 3L)
    @NotNull
    public abstract float[] toXyz(@Size(min = 3L) @NotNull float[] arg1);

    public float toZ$ui_graphics_release(float f, float f1, float f2) {
        return this.toXyz(f, f1, f2)[2];
    }

    public long xyzaToColor-JlNiLsg$ui_graphics_release(float f, float f1, float f2, float f3, @NotNull ColorSpace colorSpace0) {
        float[] arr_f = this.fromXyz(f, f1, f2);
        return ColorKt.Color(arr_f[0], arr_f[1], arr_f[2], f3, colorSpace0);
    }
}

