package androidx.compose.material3;

import a2.b;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Immutable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u001D\n\u0002\u0010\b\n\u0002\b\\\b\u0007\u0018\u00002\u00020\u0001B\u00DF\u0002\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0002\u0012\u0006\u0010\t\u001A\u00020\u0002\u0012\u0006\u0010\n\u001A\u00020\u0002\u0012\u0006\u0010\u000B\u001A\u00020\u0002\u0012\u0006\u0010\f\u001A\u00020\u0002\u0012\u0006\u0010\u000E\u001A\u00020\r\u0012\u0006\u0010\u000F\u001A\u00020\u0002\u0012\u0006\u0010\u0010\u001A\u00020\u0002\u0012\u0006\u0010\u0011\u001A\u00020\u0002\u0012\u0006\u0010\u0012\u001A\u00020\u0002\u0012\u0006\u0010\u0013\u001A\u00020\u0002\u0012\u0006\u0010\u0014\u001A\u00020\u0002\u0012\u0006\u0010\u0015\u001A\u00020\u0002\u0012\u0006\u0010\u0016\u001A\u00020\u0002\u0012\u0006\u0010\u0017\u001A\u00020\u0002\u0012\u0006\u0010\u0018\u001A\u00020\u0002\u0012\u0006\u0010\u0019\u001A\u00020\u0002\u0012\u0006\u0010\u001A\u001A\u00020\u0002\u0012\u0006\u0010\u001B\u001A\u00020\u0002\u0012\u0006\u0010\u001C\u001A\u00020\u0002\u0012\u0006\u0010\u001D\u001A\u00020\u0002\u0012\u0006\u0010\u001E\u001A\u00020\u0002\u0012\u0006\u0010\u001F\u001A\u00020\u0002\u0012\u0006\u0010 \u001A\u00020\u0002\u0012\u0006\u0010!\u001A\u00020\u0002\u0012\u0006\u0010\"\u001A\u00020\u0002\u0012\u0006\u0010#\u001A\u00020\u0002\u0012\u0006\u0010$\u001A\u00020\u0002\u0012\u0006\u0010%\u001A\u00020\u0002\u0012\u0006\u0010&\u001A\u00020\u0002\u0012\u0006\u0010\'\u001A\u00020\u0002\u0012\u0006\u0010(\u001A\u00020\u0002\u0012\u0006\u0010)\u001A\u00020\u0002\u0012\u0006\u0010*\u001A\u00020\u0002\u0012\u0006\u0010+\u001A\u00020\u0002\u0012\u0006\u0010,\u001A\u00020\u0002\u0012\u0006\u0010-\u001A\u00020\u0002\u0012\u0006\u0010.\u001A\u00020\u0002\u00A2\u0006\u0004\b/\u00100J\u00C0\u0003\u00103\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00022\b\b\u0002\u0010\t\u001A\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u000B\u001A\u00020\u00022\b\b\u0002\u0010\f\u001A\u00020\u00022\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000F\u001A\u00020\u00022\b\b\u0002\u0010\u0010\u001A\u00020\u00022\b\b\u0002\u0010\u0011\u001A\u00020\u00022\b\b\u0002\u0010\u0012\u001A\u00020\u00022\b\b\u0002\u0010\u0013\u001A\u00020\u00022\b\b\u0002\u0010\u0014\u001A\u00020\u00022\b\b\u0002\u0010\u0015\u001A\u00020\u00022\b\b\u0002\u0010\u0016\u001A\u00020\u00022\b\b\u0002\u0010\u0017\u001A\u00020\u00022\b\b\u0002\u0010\u0018\u001A\u00020\u00022\b\b\u0002\u0010\u0019\u001A\u00020\u00022\b\b\u0002\u0010\u001A\u001A\u00020\u00022\b\b\u0002\u0010\u001B\u001A\u00020\u00022\b\b\u0002\u0010\u001C\u001A\u00020\u00022\b\b\u0002\u0010\u001D\u001A\u00020\u00022\b\b\u0002\u0010\u001E\u001A\u00020\u00022\b\b\u0002\u0010\u001F\u001A\u00020\u00022\b\b\u0002\u0010 \u001A\u00020\u00022\b\b\u0002\u0010!\u001A\u00020\u00022\b\b\u0002\u0010\"\u001A\u00020\u00022\b\b\u0002\u0010#\u001A\u00020\u00022\b\b\u0002\u0010$\u001A\u00020\u00022\b\b\u0002\u0010%\u001A\u00020\u00022\b\b\u0002\u0010&\u001A\u00020\u00022\b\b\u0002\u0010\'\u001A\u00020\u00022\b\b\u0002\u0010(\u001A\u00020\u00022\b\b\u0002\u0010)\u001A\u00020\u00022\b\b\u0002\u0010*\u001A\u00020\u00022\b\b\u0002\u0010+\u001A\u00020\u00022\b\b\u0002\u0010,\u001A\u00020\u00022\b\b\u0002\u0010-\u001A\u00020\u00022\b\b\u0002\u0010.\u001A\u00020\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\b1\u00102J#\u00108\u001A\u00020\r*\u0004\u0018\u00010\r2\f\u00105\u001A\b\u0012\u0004\u0012\u00020\r04H\u0000\u00A2\u0006\u0004\b6\u00107J-\u0010?\u001A\u00020\u00022\u0006\u0010:\u001A\u0002092\u0006\u0010;\u001A\u0002092\u0006\u0010<\u001A\u000209H\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b=\u0010>J-\u0010A\u001A\u00020\u00022\u0006\u0010:\u001A\u0002092\u0006\u0010;\u001A\u0002092\u0006\u0010<\u001A\u000209H\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b@\u0010>J-\u0010C\u001A\u00020\u00022\u0006\u0010:\u001A\u0002092\u0006\u0010;\u001A\u0002092\u0006\u0010<\u001A\u000209H\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\bB\u0010>J-\u0010E\u001A\u00020\u00022\u0006\u0010:\u001A\u0002092\u0006\u0010;\u001A\u0002092\u0006\u0010<\u001A\u000209H\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\bD\u0010>J-\u0010G\u001A\u00020\u00022\u0006\u0010:\u001A\u0002092\u0006\u0010;\u001A\u0002092\u0006\u0010<\u001A\u000209H\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\bF\u0010>J-\u0010I\u001A\u00020\u00022\u0006\u0010:\u001A\u0002092\u0006\u0010;\u001A\u0002092\u0006\u0010<\u001A\u000209H\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\bH\u0010>J-\u0010K\u001A\u00020\u00022\u0006\u0010:\u001A\u0002092\u0006\u0010;\u001A\u0002092\u0006\u0010<\u001A\u000209H\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\bJ\u0010>J-\u0010M\u001A\u00020\u00022\u0006\u0010:\u001A\u0002092\u0006\u0010;\u001A\u0002092\u0006\u0010<\u001A\u000209H\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\bL\u0010>J-\u0010O\u001A\u00020\u00022\u0006\u0010:\u001A\u0002092\u0006\u0010;\u001A\u0002092\u0006\u0010<\u001A\u000209H\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\bN\u0010>J-\u0010Q\u001A\u00020\u00022\u0006\u0010:\u001A\u0002092\u0006\u0010;\u001A\u0002092\u0006\u0010<\u001A\u000209H\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\bP\u0010>J\u001D\u0010\u000B\u001A\u00020\u00022\u0006\u0010;\u001A\u000209H\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\bR\u0010SJ\u001A\u0010U\u001A\u0002092\b\u0010T\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\bU\u0010VJ\u000F\u0010X\u001A\u00020WH\u0016\u00A2\u0006\u0004\bX\u0010YR\u001D\u0010\u0003\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bZ\u0010[\u001A\u0004\b\\\u0010]R\u001D\u0010\u0004\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b^\u0010[\u001A\u0004\b_\u0010]R\u001D\u0010\u0005\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b`\u0010[\u001A\u0004\ba\u0010]R\u001D\u0010\u0006\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bb\u0010[\u001A\u0004\bc\u0010]R\u001D\u0010\u0007\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bd\u0010[\u001A\u0004\be\u0010]R\u001D\u0010\b\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bf\u0010[\u001A\u0004\bg\u0010]R\u001D\u0010\t\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bh\u0010[\u001A\u0004\bi\u0010]R\u001D\u0010\n\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bj\u0010[\u001A\u0004\bk\u0010]R\u001D\u0010\u000B\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bl\u0010[\u001A\u0004\bm\u0010]R\u001D\u0010\f\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bn\u0010[\u001A\u0004\bo\u0010]R\u0017\u0010\u000E\u001A\u00020\r8\u0006\u00A2\u0006\f\n\u0004\bp\u0010q\u001A\u0004\br\u0010sR\u001D\u0010\u000F\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bt\u0010[\u001A\u0004\bu\u0010]R\u001D\u0010\u0010\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bv\u0010[\u001A\u0004\bw\u0010]R\u001D\u0010\u0011\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bx\u0010[\u001A\u0004\by\u0010]R\u001D\u0010\u0012\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bz\u0010[\u001A\u0004\b{\u0010]R\u001D\u0010\u0013\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b|\u0010[\u001A\u0004\b}\u0010]R\u001D\u0010\u0014\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b~\u0010[\u001A\u0004\b\u007F\u0010]R\u001F\u0010\u0015\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u0080\u0001\u0010[\u001A\u0005\b\u0081\u0001\u0010]R\u001F\u0010\u0016\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u0082\u0001\u0010[\u001A\u0005\b\u0083\u0001\u0010]R\u001F\u0010\u0017\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u0084\u0001\u0010[\u001A\u0005\b\u0085\u0001\u0010]R\u001F\u0010\u0018\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u0086\u0001\u0010[\u001A\u0005\b\u0087\u0001\u0010]R\u001F\u0010\u0019\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u0088\u0001\u0010[\u001A\u0005\b\u0089\u0001\u0010]R\u001F\u0010\u001A\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u008A\u0001\u0010[\u001A\u0005\b\u008B\u0001\u0010]R\u001F\u0010\u001B\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u008C\u0001\u0010[\u001A\u0005\b\u008D\u0001\u0010]R\u001F\u0010\u001C\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u008E\u0001\u0010[\u001A\u0005\b\u008F\u0001\u0010]R\u001F\u0010\u001D\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u0090\u0001\u0010[\u001A\u0005\b\u0091\u0001\u0010]R\u001F\u0010\u001E\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u0092\u0001\u0010[\u001A\u0005\b\u0093\u0001\u0010]R\u001F\u0010\u001F\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u0094\u0001\u0010[\u001A\u0005\b\u0095\u0001\u0010]R\u001F\u0010 \u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u0096\u0001\u0010[\u001A\u0005\b\u0097\u0001\u0010]R\u001F\u0010!\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u0098\u0001\u0010[\u001A\u0005\b\u0099\u0001\u0010]R\u001F\u0010\"\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u009A\u0001\u0010[\u001A\u0005\b\u009B\u0001\u0010]R\u001F\u0010#\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u009C\u0001\u0010[\u001A\u0005\b\u009D\u0001\u0010]R\u001F\u0010$\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u009E\u0001\u0010[\u001A\u0005\b\u009F\u0001\u0010]R\u001F\u0010%\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u00A0\u0001\u0010[\u001A\u0005\b\u00A1\u0001\u0010]R\u001F\u0010&\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u00A2\u0001\u0010[\u001A\u0005\b\u00A3\u0001\u0010]R\u001E\u0010\'\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\r\n\u0004\b[\u0010[\u001A\u0005\b\u00A4\u0001\u0010]R\u001F\u0010(\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u00A5\u0001\u0010[\u001A\u0005\b\u00A6\u0001\u0010]R\u001F\u0010)\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u00A7\u0001\u0010[\u001A\u0005\b\u00A8\u0001\u0010]R\u001F\u0010*\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u00A9\u0001\u0010[\u001A\u0005\b\u00AA\u0001\u0010]R\u001F\u0010+\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u00AB\u0001\u0010[\u001A\u0005\b\u00AC\u0001\u0010]R\u001F\u0010,\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u00AD\u0001\u0010[\u001A\u0005\b\u00AE\u0001\u0010]R\u001F\u0010-\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u00AF\u0001\u0010[\u001A\u0005\b\u00B0\u0001\u0010]R\u001F\u0010.\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u00B1\u0001\u0010[\u001A\u0005\b\u00B2\u0001\u0010]\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006\u00B3\u0001"}, d2 = {"Landroidx/compose/material3/TextFieldColors;", "", "Landroidx/compose/ui/graphics/Color;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "textSelectionColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "<init>", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-ejIjP34", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/TextFieldColors;", "copy", "Lkotlin/Function0;", "block", "takeOrElse$material3_release", "(Landroidx/compose/foundation/text/selection/TextSelectionColors;Lkotlin/jvm/functions/Function0;)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "takeOrElse", "", "enabled", "isError", "focused", "leadingIconColor-XeAY9LY$material3_release", "(ZZZ)J", "leadingIconColor", "trailingIconColor-XeAY9LY$material3_release", "trailingIconColor", "indicatorColor-XeAY9LY$material3_release", "indicatorColor", "containerColor-XeAY9LY$material3_release", "containerColor", "placeholderColor-XeAY9LY$material3_release", "placeholderColor", "labelColor-XeAY9LY$material3_release", "labelColor", "textColor-XeAY9LY$material3_release", "textColor", "supportingTextColor-XeAY9LY$material3_release", "supportingTextColor", "prefixColor-XeAY9LY$material3_release", "prefixColor", "suffixColor-XeAY9LY$material3_release", "suffixColor", "cursorColor-vNxB06k$material3_release", "(Z)J", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "J", "getFocusedTextColor-0d7_KjU", "()J", "b", "getUnfocusedTextColor-0d7_KjU", "c", "getDisabledTextColor-0d7_KjU", "d", "getErrorTextColor-0d7_KjU", "e", "getFocusedContainerColor-0d7_KjU", "f", "getUnfocusedContainerColor-0d7_KjU", "g", "getDisabledContainerColor-0d7_KjU", "h", "getErrorContainerColor-0d7_KjU", "i", "getCursorColor-0d7_KjU", "j", "getErrorCursorColor-0d7_KjU", "k", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "getTextSelectionColors", "()Landroidx/compose/foundation/text/selection/TextSelectionColors;", "l", "getFocusedIndicatorColor-0d7_KjU", "m", "getUnfocusedIndicatorColor-0d7_KjU", "n", "getDisabledIndicatorColor-0d7_KjU", "o", "getErrorIndicatorColor-0d7_KjU", "p", "getFocusedLeadingIconColor-0d7_KjU", "q", "getUnfocusedLeadingIconColor-0d7_KjU", "r", "getDisabledLeadingIconColor-0d7_KjU", "s", "getErrorLeadingIconColor-0d7_KjU", "t", "getFocusedTrailingIconColor-0d7_KjU", "u", "getUnfocusedTrailingIconColor-0d7_KjU", "v", "getDisabledTrailingIconColor-0d7_KjU", "w", "getErrorTrailingIconColor-0d7_KjU", "x", "getFocusedLabelColor-0d7_KjU", "y", "getUnfocusedLabelColor-0d7_KjU", "z", "getDisabledLabelColor-0d7_KjU", "A", "getErrorLabelColor-0d7_KjU", "B", "getFocusedPlaceholderColor-0d7_KjU", "C", "getUnfocusedPlaceholderColor-0d7_KjU", "D", "getDisabledPlaceholderColor-0d7_KjU", "E", "getErrorPlaceholderColor-0d7_KjU", "F", "getFocusedSupportingTextColor-0d7_KjU", "G", "getUnfocusedSupportingTextColor-0d7_KjU", "H", "getDisabledSupportingTextColor-0d7_KjU", "I", "getErrorSupportingTextColor-0d7_KjU", "getFocusedPrefixColor-0d7_KjU", "K", "getUnfocusedPrefixColor-0d7_KjU", "L", "getDisabledPrefixColor-0d7_KjU", "M", "getErrorPrefixColor-0d7_KjU", "N", "getFocusedSuffixColor-0d7_KjU", "O", "getUnfocusedSuffixColor-0d7_KjU", "P", "getDisabledSuffixColor-0d7_KjU", "Q", "getErrorSuffixColor-0d7_KjU", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,1698:1\n708#2:1699\n696#2:1700\n708#2:1701\n696#2:1702\n708#2:1703\n696#2:1704\n708#2:1705\n696#2:1706\n708#2:1707\n696#2:1708\n708#2:1709\n696#2:1710\n708#2:1711\n696#2:1712\n708#2:1713\n696#2:1714\n708#2:1715\n696#2:1716\n708#2:1717\n696#2:1718\n708#2:1719\n696#2:1720\n708#2:1721\n696#2:1722\n708#2:1723\n696#2:1724\n708#2:1725\n696#2:1726\n708#2:1727\n696#2:1728\n708#2:1729\n696#2:1730\n708#2:1731\n696#2:1732\n708#2:1733\n696#2:1734\n708#2:1735\n696#2:1736\n708#2:1737\n696#2:1738\n708#2:1739\n696#2:1740\n708#2:1741\n696#2:1742\n708#2:1743\n696#2:1744\n708#2:1745\n696#2:1746\n708#2:1747\n696#2:1748\n708#2:1749\n696#2:1750\n708#2:1751\n696#2:1752\n708#2:1753\n696#2:1754\n708#2:1755\n696#2:1756\n708#2:1757\n696#2:1758\n708#2:1759\n696#2:1760\n708#2:1761\n696#2:1762\n708#2:1763\n696#2:1764\n708#2:1765\n696#2:1766\n708#2:1767\n696#2:1768\n708#2:1769\n696#2:1770\n708#2:1771\n696#2:1772\n708#2:1773\n696#2:1774\n708#2:1775\n696#2:1776\n708#2:1777\n696#2:1778\n708#2:1779\n696#2:1780\n708#2:1781\n696#2:1782\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldColors\n*L\n1342#1:1699\n1342#1:1700\n1343#1:1701\n1343#1:1702\n1344#1:1703\n1344#1:1704\n1345#1:1705\n1345#1:1706\n1346#1:1707\n1346#1:1708\n1347#1:1709\n1347#1:1710\n1348#1:1711\n1348#1:1712\n1349#1:1713\n1349#1:1714\n1350#1:1715\n1350#1:1716\n1351#1:1717\n1351#1:1718\n1353#1:1719\n1353#1:1720\n1354#1:1721\n1354#1:1722\n1355#1:1723\n1355#1:1724\n1356#1:1725\n1356#1:1726\n1357#1:1727\n1357#1:1728\n1358#1:1729\n1358#1:1730\n1359#1:1731\n1359#1:1732\n1360#1:1733\n1360#1:1734\n1361#1:1735\n1361#1:1736\n1362#1:1737\n1362#1:1738\n1363#1:1739\n1363#1:1740\n1364#1:1741\n1364#1:1742\n1365#1:1743\n1365#1:1744\n1366#1:1745\n1366#1:1746\n1367#1:1747\n1367#1:1748\n1368#1:1749\n1368#1:1750\n1369#1:1751\n1369#1:1752\n1370#1:1753\n1370#1:1754\n1371#1:1755\n1371#1:1756\n1372#1:1757\n1372#1:1758\n1373#1:1759\n1373#1:1760\n1374#1:1761\n1374#1:1762\n1375#1:1763\n1375#1:1764\n1376#1:1765\n1376#1:1766\n1377#1:1767\n1377#1:1768\n1378#1:1769\n1378#1:1770\n1379#1:1771\n1379#1:1772\n1380#1:1773\n1380#1:1774\n1381#1:1775\n1381#1:1776\n1382#1:1777\n1382#1:1778\n1383#1:1779\n1383#1:1780\n1384#1:1781\n1384#1:1782\n*E\n"})
public final class TextFieldColors {
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
    public final long K;
    public final long L;
    public final long M;
    public final long N;
    public final long O;
    public final long P;
    public final long Q;
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final TextSelectionColors k;
    public final long l;
    public final long m;
    public final long n;
    public final long o;
    public final long p;
    public final long q;
    public final long r;
    public final long s;
    public final long t;
    public final long u;
    public final long v;
    public final long w;
    public final long x;
    public final long y;
    public final long z;

