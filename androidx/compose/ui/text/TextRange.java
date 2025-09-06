package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u001A\b\u0087@\u0018\u0000 *2\u00020\u0001:\u0001*B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\n\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001B\u0010\f\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\tJ\u0018\u0010\f\u001A\u00020\u00072\u0006\u0010\u000E\u001A\u00020\rH\u0086\u0002¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0014\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0017\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001A\u0010\u001A\u001A\u00020\u00072\b\u0010\u0006\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001C\u001A\u00020\r8F¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u0016R\u0011\u0010\u001E\u001A\u00020\r8F¢\u0006\u0006\u001A\u0004\b\u001D\u0010\u0016R\u0011\u0010 \u001A\u00020\r8F¢\u0006\u0006\u001A\u0004\b\u001F\u0010\u0016R\u0011\u0010\"\u001A\u00020\r8F¢\u0006\u0006\u001A\u0004\b!\u0010\u0016R\u0011\u0010%\u001A\u00020\u00078F¢\u0006\u0006\u001A\u0004\b#\u0010$R\u0011\u0010\'\u001A\u00020\u00078F¢\u0006\u0006\u001A\u0004\b&\u0010$R\u0011\u0010)\u001A\u00020\r8F¢\u0006\u0006\u001A\u0004\b(\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006+"}, d2 = {"Landroidx/compose/ui/text/TextRange;", "", "", "packedValue", "constructor-impl", "(J)J", "other", "", "intersects-5zc-tL8", "(JJ)Z", "intersects", "contains-5zc-tL8", "contains", "", "offset", "contains-impl", "(JI)Z", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "hashCode-impl", "(J)I", "hashCode", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "getStart-impl", "start", "getEnd-impl", "end", "getMin-impl", "min", "getMax-impl", "max", "getCollapsed-impl", "(J)Z", "collapsed", "getReversed-impl", "reversed", "getLength-impl", "length", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
@SourceDebugExtension({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,129:1\n107#2:130\n114#2:131\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRange\n*L\n48#1:130\n50#1:131\n*E\n"})
public final class TextRange {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/TextRange$Companion;", "", "Landroidx/compose/ui/text/TextRange;", "Zero", "J", "getZero-d9O1mEE", "()J", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final long getZero-d9O1mEE() [...] // 潜在的解密器
    }

    @NotNull
    public static final Companion Companion;
    public final long a;
    public static final long b;

    static {
        TextRange.Companion = new Companion(null);
        TextRange.b = TextRangeKt.TextRange(0);
    }

    public TextRange(long v) {
        this.a = v;
    }

    public static final long access$getZero$cp() [...] // 潜在的解密器

    public static final TextRange box-impl(long v) {
        return new TextRange(v);
    }

    public static long constructor-impl(long v) [...] // Inlined contents

    public static final boolean contains-5zc-tL8(long v, long v1) {
        return TextRange.getMin-impl(v) <= TextRange.getMin-impl(v1) && TextRange.getMax-impl(v1) <= TextRange.getMax-impl(v);
    }

    public static final boolean contains-impl(long v, int v1) {
        return v1 < TextRange.getMax-impl(v) && TextRange.getMin-impl(v) <= v1;
    }

    @Override
    public boolean equals(Object object0) {
        return TextRange.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof TextRange ? v == ((TextRange)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return v == v1;
    }

    public static final boolean getCollapsed-impl(long v) {
        return TextRange.getStart-impl(v) == TextRange.getEnd-impl(v);
    }

    public static final int getEnd-impl(long v) {
        return (int)(v & 0xFFFFFFFFL);
    }

    public static final int getLength-impl(long v) {
        return TextRange.getMax-impl(v) - TextRange.getMin-impl(v);
    }

    public static final int getMax-impl(long v) {
        return TextRange.getStart-impl(v) <= TextRange.getEnd-impl(v) ? TextRange.getEnd-impl(v) : TextRange.getStart-impl(v);
    }

    public static final int getMin-impl(long v) {
        return TextRange.getStart-impl(v) <= TextRange.getEnd-impl(v) ? TextRange.getStart-impl(v) : TextRange.getEnd-impl(v);
    }

    public static final boolean getReversed-impl(long v) {
        return TextRange.getStart-impl(v) > TextRange.getEnd-impl(v);
    }

    public static final int getStart-impl(long v) {
        return (int)(v >> 0x20);
    }

    @Override
    public int hashCode() {
        return TextRange.hashCode-impl(this.a);
    }

    public static int hashCode-impl(long v) {
        return Long.hashCode(v);
    }

    public static final boolean intersects-5zc-tL8(long v, long v1) {
        return TextRange.getMin-impl(v) < TextRange.getMax-impl(v1) && TextRange.getMin-impl(v1) < TextRange.getMax-impl(v);
    }

    @Override
    @NotNull
    public String toString() {
        return TextRange.toString-impl(this.a);
    }

    @NotNull
    public static String toString-impl(long v) {
        return "TextRange(" + TextRange.getStart-impl(v) + ", " + TextRange.getEnd-impl(v) + ')';
    }

    public final long unbox-impl() {
        return this.a;
    }
}

