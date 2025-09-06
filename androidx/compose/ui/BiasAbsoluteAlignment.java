package androidx.compose.ui;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\u000F\u001A\u00020\f2\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001A\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001A\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001AJ\u001A\u0010\u001E\u001A\u00020\u001D2\b\u0010\u001C\u001A\u0004\u0018\u00010\u001BHÖ\u0003¢\u0006\u0004\b\u001E\u0010\u001FR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010\u0011R\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010!\u001A\u0004\b$\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006&"}, d2 = {"Landroidx/compose/ui/BiasAbsoluteAlignment;", "Landroidx/compose/ui/Alignment;", "", "horizontalBias", "verticalBias", "<init>", "(FF)V", "Landroidx/compose/ui/unit/IntSize;", "size", "space", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/IntOffset;", "align-KFBX0sM", "(JJLandroidx/compose/ui/unit/LayoutDirection;)J", "align", "component1", "()F", "component2", "copy", "(FF)Landroidx/compose/ui/BiasAbsoluteAlignment;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getHorizontalBias", "b", "getVerticalBias", "Horizontal", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAbsoluteAlignment\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,273:1\n26#2:274\n*S KotlinDebug\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAbsoluteAlignment\n*L\n246#1:274\n*E\n"})
public final class BiasAbsoluteAlignment implements Alignment {
    @Immutable
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\'\u0010\u000B\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ\u001A\u0010\u000F\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0012\u001A\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001A\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0019\u001A\u00020\u00182\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001AR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u000E¨\u0006\u001E"}, d2 = {"Landroidx/compose/ui/BiasAbsoluteAlignment$Horizontal;", "Landroidx/compose/ui/Alignment$Horizontal;", "", "bias", "<init>", "(F)V", "", "size", "space", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "align", "(IILandroidx/compose/ui/unit/LayoutDirection;)I", "component1", "()F", "copy", "(F)Landroidx/compose/ui/BiasAbsoluteAlignment$Horizontal;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getBias", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAbsoluteAlignment$Horizontal\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,273:1\n26#2:274\n*S KotlinDebug\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAbsoluteAlignment$Horizontal\n*L\n269#1:274\n*E\n"})
    public static final class Horizontal implements androidx.compose.ui.Alignment.Horizontal {
        public static final int $stable;
        public final float a;

        public Horizontal(float f) {
            this.a = f;
        }

        @Override  // androidx.compose.ui.Alignment$Horizontal
        public int align(int v, int v1, @NotNull LayoutDirection layoutDirection0) {
            return Math.round((this.a + 1.0f) * (((float)(v1 - v)) / 2.0f));
        }

        public final float component1() {
            return this.a;
        }

        @NotNull
        public final Horizontal copy(float f) {
            return new Horizontal(f);
        }

        public static Horizontal copy$default(Horizontal biasAbsoluteAlignment$Horizontal0, float f, int v, Object object0) {
            if((v & 1) != 0) {
                f = biasAbsoluteAlignment$Horizontal0.a;
            }
            return biasAbsoluteAlignment$Horizontal0.copy(f);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Horizontal ? Float.compare(this.a, ((Horizontal)object0).a) == 0 : false;
        }

        public final float getBias() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return Float.hashCode(this.a);
        }

        @Override
        @NotNull
        public String toString() {
            return a.n(new StringBuilder("Horizontal(bias="), this.a, ')');
        }
    }

    public static final int $stable;
    public final float a;
    public final float b;

    public BiasAbsoluteAlignment(float f, float f1) {
        this.a = f;
        this.b = f1;
    }

    @Override  // androidx.compose.ui.Alignment
    public long align-KFBX0sM(long v, long v1, @NotNull LayoutDirection layoutDirection0) {
        long v2 = IntSizeKt.IntSize(IntSize.getWidth-impl(v1) - IntSize.getWidth-impl(v), IntSize.getHeight-impl(v1) - IntSize.getHeight-impl(v));
        return IntOffsetKt.IntOffset(Math.round((this.a + 1.0f) * (((float)IntSize.getWidth-impl(v2)) / 2.0f)), Math.round((this.b + 1.0f) * (((float)IntSize.getHeight-impl(v2)) / 2.0f)));
    }

    public final float component1() {
        return this.a;
    }

    public final float component2() {
        return this.b;
    }

    @NotNull
    public final BiasAbsoluteAlignment copy(float f, float f1) {
        return new BiasAbsoluteAlignment(f, f1);
    }

    public static BiasAbsoluteAlignment copy$default(BiasAbsoluteAlignment biasAbsoluteAlignment0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = biasAbsoluteAlignment0.a;
        }
        if((v & 2) != 0) {
            f1 = biasAbsoluteAlignment0.b;
        }
        return biasAbsoluteAlignment0.copy(f, f1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BiasAbsoluteAlignment)) {
            return false;
        }
        return Float.compare(this.a, ((BiasAbsoluteAlignment)object0).a) == 0 ? Float.compare(this.b, ((BiasAbsoluteAlignment)object0).b) == 0 : false;
    }

    public final float getHorizontalBias() {
        return this.a;
    }

    public final float getVerticalBias() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return Float.hashCode(this.b) + Float.hashCode(this.a) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("BiasAbsoluteAlignment(horizontalBias=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", verticalBias=");
        return a.n(stringBuilder0, this.b, ')');
    }
}

