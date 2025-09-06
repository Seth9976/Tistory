package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\u000B\u001A\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001A\u0010\u0010\u001A\u00020\r2\b\u0010\f\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000E\u0010\u000FR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/font/DeviceFontFamilyName;", "", "", "name", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "toString-impl", "toString", "", "hashCode-impl", "(Ljava/lang/String;)I", "hashCode", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
@SourceDebugExtension({"SMAP\nDeviceFontFamilyNameFont.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceFontFamilyNameFont.android.kt\nandroidx/compose/ui/text/font/DeviceFontFamilyName\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
public final class DeviceFontFamilyName {
    public final String a;

    public DeviceFontFamilyName(String s) {
        this.a = s;
    }

    public static final DeviceFontFamilyName box-impl(String s) {
        return new DeviceFontFamilyName(s);
    }

    @NotNull
    public static String constructor-impl(@NotNull String s) {
        if(s.length() <= 0) {
            throw new IllegalArgumentException("name may not be empty");
        }
        return s;
    }

    @Override
    public boolean equals(Object object0) {
        return DeviceFontFamilyName.equals-impl(this.a, object0);
    }

    // 去混淆评级： 低(20)
    public static boolean equals-impl(String s, Object object0) {
        return object0 instanceof DeviceFontFamilyName ? Intrinsics.areEqual(s, ((DeviceFontFamilyName)object0).unbox-impl()) : false;
    }

    public static final boolean equals-impl0(String s, String s1) {
        return Intrinsics.areEqual(s, s1);
    }

    @NotNull
    public final String getName() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return DeviceFontFamilyName.hashCode-impl(this.a);
    }

    public static int hashCode-impl(String s) {
        return s.hashCode();
    }

    @Override
    public String toString() {
        return DeviceFontFamilyName.toString-impl(this.a);
    }

    public static String toString-impl(String s) {
        return "DeviceFontFamilyName(name=" + s + ')';
    }

    public final String unbox-impl() {
        return this.a;
    }
}

