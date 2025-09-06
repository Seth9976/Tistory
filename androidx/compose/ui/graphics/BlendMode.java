package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\t\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000B\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001A\u0010\u0010\u001A\u00020\r2\b\u0010\f\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000E\u0010\u000F\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/graphics/BlendMode;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
public final class BlendMode {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b=\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0003\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\u0007\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006R\u001D\u0010\t\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\t\u0010\u0004\u001A\u0004\b\n\u0010\u0006R\u001D\u0010\u000B\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u000B\u0010\u0004\u001A\u0004\b\f\u0010\u0006R\u001D\u0010\r\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\r\u0010\u0004\u001A\u0004\b\u000E\u0010\u0006R\u001D\u0010\u000F\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u000F\u0010\u0004\u001A\u0004\b\u0010\u0010\u0006R\u001D\u0010\u0011\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u0011\u0010\u0004\u001A\u0004\b\u0012\u0010\u0006R\u001D\u0010\u0013\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u0013\u0010\u0004\u001A\u0004\b\u0014\u0010\u0006R\u001D\u0010\u0015\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u0015\u0010\u0004\u001A\u0004\b\u0016\u0010\u0006R\u001D\u0010\u0017\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u0017\u0010\u0004\u001A\u0004\b\u0018\u0010\u0006R\u001D\u0010\u0019\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u0019\u0010\u0004\u001A\u0004\b\u001A\u0010\u0006R\u001D\u0010\u001B\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u001B\u0010\u0004\u001A\u0004\b\u001C\u0010\u0006R\u001D\u0010\u001D\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u001D\u0010\u0004\u001A\u0004\b\u001E\u0010\u0006R\u001D\u0010\u001F\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u001F\u0010\u0004\u001A\u0004\b \u0010\u0006R\u001D\u0010!\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b!\u0010\u0004\u001A\u0004\b\"\u0010\u0006R\u001D\u0010#\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b#\u0010\u0004\u001A\u0004\b$\u0010\u0006R\u001D\u0010%\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b%\u0010\u0004\u001A\u0004\b&\u0010\u0006R\u001D\u0010\'\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\'\u0010\u0004\u001A\u0004\b(\u0010\u0006R\u001D\u0010)\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b)\u0010\u0004\u001A\u0004\b*\u0010\u0006R\u001D\u0010+\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b+\u0010\u0004\u001A\u0004\b,\u0010\u0006R\u001D\u0010-\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b-\u0010\u0004\u001A\u0004\b.\u0010\u0006R\u001D\u0010/\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b/\u0010\u0004\u001A\u0004\b0\u0010\u0006R\u001D\u00101\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b1\u0010\u0004\u001A\u0004\b2\u0010\u0006R\u001D\u00103\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b3\u0010\u0004\u001A\u0004\b4\u0010\u0006R\u001D\u00105\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b5\u0010\u0004\u001A\u0004\b6\u0010\u0006R\u001D\u00107\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b7\u0010\u0004\u001A\u0004\b8\u0010\u0006R\u001D\u00109\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b9\u0010\u0004\u001A\u0004\b:\u0010\u0006R\u001D\u0010;\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b;\u0010\u0004\u001A\u0004\b<\u0010\u0006R\u001D\u0010=\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b=\u0010\u0004\u001A\u0004\b>\u0010\u0006\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006?"}, d2 = {"Landroidx/compose/ui/graphics/BlendMode$Companion;", "", "Landroidx/compose/ui/graphics/BlendMode;", "Clear", "I", "getClear-0nO6VwU", "()I", "Src", "getSrc-0nO6VwU", "Dst", "getDst-0nO6VwU", "SrcOver", "getSrcOver-0nO6VwU", "DstOver", "getDstOver-0nO6VwU", "SrcIn", "getSrcIn-0nO6VwU", "DstIn", "getDstIn-0nO6VwU", "SrcOut", "getSrcOut-0nO6VwU", "DstOut", "getDstOut-0nO6VwU", "SrcAtop", "getSrcAtop-0nO6VwU", "DstAtop", "getDstAtop-0nO6VwU", "Xor", "getXor-0nO6VwU", "Plus", "getPlus-0nO6VwU", "Modulate", "getModulate-0nO6VwU", "Screen", "getScreen-0nO6VwU", "Overlay", "getOverlay-0nO6VwU", "Darken", "getDarken-0nO6VwU", "Lighten", "getLighten-0nO6VwU", "ColorDodge", "getColorDodge-0nO6VwU", "ColorBurn", "getColorBurn-0nO6VwU", "Hardlight", "getHardlight-0nO6VwU", "Softlight", "getSoftlight-0nO6VwU", "Difference", "getDifference-0nO6VwU", "Exclusion", "getExclusion-0nO6VwU", "Multiply", "getMultiply-0nO6VwU", "Hue", "getHue-0nO6VwU", "Saturation", "getSaturation-0nO6VwU", "Color", "getColor-0nO6VwU", "Luminosity", "getLuminosity-0nO6VwU", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final int getClear-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getColor-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getColorBurn-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getColorDodge-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getDarken-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getDifference-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getDst-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getDstAtop-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getDstIn-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getDstOut-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getDstOver-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getExclusion-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getHardlight-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getHue-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getLighten-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getLuminosity-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getModulate-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getMultiply-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getOverlay-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getPlus-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getSaturation-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getScreen-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getSoftlight-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getSrc-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getSrcAtop-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getSrcIn-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getSrcOut-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getSrcOver-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getXor-0nO6VwU() [...] // 潜在的解密器
    }

    public static final int A;
    public static final int B;
    public static final int C;
    @NotNull
    public static final Companion Companion;
    public static final int D;
    public final int a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int s;
    public static final int t;
    public static final int u;
    public static final int v;
    public static final int w;
    public static final int x;
    public static final int y;
    public static final int z;

    static {
        BlendMode.Companion = new Companion(null);
        BlendMode.b = 0;
        BlendMode.c = 1;
        BlendMode.d = 2;
        BlendMode.e = 3;
        BlendMode.f = 4;
        BlendMode.g = 5;
        BlendMode.h = 6;
        BlendMode.i = 7;
        BlendMode.j = 8;
        BlendMode.k = 9;
        BlendMode.l = 10;
        BlendMode.m = 11;
        BlendMode.n = 12;
        BlendMode.o = 13;
        BlendMode.p = 14;
        BlendMode.q = 15;
        BlendMode.r = 16;
        BlendMode.s = 17;
        BlendMode.t = 18;
        BlendMode.u = 19;
        BlendMode.v = 20;
        BlendMode.w = 21;
        BlendMode.x = 22;
        BlendMode.y = 23;
        BlendMode.z = 24;
        BlendMode.A = 25;
        BlendMode.B = 26;
        BlendMode.C = 27;
        BlendMode.D = 28;
    }

    public BlendMode(int v) {
        this.a = v;
    }

    public static final int access$getClear$cp() [...] // 潜在的解密器

    public static final int access$getColor$cp() [...] // 潜在的解密器

    public static final int access$getColorBurn$cp() [...] // 潜在的解密器

    public static final int access$getColorDodge$cp() [...] // 潜在的解密器

    public static final int access$getDarken$cp() [...] // 潜在的解密器

    public static final int access$getDifference$cp() [...] // 潜在的解密器

    public static final int access$getDst$cp() [...] // 潜在的解密器

    public static final int access$getDstAtop$cp() [...] // 潜在的解密器

    public static final int access$getDstIn$cp() [...] // 潜在的解密器

    public static final int access$getDstOut$cp() [...] // 潜在的解密器

    public static final int access$getDstOver$cp() [...] // 潜在的解密器

    public static final int access$getExclusion$cp() [...] // 潜在的解密器

    public static final int access$getHardlight$cp() [...] // 潜在的解密器

    public static final int access$getHue$cp() [...] // 潜在的解密器

    public static final int access$getLighten$cp() [...] // 潜在的解密器

    public static final int access$getLuminosity$cp() [...] // 潜在的解密器

    public static final int access$getModulate$cp() [...] // 潜在的解密器

    public static final int access$getMultiply$cp() [...] // 潜在的解密器

    public static final int access$getOverlay$cp() [...] // 潜在的解密器

    public static final int access$getPlus$cp() [...] // 潜在的解密器

    public static final int access$getSaturation$cp() [...] // 潜在的解密器

    public static final int access$getScreen$cp() [...] // 潜在的解密器

    public static final int access$getSoftlight$cp() [...] // 潜在的解密器

    public static final int access$getSrc$cp() [...] // 潜在的解密器

    public static final int access$getSrcAtop$cp() [...] // 潜在的解密器

    public static final int access$getSrcIn$cp() [...] // 潜在的解密器

    public static final int access$getSrcOut$cp() [...] // 潜在的解密器

    public static final int access$getSrcOver$cp() [...] // 潜在的解密器

    public static final int access$getXor$cp() [...] // 潜在的解密器

    public static final BlendMode box-impl(int v) {
        return new BlendMode(v);
    }

    public static int constructor-impl(int v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return BlendMode.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(int v, Object object0) {
        return object0 instanceof BlendMode ? v == ((BlendMode)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(int v, int v1) {
        return v == v1;
    }

    @Override
    public int hashCode() {
        return BlendMode.hashCode-impl(this.a);
    }

    public static int hashCode-impl(int v) {
        return v;
    }

    @Override
    @NotNull
    public String toString() {
        return BlendMode.toString-impl(this.a);
    }

    @NotNull
    public static String toString-impl(int v) {
        if(BlendMode.equals-impl0(v, 0)) {
            return "Clear";
        }
        if(BlendMode.equals-impl0(v, 1)) {
            return "Src";
        }
        if(BlendMode.equals-impl0(v, 2)) {
            return "Dst";
        }
        if(BlendMode.equals-impl0(v, 3)) {
            return "SrcOver";
        }
        if(BlendMode.equals-impl0(v, 4)) {
            return "DstOver";
        }
        if(BlendMode.equals-impl0(v, 5)) {
            return "SrcIn";
        }
        if(BlendMode.equals-impl0(v, 6)) {
            return "DstIn";
        }
        if(BlendMode.equals-impl0(v, 7)) {
            return "SrcOut";
        }
        if(BlendMode.equals-impl0(v, 8)) {
            return "DstOut";
        }
        if(BlendMode.equals-impl0(v, 9)) {
            return "SrcAtop";
        }
        if(BlendMode.equals-impl0(v, 10)) {
            return "DstAtop";
        }
        if(BlendMode.equals-impl0(v, 11)) {
            return "Xor";
        }
        if(BlendMode.equals-impl0(v, 12)) {
            return "Plus";
        }
        if(BlendMode.equals-impl0(v, 13)) {
            return "Modulate";
        }
        if(BlendMode.equals-impl0(v, 14)) {
            return "Screen";
        }
        if(BlendMode.equals-impl0(v, 15)) {
            return "Overlay";
        }
        if(BlendMode.equals-impl0(v, 16)) {
            return "Darken";
        }
        if(BlendMode.equals-impl0(v, 17)) {
            return "Lighten";
        }
        if(BlendMode.equals-impl0(v, BlendMode.t)) {
            return "ColorDodge";
        }
        if(BlendMode.equals-impl0(v, BlendMode.u)) {
            return "ColorBurn";
        }
        if(BlendMode.equals-impl0(v, BlendMode.v)) {
            return "HardLight";
        }
        if(BlendMode.equals-impl0(v, BlendMode.w)) {
            return "Softlight";
        }
        if(BlendMode.equals-impl0(v, BlendMode.x)) {
            return "Difference";
        }
        if(BlendMode.equals-impl0(v, BlendMode.y)) {
            return "Exclusion";
        }
        if(BlendMode.equals-impl0(v, BlendMode.z)) {
            return "Multiply";
        }
        if(BlendMode.equals-impl0(v, BlendMode.A)) {
            return "Hue";
        }
        if(BlendMode.equals-impl0(v, BlendMode.B)) {
            return "Saturation";
        }
        if(BlendMode.equals-impl0(v, BlendMode.C)) {
            return "Color";
        }
        return BlendMode.equals-impl0(v, BlendMode.D) ? "Luminosity" : "Unknown";
    }

    public final int unbox-impl() {
        return this.a;
    }
}

