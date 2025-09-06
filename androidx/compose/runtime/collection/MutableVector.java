package androidx.compose.runtime.collection;

import a1.a;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u001E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0006\u0088\u0001\u0089\u0001\u008A\u0001B!\b\u0001\u0012\u000E\u0010\u0005\u001A\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00028\u0000\u00A2\u0006\u0004\b\f\u0010\rJ\u001D\u0010\f\u001A\u00020\u000F2\u0006\u0010\u000E\u001A\u00020\u00062\u0006\u0010\n\u001A\u00028\u0000\u00A2\u0006\u0004\b\f\u0010\u0010J#\u0010\u0013\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\u00062\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00000\u0011\u00A2\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0013\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\u00062\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00000\u0000\u00A2\u0006\u0004\b\u0013\u0010\u0015J\u001E\u0010\u0013\u001A\u00020\u000B2\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0086\b\u00A2\u0006\u0004\b\u0013\u0010\u0016J\u001E\u0010\u0013\u001A\u00020\u000B2\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086\b\u00A2\u0006\u0004\b\u0013\u0010\u0017J\u001B\u0010\u0013\u001A\u00020\u000B2\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\u00A2\u0006\u0004\b\u0013\u0010\u0018J#\u0010\u0013\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\u00062\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00000\u0019\u00A2\u0006\u0004\b\u0013\u0010\u001AJ\u001B\u0010\u0013\u001A\u00020\u000B2\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00000\u0019\u00A2\u0006\u0004\b\u0013\u0010\u001BJ/\u0010\u001E\u001A\u00020\u000B2\u0012\u0010\u001D\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000B0\u001CH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\u001E\u0010\u001FJ/\u0010 \u001A\u00020\u000B2\u0012\u0010\u001D\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000B0\u001CH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b \u0010\u001FJ\u0013\u0010\"\u001A\b\u0012\u0004\u0012\u00028\u00000!\u00A2\u0006\u0004\b\"\u0010#J\r\u0010$\u001A\u00020\u000F\u00A2\u0006\u0004\b$\u0010%J\u0018\u0010&\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00028\u0000H\u0086\u0002\u00A2\u0006\u0004\b&\u0010\rJ\u001B\u0010\'\u001A\u00020\u000B2\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00000\u0011\u00A2\u0006\u0004\b\'\u0010\u0016J\u001B\u0010\'\u001A\u00020\u000B2\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00000\u0019\u00A2\u0006\u0004\b\'\u0010\u001BJ\u001B\u0010\'\u001A\u00020\u000B2\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00000\u0000\u00A2\u0006\u0004\b\'\u0010\u0017J\u001B\u0010)\u001A\u00020\u000B2\f\u0010(\u001A\b\u0012\u0004\u0012\u00028\u00000\u0000\u00A2\u0006\u0004\b)\u0010\u0017J\u0015\u0010+\u001A\u00020\u000F2\u0006\u0010*\u001A\u00020\u0006\u00A2\u0006\u0004\b+\u0010,J\r\u0010-\u001A\u00028\u0000\u00A2\u0006\u0004\b-\u0010.J/\u0010-\u001A\u00028\u00002\u0012\u0010\u001D\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000B0\u001CH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b-\u0010/J\u0012\u00100\u001A\u0004\u0018\u00018\u0000H\u0086\b\u00A2\u0006\u0004\b0\u0010.J1\u00100\u001A\u0004\u0018\u00018\u00002\u0012\u0010\u001D\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000B0\u001CH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b0\u0010/JR\u00108\u001A\u00028\u0001\"\u0004\b\u0001\u001012\u0006\u00102\u001A\u00028\u00012\'\u00107\u001A#\u0012\u0013\u0012\u00118\u0001\u00A2\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(6\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000103H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u00A2\u0006\u0004\b8\u00109Jg\u0010;\u001A\u00028\u0001\"\u0004\b\u0001\u001012\u0006\u00102\u001A\u00028\u00012<\u00107\u001A8\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(\u000E\u0012\u0013\u0012\u00118\u0001\u00A2\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(6\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010:H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u00A2\u0006\u0004\b;\u0010<JR\u0010=\u001A\u00028\u0001\"\u0004\b\u0001\u001012\u0006\u00102\u001A\u00028\u00012\'\u00107\u001A#\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00118\u0001\u00A2\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(6\u0012\u0004\u0012\u00028\u000103H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u00A2\u0006\u0004\b=\u00109Jg\u0010>\u001A\u00028\u0001\"\u0004\b\u0001\u001012\u0006\u00102\u001A\u00028\u00012<\u00107\u001A8\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00118\u0001\u00A2\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(6\u0012\u0004\u0012\u00028\u00010:H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u00A2\u0006\u0004\b>\u0010<J/\u0010@\u001A\u00020\u000F2\u0012\u0010?\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000F0\u001CH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b@\u0010AJ5\u0010B\u001A\u00020\u000F2\u0018\u0010?\u001A\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000F03H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\bB\u0010CJ/\u0010D\u001A\u00020\u000F2\u0012\u0010?\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000F0\u001CH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\bD\u0010AJ5\u0010E\u001A\u00020\u000F2\u0018\u0010?\u001A\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000F03H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\bE\u0010CJ\u0018\u0010F\u001A\u00028\u00002\u0006\u0010\u000E\u001A\u00020\u0006H\u0086\n\u00A2\u0006\u0004\bF\u0010GJ\u0015\u0010H\u001A\u00020\u00062\u0006\u0010\n\u001A\u00028\u0000\u00A2\u0006\u0004\bH\u0010IJ/\u0010J\u001A\u00020\u00062\u0012\u0010\u001D\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000B0\u001CH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\bJ\u0010KJ/\u0010L\u001A\u00020\u00062\u0012\u0010\u001D\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000B0\u001CH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\bL\u0010KJ\r\u0010M\u001A\u00020\u000B\u00A2\u0006\u0004\bM\u0010NJ\r\u0010O\u001A\u00020\u000B\u00A2\u0006\u0004\bO\u0010NJ\r\u0010P\u001A\u00028\u0000\u00A2\u0006\u0004\bP\u0010.J/\u0010P\u001A\u00028\u00002\u0012\u0010\u001D\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000B0\u001CH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\bP\u0010/J\u0015\u0010Q\u001A\u00020\u00062\u0006\u0010\n\u001A\u00028\u0000\u00A2\u0006\u0004\bQ\u0010IJ\u0012\u0010R\u001A\u0004\u0018\u00018\u0000H\u0086\b\u00A2\u0006\u0004\bR\u0010.J1\u0010R\u001A\u0004\u0018\u00018\u00002\u0012\u0010\u001D\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000B0\u001CH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\bR\u0010/J=\u0010T\u001A\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0006\b\u0001\u00101\u0018\u00012\u0012\u0010S\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001CH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\bT\u0010UJR\u0010V\u001A\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0006\b\u0001\u00101\u0018\u00012\'\u0010S\u001A#\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000103H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\bV\u0010WJT\u0010X\u001A\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0006\b\u0001\u00101\u0018\u00012)\u0010S\u001A%\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u000103H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\bX\u0010YJ?\u0010Z\u001A\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0006\b\u0001\u00101\u0018\u00012\u0014\u0010S\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u001CH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\bZ\u0010[J\u0018\u0010\\\u001A\u00020\u000F2\u0006\u0010\n\u001A\u00028\u0000H\u0086\n\u00A2\u0006\u0004\b\\\u0010]J\u0018\u0010^\u001A\u00020\u000F2\u0006\u0010\n\u001A\u00028\u0000H\u0086\n\u00A2\u0006\u0004\b^\u0010]J\u0015\u0010_\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00028\u0000\u00A2\u0006\u0004\b_\u0010\rJ\u001B\u0010`\u001A\u00020\u000B2\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00000\u0011\u00A2\u0006\u0004\b`\u0010\u0016J\u001B\u0010`\u001A\u00020\u000B2\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00000\u0000\u00A2\u0006\u0004\b`\u0010\u0017J\u001B\u0010`\u001A\u00020\u000B2\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00000\u0019\u00A2\u0006\u0004\b`\u0010\u001BJ\u0015\u0010a\u001A\u00028\u00002\u0006\u0010\u000E\u001A\u00020\u0006\u00A2\u0006\u0004\ba\u0010GJ\u001D\u0010d\u001A\u00020\u000F2\u0006\u0010b\u001A\u00020\u00062\u0006\u0010c\u001A\u00020\u0006\u00A2\u0006\u0004\bd\u0010eJ\u0017\u0010g\u001A\u00020\u000F2\u0006\u0010f\u001A\u00020\u0006H\u0001\u00A2\u0006\u0004\bg\u0010,J$\u0010h\u001A\u00020\u000F2\u0012\u0010\u001D\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000B0\u001CH\u0086\b\u00A2\u0006\u0004\bh\u0010AJ\u001B\u0010i\u001A\u00020\u000B2\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00000\u0019\u00A2\u0006\u0004\bi\u0010\u001BJ \u0010j\u001A\u00028\u00002\u0006\u0010\u000E\u001A\u00020\u00062\u0006\u0010\n\u001A\u00028\u0000H\u0086\u0002\u00A2\u0006\u0004\bj\u0010kJ%\u0010o\u001A\u00020\u000F2\u0016\u0010n\u001A\u0012\u0012\u0004\u0012\u00028\u00000lj\b\u0012\u0004\u0012\u00028\u0000`m\u00A2\u0006\u0004\bo\u0010pJ/\u0010r\u001A\u00020\u00062\u0012\u0010q\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u001CH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\br\u0010KJ\u000F\u0010t\u001A\u00020sH\u0001\u00A2\u0006\u0004\bt\u0010uR0\u0010\u0005\u001A\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00048\u0000@\u0000X\u0081\u000E\u00A2\u0006\u0018\n\u0004\bv\u0010w\u0012\u0004\b|\u0010%\u001A\u0004\bx\u0010y\"\u0004\bz\u0010{R&\u0010\u0007\u001A\u00020\u00062\u0006\u0010}\u001A\u00020\u00068\u0006@BX\u0086\u000E\u00A2\u0006\u000E\n\u0004\b~\u0010\u007F\u001A\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0015\u0010\u0083\u0001\u001A\u00020\u00068\u00C6\u0002\u00A2\u0006\b\u001A\u0006\b\u0082\u0001\u0010\u0081\u0001R\u0016\u0010\u0087\u0001\u001A\u00030\u0084\u00018\u00C6\u0002\u00A2\u0006\b\u001A\u0006\b\u0085\u0001\u0010\u0086\u0001\u00A8\u0006\u008B\u0001"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector;", "T", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "content", "", "size", "<init>", "([Ljava/lang/Object;I)V", "element", "", "add", "(Ljava/lang/Object;)Z", "index", "", "(ILjava/lang/Object;)V", "", "elements", "addAll", "(ILjava/util/List;)Z", "(ILandroidx/compose/runtime/collection/MutableVector;)Z", "(Ljava/util/List;)Z", "(Landroidx/compose/runtime/collection/MutableVector;)Z", "([Ljava/lang/Object;)Z", "", "(ILjava/util/Collection;)Z", "(Ljava/util/Collection;)Z", "Lkotlin/Function1;", "predicate", "any", "(Lkotlin/jvm/functions/Function1;)Z", "reversedAny", "", "asMutableList", "()Ljava/util/List;", "clear", "()V", "contains", "containsAll", "other", "contentEquals", "capacity", "ensureCapacity", "(I)V", "first", "()Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstOrNull", "R", "initial", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "acc", "operation", "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/Function3;", "foldIndexed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "block", "forEach", "(Lkotlin/jvm/functions/Function1;)V", "forEachIndexed", "(Lkotlin/jvm/functions/Function2;)V", "forEachReversed", "forEachReversedIndexed", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "indexOfFirst", "(Lkotlin/jvm/functions/Function1;)I", "indexOfLast", "isEmpty", "()Z", "isNotEmpty", "last", "lastIndexOf", "lastOrNull", "transform", "map", "(Lkotlin/jvm/functions/Function1;)[Ljava/lang/Object;", "mapIndexed", "(Lkotlin/jvm/functions/Function2;)[Ljava/lang/Object;", "mapIndexedNotNull", "(Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/collection/MutableVector;", "mapNotNull", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/collection/MutableVector;", "plusAssign", "(Ljava/lang/Object;)V", "minusAssign", "remove", "removeAll", "removeAt", "start", "end", "removeRange", "(II)V", "newSize", "setSize", "removeIf", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "sortWith", "(Ljava/util/Comparator;)V", "selector", "sumBy", "", "throwNoSuchElementException", "()Ljava/lang/Void;", "a", "[Ljava/lang/Object;", "getContent", "()[Ljava/lang/Object;", "setContent", "([Ljava/lang/Object;)V", "getContent$annotations", "<set-?>", "c", "I", "getSize", "()I", "getLastIndex", "lastIndex", "Lkotlin/ranges/IntRange;", "getIndices", "()Lkotlin/ranges/IntRange;", "indices", "a1/a", "a1/b", "a1/c", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1220:1\n48#1:1224\n48#1:1225\n523#1:1226\n53#1:1229\n523#1:1230\n48#1:1231\n523#1:1232\n523#1:1233\n523#1:1234\n48#1:1235\n523#1:1236\n48#1:1237\n523#1:1238\n523#1:1239\n523#1:1240\n48#1:1241\n523#1:1242\n48#1:1245\n48#1:1246\n48#1:1247\n523#1:1248\n1864#2,3:1221\n1855#2,2:1227\n1855#2,2:1243\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n249#1:1224\n259#1:1225\n260#1:1226\n292#1:1229\n293#1:1230\n307#1:1231\n308#1:1232\n334#1:1233\n359#1:1234\n595#1:1235\n595#1:1236\n637#1:1237\n637#1:1238\n665#1:1239\n675#1:1240\n768#1:1241\n769#1:1242\n794#1:1245\n821#1:1246\n859#1:1247\n860#1:1248\n185#1:1221,3\n281#1:1227,2\n782#1:1243,2\n*E\n"})
public final class MutableVector implements RandomAccess {
    public static final int $stable = 8;
    public Object[] a;
    public a b;
    public int c;

