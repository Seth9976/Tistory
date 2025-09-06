package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001D\u0010\r\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0015\u0010\u0010\u001A\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001D\u0010\u0012\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u0015\u0010\u0014\u001A\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u000FJ\u001A\u0010\u0018\u001A\u00020\u00172\b\u0010\u0016\u001A\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001B\u001A\u00020\u001AH\u0016¢\u0006\u0004\b\u001B\u0010\u001CJ\u000F\u0010\u001E\u001A\u00020\u001DH\u0016¢\u0006\u0004\b\u001E\u0010\u001FR&\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b#\u0010$\u001A\u0004\b\"\u0010\u000FR&\u0010\u0004\u001A\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b%\u0010!\u0012\u0004\b\'\u0010$\u001A\u0004\b&\u0010\u000FR&\u0010\u0005\u001A\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b(\u0010!\u0012\u0004\b*\u0010$\u001A\u0004\b)\u0010\u000FR&\u0010\u0006\u001A\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b+\u0010!\u0012\u0004\b-\u0010$\u001A\u0004\b,\u0010\u000F\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006."}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesImpl;", "Landroidx/compose/foundation/layout/PaddingValues;", "Landroidx/compose/ui/unit/Dp;", "start", "top", "end", "bottom", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "calculateLeftPadding-u2uoSUM", "(Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateLeftPadding", "calculateTopPadding-D9Ej5fM", "()F", "calculateTopPadding", "calculateRightPadding-u2uoSUM", "calculateRightPadding", "calculateBottomPadding-D9Ej5fM", "calculateBottomPadding", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "F", "getStart-D9Ej5fM", "getStart-D9Ej5fM$annotations", "()V", "b", "getTop-D9Ej5fM", "getTop-D9Ej5fM$annotations", "c", "getEnd-D9Ej5fM", "getEnd-D9Ej5fM$annotations", "d", "getBottom-D9Ej5fM", "getBottom-D9Ej5fM$annotations", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,484:1\n1#2:485\n148#3:486\n148#3:487\n148#3:488\n148#3:489\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesImpl\n*L\n303#1:486\n305#1:487\n307#1:488\n309#1:489\n*E\n"})
public final class PaddingValuesImpl implements PaddingValues {
    public static final int $stable;
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public PaddingValuesImpl(float f, float f1, float f2, float f3, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        if((v & 4) != 0) {
            f2 = 0.0f;
        }
        if((v & 8) != 0) {
            f3 = 0.0f;
        }
        this(f, f1, f2, f3, null);
    }

    public PaddingValuesImpl(float f, float f1, float f2, float f3, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
        if(f < 0.0f) {
            throw new IllegalArgumentException("Start padding must be non-negative");
        }
        if(f1 < 0.0f) {
            throw new IllegalArgumentException("Top padding must be non-negative");
        }
        if(f2 < 0.0f) {
            throw new IllegalArgumentException("End padding must be non-negative");
        }
        if(f3 < 0.0f) {
            throw new IllegalArgumentException("Bottom padding must be non-negative");
        }
    }

    @Override  // androidx.compose.foundation.layout.PaddingValues
    public float calculateBottomPadding-D9Ej5fM() {
        return this.d;
    }

    @Override  // androidx.compose.foundation.layout.PaddingValues
    public float calculateLeftPadding-u2uoSUM(@NotNull LayoutDirection layoutDirection0) {
        return layoutDirection0 == LayoutDirection.Ltr ? this.a : this.c;
    }

    @Override  // androidx.compose.foundation.layout.PaddingValues
    public float calculateRightPadding-u2uoSUM(@NotNull LayoutDirection layoutDirection0) {
        return layoutDirection0 == LayoutDirection.Ltr ? this.c : this.a;
    }

    @Override  // androidx.compose.foundation.layout.PaddingValues
    public float calculateTopPadding-D9Ej5fM() {
        return this.b;
    }

    // 去混淆评级： 中等(50)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof PaddingValuesImpl ? Dp.equals-impl0(this.a, ((PaddingValuesImpl)object0).a) && Dp.equals-impl0(this.b, ((PaddingValuesImpl)object0).b) && Dp.equals-impl0(this.c, ((PaddingValuesImpl)object0).c) && Dp.equals-impl0(this.d, ((PaddingValuesImpl)object0).d) : false;
    }

    public final float getBottom-D9Ej5fM() {
        return this.d;
    }

    @Stable
    public static void getBottom-D9Ej5fM$annotations() {
    }

    public final float getEnd-D9Ej5fM() {
        return this.c;
    }

    @Stable
    public static void getEnd-D9Ej5fM$annotations() {
    }

    public final float getStart-D9Ej5fM() {
        return this.a;
    }

    @Stable
    public static void getStart-D9Ej5fM$annotations() {
    }

    public final float getTop-D9Ej5fM() {
        return this.b;
    }

    @Stable
    public static void getTop-D9Ej5fM$annotations() {
    }

    @Override
    public int hashCode() {
        return Dp.hashCode-impl(this.d) + a.C(this.c, a.C(this.b, Dp.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("PaddingValues(start=");
        a.u(this.a, ", top=", stringBuilder0);
        a.u(this.b, ", end=", stringBuilder0);
        a.u(this.c, ", bottom=", stringBuilder0);
        stringBuilder0.append(Dp.toString-impl(this.d));
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