    public TextFieldColors(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, TextSelectionColors textSelectionColors0, long v10, long v11, long v12, long v13, long v14, long v15, long v16, long v17, long v18, long v19, long v20, long v21, long v22, long v23, long v24, long v25, long v26, long v27, long v28, long v29, long v30, long v31, long v32, long v33, long v34, long v35, long v36, long v37, long v38, long v39, long v40, long v41, DefaultConstructorMarker defaultConstructorMarker0) {
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
        this.k = textSelectionColors0;
        this.l = v10;
        this.m = v11;
        this.n = v12;
        this.o = v13;
        this.p = v14;
        this.q = v15;
        this.r = v16;
        this.s = v17;
        this.t = v18;
        this.u = v19;
        this.v = v20;
        this.w = v21;
        this.x = v22;
        this.y = v23;
        this.z = v24;
        this.A = v25;
        this.B = v26;
        this.C = v27;
        this.D = v28;
        this.E = v29;
        this.F = v30;
        this.G = v31;
        this.H = v32;
        this.I = v33;
        this.J = v34;
        this.K = v35;
        this.L = v36;
        this.M = v37;
        this.N = v38;
        this.O = v39;
        this.P = v40;
        this.Q = v41;
    }

    @Stable
    public final long containerColor-XeAY9LY$material3_release(boolean z, boolean z1, boolean z2) {
        if(!z) {
            return this.g;
        }
        if(z1) {
            return this.h;
        }
        return z2 ? this.e : this.f;
    }

