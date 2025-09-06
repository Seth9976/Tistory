package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u000F2\u00020\u0001:\u0001\u000FJ\u000F\u0010\u0005\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001A\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001A\u0010\u000E\u001A\u00020\u000B2\b\u0010\n\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\r\u0088\u0001\u0010\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Landroidx/compose/material3/MenuAnchorType;", "", "", "toString-impl", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Ljava/lang/String;)I", "hashCode", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", "Companion", "name", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
public final class MenuAnchorType {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006R\u001D\u0010\t\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0004\u001A\u0004\b\n\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u000B"}, d2 = {"Landroidx/compose/material3/MenuAnchorType$Companion;", "", "Landroidx/compose/material3/MenuAnchorType;", "PrimaryNotEditable", "Ljava/lang/String;", "getPrimaryNotEditable-Mg6Rgbw", "()Ljava/lang/String;", "PrimaryEditable", "getPrimaryEditable-Mg6Rgbw", "SecondaryEditable", "getSecondaryEditable-Mg6Rgbw", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        @NotNull
        public final String getPrimaryEditable-Mg6Rgbw() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        @NotNull
        public final String getPrimaryNotEditable-Mg6Rgbw() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        @NotNull
        public final String getSecondaryEditable-Mg6Rgbw() [...] // 潜在的解密器
    }

    @NotNull
    public static final Companion Companion;
    public final String a;
    public static final String b;
    public static final String c;
    public static final String d;

    static {
        MenuAnchorType.Companion = new Companion(null);
        MenuAnchorType.b = "PrimaryNotEditable";
        MenuAnchorType.c = "PrimaryEditable";
        MenuAnchorType.d = "SecondaryEditable";
    }

    public MenuAnchorType(String s) {
        this.a = s;
    }

    // 去混淆评级： 低(20)
    public static final String access$getPrimaryEditable$cp() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    public static final String access$getPrimaryNotEditable$cp() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    public static final String access$getSecondaryEditable$cp() [...] // 潜在的解密器

    public static final MenuAnchorType box-impl(String s) {
        return new MenuAnchorType(s);
    }

    @Override
    public boolean equals(Object object0) {
        return MenuAnchorType.equals-impl(this.a, object0);
    }

    // 去混淆评级： 低(20)
    public static boolean equals-impl(String s, Object object0) {
        return object0 instanceof MenuAnchorType ? Intrinsics.areEqual(s, ((MenuAnchorType)object0).unbox-impl()) : false;
    }

    public static final boolean equals-impl0(String s, String s1) {
        return Intrinsics.areEqual(s, s1);
    }

    @Override
    public int hashCode() {
        return MenuAnchorType.hashCode-impl(this.a);
    }

    public static int hashCode-impl(String s) {
        return s.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return this.a;
    }

    @NotNull
    public static String toString-impl(String s) [...] // Inlined contents

    public final String unbox-impl() {
        return this.a;
    }
}