    @PublishedApi
    public MutableVector(@NotNull Object[] arr_object, int v) {
        this.a = arr_object;
        this.c = v;
    }

    public final void add(int v, Object object0) {
        this.ensureCapacity(this.c + 1);
        Object[] arr_object = this.a;
        int v1 = this.c;
        if(v != v1) {
            ArraysKt___ArraysJvmKt.copyInto(arr_object, arr_object, v + 1, v, v1);
        }
        arr_object[v] = object0;
        ++this.c;
    }

    public final boolean add(Object object0) {
        this.ensureCapacity(this.c + 1);
        int v = this.c;
        this.a[v] = object0;
        this.c = v + 1;
        return true;
    }

    public final boolean addAll(int v, @NotNull MutableVector mutableVector0) {
        if(mutableVector0.isEmpty()) {
            return false;
        }
        this.ensureCapacity(this.c + mutableVector0.c);
        Object[] arr_object = this.a;
        int v1 = this.c;
        if(v != v1) {
            ArraysKt___ArraysJvmKt.copyInto(arr_object, arr_object, mutableVector0.c + v, v, v1);
        }
        ArraysKt___ArraysJvmKt.copyInto(mutableVector0.a, arr_object, v, 0, mutableVector0.c);
        this.c += mutableVector0.c;
        return true;
    }