    @NotNull
    public final TextFieldColors copy-ejIjP34(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, @Nullable TextSelectionColors textSelectionColors0, long v10, long v11, long v12, long v13, long v14, long v15, long v16, long v17, long v18, long v19, long v20, long v21, long v22, long v23, long v24, long v25, long v26, long v27, long v28, long v29, long v30, long v31, long v32, long v33, long v34, long v35, long v36, long v37, long v38, long v39, long v40, long v41) {
        long v42 = v == 16L ? this.a : v;
        long v43 = v1 == 16L ? this.b : v1;
        long v44 = v2 == 16L ? this.c : v2;
        long v45 = v3 == 16L ? this.d : v3;
        long v46 = v4 == 16L ? this.e : v4;
        long v47 = v5 == 16L ? this.f : v5;
        long v48 = v6 == 16L ? this.g : v6;
        long v49 = v7 == 16L ? this.h : v7;
        long v50 = v8 == 16L ? this.i : v8;
        long v51 = v9 == 16L ? this.j : v9;
        TextSelectionColors textSelectionColors1 = this.takeOrElse$material3_release(textSelectionColors0, new b(this, 12));
        long v52 = v10 == 16L ? this.l : v10;
        long v53 = v11 == 16L ? this.m : v11;
        long v54 = v12 == 16L ? this.n : v12;
        long v55 = v13 == 16L ? this.o : v13;
        long v56 = v14 == 16L ? this.p : v14;
        long v57 = v15 == 16L ? this.q : v15;
        long v58 = v16 == 16L ? this.r : v16;
        long v59 = v17 == 16L ? this.s : v17;
        long v60 = v18 == 16L ? this.t : v18;
        long v61 = v19 == 16L ? this.u : v19;
        long v62 = v20 == 16L ? this.v : v20;
        long v63 = v21 == 16L ? this.w : v21;
        long v64 = v22 == 16L ? this.x : v22;
        long v65 = v23 == 16L ? this.y : v23;
        long v66 = v24 == 16L ? this.z : v24;
        long v67 = v25 == 16L ? this.A : v25;
        long v68 = v26 == 16L ? this.B : v26;
        long v69 = v27 == 16L ? this.C : v27;
        long v70 = v28 == 16L ? this.D : v28;
        long v71 = v29 == 16L ? this.E : v29;
        long v72 = v30 == 16L ? this.F : v30;
        long v73 = v31 == 16L ? this.G : v31;
        long v74 = v32 == 16L ? this.H : v32;
        long v75 = v33 == 16L ? this.I : v33;
        long v76 = v34 == 16L ? this.J : v34;
        long v77 = v35 == 16L ? this.K : v35;
        long v78 = v36 == 16L ? this.L : v36;
        long v79 = v37 == 16L ? this.M : v37;
        long v80 = v38 == 16L ? this.N : v38;
        long v81 = v39 == 16L ? this.O : v39;
        long v82 = v40 == 16L ? this.P : v40;
        return v41 == 16L ? new TextFieldColors(v42, v43, v44, v45, v46, v47, v48, v49, v50, v51, textSelectionColors1, v52, v53, v54, v55, v56, v57, v58, v59, v60, v61, v62, v63, v64, v65, v66, v67, v68, v69, v70, v71, v72, v73, v74, v75, v76, v77, v78, v79, v80, v81, v82, this.Q, null) : new TextFieldColors(v42, v43, v44, v45, v46, v47, v48, v49, v50, v51, textSelectionColors1, v52, v53, v54, v55, v56, v57, v58, v59, v60, v61, v62, v63, v64, v65, v66, v67, v68, v69, v70, v71, v72, v73, v74, v75, v76, v77, v78, v79, v80, v81, v82, v41, null);
    }

