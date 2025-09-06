package okhttp3;

import java.util.Comparator;
import java.util.LinkedHashMap;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\b\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u000F\u0010\u0005\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000F\u0010\u0006\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004R\u0017\u0010\u0005\u001A\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lokhttp3/CipherSuite;", "", "", "-deprecated_javaName", "()Ljava/lang/String;", "javaName", "toString", "a", "Ljava/lang/String;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CipherSuite {
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b{\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0005\u0010\u0006R*\u0010\t\u001A\u0012\u0012\u0004\u0012\u00020\u00020\u0007j\b\u0012\u0004\u0012\u00020\u0002`\b8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR \u0010\u000E\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0082\u0004\u00A2\u0006\u0006\n\u0004\b\u000E\u0010\u000FR\u0014\u0010\u0010\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0017\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u0014\u0010\u0019\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001A\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u001A\u0010\u0011R\u0014\u0010\u001B\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u001B\u0010\u0011R\u0014\u0010\u001C\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u001C\u0010\u0011R\u0014\u0010\u001D\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u001D\u0010\u0011R\u0014\u0010\u001E\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u001E\u0010\u0011R\u0014\u0010\u001F\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u001F\u0010\u0011R\u0014\u0010 \u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b \u0010\u0011R\u0014\u0010!\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b!\u0010\u0011R\u0014\u0010\"\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\"\u0010\u0011R\u0014\u0010#\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b#\u0010\u0011R\u0014\u0010$\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b$\u0010\u0011R\u0014\u0010%\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b%\u0010\u0011R\u0014\u0010&\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b&\u0010\u0011R\u0014\u0010\'\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\'\u0010\u0011R\u0014\u0010(\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b(\u0010\u0011R\u0014\u0010)\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b)\u0010\u0011R\u0014\u0010*\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b*\u0010\u0011R\u0014\u0010+\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b+\u0010\u0011R\u0014\u0010,\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b,\u0010\u0011R\u0014\u0010-\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b-\u0010\u0011R\u0014\u0010.\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b.\u0010\u0011R\u0014\u0010/\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b/\u0010\u0011R\u0014\u00100\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b0\u0010\u0011R\u0014\u00101\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b1\u0010\u0011R\u0014\u00102\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b2\u0010\u0011R\u0014\u00103\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b3\u0010\u0011R\u0014\u00104\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b4\u0010\u0011R\u0014\u00105\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b5\u0010\u0011R\u0014\u00106\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b6\u0010\u0011R\u0014\u00107\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b7\u0010\u0011R\u0014\u00108\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b8\u0010\u0011R\u0014\u00109\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b9\u0010\u0011R\u0014\u0010:\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b:\u0010\u0011R\u0014\u0010;\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b;\u0010\u0011R\u0014\u0010<\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b<\u0010\u0011R\u0014\u0010=\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b=\u0010\u0011R\u0014\u0010>\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b>\u0010\u0011R\u0014\u0010?\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b?\u0010\u0011R\u0014\u0010@\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b@\u0010\u0011R\u0014\u0010A\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bA\u0010\u0011R\u0014\u0010B\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bB\u0010\u0011R\u0014\u0010C\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bC\u0010\u0011R\u0014\u0010D\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bD\u0010\u0011R\u0014\u0010E\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bE\u0010\u0011R\u0014\u0010F\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bF\u0010\u0011R\u0014\u0010G\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bG\u0010\u0011R\u0014\u0010H\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bH\u0010\u0011R\u0014\u0010I\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bI\u0010\u0011R\u0014\u0010J\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bJ\u0010\u0011R\u0014\u0010K\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bK\u0010\u0011R\u0014\u0010L\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bL\u0010\u0011R\u0014\u0010M\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bM\u0010\u0011R\u0014\u0010N\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bN\u0010\u0011R\u0014\u0010O\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bO\u0010\u0011R\u0014\u0010P\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bP\u0010\u0011R\u0014\u0010Q\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bQ\u0010\u0011R\u0014\u0010R\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bR\u0010\u0011R\u0014\u0010S\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bS\u0010\u0011R\u0014\u0010T\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bT\u0010\u0011R\u0014\u0010U\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bU\u0010\u0011R\u0014\u0010V\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bV\u0010\u0011R\u0014\u0010W\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bW\u0010\u0011R\u0014\u0010X\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bX\u0010\u0011R\u0014\u0010Y\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bY\u0010\u0011R\u0014\u0010Z\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bZ\u0010\u0011R\u0014\u0010[\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b[\u0010\u0011R\u0014\u0010\\\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\\\u0010\u0011R\u0014\u0010]\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b]\u0010\u0011R\u0014\u0010^\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b^\u0010\u0011R\u0014\u0010_\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b_\u0010\u0011R\u0014\u0010`\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b`\u0010\u0011R\u0014\u0010a\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\ba\u0010\u0011R\u0014\u0010b\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bb\u0010\u0011R\u0014\u0010c\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bc\u0010\u0011R\u0014\u0010d\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bd\u0010\u0011R\u0014\u0010e\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\be\u0010\u0011R\u0014\u0010f\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bf\u0010\u0011R\u0014\u0010g\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bg\u0010\u0011R\u0014\u0010h\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bh\u0010\u0011R\u0014\u0010i\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bi\u0010\u0011R\u0014\u0010j\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bj\u0010\u0011R\u0014\u0010k\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bk\u0010\u0011R\u0014\u0010l\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bl\u0010\u0011R\u0014\u0010m\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bm\u0010\u0011R\u0014\u0010n\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bn\u0010\u0011R\u0014\u0010o\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bo\u0010\u0011R\u0014\u0010p\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bp\u0010\u0011R\u0014\u0010q\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bq\u0010\u0011R\u0014\u0010r\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\br\u0010\u0011R\u0014\u0010s\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bs\u0010\u0011R\u0014\u0010t\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bt\u0010\u0011R\u0014\u0010u\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bu\u0010\u0011R\u0014\u0010v\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bv\u0010\u0011R\u0014\u0010w\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bw\u0010\u0011R\u0014\u0010x\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bx\u0010\u0011R\u0014\u0010y\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\by\u0010\u0011R\u0014\u0010z\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bz\u0010\u0011R\u0014\u0010{\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b{\u0010\u0011R\u0014\u0010|\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b|\u0010\u0011R\u0014\u0010}\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b}\u0010\u0011R\u0014\u0010~\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b~\u0010\u0011R\u0014\u0010\u007F\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u007F\u0010\u0011R\u0016\u0010\u0080\u0001\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u0011R\u0016\u0010\u0081\u0001\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0007\n\u0005\b\u0081\u0001\u0010\u0011R\u0016\u0010\u0082\u0001\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0007\n\u0005\b\u0082\u0001\u0010\u0011R\u0016\u0010\u0083\u0001\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0007\n\u0005\b\u0083\u0001\u0010\u0011R\u0016\u0010\u0084\u0001\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0007\n\u0005\b\u0084\u0001\u0010\u0011R\u0016\u0010\u0085\u0001\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0007\n\u0005\b\u0085\u0001\u0010\u0011R\u0016\u0010\u0086\u0001\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0007\n\u0005\b\u0086\u0001\u0010\u0011R\u0016\u0010\u0087\u0001\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0007\n\u0005\b\u0087\u0001\u0010\u0011\u00A8\u0006\u0088\u0001"}, d2 = {"Lokhttp3/CipherSuite$Companion;", "", "", "javaName", "Lokhttp3/CipherSuite;", "forJavaName", "(Ljava/lang/String;)Lokhttp3/CipherSuite;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "ORDER_BY_NAME", "Ljava/util/Comparator;", "getORDER_BY_NAME$okhttp", "()Ljava/util/Comparator;", "", "INSTANCES", "Ljava/util/Map;", "TLS_AES_128_CCM_8_SHA256", "Lokhttp3/CipherSuite;", "TLS_AES_128_CCM_SHA256", "TLS_AES_128_GCM_SHA256", "TLS_AES_256_GCM_SHA384", "TLS_CHACHA20_POLY1305_SHA256", "TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", "TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA", "TLS_DHE_DSS_WITH_AES_128_CBC_SHA", "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", "TLS_DHE_DSS_WITH_DES_CBC_SHA", "TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", "TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_DHE_RSA_WITH_DES_CBC_SHA", "TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA", "TLS_DH_anon_EXPORT_WITH_RC4_40_MD5", "TLS_DH_anon_WITH_3DES_EDE_CBC_SHA", "TLS_DH_anon_WITH_AES_128_CBC_SHA", "TLS_DH_anon_WITH_AES_128_CBC_SHA256", "TLS_DH_anon_WITH_AES_128_GCM_SHA256", "TLS_DH_anon_WITH_AES_256_CBC_SHA", "TLS_DH_anon_WITH_AES_256_CBC_SHA256", "TLS_DH_anon_WITH_AES_256_GCM_SHA384", "TLS_DH_anon_WITH_DES_CBC_SHA", "TLS_DH_anon_WITH_RC4_128_MD5", "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_ECDSA_WITH_NULL_SHA", "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_RSA_WITH_NULL_SHA", "TLS_ECDHE_RSA_WITH_RC4_128_SHA", "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDH_ECDSA_WITH_NULL_SHA", "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", "TLS_ECDH_RSA_WITH_NULL_SHA", "TLS_ECDH_RSA_WITH_RC4_128_SHA", "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", "TLS_ECDH_anon_WITH_NULL_SHA", "TLS_ECDH_anon_WITH_RC4_128_SHA", "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", "TLS_FALLBACK_SCSV", "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", "TLS_KRB5_WITH_DES_CBC_MD5", "TLS_KRB5_WITH_DES_CBC_SHA", "TLS_KRB5_WITH_RC4_128_MD5", "TLS_KRB5_WITH_RC4_128_SHA", "TLS_PSK_WITH_3DES_EDE_CBC_SHA", "TLS_PSK_WITH_AES_128_CBC_SHA", "TLS_PSK_WITH_AES_256_CBC_SHA", "TLS_PSK_WITH_RC4_128_SHA", "TLS_RSA_EXPORT_WITH_DES40_CBC_SHA", "TLS_RSA_EXPORT_WITH_RC4_40_MD5", "TLS_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_RSA_WITH_AES_128_CBC_SHA", "TLS_RSA_WITH_AES_128_CBC_SHA256", "TLS_RSA_WITH_AES_128_GCM_SHA256", "TLS_RSA_WITH_AES_256_CBC_SHA", "TLS_RSA_WITH_AES_256_CBC_SHA256", "TLS_RSA_WITH_AES_256_GCM_SHA384", "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", "TLS_RSA_WITH_DES_CBC_SHA", "TLS_RSA_WITH_NULL_MD5", "TLS_RSA_WITH_NULL_SHA", "TLS_RSA_WITH_NULL_SHA256", "TLS_RSA_WITH_RC4_128_MD5", "TLS_RSA_WITH_RC4_128_SHA", "TLS_RSA_WITH_SEED_CBC_SHA", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static String a(String s) {
            if(p.startsWith$default(s, "TLS_", false, 2, null)) {
                String s1 = s.substring(4);
                Intrinsics.checkNotNullExpressionValue(s1, "this as java.lang.String).substring(startIndex)");
                return "SSL_" + s1;
            }
            if(p.startsWith$default(s, "SSL_", false, 2, null)) {
                String s2 = s.substring(4);
                Intrinsics.checkNotNullExpressionValue(s2, "this as java.lang.String).substring(startIndex)");
                return "TLS_" + s2;
            }
            return s;
        }

        public static final CipherSuite access$init(Companion cipherSuite$Companion0, String s, int v) {
            cipherSuite$Companion0.getClass();
            CipherSuite cipherSuite0 = new CipherSuite(s, null);
            CipherSuite.c.put(s, cipherSuite0);
            return cipherSuite0;
        }

        @JvmStatic
        @NotNull
        public final CipherSuite forJavaName(@NotNull String s) {
            synchronized(this) {
                Intrinsics.checkNotNullParameter(s, "javaName");
                CipherSuite cipherSuite0 = (CipherSuite)CipherSuite.c.get(s);
                if(cipherSuite0 == null) {
                    cipherSuite0 = (CipherSuite)CipherSuite.c.get(Companion.a(s));
                    if(cipherSuite0 == null) {
                        cipherSuite0 = new CipherSuite(s, null);
                    }
                    CipherSuite.c.put(s, cipherSuite0);
                }
                return cipherSuite0;
            }
        }

        @NotNull
        public final Comparator getORDER_BY_NAME$okhttp() {
            return CipherSuite.b;
        }
    }

    @NotNull
    public static final Companion Companion;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_AES_128_CCM_8_SHA256;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_AES_128_CCM_SHA256;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_AES_128_GCM_SHA256;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_AES_256_GCM_SHA384;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_CHACHA20_POLY1305_SHA256;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_CBC_SHA256;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_GCM_SHA256;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_CBC_SHA256;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_GCM_SHA384;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_DHE_DSS_WITH_DES_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_CBC_SHA256;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_GCM_SHA256;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_CBC_SHA256;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_GCM_SHA384;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_DHE_RSA_WITH_DES_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_DH_anon_EXPORT_WITH_RC4_40_MD5;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_DH_anon_WITH_3DES_EDE_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_CBC_SHA256;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_GCM_SHA256;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_CBC_SHA256;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_GCM_SHA384;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_DH_anon_WITH_DES_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_DH_anon_WITH_RC4_128_MD5;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_NULL_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_RC4_128_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDHE_RSA_WITH_NULL_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDHE_RSA_WITH_RC4_128_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_NULL_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_RC4_128_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDH_RSA_WITH_NULL_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDH_RSA_WITH_RC4_128_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDH_anon_WITH_AES_128_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDH_anon_WITH_AES_256_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDH_anon_WITH_NULL_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_ECDH_anon_WITH_RC4_128_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_EMPTY_RENEGOTIATION_INFO_SCSV;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_FALLBACK_SCSV;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_RC4_40_MD5;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_RC4_40_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_KRB5_WITH_3DES_EDE_CBC_MD5;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_KRB5_WITH_3DES_EDE_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_KRB5_WITH_DES_CBC_MD5;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_KRB5_WITH_DES_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_KRB5_WITH_RC4_128_MD5;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_KRB5_WITH_RC4_128_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_PSK_WITH_3DES_EDE_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_PSK_WITH_AES_128_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_PSK_WITH_AES_256_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_PSK_WITH_RC4_128_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_RSA_EXPORT_WITH_DES40_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_RSA_EXPORT_WITH_RC4_40_MD5;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_RSA_WITH_3DES_EDE_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_RSA_WITH_AES_128_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_RSA_WITH_AES_128_CBC_SHA256;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_RSA_WITH_AES_128_GCM_SHA256;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_RSA_WITH_AES_256_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_RSA_WITH_AES_256_CBC_SHA256;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_RSA_WITH_AES_256_GCM_SHA384;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_RSA_WITH_CAMELLIA_128_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_RSA_WITH_CAMELLIA_256_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_RSA_WITH_DES_CBC_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_RSA_WITH_NULL_MD5;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_RSA_WITH_NULL_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_RSA_WITH_NULL_SHA256;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_RSA_WITH_RC4_128_MD5;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_RSA_WITH_RC4_128_SHA;
    @JvmField
    @NotNull
    public static final CipherSuite TLS_RSA_WITH_SEED_CBC_SHA;
    public final String a;
    public static final CipherSuite.Companion.ORDER_BY_NAME.1 b;
    public static final LinkedHashMap c;

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "javaName", imports = {}))
    @JvmName(name = "-deprecated_javaName")
    @NotNull
    public final String -deprecated_javaName() {
        return this.a;
    }

    static {
        Companion cipherSuite$Companion0 = new Companion(null);
        CipherSuite.Companion = cipherSuite$Companion0;
        CipherSuite.b = new CipherSuite.Companion.ORDER_BY_NAME.1();  // 初始化器: Ljava/lang/Object;-><init>()V
        CipherSuite.c = new LinkedHashMap();
        CipherSuite.TLS_RSA_WITH_NULL_MD5 = Companion.access$init(cipherSuite$Companion0, "SSL_RSA_WITH_NULL_MD5", 1);
        CipherSuite.TLS_RSA_WITH_NULL_SHA = Companion.access$init(cipherSuite$Companion0, "SSL_RSA_WITH_NULL_SHA", 2);
        CipherSuite.TLS_RSA_EXPORT_WITH_RC4_40_MD5 = Companion.access$init(cipherSuite$Companion0, "SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        CipherSuite.TLS_RSA_WITH_RC4_128_MD5 = Companion.access$init(cipherSuite$Companion0, "SSL_RSA_WITH_RC4_128_MD5", 4);
        CipherSuite.TLS_RSA_WITH_RC4_128_SHA = Companion.access$init(cipherSuite$Companion0, "SSL_RSA_WITH_RC4_128_SHA", 5);
        CipherSuite.TLS_RSA_EXPORT_WITH_DES40_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        CipherSuite.TLS_RSA_WITH_DES_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "SSL_RSA_WITH_DES_CBC_SHA", 9);
        CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        CipherSuite.TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        CipherSuite.TLS_DHE_DSS_WITH_DES_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        CipherSuite.TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        CipherSuite.TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        CipherSuite.TLS_DHE_RSA_WITH_DES_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        CipherSuite.TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        CipherSuite.TLS_DH_anon_EXPORT_WITH_RC4_40_MD5 = Companion.access$init(cipherSuite$Companion0, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        CipherSuite.TLS_DH_anon_WITH_RC4_128_MD5 = Companion.access$init(cipherSuite$Companion0, "SSL_DH_anon_WITH_RC4_128_MD5", 24);
        CipherSuite.TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        CipherSuite.TLS_DH_anon_WITH_DES_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        CipherSuite.TLS_DH_anon_WITH_3DES_EDE_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        CipherSuite.TLS_KRB5_WITH_DES_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_KRB5_WITH_DES_CBC_SHA", 30);
        CipherSuite.TLS_KRB5_WITH_3DES_EDE_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 0x1F);
        CipherSuite.TLS_KRB5_WITH_RC4_128_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_KRB5_WITH_RC4_128_SHA", 0x20);
        CipherSuite.TLS_KRB5_WITH_DES_CBC_MD5 = Companion.access$init(cipherSuite$Companion0, "TLS_KRB5_WITH_DES_CBC_MD5", 34);
        CipherSuite.TLS_KRB5_WITH_3DES_EDE_CBC_MD5 = Companion.access$init(cipherSuite$Companion0, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        CipherSuite.TLS_KRB5_WITH_RC4_128_MD5 = Companion.access$init(cipherSuite$Companion0, "TLS_KRB5_WITH_RC4_128_MD5", 36);
        CipherSuite.TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        CipherSuite.TLS_KRB5_EXPORT_WITH_RC4_40_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        CipherSuite.TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5 = Companion.access$init(cipherSuite$Companion0, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        CipherSuite.TLS_KRB5_EXPORT_WITH_RC4_40_MD5 = Companion.access$init(cipherSuite$Companion0, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_RSA_WITH_AES_128_CBC_SHA", 0x2F);
        CipherSuite.TLS_DHE_DSS_WITH_AES_128_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        CipherSuite.TLS_DHE_RSA_WITH_AES_128_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        CipherSuite.TLS_DH_anon_WITH_AES_128_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        CipherSuite.TLS_DHE_DSS_WITH_AES_256_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        CipherSuite.TLS_DHE_RSA_WITH_AES_256_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        CipherSuite.TLS_DH_anon_WITH_AES_256_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        CipherSuite.TLS_RSA_WITH_NULL_SHA256 = Companion.access$init(cipherSuite$Companion0, "TLS_RSA_WITH_NULL_SHA256", 59);
        CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA256 = Companion.access$init(cipherSuite$Companion0, "TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA256 = Companion.access$init(cipherSuite$Companion0, "TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        CipherSuite.TLS_DHE_DSS_WITH_AES_128_CBC_SHA256 = Companion.access$init(cipherSuite$Companion0, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 0x40);
        CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        CipherSuite.TLS_DHE_RSA_WITH_AES_128_CBC_SHA256 = Companion.access$init(cipherSuite$Companion0, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        CipherSuite.TLS_DHE_DSS_WITH_AES_256_CBC_SHA256 = Companion.access$init(cipherSuite$Companion0, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        CipherSuite.TLS_DHE_RSA_WITH_AES_256_CBC_SHA256 = Companion.access$init(cipherSuite$Companion0, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        CipherSuite.TLS_DH_anon_WITH_AES_128_CBC_SHA256 = Companion.access$init(cipherSuite$Companion0, "TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        CipherSuite.TLS_DH_anon_WITH_AES_256_CBC_SHA256 = Companion.access$init(cipherSuite$Companion0, "TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 0x84);
        CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 0x87);
        CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 0x88);
        CipherSuite.TLS_PSK_WITH_RC4_128_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_PSK_WITH_RC4_128_SHA", 0x8A);
        CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_PSK_WITH_3DES_EDE_CBC_SHA", 0x8B);
        CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_PSK_WITH_AES_256_CBC_SHA", 0x8D);
        CipherSuite.TLS_RSA_WITH_SEED_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_RSA_WITH_SEED_CBC_SHA", 150);
        CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256 = Companion.access$init(cipherSuite$Companion0, "TLS_RSA_WITH_AES_128_GCM_SHA256", 0x9C);
        CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384 = Companion.access$init(cipherSuite$Companion0, "TLS_RSA_WITH_AES_256_GCM_SHA384", 0x9D);
        CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 = Companion.access$init(cipherSuite$Companion0, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 0x9E);
        CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 = Companion.access$init(cipherSuite$Companion0, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 0x9F);
        CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256 = Companion.access$init(cipherSuite$Companion0, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 0xA2);
        CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 = Companion.access$init(cipherSuite$Companion0, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 0xA3);
        CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256 = Companion.access$init(cipherSuite$Companion0, "TLS_DH_anon_WITH_AES_128_GCM_SHA256", 0xA6);
        CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384 = Companion.access$init(cipherSuite$Companion0, "TLS_DH_anon_WITH_AES_256_GCM_SHA384", 0xA7);
        CipherSuite.TLS_EMPTY_RENEGOTIATION_INFO_SCSV = Companion.access$init(cipherSuite$Companion0, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 0xFF);
        CipherSuite.TLS_FALLBACK_SCSV = Companion.access$init(cipherSuite$Companion0, "TLS_FALLBACK_SCSV", 0x5600);
        CipherSuite.TLS_ECDH_ECDSA_WITH_NULL_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_ECDH_ECDSA_WITH_NULL_SHA", 0xC001);
        CipherSuite.TLS_ECDH_ECDSA_WITH_RC4_128_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 0xC002);
        CipherSuite.TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 0xC003);
        CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 0xC004);
        CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 0xC005);
        CipherSuite.TLS_ECDHE_ECDSA_WITH_NULL_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_ECDHE_ECDSA_WITH_NULL_SHA", 0xC006);
        CipherSuite.TLS_ECDHE_ECDSA_WITH_RC4_128_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 0xC007);
        CipherSuite.TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 0xC008);
        CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 0xC009);
        CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 0xC00A);
        CipherSuite.TLS_ECDH_RSA_WITH_NULL_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_ECDH_RSA_WITH_NULL_SHA", 0xC00B);
        CipherSuite.TLS_ECDH_RSA_WITH_RC4_128_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_ECDH_RSA_WITH_RC4_128_SHA", 0xC00C);
        CipherSuite.TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 0xC00D);
        CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 0xC00E);
        CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 0xC00F);
        CipherSuite.TLS_ECDHE_RSA_WITH_NULL_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_ECDHE_RSA_WITH_NULL_SHA", 0xC010);
        CipherSuite.TLS_ECDHE_RSA_WITH_RC4_128_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_ECDHE_RSA_WITH_RC4_128_SHA", 0xC011);
        CipherSuite.TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 0xC012);
        CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 0xC013);
        CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 0xC014);
        CipherSuite.TLS_ECDH_anon_WITH_NULL_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_ECDH_anon_WITH_NULL_SHA", 0xC015);
        CipherSuite.TLS_ECDH_anon_WITH_RC4_128_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_ECDH_anon_WITH_RC4_128_SHA", 0xC016);
        CipherSuite.TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 0xC017);
        CipherSuite.TLS_ECDH_anon_WITH_AES_128_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 0xC018);
        CipherSuite.TLS_ECDH_anon_WITH_AES_256_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 0xC019);
        CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 = Companion.access$init(cipherSuite$Companion0, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 0xC023);
        CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 = Companion.access$init(cipherSuite$Companion0, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 0xC024);
        CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256 = Companion.access$init(cipherSuite$Companion0, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 0xC025);
        CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384 = Companion.access$init(cipherSuite$Companion0, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 0xC026);
        CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 = Companion.access$init(cipherSuite$Companion0, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 0xC027);
        CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 = Companion.access$init(cipherSuite$Companion0, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 0xC028);
        CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256 = Companion.access$init(cipherSuite$Companion0, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 0xC029);
        CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384 = Companion.access$init(cipherSuite$Companion0, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 0xC02A);
        CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 = Companion.access$init(cipherSuite$Companion0, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 0xC02B);
        CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 = Companion.access$init(cipherSuite$Companion0, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 0xC02C);
        CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256 = Companion.access$init(cipherSuite$Companion0, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 0xC02D);
        CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384 = Companion.access$init(cipherSuite$Companion0, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 0xC02E);
        CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 = Companion.access$init(cipherSuite$Companion0, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 0xC02F);
        CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 = Companion.access$init(cipherSuite$Companion0, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 0xC030);
        CipherSuite.TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256 = Companion.access$init(cipherSuite$Companion0, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 0xC031);
        CipherSuite.TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384 = Companion.access$init(cipherSuite$Companion0, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 0xC032);
        CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 0xC035);
        CipherSuite.TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA = Companion.access$init(cipherSuite$Companion0, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 0xC036);
        CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = Companion.access$init(cipherSuite$Companion0, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 0xCCA8);
        CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 = Companion.access$init(cipherSuite$Companion0, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 0xCCA9);
        CipherSuite.TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = Companion.access$init(cipherSuite$Companion0, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 0xCCAA);
        CipherSuite.TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256 = Companion.access$init(cipherSuite$Companion0, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 0xCCAC);
        CipherSuite.TLS_AES_128_GCM_SHA256 = Companion.access$init(cipherSuite$Companion0, "TLS_AES_128_GCM_SHA256", 0x1301);
        CipherSuite.TLS_AES_256_GCM_SHA384 = Companion.access$init(cipherSuite$Companion0, "TLS_AES_256_GCM_SHA384", 0x1302);
        CipherSuite.TLS_CHACHA20_POLY1305_SHA256 = Companion.access$init(cipherSuite$Companion0, "TLS_CHACHA20_POLY1305_SHA256", 0x1303);
        CipherSuite.TLS_AES_128_CCM_SHA256 = Companion.access$init(cipherSuite$Companion0, "TLS_AES_128_CCM_SHA256", 0x1304);
        CipherSuite.TLS_AES_128_CCM_8_SHA256 = Companion.access$init(cipherSuite$Companion0, "TLS_AES_128_CCM_8_SHA256", 0x1305);
    }

    public CipherSuite(String s, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = s;
    }

    @JvmStatic
    @NotNull
    public static final CipherSuite forJavaName(@NotNull String s) {
        synchronized(CipherSuite.class) {
            return CipherSuite.Companion.forJavaName(s);
        }
    }

    @JvmName(name = "javaName")
    @NotNull
    public final String javaName() {
        return this.a;
    }

    @Override
    @NotNull
    public String toString() {
        return this.a;
    }
}