    public final boolean addAll(int v, @NotNull Collection collection0) {
        int v1 = 0;
        if(collection0.isEmpty()) {
            return false;
        }
        this.ensureCapacity(collection0.size() + this.c);
        Object[] arr_object = this.a;
        if(v != this.c) {
            ArraysKt___ArraysJvmKt.copyInto(arr_object, arr_object, collection0.size() + v, v, this.c);
        }
        for(Object object0: collection0) {
            if(v1 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            arr_object[v1 + v] = object0;
            ++v1;
        }
        this.c = collection0.size() + this.c;
        return true;
    }

    public final boolean addAll(int v, @NotNull List list0) {
        if(list0.isEmpty()) {
            return false;
        }
        this.ensureCapacity(list0.size() + this.c);
        Object[] arr_object = this.a;
        if(v != this.c) {
            ArraysKt___ArraysJvmKt.copyInto(arr_object, arr_object, list0.size() + v, v, this.c);
        }
        int v2 = list0.size();
        for(int v1 = 0; v1 < v2; ++v1) {
            arr_object[v + v1] = list0.get(v1);
        }
        this.c = list0.size() + this.c;
        return true;
    }

    public final boolean addAll(@NotNull MutableVector mutableVector0) {
        return this.addAll(this.getSize(), mutableVector0);
    }

    public final boolean addAll(@NotNull Collection collection0) {
        return this.addAll(this.c, collection0);
    }

    public final boolean addAll(@NotNull List list0) {
        return this.addAll(this.getSize(), list0);
    }

    public final boolean addAll(@NotNull Object[] arr_object) {
        if(arr_object.length == 0) {
            return false;
        }
        this.ensureCapacity(this.c + arr_object.length);
        ArraysKt___ArraysJvmKt.copyInto$default(arr_object, this.a, this.c, 0, 0, 12, null);
        this.c += arr_object.length;
        return true;
    }

    public final boolean any(@NotNull Function1 function10) {
        int v = this.getSize();
        if(v > 0) {
            Object[] arr_object = this.getContent();
            int v1 = 0;
            while(true) {
                if(((Boolean)function10.invoke(arr_object[v1])).booleanValue()) {
                    return true;
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        return false;
    }

    @NotNull
    public final List asMutableList() {
        a a0 = this.b;
        if(a0 == null) {
            a0 = new a(this);
            this.b = a0;
        }
        return a0;
    }

    public final void clear() {
        Object[] arr_object = this.a;
        for(int v = this.getSize() - 1; -1 < v; --v) {
            arr_object[v] = null;
        }
        this.c = 0;
    }

    public final boolean contains(Object object0) {
        int v = this.getSize();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                if(Intrinsics.areEqual(this.getContent()[v1], object0)) {
                    return true;
                }
                if(v1 == v - 1) {
                    break;
                }
            }
        }
        return false;
    }

    public final boolean containsAll(@NotNull MutableVector mutableVector0) {
        IntRange intRange0 = new IntRange(0, mutableVector0.getSize() - 1);
        int v = intRange0.getFirst();
        int v1 = intRange0.getLast();
        if(v <= v1) {
            while(true) {
                if(!this.contains(mutableVector0.getContent()[v])) {
                    return false;
                }
                if(v == v1) {
                    break;
                }
                ++v;
            }
        }
        return true;
    }

    public final boolean containsAll(@NotNull Collection collection0) {
        for(Object object0: collection0) {
            if(!this.contains(object0)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    public final boolean containsAll(@NotNull List list0) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!this.contains(list0.get(v1))) {
                return false;
            }
        }
        return true;
    }

    public final boolean contentEquals(@NotNull MutableVector mutableVector0) {
        if(mutableVector0.c != this.c) {
            return false;
        }
        int v = this.getSize();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                if(!Intrinsics.areEqual(mutableVector0.getContent()[v1], this.getContent()[v1])) {
                    return false;
                }
                if(v1 == v - 1) {
                    break;
                }
            }
        }
        return true;
    }

