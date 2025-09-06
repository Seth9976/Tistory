package androidx.compose.ui;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0002%&B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\u000F\u001A\u00020\f2\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001A\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001A\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001AJ\u001A\u0010\u001E\u001A\u00020\u001D2\b\u0010\u001C\u001A\u0004\u0018\u00010\u001BHÖ\u0003¢\u0006\u0004\b\u001E\u0010\u001FR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010\u0011R\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010!\u001A\u0004\b$\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\'"}, d2 = {"Landroidx/compose/ui/BiasAlignment;", "Landroidx/compose/ui/Alignment;", "", "horizontalBias", "verticalBias", "<init>", "(FF)V", "Landroidx/compose/ui/unit/IntSize;", "size", "space", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/IntOffset;", "align-KFBX0sM", "(JJLandroidx/compose/ui/unit/LayoutDirection;)J", "align", "component1", "()F", "component2", "copy", "(FF)Landroidx/compose/ui/BiasAlignment;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getHorizontalBias", "b", "getVerticalBias", "Horizontal", "Vertical", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,273:1\n26#2:274\n*S KotlinDebug\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment\n*L\n174#1:274\n*E\n"})
public final class BiasAlignment implements Alignment {
    @Immutable
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\'\u0010\u000B\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ\u001A\u0010\u000F\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0012\u001A\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001A\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0019\u001A\u00020\u00182\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001AR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u000E¨\u0006\u001E"}, d2 = {"Landroidx/compose/ui/BiasAlignment$Horizontal;", "Landroidx/compose/ui/Alignment$Horizontal;", "", "bias", "<init>", "(F)V", "", "size", "space", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "align", "(IILandroidx/compose/ui/unit/LayoutDirection;)I", "component1", "()F", "copy", "(F)Landroidx/compose/ui/BiasAlignment$Horizontal;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getBias", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment$Horizontal\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,273:1\n26#2:274\n*S KotlinDebug\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment$Horizontal\n*L\n194#1:274\n*E\n"})
    public static final class Horizontal implements androidx.compose.ui.Alignment.Horizontal {
        public static final int $stable;
        public final float a;

        public Horizontal(float f) {
            this.a = f;
        }

        @Override  // androidx.compose.ui.Alignment$Horizontal
        public int align(int v, int v1, @NotNull LayoutDirection layoutDirection0) {
            return Math.round(((layoutDirection0 == LayoutDirection.Ltr ? this.a : this.a * -1.0f) + 1.0f) * (((float)(v1 - v)) / 2.0f));
        }

        public final float component1() {
            return this.a;
        }

        @NotNull
        public final Horizontal copy(float f) {
            return new Horizontal(f);
        }

        public static Horizontal copy$default(Horizontal biasAlignment$Horizontal0, float f, int v, Object object0) {
            if((v & 1) != 0) {
                f = biasAlignment$Horizontal0.a;
            }
            return biasAlignment$Horizontal0.copy(f);
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

    @Immutable
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001F\u0010\t\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ\u001A\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001A\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0017\u001A\u00020\u00162\b\u0010\u0015\u001A\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\f¨\u0006\u001C"}, d2 = {"Landroidx/compose/ui/BiasAlignment$Vertical;", "Landroidx/compose/ui/Alignment$Vertical;", "", "bias", "<init>", "(F)V", "", "size", "space", "align", "(II)I", "component1", "()F", "copy", "(F)Landroidx/compose/ui/BiasAlignment$Vertical;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getBias", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment$Vertical\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,273:1\n26#2:274\n*S KotlinDebug\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment$Vertical\n*L\n213#1:274\n*E\n"})
    public static final class Vertical implements androidx.compose.ui.Alignment.Vertical {
        public static final int $stable;
        public final float a;

        public Vertical(float f) {
            this.a = f;
        }

        @Override  // androidx.compose.ui.Alignment$Vertical
        public int align(int v, int v1) {
            return Math.round((this.a + 1.0f) * (((float)(v1 - v)) / 2.0f));
        }

        public final float component1() {
            return this.a;
        }

        @NotNull
        public final Vertical copy(float f) {
            return new Vertical(f);
        }

        public static Vertical copy$default(Vertical biasAlignment$Vertical0, float f, int v, Object object0) {
            if((v & 1) != 0) {
                f = biasAlignment$Vertical0.a;
            }
            return biasAlignment$Vertical0.copy(f);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Vertical ? Float.compare(this.a, ((Vertical)object0).a) == 0 : false;
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
            return a.n(new StringBuilder("Vertical(bias="), this.a, ')');
        }
    }

    public static final int $stable;
    public final float a;
    public final float b;

    public BiasAlignment(float f, float f1) {
        this.a = f;
        this.b = f1;
    }

    @Override  // androidx.compose.ui.Alignment
    public long align-KFBX0sM(long v, long v1, @NotNull LayoutDirection layoutDirection0) {
        return IntOffsetKt.IntOffset(Math.round(((layoutDirection0 == LayoutDirection.Ltr ? this.a : this.a * -1.0f) + 1.0f) * (((float)(IntSize.getWidth-impl(v1) - IntSize.getWidth-impl(v))) / 2.0f)), Math.round((this.b + 1.0f) * (((float)(IntSize.getHeight-impl(v1) - IntSize.getHeight-impl(v))) / 2.0f)));
    }

    public final float component1() {
        return this.a;
    }

    public final float component2() {
        return this.b;
    }

    @NotNull
    public final BiasAlignment copy(float f, float f1) {
        return new BiasAlignment(f, f1);
    }

    public static BiasAlignment copy$default(BiasAlignment biasAlignment0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = biasAlignment0.a;
        }
        if((v & 2) != 0) {
            f1 = biasAlignment0.b;
        }
        return biasAlignment0.copy(f, f1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BiasAlignment)) {
            return false;
        }
        return Float.compare(this.a, ((BiasAlignment)object0).a) == 0 ? Float.compare(this.b, ((BiasAlignment)object0).b) == 0 : false;
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
        StringBuilder stringBuilder0 = new StringBuilder("BiasAlignment(horizontalBias=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", verticalBias=");
        return a.n(stringBuilder0, this.b, ')');
    }
}

