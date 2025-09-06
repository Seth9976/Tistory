package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0007\b&\u0018\u0000 \b2\u00020\u0001:\u0001\bR\u001A\u0010\u0007\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Adaptation;", "", "", "a", "[F", "getTransform$ui_graphics_release", "()[F", "transform", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class Adaptation {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001A\u0004\b\n\u0010\u0006¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Adaptation$Companion;", "", "Landroidx/compose/ui/graphics/colorspace/Adaptation;", "Bradford", "Landroidx/compose/ui/graphics/colorspace/Adaptation;", "getBradford", "()Landroidx/compose/ui/graphics/colorspace/Adaptation;", "VonKries", "getVonKries", "Ciecat02", "getCiecat02", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Adaptation getBradford() {
            return Adaptation.b;
        }

        @NotNull
        public final Adaptation getCiecat02() {
            return Adaptation.d;
        }

        @NotNull
        public final Adaptation getVonKries() {
            return Adaptation.c;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final float[] a;
    public static final Adaptation.Companion.Bradford.1 b;
    public static final Adaptation.Companion.VonKries.1 c;
    public static final Adaptation.Companion.Ciecat02.1 d;

    static {
        Adaptation.Companion = new Companion(null);
        Adaptation.b = new Adaptation.Companion.Bradford.1(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f}, null);  // 初始化器: Landroidx/compose/ui/graphics/colorspace/Adaptation;-><init>([FLkotlin/jvm/internal/DefaultConstructorMarker;)V
        Adaptation.c = new Adaptation.Companion.VonKries.1(new float[]{0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f}, null);  // 初始化器: Landroidx/compose/ui/graphics/colorspace/Adaptation;-><init>([FLkotlin/jvm/internal/DefaultConstructorMarker;)V
        Adaptation.d = new Adaptation.Companion.Ciecat02.1(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f}, null);  // 初始化器: Landroidx/compose/ui/graphics/colorspace/Adaptation;-><init>([FLkotlin/jvm/internal/DefaultConstructorMarker;)V
    }

    public Adaptation(float[] arr_f, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = arr_f;
    }

    @NotNull
    public final float[] getTransform$ui_graphics_release() {
        return this.a;
    }
}