    public final void ensureCapacity(int v) {
        Object[] arr_object = this.a;
        if(arr_object.length < v) {
            Object[] arr_object1 = Arrays.copyOf(arr_object, Math.max(v, arr_object.length * 2));
            Intrinsics.checkNotNullExpressionValue(arr_object1, "copyOf(this, newSize)");
            this.a = arr_object1;
        }
    }

    public final Object first() {
        if(this.isEmpty()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return this.getContent()[0];
    }

    public final Object first(@NotNull Function1 function10) {
        int v = this.getSize();
        if(v > 0) {
            Object[] arr_object = this.getContent();
            int v1 = 0;
            while(true) {
                Object object0 = arr_object[v1];
                if(((Boolean)function10.invoke(object0)).booleanValue()) {
                    return object0;
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        this.throwNoSuchElementException();
        throw new KotlinNothingValueException();
    }

    // 去混淆评级： 低(20)
    @Nullable
    public final Object firstOrNull() {
        return this.isEmpty() ? null : this.getContent()[0];
    }

    @Nullable
    public final Object firstOrNull(@NotNull Function1 function10) {
        int v = this.getSize();
        if(v > 0) {
            Object[] arr_object = this.getContent();
            int v1 = 0;
            while(true) {
                Object object0 = arr_object[v1];
                if(((Boolean)function10.invoke(object0)).booleanValue()) {
                    return object0;
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        return null;
    }

    public final Object fold(Object object0, @NotNull Function2 function20) {
        int v = this.getSize();
        if(v > 0) {
            Object[] arr_object = this.getContent();
            int v1 = 0;
            while(true) {
                object0 = function20.invoke(object0, arr_object[v1]);
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        return object0;
    }

    public final Object foldIndexed(Object object0, @NotNull Function3 function30) {
        int v = this.getSize();
        if(v > 0) {
            Object[] arr_object = this.getContent();
            int v1 = 0;
            while(true) {
                object0 = function30.invoke(v1, object0, arr_object[v1]);
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        return object0;
    }

    public final Object foldRight(Object object0, @NotNull Function2 function20) {
        int v = this.getSize();
        if(v > 0) {
            int v1 = v - 1;
            Object[] arr_object = this.getContent();
            while(true) {
                object0 = function20.invoke(arr_object[v1], object0);
                --v1;
                if(v1 < 0) {
                    break;
                }
            }
        }
        return object0;
    }

    public final Object foldRightIndexed(Object object0, @NotNull Function3 function30) {
        int v = this.getSize();
        if(v > 0) {
            int v1 = v - 1;
            Object[] arr_object = this.getContent();
            while(true) {
                object0 = function30.invoke(v1, arr_object[v1], object0);
                --v1;
                if(v1 < 0) {
                    break;
                }
            }
        }
        return object0;
    }

    public final void forEach(@NotNull Function1 function10) {
        int v = this.getSize();
        if(v > 0) {
            Object[] arr_object = this.getContent();
            int v1 = 0;
            while(true) {
                function10.invoke(arr_object[v1]);
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    public final void forEachIndexed(@NotNull Function2 function20) {
        int v = this.getSize();
        if(v > 0) {
            Object[] arr_object = this.getContent();
            int v1 = 0;
            while(true) {
                function20.invoke(v1, arr_object[v1]);
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    public final void forEachReversed(@NotNull Function1 function10) {
        int v = this.getSize();
        if(v > 0) {
            int v1 = v - 1;
            Object[] arr_object = this.getContent();
            while(true) {
                function10.invoke(arr_object[v1]);
                --v1;
                if(v1 < 0) {
                    break;
                }
            }
        }
    }

    public final void forEachReversedIndexed(@NotNull Function2 function20) {
        if(this.getSize() > 0) {
            int v = this.getSize() - 1;
            Object[] arr_object = this.getContent();
            while(true) {
                function20.invoke(v, arr_object[v]);
                --v;
                if(v < 0) {
                    break;
                }
            }
        }
    }

    public final Object get(int v) {
        return this.getContent()[v];
    }

    @NotNull
    public final Object[] getContent() {
        return this.a;
    }

    @PublishedApi
    public static void getContent$annotations() {
    }

    @NotNull
    public final IntRange getIndices() {
        return new IntRange(0, this.getSize() - 1);
    }

    public final int getLastIndex() {
        return this.getSize() - 1;
    }

    public final int getSize() {
        return this.c;
    }

    public final int indexOf(Object object0) {
        int v = this.c;
        if(v > 0) {
            Object[] arr_object = this.a;
            int v1 = 0;
            while(true) {
                if(Intrinsics.areEqual(object0, arr_object[v1])) {
                    return v1;
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        return -1;
    }

    public final int indexOfFirst(@NotNull Function1 function10) {
        int v = this.getSize();
        if(v > 0) {
            Object[] arr_object = this.getContent();
            int v1 = 0;
            while(true) {
                if(((Boolean)function10.invoke(arr_object[v1])).booleanValue()) {
                    return v1;
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        return -1;
    }

    public final int indexOfLast(@NotNull Function1 function10) {
        int v = this.getSize();
        if(v > 0) {
            int v1 = v - 1;
            Object[] arr_object = this.getContent();
            while(true) {
                if(((Boolean)function10.invoke(arr_object[v1])).booleanValue()) {
                    return v1;
                }
                --v1;
                if(v1 < 0) {
                    break;
                }
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        return this.c == 0;
    }

    public final boolean isNotEmpty() {
        return this.c != 0;
    }

    public final Object last() {
        if(this.isEmpty()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return this.getContent()[this.getSize() - 1];
    }

    public final Object last(@NotNull Function1 function10) {
        int v = this.getSize();
        if(v > 0) {
            int v1 = v - 1;
            Object[] arr_object = this.getContent();
            while(true) {
                Object object0 = arr_object[v1];
                if(((Boolean)function10.invoke(object0)).booleanValue()) {
                    return object0;
                }
                --v1;
                if(v1 < 0) {
                    break;
                }
            }
        }
        this.throwNoSuchElementException();
        throw new KotlinNothingValueException();
    }

    public final int lastIndexOf(Object object0) {
        int v = this.c;
        if(v > 0) {
            int v1 = v - 1;
            Object[] arr_object = this.a;
            while(true) {
                if(Intrinsics.areEqual(object0, arr_object[v1])) {
                    return v1;
                }
                --v1;
                if(v1 < 0) {
                    break;
                }
            }
        }
        return -1;
    }

    // 去混淆评级： 低(20)
    @Nullable
    public final Object lastOrNull() {
        return this.isEmpty() ? null : this.getContent()[this.getSize() - 1];
    }

    @Nullable
    public final Object lastOrNull(@NotNull Function1 function10) {
        int v = this.getSize();
        if(v > 0) {
            int v1 = v - 1;
            Object[] arr_object = this.getContent();
            while(true) {
                Object object0 = arr_object[v1];
                if(((Boolean)function10.invoke(object0)).booleanValue()) {
                    return object0;
                }
                --v1;
                if(v1 < 0) {
                    break;
                }
            }
        }
        return null;
    }

    public final Object[] map(Function1 function10) {
        int v = this.getSize();
        Intrinsics.reifiedOperationMarker(0, "R");
        Object[] arr_object = new Object[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = function10.invoke(this.getContent()[v1]);
        }
        return arr_object;
    }

    public final Object[] mapIndexed(Function2 function20) {
        int v = this.getSize();
        Intrinsics.reifiedOperationMarker(0, "R");
        Object[] arr_object = new Object[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = function20.invoke(v1, this.getContent()[v1]);
        }
        return arr_object;
    }

    public final MutableVector mapIndexedNotNull(Function2 function20) {
        int v = this.getSize();
        int v1 = 0;
        Intrinsics.reifiedOperationMarker(0, "R?");
        Object[] arr_object = new Object[v];
        if(v > 0) {
            Object[] arr_object1 = this.getContent();
            int v2 = 0;
            do {
                Object object0 = function20.invoke(v1, arr_object1[v1]);
                if(object0 != null) {
                    arr_object[v2] = object0;
                    ++v2;
                }
                ++v1;
            }
            while(v1 < v);
            v1 = v2;
        }
        return new MutableVector(arr_object, v1);
    }

    public final MutableVector mapNotNull(Function1 function10) {
        int v = this.getSize();
        int v1 = 0;
        Intrinsics.reifiedOperationMarker(0, "R?");
        Object[] arr_object = new Object[v];
        if(v > 0) {
            Object[] arr_object1 = this.getContent();
            int v2 = 0;
            do {
                Object object0 = function10.invoke(arr_object1[v1]);
                if(object0 != null) {
                    arr_object[v2] = object0;
                    ++v2;
                }
                ++v1;
            }
            while(v1 < v);
            v1 = v2;
        }
        return new MutableVector(arr_object, v1);
    }

    public final void minusAssign(Object object0) {
        this.remove(object0);
    }

    public final void plusAssign(Object object0) {
        this.add(object0);
    }

    public final boolean remove(Object object0) {
        int v = this.indexOf(object0);
        if(v >= 0) {
            this.removeAt(v);
            return true;
        }
        return false;
    }

    public final boolean removeAll(@NotNull MutableVector mutableVector0) {
        int v = this.c;
        int v1 = mutableVector0.getSize();
        if(v1 - 1 >= 0) {
            for(int v2 = 0; true; ++v2) {
                this.remove(mutableVector0.getContent()[v2]);
                if(v2 == v1 - 1) {
                    break;
                }
            }
        }
        return v != this.c;
    }

    public final boolean removeAll(@NotNull Collection collection0) {
        if(collection0.isEmpty()) {
            return false;
        }
        int v = this.c;
        for(Object object0: collection0) {
            this.remove(object0);
        }
        return v != this.c;
    }

    public final boolean removeAll(@NotNull List list0) {
        int v = this.c;
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            this.remove(list0.get(v2));
        }
        return v != this.c;
    }

    public final Object removeAt(int v) {
        Object[] arr_object = this.a;
        Object object0 = arr_object[v];
        if(v != this.getSize() - 1) {
            ArraysKt___ArraysJvmKt.copyInto(arr_object, arr_object, v, v + 1, this.c);
        }
        int v1 = this.c - 1;
        this.c = v1;
        arr_object[v1] = null;
        return object0;
    }

    public final void removeIf(@NotNull Function1 function10) {
        int v = this.getSize();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            if(((Boolean)function10.invoke(this.getContent()[v1])).booleanValue()) {
                ++v2;
            }
            else if(v2 > 0) {
                this.getContent()[v1 - v2] = this.getContent()[v1];
            }
        }
        int v3 = v - v2;
        ArraysKt___ArraysJvmKt.fill(this.getContent(), null, v3, v);
        this.setSize(v3);
    }

    public final void removeRange(int v, int v1) {
        if(v1 > v) {
            int v2 = this.c;
            if(v1 < v2) {
                ArraysKt___ArraysJvmKt.copyInto(this.a, this.a, v, v1, v2);
            }
            int v3 = this.c - (v1 - v);
            int v4 = this.getSize();
            if(v3 <= v4 - 1) {
                for(int v5 = v3; true; ++v5) {
                    this.a[v5] = null;
                    if(v5 == v4 - 1) {
                        break;
                    }
                }
            }
            this.c = v3;
        }
    }

    public final boolean retainAll(@NotNull Collection collection0) {
        int v = this.c;
        for(int v1 = this.getSize() - 1; -1 < v1; --v1) {
            if(!collection0.contains(this.getContent()[v1])) {
                this.removeAt(v1);
            }
        }
        return v != this.c;
    }

    public final boolean reversedAny(@NotNull Function1 function10) {
        int v = this.getSize();
        if(v > 0) {
            int v1 = v - 1;
            Object[] arr_object = this.getContent();
            while(true) {
                if(((Boolean)function10.invoke(arr_object[v1])).booleanValue()) {
                    return true;
                }
                --v1;
                if(v1 < 0) {
                    break;
                }
            }
        }
        return false;
    }

    public final Object set(int v, Object object0) {
        Object[] arr_object = this.a;
        Object object1 = arr_object[v];
        arr_object[v] = object0;
        return object1;
    }

    public final void setContent(@NotNull Object[] arr_object) {
        this.a = arr_object;
    }

    @PublishedApi
    public final void setSize(int v) {
        this.c = v;
    }

    public final void sortWith(@NotNull Comparator comparator0) {
        ArraysKt___ArraysJvmKt.sortWith(this.a, comparator0, 0, this.c);
    }

    public final int sumBy(@NotNull Function1 function10) {
        int v = this.getSize();
        int v1 = 0;
        if(v > 0) {
            Object[] arr_object = this.getContent();
            int v2 = 0;
            while(true) {
                v1 += ((Number)function10.invoke(arr_object[v2])).intValue();
                ++v2;
                if(v2 >= v) {
                    break;
                }
            }
        }
        return v1;
    }

    @PublishedApi
    @NotNull
    public final Void throwNoSuchElementException() {
        throw new NoSuchElementException("MutableVector contains no element matching the predicate.");
    }
}

