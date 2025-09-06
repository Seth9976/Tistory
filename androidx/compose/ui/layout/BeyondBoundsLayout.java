package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\f\rJ=\u0010\u0002\u001A\u0004\u0018\u0001H\u0003\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0019\u0010\u0006\u001A\u0015\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u0007¢\u0006\u0002\b\tH&ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000Bø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\u000EÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/BeyondBoundsLayout;", "", "layout", "T", "direction", "Landroidx/compose/ui/layout/BeyondBoundsLayout$LayoutDirection;", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "Lkotlin/ExtensionFunctionType;", "layout-o7g1Pn8", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "BeyondBoundsScope", "LayoutDirection", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface BeyondBoundsLayout {
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "", "hasMoreContent", "", "getHasMoreContent", "()Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface BeyondBoundsScope {
        boolean getHasMoreContent();
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\t\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000B\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001A\u0010\u0010\u001A\u00020\r2\b\u0010\f\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000E\u0010\u000F\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/layout/BeyondBoundsLayout$LayoutDirection;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @JvmInline
    public static final class LayoutDirection {
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000F\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006R\u001D\u0010\t\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0004\u001A\u0004\b\n\u0010\u0006R\u001D\u0010\u000B\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000B\u0010\u0004\u001A\u0004\b\f\u0010\u0006R\u001D\u0010\r\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0004\u001A\u0004\b\u000E\u0010\u0006R\u001D\u0010\u000F\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000F\u0010\u0004\u001A\u0004\b\u0010\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/layout/BeyondBoundsLayout$LayoutDirection$Companion;", "", "Landroidx/compose/ui/layout/BeyondBoundsLayout$LayoutDirection;", "Before", "I", "getBefore-hoxUOeE", "()I", "After", "getAfter-hoxUOeE", "Left", "getLeft-hoxUOeE", "Right", "getRight-hoxUOeE", "Above", "getAbove-hoxUOeE", "Below", "getBelow-hoxUOeE", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            // 去混淆评级： 低(20)
            public final int getAbove-hoxUOeE() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int getAfter-hoxUOeE() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int getBefore-hoxUOeE() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int getBelow-hoxUOeE() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int getLeft-hoxUOeE() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int getRight-hoxUOeE() [...] // 潜在的解密器
        }

        @NotNull
        public static final Companion Companion;
        public final int a;
        public static final int b;
        public static final int c;
        public static final int d;
        public static final int e;
        public static final int f;
        public static final int g;

        static {
            LayoutDirection.Companion = new Companion(null);
            LayoutDirection.b = 1;
            LayoutDirection.c = 2;
            LayoutDirection.d = 3;
            LayoutDirection.e = 4;
            LayoutDirection.f = 5;
            LayoutDirection.g = 6;
        }

        public LayoutDirection(int v) {
            this.a = v;
        }

        public static final int access$getAbove$cp() [...] // 潜在的解密器

        public static final int access$getAfter$cp() [...] // 潜在的解密器

        public static final int access$getBefore$cp() [...] // 潜在的解密器

        public static final int access$getBelow$cp() [...] // 潜在的解密器

        public static final int access$getLeft$cp() [...] // 潜在的解密器

        public static final int access$getRight$cp() [...] // 潜在的解密器

        public static final LayoutDirection box-impl(int v) {
            return new LayoutDirection(v);
        }

        public static int constructor-impl(int v) [...] // Inlined contents

        @Override
        public boolean equals(Object object0) {
            return LayoutDirection.equals-impl(this.a, object0);
        }

        public static boolean equals-impl(int v, Object object0) {
            return object0 instanceof LayoutDirection ? v == ((LayoutDirection)object0).unbox-impl() : false;
        }

        public static final boolean equals-impl0(int v, int v1) {
            return v == v1;
        }

        @Override
        public int hashCode() {
            return LayoutDirection.hashCode-impl(this.a);
        }

        public static int hashCode-impl(int v) {
            return v;
        }

        @Override
        @NotNull
        public String toString() {
            return LayoutDirection.toString-impl(this.a);
        }

        @NotNull
        public static String toString-impl(int v) {
            if(LayoutDirection.equals-impl0(v, LayoutDirection.b)) {
                return "Before";
            }
            if(LayoutDirection.equals-impl0(v, LayoutDirection.c)) {
                return "After";
            }
            if(LayoutDirection.equals-impl0(v, LayoutDirection.d)) {
                return "Left";
            }
            if(LayoutDirection.equals-impl0(v, LayoutDirection.e)) {
                return "Right";
            }
            if(LayoutDirection.equals-impl0(v, LayoutDirection.f)) {
                return "Above";
            }
            return LayoutDirection.equals-impl0(v, LayoutDirection.g) ? "Below" : "invalid LayoutDirection";
        }

        public final int unbox-impl() {
            return this.a;
        }
    }

    @Nullable
    Object layout-o7g1Pn8(int arg1, @NotNull Function1 arg2);
}

