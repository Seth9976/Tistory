package androidx.compose.ui.semantics;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.autofill.ContentDataType;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.room.a;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u00DA\u0001\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001C\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u001A#\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\u0000\u00A2\u0006\u0004\b\u0004\u0010\u0005\u001AA\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u001C\u0010\u0007\u001A\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006H\u0000\u00A2\u0006\u0004\b\u0004\u0010\b\u001A\u0011\u0010\u000B\u001A\u00020\n*\u00020\t\u00A2\u0006\u0004\b\u000B\u0010\f\u001A\u0011\u0010\r\u001A\u00020\n*\u00020\t\u00A2\u0006\u0004\b\r\u0010\f\u001A\u0013\u0010\u000E\u001A\u00020\n*\u00020\tH\u0007\u00A2\u0006\u0004\b\u000E\u0010\f\u001A\u0011\u0010\u000F\u001A\u00020\n*\u00020\t\u00A2\u0006\u0004\b\u000F\u0010\f\u001A\u0011\u0010\u0010\u001A\u00020\n*\u00020\t\u00A2\u0006\u0004\b\u0010\u0010\f\u001A\u0011\u0010\u0011\u001A\u00020\n*\u00020\t\u00A2\u0006\u0004\b\u0011\u0010\f\u001A\u0019\u0010\u0013\u001A\u00020\n*\u00020\t2\u0006\u0010\u0012\u001A\u00020\u0001\u00A2\u0006\u0004\b\u0013\u0010\u0014\u001A%\u0010\u0019\u001A\u00020\n*\u00020\t2\u0012\u0010\u0018\u001A\u000E\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015\u00A2\u0006\u0004\b\u0019\u0010\u001A\u001A\u0011\u0010\u001B\u001A\u00020\n*\u00020\t\u00A2\u0006\u0004\b\u001B\u0010\f\u001A9\u0010!\u001A\u00020\n*\u00020\t2\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u00012\u001A\u0010 \u001A\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001E0\u001D\u0012\u0004\u0012\u00020\u001F\u0018\u00010\u0015\u00A2\u0006\u0004\b!\u0010\"\u001A-\u0010$\u001A\u00020\n*\u00020\t2\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u00012\u000E\u0010 \u001A\n\u0012\u0004\u0012\u00020\u001F\u0018\u00010#\u00A2\u0006\u0004\b$\u0010%\u001A-\u0010&\u001A\u00020\n*\u00020\t2\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u00012\u000E\u0010 \u001A\n\u0012\u0004\u0012\u00020\u001F\u0018\u00010#\u00A2\u0006\u0004\b&\u0010%\u001AW\u0010+\u001A\u00020\n*\u00020\t2\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u000128\u0010 \u001A4\u0012\u0013\u0012\u00110\'\u00A2\u0006\f\b(\u0012\b\b\u0002\u0012\u0004\b\b()\u0012\u0013\u0012\u00110\'\u00A2\u0006\f\b(\u0012\b\b\u0002\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u001F\u0018\u00010\u0006\u00A2\u0006\u0004\b+\u0010,\u001AD\u00100\u001A\u00020\n*\u00020\t21\u0010 \u001A-\b\u0001\u0012\u0013\u0012\u00110-\u00A2\u0006\f\b(\u0012\b\b\u0002\u0012\u0004\b\b(.\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0/\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0006\u00A2\u0006\u0004\b0\u00101\u001A1\u00102\u001A\u00020\n*\u00020\t2\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u00012\u0012\u0010 \u001A\u000E\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001F0\u0015\u00A2\u0006\u0004\b2\u0010\"\u001A5\u00104\u001A\u00020\n*\u00020\t2\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u00012\u0014\u0010 \u001A\u0010\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u001F\u0018\u00010\u0015H\u0000\u00A2\u0006\u0004\b4\u0010\"\u001A3\u00105\u001A\u00020\n*\u00020\t2\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u00012\u0014\u0010 \u001A\u0010\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u001F\u0018\u00010\u0015\u00A2\u0006\u0004\b5\u0010\"\u001A3\u00106\u001A\u00020\n*\u00020\t2\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u00012\u0014\u0010 \u001A\u0010\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u001F\u0018\u00010\u0015\u00A2\u0006\u0004\b6\u0010\"\u001A3\u00107\u001A\u00020\n*\u00020\t2\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u00012\u0014\u0010 \u001A\u0010\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u001F\u0018\u00010\u0015\u00A2\u0006\u0004\b7\u0010\"\u001A3\u00108\u001A\u00020\n*\u00020\t2\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u00012\u0014\u0010 \u001A\u0010\u0012\u0004\u0012\u00020\u001F\u0012\u0004\u0012\u00020\u001F\u0018\u00010\u0015\u00A2\u0006\u0004\b8\u0010\"\u001A-\u00109\u001A\u00020\n*\u00020\t2\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u00012\u000E\u0010 \u001A\n\u0012\u0004\u0012\u00020\u001F\u0018\u00010#\u00A2\u0006\u0004\b9\u0010%\u001A3\u0010:\u001A\u00020\n*\u00020\t2\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u00012\u0014\u0010 \u001A\u0010\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u001F\u0018\u00010\u0015\u00A2\u0006\u0004\b:\u0010\"\u001A8\u0010?\u001A\u00020\n*\u00020\t2\u0006\u0010<\u001A\u00020;2\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u00012\u000E\u0010 \u001A\n\u0012\u0004\u0012\u00020\u001F\u0018\u00010#\u00F8\u0001\u0000\u00A2\u0006\u0004\b=\u0010>\u001A/\u0010@\u001A\u00020\n*\u00020\t2\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u00012\u000E\u0010 \u001A\n\u0012\u0004\u0012\u00020\u001F\u0018\u00010#H\u0007\u00A2\u0006\u0004\b@\u0010%\u001Al\u0010E\u001A\u00020\n*\u00020\t2\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u00012M\u0010 \u001AI\u0012\u0013\u0012\u00110\u0017\u00A2\u0006\f\b(\u0012\b\b\u0002\u0012\u0004\b\b(B\u0012\u0013\u0012\u00110\u0017\u00A2\u0006\f\b(\u0012\b\b\u0002\u0012\u0004\b\b(C\u0012\u0013\u0012\u00110\u001F\u00A2\u0006\f\b(\u0012\b\b\u0002\u0012\u0004\b\b(D\u0012\u0004\u0012\u00020\u001F\u0018\u00010A\u00A2\u0006\u0004\bE\u0010F\u001A-\u0010G\u001A\u00020\n*\u00020\t2\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u00012\u000E\u0010 \u001A\n\u0012\u0004\u0012\u00020\u001F\u0018\u00010#\u00A2\u0006\u0004\bG\u0010%\u001A-\u0010H\u001A\u00020\n*\u00020\t2\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u00012\u000E\u0010 \u001A\n\u0012\u0004\u0012\u00020\u001F\u0018\u00010#\u00A2\u0006\u0004\bH\u0010%\u001A-\u0010I\u001A\u00020\n*\u00020\t2\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u00012\u000E\u0010 \u001A\n\u0012\u0004\u0012\u00020\u001F\u0018\u00010#\u00A2\u0006\u0004\bI\u0010%\u001A-\u0010J\u001A\u00020\n*\u00020\t2\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u00012\u000E\u0010 \u001A\n\u0012\u0004\u0012\u00020\u001F\u0018\u00010#\u00A2\u0006\u0004\bJ\u0010%\u001A-\u0010K\u001A\u00020\n*\u00020\t2\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u00012\u000E\u0010 \u001A\n\u0012\u0004\u0012\u00020\u001F\u0018\u00010#\u00A2\u0006\u0004\bK\u0010%\u001A-\u0010L\u001A\u00020\n*\u00020\t2\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u00012\u000E\u0010 \u001A\n\u0012\u0004\u0012\u00020\u001F\u0018\u00010#\u00A2\u0006\u0004\bL\u0010%\u001A-\u0010M\u001A\u00020\n*\u00020\t2\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u00012\u000E\u0010 \u001A\n\u0012\u0004\u0012\u00020\u001F\u0018\u00010#\u00A2\u0006\u0004\bM\u0010%\u001A-\u0010N\u001A\u00020\n*\u00020\t2\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u00012\u000E\u0010 \u001A\n\u0012\u0004\u0012\u00020\u001F\u0018\u00010#\u00A2\u0006\u0004\bN\u0010%\u001A-\u0010O\u001A\u00020\n*\u00020\t2\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u00012\u000E\u0010 \u001A\n\u0012\u0004\u0012\u00020\u001F\u0018\u00010#\u00A2\u0006\u0004\bO\u0010%\u001A-\u0010P\u001A\u00020\n*\u00020\t2\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u00012\u000E\u0010 \u001A\n\u0012\u0004\u0012\u00020\u001F\u0018\u00010#\u00A2\u0006\u0004\bP\u0010%\u001A-\u0010Q\u001A\u00020\n*\u00020\t2\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u00012\u000E\u0010 \u001A\n\u0012\u0004\u0012\u00020\u001F\u0018\u00010#\u00A2\u0006\u0004\bQ\u0010%\u001A-\u0010R\u001A\u00020\n*\u00020\t2\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u00012\u000E\u0010 \u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\'0#\u00A2\u0006\u0004\bR\u0010%\"(\u0010W\u001A\u00020\u0001*\u00020\t2\u0006\u0010S\u001A\u00020\u00018F@FX\u0086\u000E\u00A2\u0006\f\u001A\u0004\bT\u0010U\"\u0004\bV\u0010\u0014\"/\u0010]\u001A\u00020\u0001*\u00020\t2\u0006\u0010X\u001A\u00020\u00018F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\u001A\u0004\bY\u0010U\"\u0004\bZ\u0010\u0014*\u0004\b[\u0010\\\"/\u0010d\u001A\u00020^*\u00020\t2\u0006\u0010X\u001A\u00020^8F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\u001A\u0004\b_\u0010`\"\u0004\ba\u0010b*\u0004\bc\u0010\\\"/\u0010h\u001A\u00020\u0001*\u00020\t2\u0006\u0010X\u001A\u00020\u00018F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\u001A\u0004\be\u0010U\"\u0004\bf\u0010\u0014*\u0004\bg\u0010\\\"/\u0010o\u001A\u00020i*\u00020\t2\u0006\u0010X\u001A\u00020i8F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\u001A\u0004\bj\u0010k\"\u0004\bl\u0010m*\u0004\bn\u0010\\\"/\u0010u\u001A\u00020\u001F*\u00020\t2\u0006\u0010X\u001A\u00020\u001F8F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\u001A\u0004\bp\u0010q\"\u0004\br\u0010s*\u0004\bt\u0010\\\"5\u0010v\u001A\u00020\u001F*\u00020\t2\u0006\u0010X\u001A\u00020\u001F8F@FX\u0087\u008E\u0002\u00A2\u0006\u0018\u0012\u0004\bx\u0010\f\u001A\u0004\bv\u0010q\"\u0004\bw\u0010s*\u0004\by\u0010\\\"/\u0010z\u001A\u00020\u001F*\u00020\t2\u0006\u0010X\u001A\u00020\u001F8F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\u001A\u0004\bz\u0010q\"\u0004\b{\u0010s*\u0004\b|\u0010\\\"3\u0010\u0083\u0001\u001A\u00020}*\u00020\t2\u0006\u0010X\u001A\u00020}8@@@X\u0080\u008E\u0002\u00A2\u0006\u0015\u001A\u0004\b~\u0010\u007F\"\u0006\b\u0080\u0001\u0010\u0081\u0001*\u0005\b\u0082\u0001\u0010\\\"5\u0010\u0088\u0001\u001A\u00030\u0084\u0001*\u00020\t2\u0007\u0010X\u001A\u00030\u0084\u00018@@@X\u0080\u008E\u0002\u00A2\u0006\u0015\u001A\u0005\b\u0085\u0001\u0010k\"\u0005\b\u0086\u0001\u0010m*\u0005\b\u0087\u0001\u0010\\\"5\u0010\u008E\u0001\u001A\u00020\'*\u00020\t2\u0006\u0010X\u001A\u00020\'8F@FX\u0086\u008E\u0002\u00A2\u0006\u0017\u001A\u0006\b\u0089\u0001\u0010\u008A\u0001\"\u0006\b\u008B\u0001\u0010\u008C\u0001*\u0005\b\u008D\u0001\u0010\\\"7\u0010\u0095\u0001\u001A\u00030\u008F\u0001*\u00020\t2\u0007\u0010X\u001A\u00030\u008F\u00018F@FX\u0086\u008E\u0002\u00A2\u0006\u0017\u001A\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001*\u0005\b\u0094\u0001\u0010\\\"7\u0010\u0099\u0001\u001A\u00030\u008F\u0001*\u00020\t2\u0007\u0010X\u001A\u00030\u008F\u00018F@FX\u0086\u008E\u0002\u00A2\u0006\u0017\u001A\u0006\b\u0096\u0001\u0010\u0091\u0001\"\u0006\b\u0097\u0001\u0010\u0093\u0001*\u0005\b\u0098\u0001\u0010\\\"5\u0010\u009E\u0001\u001A\u00030\u009A\u0001*\u00020\t2\u0007\u0010X\u001A\u00030\u009A\u00018F@FX\u0086\u008E\u0002\u00A2\u0006\u0015\u001A\u0005\b\u009B\u0001\u0010k\"\u0005\b\u009C\u0001\u0010m*\u0005\b\u009D\u0001\u0010\\\"3\u0010\u00A2\u0001\u001A\u00020\u0001*\u00020\t2\u0006\u0010X\u001A\u00020\u00018F@FX\u0086\u008E\u0002\u00A2\u0006\u0015\u001A\u0005\b\u009F\u0001\u0010U\"\u0005\b\u00A0\u0001\u0010\u0014*\u0005\b\u00A1\u0001\u0010\\\",\u0010\u00A6\u0001\u001A\u000203*\u00020\t2\u0006\u0010S\u001A\u0002038F@FX\u0086\u000E\u00A2\u0006\u000F\u001A\u0006\b\u00A3\u0001\u0010\u00A4\u0001\"\u0005\b6\u0010\u00A5\u0001\"4\u0010\u00A9\u0001\u001A\u000203*\u00020\t2\u0006\u0010X\u001A\u0002038F@FX\u0086\u008E\u0002\u00A2\u0006\u0016\u001A\u0006\b\u00A7\u0001\u0010\u00A4\u0001\"\u0005\b7\u0010\u00A5\u0001*\u0005\b\u00A8\u0001\u0010\\\"3\u0010\u00AA\u0001\u001A\u00020\u001F*\u00020\t2\u0006\u0010X\u001A\u00020\u001F8F@FX\u0086\u008E\u0002\u00A2\u0006\u0015\u001A\u0005\b\u00AA\u0001\u0010q\"\u0005\b\u00AB\u0001\u0010s*\u0005\b\u00AC\u0001\u0010\\\"5\u0010\u00B0\u0001\u001A\u000203*\u00020\t2\u0006\u0010X\u001A\u0002038F@FX\u0086\u008E\u0002\u00A2\u0006\u0017\u001A\u0006\b\u00AD\u0001\u0010\u00A4\u0001\"\u0006\b\u00AE\u0001\u0010\u00A5\u0001*\u0005\b\u00AF\u0001\u0010\\\"7\u0010\u00B7\u0001\u001A\u00030\u00B1\u0001*\u00020\t2\u0007\u0010X\u001A\u00030\u00B1\u00018F@FX\u0086\u008E\u0002\u00A2\u0006\u0017\u001A\u0006\b\u00B2\u0001\u0010\u00B3\u0001\"\u0006\b\u00B4\u0001\u0010\u00B5\u0001*\u0005\b\u00B6\u0001\u0010\\\":\u0010\u00BC\u0001\u001A\u00020;*\u00020\t2\u0006\u0010X\u001A\u00020;8G@GX\u0087\u008E\u0002\u00A2\u0006\u001C\u0012\u0005\b\u00BA\u0001\u0010\f\u001A\u0005\b\u00B8\u0001\u0010k\"\u0005\b\u00B9\u0001\u0010m*\u0005\b\u00BB\u0001\u0010\\\"3\u0010\u00C0\u0001\u001A\u00020\u001F*\u00020\t2\u0006\u0010X\u001A\u00020\u001F8F@FX\u0086\u008E\u0002\u00A2\u0006\u0015\u001A\u0005\b\u00BD\u0001\u0010q\"\u0005\b\u00BE\u0001\u0010s*\u0005\b\u00BF\u0001\u0010\\\"7\u0010\u00C7\u0001\u001A\u00030\u00C1\u0001*\u00020\t2\u0007\u0010X\u001A\u00030\u00C1\u00018F@FX\u0086\u008E\u0002\u00A2\u0006\u0017\u001A\u0006\b\u00C2\u0001\u0010\u00C3\u0001\"\u0006\b\u00C4\u0001\u0010\u00C5\u0001*\u0005\b\u00C6\u0001\u0010\\\"7\u0010\u00CE\u0001\u001A\u00030\u00C8\u0001*\u00020\t2\u0007\u0010X\u001A\u00030\u00C8\u00018F@FX\u0086\u008E\u0002\u00A2\u0006\u0017\u001A\u0006\b\u00C9\u0001\u0010\u00CA\u0001\"\u0006\b\u00CB\u0001\u0010\u00CC\u0001*\u0005\b\u00CD\u0001\u0010\\\"7\u0010\u00D5\u0001\u001A\u00030\u00CF\u0001*\u00020\t2\u0007\u0010X\u001A\u00030\u00CF\u00018F@FX\u0086\u008E\u0002\u00A2\u0006\u0017\u001A\u0006\b\u00D0\u0001\u0010\u00D1\u0001\"\u0006\b\u00D2\u0001\u0010\u00D3\u0001*\u0005\b\u00D4\u0001\u0010\\\"3\u0010\u00D6\u0001\u001A\u00020\u001F*\u00020\t2\u0006\u0010X\u001A\u00020\u001F8F@FX\u0086\u008E\u0002\u00A2\u0006\u0015\u001A\u0005\b\u00D6\u0001\u0010q\"\u0005\b\u00D7\u0001\u0010s*\u0005\b\u00D8\u0001\u0010\\\"3\u0010\u00DC\u0001\u001A\u00020\u0017*\u00020\t2\u0006\u0010X\u001A\u00020\u00178F@FX\u0086\u008E\u0002\u00A2\u0006\u0015\u001A\u0005\b\u00D9\u0001\u0010k\"\u0005\b\u00DA\u0001\u0010m*\u0005\b\u00DB\u0001\u0010\\\"E\u0010\u00E4\u0001\u001A\n\u0012\u0005\u0012\u00030\u00DE\u00010\u00DD\u0001*\u00020\t2\u000E\u0010X\u001A\n\u0012\u0005\u0012\u00030\u00DE\u00010\u00DD\u00018F@FX\u0086\u008E\u0002\u00A2\u0006\u0017\u001A\u0006\b\u00DF\u0001\u0010\u00E0\u0001\"\u0006\b\u00E1\u0001\u0010\u00E2\u0001*\u0005\b\u00E3\u0001\u0010\\\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006\u00E5\u0001"}, d2 = {"T", "", "name", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "AccessibilityKey", "(Ljava/lang/String;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lkotlin/Function2;", "mergePolicy", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "heading", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "disabled", "invisibleToUser", "popup", "dialog", "password", "description", "error", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;)V", "Lkotlin/Function1;", "", "", "mapping", "indexForKey", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lkotlin/jvm/functions/Function1;)V", "selectableGroup", "label", "", "Landroidx/compose/ui/text/TextLayoutResult;", "", "action", "getTextLayoutResult", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "onClick", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "onLongClick", "", "Lkotlin/ParameterName;", "x", "y", "scrollBy", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/geometry/Offset;", "offset", "Lkotlin/coroutines/Continuation;", "scrollByOffset", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lkotlin/jvm/functions/Function2;)V", "scrollToIndex", "Landroidx/compose/ui/text/AnnotatedString;", "onAutofillText", "setProgress", "setText", "setTextSubstitution", "showTextSubstitution", "clearTextSubstitution", "insertTextAtCursor", "Landroidx/compose/ui/text/input/ImeAction;", "imeActionType", "onImeAction-9UiTYpY", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;ILjava/lang/String;Lkotlin/jvm/functions/Function0;)V", "onImeAction", "performImeAction", "Lkotlin/Function3;", "startIndex", "endIndex", "relativeToOriginalText", "setSelection", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lkotlin/jvm/functions/Function3;)V", "copyText", "cutText", "pasteText", "expand", "collapse", "dismiss", "requestFocus", "pageUp", "pageDown", "pageLeft", "pageRight", "getScrollViewportLength", "value", "getContentDescription", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", "setContentDescription", "contentDescription", "<set-?>", "getStateDescription", "setStateDescription", "getStateDescription$delegate", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/Object;", "stateDescription", "Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "getProgressBarRangeInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "setProgressBarRangeInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/ProgressBarRangeInfo;)V", "getProgressBarRangeInfo$delegate", "progressBarRangeInfo", "getPaneTitle", "setPaneTitle", "getPaneTitle$delegate", "paneTitle", "Landroidx/compose/ui/semantics/LiveRegionMode;", "getLiveRegion", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", "setLiveRegion-hR3wRGc", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;I)V", "getLiveRegion$delegate", "liveRegion", "getFocused", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", "setFocused", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Z)V", "getFocused$delegate", "focused", "isContainer", "setContainer", "isContainer$annotations", "isContainer$delegate", "isTraversalGroup", "setTraversalGroup", "isTraversalGroup$delegate", "Landroidx/compose/ui/autofill/ContentType;", "getContentType", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", "setContentType", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/autofill/ContentType;)V", "getContentType$delegate", "contentType", "Landroidx/compose/ui/autofill/ContentDataType;", "getContentDataType", "setContentDataType-NTL_tik", "getContentDataType$delegate", "contentDataType", "getTraversalIndex", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", "setTraversalIndex", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;F)V", "getTraversalIndex$delegate", "traversalIndex", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "getHorizontalScrollAxisRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", "setHorizontalScrollAxisRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/ScrollAxisRange;)V", "getHorizontalScrollAxisRange$delegate", "horizontalScrollAxisRange", "getVerticalScrollAxisRange", "setVerticalScrollAxisRange", "getVerticalScrollAxisRange$delegate", "verticalScrollAxisRange", "Landroidx/compose/ui/semantics/Role;", "getRole", "setRole-kuIjeqM", "getRole$delegate", "role", "getTestTag", "setTestTag", "getTestTag$delegate", "testTag", "getText", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/text/AnnotatedString;)V", "text", "getTextSubstitution", "getTextSubstitution$delegate", "textSubstitution", "isShowingTextSubstitution", "setShowingTextSubstitution", "isShowingTextSubstitution$delegate", "getEditableText", "setEditableText", "getEditableText$delegate", "editableText", "Landroidx/compose/ui/text/TextRange;", "getTextSelectionRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", "setTextSelectionRange-FDrldGo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;J)V", "getTextSelectionRange$delegate", "textSelectionRange", "getImeAction", "setImeAction-4L7nppU", "getImeAction$annotations", "getImeAction$delegate", "imeAction", "getSelected", "setSelected", "getSelected$delegate", "selected", "Landroidx/compose/ui/semantics/CollectionInfo;", "getCollectionInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", "setCollectionInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/CollectionInfo;)V", "getCollectionInfo$delegate", "collectionInfo", "Landroidx/compose/ui/semantics/CollectionItemInfo;", "getCollectionItemInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", "setCollectionItemInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/CollectionItemInfo;)V", "getCollectionItemInfo$delegate", "collectionItemInfo", "Landroidx/compose/ui/state/ToggleableState;", "getToggleableState", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", "setToggleableState", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/state/ToggleableState;)V", "getToggleableState$delegate", "toggleableState", "isEditable", "setEditable", "isEditable$delegate", "getMaxTextLength", "setMaxTextLength", "getMaxTextLength$delegate", "maxTextLength", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "getCustomActions", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", "setCustomActions", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/util/List;)V", "getCustomActions$delegate", "customActions", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class SemanticsPropertiesKt {
    public static final KProperty[] a;

    static {
        SemanticsPropertiesKt.a = new KProperty[]{a.s(SemanticsPropertiesKt.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), a.s(SemanticsPropertiesKt.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1), a.s(SemanticsPropertiesKt.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), a.s(SemanticsPropertiesKt.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), a.s(SemanticsPropertiesKt.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), a.s(SemanticsPropertiesKt.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), a.s(SemanticsPropertiesKt.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), a.s(SemanticsPropertiesKt.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1), a.s(SemanticsPropertiesKt.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), a.s(SemanticsPropertiesKt.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1), a.s(SemanticsPropertiesKt.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), a.s(SemanticsPropertiesKt.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), a.s(SemanticsPropertiesKt.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), a.s(SemanticsPropertiesKt.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), a.s(SemanticsPropertiesKt.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), a.s(SemanticsPropertiesKt.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), a.s(SemanticsPropertiesKt.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), a.s(SemanticsPropertiesKt.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1), a.s(SemanticsPropertiesKt.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), a.s(SemanticsPropertiesKt.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), a.s(SemanticsPropertiesKt.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1), a.s(SemanticsPropertiesKt.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1), a.s(SemanticsPropertiesKt.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1), a.s(SemanticsPropertiesKt.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), a.s(SemanticsPropertiesKt.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), a.s(SemanticsPropertiesKt.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1)};
    }

    @NotNull
    public static final SemanticsPropertyKey AccessibilityKey(@NotNull String s) {
        return new SemanticsPropertyKey(s, true);
    }

    @NotNull
    public static final SemanticsPropertyKey AccessibilityKey(@NotNull String s, @NotNull Function2 function20) {
        return new SemanticsPropertyKey(s, true, function20);
    }

    public static final Object access$throwSemanticsGetNotSupported() {
        throw new UnsupportedOperationException("You cannot retrieve a semantics property directly - use one of the SemanticsConfiguration.getOr* methods instead");
    }

    public static final void clearTextSubstitution(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @Nullable String s, @Nullable Function0 function00) {
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function00);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getClearTextSubstitution(), accessibilityAction0);
    }

    public static void clearTextSubstitution$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.clearTextSubstitution(semanticsPropertyReceiver0, s, function00);
    }

    public static final void collapse(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @Nullable String s, @Nullable Function0 function00) {
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function00);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getCollapse(), accessibilityAction0);
    }

    public static void collapse$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.collapse(semanticsPropertyReceiver0, s, function00);
    }

    public static final void copyText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @Nullable String s, @Nullable Function0 function00) {
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function00);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getCopyText(), accessibilityAction0);
    }

    public static void copyText$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.copyText(semanticsPropertyReceiver0, s, function00);
    }

    public static final void cutText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @Nullable String s, @Nullable Function0 function00) {
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function00);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getCutText(), accessibilityAction0);
    }

    public static void cutText$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.cutText(semanticsPropertyReceiver0, s, function00);
    }

    public static final void dialog(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        semanticsPropertyReceiver0.set(SemanticsProperties.INSTANCE.getIsDialog(), Unit.INSTANCE);
    }

    public static final void disabled(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        semanticsPropertyReceiver0.set(SemanticsProperties.INSTANCE.getDisabled(), Unit.INSTANCE);
    }

    public static final void dismiss(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @Nullable String s, @Nullable Function0 function00) {
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function00);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getDismiss(), accessibilityAction0);
    }

    public static void dismiss$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.dismiss(semanticsPropertyReceiver0, s, function00);
    }

    public static final void error(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @NotNull String s) {
        semanticsPropertyReceiver0.set(SemanticsProperties.INSTANCE.getError(), s);
    }

    public static final void expand(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @Nullable String s, @Nullable Function0 function00) {
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function00);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getExpand(), accessibilityAction0);
    }

    public static void expand$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.expand(semanticsPropertyReceiver0, s, function00);
    }

    @NotNull
    public static final CollectionInfo getCollectionInfo(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return (CollectionInfo)SemanticsProperties.INSTANCE.getCollectionInfo().getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[20]);
    }

    @NotNull
    public static final CollectionItemInfo getCollectionItemInfo(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return (CollectionItemInfo)SemanticsProperties.INSTANCE.getCollectionItemInfo().getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[21]);
    }

    public static final int getContentDataType(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return ((ContentDataType)SemanticsProperties.INSTANCE.getContentDataType$ui_release().getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[8])).unbox-impl();
    }

    @NotNull
    public static final String getContentDescription(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        throw new UnsupportedOperationException("You cannot retrieve a semantics property directly - use one of the SemanticsConfiguration.getOr* methods instead");
    }

    @NotNull
    public static final ContentType getContentType(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return (ContentType)SemanticsProperties.INSTANCE.getContentType$ui_release().getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[7]);
    }

    @NotNull
    public static final List getCustomActions(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return (List)SemanticsActions.INSTANCE.getCustomActions().getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[25]);
    }

    @NotNull
    public static final AnnotatedString getEditableText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return (AnnotatedString)SemanticsProperties.INSTANCE.getEditableText().getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[16]);
    }

    public static final boolean getFocused(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return ((Boolean)SemanticsProperties.INSTANCE.getFocused().getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[4])).booleanValue();
    }

    @NotNull
    public static final ScrollAxisRange getHorizontalScrollAxisRange(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return (ScrollAxisRange)SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange().getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[10]);
    }

    @Deprecated(message = "Pass the ImeAction to onImeAction instead.")
    public static final int getImeAction(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return ((ImeAction)SemanticsProperties.INSTANCE.getImeAction().getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[18])).unbox-impl();
    }

    @Deprecated(message = "Pass the ImeAction to onImeAction instead.")
    public static void getImeAction$annotations(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
    }

    public static final int getLiveRegion(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return ((LiveRegionMode)SemanticsProperties.INSTANCE.getLiveRegion().getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[3])).unbox-impl();
    }

    public static final int getMaxTextLength(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return ((Number)SemanticsProperties.INSTANCE.getMaxTextLength().getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[24])).intValue();
    }

    @NotNull
    public static final String getPaneTitle(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return (String)SemanticsProperties.INSTANCE.getPaneTitle().getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[2]);
    }

    @NotNull
    public static final ProgressBarRangeInfo getProgressBarRangeInfo(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return (ProgressBarRangeInfo)SemanticsProperties.INSTANCE.getProgressBarRangeInfo().getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[1]);
    }

    public static final int getRole(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return ((Role)SemanticsProperties.INSTANCE.getRole().getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[12])).unbox-impl();
    }

    public static final void getScrollViewportLength(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @Nullable String s, @NotNull Function0 function00) {
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, new aa.a(function00, 11));
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getGetScrollViewportLength(), accessibilityAction0);
    }

    public static void getScrollViewportLength$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.getScrollViewportLength(semanticsPropertyReceiver0, s, function00);
    }

    public static final boolean getSelected(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return ((Boolean)SemanticsProperties.INSTANCE.getSelected().getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[19])).booleanValue();
    }

    @NotNull
    public static final String getStateDescription(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return (String)SemanticsProperties.INSTANCE.getStateDescription().getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[0]);
    }

    @NotNull
    public static final String getTestTag(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return (String)SemanticsProperties.INSTANCE.getTestTag().getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[13]);
    }

    @NotNull
    public static final AnnotatedString getText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        throw new UnsupportedOperationException("You cannot retrieve a semantics property directly - use one of the SemanticsConfiguration.getOr* methods instead");
    }

    public static final void getTextLayoutResult(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @Nullable String s, @Nullable Function1 function10) {
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function10);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getGetTextLayoutResult(), accessibilityAction0);
    }

    public static void getTextLayoutResult$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.getTextLayoutResult(semanticsPropertyReceiver0, s, function10);
    }

    public static final long getTextSelectionRange(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return ((TextRange)SemanticsProperties.INSTANCE.getTextSelectionRange().getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[17])).unbox-impl();
    }

    @NotNull
    public static final AnnotatedString getTextSubstitution(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return (AnnotatedString)SemanticsProperties.INSTANCE.getTextSubstitution().getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[14]);
    }

    @NotNull
    public static final ToggleableState getToggleableState(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return (ToggleableState)SemanticsProperties.INSTANCE.getToggleableState().getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[22]);
    }

    public static final float getTraversalIndex(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return ((Number)SemanticsProperties.INSTANCE.getTraversalIndex().getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[9])).floatValue();
    }

    @NotNull
    public static final ScrollAxisRange getVerticalScrollAxisRange(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return (ScrollAxisRange)SemanticsProperties.INSTANCE.getVerticalScrollAxisRange().getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[11]);
    }

    public static final void heading(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        semanticsPropertyReceiver0.set(SemanticsProperties.INSTANCE.getHeading(), Unit.INSTANCE);
    }

    public static final void indexForKey(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @NotNull Function1 function10) {
        semanticsPropertyReceiver0.set(SemanticsProperties.INSTANCE.getIndexForKey(), function10);
    }

    public static final void insertTextAtCursor(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @Nullable String s, @Nullable Function1 function10) {
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getInsertTextAtCursor(), new AccessibilityAction(s, function10));
    }

    public static void insertTextAtCursor$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.insertTextAtCursor(semanticsPropertyReceiver0, s, function10);
    }

    @ExperimentalComposeUiApi
    public static final void invisibleToUser(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        semanticsPropertyReceiver0.set(SemanticsProperties.INSTANCE.getInvisibleToUser(), Unit.INSTANCE);
    }

    public static final boolean isContainer(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return ((Boolean)SemanticsProperties.INSTANCE.getIsTraversalGroup().getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[5])).booleanValue();
    }

    @Deprecated(message = "Use `isTraversalGroup` instead.", replaceWith = @ReplaceWith(expression = "isTraversalGroup", imports = {}))
    public static void isContainer$annotations(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
    }

    public static final boolean isEditable(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return ((Boolean)SemanticsProperties.INSTANCE.getIsEditable().getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[23])).booleanValue();
    }

    public static final boolean isShowingTextSubstitution(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return ((Boolean)SemanticsProperties.INSTANCE.getIsShowingTextSubstitution().getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[15])).booleanValue();
    }

    public static final boolean isTraversalGroup(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return ((Boolean)SemanticsProperties.INSTANCE.getIsTraversalGroup().getValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[6])).booleanValue();
    }

    public static final void onAutofillText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @Nullable String s, @Nullable Function1 function10) {
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getOnAutofillText$ui_release(), new AccessibilityAction(s, function10));
    }

    public static void onAutofillText$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.onAutofillText(semanticsPropertyReceiver0, s, function10);
    }

    public static final void onClick(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @Nullable String s, @Nullable Function0 function00) {
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function00);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getOnClick(), accessibilityAction0);
    }

    public static void onClick$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.onClick(semanticsPropertyReceiver0, s, function00);
    }

    public static final void onImeAction-9UiTYpY(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, int v, @Nullable String s, @Nullable Function0 function00) {
        ImeAction imeAction0 = ImeAction.box-impl(v);
        semanticsPropertyReceiver0.set(SemanticsProperties.INSTANCE.getImeAction(), imeAction0);
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function00);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getOnImeAction(), accessibilityAction0);
    }

    public static void onImeAction-9UiTYpY$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, int v, String s, Function0 function00, int v1, Object object0) {
        if((v1 & 2) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.onImeAction-9UiTYpY(semanticsPropertyReceiver0, v, s, function00);
    }

    public static final void onLongClick(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @Nullable String s, @Nullable Function0 function00) {
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function00);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getOnLongClick(), accessibilityAction0);
    }

    public static void onLongClick$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver0, s, function00);
    }

    public static final void pageDown(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @Nullable String s, @Nullable Function0 function00) {
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function00);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getPageDown(), accessibilityAction0);
    }

    public static void pageDown$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.pageDown(semanticsPropertyReceiver0, s, function00);
    }

    public static final void pageLeft(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @Nullable String s, @Nullable Function0 function00) {
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function00);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getPageLeft(), accessibilityAction0);
    }

    public static void pageLeft$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.pageLeft(semanticsPropertyReceiver0, s, function00);
    }

    public static final void pageRight(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @Nullable String s, @Nullable Function0 function00) {
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function00);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getPageRight(), accessibilityAction0);
    }

    public static void pageRight$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.pageRight(semanticsPropertyReceiver0, s, function00);
    }

    public static final void pageUp(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @Nullable String s, @Nullable Function0 function00) {
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function00);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getPageUp(), accessibilityAction0);
    }

    public static void pageUp$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.pageUp(semanticsPropertyReceiver0, s, function00);
    }

    public static final void password(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        semanticsPropertyReceiver0.set(SemanticsProperties.INSTANCE.getPassword(), Unit.INSTANCE);
    }

    public static final void pasteText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @Nullable String s, @Nullable Function0 function00) {
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function00);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getPasteText(), accessibilityAction0);
    }

    public static void pasteText$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.pasteText(semanticsPropertyReceiver0, s, function00);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use `SemanticsPropertyReceiver.onImeAction` instead.", replaceWith = @ReplaceWith(expression = "onImeAction(imeActionType = ImeAction.Default, label = label, action = action)", imports = {"androidx.compose.ui.semantics.onImeAction", "androidx.compose.ui.text.input.ImeAction"}))
    public static final void performImeAction(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @Nullable String s, @Nullable Function0 function00) {
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function00);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getOnImeAction(), accessibilityAction0);
    }

    public static void performImeAction$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.performImeAction(semanticsPropertyReceiver0, s, function00);
    }

    public static final void popup(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        semanticsPropertyReceiver0.set(SemanticsProperties.INSTANCE.getIsPopup(), Unit.INSTANCE);
    }

    public static final void requestFocus(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @Nullable String s, @Nullable Function0 function00) {
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function00);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getRequestFocus(), accessibilityAction0);
    }

    public static void requestFocus$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.requestFocus(semanticsPropertyReceiver0, s, function00);
    }

    public static final void scrollBy(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @Nullable String s, @Nullable Function2 function20) {
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function20);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getScrollBy(), accessibilityAction0);
    }

    public static void scrollBy$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function2 function20, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.scrollBy(semanticsPropertyReceiver0, s, function20);
    }

    public static final void scrollByOffset(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @NotNull Function2 function20) {
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getScrollByOffset(), function20);
    }

    public static final void scrollToIndex(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @Nullable String s, @NotNull Function1 function10) {
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getScrollToIndex(), new AccessibilityAction(s, function10));
    }

    public static void scrollToIndex$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.scrollToIndex(semanticsPropertyReceiver0, s, function10);
    }

    public static final void selectableGroup(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        semanticsPropertyReceiver0.set(SemanticsProperties.INSTANCE.getSelectableGroup(), Unit.INSTANCE);
    }

    public static final void setCollectionInfo(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @NotNull CollectionInfo collectionInfo0) {
        SemanticsProperties.INSTANCE.getCollectionInfo().setValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[20], collectionInfo0);
    }

    public static final void setCollectionItemInfo(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @NotNull CollectionItemInfo collectionItemInfo0) {
        SemanticsProperties.INSTANCE.getCollectionItemInfo().setValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[21], collectionItemInfo0);
    }

    public static final void setContainer(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, boolean z) {
        SemanticsProperties.INSTANCE.getIsTraversalGroup().setValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[5], Boolean.valueOf(z));
    }

    public static final void setContentDataType-NTL_tik(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, int v) {
        KProperty kProperty0 = SemanticsPropertiesKt.a[8];
        ContentDataType contentDataType0 = ContentDataType.box-impl(v);
        SemanticsProperties.INSTANCE.getContentDataType$ui_release().setValue(semanticsPropertyReceiver0, kProperty0, contentDataType0);
    }

    public static final void setContentDescription(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @NotNull String s) {
        List list0 = k.listOf(s);
        semanticsPropertyReceiver0.set(SemanticsProperties.INSTANCE.getContentDescription(), list0);
    }

    public static final void setContentType(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @NotNull ContentType contentType0) {
        SemanticsProperties.INSTANCE.getContentType$ui_release().setValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[7], contentType0);
    }

    public static final void setCustomActions(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @NotNull List list0) {
        SemanticsActions.INSTANCE.getCustomActions().setValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[25], list0);
    }

    public static final void setEditable(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, boolean z) {
        SemanticsProperties.INSTANCE.getIsEditable().setValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[23], Boolean.valueOf(z));
    }

    public static final void setEditableText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @NotNull AnnotatedString annotatedString0) {
        SemanticsProperties.INSTANCE.getEditableText().setValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[16], annotatedString0);
    }

    public static final void setFocused(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, boolean z) {
        SemanticsProperties.INSTANCE.getFocused().setValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[4], Boolean.valueOf(z));
    }

    public static final void setHorizontalScrollAxisRange(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @NotNull ScrollAxisRange scrollAxisRange0) {
        SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange().setValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[10], scrollAxisRange0);
    }

    @Deprecated(message = "Pass the ImeAction to onImeAction instead.")
    public static final void setImeAction-4L7nppU(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, int v) {
        KProperty kProperty0 = SemanticsPropertiesKt.a[18];
        ImeAction imeAction0 = ImeAction.box-impl(v);
        SemanticsProperties.INSTANCE.getImeAction().setValue(semanticsPropertyReceiver0, kProperty0, imeAction0);
    }

    public static final void setLiveRegion-hR3wRGc(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, int v) {
        KProperty kProperty0 = SemanticsPropertiesKt.a[3];
        LiveRegionMode liveRegionMode0 = LiveRegionMode.box-impl(v);
        SemanticsProperties.INSTANCE.getLiveRegion().setValue(semanticsPropertyReceiver0, kProperty0, liveRegionMode0);
    }

    public static final void setMaxTextLength(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, int v) {
        SemanticsProperties.INSTANCE.getMaxTextLength().setValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[24], v);
    }

    public static final void setPaneTitle(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @NotNull String s) {
        SemanticsProperties.INSTANCE.getPaneTitle().setValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[2], s);
    }

    public static final void setProgress(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @Nullable String s, @Nullable Function1 function10) {
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function10);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getSetProgress(), accessibilityAction0);
    }

    public static void setProgress$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.setProgress(semanticsPropertyReceiver0, s, function10);
    }

    public static final void setProgressBarRangeInfo(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @NotNull ProgressBarRangeInfo progressBarRangeInfo0) {
        SemanticsProperties.INSTANCE.getProgressBarRangeInfo().setValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[1], progressBarRangeInfo0);
    }

    public static final void setRole-kuIjeqM(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, int v) {
        KProperty kProperty0 = SemanticsPropertiesKt.a[12];
        Role role0 = Role.box-impl(v);
        SemanticsProperties.INSTANCE.getRole().setValue(semanticsPropertyReceiver0, kProperty0, role0);
    }

    public static final void setSelected(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, boolean z) {
        SemanticsProperties.INSTANCE.getSelected().setValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[19], Boolean.valueOf(z));
    }

    public static final void setSelection(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @Nullable String s, @Nullable Function3 function30) {
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function30);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getSetSelection(), accessibilityAction0);
    }

    public static void setSelection$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function3 function30, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.setSelection(semanticsPropertyReceiver0, s, function30);
    }

    public static final void setShowingTextSubstitution(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, boolean z) {
        SemanticsProperties.INSTANCE.getIsShowingTextSubstitution().setValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[15], Boolean.valueOf(z));
    }

    public static final void setStateDescription(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @NotNull String s) {
        SemanticsProperties.INSTANCE.getStateDescription().setValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[0], s);
    }

    public static final void setTestTag(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @NotNull String s) {
        SemanticsProperties.INSTANCE.getTestTag().setValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[13], s);
    }

    public static final void setText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @NotNull AnnotatedString annotatedString0) {
        List list0 = k.listOf(annotatedString0);
        semanticsPropertyReceiver0.set(SemanticsProperties.INSTANCE.getText(), list0);
    }

    public static final void setText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @Nullable String s, @Nullable Function1 function10) {
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function10);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getSetText(), accessibilityAction0);
    }

    public static void setText$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver0, s, function10);
    }

    public static final void setTextSelectionRange-FDrldGo(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, long v) {
        KProperty kProperty0 = SemanticsPropertiesKt.a[17];
        TextRange textRange0 = TextRange.box-impl(v);
        SemanticsProperties.INSTANCE.getTextSelectionRange().setValue(semanticsPropertyReceiver0, kProperty0, textRange0);
    }

    public static final void setTextSubstitution(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @NotNull AnnotatedString annotatedString0) {
        SemanticsProperties.INSTANCE.getTextSubstitution().setValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[14], annotatedString0);
    }

    public static final void setTextSubstitution(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @Nullable String s, @Nullable Function1 function10) {
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getSetTextSubstitution(), new AccessibilityAction(s, function10));
    }

    public static void setTextSubstitution$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.setTextSubstitution(semanticsPropertyReceiver0, s, function10);
    }

    public static final void setToggleableState(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @NotNull ToggleableState toggleableState0) {
        SemanticsProperties.INSTANCE.getToggleableState().setValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[22], toggleableState0);
    }

    public static final void setTraversalGroup(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, boolean z) {
        SemanticsProperties.INSTANCE.getIsTraversalGroup().setValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[6], Boolean.valueOf(z));
    }

    public static final void setTraversalIndex(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, float f) {
        SemanticsProperties.INSTANCE.getTraversalIndex().setValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[9], f);
    }

    public static final void setVerticalScrollAxisRange(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @NotNull ScrollAxisRange scrollAxisRange0) {
        SemanticsProperties.INSTANCE.getVerticalScrollAxisRange().setValue(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[11], scrollAxisRange0);
    }

    public static final void showTextSubstitution(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @Nullable String s, @Nullable Function1 function10) {
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function10);
        semanticsPropertyReceiver0.set(SemanticsActions.INSTANCE.getShowTextSubstitution(), accessibilityAction0);
    }

    public static void showTextSubstitution$default(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.showTextSubstitution(semanticsPropertyReceiver0, s, function10);
    }
}

