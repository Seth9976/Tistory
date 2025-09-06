package androidx.compose.ui.autofill;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\t\b\u0081@\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001A\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000B\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001A\u0010\u0010\u001A\u00020\r2\b\u0010\f\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000E\u0010\u000FR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/autofill/ContentDataType;", "", "", "dataType", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "a", "I", "getDataType", "()I", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
public final class ContentDataType {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0080\u0003\u0018\u00002\u00020\u0001J\u001D\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u001D\u0010\b\u001A\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR\u001D\u0010\f\u001A\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\f\u0010\t\u001A\u0004\b\r\u0010\u000BR\u001D\u0010\u000E\u001A\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u000E\u0010\t\u001A\u0004\b\u000F\u0010\u000BR\u001D\u0010\u0010\u001A\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0010\u0010\t\u001A\u0004\b\u0011\u0010\u000BR\u001D\u0010\u0012\u001A\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0012\u0010\t\u001A\u0004\b\u0013\u0010\u000B\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/autofill/ContentDataType$Companion;", "", "", "value", "Landroidx/compose/ui/autofill/ContentDataType;", "from-LGGHU18$ui_release", "(I)I", "from", "Text", "I", "getText-A48pgw8", "()I", "List", "getList-A48pgw8", "Date", "getDate-A48pgw8", "Toggle", "getToggle-A48pgw8", "None", "getNone-A48pgw8", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final int from-LGGHU18$ui_release(int v) {
            switch(v) {
                case 0: {
                    return 0;
                }
                case 1: {
                    return 1;
                }
                case 2: {
                    return 2;
                }
                case 3: {
                    return 3;
                }
                case 4: {
                    return 4;
                }
                default: {
                    throw new IllegalArgumentException("Invalid autofill type value: " + v);
                }
            }
        }

        // 去混淆评级： 低(20)
        public final int getDate-A48pgw8() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getList-A48pgw8() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getNone-A48pgw8() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getText-A48pgw8() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getToggle-A48pgw8() [...] // 潜在的解密器
    }

    @NotNull
    public static final Companion Companion;
    public final int a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;

    static {
        ContentDataType.Companion = new Companion(null);
        ContentDataType.b = 1;
        ContentDataType.c = 3;
        ContentDataType.d = 4;
        ContentDataType.e = 2;
        ContentDataType.f = 0;
    }

    public ContentDataType(int v) {
        this.a = v;
    }

    public static final int access$getDate$cp() [...] // 潜在的解密器

    public static final int access$getList$cp() [...] // 潜在的解密器

    public static final int access$getNone$cp() [...] // 潜在的解密器

    public static final int access$getText$cp() [...] // 潜在的解密器

    public static final int access$getToggle$cp() [...] // 潜在的解密器

    public static final ContentDataType box-impl(int v) {
        return new ContentDataType(v);
    }

    public static int constructor-impl(int v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return ContentDataType.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(int v, Object object0) {
        return object0 instanceof ContentDataType ? v == ((ContentDataType)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(int v, int v1) {
        return v == v1;
    }

    public final int getDataType() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return ContentDataType.hashCode-impl(this.a);
    }

    public static int hashCode-impl(int v) {
        return v;
    }

    @Override
    public String toString() {
        return ContentDataType.toString-impl(this.a);
    }

    public static String toString-impl(int v) {
        return "ContentDataType(dataType=" + v + ')';
    }

    public final int unbox-impl() {
        return this.a;
    }
}