    public static TextFieldColors copy-ejIjP34$default(TextFieldColors textFieldColors0, long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, TextSelectionColors textSelectionColors0, long v10, long v11, long v12, long v13, long v14, long v15, long v16, long v17, long v18, long v19, long v20, long v21, long v22, long v23, long v24, long v25, long v26, long v27, long v28, long v29, long v30, long v31, long v32, long v33, long v34, long v35, long v36, long v37, long v38, long v39, long v40, long v41, int v42, int v43, Object object0) {
        long v44 = (v42 & 1) == 0 ? v : textFieldColors0.a;
        long v45 = (v42 & 2) == 0 ? v1 : textFieldColors0.b;
        long v46 = (v42 & 4) == 0 ? v2 : textFieldColors0.c;
        long v47 = (v42 & 8) == 0 ? v3 : textFieldColors0.d;
        long v48 = (v42 & 16) == 0 ? v4 : textFieldColors0.e;
        long v49 = (v42 & 0x20) == 0 ? v5 : textFieldColors0.f;
        long v50 = (v42 & 0x40) == 0 ? v6 : textFieldColors0.g;
        long v51 = (v42 & 0x80) == 0 ? v7 : textFieldColors0.h;
        long v52 = (v42 & 0x100) == 0 ? v8 : textFieldColors0.i;
        long v53 = (v42 & 0x200) == 0 ? v9 : textFieldColors0.j;
        TextSelectionColors textSelectionColors1 = (v42 & 0x400) == 0 ? textSelectionColors0 : textFieldColors0.k;
        long v54 = (v42 & 0x800) == 0 ? v10 : textFieldColors0.l;
        long v55 = (v42 & 0x1000) == 0 ? v11 : textFieldColors0.m;
        long v56 = (v42 & 0x2000) == 0 ? v12 : textFieldColors0.n;
        long v57 = (v42 & 0x4000) == 0 ? v13 : textFieldColors0.o;
        long v58 = (0x8000 & v42) == 0 ? v14 : textFieldColors0.p;
        long v59 = (0x10000 & v42) == 0 ? v15 : textFieldColors0.q;
        long v60 = (0x20000 & v42) == 0 ? v16 : textFieldColors0.r;
        long v61 = (0x40000 & v42) == 0 ? v17 : textFieldColors0.s;
        long v62 = (0x80000 & v42) == 0 ? v18 : textFieldColors0.t;
        long v63 = (0x100000 & v42) == 0 ? v19 : textFieldColors0.u;
        long v64 = (0x200000 & v42) == 0 ? v20 : textFieldColors0.v;
        long v65 = (0x400000 & v42) == 0 ? v21 : textFieldColors0.w;
        long v66 = (0x800000 & v42) == 0 ? v22 : textFieldColors0.x;
        long v67 = (0x1000000 & v42) == 0 ? v23 : textFieldColors0.y;
        long v68 = (0x2000000 & v42) == 0 ? v24 : textFieldColors0.z;
        long v69 = (0x4000000 & v42) == 0 ? v25 : textFieldColors0.A;
        long v70 = (0x8000000 & v42) == 0 ? v26 : textFieldColors0.B;
        long v71 = (0x10000000 & v42) == 0 ? v27 : textFieldColors0.C;
        long v72 = (0x20000000 & v42) == 0 ? v28 : textFieldColors0.D;
        long v73 = (0x40000000 & v42) == 0 ? v29 : textFieldColors0.E;
        long v74 = (v42 & 0x80000000) == 0 ? v30 : textFieldColors0.F;
        long v75 = (v43 & 1) == 0 ? v31 : textFieldColors0.G;
        long v76 = (v43 & 2) == 0 ? v32 : textFieldColors0.H;
        long v77 = (v43 & 4) == 0 ? v33 : textFieldColors0.I;
        long v78 = (v43 & 8) == 0 ? v34 : textFieldColors0.J;
        long v79 = (v43 & 16) == 0 ? v35 : textFieldColors0.K;
        long v80 = (v43 & 0x20) == 0 ? v36 : textFieldColors0.L;
        long v81 = (v43 & 0x40) == 0 ? v37 : textFieldColors0.M;
        long v82 = (v43 & 0x80) == 0 ? v38 : textFieldColors0.N;
        long v83 = (v43 & 0x100) == 0 ? v39 : textFieldColors0.O;
        long v84 = (v43 & 0x200) == 0 ? v40 : textFieldColors0.P;
        return (v43 & 0x400) == 0 ? textFieldColors0.copy-ejIjP34(v44, v45, v46, v47, v48, v49, v50, v51, v52, v53, textSelectionColors1, v54, v55, v56, v57, v58, v59, v60, v61, v62, v63, v64, v65, v66, v67, v68, v69, v70, v71, v72, v73, v74, v75, v76, v77, v78, v79, v80, v81, v82, v83, v84, v41) : textFieldColors0.copy-ejIjP34(v44, v45, v46, v47, v48, v49, v50, v51, v52, v53, textSelectionColors1, v54, v55, v56, v57, v58, v59, v60, v61, v62, v63, v64, v65, v66, v67, v68, v69, v70, v71, v72, v73, v74, v75, v76, v77, v78, v79, v80, v81, v82, v83, v84, textFieldColors0.Q);
    }

