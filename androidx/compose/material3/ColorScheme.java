package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u0000\u00B8\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000E\n\u0002\bK\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001F\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u00A7\u0002\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0002\u0012\u0006\u0010\t\u001A\u00020\u0002\u0012\u0006\u0010\n\u001A\u00020\u0002\u0012\u0006\u0010\u000B\u001A\u00020\u0002\u0012\u0006\u0010\f\u001A\u00020\u0002\u0012\u0006\u0010\r\u001A\u00020\u0002\u0012\u0006\u0010\u000E\u001A\u00020\u0002\u0012\u0006\u0010\u000F\u001A\u00020\u0002\u0012\u0006\u0010\u0010\u001A\u00020\u0002\u0012\u0006\u0010\u0011\u001A\u00020\u0002\u0012\u0006\u0010\u0012\u001A\u00020\u0002\u0012\u0006\u0010\u0013\u001A\u00020\u0002\u0012\u0006\u0010\u0014\u001A\u00020\u0002\u0012\u0006\u0010\u0015\u001A\u00020\u0002\u0012\u0006\u0010\u0016\u001A\u00020\u0002\u0012\u0006\u0010\u0017\u001A\u00020\u0002\u0012\u0006\u0010\u0018\u001A\u00020\u0002\u0012\u0006\u0010\u0019\u001A\u00020\u0002\u0012\u0006\u0010\u001A\u001A\u00020\u0002\u0012\u0006\u0010\u001B\u001A\u00020\u0002\u0012\u0006\u0010\u001C\u001A\u00020\u0002\u0012\u0006\u0010\u001D\u001A\u00020\u0002\u0012\u0006\u0010\u001E\u001A\u00020\u0002\u0012\u0006\u0010\u001F\u001A\u00020\u0002\u0012\u0006\u0010 \u001A\u00020\u0002\u0012\u0006\u0010!\u001A\u00020\u0002\u0012\u0006\u0010\"\u001A\u00020\u0002\u0012\u0006\u0010#\u001A\u00020\u0002\u0012\u0006\u0010$\u001A\u00020\u0002\u0012\u0006\u0010%\u001A\u00020\u0002\u0012\u0006\u0010&\u001A\u00020\u0002\u00A2\u0006\u0004\b\'\u0010(B\u00F1\u0001\b\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0002\u0012\u0006\u0010\t\u001A\u00020\u0002\u0012\u0006\u0010\n\u001A\u00020\u0002\u0012\u0006\u0010\u000B\u001A\u00020\u0002\u0012\u0006\u0010\f\u001A\u00020\u0002\u0012\u0006\u0010\r\u001A\u00020\u0002\u0012\u0006\u0010\u000E\u001A\u00020\u0002\u0012\u0006\u0010\u000F\u001A\u00020\u0002\u0012\u0006\u0010\u0010\u001A\u00020\u0002\u0012\u0006\u0010\u0011\u001A\u00020\u0002\u0012\u0006\u0010\u0012\u001A\u00020\u0002\u0012\u0006\u0010\u0013\u001A\u00020\u0002\u0012\u0006\u0010\u0014\u001A\u00020\u0002\u0012\u0006\u0010\u0015\u001A\u00020\u0002\u0012\u0006\u0010\u0016\u001A\u00020\u0002\u0012\u0006\u0010\u0017\u001A\u00020\u0002\u0012\u0006\u0010\u0018\u001A\u00020\u0002\u0012\u0006\u0010\u0019\u001A\u00020\u0002\u0012\u0006\u0010\u001A\u001A\u00020\u0002\u0012\u0006\u0010\u001B\u001A\u00020\u0002\u0012\u0006\u0010\u001C\u001A\u00020\u0002\u0012\u0006\u0010\u001D\u001A\u00020\u0002\u0012\u0006\u0010\u001E\u001A\u00020\u0002\u0012\u0006\u0010\u001F\u001A\u00020\u0002\u00A2\u0006\u0004\b\'\u0010)J\u00F8\u0002\u0010,\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00022\b\b\u0002\u0010\t\u001A\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u000B\u001A\u00020\u00022\b\b\u0002\u0010\f\u001A\u00020\u00022\b\b\u0002\u0010\r\u001A\u00020\u00022\b\b\u0002\u0010\u000E\u001A\u00020\u00022\b\b\u0002\u0010\u000F\u001A\u00020\u00022\b\b\u0002\u0010\u0010\u001A\u00020\u00022\b\b\u0002\u0010\u0011\u001A\u00020\u00022\b\b\u0002\u0010\u0012\u001A\u00020\u00022\b\b\u0002\u0010\u0013\u001A\u00020\u00022\b\b\u0002\u0010\u0014\u001A\u00020\u00022\b\b\u0002\u0010\u0015\u001A\u00020\u00022\b\b\u0002\u0010\u0016\u001A\u00020\u00022\b\b\u0002\u0010\u0017\u001A\u00020\u00022\b\b\u0002\u0010\u0018\u001A\u00020\u00022\b\b\u0002\u0010\u0019\u001A\u00020\u00022\b\b\u0002\u0010\u001A\u001A\u00020\u00022\b\b\u0002\u0010\u001B\u001A\u00020\u00022\b\b\u0002\u0010\u001C\u001A\u00020\u00022\b\b\u0002\u0010\u001D\u001A\u00020\u00022\b\b\u0002\u0010\u001E\u001A\u00020\u00022\b\b\u0002\u0010\u001F\u001A\u00020\u00022\b\b\u0002\u0010 \u001A\u00020\u00022\b\b\u0002\u0010!\u001A\u00020\u00022\b\b\u0002\u0010\"\u001A\u00020\u00022\b\b\u0002\u0010#\u001A\u00020\u00022\b\b\u0002\u0010$\u001A\u00020\u00022\b\b\u0002\u0010%\u001A\u00020\u00022\b\b\u0002\u0010&\u001A\u00020\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\b*\u0010+J\u00B4\u0002\u0010,\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00022\b\b\u0002\u0010\t\u001A\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u000B\u001A\u00020\u00022\b\b\u0002\u0010\f\u001A\u00020\u00022\b\b\u0002\u0010\r\u001A\u00020\u00022\b\b\u0002\u0010\u000E\u001A\u00020\u00022\b\b\u0002\u0010\u000F\u001A\u00020\u00022\b\b\u0002\u0010\u0010\u001A\u00020\u00022\b\b\u0002\u0010\u0011\u001A\u00020\u00022\b\b\u0002\u0010\u0012\u001A\u00020\u00022\b\b\u0002\u0010\u0013\u001A\u00020\u00022\b\b\u0002\u0010\u0014\u001A\u00020\u00022\b\b\u0002\u0010\u0015\u001A\u00020\u00022\b\b\u0002\u0010\u0016\u001A\u00020\u00022\b\b\u0002\u0010\u0017\u001A\u00020\u00022\b\b\u0002\u0010\u0018\u001A\u00020\u00022\b\b\u0002\u0010\u0019\u001A\u00020\u00022\b\b\u0002\u0010\u001A\u001A\u00020\u00022\b\b\u0002\u0010\u001B\u001A\u00020\u00022\b\b\u0002\u0010\u001C\u001A\u00020\u00022\b\b\u0002\u0010\u001D\u001A\u00020\u00022\b\b\u0002\u0010\u001E\u001A\u00020\u00022\b\b\u0002\u0010\u001F\u001A\u00020\u0002H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b-\u0010.J\u000F\u00100\u001A\u00020/H\u0016\u00A2\u0006\u0004\b0\u00101R\u001D\u0010\u0003\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u00105R\u001D\u0010\u0004\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b6\u00103\u001A\u0004\b7\u00105R\u001D\u0010\u0005\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b8\u00103\u001A\u0004\b9\u00105R\u001D\u0010\u0006\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b:\u00103\u001A\u0004\b;\u00105R\u001D\u0010\u0007\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b<\u00103\u001A\u0004\b=\u00105R\u001D\u0010\b\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b>\u00103\u001A\u0004\b?\u00105R\u001D\u0010\t\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b@\u00103\u001A\u0004\bA\u00105R\u001D\u0010\n\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bB\u00103\u001A\u0004\bC\u00105R\u001D\u0010\u000B\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bD\u00103\u001A\u0004\bE\u00105R\u001D\u0010\f\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bF\u00103\u001A\u0004\bG\u00105R\u001D\u0010\r\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bH\u00103\u001A\u0004\bI\u00105R\u001D\u0010\u000E\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bJ\u00103\u001A\u0004\bK\u00105R\u001D\u0010\u000F\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bL\u00103\u001A\u0004\bM\u00105R\u001D\u0010\u0010\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bN\u00103\u001A\u0004\bO\u00105R\u001D\u0010\u0011\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bP\u00103\u001A\u0004\bQ\u00105R\u001D\u0010\u0012\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bR\u00103\u001A\u0004\bS\u00105R\u001D\u0010\u0013\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bT\u00103\u001A\u0004\bU\u00105R\u001D\u0010\u0014\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bV\u00103\u001A\u0004\bW\u00105R\u001D\u0010\u0015\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bX\u00103\u001A\u0004\bY\u00105R\u001D\u0010\u0016\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bZ\u00103\u001A\u0004\b[\u00105R\u001D\u0010\u0017\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\\\u00103\u001A\u0004\b]\u00105R\u001D\u0010\u0018\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b^\u00103\u001A\u0004\b_\u00105R\u001D\u0010\u0019\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b`\u00103\u001A\u0004\ba\u00105R\u001D\u0010\u001A\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bb\u00103\u001A\u0004\bc\u00105R\u001D\u0010\u001B\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bd\u00103\u001A\u0004\be\u00105R\u001D\u0010\u001C\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bf\u00103\u001A\u0004\bg\u00105R\u001D\u0010\u001D\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bh\u00103\u001A\u0004\bi\u00105R\u001D\u0010\u001E\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bj\u00103\u001A\u0004\bk\u00105R\u001D\u0010\u001F\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bl\u00103\u001A\u0004\bm\u00105R\u001D\u0010 \u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bn\u00103\u001A\u0004\bo\u00105R\u001D\u0010!\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bp\u00103\u001A\u0004\bq\u00105R\u001D\u0010\"\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\br\u00103\u001A\u0004\bs\u00105R\u001D\u0010#\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bt\u00103\u001A\u0004\bu\u00105R\u001D\u0010$\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bv\u00103\u001A\u0004\bw\u00105R\u001D\u0010%\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bx\u00103\u001A\u0004\by\u00105R\u001D\u0010&\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b3\u00103\u001A\u0004\bz\u00105R\'\u0010\u0082\u0001\u001A\u0004\u0018\u00010{8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0014\n\u0004\b|\u0010}\u001A\u0004\b~\u0010\u007F\"\u0006\b\u0080\u0001\u0010\u0081\u0001R)\u0010\u0086\u0001\u001A\u0004\u0018\u00010{8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0016\n\u0005\b\u0083\u0001\u0010}\u001A\u0005\b\u0084\u0001\u0010\u007F\"\u0006\b\u0085\u0001\u0010\u0081\u0001R)\u0010\u008A\u0001\u001A\u0004\u0018\u00010{8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0016\n\u0005\b\u0087\u0001\u0010}\u001A\u0005\b\u0088\u0001\u0010\u007F\"\u0006\b\u0089\u0001\u0010\u0081\u0001R)\u0010\u008E\u0001\u001A\u0004\u0018\u00010{8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0016\n\u0005\b\u008B\u0001\u0010}\u001A\u0005\b\u008C\u0001\u0010\u007F\"\u0006\b\u008D\u0001\u0010\u0081\u0001R)\u0010\u0092\u0001\u001A\u0004\u0018\u00010{8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0016\n\u0005\b\u008F\u0001\u0010}\u001A\u0005\b\u0090\u0001\u0010\u007F\"\u0006\b\u0091\u0001\u0010\u0081\u0001R,\u0010\u009A\u0001\u001A\u0005\u0018\u00010\u0093\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001A\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R,\u0010\u009E\u0001\u001A\u0005\u0018\u00010\u0093\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u009B\u0001\u0010\u0095\u0001\u001A\u0006\b\u009C\u0001\u0010\u0097\u0001\"\u0006\b\u009D\u0001\u0010\u0099\u0001R,\u0010\u00A2\u0001\u001A\u0005\u0018\u00010\u0093\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u009F\u0001\u0010\u0095\u0001\u001A\u0006\b\u00A0\u0001\u0010\u0097\u0001\"\u0006\b\u00A1\u0001\u0010\u0099\u0001R,\u0010\u00AA\u0001\u001A\u0005\u0018\u00010\u00A3\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00A4\u0001\u0010\u00A5\u0001\u001A\u0006\b\u00A6\u0001\u0010\u00A7\u0001\"\u0006\b\u00A8\u0001\u0010\u00A9\u0001R,\u0010\u00AE\u0001\u001A\u0005\u0018\u00010\u00A3\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00AB\u0001\u0010\u00A5\u0001\u001A\u0006\b\u00AC\u0001\u0010\u00A7\u0001\"\u0006\b\u00AD\u0001\u0010\u00A9\u0001R,\u0010\u00B2\u0001\u001A\u0005\u0018\u00010\u00A3\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00AF\u0001\u0010\u00A5\u0001\u001A\u0006\b\u00B0\u0001\u0010\u00A7\u0001\"\u0006\b\u00B1\u0001\u0010\u00A9\u0001R,\u0010\u00B6\u0001\u001A\u0005\u0018\u00010\u00A3\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00B3\u0001\u0010\u00A5\u0001\u001A\u0006\b\u00B4\u0001\u0010\u00A7\u0001\"\u0006\b\u00B5\u0001\u0010\u00A9\u0001R,\u0010\u00BE\u0001\u001A\u0005\u0018\u00010\u00B7\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00B8\u0001\u0010\u00B9\u0001\u001A\u0006\b\u00BA\u0001\u0010\u00BB\u0001\"\u0006\b\u00BC\u0001\u0010\u00BD\u0001R,\u0010\u00C2\u0001\u001A\u0005\u0018\u00010\u00B7\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00BF\u0001\u0010\u00B9\u0001\u001A\u0006\b\u00C0\u0001\u0010\u00BB\u0001\"\u0006\b\u00C1\u0001\u0010\u00BD\u0001R,\u0010\u00C6\u0001\u001A\u0005\u0018\u00010\u00B7\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00C3\u0001\u0010\u00B9\u0001\u001A\u0006\b\u00C4\u0001\u0010\u00BB\u0001\"\u0006\b\u00C5\u0001\u0010\u00BD\u0001R4\u0010\u00D0\u0001\u001A\u0005\u0018\u00010\u00C7\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006 \n\u0006\b\u00C8\u0001\u0010\u00C9\u0001\u0012\u0006\b\u00CE\u0001\u0010\u00CF\u0001\u001A\u0006\b\u00CA\u0001\u0010\u00CB\u0001\"\u0006\b\u00CC\u0001\u0010\u00CD\u0001R4\u0010\u00D5\u0001\u001A\u0005\u0018\u00010\u00C7\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006 \n\u0006\b\u00D1\u0001\u0010\u00C9\u0001\u0012\u0006\b\u00D4\u0001\u0010\u00CF\u0001\u001A\u0006\b\u00D2\u0001\u0010\u00CB\u0001\"\u0006\b\u00D3\u0001\u0010\u00CD\u0001R4\u0010\u00DA\u0001\u001A\u0005\u0018\u00010\u00C7\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006 \n\u0006\b\u00D6\u0001\u0010\u00C9\u0001\u0012\u0006\b\u00D9\u0001\u0010\u00CF\u0001\u001A\u0006\b\u00D7\u0001\u0010\u00CB\u0001\"\u0006\b\u00D8\u0001\u0010\u00CD\u0001R4\u0010\u00DF\u0001\u001A\u0005\u0018\u00010\u00C7\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006 \n\u0006\b\u00DB\u0001\u0010\u00C9\u0001\u0012\u0006\b\u00DE\u0001\u0010\u00CF\u0001\u001A\u0006\b\u00DC\u0001\u0010\u00CB\u0001\"\u0006\b\u00DD\u0001\u0010\u00CD\u0001R,\u0010\u00E7\u0001\u001A\u0005\u0018\u00010\u00E0\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00E1\u0001\u0010\u00E2\u0001\u001A\u0006\b\u00E3\u0001\u0010\u00E4\u0001\"\u0006\b\u00E5\u0001\u0010\u00E6\u0001R4\u0010\u00F0\u0001\u001A\u0005\u0018\u00010\u00E8\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006 \n\u0006\b\u00E9\u0001\u0010\u00EA\u0001\u0012\u0006\b\u00EF\u0001\u0010\u00CF\u0001\u001A\u0006\b\u00EB\u0001\u0010\u00EC\u0001\"\u0006\b\u00ED\u0001\u0010\u00EE\u0001R,\u0010\u00F8\u0001\u001A\u0005\u0018\u00010\u00F1\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00F2\u0001\u0010\u00F3\u0001\u001A\u0006\b\u00F4\u0001\u0010\u00F5\u0001\"\u0006\b\u00F6\u0001\u0010\u00F7\u0001R,\u0010\u0080\u0002\u001A\u0005\u0018\u00010\u00F9\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00FA\u0001\u0010\u00FB\u0001\u001A\u0006\b\u00FC\u0001\u0010\u00FD\u0001\"\u0006\b\u00FE\u0001\u0010\u00FF\u0001R,\u0010\u0084\u0002\u001A\u0005\u0018\u00010\u00F1\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u0081\u0002\u0010\u00F3\u0001\u001A\u0006\b\u0082\u0002\u0010\u00F5\u0001\"\u0006\b\u0083\u0002\u0010\u00F7\u0001R,\u0010\u0088\u0002\u001A\u0005\u0018\u00010\u00F9\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u0085\u0002\u0010\u00FB\u0001\u001A\u0006\b\u0086\u0002\u0010\u00FD\u0001\"\u0006\b\u0087\u0002\u0010\u00FF\u0001R,\u0010\u008C\u0002\u001A\u0005\u0018\u00010\u00F1\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u0089\u0002\u0010\u00F3\u0001\u001A\u0006\b\u008A\u0002\u0010\u00F5\u0001\"\u0006\b\u008B\u0002\u0010\u00F7\u0001R,\u0010\u0090\u0002\u001A\u0005\u0018\u00010\u00F9\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u008D\u0002\u0010\u00FB\u0001\u001A\u0006\b\u008E\u0002\u0010\u00FD\u0001\"\u0006\b\u008F\u0002\u0010\u00FF\u0001R,\u0010\u0094\u0002\u001A\u0005\u0018\u00010\u00F1\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u0091\u0002\u0010\u00F3\u0001\u001A\u0006\b\u0092\u0002\u0010\u00F5\u0001\"\u0006\b\u0093\u0002\u0010\u00F7\u0001R,\u0010\u0098\u0002\u001A\u0005\u0018\u00010\u00F9\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u0095\u0002\u0010\u00FB\u0001\u001A\u0006\b\u0096\u0002\u0010\u00FD\u0001\"\u0006\b\u0097\u0002\u0010\u00FF\u0001R,\u0010\u00A0\u0002\u001A\u0005\u0018\u00010\u0099\u00028\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u009A\u0002\u0010\u009B\u0002\u001A\u0006\b\u009C\u0002\u0010\u009D\u0002\"\u0006\b\u009E\u0002\u0010\u009F\u0002R,\u0010\u00A8\u0002\u001A\u0005\u0018\u00010\u00A1\u00028\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00A2\u0002\u0010\u00A3\u0002\u001A\u0006\b\u00A4\u0002\u0010\u00A5\u0002\"\u0006\b\u00A6\u0002\u0010\u00A7\u0002R,\u0010\u00B0\u0002\u001A\u0005\u0018\u00010\u00A9\u00028\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00AA\u0002\u0010\u00AB\u0002\u001A\u0006\b\u00AC\u0002\u0010\u00AD\u0002\"\u0006\b\u00AE\u0002\u0010\u00AF\u0002R,\u0010\u00B8\u0002\u001A\u0005\u0018\u00010\u00B1\u00028\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00B2\u0002\u0010\u00B3\u0002\u001A\u0006\b\u00B4\u0002\u0010\u00B5\u0002\"\u0006\b\u00B6\u0002\u0010\u00B7\u0002R,\u0010\u00C0\u0002\u001A\u0005\u0018\u00010\u00B9\u00028\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00BA\u0002\u0010\u00BB\u0002\u001A\u0006\b\u00BC\u0002\u0010\u00BD\u0002\"\u0006\b\u00BE\u0002\u0010\u00BF\u0002R4\u0010\u00C9\u0002\u001A\u0005\u0018\u00010\u00C1\u00028\u0000@\u0000X\u0080\u000E\u00A2\u0006 \n\u0006\b\u00C2\u0002\u0010\u00C3\u0002\u0012\u0006\b\u00C8\u0002\u0010\u00CF\u0001\u001A\u0006\b\u00C4\u0002\u0010\u00C5\u0002\"\u0006\b\u00C6\u0002\u0010\u00C7\u0002R,\u0010\u00D1\u0002\u001A\u0005\u0018\u00010\u00CA\u00028\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00CB\u0002\u0010\u00CC\u0002\u001A\u0006\b\u00CD\u0002\u0010\u00CE\u0002\"\u0006\b\u00CF\u0002\u0010\u00D0\u0002R,\u0010\u00D9\u0002\u001A\u0005\u0018\u00010\u00D2\u00028\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00D3\u0002\u0010\u00D4\u0002\u001A\u0006\b\u00D5\u0002\u0010\u00D6\u0002\"\u0006\b\u00D7\u0002\u0010\u00D8\u0002R,\u0010\u00E1\u0002\u001A\u0005\u0018\u00010\u00DA\u00028\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00DB\u0002\u0010\u00DC\u0002\u001A\u0006\b\u00DD\u0002\u0010\u00DE\u0002\"\u0006\b\u00DF\u0002\u0010\u00E0\u0002R,\u0010\u00E5\u0002\u001A\u0005\u0018\u00010\u00DA\u00028\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00E2\u0002\u0010\u00DC\u0002\u001A\u0006\b\u00E3\u0002\u0010\u00DE\u0002\"\u0006\b\u00E4\u0002\u0010\u00E0\u0002R4\u0010\u00EE\u0002\u001A\u0005\u0018\u00010\u00E6\u00028\u0000@\u0000X\u0080\u000E\u00A2\u0006 \n\u0006\b\u00E7\u0002\u0010\u00E8\u0002\u0012\u0006\b\u00ED\u0002\u0010\u00CF\u0001\u001A\u0006\b\u00E9\u0002\u0010\u00EA\u0002\"\u0006\b\u00EB\u0002\u0010\u00EC\u0002R4\u0010\u00F7\u0002\u001A\u0005\u0018\u00010\u00EF\u00028\u0000@\u0000X\u0080\u000E\u00A2\u0006 \n\u0006\b\u00F0\u0002\u0010\u00F1\u0002\u0012\u0006\b\u00F6\u0002\u0010\u00CF\u0001\u001A\u0006\b\u00F2\u0002\u0010\u00F3\u0002\"\u0006\b\u00F4\u0002\u0010\u00F5\u0002\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006\u00F8\u0002"}, d2 = {"Landroidx/compose/material3/ColorScheme;", "", "Landroidx/compose/ui/graphics/Color;", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", "error", "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "surfaceBright", "surfaceDim", "surfaceContainer", "surfaceContainerHigh", "surfaceContainerHighest", "surfaceContainerLow", "surfaceContainerLowest", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-C-Xl9yA", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "copy", "copy-G1PFc-w", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "", "toString", "()Ljava/lang/String;", "a", "J", "getPrimary-0d7_KjU", "()J", "b", "getOnPrimary-0d7_KjU", "c", "getPrimaryContainer-0d7_KjU", "d", "getOnPrimaryContainer-0d7_KjU", "e", "getInversePrimary-0d7_KjU", "f", "getSecondary-0d7_KjU", "g", "getOnSecondary-0d7_KjU", "h", "getSecondaryContainer-0d7_KjU", "i", "getOnSecondaryContainer-0d7_KjU", "j", "getTertiary-0d7_KjU", "k", "getOnTertiary-0d7_KjU", "l", "getTertiaryContainer-0d7_KjU", "m", "getOnTertiaryContainer-0d7_KjU", "n", "getBackground-0d7_KjU", "o", "getOnBackground-0d7_KjU", "p", "getSurface-0d7_KjU", "q", "getOnSurface-0d7_KjU", "r", "getSurfaceVariant-0d7_KjU", "s", "getOnSurfaceVariant-0d7_KjU", "t", "getSurfaceTint-0d7_KjU", "u", "getInverseSurface-0d7_KjU", "v", "getInverseOnSurface-0d7_KjU", "w", "getError-0d7_KjU", "x", "getOnError-0d7_KjU", "y", "getErrorContainer-0d7_KjU", "z", "getOnErrorContainer-0d7_KjU", "A", "getOutline-0d7_KjU", "B", "getOutlineVariant-0d7_KjU", "C", "getScrim-0d7_KjU", "D", "getSurfaceBright-0d7_KjU", "E", "getSurfaceDim-0d7_KjU", "F", "getSurfaceContainer-0d7_KjU", "G", "getSurfaceContainerHigh-0d7_KjU", "H", "getSurfaceContainerHighest-0d7_KjU", "I", "getSurfaceContainerLow-0d7_KjU", "getSurfaceContainerLowest-0d7_KjU", "Landroidx/compose/material3/ButtonColors;", "K", "Landroidx/compose/material3/ButtonColors;", "getDefaultButtonColorsCached$material3_release", "()Landroidx/compose/material3/ButtonColors;", "setDefaultButtonColorsCached$material3_release", "(Landroidx/compose/material3/ButtonColors;)V", "defaultButtonColorsCached", "L", "getDefaultElevatedButtonColorsCached$material3_release", "setDefaultElevatedButtonColorsCached$material3_release", "defaultElevatedButtonColorsCached", "M", "getDefaultFilledTonalButtonColorsCached$material3_release", "setDefaultFilledTonalButtonColorsCached$material3_release", "defaultFilledTonalButtonColorsCached", "N", "getDefaultOutlinedButtonColorsCached$material3_release", "setDefaultOutlinedButtonColorsCached$material3_release", "defaultOutlinedButtonColorsCached", "O", "getDefaultTextButtonColorsCached$material3_release", "setDefaultTextButtonColorsCached$material3_release", "defaultTextButtonColorsCached", "Landroidx/compose/material3/CardColors;", "P", "Landroidx/compose/material3/CardColors;", "getDefaultCardColorsCached$material3_release", "()Landroidx/compose/material3/CardColors;", "setDefaultCardColorsCached$material3_release", "(Landroidx/compose/material3/CardColors;)V", "defaultCardColorsCached", "Q", "getDefaultElevatedCardColorsCached$material3_release", "setDefaultElevatedCardColorsCached$material3_release", "defaultElevatedCardColorsCached", "R", "getDefaultOutlinedCardColorsCached$material3_release", "setDefaultOutlinedCardColorsCached$material3_release", "defaultOutlinedCardColorsCached", "Landroidx/compose/material3/ChipColors;", "S", "Landroidx/compose/material3/ChipColors;", "getDefaultAssistChipColorsCached$material3_release", "()Landroidx/compose/material3/ChipColors;", "setDefaultAssistChipColorsCached$material3_release", "(Landroidx/compose/material3/ChipColors;)V", "defaultAssistChipColorsCached", "T", "getDefaultElevatedAssistChipColorsCached$material3_release", "setDefaultElevatedAssistChipColorsCached$material3_release", "defaultElevatedAssistChipColorsCached", "U", "getDefaultSuggestionChipColorsCached$material3_release", "setDefaultSuggestionChipColorsCached$material3_release", "defaultSuggestionChipColorsCached", "V", "getDefaultElevatedSuggestionChipColorsCached$material3_release", "setDefaultElevatedSuggestionChipColorsCached$material3_release", "defaultElevatedSuggestionChipColorsCached", "Landroidx/compose/material3/SelectableChipColors;", "W", "Landroidx/compose/material3/SelectableChipColors;", "getDefaultFilterChipColorsCached$material3_release", "()Landroidx/compose/material3/SelectableChipColors;", "setDefaultFilterChipColorsCached$material3_release", "(Landroidx/compose/material3/SelectableChipColors;)V", "defaultFilterChipColorsCached", "X", "getDefaultElevatedFilterChipColorsCached$material3_release", "setDefaultElevatedFilterChipColorsCached$material3_release", "defaultElevatedFilterChipColorsCached", "Y", "getDefaultInputChipColorsCached$material3_release", "setDefaultInputChipColorsCached$material3_release", "defaultInputChipColorsCached", "Landroidx/compose/material3/TopAppBarColors;", "Z", "Landroidx/compose/material3/TopAppBarColors;", "getDefaultTopAppBarColorsCached$material3_release", "()Landroidx/compose/material3/TopAppBarColors;", "setDefaultTopAppBarColorsCached$material3_release", "(Landroidx/compose/material3/TopAppBarColors;)V", "getDefaultTopAppBarColorsCached$material3_release$annotations", "()V", "defaultTopAppBarColorsCached", "a0", "getDefaultCenterAlignedTopAppBarColorsCached$material3_release", "setDefaultCenterAlignedTopAppBarColorsCached$material3_release", "getDefaultCenterAlignedTopAppBarColorsCached$material3_release$annotations", "defaultCenterAlignedTopAppBarColorsCached", "b0", "getDefaultMediumTopAppBarColorsCached$material3_release", "setDefaultMediumTopAppBarColorsCached$material3_release", "getDefaultMediumTopAppBarColorsCached$material3_release$annotations", "defaultMediumTopAppBarColorsCached", "c0", "getDefaultLargeTopAppBarColorsCached$material3_release", "setDefaultLargeTopAppBarColorsCached$material3_release", "getDefaultLargeTopAppBarColorsCached$material3_release$annotations", "defaultLargeTopAppBarColorsCached", "Landroidx/compose/material3/CheckboxColors;", "d0", "Landroidx/compose/material3/CheckboxColors;", "getDefaultCheckboxColorsCached$material3_release", "()Landroidx/compose/material3/CheckboxColors;", "setDefaultCheckboxColorsCached$material3_release", "(Landroidx/compose/material3/CheckboxColors;)V", "defaultCheckboxColorsCached", "Landroidx/compose/material3/DatePickerColors;", "e0", "Landroidx/compose/material3/DatePickerColors;", "getDefaultDatePickerColorsCached$material3_release", "()Landroidx/compose/material3/DatePickerColors;", "setDefaultDatePickerColorsCached$material3_release", "(Landroidx/compose/material3/DatePickerColors;)V", "getDefaultDatePickerColorsCached$material3_release$annotations", "defaultDatePickerColorsCached", "Landroidx/compose/material3/IconButtonColors;", "f0", "Landroidx/compose/material3/IconButtonColors;", "getDefaultIconButtonColorsCached$material3_release", "()Landroidx/compose/material3/IconButtonColors;", "setDefaultIconButtonColorsCached$material3_release", "(Landroidx/compose/material3/IconButtonColors;)V", "defaultIconButtonColorsCached", "Landroidx/compose/material3/IconToggleButtonColors;", "g0", "Landroidx/compose/material3/IconToggleButtonColors;", "getDefaultIconToggleButtonColorsCached$material3_release", "()Landroidx/compose/material3/IconToggleButtonColors;", "setDefaultIconToggleButtonColorsCached$material3_release", "(Landroidx/compose/material3/IconToggleButtonColors;)V", "defaultIconToggleButtonColorsCached", "h0", "getDefaultFilledIconButtonColorsCached$material3_release", "setDefaultFilledIconButtonColorsCached$material3_release", "defaultFilledIconButtonColorsCached", "i0", "getDefaultFilledIconToggleButtonColorsCached$material3_release", "setDefaultFilledIconToggleButtonColorsCached$material3_release", "defaultFilledIconToggleButtonColorsCached", "j0", "getDefaultFilledTonalIconButtonColorsCached$material3_release", "setDefaultFilledTonalIconButtonColorsCached$material3_release", "defaultFilledTonalIconButtonColorsCached", "k0", "getDefaultFilledTonalIconToggleButtonColorsCached$material3_release", "setDefaultFilledTonalIconToggleButtonColorsCached$material3_release", "defaultFilledTonalIconToggleButtonColorsCached", "l0", "getDefaultOutlinedIconButtonColorsCached$material3_release", "setDefaultOutlinedIconButtonColorsCached$material3_release", "defaultOutlinedIconButtonColorsCached", "m0", "getDefaultOutlinedIconToggleButtonColorsCached$material3_release", "setDefaultOutlinedIconToggleButtonColorsCached$material3_release", "defaultOutlinedIconToggleButtonColorsCached", "Landroidx/compose/material3/MenuItemColors;", "n0", "Landroidx/compose/material3/MenuItemColors;", "getDefaultMenuItemColorsCached$material3_release", "()Landroidx/compose/material3/MenuItemColors;", "setDefaultMenuItemColorsCached$material3_release", "(Landroidx/compose/material3/MenuItemColors;)V", "defaultMenuItemColorsCached", "Landroidx/compose/material3/NavigationBarItemColors;", "o0", "Landroidx/compose/material3/NavigationBarItemColors;", "getDefaultNavigationBarItemColorsCached$material3_release", "()Landroidx/compose/material3/NavigationBarItemColors;", "setDefaultNavigationBarItemColorsCached$material3_release", "(Landroidx/compose/material3/NavigationBarItemColors;)V", "defaultNavigationBarItemColorsCached", "Landroidx/compose/material3/NavigationRailItemColors;", "p0", "Landroidx/compose/material3/NavigationRailItemColors;", "getDefaultNavigationRailItemColorsCached$material3_release", "()Landroidx/compose/material3/NavigationRailItemColors;", "setDefaultNavigationRailItemColorsCached$material3_release", "(Landroidx/compose/material3/NavigationRailItemColors;)V", "defaultNavigationRailItemColorsCached", "Landroidx/compose/material3/NavigationItemColors;", "q0", "Landroidx/compose/material3/NavigationItemColors;", "getDefaultExpressiveNavigationBarItemColorsCached$material3_release", "()Landroidx/compose/material3/NavigationItemColors;", "setDefaultExpressiveNavigationBarItemColorsCached$material3_release", "(Landroidx/compose/material3/NavigationItemColors;)V", "defaultExpressiveNavigationBarItemColorsCached", "Landroidx/compose/material3/RadioButtonColors;", "r0", "Landroidx/compose/material3/RadioButtonColors;", "getDefaultRadioButtonColorsCached$material3_release", "()Landroidx/compose/material3/RadioButtonColors;", "setDefaultRadioButtonColorsCached$material3_release", "(Landroidx/compose/material3/RadioButtonColors;)V", "defaultRadioButtonColorsCached", "Landroidx/compose/material3/SegmentedButtonColors;", "s0", "Landroidx/compose/material3/SegmentedButtonColors;", "getDefaultSegmentedButtonColorsCached$material3_release", "()Landroidx/compose/material3/SegmentedButtonColors;", "setDefaultSegmentedButtonColorsCached$material3_release", "(Landroidx/compose/material3/SegmentedButtonColors;)V", "getDefaultSegmentedButtonColorsCached$material3_release$annotations", "defaultSegmentedButtonColorsCached", "Landroidx/compose/material3/SliderColors;", "t0", "Landroidx/compose/material3/SliderColors;", "getDefaultSliderColorsCached$material3_release", "()Landroidx/compose/material3/SliderColors;", "setDefaultSliderColorsCached$material3_release", "(Landroidx/compose/material3/SliderColors;)V", "defaultSliderColorsCached", "Landroidx/compose/material3/SwitchColors;", "u0", "Landroidx/compose/material3/SwitchColors;", "getDefaultSwitchColorsCached$material3_release", "()Landroidx/compose/material3/SwitchColors;", "setDefaultSwitchColorsCached$material3_release", "(Landroidx/compose/material3/SwitchColors;)V", "defaultSwitchColorsCached", "Landroidx/compose/material3/TextFieldColors;", "v0", "Landroidx/compose/material3/TextFieldColors;", "getDefaultOutlinedTextFieldColorsCached$material3_release", "()Landroidx/compose/material3/TextFieldColors;", "setDefaultOutlinedTextFieldColorsCached$material3_release", "(Landroidx/compose/material3/TextFieldColors;)V", "defaultOutlinedTextFieldColorsCached", "w0", "getDefaultTextFieldColorsCached$material3_release", "setDefaultTextFieldColorsCached$material3_release", "defaultTextFieldColorsCached", "Landroidx/compose/material3/TimePickerColors;", "x0", "Landroidx/compose/material3/TimePickerColors;", "getDefaultTimePickerColorsCached$material3_release", "()Landroidx/compose/material3/TimePickerColors;", "setDefaultTimePickerColorsCached$material3_release", "(Landroidx/compose/material3/TimePickerColors;)V", "getDefaultTimePickerColorsCached$material3_release$annotations", "defaultTimePickerColorsCached", "Landroidx/compose/material3/RichTooltipColors;", "y0", "Landroidx/compose/material3/RichTooltipColors;", "getDefaultRichTooltipColorsCached$material3_release", "()Landroidx/compose/material3/RichTooltipColors;", "setDefaultRichTooltipColorsCached$material3_release", "(Landroidx/compose/material3/RichTooltipColors;)V", "getDefaultRichTooltipColorsCached$material3_release$annotations", "defaultRichTooltipColorsCached", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ColorScheme {
    public static final int $stable;
    public final long A;
    public final long B;
    public final long C;
    public final long D;
    public final long E;
    public final long F;
    public final long G;
    public final long H;
    public final long I;
    public final long J;
    public ButtonColors K;
    public ButtonColors L;
    public ButtonColors M;
    public ButtonColors N;
    public ButtonColors O;
    public CardColors P;
    public CardColors Q;
    public CardColors R;
    public ChipColors S;
    public ChipColors T;
    public ChipColors U;
    public ChipColors V;
    public SelectableChipColors W;
    public SelectableChipColors X;
    public SelectableChipColors Y;
    public TopAppBarColors Z;
    public final long a;
    public TopAppBarColors a0;
    public final long b;
    public TopAppBarColors b0;
    public final long c;
    public TopAppBarColors c0;
    public final long d;
    public CheckboxColors d0;
    public final long e;
    public DatePickerColors e0;
    public final long f;
    public IconButtonColors f0;
    public final long g;
    public IconToggleButtonColors g0;
    public final long h;
    public IconButtonColors h0;
    public final long i;
    public IconToggleButtonColors i0;
    public final long j;
    public IconButtonColors j0;
    public final long k;
    public IconToggleButtonColors k0;
    public final long l;
    public IconButtonColors l0;
    public final long m;
    public IconToggleButtonColors m0;
    public final long n;
    public MenuItemColors n0;
    public final long o;
    public NavigationBarItemColors o0;
    public final long p;
    public NavigationRailItemColors p0;
    public final long q;
    public NavigationItemColors q0;
    public final long r;
    public RadioButtonColors r0;
    public final long s;
    public SegmentedButtonColors s0;
    public final long t;
    public SliderColors t0;
    public final long u;
    public SwitchColors u0;
    public final long v;
    public TextFieldColors v0;
    public final long w;
    public TextFieldColors w0;
    public final long x;
    public TimePickerColors x0;
    public final long y;
    public RichTooltipColors y0;
    public final long z;

    public ColorScheme(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, long v13, long v14, long v15, long v16, long v17, long v18, long v19, long v20, long v21, long v22, long v23, long v24, long v25, long v26, long v27, long v28, long v29, long v30, long v31, long v32, long v33, long v34, long v35, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = v5;
        this.g = v6;
        this.h = v7;
        this.i = v8;
        this.j = v9;
        this.k = v10;
        this.l = v11;
        this.m = v12;
        this.n = v13;
        this.o = v14;
        this.p = v15;
        this.q = v16;
        this.r = v17;
        this.s = v18;
        this.t = v19;
        this.u = v20;
        this.v = v21;
        this.w = v22;
        this.x = v23;
        this.y = v24;
        this.z = v25;
        this.A = v26;
        this.B = v27;
        this.C = v28;
        this.D = v29;
        this.E = v30;
        this.F = v31;
        this.G = v32;
        this.H = v33;
        this.I = v34;
        this.J = v35;
    }

    // 去混淆评级： 中等(70)
    @Deprecated(level = DeprecationLevel.WARNING, message = "Use constructor with additional \'surfaceContainer\' roles.", replaceWith = @ReplaceWith(expression = "ColorScheme(primary,\nonPrimary,\nprimaryContainer,\nonPrimaryContainer,\ninversePrimary,\nsecondary,\nonSecondary,\nsecondaryContainer,\nonSecondaryContainer,\ntertiary,\nonTertiary,\ntertiaryContainer,\nonTertiaryContainer,\nbackground,\nonBackground,\nsurface,\nonSurface,\nsurfaceVariant,\nonSurfaceVariant,\nsurfaceTint,\ninverseSurface,\ninverseOnSurface,\nerror,\nonError,\nerrorContainer,\nonErrorContainer,\noutline,\noutlineVariant,\nscrim,\nsurfaceBright,\nsurfaceDim,\nsurfaceContainer,\nsurfaceContainerHigh,\nsurfaceContainerHighest,\nsurfaceContainerLow,\nsurfaceContainerLowest,)", imports = {}))
    public ColorScheme(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, long v13, long v14, long v15, long v16, long v17, long v18, long v19, long v20, long v21, long v22, long v23, long v24, long v25, long v26, long v27, long v28, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23, v24, v25, v26, v27, v28, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null);
    }

    @NotNull
    public final ColorScheme copy-C-Xl9yA(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, long v13, long v14, long v15, long v16, long v17, long v18, long v19, long v20, long v21, long v22, long v23, long v24, long v25, long v26, long v27, long v28, long v29, long v30, long v31, long v32, long v33, long v34, long v35) {
        return new ColorScheme(v, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23, v24, v25, v26, v27, v28, v29, v30, v31, v32, v33, v34, v35, null);
    }

    public static ColorScheme copy-C-Xl9yA$default(ColorScheme colorScheme0, long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, long v13, long v14, long v15, long v16, long v17, long v18, long v19, long v20, long v21, long v22, long v23, long v24, long v25, long v26, long v27, long v28, long v29, long v30, long v31, long v32, long v33, long v34, long v35, int v36, int v37, Object object0) {
        long v38 = (v36 & 1) == 0 ? v : colorScheme0.a;
        long v39 = (v36 & 2) == 0 ? v1 : colorScheme0.b;
        long v40 = (v36 & 4) == 0 ? v2 : colorScheme0.c;
        long v41 = (v36 & 8) == 0 ? v3 : colorScheme0.d;
        long v42 = (v36 & 16) == 0 ? v4 : colorScheme0.e;
        long v43 = (v36 & 0x20) == 0 ? v5 : colorScheme0.f;
        long v44 = (v36 & 0x40) == 0 ? v6 : colorScheme0.g;
        long v45 = (v36 & 0x80) == 0 ? v7 : colorScheme0.h;
        long v46 = (v36 & 0x100) == 0 ? v8 : colorScheme0.i;
        long v47 = (v36 & 0x200) == 0 ? v9 : colorScheme0.j;
        long v48 = (v36 & 0x400) == 0 ? v10 : colorScheme0.k;
        long v49 = (v36 & 0x800) == 0 ? v11 : colorScheme0.l;
        long v50 = (v36 & 0x1000) == 0 ? v12 : colorScheme0.m;
        long v51 = (v36 & 0x2000) == 0 ? v13 : colorScheme0.n;
        long v52 = (v36 & 0x4000) == 0 ? v14 : colorScheme0.o;
        long v53 = (v36 & 0x8000) == 0 ? v15 : colorScheme0.p;
        long v54 = (v36 & 0x10000) == 0 ? v16 : colorScheme0.q;
        long v55 = (v36 & 0x20000) == 0 ? v17 : colorScheme0.r;
        long v56 = (v36 & 0x40000) == 0 ? v18 : colorScheme0.s;
        long v57 = (v36 & 0x80000) == 0 ? v19 : colorScheme0.t;
        long v58 = (v36 & 0x100000) == 0 ? v20 : colorScheme0.u;
        long v59 = (v36 & 0x200000) == 0 ? v21 : colorScheme0.v;
        long v60 = (v36 & 0x400000) == 0 ? v22 : colorScheme0.w;
        long v61 = (v36 & 0x800000) == 0 ? v23 : colorScheme0.x;
        long v62 = (v36 & 0x1000000) == 0 ? v24 : colorScheme0.y;
        long v63 = (v36 & 0x2000000) == 0 ? v25 : colorScheme0.z;
        long v64 = (v36 & 0x4000000) == 0 ? v26 : colorScheme0.A;
        long v65 = (v36 & 0x8000000) == 0 ? v27 : colorScheme0.B;
        long v66 = (v36 & 0x10000000) == 0 ? v28 : colorScheme0.C;
        long v67 = (v36 & 0x20000000) == 0 ? v29 : colorScheme0.D;
        long v68 = (v36 & 0x40000000) == 0 ? v30 : colorScheme0.E;
        long v69 = (v36 & 0x80000000) == 0 ? v31 : colorScheme0.F;
        long v70 = (v37 & 1) == 0 ? v32 : colorScheme0.G;
        long v71 = (v37 & 2) == 0 ? v33 : colorScheme0.H;
        long v72 = (v37 & 4) == 0 ? v34 : colorScheme0.I;
        return (v37 & 8) == 0 ? colorScheme0.copy-C-Xl9yA(v38, v39, v40, v41, v42, v43, v44, v45, v46, v47, v48, v49, v50, v51, v52, v53, v54, v55, v56, v57, v58, v59, v60, v61, v62, v63, v64, v65, v66, v67, v68, v69, v70, v71, v72, v35) : colorScheme0.copy-C-Xl9yA(v38, v39, v40, v41, v42, v43, v44, v45, v46, v47, v48, v49, v50, v51, v52, v53, v54, v55, v56, v57, v58, v59, v60, v61, v62, v63, v64, v65, v66, v67, v68, v69, v70, v71, v72, colorScheme0.J);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional surface roles instead")
    public final ColorScheme copy-G1PFc-w(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, long v13, long v14, long v15, long v16, long v17, long v18, long v19, long v20, long v21, long v22, long v23, long v24, long v25, long v26, long v27, long v28) {
        return ColorScheme.copy-C-Xl9yA$default(this, v, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23, v24, v25, v26, v27, v28, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0xE0000000, 15, null);
    }

    public static ColorScheme copy-G1PFc-w$default(ColorScheme colorScheme0, long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, long v13, long v14, long v15, long v16, long v17, long v18, long v19, long v20, long v21, long v22, long v23, long v24, long v25, long v26, long v27, long v28, int v29, Object object0) {
        long v30 = (v29 & 1) == 0 ? v : colorScheme0.a;
        long v31 = (v29 & 2) == 0 ? v1 : colorScheme0.b;
        long v32 = (v29 & 4) == 0 ? v2 : colorScheme0.c;
        long v33 = (v29 & 8) == 0 ? v3 : colorScheme0.d;
        long v34 = (v29 & 16) == 0 ? v4 : colorScheme0.e;
        long v35 = (v29 & 0x20) == 0 ? v5 : colorScheme0.f;
        long v36 = (v29 & 0x40) == 0 ? v6 : colorScheme0.g;
        long v37 = (v29 & 0x80) == 0 ? v7 : colorScheme0.h;
        long v38 = (v29 & 0x100) == 0 ? v8 : colorScheme0.i;
        long v39 = (v29 & 0x200) == 0 ? v9 : colorScheme0.j;
        long v40 = (v29 & 0x400) == 0 ? v10 : colorScheme0.k;
        long v41 = (v29 & 0x800) == 0 ? v11 : colorScheme0.l;
        long v42 = (v29 & 0x1000) == 0 ? v12 : colorScheme0.m;
        long v43 = (v29 & 0x2000) == 0 ? v13 : colorScheme0.n;
        long v44 = (v29 & 0x4000) == 0 ? v14 : colorScheme0.o;
        long v45 = (v29 & 0x8000) == 0 ? v15 : colorScheme0.p;
        long v46 = (v29 & 0x10000) == 0 ? v16 : colorScheme0.q;
        long v47 = (v29 & 0x20000) == 0 ? v17 : colorScheme0.r;
        long v48 = (v29 & 0x40000) == 0 ? v18 : colorScheme0.s;
        long v49 = (v29 & 0x80000) == 0 ? v19 : colorScheme0.t;
        long v50 = (v29 & 0x100000) == 0 ? v20 : colorScheme0.u;
        long v51 = (v29 & 0x200000) == 0 ? v21 : colorScheme0.v;
        long v52 = (v29 & 0x400000) == 0 ? v22 : colorScheme0.w;
        long v53 = (v29 & 0x800000) == 0 ? v23 : colorScheme0.x;
        long v54 = (v29 & 0x1000000) == 0 ? v24 : colorScheme0.y;
        long v55 = (v29 & 0x2000000) == 0 ? v25 : colorScheme0.z;
        long v56 = (v29 & 0x4000000) == 0 ? v26 : colorScheme0.A;
        long v57 = (v29 & 0x8000000) == 0 ? v27 : colorScheme0.B;
        return (v29 & 0x10000000) == 0 ? colorScheme0.copy-G1PFc-w(v30, v31, v32, v33, v34, v35, v36, v37, v38, v39, v40, v41, v42, v43, v44, v45, v46, v47, v48, v49, v50, v51, v52, v53, v54, v55, v56, v57, v28) : colorScheme0.copy-G1PFc-w(v30, v31, v32, v33, v34, v35, v36, v37, v38, v39, v40, v41, v42, v43, v44, v45, v46, v47, v48, v49, v50, v51, v52, v53, v54, v55, v56, v57, colorScheme0.C);
    }

    public final long getBackground-0d7_KjU() {
        return this.n;
    }

    @Nullable
    public final ChipColors getDefaultAssistChipColorsCached$material3_release() {
        return this.S;
    }

    @Nullable
    public final ButtonColors getDefaultButtonColorsCached$material3_release() {
        return this.K;
    }

    @Nullable
    public final CardColors getDefaultCardColorsCached$material3_release() {
        return this.P;
    }

    @Nullable
    public final TopAppBarColors getDefaultCenterAlignedTopAppBarColorsCached$material3_release() {
        return this.a0;
    }

    public static void getDefaultCenterAlignedTopAppBarColorsCached$material3_release$annotations() {
    }

    @Nullable
    public final CheckboxColors getDefaultCheckboxColorsCached$material3_release() {
        return this.d0;
    }

    @Nullable
    public final DatePickerColors getDefaultDatePickerColorsCached$material3_release() {
        return this.e0;
    }

    public static void getDefaultDatePickerColorsCached$material3_release$annotations() {
    }

    @Nullable
    public final ChipColors getDefaultElevatedAssistChipColorsCached$material3_release() {
        return this.T;
    }

    @Nullable
    public final ButtonColors getDefaultElevatedButtonColorsCached$material3_release() {
        return this.L;
    }

    @Nullable
    public final CardColors getDefaultElevatedCardColorsCached$material3_release() {
        return this.Q;
    }

    @Nullable
    public final SelectableChipColors getDefaultElevatedFilterChipColorsCached$material3_release() {
        return this.X;
    }

    @Nullable
    public final ChipColors getDefaultElevatedSuggestionChipColorsCached$material3_release() {
        return this.V;
    }

    @Nullable
    public final NavigationItemColors getDefaultExpressiveNavigationBarItemColorsCached$material3_release() {
        return this.q0;
    }

    @Nullable
    public final IconButtonColors getDefaultFilledIconButtonColorsCached$material3_release() {
        return this.h0;
    }

    @Nullable
    public final IconToggleButtonColors getDefaultFilledIconToggleButtonColorsCached$material3_release() {
        return this.i0;
    }

    @Nullable
    public final ButtonColors getDefaultFilledTonalButtonColorsCached$material3_release() {
        return this.M;
    }

    @Nullable
    public final IconButtonColors getDefaultFilledTonalIconButtonColorsCached$material3_release() {
        return this.j0;
    }

    @Nullable
    public final IconToggleButtonColors getDefaultFilledTonalIconToggleButtonColorsCached$material3_release() {
        return this.k0;
    }

    @Nullable
    public final SelectableChipColors getDefaultFilterChipColorsCached$material3_release() {
        return this.W;
    }

    @Nullable
    public final IconButtonColors getDefaultIconButtonColorsCached$material3_release() {
        return this.f0;
    }

    @Nullable
    public final IconToggleButtonColors getDefaultIconToggleButtonColorsCached$material3_release() {
        return this.g0;
    }

    @Nullable
    public final SelectableChipColors getDefaultInputChipColorsCached$material3_release() {
        return this.Y;
    }

    @Nullable
    public final TopAppBarColors getDefaultLargeTopAppBarColorsCached$material3_release() {
        return this.c0;
    }

    public static void getDefaultLargeTopAppBarColorsCached$material3_release$annotations() {
    }

    @Nullable
    public final TopAppBarColors getDefaultMediumTopAppBarColorsCached$material3_release() {
        return this.b0;
    }

    public static void getDefaultMediumTopAppBarColorsCached$material3_release$annotations() {
    }

    @Nullable
    public final MenuItemColors getDefaultMenuItemColorsCached$material3_release() {
        return this.n0;
    }

    @Nullable
    public final NavigationBarItemColors getDefaultNavigationBarItemColorsCached$material3_release() {
        return this.o0;
    }

    @Nullable
    public final NavigationRailItemColors getDefaultNavigationRailItemColorsCached$material3_release() {
        return this.p0;
    }

    @Nullable
    public final ButtonColors getDefaultOutlinedButtonColorsCached$material3_release() {
        return this.N;
    }

    @Nullable
    public final CardColors getDefaultOutlinedCardColorsCached$material3_release() {
        return this.R;
    }

    @Nullable
    public final IconButtonColors getDefaultOutlinedIconButtonColorsCached$material3_release() {
        return this.l0;
    }

    @Nullable
    public final IconToggleButtonColors getDefaultOutlinedIconToggleButtonColorsCached$material3_release() {
        return this.m0;
    }

    @Nullable
    public final TextFieldColors getDefaultOutlinedTextFieldColorsCached$material3_release() {
        return this.v0;
    }

    @Nullable
    public final RadioButtonColors getDefaultRadioButtonColorsCached$material3_release() {
        return this.r0;
    }

    @Nullable
    public final RichTooltipColors getDefaultRichTooltipColorsCached$material3_release() {
        return this.y0;
    }

    public static void getDefaultRichTooltipColorsCached$material3_release$annotations() {
    }

    @Nullable
    public final SegmentedButtonColors getDefaultSegmentedButtonColorsCached$material3_release() {
        return this.s0;
    }

    public static void getDefaultSegmentedButtonColorsCached$material3_release$annotations() {
    }

    @Nullable
    public final SliderColors getDefaultSliderColorsCached$material3_release() {
        return this.t0;
    }

    @Nullable
    public final ChipColors getDefaultSuggestionChipColorsCached$material3_release() {
        return this.U;
    }

    @Nullable
    public final SwitchColors getDefaultSwitchColorsCached$material3_release() {
        return this.u0;
    }

    @Nullable
    public final ButtonColors getDefaultTextButtonColorsCached$material3_release() {
        return this.O;
    }

    @Nullable
    public final TextFieldColors getDefaultTextFieldColorsCached$material3_release() {
        return this.w0;
    }

    @Nullable
    public final TimePickerColors getDefaultTimePickerColorsCached$material3_release() {
        return this.x0;
    }

    public static void getDefaultTimePickerColorsCached$material3_release$annotations() {
    }

    @Nullable
    public final TopAppBarColors getDefaultTopAppBarColorsCached$material3_release() {
        return this.Z;
    }

    public static void getDefaultTopAppBarColorsCached$material3_release$annotations() {
    }

    public final long getError-0d7_KjU() {
        return this.w;
    }

    public final long getErrorContainer-0d7_KjU() {
        return this.y;
    }

    public final long getInverseOnSurface-0d7_KjU() {
        return this.v;
    }

    public final long getInversePrimary-0d7_KjU() {
        return this.e;
    }

    public final long getInverseSurface-0d7_KjU() {
        return this.u;
    }

    public final long getOnBackground-0d7_KjU() {
        return this.o;
    }

    public final long getOnError-0d7_KjU() {
        return this.x;
    }

    public final long getOnErrorContainer-0d7_KjU() {
        return this.z;
    }

    public final long getOnPrimary-0d7_KjU() {
        return this.b;
    }

    public final long getOnPrimaryContainer-0d7_KjU() {
        return this.d;
    }

    public final long getOnSecondary-0d7_KjU() {
        return this.g;
    }

    public final long getOnSecondaryContainer-0d7_KjU() {
        return this.i;
    }

    public final long getOnSurface-0d7_KjU() {
        return this.q;
    }

    public final long getOnSurfaceVariant-0d7_KjU() {
        return this.s;
    }

    public final long getOnTertiary-0d7_KjU() {
        return this.k;
    }

    public final long getOnTertiaryContainer-0d7_KjU() {
        return this.m;
    }

    public final long getOutline-0d7_KjU() {
        return this.A;
    }

    public final long getOutlineVariant-0d7_KjU() {
        return this.B;
    }

    public final long getPrimary-0d7_KjU() {
        return this.a;
    }

    public final long getPrimaryContainer-0d7_KjU() {
        return this.c;
    }

    public final long getScrim-0d7_KjU() {
        return this.C;
    }

    public final long getSecondary-0d7_KjU() {
        return this.f;
    }

    public final long getSecondaryContainer-0d7_KjU() {
        return this.h;
    }

    public final long getSurface-0d7_KjU() {
        return this.p;
    }

    public final long getSurfaceBright-0d7_KjU() {
        return this.D;
    }

    public final long getSurfaceContainer-0d7_KjU() {
        return this.F;
    }

    public final long getSurfaceContainerHigh-0d7_KjU() {
        return this.G;
    }

    public final long getSurfaceContainerHighest-0d7_KjU() {
        return this.H;
    }

    public final long getSurfaceContainerLow-0d7_KjU() {
        return this.I;
    }

    public final long getSurfaceContainerLowest-0d7_KjU() {
        return this.J;
    }

    public final long getSurfaceDim-0d7_KjU() {
        return this.E;
    }

    public final long getSurfaceTint-0d7_KjU() {
        return this.t;
    }

    public final long getSurfaceVariant-0d7_KjU() {
        return this.r;
    }

    public final long getTertiary-0d7_KjU() {
        return this.j;
    }

    public final long getTertiaryContainer-0d7_KjU() {
        return this.l;
    }

    public final void setDefaultAssistChipColorsCached$material3_release(@Nullable ChipColors chipColors0) {
        this.S = chipColors0;
    }

    public final void setDefaultButtonColorsCached$material3_release(@Nullable ButtonColors buttonColors0) {
        this.K = buttonColors0;
    }

    public final void setDefaultCardColorsCached$material3_release(@Nullable CardColors cardColors0) {
        this.P = cardColors0;
    }

    public final void setDefaultCenterAlignedTopAppBarColorsCached$material3_release(@Nullable TopAppBarColors topAppBarColors0) {
        this.a0 = topAppBarColors0;
    }

    public final void setDefaultCheckboxColorsCached$material3_release(@Nullable CheckboxColors checkboxColors0) {
        this.d0 = checkboxColors0;
    }

    public final void setDefaultDatePickerColorsCached$material3_release(@Nullable DatePickerColors datePickerColors0) {
        this.e0 = datePickerColors0;
    }

    public final void setDefaultElevatedAssistChipColorsCached$material3_release(@Nullable ChipColors chipColors0) {
        this.T = chipColors0;
    }

    public final void setDefaultElevatedButtonColorsCached$material3_release(@Nullable ButtonColors buttonColors0) {
        this.L = buttonColors0;
    }

    public final void setDefaultElevatedCardColorsCached$material3_release(@Nullable CardColors cardColors0) {
        this.Q = cardColors0;
    }

    public final void setDefaultElevatedFilterChipColorsCached$material3_release(@Nullable SelectableChipColors selectableChipColors0) {
        this.X = selectableChipColors0;
    }

    public final void setDefaultElevatedSuggestionChipColorsCached$material3_release(@Nullable ChipColors chipColors0) {
        this.V = chipColors0;
    }

    public final void setDefaultExpressiveNavigationBarItemColorsCached$material3_release(@Nullable NavigationItemColors navigationItemColors0) {
        this.q0 = navigationItemColors0;
    }

    public final void setDefaultFilledIconButtonColorsCached$material3_release(@Nullable IconButtonColors iconButtonColors0) {
        this.h0 = iconButtonColors0;
    }

    public final void setDefaultFilledIconToggleButtonColorsCached$material3_release(@Nullable IconToggleButtonColors iconToggleButtonColors0) {
        this.i0 = iconToggleButtonColors0;
    }

    public final void setDefaultFilledTonalButtonColorsCached$material3_release(@Nullable ButtonColors buttonColors0) {
        this.M = buttonColors0;
    }

    public final void setDefaultFilledTonalIconButtonColorsCached$material3_release(@Nullable IconButtonColors iconButtonColors0) {
        this.j0 = iconButtonColors0;
    }

    public final void setDefaultFilledTonalIconToggleButtonColorsCached$material3_release(@Nullable IconToggleButtonColors iconToggleButtonColors0) {
        this.k0 = iconToggleButtonColors0;
    }

    public final void setDefaultFilterChipColorsCached$material3_release(@Nullable SelectableChipColors selectableChipColors0) {
        this.W = selectableChipColors0;
    }

    public final void setDefaultIconButtonColorsCached$material3_release(@Nullable IconButtonColors iconButtonColors0) {
        this.f0 = iconButtonColors0;
    }

    public final void setDefaultIconToggleButtonColorsCached$material3_release(@Nullable IconToggleButtonColors iconToggleButtonColors0) {
        this.g0 = iconToggleButtonColors0;
    }

    public final void setDefaultInputChipColorsCached$material3_release(@Nullable SelectableChipColors selectableChipColors0) {
        this.Y = selectableChipColors0;
    }

    public final void setDefaultLargeTopAppBarColorsCached$material3_release(@Nullable TopAppBarColors topAppBarColors0) {
        this.c0 = topAppBarColors0;
    }

    public final void setDefaultMediumTopAppBarColorsCached$material3_release(@Nullable TopAppBarColors topAppBarColors0) {
        this.b0 = topAppBarColors0;
    }

    public final void setDefaultMenuItemColorsCached$material3_release(@Nullable MenuItemColors menuItemColors0) {
        this.n0 = menuItemColors0;
    }

    public final void setDefaultNavigationBarItemColorsCached$material3_release(@Nullable NavigationBarItemColors navigationBarItemColors0) {
        this.o0 = navigationBarItemColors0;
    }

    public final void setDefaultNavigationRailItemColorsCached$material3_release(@Nullable NavigationRailItemColors navigationRailItemColors0) {
        this.p0 = navigationRailItemColors0;
    }

    public final void setDefaultOutlinedButtonColorsCached$material3_release(@Nullable ButtonColors buttonColors0) {
        this.N = buttonColors0;
    }

    public final void setDefaultOutlinedCardColorsCached$material3_release(@Nullable CardColors cardColors0) {
        this.R = cardColors0;
    }

    public final void setDefaultOutlinedIconButtonColorsCached$material3_release(@Nullable IconButtonColors iconButtonColors0) {
        this.l0 = iconButtonColors0;
    }

    public final void setDefaultOutlinedIconToggleButtonColorsCached$material3_release(@Nullable IconToggleButtonColors iconToggleButtonColors0) {
        this.m0 = iconToggleButtonColors0;
    }

    public final void setDefaultOutlinedTextFieldColorsCached$material3_release(@Nullable TextFieldColors textFieldColors0) {
        this.v0 = textFieldColors0;
    }

    public final void setDefaultRadioButtonColorsCached$material3_release(@Nullable RadioButtonColors radioButtonColors0) {
        this.r0 = radioButtonColors0;
    }

    public final void setDefaultRichTooltipColorsCached$material3_release(@Nullable RichTooltipColors richTooltipColors0) {
        this.y0 = richTooltipColors0;
    }

    public final void setDefaultSegmentedButtonColorsCached$material3_release(@Nullable SegmentedButtonColors segmentedButtonColors0) {
        this.s0 = segmentedButtonColors0;
    }

    public final void setDefaultSliderColorsCached$material3_release(@Nullable SliderColors sliderColors0) {
        this.t0 = sliderColors0;
    }

    public final void setDefaultSuggestionChipColorsCached$material3_release(@Nullable ChipColors chipColors0) {
        this.U = chipColors0;
    }

    public final void setDefaultSwitchColorsCached$material3_release(@Nullable SwitchColors switchColors0) {
        this.u0 = switchColors0;
    }

    public final void setDefaultTextButtonColorsCached$material3_release(@Nullable ButtonColors buttonColors0) {
        this.O = buttonColors0;
    }

    public final void setDefaultTextFieldColorsCached$material3_release(@Nullable TextFieldColors textFieldColors0) {
        this.w0 = textFieldColors0;
    }

    public final void setDefaultTimePickerColorsCached$material3_release(@Nullable TimePickerColors timePickerColors0) {
        this.x0 = timePickerColors0;
    }

    public final void setDefaultTopAppBarColorsCached$material3_release(@Nullable TopAppBarColors topAppBarColors0) {
        this.Z = topAppBarColors0;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ColorScheme(primary=");
        a.x(this.a, "onPrimary=", stringBuilder0);
        a.x(this.b, "primaryContainer=", stringBuilder0);
        a.x(this.c, "onPrimaryContainer=", stringBuilder0);
        a.x(this.d, "inversePrimary=", stringBuilder0);
        a.x(this.e, "secondary=", stringBuilder0);
        a.x(this.f, "onSecondary=", stringBuilder0);
        a.x(this.g, "secondaryContainer=", stringBuilder0);
        a.x(this.h, "onSecondaryContainer=", stringBuilder0);
        a.x(this.i, "tertiary=", stringBuilder0);
        a.x(this.j, "onTertiary=", stringBuilder0);
        a.x(this.k, "tertiaryContainer=", stringBuilder0);
        a.x(this.l, "onTertiaryContainer=", stringBuilder0);
        a.x(this.m, "background=", stringBuilder0);
        a.x(this.n, "onBackground=", stringBuilder0);
        a.x(this.o, "surface=", stringBuilder0);
        a.x(this.p, "onSurface=", stringBuilder0);
        a.x(this.q, "surfaceVariant=", stringBuilder0);
        a.x(this.r, "onSurfaceVariant=", stringBuilder0);
        a.x(this.s, "surfaceTint=", stringBuilder0);
        a.x(this.t, "inverseSurface=", stringBuilder0);
        a.x(this.u, "inverseOnSurface=", stringBuilder0);
        a.x(this.v, "error=", stringBuilder0);
        a.x(this.w, "onError=", stringBuilder0);
        a.x(this.x, "errorContainer=", stringBuilder0);
        a.x(this.y, "onErrorContainer=", stringBuilder0);
        a.x(this.z, "outline=", stringBuilder0);
        a.x(this.A, "outlineVariant=", stringBuilder0);
        a.x(this.B, "scrim=", stringBuilder0);
        a.x(this.C, "surfaceBright=", stringBuilder0);
        a.x(this.D, "surfaceDim=", stringBuilder0);
        a.x(this.E, "surfaceContainer=", stringBuilder0);
        a.x(this.F, "surfaceContainerHigh=", stringBuilder0);
        a.x(this.G, "surfaceContainerHighest=", stringBuilder0);
        a.x(this.H, "surfaceContainerLow=", stringBuilder0);
        a.x(this.I, "surfaceContainerLowest=", stringBuilder0);
        stringBuilder0.append(Color.toString-impl(this.J));
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

