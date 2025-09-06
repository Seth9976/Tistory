package kotlin.text;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000F\bÆ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0011\u0010\f\u001A\u00020\u00028G¢\u0006\u0006\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u000E\u001A\u00020\u00028G¢\u0006\u0006\u001A\u0004\b\r\u0010\u000BR\u0011\u0010\u0010\u001A\u00020\u00028G¢\u0006\u0006\u001A\u0004\b\u000F\u0010\u000B¨\u0006\u0011"}, d2 = {"Lkotlin/text/Charsets;", "", "Ljava/nio/charset/Charset;", "UTF_8", "Ljava/nio/charset/Charset;", "UTF_16", "UTF_16BE", "UTF_16LE", "US_ASCII", "ISO_8859_1", "UTF32", "()Ljava/nio/charset/Charset;", "UTF_32", "UTF32_LE", "UTF_32LE", "UTF32_BE", "UTF_32BE", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Charsets {
    @NotNull
    public static final Charsets INSTANCE;
    @JvmField
    @NotNull
    public static final Charset ISO_8859_1;
    @JvmField
    @NotNull
    public static final Charset US_ASCII;
    @JvmField
    @NotNull
    public static final Charset UTF_16;
    @JvmField
    @NotNull
    public static final Charset UTF_16BE;
    @JvmField
    @NotNull
    public static final Charset UTF_16LE;
    @JvmField
    @NotNull
    public static final Charset UTF_8;
    public static volatile Charset a;
    public static volatile Charset b;
    public static volatile Charset c;

    static {
        Charsets.INSTANCE = new Charsets();  // 初始化器: Ljava/lang/Object;-><init>()V
        Charset charset0 = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(charset0, "forName(...)");
        Charsets.UTF_8 = charset0;
        Charset charset1 = Charset.forName("UTF-16");
        Intrinsics.checkNotNullExpressionValue(charset1, "forName(...)");
        Charsets.UTF_16 = charset1;
        Charset charset2 = Charset.forName("UTF-16BE");
        Intrinsics.checkNotNullExpressionValue(charset2, "forName(...)");
        Charsets.UTF_16BE = charset2;
        Charset charset3 = Charset.forName("UTF-16LE");
        Intrinsics.checkNotNullExpressionValue(charset3, "forName(...)");
        Charsets.UTF_16LE = charset3;
        Charset charset4 = Charset.forName("US-ASCII");
        Intrinsics.checkNotNullExpressionValue(charset4, "forName(...)");
        Charsets.US_ASCII = charset4;
        Charset charset5 = Charset.forName("ISO-8859-1");
        Intrinsics.checkNotNullExpressionValue(charset5, "forName(...)");
        Charsets.ISO_8859_1 = charset5;
    }

    @JvmName(name = "UTF32")
    @NotNull
    public final Charset UTF32() {
        Charset charset0 = Charsets.a;
        if(charset0 == null) {
            charset0 = Charset.forName("UTF-32");
            Intrinsics.checkNotNullExpressionValue(charset0, "forName(...)");
            Charsets.a = charset0;
        }
        return charset0;
    }

    @JvmName(name = "UTF32_BE")
    @NotNull
    public final Charset UTF32_BE() {
        Charset charset0 = Charsets.c;
        if(charset0 == null) {
            charset0 = Charset.forName("UTF-32BE");
            Intrinsics.checkNotNullExpressionValue(charset0, "forName(...)");
            Charsets.c = charset0;
        }
        return charset0;
    }

    @JvmName(name = "UTF32_LE")
    @NotNull
    public final Charset UTF32_LE() {
        Charset charset0 = Charsets.b;
        if(charset0 == null) {
            charset0 = Charset.forName("UTF-32LE");
            Intrinsics.checkNotNullExpressionValue(charset0, "forName(...)");
            Charsets.b = charset0;
        }
        return charset0;
    }
}