    // 去混淆评级： 低(20)
    @Stable
    public final long cursorColor-vNxB06k$material3_release(boolean z) {
        return z ? this.j : this.i;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && object0 instanceof TextFieldColors) {
            TextFieldColors textFieldColors0 = (TextFieldColors)object0;
            if(!Color.equals-impl0(this.a, textFieldColors0.a)) {
                return false;
            }
            if(!Color.equals-impl0(this.b, textFieldColors0.b)) {
                return false;
            }
            if(!Color.equals-impl0(this.c, textFieldColors0.c)) {
                return false;
            }
            if(!Color.equals-impl0(this.d, textFieldColors0.d)) {
                return false;
            }
            if(!Color.equals-impl0(this.e, textFieldColors0.e)) {
                return false;
            }
            if(!Color.equals-impl0(this.f, textFieldColors0.f)) {
                return false;
            }
            if(!Color.equals-impl0(this.g, textFieldColors0.g)) {
                return false;
            }
            if(!Color.equals-impl0(this.h, textFieldColors0.h)) {
                return false;
            }
            if(!Color.equals-impl0(this.i, textFieldColors0.i)) {
                return false;
            }
            if(!Color.equals-impl0(this.j, textFieldColors0.j)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.k, textFieldColors0.k)) {
                return false;
            }
            if(!Color.equals-impl0(this.l, textFieldColors0.l)) {
                return false;
            }
            if(!Color.equals-impl0(this.m, textFieldColors0.m)) {
                return false;
            }
            if(!Color.equals-impl0(this.n, textFieldColors0.n)) {
                return false;
            }
            if(!Color.equals-impl0(this.o, textFieldColors0.o)) {
                return false;
            }
            if(!Color.equals-impl0(this.p, textFieldColors0.p)) {
                return false;
            }
            if(!Color.equals-impl0(this.q, textFieldColors0.q)) {
                return false;
            }
            if(!Color.equals-impl0(this.r, textFieldColors0.r)) {
                return false;
            }
            if(!Color.equals-impl0(this.s, textFieldColors0.s)) {
                return false;
            }
            if(!Color.equals-impl0(this.t, textFieldColors0.t)) {
                return false;
            }
            if(!Color.equals-impl0(this.u, textFieldColors0.u)) {
                return false;
            }
            if(!Color.equals-impl0(this.v, textFieldColors0.v)) {
                return false;
            }
            if(!Color.equals-impl0(this.w, textFieldColors0.w)) {
                return false;
            }
            if(!Color.equals-impl0(this.x, textFieldColors0.x)) {
                return false;
            }
            if(!Color.equals-impl0(this.y, textFieldColors0.y)) {
                return false;
            }
            if(!Color.equals-impl0(this.z, textFieldColors0.z)) {
                return false;
            }
            if(!Color.equals-impl0(this.A, textFieldColors0.A)) {
                return false;
            }
            if(!Color.equals-impl0(this.B, textFieldColors0.B)) {
                return false;
            }
            if(!Color.equals-impl0(this.C, textFieldColors0.C)) {
                return false;
            }
            if(!Color.equals-impl0(this.D, textFieldColors0.D)) {
                return false;
            }
            if(!Color.equals-impl0(this.E, textFieldColors0.E)) {
                return false;
            }
            if(!Color.equals-impl0(this.F, textFieldColors0.F)) {
                return false;
            }
            if(!Color.equals-impl0(this.G, textFieldColors0.G)) {
                return false;
            }
            if(!Color.equals-impl0(this.H, textFieldColors0.H)) {
                return false;
            }
            if(!Color.equals-impl0(this.I, textFieldColors0.I)) {
                return false;
            }
            if(!Color.equals-impl0(this.J, textFieldColors0.J)) {
                return false;
            }
            if(!Color.equals-impl0(this.K, textFieldColors0.K)) {
                return false;
            }
            if(!Color.equals-impl0(this.L, textFieldColors0.L)) {
                return false;
            }
            if(!Color.equals-impl0(this.M, textFieldColors0.M)) {
                return false;
            }
            if(!Color.equals-impl0(this.N, textFieldColors0.N)) {
                return false;
            }
            if(!Color.equals-impl0(this.O, textFieldColors0.O)) {
                return false;
            }
            return Color.equals-impl0(this.P, textFieldColors0.P) ? Color.equals-impl0(this.Q, textFieldColors0.Q) : false;
        }
        return false;
    }

    public final long getCursorColor-0d7_KjU() {
        return this.i;
    }

    public final long getDisabledContainerColor-0d7_KjU() {
        return this.g;
    }

    public final long getDisabledIndicatorColor-0d7_KjU() {
        return this.n;
    }

    public final long getDisabledLabelColor-0d7_KjU() {
        return this.z;
    }

    public final long getDisabledLeadingIconColor-0d7_KjU() {
        return this.r;
    }

    public final long getDisabledPlaceholderColor-0d7_KjU() {
        return this.D;
    }

    public final long getDisabledPrefixColor-0d7_KjU() {
        return this.L;
    }

    public final long getDisabledSuffixColor-0d7_KjU() {
        return this.P;
    }

    public final long getDisabledSupportingTextColor-0d7_KjU() {
        return this.H;
    }

    public final long getDisabledTextColor-0d7_KjU() {
        return this.c;
    }

    public final long getDisabledTrailingIconColor-0d7_KjU() {
        return this.v;
    }

    public final long getErrorContainerColor-0d7_KjU() {
        return this.h;
    }

    public final long getErrorCursorColor-0d7_KjU() {
        return this.j;
    }

    public final long getErrorIndicatorColor-0d7_KjU() {
        return this.o;
    }

    public final long getErrorLabelColor-0d7_KjU() {
        return this.A;
    }

    public final long getErrorLeadingIconColor-0d7_KjU() {
        return this.s;
    }

    public final long getErrorPlaceholderColor-0d7_KjU() {
        return this.E;
    }

    public final long getErrorPrefixColor-0d7_KjU() {
        return this.M;
    }

    public final long getErrorSuffixColor-0d7_KjU() {
        return this.Q;
    }

    public final long getErrorSupportingTextColor-0d7_KjU() {
        return this.I;
    }

    public final long getErrorTextColor-0d7_KjU() {
        return this.d;
    }

    public final long getErrorTrailingIconColor-0d7_KjU() {
        return this.w;
    }

    public final long getFocusedContainerColor-0d7_KjU() {
        return this.e;
    }

    public final long getFocusedIndicatorColor-0d7_KjU() {
        return this.l;
    }

    public final long getFocusedLabelColor-0d7_KjU() {
        return this.x;
    }

    public final long getFocusedLeadingIconColor-0d7_KjU() {
        return this.p;
    }

    public final long getFocusedPlaceholderColor-0d7_KjU() {
        return this.B;
    }

    public final long getFocusedPrefixColor-0d7_KjU() {
        return this.J;
    }

    public final long getFocusedSuffixColor-0d7_KjU() {
        return this.N;
    }

    public final long getFocusedSupportingTextColor-0d7_KjU() {
        return this.F;
    }

    public final long getFocusedTextColor-0d7_KjU() {
        return this.a;
    }

    public final long getFocusedTrailingIconColor-0d7_KjU() {
        return this.t;
    }

    @NotNull
    public final TextSelectionColors getTextSelectionColors() {
        return this.k;
    }

    public final long getUnfocusedContainerColor-0d7_KjU() {
        return this.f;
    }

    public final long getUnfocusedIndicatorColor-0d7_KjU() {
        return this.m;
    }

    public final long getUnfocusedLabelColor-0d7_KjU() {
        return this.y;
    }

    public final long getUnfocusedLeadingIconColor-0d7_KjU() {
        return this.q;
    }

    public final long getUnfocusedPlaceholderColor-0d7_KjU() {
        return this.C;
    }

    public final long getUnfocusedPrefixColor-0d7_KjU() {
        return this.K;
    }

    public final long getUnfocusedSuffixColor-0d7_KjU() {
        return this.O;
    }

    public final long getUnfocusedSupportingTextColor-0d7_KjU() {
        return this.G;
    }

    public final long getUnfocusedTextColor-0d7_KjU() {
        return this.b;
    }

    public final long getUnfocusedTrailingIconColor-0d7_KjU() {
        return this.u;
    }

    @Override
    public int hashCode() {
        return Color.hashCode-impl(this.Q) + a.a(this.P, a.a(this.O, a.a(this.N, a.a(this.M, a.a(this.L, a.a(this.K, a.a(this.J, a.a(this.I, a.a(this.H, a.a(this.G, a.a(this.F, a.a(this.E, a.a(this.D, a.a(this.C, a.a(this.B, a.a(this.A, a.a(this.z, a.a(this.y, a.a(this.x, a.a(this.w, a.a(this.v, a.a(this.u, a.a(this.t, a.a(this.s, a.a(this.r, a.a(this.q, a.a(this.p, a.a(this.o, a.a(this.n, a.a(this.m, a.a(this.l, (this.k.hashCode() + a.a(this.j, a.a(this.i, a.a(this.h, a.a(this.g, a.a(this.f, a.a(this.e, a.a(this.d, a.a(this.c, a.a(this.b, Color.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F)) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
    }

    @Stable
    public final long indicatorColor-XeAY9LY$material3_release(boolean z, boolean z1, boolean z2) {
        if(!z) {
            return this.n;
        }
        if(z1) {
            return this.o;
        }
        return z2 ? this.l : this.m;
    }

    @Stable
    public final long labelColor-XeAY9LY$material3_release(boolean z, boolean z1, boolean z2) {
        if(!z) {
            return this.z;
        }
        if(z1) {
            return this.A;
        }
        return z2 ? this.x : this.y;
    }

    @Stable
    public final long leadingIconColor-XeAY9LY$material3_release(boolean z, boolean z1, boolean z2) {
        if(!z) {
            return this.r;
        }
        if(z1) {
            return this.s;
        }
        return z2 ? this.p : this.q;
    }

    @Stable
    public final long placeholderColor-XeAY9LY$material3_release(boolean z, boolean z1, boolean z2) {
        if(!z) {
            return this.D;
        }
        if(z1) {
            return this.E;
        }
        return z2 ? this.B : this.C;
    }

    @Stable
    public final long prefixColor-XeAY9LY$material3_release(boolean z, boolean z1, boolean z2) {
        if(!z) {
            return this.L;
        }
        if(z1) {
            return this.M;
        }
        return z2 ? this.J : this.K;
    }

    @Stable
    public final long suffixColor-XeAY9LY$material3_release(boolean z, boolean z1, boolean z2) {
        if(!z) {
            return this.P;
        }
        if(z1) {
            return this.Q;
        }
        return z2 ? this.N : this.O;
    }

    @Stable
    public final long supportingTextColor-XeAY9LY$material3_release(boolean z, boolean z1, boolean z2) {
        if(!z) {
            return this.H;
        }
        if(z1) {
            return this.I;
        }
        return z2 ? this.F : this.G;
    }

    @NotNull
    public final TextSelectionColors takeOrElse$material3_release(@Nullable TextSelectionColors textSelectionColors0, @NotNull Function0 function00) {
        return textSelectionColors0 == null ? ((TextSelectionColors)function00.invoke()) : textSelectionColors0;
    }

    @Stable
    public final long textColor-XeAY9LY$material3_release(boolean z, boolean z1, boolean z2) {
        if(!z) {
            return this.c;
        }
        if(z1) {
            return this.d;
        }
        return z2 ? this.a : this.b;
    }

    @Stable
    public final long trailingIconColor-XeAY9LY$material3_release(boolean z, boolean z1, boolean z2) {
        if(!z) {
            return this.v;
        }
        if(z1) {
            return this.w;
        }
        return z2 ? this.t : this.u;
    }
}

