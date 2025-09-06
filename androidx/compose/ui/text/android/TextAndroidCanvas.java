package androidx.compose.ui.text.android;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas.EdgeType;
import android.graphics.Canvas.VertexMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u00E2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u001B\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0015\n\u0002\b\r\n\u0002\u0010\u0014\n\u0002\b\f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0019\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u001A\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007\u00A2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0004\u001A\u00020\u0001\u00A2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\bH\u0016\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0019\u0010\u000F\u001A\u00020\u00052\b\u0010\u000E\u001A\u0004\u0018\u00010\rH\u0016\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0011\u001A\u00020\u0005H\u0017\u00A2\u0006\u0004\b\u0011\u0010\u0003J\u000F\u0010\u0012\u001A\u00020\u0005H\u0017\u00A2\u0006\u0004\b\u0012\u0010\u0003J\u000F\u0010\u0013\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0016\u001A\u00020\u0015H\u0016\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0018\u001A\u00020\u0015H\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0017J\u000F\u0010\u0019\u001A\u00020\u0015H\u0016\u00A2\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001B\u001A\u00020\u00052\u0006\u0010\u001A\u001A\u00020\u0015H\u0016\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u000F\u0010\u001D\u001A\u00020\u0015H\u0016\u00A2\u0006\u0004\b\u001D\u0010\u0017J\u000F\u0010\u001E\u001A\u00020\u0015H\u0016\u00A2\u0006\u0004\b\u001E\u0010\u0017J\u000F\u0010\u001F\u001A\u00020\u0015H\u0016\u00A2\u0006\u0004\b\u001F\u0010\u0017J+\u0010$\u001A\u00020\u00152\b\u0010\t\u001A\u0004\u0018\u00010 2\b\u0010\"\u001A\u0004\u0018\u00010!2\u0006\u0010#\u001A\u00020\u0015H\u0017\u00A2\u0006\u0004\b$\u0010%J#\u0010$\u001A\u00020\u00152\b\u0010\t\u001A\u0004\u0018\u00010 2\b\u0010\"\u001A\u0004\u0018\u00010!H\u0016\u00A2\u0006\u0004\b$\u0010&JA\u0010$\u001A\u00020\u00152\u0006\u0010(\u001A\u00020\'2\u0006\u0010)\u001A\u00020\'2\u0006\u0010*\u001A\u00020\'2\u0006\u0010+\u001A\u00020\'2\b\u0010\"\u001A\u0004\u0018\u00010!2\u0006\u0010#\u001A\u00020\u0015H\u0017\u00A2\u0006\u0004\b$\u0010,J9\u0010$\u001A\u00020\u00152\u0006\u0010(\u001A\u00020\'2\u0006\u0010)\u001A\u00020\'2\u0006\u0010*\u001A\u00020\'2\u0006\u0010+\u001A\u00020\'2\b\u0010\"\u001A\u0004\u0018\u00010!H\u0016\u00A2\u0006\u0004\b$\u0010-J)\u0010/\u001A\u00020\u00152\b\u0010\t\u001A\u0004\u0018\u00010 2\u0006\u0010.\u001A\u00020\u00152\u0006\u0010#\u001A\u00020\u0015H\u0017\u00A2\u0006\u0004\b/\u00100J!\u0010/\u001A\u00020\u00152\b\u0010\t\u001A\u0004\u0018\u00010 2\u0006\u0010.\u001A\u00020\u0015H\u0016\u00A2\u0006\u0004\b/\u00101J?\u0010/\u001A\u00020\u00152\u0006\u0010(\u001A\u00020\'2\u0006\u0010)\u001A\u00020\'2\u0006\u0010*\u001A\u00020\'2\u0006\u0010+\u001A\u00020\'2\u0006\u0010.\u001A\u00020\u00152\u0006\u0010#\u001A\u00020\u0015H\u0017\u00A2\u0006\u0004\b/\u00102J7\u0010/\u001A\u00020\u00152\u0006\u0010(\u001A\u00020\'2\u0006\u0010)\u001A\u00020\'2\u0006\u0010*\u001A\u00020\'2\u0006\u0010+\u001A\u00020\'2\u0006\u0010.\u001A\u00020\u0015H\u0016\u00A2\u0006\u0004\b/\u00103J\u000F\u00104\u001A\u00020\u0005H\u0016\u00A2\u0006\u0004\b4\u0010\u0003J\u000F\u00105\u001A\u00020\u0015H\u0016\u00A2\u0006\u0004\b5\u0010\u0017J\u0017\u00107\u001A\u00020\u00052\u0006\u00106\u001A\u00020\u0015H\u0016\u00A2\u0006\u0004\b7\u0010\u001CJ\u001F\u0010:\u001A\u00020\u00052\u0006\u00108\u001A\u00020\'2\u0006\u00109\u001A\u00020\'H\u0016\u00A2\u0006\u0004\b:\u0010;J\u001F\u0010>\u001A\u00020\u00052\u0006\u0010<\u001A\u00020\'2\u0006\u0010=\u001A\u00020\'H\u0016\u00A2\u0006\u0004\b>\u0010;J\u0017\u0010@\u001A\u00020\u00052\u0006\u0010?\u001A\u00020\'H\u0016\u00A2\u0006\u0004\b@\u0010AJ\u001F\u0010B\u001A\u00020\u00052\u0006\u0010<\u001A\u00020\'2\u0006\u0010=\u001A\u00020\'H\u0016\u00A2\u0006\u0004\bB\u0010;J\u0019\u0010E\u001A\u00020\u00052\b\u0010D\u001A\u0004\u0018\u00010CH\u0016\u00A2\u0006\u0004\bE\u0010FJ\u0019\u0010G\u001A\u00020\u00052\b\u0010D\u001A\u0004\u0018\u00010CH\u0016\u00A2\u0006\u0004\bG\u0010FJ\u0017\u0010I\u001A\u00020\u00052\u0006\u0010H\u001A\u00020CH\u0017\u00A2\u0006\u0004\bI\u0010FJ\u001F\u0010M\u001A\u00020\n2\u0006\u0010J\u001A\u00020 2\u0006\u0010L\u001A\u00020KH\u0017\u00A2\u0006\u0004\bM\u0010NJ\u001F\u0010M\u001A\u00020\n2\u0006\u0010J\u001A\u00020\b2\u0006\u0010L\u001A\u00020KH\u0017\u00A2\u0006\u0004\bM\u0010OJ\u0017\u0010M\u001A\u00020\n2\u0006\u0010J\u001A\u00020 H\u0016\u00A2\u0006\u0004\bM\u0010PJ\u0017\u0010M\u001A\u00020\n2\u0006\u0010J\u001A\u00020\bH\u0016\u00A2\u0006\u0004\bM\u0010\fJ7\u0010M\u001A\u00020\n2\u0006\u0010(\u001A\u00020\'2\u0006\u0010)\u001A\u00020\'2\u0006\u0010*\u001A\u00020\'2\u0006\u0010+\u001A\u00020\'2\u0006\u0010L\u001A\u00020KH\u0017\u00A2\u0006\u0004\bM\u0010QJ/\u0010M\u001A\u00020\n2\u0006\u0010(\u001A\u00020\'2\u0006\u0010)\u001A\u00020\'2\u0006\u0010*\u001A\u00020\'2\u0006\u0010+\u001A\u00020\'H\u0016\u00A2\u0006\u0004\bM\u0010RJ/\u0010M\u001A\u00020\n2\u0006\u0010(\u001A\u00020\u00152\u0006\u0010)\u001A\u00020\u00152\u0006\u0010*\u001A\u00020\u00152\u0006\u0010+\u001A\u00020\u0015H\u0016\u00A2\u0006\u0004\bM\u0010SJ\u0017\u0010T\u001A\u00020\n2\u0006\u0010J\u001A\u00020 H\u0017\u00A2\u0006\u0004\bT\u0010PJ\u0017\u0010T\u001A\u00020\n2\u0006\u0010J\u001A\u00020\bH\u0017\u00A2\u0006\u0004\bT\u0010\fJ/\u0010T\u001A\u00020\n2\u0006\u0010(\u001A\u00020\'2\u0006\u0010)\u001A\u00020\'2\u0006\u0010*\u001A\u00020\'2\u0006\u0010+\u001A\u00020\'H\u0017\u00A2\u0006\u0004\bT\u0010RJ/\u0010T\u001A\u00020\n2\u0006\u0010(\u001A\u00020\u00152\u0006\u0010)\u001A\u00020\u00152\u0006\u0010*\u001A\u00020\u00152\u0006\u0010+\u001A\u00020\u0015H\u0017\u00A2\u0006\u0004\bT\u0010SJ\u001F\u0010W\u001A\u00020\n2\u0006\u0010V\u001A\u00020U2\u0006\u0010L\u001A\u00020KH\u0017\u00A2\u0006\u0004\bW\u0010XJ\u0017\u0010W\u001A\u00020\n2\u0006\u0010V\u001A\u00020UH\u0016\u00A2\u0006\u0004\bW\u0010YJ\u0017\u0010Z\u001A\u00020\n2\u0006\u0010V\u001A\u00020UH\u0017\u00A2\u0006\u0004\bZ\u0010YJ\u0011\u0010\\\u001A\u0004\u0018\u00010[H\u0016\u00A2\u0006\u0004\b\\\u0010]J\u0019\u0010_\u001A\u00020\u00052\b\u0010^\u001A\u0004\u0018\u00010[H\u0016\u00A2\u0006\u0004\b_\u0010`J\u001F\u0010c\u001A\u00020\n2\u0006\u0010J\u001A\u00020 2\u0006\u0010b\u001A\u00020aH\u0017\u00A2\u0006\u0004\bc\u0010dJ\u0017\u0010c\u001A\u00020\n2\u0006\u0010J\u001A\u00020 H\u0017\u00A2\u0006\u0004\bc\u0010PJ\u001F\u0010c\u001A\u00020\n2\u0006\u0010V\u001A\u00020U2\u0006\u0010b\u001A\u00020aH\u0017\u00A2\u0006\u0004\bc\u0010eJ\u0017\u0010c\u001A\u00020\n2\u0006\u0010V\u001A\u00020UH\u0017\u00A2\u0006\u0004\bc\u0010YJ7\u0010c\u001A\u00020\n2\u0006\u0010(\u001A\u00020\'2\u0006\u0010)\u001A\u00020\'2\u0006\u0010*\u001A\u00020\'2\u0006\u0010+\u001A\u00020\'2\u0006\u0010b\u001A\u00020aH\u0017\u00A2\u0006\u0004\bc\u0010fJ/\u0010c\u001A\u00020\n2\u0006\u0010(\u001A\u00020\'2\u0006\u0010)\u001A\u00020\'2\u0006\u0010*\u001A\u00020\'2\u0006\u0010+\u001A\u00020\'H\u0017\u00A2\u0006\u0004\bc\u0010RJ\u0017\u0010i\u001A\u00020\u00052\u0006\u0010h\u001A\u00020gH\u0016\u00A2\u0006\u0004\bi\u0010jJ\u001F\u0010i\u001A\u00020\u00052\u0006\u0010h\u001A\u00020g2\u0006\u0010k\u001A\u00020 H\u0016\u00A2\u0006\u0004\bi\u0010lJ\u001F\u0010i\u001A\u00020\u00052\u0006\u0010h\u001A\u00020g2\u0006\u0010k\u001A\u00020\bH\u0016\u00A2\u0006\u0004\bi\u0010mJ7\u0010r\u001A\u00020\u00052\u0006\u0010n\u001A\u00020 2\u0006\u0010o\u001A\u00020\'2\u0006\u0010p\u001A\u00020\'2\u0006\u0010q\u001A\u00020\n2\u0006\u0010\"\u001A\u00020!H\u0016\u00A2\u0006\u0004\br\u0010sJO\u0010r\u001A\u00020\u00052\u0006\u0010(\u001A\u00020\'2\u0006\u0010)\u001A\u00020\'2\u0006\u0010*\u001A\u00020\'2\u0006\u0010+\u001A\u00020\'2\u0006\u0010o\u001A\u00020\'2\u0006\u0010p\u001A\u00020\'2\u0006\u0010q\u001A\u00020\n2\u0006\u0010\"\u001A\u00020!H\u0016\u00A2\u0006\u0004\br\u0010tJ/\u0010y\u001A\u00020\u00052\u0006\u0010u\u001A\u00020\u00152\u0006\u0010v\u001A\u00020\u00152\u0006\u0010w\u001A\u00020\u00152\u0006\u0010x\u001A\u00020\u0015H\u0016\u00A2\u0006\u0004\by\u0010zJ1\u0010{\u001A\u00020\u00052\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010(\u001A\u00020\'2\u0006\u0010)\u001A\u00020\'2\b\u0010\"\u001A\u0004\u0018\u00010!H\u0016\u00A2\u0006\u0004\b{\u0010|J3\u0010{\u001A\u00020\u00052\u0006\u0010\u000E\u001A\u00020\r2\b\u0010}\u001A\u0004\u0018\u00010\b2\u0006\u0010k\u001A\u00020 2\b\u0010\"\u001A\u0004\u0018\u00010!H\u0016\u00A2\u0006\u0004\b{\u0010~J3\u0010{\u001A\u00020\u00052\u0006\u0010\u000E\u001A\u00020\r2\b\u0010}\u001A\u0004\u0018\u00010\b2\u0006\u0010k\u001A\u00020\b2\b\u0010\"\u001A\u0004\u0018\u00010!H\u0016\u00A2\u0006\u0004\b{\u0010\u007FJc\u0010{\u001A\u00020\u00052\b\u0010\u0081\u0001\u001A\u00030\u0080\u00012\u0007\u0010\u0082\u0001\u001A\u00020\u00152\u0007\u0010\u0083\u0001\u001A\u00020\u00152\u0007\u0010\u0084\u0001\u001A\u00020\'2\u0007\u0010\u0085\u0001\u001A\u00020\'2\u0007\u0010\u0086\u0001\u001A\u00020\u00152\u0007\u0010\u0087\u0001\u001A\u00020\u00152\u0007\u0010\u0088\u0001\u001A\u00020\n2\b\u0010\"\u001A\u0004\u0018\u00010!H\u0017\u00A2\u0006\u0005\b{\u0010\u0089\u0001Jc\u0010{\u001A\u00020\u00052\b\u0010\u0081\u0001\u001A\u00030\u0080\u00012\u0007\u0010\u0082\u0001\u001A\u00020\u00152\u0007\u0010\u0083\u0001\u001A\u00020\u00152\u0007\u0010\u0084\u0001\u001A\u00020\u00152\u0007\u0010\u0085\u0001\u001A\u00020\u00152\u0007\u0010\u0086\u0001\u001A\u00020\u00152\u0007\u0010\u0087\u0001\u001A\u00020\u00152\u0007\u0010\u0088\u0001\u001A\u00020\n2\b\u0010\"\u001A\u0004\u0018\u00010!H\u0017\u00A2\u0006\u0005\b{\u0010\u008A\u0001J*\u0010{\u001A\u00020\u00052\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010D\u001A\u00020C2\b\u0010\"\u001A\u0004\u0018\u00010!H\u0016\u00A2\u0006\u0005\b{\u0010\u008B\u0001J^\u0010\u0092\u0001\u001A\u00020\u00052\u0006\u0010\u000E\u001A\u00020\r2\u0007\u0010\u008C\u0001\u001A\u00020\u00152\u0007\u0010\u008D\u0001\u001A\u00020\u00152\b\u0010\u008F\u0001\u001A\u00030\u008E\u00012\u0007\u0010\u0090\u0001\u001A\u00020\u00152\n\u0010\u0081\u0001\u001A\u0005\u0018\u00010\u0080\u00012\u0007\u0010\u0091\u0001\u001A\u00020\u00152\b\u0010\"\u001A\u0004\u0018\u00010!H\u0016\u00A2\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J5\u0010\u0097\u0001\u001A\u00020\u00052\u0007\u0010\u0094\u0001\u001A\u00020\'2\u0007\u0010\u0095\u0001\u001A\u00020\'2\u0007\u0010\u0096\u0001\u001A\u00020\'2\u0006\u0010\"\u001A\u00020!H\u0016\u00A2\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u001A\u0010\u009A\u0001\u001A\u00020\u00052\u0007\u0010\u0099\u0001\u001A\u00020\u0015H\u0016\u00A2\u0006\u0005\b\u009A\u0001\u0010\u001CJ\u001C\u0010\u009A\u0001\u001A\u00020\u00052\b\u0010\u0099\u0001\u001A\u00030\u009B\u0001H\u0017\u00A2\u0006\u0006\b\u009A\u0001\u0010\u009C\u0001J%\u0010\u009A\u0001\u001A\u00020\u00052\u0007\u0010\u0099\u0001\u001A\u00020\u00152\b\u0010\u009E\u0001\u001A\u00030\u009D\u0001H\u0016\u00A2\u0006\u0006\b\u009A\u0001\u0010\u009F\u0001J%\u0010\u009A\u0001\u001A\u00020\u00052\u0007\u0010\u0099\u0001\u001A\u00020\u00152\b\u0010\u009E\u0001\u001A\u00030\u00A0\u0001H\u0017\u00A2\u0006\u0006\b\u009A\u0001\u0010\u00A1\u0001J&\u0010\u009A\u0001\u001A\u00020\u00052\b\u0010\u0099\u0001\u001A\u00030\u009B\u00012\b\u0010\u009E\u0001\u001A\u00030\u00A0\u0001H\u0017\u00A2\u0006\u0006\b\u009A\u0001\u0010\u00A2\u0001J>\u0010\u00A7\u0001\u001A\u00020\u00052\u0007\u0010\u00A3\u0001\u001A\u00020\'2\u0007\u0010\u00A4\u0001\u001A\u00020\'2\u0007\u0010\u00A5\u0001\u001A\u00020\'2\u0007\u0010\u00A6\u0001\u001A\u00020\'2\u0006\u0010\"\u001A\u00020!H\u0016\u00A2\u0006\u0006\b\u00A7\u0001\u0010\u00A8\u0001J6\u0010\u00AB\u0001\u001A\u00020\u00052\b\u0010\u00A9\u0001\u001A\u00030\u008E\u00012\u0007\u0010\u0082\u0001\u001A\u00020\u00152\u0007\u0010\u00AA\u0001\u001A\u00020\u00152\u0006\u0010\"\u001A\u00020!H\u0016\u00A2\u0006\u0006\b\u00AB\u0001\u0010\u00AC\u0001J$\u0010\u00AB\u0001\u001A\u00020\u00052\b\u0010\u00A9\u0001\u001A\u00030\u008E\u00012\u0006\u0010\"\u001A\u00020!H\u0016\u00A2\u0006\u0006\b\u00AB\u0001\u0010\u00AD\u0001J\"\u0010\u00AE\u0001\u001A\u00020\u00052\u0006\u0010n\u001A\u00020 2\u0006\u0010\"\u001A\u00020!H\u0016\u00A2\u0006\u0006\b\u00AE\u0001\u0010\u00AF\u0001J:\u0010\u00AE\u0001\u001A\u00020\u00052\u0006\u0010(\u001A\u00020\'2\u0006\u0010)\u001A\u00020\'2\u0006\u0010*\u001A\u00020\'2\u0006\u0010+\u001A\u00020\'2\u0006\u0010\"\u001A\u00020!H\u0016\u00A2\u0006\u0006\b\u00AE\u0001\u0010\u00A8\u0001J\u001A\u0010\u00B0\u0001\u001A\u00020\u00052\u0006\u0010\"\u001A\u00020!H\u0016\u00A2\u0006\u0006\b\u00B0\u0001\u0010\u00B1\u0001J.\u0010\u00B4\u0001\u001A\u00020\u00052\b\u0010\u00B3\u0001\u001A\u00030\u00B2\u00012\u0006\u0010k\u001A\u00020\b2\b\u0010\"\u001A\u0004\u0018\u00010!H\u0017\u00A2\u0006\u0006\b\u00B4\u0001\u0010\u00B5\u0001J.\u0010\u00B4\u0001\u001A\u00020\u00052\b\u0010\u00B3\u0001\u001A\u00030\u00B2\u00012\u0006\u0010k\u001A\u00020 2\b\u0010\"\u001A\u0004\u0018\u00010!H\u0017\u00A2\u0006\u0006\b\u00B4\u0001\u0010\u00B6\u0001J\"\u0010\u00B7\u0001\u001A\u00020\u00052\u0006\u0010V\u001A\u00020U2\u0006\u0010\"\u001A\u00020!H\u0016\u00A2\u0006\u0006\b\u00B7\u0001\u0010\u00B8\u0001J,\u0010\u00B9\u0001\u001A\u00020\u00052\u0007\u0010\u0084\u0001\u001A\u00020\'2\u0007\u0010\u0085\u0001\u001A\u00020\'2\u0006\u0010\"\u001A\u00020!H\u0016\u00A2\u0006\u0006\b\u00B9\u0001\u0010\u00BA\u0001J8\u0010\u00BB\u0001\u001A\u00020\u00052\n\u0010\u00A9\u0001\u001A\u0005\u0018\u00010\u008E\u00012\u0007\u0010\u0082\u0001\u001A\u00020\u00152\u0007\u0010\u00AA\u0001\u001A\u00020\u00152\u0006\u0010\"\u001A\u00020!H\u0016\u00A2\u0006\u0006\b\u00BB\u0001\u0010\u00AC\u0001J$\u0010\u00BB\u0001\u001A\u00020\u00052\b\u0010\u00A9\u0001\u001A\u00030\u008E\u00012\u0006\u0010\"\u001A\u00020!H\u0016\u00A2\u0006\u0006\b\u00BB\u0001\u0010\u00AD\u0001J@\u0010\u00C0\u0001\u001A\u00020\u00052\b\u0010\u00BD\u0001\u001A\u00030\u00BC\u00012\u0007\u0010\u00BE\u0001\u001A\u00020\u00152\u0007\u0010\u00AA\u0001\u001A\u00020\u00152\b\u0010\u00BF\u0001\u001A\u00030\u008E\u00012\u0006\u0010\"\u001A\u00020!H\u0017\u00A2\u0006\u0006\b\u00C0\u0001\u0010\u00C1\u0001J.\u0010\u00C0\u0001\u001A\u00020\u00052\b\u0010\u00BD\u0001\u001A\u00030\u00C2\u00012\b\u0010\u00BF\u0001\u001A\u00030\u008E\u00012\u0006\u0010\"\u001A\u00020!H\u0017\u00A2\u0006\u0006\b\u00C0\u0001\u0010\u00C3\u0001J\"\u0010\u00C4\u0001\u001A\u00020\u00052\u0006\u0010J\u001A\u00020 2\u0006\u0010\"\u001A\u00020!H\u0016\u00A2\u0006\u0006\b\u00C4\u0001\u0010\u00AF\u0001J\"\u0010\u00C4\u0001\u001A\u00020\u00052\u0006\u0010v\u001A\u00020\b2\u0006\u0010\"\u001A\u00020!H\u0016\u00A2\u0006\u0006\b\u00C4\u0001\u0010\u00C5\u0001J:\u0010\u00C4\u0001\u001A\u00020\u00052\u0006\u0010(\u001A\u00020\'2\u0006\u0010)\u001A\u00020\'2\u0006\u0010*\u001A\u00020\'2\u0006\u0010+\u001A\u00020\'2\u0006\u0010\"\u001A\u00020!H\u0016\u00A2\u0006\u0006\b\u00C4\u0001\u0010\u00A8\u0001J*\u0010\u00C6\u0001\u001A\u00020\u00052\u0006\u0010v\u001A\u00020\u00152\u0006\u0010w\u001A\u00020\u00152\u0006\u0010x\u001A\u00020\u0015H\u0016\u00A2\u0006\u0006\b\u00C6\u0001\u0010\u00C7\u0001J4\u0010\u00CA\u0001\u001A\u00020\u00052\u0006\u0010J\u001A\u00020 2\u0007\u0010\u00C8\u0001\u001A\u00020\'2\u0007\u0010\u00C9\u0001\u001A\u00020\'2\u0006\u0010\"\u001A\u00020!H\u0016\u00A2\u0006\u0006\b\u00CA\u0001\u0010\u00CB\u0001JL\u0010\u00CA\u0001\u001A\u00020\u00052\u0006\u0010(\u001A\u00020\'2\u0006\u0010)\u001A\u00020\'2\u0006\u0010*\u001A\u00020\'2\u0006\u0010+\u001A\u00020\'2\u0007\u0010\u00C8\u0001\u001A\u00020\'2\u0007\u0010\u00C9\u0001\u001A\u00020\'2\u0006\u0010\"\u001A\u00020!H\u0016\u00A2\u0006\u0006\b\u00CA\u0001\u0010\u00CC\u0001JP\u0010\u00D3\u0001\u001A\u00020\u00052\u0007\u0010\u00CD\u0001\u001A\u00020 2\u0007\u0010\u00CE\u0001\u001A\u00020\'2\u0007\u0010\u00CF\u0001\u001A\u00020\'2\u0007\u0010\u00D0\u0001\u001A\u00020 2\u0007\u0010\u00D1\u0001\u001A\u00020\'2\u0007\u0010\u00D2\u0001\u001A\u00020\'2\u0006\u0010\"\u001A\u00020!H\u0017\u00A2\u0006\u0006\b\u00D3\u0001\u0010\u00D4\u0001J@\u0010\u00D3\u0001\u001A\u00020\u00052\u0007\u0010\u00CD\u0001\u001A\u00020 2\b\u0010\u00D5\u0001\u001A\u00030\u008E\u00012\u0007\u0010\u00D0\u0001\u001A\u00020 2\b\u0010\u00D6\u0001\u001A\u00030\u008E\u00012\u0006\u0010\"\u001A\u00020!H\u0017\u00A2\u0006\u0006\b\u00D3\u0001\u0010\u00D7\u0001JS\u0010\u00DF\u0001\u001A\u00020\u00052\b\u0010\u00D8\u0001\u001A\u00030\u0080\u00012\u0007\u0010\u00D9\u0001\u001A\u00020\u00152\b\u0010\u00DA\u0001\u001A\u00030\u008E\u00012\u0007\u0010\u00DB\u0001\u001A\u00020\u00152\u0007\u0010\u00DC\u0001\u001A\u00020\u00152\b\u0010\u00DE\u0001\u001A\u00030\u00DD\u00012\u0006\u0010\"\u001A\u00020!H\u0017\u00A2\u0006\u0006\b\u00DF\u0001\u0010\u00E0\u0001JH\u0010\u00E1\u0001\u001A\u00020\u00052\b\u0010\u00BD\u0001\u001A\u00030\u00BC\u00012\u0007\u0010\u00BE\u0001\u001A\u00020\u00152\u0007\u0010\u00AA\u0001\u001A\u00020\u00152\u0007\u0010\u0084\u0001\u001A\u00020\'2\u0007\u0010\u0085\u0001\u001A\u00020\'2\u0006\u0010\"\u001A\u00020!H\u0016\u00A2\u0006\u0006\b\u00E1\u0001\u0010\u00E2\u0001J6\u0010\u00E1\u0001\u001A\u00020\u00052\b\u0010\u00BD\u0001\u001A\u00030\u00C2\u00012\u0007\u0010\u0084\u0001\u001A\u00020\'2\u0007\u0010\u0085\u0001\u001A\u00020\'2\u0006\u0010\"\u001A\u00020!H\u0016\u00A2\u0006\u0006\b\u00E1\u0001\u0010\u00E3\u0001JH\u0010\u00E1\u0001\u001A\u00020\u00052\b\u0010\u00BD\u0001\u001A\u00030\u00C2\u00012\u0007\u0010\u00E4\u0001\u001A\u00020\u00152\u0007\u0010\u00E5\u0001\u001A\u00020\u00152\u0007\u0010\u0084\u0001\u001A\u00020\'2\u0007\u0010\u0085\u0001\u001A\u00020\'2\u0006\u0010\"\u001A\u00020!H\u0016\u00A2\u0006\u0006\b\u00E1\u0001\u0010\u00E6\u0001JH\u0010\u00E1\u0001\u001A\u00020\u00052\b\u0010\u00BD\u0001\u001A\u00030\u00E7\u00012\u0007\u0010\u00E4\u0001\u001A\u00020\u00152\u0007\u0010\u00E5\u0001\u001A\u00020\u00152\u0007\u0010\u0084\u0001\u001A\u00020\'2\u0007\u0010\u0085\u0001\u001A\u00020\'2\u0006\u0010\"\u001A\u00020!H\u0016\u00A2\u0006\u0006\b\u00E1\u0001\u0010\u00E8\u0001JP\u0010\u00EB\u0001\u001A\u00020\u00052\b\u0010\u00BD\u0001\u001A\u00030\u00BC\u00012\u0007\u0010\u00BE\u0001\u001A\u00020\u00152\u0007\u0010\u00AA\u0001\u001A\u00020\u00152\u0006\u0010V\u001A\u00020U2\u0007\u0010\u00E9\u0001\u001A\u00020\'2\u0007\u0010\u00EA\u0001\u001A\u00020\'2\u0006\u0010\"\u001A\u00020!H\u0016\u00A2\u0006\u0006\b\u00EB\u0001\u0010\u00EC\u0001J>\u0010\u00EB\u0001\u001A\u00020\u00052\b\u0010\u00BD\u0001\u001A\u00030\u00C2\u00012\u0006\u0010V\u001A\u00020U2\u0007\u0010\u00E9\u0001\u001A\u00020\'2\u0007\u0010\u00EA\u0001\u001A\u00020\'2\u0006\u0010\"\u001A\u00020!H\u0016\u00A2\u0006\u0006\b\u00EB\u0001\u0010\u00ED\u0001Jc\u0010\u00F1\u0001\u001A\u00020\u00052\b\u0010\u00BD\u0001\u001A\u00030\u00BC\u00012\u0007\u0010\u00BE\u0001\u001A\u00020\u00152\u0007\u0010\u00AA\u0001\u001A\u00020\u00152\u0007\u0010\u00EE\u0001\u001A\u00020\u00152\u0007\u0010\u00EF\u0001\u001A\u00020\u00152\u0007\u0010\u0084\u0001\u001A\u00020\'2\u0007\u0010\u0085\u0001\u001A\u00020\'2\u0007\u0010\u00F0\u0001\u001A\u00020\n2\u0006\u0010\"\u001A\u00020!H\u0017\u00A2\u0006\u0006\b\u00F1\u0001\u0010\u00F2\u0001Jc\u0010\u00F1\u0001\u001A\u00020\u00052\b\u0010\u00BD\u0001\u001A\u00030\u00E7\u00012\u0007\u0010\u00E4\u0001\u001A\u00020\u00152\u0007\u0010\u00E5\u0001\u001A\u00020\u00152\u0007\u0010\u00F3\u0001\u001A\u00020\u00152\u0007\u0010\u00F4\u0001\u001A\u00020\u00152\u0007\u0010\u0084\u0001\u001A\u00020\'2\u0007\u0010\u0085\u0001\u001A\u00020\'2\u0007\u0010\u00F0\u0001\u001A\u00020\n2\u0006\u0010\"\u001A\u00020!H\u0017\u00A2\u0006\u0006\b\u00F1\u0001\u0010\u00F5\u0001Jc\u0010\u00F1\u0001\u001A\u00020\u00052\b\u0010\u00BD\u0001\u001A\u00030\u00F6\u00012\u0007\u0010\u00E4\u0001\u001A\u00020\u00152\u0007\u0010\u00E5\u0001\u001A\u00020\u00152\u0007\u0010\u00F3\u0001\u001A\u00020\u00152\u0007\u0010\u00F4\u0001\u001A\u00020\u00152\u0007\u0010\u0084\u0001\u001A\u00020\'2\u0007\u0010\u0085\u0001\u001A\u00020\'2\u0007\u0010\u00F0\u0001\u001A\u00020\n2\u0006\u0010\"\u001A\u00020!H\u0017\u00A2\u0006\u0006\b\u00F1\u0001\u0010\u00F7\u0001J\u0088\u0001\u0010\u0080\u0002\u001A\u00020\u00052\b\u0010\u009E\u0001\u001A\u00030\u00F8\u00012\u0007\u0010\u00F9\u0001\u001A\u00020\u00152\b\u0010\u008F\u0001\u001A\u00030\u008E\u00012\u0007\u0010\u0090\u0001\u001A\u00020\u00152\n\u0010\u00FA\u0001\u001A\u0005\u0018\u00010\u008E\u00012\u0007\u0010\u00FB\u0001\u001A\u00020\u00152\n\u0010\u0081\u0001\u001A\u0005\u0018\u00010\u0080\u00012\u0007\u0010\u0091\u0001\u001A\u00020\u00152\n\u0010\u00FD\u0001\u001A\u0005\u0018\u00010\u00FC\u00012\u0007\u0010\u00FE\u0001\u001A\u00020\u00152\u0007\u0010\u00FF\u0001\u001A\u00020\u00152\u0006\u0010\"\u001A\u00020!H\u0016\u00A2\u0006\u0006\b\u0080\u0002\u0010\u0081\u0002J\u001C\u0010\u0084\u0002\u001A\u00020\u00052\b\u0010\u0083\u0002\u001A\u00030\u0082\u0002H\u0017\u00A2\u0006\u0006\b\u0084\u0002\u0010\u0085\u0002\u00A8\u0006\u0086\u0002"}, d2 = {"Landroidx/compose/ui/text/android/TextAndroidCanvas;", "Landroid/graphics/Canvas;", "<init>", "()V", "canvas", "", "setCanvas", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Rect;", "bounds", "", "getClipBounds", "(Landroid/graphics/Rect;)Z", "Landroid/graphics/Bitmap;", "bitmap", "setBitmap", "(Landroid/graphics/Bitmap;)V", "enableZ", "disableZ", "isOpaque", "()Z", "", "getWidth", "()I", "getHeight", "getDensity", "density", "setDensity", "(I)V", "getMaximumBitmapWidth", "getMaximumBitmapHeight", "save", "Landroid/graphics/RectF;", "Landroid/graphics/Paint;", "paint", "saveFlags", "saveLayer", "(Landroid/graphics/RectF;Landroid/graphics/Paint;I)I", "(Landroid/graphics/RectF;Landroid/graphics/Paint;)I", "", "left", "top", "right", "bottom", "(FFFFLandroid/graphics/Paint;I)I", "(FFFFLandroid/graphics/Paint;)I", "alpha", "saveLayerAlpha", "(Landroid/graphics/RectF;II)I", "(Landroid/graphics/RectF;I)I", "(FFFFII)I", "(FFFFI)I", "restore", "getSaveCount", "saveCount", "restoreToCount", "dx", "dy", "translate", "(FF)V", "sx", "sy", "scale", "degrees", "rotate", "(F)V", "skew", "Landroid/graphics/Matrix;", "matrix", "concat", "(Landroid/graphics/Matrix;)V", "setMatrix", "ctm", "getMatrix", "rect", "Landroid/graphics/Region$Op;", "op", "clipRect", "(Landroid/graphics/RectF;Landroid/graphics/Region$Op;)Z", "(Landroid/graphics/Rect;Landroid/graphics/Region$Op;)Z", "(Landroid/graphics/RectF;)Z", "(FFFFLandroid/graphics/Region$Op;)Z", "(FFFF)Z", "(IIII)Z", "clipOutRect", "Landroid/graphics/Path;", "path", "clipPath", "(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z", "(Landroid/graphics/Path;)Z", "clipOutPath", "Landroid/graphics/DrawFilter;", "getDrawFilter", "()Landroid/graphics/DrawFilter;", "filter", "setDrawFilter", "(Landroid/graphics/DrawFilter;)V", "Landroid/graphics/Canvas$EdgeType;", "type", "quickReject", "(Landroid/graphics/RectF;Landroid/graphics/Canvas$EdgeType;)Z", "(Landroid/graphics/Path;Landroid/graphics/Canvas$EdgeType;)Z", "(FFFFLandroid/graphics/Canvas$EdgeType;)Z", "Landroid/graphics/Picture;", "picture", "drawPicture", "(Landroid/graphics/Picture;)V", "dst", "(Landroid/graphics/Picture;Landroid/graphics/RectF;)V", "(Landroid/graphics/Picture;Landroid/graphics/Rect;)V", "oval", "startAngle", "sweepAngle", "useCenter", "drawArc", "(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V", "(FFFFFFZLandroid/graphics/Paint;)V", "a", "r", "g", "b", "drawARGB", "(IIII)V", "drawBitmap", "(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V", "src", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V", "", "colors", "offset", "stride", "x", "y", "width", "height", "hasAlpha", "([IIIFFIIZLandroid/graphics/Paint;)V", "([IIIIIIIZLandroid/graphics/Paint;)V", "(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V", "meshWidth", "meshHeight", "", "verts", "vertOffset", "colorOffset", "drawBitmapMesh", "(Landroid/graphics/Bitmap;II[FI[IILandroid/graphics/Paint;)V", "cx", "cy", "radius", "drawCircle", "(FFFLandroid/graphics/Paint;)V", "color", "drawColor", "", "(J)V", "Landroid/graphics/PorterDuff$Mode;", "mode", "(ILandroid/graphics/PorterDuff$Mode;)V", "Landroid/graphics/BlendMode;", "(ILandroid/graphics/BlendMode;)V", "(JLandroid/graphics/BlendMode;)V", "startX", "startY", "stopX", "stopY", "drawLine", "(FFFFLandroid/graphics/Paint;)V", "pts", "count", "drawLines", "([FIILandroid/graphics/Paint;)V", "([FLandroid/graphics/Paint;)V", "drawOval", "(Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "drawPaint", "(Landroid/graphics/Paint;)V", "Landroid/graphics/NinePatch;", "patch", "drawPatch", "(Landroid/graphics/NinePatch;Landroid/graphics/Rect;Landroid/graphics/Paint;)V", "(Landroid/graphics/NinePatch;Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "drawPath", "(Landroid/graphics/Path;Landroid/graphics/Paint;)V", "drawPoint", "(FFLandroid/graphics/Paint;)V", "drawPoints", "", "text", "index", "pos", "drawPosText", "([CII[FLandroid/graphics/Paint;)V", "", "(Ljava/lang/String;[FLandroid/graphics/Paint;)V", "drawRect", "(Landroid/graphics/Rect;Landroid/graphics/Paint;)V", "drawRGB", "(III)V", "rx", "ry", "drawRoundRect", "(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V", "(FFFFFFLandroid/graphics/Paint;)V", "outer", "outerRx", "outerRy", "inner", "innerRx", "innerRy", "drawDoubleRoundRect", "(Landroid/graphics/RectF;FFLandroid/graphics/RectF;FFLandroid/graphics/Paint;)V", "outerRadii", "innerRadii", "(Landroid/graphics/RectF;[FLandroid/graphics/RectF;[FLandroid/graphics/Paint;)V", "glyphIds", "glyphIdOffset", "positions", "positionOffset", "glyphCount", "Landroid/graphics/fonts/Font;", "font", "drawGlyphs", "([II[FIILandroid/graphics/fonts/Font;Landroid/graphics/Paint;)V", "drawText", "([CIIFFLandroid/graphics/Paint;)V", "(Ljava/lang/String;FFLandroid/graphics/Paint;)V", "start", "end", "(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V", "", "(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V", "hOffset", "vOffset", "drawTextOnPath", "([CIILandroid/graphics/Path;FFLandroid/graphics/Paint;)V", "(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V", "contextIndex", "contextCount", "isRtl", "drawTextRun", "([CIIIIFFZLandroid/graphics/Paint;)V", "contextStart", "contextEnd", "(Ljava/lang/CharSequence;IIIIFFZLandroid/graphics/Paint;)V", "Landroid/graphics/text/MeasuredText;", "(Landroid/graphics/text/MeasuredText;IIIIFFZLandroid/graphics/Paint;)V", "Landroid/graphics/Canvas$VertexMode;", "vertexCount", "texs", "texOffset", "", "indices", "indexOffset", "indexCount", "drawVertices", "(Landroid/graphics/Canvas$VertexMode;I[FI[FI[II[SIILandroid/graphics/Paint;)V", "Landroid/graphics/RenderNode;", "renderNode", "drawRenderNode", "(Landroid/graphics/RenderNode;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextAndroidCanvas extends Canvas {
    public static final int $stable = 8;
    public Canvas a;

    @Override  // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutPath(@NotNull Path path0) {
        e e0 = e.a;
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return e0.a(canvas0, path0);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutRect(float f, float f1, float f2, float f3) {
        e e0 = e.a;
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return e0.b(canvas0, f, f1, f2, f3);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutRect(int v, int v1, int v2, int v3) {
        e e0 = e.a;
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return e0.c(canvas0, v, v1, v2, v3);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutRect(@NotNull Rect rect0) {
        e e0 = e.a;
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return e0.d(canvas0, rect0);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutRect(@NotNull RectF rectF0) {
        e e0 = e.a;
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return e0.e(canvas0, rectF0);
    }

    @Override  // android.graphics.Canvas
    public boolean clipPath(@NotNull Path path0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.clipPath(path0);
    }

    @Override  // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public boolean clipPath(@NotNull Path path0, @NotNull Region.Op region$Op0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.clipPath(path0, region$Op0);
    }

    @Override  // android.graphics.Canvas
    public boolean clipRect(float f, float f1, float f2, float f3) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.clipRect(f, f1, f2, f3);
    }

    @Override  // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public boolean clipRect(float f, float f1, float f2, float f3, @NotNull Region.Op region$Op0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.clipRect(f, f1, f2, f3, region$Op0);
    }

    @Override  // android.graphics.Canvas
    public boolean clipRect(int v, int v1, int v2, int v3) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.clipRect(v, v1, v2, v3);
    }

    @Override  // android.graphics.Canvas
    public boolean clipRect(@NotNull Rect rect0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.clipRect(rect0);
    }

    @Override  // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public boolean clipRect(@NotNull Rect rect0, @NotNull Region.Op region$Op0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.clipRect(rect0, region$Op0);
    }

    @Override  // android.graphics.Canvas
    public boolean clipRect(@NotNull RectF rectF0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.clipRect(rectF0);
    }

    @Override  // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public boolean clipRect(@NotNull RectF rectF0, @NotNull Region.Op region$Op0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.clipRect(rectF0, region$Op0);
    }

    @Override  // android.graphics.Canvas
    public void concat(@Nullable Matrix matrix0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.concat(matrix0);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(29)
    public void disableZ() {
        f f0 = f.a;
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        f0.a(canvas0);
    }

    @Override  // android.graphics.Canvas
    public void drawARGB(int v, int v1, int v2, int v3) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawARGB(v, v1, v2, v3);
    }

    @Override  // android.graphics.Canvas
    public void drawArc(float f, float f1, float f2, float f3, float f4, float f5, boolean z, @NotNull Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawArc(f, f1, f2, f3, f4, f5, z, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawArc(@NotNull RectF rectF0, float f, float f1, boolean z, @NotNull Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawArc(rectF0, f, f1, z, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawBitmap(@NotNull Bitmap bitmap0, float f, float f1, @Nullable Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawBitmap(bitmap0, f, f1, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawBitmap(@NotNull Bitmap bitmap0, @NotNull Matrix matrix0, @Nullable Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawBitmap(bitmap0, matrix0, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawBitmap(@NotNull Bitmap bitmap0, @Nullable Rect rect0, @NotNull Rect rect1, @Nullable Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawBitmap(bitmap0, rect0, rect1, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawBitmap(@NotNull Bitmap bitmap0, @Nullable Rect rect0, @NotNull RectF rectF0, @Nullable Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawBitmap(bitmap0, rect0, rectF0, paint0);
    }

    @Override  // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public void drawBitmap(@NotNull int[] arr_v, int v, int v1, float f, float f1, int v2, int v3, boolean z, @Nullable Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawBitmap(arr_v, v, v1, f, f1, v2, v3, z, paint0);
    }

    @Override  // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public void drawBitmap(@NotNull int[] arr_v, int v, int v1, int v2, int v3, int v4, int v5, boolean z, @Nullable Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawBitmap(arr_v, v, v1, v2, v3, v4, v5, z, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawBitmapMesh(@NotNull Bitmap bitmap0, int v, int v1, @NotNull float[] arr_f, int v2, @Nullable int[] arr_v, int v3, @Nullable Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawBitmapMesh(bitmap0, v, v1, arr_f, v2, arr_v, v3, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawCircle(float f, float f1, float f2, @NotNull Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawCircle(f, f1, f2, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawColor(int v) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawColor(v);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(29)
    public void drawColor(int v, @NotNull BlendMode blendMode0) {
        f f0 = f.a;
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        f0.b(canvas0, v, blendMode0);
    }

    @Override  // android.graphics.Canvas
    public void drawColor(int v, @NotNull PorterDuff.Mode porterDuff$Mode0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawColor(v, porterDuff$Mode0);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(29)
    public void drawColor(long v) {
        f f0 = f.a;
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        f0.c(canvas0, v);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(29)
    public void drawColor(long v, @NotNull BlendMode blendMode0) {
        f f0 = f.a;
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        f0.d(canvas0, v, blendMode0);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(29)
    public void drawDoubleRoundRect(@NotNull RectF rectF0, float f, float f1, @NotNull RectF rectF1, float f2, float f3, @NotNull Paint paint0) {
        f f4 = f.a;
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        f4.e(canvas0, rectF0, f, f1, rectF1, f2, f3, paint0);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(29)
    public void drawDoubleRoundRect(@NotNull RectF rectF0, @NotNull float[] arr_f, @NotNull RectF rectF1, @NotNull float[] arr_f1, @NotNull Paint paint0) {
        f f0 = f.a;
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        f0.f(canvas0, rectF0, arr_f, rectF1, arr_f1, paint0);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(0x1F)
    public void drawGlyphs(@NotNull int[] arr_v, int v, @NotNull float[] arr_f, int v1, int v2, @NotNull Font font0, @NotNull Paint paint0) {
        h h0 = h.a;
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        h0.a(canvas0, arr_v, v, arr_f, v1, v2, font0, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawLine(float f, float f1, float f2, float f3, @NotNull Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawLine(f, f1, f2, f3, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawLines(@NotNull float[] arr_f, int v, int v1, @NotNull Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawLines(arr_f, v, v1, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawLines(@NotNull float[] arr_f, @NotNull Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawLines(arr_f, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawOval(float f, float f1, float f2, float f3, @NotNull Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawOval(f, f1, f2, f3, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawOval(@NotNull RectF rectF0, @NotNull Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawOval(rectF0, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawPaint(@NotNull Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawPaint(paint0);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(0x1F)
    public void drawPatch(@NotNull NinePatch ninePatch0, @NotNull Rect rect0, @Nullable Paint paint0) {
        h h0 = h.a;
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        h0.b(canvas0, ninePatch0, rect0, paint0);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(0x1F)
    public void drawPatch(@NotNull NinePatch ninePatch0, @NotNull RectF rectF0, @Nullable Paint paint0) {
        h h0 = h.a;
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        h0.c(canvas0, ninePatch0, rectF0, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawPath(@NotNull Path path0, @NotNull Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawPath(path0, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawPicture(@NotNull Picture picture0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawPicture(picture0);
    }

    @Override  // android.graphics.Canvas
    public void drawPicture(@NotNull Picture picture0, @NotNull Rect rect0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawPicture(picture0, rect0);
    }

    @Override  // android.graphics.Canvas
    public void drawPicture(@NotNull Picture picture0, @NotNull RectF rectF0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawPicture(picture0, rectF0);
    }

    @Override  // android.graphics.Canvas
    public void drawPoint(float f, float f1, @NotNull Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawPoint(f, f1, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawPoints(@Nullable float[] arr_f, int v, int v1, @NotNull Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawPoints(arr_f, v, v1, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawPoints(@NotNull float[] arr_f, @NotNull Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawPoints(arr_f, paint0);
    }

    @Override  // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public void drawPosText(@NotNull String s, @NotNull float[] arr_f, @NotNull Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawPosText(s, arr_f, paint0);
    }

    @Override  // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public void drawPosText(@NotNull char[] arr_c, int v, int v1, @NotNull float[] arr_f, @NotNull Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawPosText(arr_c, v, v1, arr_f, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawRGB(int v, int v1, int v2) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawRGB(v, v1, v2);
    }

    @Override  // android.graphics.Canvas
    public void drawRect(float f, float f1, float f2, float f3, @NotNull Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawRect(f, f1, f2, f3, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawRect(@NotNull Rect rect0, @NotNull Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawRect(rect0, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawRect(@NotNull RectF rectF0, @NotNull Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawRect(rectF0, paint0);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(29)
    public void drawRenderNode(@NotNull RenderNode renderNode0) {
        f f0 = f.a;
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        f0.g(canvas0, renderNode0);
    }

    @Override  // android.graphics.Canvas
    public void drawRoundRect(float f, float f1, float f2, float f3, float f4, float f5, @NotNull Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawRoundRect(f, f1, f2, f3, f4, f5, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawRoundRect(@NotNull RectF rectF0, float f, float f1, @NotNull Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawRoundRect(rectF0, f, f1, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawText(@NotNull CharSequence charSequence0, int v, int v1, float f, float f1, @NotNull Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawText(charSequence0, v, v1, f, f1, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawText(@NotNull String s, float f, float f1, @NotNull Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawText(s, f, f1, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawText(@NotNull String s, int v, int v1, float f, float f1, @NotNull Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawText(s, v, v1, f, f1, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawText(@NotNull char[] arr_c, int v, int v1, float f, float f1, @NotNull Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawText(arr_c, v, v1, f, f1, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawTextOnPath(@NotNull String s, @NotNull Path path0, float f, float f1, @NotNull Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawTextOnPath(s, path0, f, f1, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawTextOnPath(@NotNull char[] arr_c, int v, int v1, @NotNull Path path0, float f, float f1, @NotNull Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawTextOnPath(arr_c, v, v1, path0, f, f1, paint0);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(29)
    public void drawTextRun(@NotNull MeasuredText measuredText0, int v, int v1, int v2, int v3, float f, float f1, boolean z, @NotNull Paint paint0) {
        f f2 = f.a;
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        f2.h(canvas0, measuredText0, v, v1, v2, v3, f, f1, z, paint0);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(23)
    public void drawTextRun(@NotNull CharSequence charSequence0, int v, int v1, int v2, int v3, float f, float f1, boolean z, @NotNull Paint paint0) {
        d d0 = d.a;
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        d0.a(canvas0, charSequence0, v, v1, v2, v3, f, f1, z, paint0);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(23)
    public void drawTextRun(@NotNull char[] arr_c, int v, int v1, int v2, int v3, float f, float f1, boolean z, @NotNull Paint paint0) {
        d d0 = d.a;
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        d0.b(canvas0, arr_c, v, v1, v2, v3, f, f1, z, paint0);
    }

    @Override  // android.graphics.Canvas
    public void drawVertices(@NotNull Canvas.VertexMode canvas$VertexMode0, int v, @NotNull float[] arr_f, int v1, @Nullable float[] arr_f1, int v2, @Nullable int[] arr_v, int v3, @Nullable short[] arr_v1, int v4, int v5, @NotNull Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.drawVertices(canvas$VertexMode0, v, arr_f, v1, arr_f1, v2, arr_v, v3, arr_v1, v4, v5, paint0);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(29)
    public void enableZ() {
        f f0 = f.a;
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        f0.i(canvas0);
    }

    @Override  // android.graphics.Canvas
    public boolean getClipBounds(@NotNull Rect rect0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        boolean z = canvas0.getClipBounds(rect0);
        if(z) {
            rect0.set(0, 0, rect0.width(), 0x7FFFFFFF);
        }
        return z;
    }

    @Override  // android.graphics.Canvas
    public int getDensity() {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.getDensity();
    }

    @Override  // android.graphics.Canvas
    @Nullable
    public DrawFilter getDrawFilter() {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.getDrawFilter();
    }

    @Override  // android.graphics.Canvas
    public int getHeight() {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.getHeight();
    }

    @Override  // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public void getMatrix(@NotNull Matrix matrix0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.getMatrix(matrix0);
    }

    @Override  // android.graphics.Canvas
    public int getMaximumBitmapHeight() {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.getMaximumBitmapHeight();
    }

    @Override  // android.graphics.Canvas
    public int getMaximumBitmapWidth() {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.getMaximumBitmapWidth();
    }

    @Override  // android.graphics.Canvas
    public int getSaveCount() {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.getSaveCount();
    }

    @Override  // android.graphics.Canvas
    public int getWidth() {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.getWidth();
    }

    @Override  // android.graphics.Canvas
    public boolean isOpaque() {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.isOpaque();
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(30)
    public boolean quickReject(float f, float f1, float f2, float f3) {
        g g0 = g.a;
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return g0.a(canvas0, f, f1, f2, f3);
    }

    @Override  // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public boolean quickReject(float f, float f1, float f2, float f3, @NotNull Canvas.EdgeType canvas$EdgeType0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.quickReject(f, f1, f2, f3, canvas$EdgeType0);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(30)
    public boolean quickReject(@NotNull Path path0) {
        g g0 = g.a;
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return g0.b(canvas0, path0);
    }

    @Override  // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public boolean quickReject(@NotNull Path path0, @NotNull Canvas.EdgeType canvas$EdgeType0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.quickReject(path0, canvas$EdgeType0);
    }

    @Override  // android.graphics.Canvas
    @RequiresApi(30)
    public boolean quickReject(@NotNull RectF rectF0) {
        g g0 = g.a;
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return g0.c(canvas0, rectF0);
    }

    @Override  // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public boolean quickReject(@NotNull RectF rectF0, @NotNull Canvas.EdgeType canvas$EdgeType0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.quickReject(rectF0, canvas$EdgeType0);
    }

    @Override  // android.graphics.Canvas
    public void restore() {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.restore();
    }

    @Override  // android.graphics.Canvas
    public void restoreToCount(int v) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.restoreToCount(v);
    }

    @Override  // android.graphics.Canvas
    public void rotate(float f) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.rotate(f);
    }

    @Override  // android.graphics.Canvas
    public int save() {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.save();
    }

    @Override  // android.graphics.Canvas
    public int saveLayer(float f, float f1, float f2, float f3, @Nullable Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.saveLayer(f, f1, f2, f3, paint0);
    }

    @Override  // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public int saveLayer(float f, float f1, float f2, float f3, @Nullable Paint paint0, int v) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.saveLayer(f, f1, f2, f3, paint0, v);
    }

    @Override  // android.graphics.Canvas
    public int saveLayer(@Nullable RectF rectF0, @Nullable Paint paint0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.saveLayer(rectF0, paint0);
    }

    @Override  // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public int saveLayer(@Nullable RectF rectF0, @Nullable Paint paint0, int v) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.saveLayer(rectF0, paint0, v);
    }

    @Override  // android.graphics.Canvas
    public int saveLayerAlpha(float f, float f1, float f2, float f3, int v) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.saveLayerAlpha(f, f1, f2, f3, v);
    }

    @Override  // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public int saveLayerAlpha(float f, float f1, float f2, float f3, int v, int v1) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.saveLayerAlpha(f, f1, f2, f3, v, v1);
    }

    @Override  // android.graphics.Canvas
    public int saveLayerAlpha(@Nullable RectF rectF0, int v) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.saveLayerAlpha(rectF0, v);
    }

    @Override  // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public int saveLayerAlpha(@Nullable RectF rectF0, int v, int v1) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        return canvas0.saveLayerAlpha(rectF0, v, v1);
    }

    @Override  // android.graphics.Canvas
    public void scale(float f, float f1) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.scale(f, f1);
    }

    @Override  // android.graphics.Canvas
    public void setBitmap(@Nullable Bitmap bitmap0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.setBitmap(bitmap0);
    }

    public final void setCanvas(@NotNull Canvas canvas0) {
        this.a = canvas0;
    }

    @Override  // android.graphics.Canvas
    public void setDensity(int v) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.setDensity(v);
    }

    @Override  // android.graphics.Canvas
    public void setDrawFilter(@Nullable DrawFilter drawFilter0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.setDrawFilter(drawFilter0);
    }

    @Override  // android.graphics.Canvas
    public void setMatrix(@Nullable Matrix matrix0) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.setMatrix(matrix0);
    }

    @Override  // android.graphics.Canvas
    public void skew(float f, float f1) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.skew(f, f1);
    }

    @Override  // android.graphics.Canvas
    public void translate(float f, float f1) {
        Canvas canvas0 = this.a;
        if(canvas0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas0 = null;
        }
        canvas0.translate(f, f1);
    }
}

