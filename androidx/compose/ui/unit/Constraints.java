package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import wb.a;

@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u001B\b\u0087@\u0018\u0000 02\u00020\u0001:\u00010B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\u00062\b\b\u0002\u0010\n\u001A\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u0011\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0014\u001A\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0019\u001A\u00020\u00162\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u0012\u0004\b\u001C\u0010\u001DR\u0011\u0010\u0007\u001A\u00020\u00068F¢\u0006\u0006\u001A\u0004\b\u001E\u0010\u0013R\u0011\u0010\b\u001A\u00020\u00068F¢\u0006\u0006\u001A\u0004\b\u001F\u0010\u0013R\u0011\u0010\t\u001A\u00020\u00068F¢\u0006\u0006\u001A\u0004\b \u0010\u0013R\u0011\u0010\n\u001A\u00020\u00068F¢\u0006\u0006\u001A\u0004\b!\u0010\u0013R\u0011\u0010$\u001A\u00020\u00168F¢\u0006\u0006\u001A\u0004\b\"\u0010#R\u0011\u0010&\u001A\u00020\u00168F¢\u0006\u0006\u001A\u0004\b%\u0010#R\u001A\u0010)\u001A\u00020\u00168FX\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u001D\u001A\u0004\b\'\u0010#R\u001A\u0010,\u001A\u00020\u00168FX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u001D\u001A\u0004\b*\u0010#R\u001A\u0010/\u001A\u00020\u00168FX\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u001D\u001A\u0004\b-\u0010#\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u00061"}, d2 = {"Landroidx/compose/ui/unit/Constraints;", "", "", "value", "constructor-impl", "(J)J", "", "minWidth", "maxWidth", "minHeight", "maxHeight", "copy-Zbe2FdA", "(JIIII)J", "copy", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "a", "J", "getValue$annotations", "()V", "getMinWidth-impl", "getMaxWidth-impl", "getMinHeight-impl", "getMaxHeight-impl", "getHasBoundedWidth-impl", "(J)Z", "hasBoundedWidth", "getHasBoundedHeight-impl", "hasBoundedHeight", "getHasFixedWidth-impl", "getHasFixedWidth$annotations", "hasFixedWidth", "getHasFixedHeight-impl", "getHasFixedHeight$annotations", "hasFixedHeight", "isZero-impl", "isZero$annotations", "isZero", "Companion", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
@SourceDebugExtension({"SMAP\nConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints\n+ 2 Constraints.kt\nandroidx/compose/ui/unit/ConstraintsKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,706:1\n68#1:707\n68#1:710\n68#1:713\n68#1:717\n68#1:721\n68#1:724\n68#1:728\n68#1:731\n68#1:735\n685#2:708\n699#2:709\n685#2:711\n699#2:712\n685#2:714\n705#2:715\n693#2:716\n685#2:718\n705#2:719\n693#2:720\n685#2:722\n699#2:723\n685#2:725\n705#2:726\n693#2:727\n685#2:729\n699#2:730\n685#2:732\n705#2:733\n693#2:734\n685#2:736\n699#2:737\n693#2:738\n705#2:739\n37#3,7:740\n37#3,7:747\n37#3,7:754\n*S KotlinDebug\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints\n*L\n75#1:707\n85#1:710\n95#1:713\n107#1:717\n120#1:721\n130#1:724\n141#1:728\n154#1:731\n170#1:735\n75#1:708\n75#1:709\n85#1:711\n85#1:712\n95#1:714\n96#1:715\n97#1:716\n107#1:718\n108#1:719\n109#1:720\n120#1:722\n120#1:723\n130#1:725\n131#1:726\n132#1:727\n141#1:729\n141#1:730\n154#1:732\n155#1:733\n156#1:734\n170#1:736\n174#1:737\n178#1:738\n179#1:739\n195#1:740,7\n199#1:747,7\n203#1:754,7\n*E\n"})
public final class Constraints {
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001J%\u0010\b\u001A\u00020\u00052\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001D\u0010\u000B\u001A\u00020\u00052\u0006\u0010\u0003\u001A\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u001D\u0010\r\u001A\u00020\u00052\u0006\u0010\u0004\u001A\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\nJ?\u0010\u0016\u001A\u00020\u00052\u0006\u0010\u000E\u001A\u00020\u00022\u0006\u0010\u000F\u001A\u00020\u00022\u0006\u0010\u0010\u001A\u00020\u00022\u0006\u0010\u0011\u001A\u00020\u00022\b\b\u0002\u0010\u0013\u001A\u00020\u0012H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u0019\u001A\u00020\u00052\u0006\u0010\u000E\u001A\u00020\u00022\u0006\u0010\u000F\u001A\u00020\u00022\u0006\u0010\u0010\u001A\u00020\u00022\u0006\u0010\u0011\u001A\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u001B\u001A\u00020\u00052\u0006\u0010\u000E\u001A\u00020\u00022\u0006\u0010\u000F\u001A\u00020\u00022\u0006\u0010\u0010\u001A\u00020\u00022\u0006\u0010\u0011\u001A\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001A\u0010\u0018R\u0014\u0010\u001C\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001C\u0010\u001D\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006\u001E"}, d2 = {"Landroidx/compose/ui/unit/Constraints$Companion;", "", "", "width", "height", "Landroidx/compose/ui/unit/Constraints;", "fixed-JhjzzOo", "(II)J", "fixed", "fixedWidth-OenEA2s", "(I)J", "fixedWidth", "fixedHeight-OenEA2s", "fixedHeight", "minWidth", "maxWidth", "minHeight", "maxHeight", "", "prioritizeWidth", "restrictConstraints-xF2OJ5Q", "(IIIIZ)J", "restrictConstraints", "fitPrioritizingWidth-Zbe2FdA", "(IIII)J", "fitPrioritizingWidth", "fitPrioritizingHeight-Zbe2FdA", "fitPrioritizingHeight", "Infinity", "I", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints$Companion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,706:1\n37#2,7:707\n37#2,7:714\n37#2,7:721\n*S KotlinDebug\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints$Companion\n*L\n234#1:707,7\n247#1:714,7\n265#1:721,7\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @Stable
        public final long fitPrioritizingHeight-Zbe2FdA(int v, int v1, int v2, int v3) {
            int v4 = Math.min(v2, 0x3FFFE);
            int v5 = 0x7FFFFFFF;
            int v6 = v3 == 0x7FFFFFFF ? 0x7FFFFFFF : Math.min(v3, 0x3FFFE);
            int v7 = ConstraintsKt.access$maxAllowedForSize((v6 == 0x7FFFFFFF ? v4 : v6));
            if(v1 != 0x7FFFFFFF) {
                v5 = Math.min(v7, v1);
            }
            return ConstraintsKt.Constraints(Math.min(v7, v), v5, v4, v6);
        }

        @Stable
        public final long fitPrioritizingWidth-Zbe2FdA(int v, int v1, int v2, int v3) {
            int v4 = Math.min(v, 0x3FFFE);
            int v5 = 0x7FFFFFFF;
            int v6 = v1 == 0x7FFFFFFF ? 0x7FFFFFFF : Math.min(v1, 0x3FFFE);
            int v7 = ConstraintsKt.access$maxAllowedForSize((v6 == 0x7FFFFFFF ? v4 : v6));
            if(v3 != 0x7FFFFFFF) {
                v5 = Math.min(v7, v3);
            }
            return ConstraintsKt.Constraints(v4, v6, Math.min(v7, v2), v5);
        }

        @Stable
        public final long fixed-JhjzzOo(int v, int v1) {
            if(v < 0 || v1 < 0) {
                InlineClassHelperKt.throwIllegalArgumentException(("width(" + v + ") and height(" + v1 + ") must be >= 0"));
            }
            return ConstraintsKt.createConstraints(v, v, v1, v1);
        }

        @Stable
        public final long fixedHeight-OenEA2s(int v) {
            if(v < 0) {
                InlineClassHelperKt.throwIllegalArgumentException(("height(" + v + ") must be >= 0"));
            }
            return ConstraintsKt.createConstraints(0, 0x7FFFFFFF, v, v);
        }

        @Stable
        public final long fixedWidth-OenEA2s(int v) {
            if(v < 0) {
                InlineClassHelperKt.throwIllegalArgumentException(("width(" + v + ") must be >= 0"));
            }
            return ConstraintsKt.createConstraints(v, v, 0, 0x7FFFFFFF);
        }

        // 去混淆评级： 低(20)
        @Stable
        @ExperimentalComposeUiApi
        @Deprecated(message = "Replace with fitPrioritizingWidth", replaceWith = @ReplaceWith(expression = "Constraints.fitPrioritizingWidth(minWidth, maxWidth, minHeight, maxHeight)", imports = {}))
        public final long restrictConstraints-xF2OJ5Q(int v, int v1, int v2, int v3, boolean z) {
            return z ? this.fitPrioritizingWidth-Zbe2FdA(v, v1, v2, v3) : this.fitPrioritizingHeight-Zbe2FdA(v, v1, v2, v3);
        }

        public static long restrictConstraints-xF2OJ5Q$default(Companion constraints$Companion0, int v, int v1, int v2, int v3, boolean z, int v4, Object object0) {
            if((v4 & 16) != 0) {
                z = true;
            }
            return constraints$Companion0.restrictConstraints-xF2OJ5Q(v, v1, v2, v3, z);
        }
    }

    @NotNull
    public static final Companion Companion = null;
    public static final int Infinity = 0x7FFFFFFF;
    public final long a;

    static {
        Constraints.Companion = new Companion(null);
    }

    public Constraints(long v) {
        this.a = v;
    }

    public static final Constraints box-impl(long v) {
        return new Constraints(v);
    }

    public static long constructor-impl(long v) [...] // Inlined contents

    public static final long copy-Zbe2FdA(long v, int v1, int v2, int v3, int v4) {
        if(v3 < 0 || v1 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException(("minHeight(" + v3 + ") and minWidth(" + v1 + ") must be >= 0"));
        }
        if(v2 < v1) {
            InlineClassHelperKt.throwIllegalArgumentException(("maxWidth(" + v2 + ") must be >= minWidth(" + v1 + ')'));
        }
        if(v4 < v3) {
            InlineClassHelperKt.throwIllegalArgumentException(("maxHeight(" + v4 + ") must be >= minHeight(" + v3 + ')'));
        }
        return ConstraintsKt.createConstraints(v1, v2, v3, v4);
    }

    public static long copy-Zbe2FdA$default(long v, int v1, int v2, int v3, int v4, int v5, Object object0) {
        if((v5 & 1) != 0) {
            v1 = Constraints.getMinWidth-impl(v);
        }
        if((v5 & 2) != 0) {
            v2 = Constraints.getMaxWidth-impl(v);
        }
        if((v5 & 4) != 0) {
            v3 = Constraints.getMinHeight-impl(v);
        }
        if((v5 & 8) != 0) {
            v4 = Constraints.getMaxHeight-impl(v);
        }
        return Constraints.copy-Zbe2FdA(v, v1, v2, v3, v4);
    }

    @Override
    public boolean equals(Object object0) {
        return Constraints.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof Constraints ? v == ((Constraints)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return v == v1;
    }

    public static final boolean getHasBoundedHeight-impl(long v) {
        int v1 = ((((int)(3L & v)) & 2) >> 1) * 3 + ((((int)(3L & v)) & 1) << 1);
        return (((int)(v >> v1 + 46)) & (1 << 18 - v1) - 1) != 0;
    }

    public static final boolean getHasBoundedWidth-impl(long v) {
        return (((int)(v >> 33)) & (1 << ((((int)(3L & v)) & 2) >> 1) * 3 + ((((int)(3L & v)) & 1) << 1) + 13) - 1) != 0;
    }

    @Stable
    public static void getHasFixedHeight$annotations() {
    }

    public static final boolean getHasFixedHeight-impl(long v) {
        int v1 = ((((int)(3L & v)) & 2) >> 1) * 3 + ((((int)(3L & v)) & 1) << 1);
        int v2 = (1 << 18 - v1) - 1;
        int v3 = ((int)(v >> v1 + 46)) & v2;
        return (((int)(v >> v1 + 15)) & v2) == (v3 == 0 ? 0x7FFFFFFF : v3 - 1);
    }

    @Stable
    public static void getHasFixedWidth$annotations() {
    }

    public static final boolean getHasFixedWidth-impl(long v) {
        int v1 = (1 << ((((int)(3L & v)) & 2) >> 1) * 3 + ((((int)(3L & v)) & 1) << 1) + 13) - 1;
        int v2 = ((int)(v >> 33)) & v1;
        return (((int)(v >> 2)) & v1) == (v2 == 0 ? 0x7FFFFFFF : v2 - 1);
    }

    public static final int getMaxHeight-impl(long v) {
        int v1 = ((((int)(3L & v)) & 2) >> 1) * 3 + ((((int)(3L & v)) & 1) << 1);
        int v2 = ((int)(v >> v1 + 46)) & (1 << 18 - v1) - 1;
        return v2 == 0 ? 0x7FFFFFFF : v2 - 1;
    }

    public static final int getMaxWidth-impl(long v) {
        int v1 = ((int)(v >> 33)) & (1 << ((((int)(3L & v)) & 2) >> 1) * 3 + ((((int)(3L & v)) & 1) << 1) + 13) - 1;
        return v1 == 0 ? 0x7FFFFFFF : v1 - 1;
    }

    public static final int getMinHeight-impl(long v) {
        int v1 = ((((int)(3L & v)) & 2) >> 1) * 3 + ((((int)(3L & v)) & 1) << 1);
        return ((int)(v >> v1 + 15)) & (1 << 18 - v1) - 1;
    }

    public static final int getMinWidth-impl(long v) {
        return ((int)(v >> 2)) & (1 << ((((int)(3L & v)) & 2) >> 1) * 3 + ((((int)(3L & v)) & 1) << 1) + 13) - 1;
    }

    @PublishedApi
    public static void getValue$annotations() {
    }

    @Override
    public int hashCode() {
        return Constraints.hashCode-impl(this.a);
    }

    public static int hashCode-impl(long v) {
        return Long.hashCode(v);
    }

    @Stable
    public static void isZero$annotations() {
    }

    public static final boolean isZero-impl(long v) {
        int v1 = ((((int)(3L & v)) & 2) >> 1) * 3 + ((((int)(3L & v)) & 1) << 1);
        return (((int)(v >> 33)) & (1 << v1 + 13) - 1) - 1 == 0 ? true : (((int)(v >> v1 + 46)) & (1 << 18 - v1) - 1) - 1 == 0;
    }

    @Override
    @NotNull
    public String toString() {
        return Constraints.toString-impl(this.a);
    }

    @NotNull
    public static String toString-impl(long v) {
        int v1 = Constraints.getMaxWidth-impl(v);
        String s = "Infinity";
        String s1 = v1 == 0x7FFFFFFF ? "Infinity" : String.valueOf(v1);
        int v2 = Constraints.getMaxHeight-impl(v);
        if(v2 != 0x7FFFFFFF) {
            s = String.valueOf(v2);
        }
        StringBuilder stringBuilder0 = new StringBuilder("Constraints(minWidth = ");
        stringBuilder0.append(Constraints.getMinWidth-impl(v));
        stringBuilder0.append(", maxWidth = ");
        stringBuilder0.append(s1);
        stringBuilder0.append(", minHeight = ");
        stringBuilder0.append(Constraints.getMinHeight-impl(v));
        stringBuilder0.append(", maxHeight = ");
        return a.b(')', s, stringBuilder0);
    }

    public final long unbox-impl() {
        return this.a;
    }
}

