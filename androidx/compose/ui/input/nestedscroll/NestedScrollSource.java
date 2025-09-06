package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\t\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000B\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001A\u0010\u0010\u001A\u00020\r2\b\u0010\f\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000E\u0010\u000F\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
public final class NestedScrollSource {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001R&\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006R&\u0010\t\u001A\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000B\u0010\b\u001A\u0004\b\n\u0010\u0006R&\u0010\f\u001A\u00020\u00028GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u0012\u0004\b\u000E\u0010\b\u001A\u0004\b\r\u0010\u0006R&\u0010\u000F\u001A\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u000F\u0010\u0004\u0012\u0004\b\u0011\u0010\b\u001A\u0004\b\u0010\u0010\u0006R\u001D\u0010\u0012\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0004\u001A\u0004\b\u0013\u0010\u0006R\u001D\u0010\u0014\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001A\u0004\b\u0015\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollSource$Companion;", "", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "Drag", "I", "getDrag-WNlRxjI", "()I", "getDrag-WNlRxjI$annotations", "()V", "Fling", "getFling-WNlRxjI", "getFling-WNlRxjI$annotations", "Relocate", "getRelocate-WNlRxjI", "getRelocate-WNlRxjI$annotations", "Wheel", "getWheel-WNlRxjI", "getWheel-WNlRxjI$annotations", "UserInput", "getUserInput-WNlRxjI", "SideEffect", "getSideEffect-WNlRxjI", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final int getDrag-WNlRxjI() [...] // 潜在的解密器

        @Deprecated(message = "This has been replaced by UserInput.", replaceWith = @ReplaceWith(expression = "NestedScrollSource.UserInput", imports = {"import androidx.compose.ui.input.nestedscroll.NestedScrollSource.Companion.UserInput"}))
        public static void getDrag-WNlRxjI$annotations() {
        }

        // 去混淆评级： 低(20)
        public final int getFling-WNlRxjI() [...] // 潜在的解密器

        @Deprecated(message = "This has been replaced by SideEffect.", replaceWith = @ReplaceWith(expression = "NestedScrollSource.SideEffect", imports = {"import androidx.compose.ui.input.nestedscroll.NestedScrollSource.Companion.SideEffect"}))
        public static void getFling-WNlRxjI$annotations() {
        }

        // 去混淆评级： 低(20)
        @ExperimentalComposeUiApi
        public final int getRelocate-WNlRxjI() {
            return 3;
        }

        @ExperimentalComposeUiApi
        @Deprecated(message = "Do not use. Will be removed in the future.")
        public static void getRelocate-WNlRxjI$annotations() {
        }

        // 去混淆评级： 低(20)
        public final int getSideEffect-WNlRxjI() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getUserInput-WNlRxjI() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getWheel-WNlRxjI() {
            return 1;
        }

        @Deprecated(message = "This has been replaced by UserInput.", replaceWith = @ReplaceWith(expression = "NestedScrollSource.UserInput", imports = {"import androidx.compose.ui.input.nestedscroll.NestedScrollSource.Companion.UserInput"}))
        public static void getWheel-WNlRxjI$annotations() {
        }
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
        NestedScrollSource.Companion = new Companion(null);
        NestedScrollSource.b = 1;
        NestedScrollSource.c = 2;
        NestedScrollSource.d = 1;
        NestedScrollSource.e = 2;
        NestedScrollSource.f = 3;
        NestedScrollSource.g = 1;
    }

    public NestedScrollSource(int v) {
        this.a = v;
    }

    public static final int access$getDrag$cp() [...] // 潜在的解密器

    public static final int access$getFling$cp() [...] // 潜在的解密器

    public static final int access$getRelocate$cp() [...] // 潜在的解密器

    public static final int access$getSideEffect$cp() [...] // 潜在的解密器

    public static final int access$getUserInput$cp() [...] // 潜在的解密器

    public static final int access$getWheel$cp() [...] // 潜在的解密器

    public static final NestedScrollSource box-impl(int v) {
        return new NestedScrollSource(v);
    }

    public static int constructor-impl(int v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return NestedScrollSource.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(int v, Object object0) {
        return object0 instanceof NestedScrollSource ? v == ((NestedScrollSource)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(int v, int v1) {
        return v == v1;
    }

    @Override
    public int hashCode() {
        return NestedScrollSource.hashCode-impl(this.a);
    }

    public static int hashCode-impl(int v) {
        return v;
    }

    @Override
    @NotNull
    public String toString() {
        return NestedScrollSource.toString-impl(this.a);
    }

    @NotNull
    public static String toString-impl(int v) {
        if(NestedScrollSource.equals-impl0(v, 1)) {
            return "UserInput";
        }
        if(NestedScrollSource.equals-impl0(v, NestedScrollSource.c)) {
            return "SideEffect";
        }
        return NestedScrollSource.equals-impl0(v, NestedScrollSource.f) ? "Relocate" : "Invalid";
    }

    public final int unbox-impl() {
        return this.a;
    }
}

