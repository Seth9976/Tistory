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

@Stable
@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001:\u0001\u000FJ\u0015\u0010\u0002\u001A\u00020\u0003H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001D\u0010\u0006\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\bH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u001D\u0010\u000B\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\bH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\r\u001A\u00020\u0003H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000E\u0010\u0005ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValues;", "", "calculateBottomPadding", "Landroidx/compose/ui/unit/Dp;", "calculateBottomPadding-D9Ej5fM", "()F", "calculateLeftPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "calculateLeftPadding-u2uoSUM", "(Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateRightPadding", "calculateRightPadding-u2uoSUM", "calculateTopPadding", "calculateTopPadding-D9Ej5fM", "Absolute", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface PaddingValues {
    @Immutable
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001D\u0010\r\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0015\u0010\u0010\u001A\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001D\u0010\u0012\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u0015\u0010\u0014\u001A\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u000FJ\u001A\u0010\u0018\u001A\u00020\u00172\b\u0010\u0016\u001A\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001B\u001A\u00020\u001AH\u0016¢\u0006\u0004\b\u001B\u0010\u001CJ\u000F\u0010\u001E\u001A\u00020\u001DH\u0016¢\u0006\u0004\b\u001E\u0010\u001F\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/foundation/layout/PaddingValues$Absolute;", "Landroidx/compose/foundation/layout/PaddingValues;", "Landroidx/compose/ui/unit/Dp;", "left", "top", "right", "bottom", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "calculateLeftPadding-u2uoSUM", "(Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateLeftPadding", "calculateTopPadding-D9Ej5fM", "()F", "calculateTopPadding", "calculateRightPadding-u2uoSUM", "calculateRightPadding", "calculateBottomPadding-D9Ej5fM", "calculateBottomPadding", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValues$Absolute\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,484:1\n1#2:485\n148#3:486\n148#3:487\n148#3:488\n148#3:489\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValues$Absolute\n*L\n208#1:486\n210#1:487\n212#1:488\n214#1:489\n*E\n"})
    public static final class Absolute implements PaddingValues {
        public static final int $stable;
        public final float a;
        public final float b;
        public final float c;
        public final float d;

        public Absolute(float f, float f1, float f2, float f3, int v, DefaultConstructorMarker defaultConstructorMarker0) {
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

        public Absolute(float f, float f1, float f2, float f3, DefaultConstructorMarker defaultConstructorMarker0) {
            this.a = f;
            this.b = f1;
            this.c = f2;
            this.d = f3;
            if(f < 0.0f) {
                throw new IllegalArgumentException("Left padding must be non-negative");
            }
            if(f1 < 0.0f) {
                throw new IllegalArgumentException("Top padding must be non-negative");
            }
            if(f2 < 0.0f) {
                throw new IllegalArgumentException("Right padding must be non-negative");
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
            return this.a;
        }

        @Override  // androidx.compose.foundation.layout.PaddingValues
        public float calculateRightPadding-u2uoSUM(@NotNull LayoutDirection layoutDirection0) {
            return this.c;
        }

        @Override  // androidx.compose.foundation.layout.PaddingValues
        public float calculateTopPadding-D9Ej5fM() {
            return this.b;
        }

        // 去混淆评级： 中等(50)
        @Override
        public boolean equals(@Nullable Object object0) {
            return object0 instanceof Absolute ? Dp.equals-impl0(this.a, ((Absolute)object0).a) && Dp.equals-impl0(this.b, ((Absolute)object0).b) && Dp.equals-impl0(this.c, ((Absolute)object0).c) && Dp.equals-impl0(this.d, ((Absolute)object0).d) : false;
        }

        @Override
        public int hashCode() {
            return Dp.hashCode-impl(this.d) + a.C(this.c, a.C(this.b, Dp.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("PaddingValues.Absolute(left=");
            a.u(this.a, ", top=", stringBuilder0);
            a.u(this.b, ", right=", stringBuilder0);
            a.u(this.c, ", bottom=", stringBuilder0);
            stringBuilder0.append(Dp.toString-impl(this.d));
            stringBuilder0.append(')');
            return stringBuilder0.toString();
        }
    }

    float calculateBottomPadding-D9Ej5fM();

    float calculateLeftPadding-u2uoSUM(@NotNull LayoutDirection arg1);

    float calculateRightPadding-u2uoSUM(@NotNull LayoutDirection arg1);

    float calculateTopPadding-D9Ej5fM();
}

