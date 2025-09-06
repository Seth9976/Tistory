package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Immutable
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\bG\b\u0007\u0018\u00002\u00020\u0001B\u00BF\u0001\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E\u0012\b\b\u0002\u0010\u0010\u001A\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001A\u00020\u0017\u0012\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u001B\u0012\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001D\u0012\n\b\u0002\u0010 \u001A\u0004\u0018\u00010\u001F\u00A2\u0006\u0004\b!\u0010\"B\u00A9\u0001\b\u0017\u0012\b\b\u0002\u0010#\u001A\u00020\u0017\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E\u0012\b\b\u0002\u0010\u0010\u001A\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001A\u00020\u0017\u0012\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u001B\u00A2\u0006\u0004\b!\u0010$B\u00B5\u0001\b\u0017\u0012\b\b\u0002\u0010#\u001A\u00020\u0017\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E\u0012\b\b\u0002\u0010\u0010\u001A\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001A\u00020\u0017\u0012\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u001B\u0012\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001D\u00A2\u0006\u0004\b!\u0010%B\u00C1\u0001\b\u0016\u0012\b\b\u0002\u0010#\u001A\u00020\u0017\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E\u0012\b\b\u0002\u0010\u0010\u001A\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001A\u00020\u0017\u0012\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u001B\u0012\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001D\u0012\n\b\u0002\u0010 \u001A\u0004\u0018\u00010\u001F\u00A2\u0006\u0004\b!\u0010&B\u00CB\u0001\b\u0016\u0012\b\u0010(\u001A\u0004\u0018\u00010\'\u0012\b\b\u0002\u0010*\u001A\u00020)\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E\u0012\b\b\u0002\u0010\u0010\u001A\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001A\u00020\u0017\u0012\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u001B\u0012\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001D\u0012\n\b\u0002\u0010 \u001A\u0004\u0018\u00010\u001F\u00A2\u0006\u0004\b!\u0010+J\u001B\u0010-\u001A\u00020\u00002\n\b\u0002\u0010,\u001A\u0004\u0018\u00010\u0000H\u0007\u00A2\u0006\u0004\b-\u0010.J\u0018\u0010/\u001A\u00020\u00002\u0006\u0010,\u001A\u00020\u0000H\u0087\u0002\u00A2\u0006\u0004\b/\u0010.J\u00B2\u0001\u00102\u001A\u00020\u00002\b\b\u0002\u0010#\u001A\u00020\u00172\b\b\u0002\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\u00042\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u00172\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u001BH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b0\u00101J\u00BE\u0001\u00102\u001A\u00020\u00002\b\b\u0002\u0010#\u001A\u00020\u00172\b\b\u0002\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\u00042\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u00172\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u001B2\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001DH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b3\u00104J\u00C8\u0001\u00102\u001A\u00020\u00002\b\b\u0002\u0010#\u001A\u00020\u00172\b\b\u0002\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\u00042\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u00172\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u001B2\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001D2\n\b\u0002\u0010 \u001A\u0004\u0018\u00010\u001F\u00F8\u0001\u0000\u00A2\u0006\u0004\b5\u00106J\u00D2\u0001\u00102\u001A\u00020\u00002\b\u0010(\u001A\u0004\u0018\u00010\'2\b\b\u0002\u0010*\u001A\u00020)2\b\b\u0002\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\u00042\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u00172\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u001B2\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001D2\n\b\u0002\u0010 \u001A\u0004\u0018\u00010\u001F\u00F8\u0001\u0000\u00A2\u0006\u0004\b7\u00108J\u001A\u0010:\u001A\u0002092\b\u0010,\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b:\u0010;J\u0017\u0010>\u001A\u0002092\u0006\u0010,\u001A\u00020\u0000H\u0000\u00A2\u0006\u0004\b<\u0010=J\u0017\u0010@\u001A\u0002092\u0006\u0010,\u001A\u00020\u0000H\u0000\u00A2\u0006\u0004\b?\u0010=J\u000F\u0010B\u001A\u00020AH\u0016\u00A2\u0006\u0004\bB\u0010CJ\u000F\u0010E\u001A\u00020AH\u0000\u00A2\u0006\u0004\bD\u0010CJ\u000F\u0010F\u001A\u00020\u000EH\u0016\u00A2\u0006\u0004\bF\u0010GR\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bH\u0010I\u001A\u0004\bJ\u0010KR\u001D\u0010\u0005\u001A\u00020\u00048\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bL\u0010M\u001A\u0004\bN\u0010OR\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0006\u00A2\u0006\f\n\u0004\bP\u0010Q\u001A\u0004\bR\u0010SR\u001F\u0010\t\u001A\u0004\u0018\u00010\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bT\u0010U\u001A\u0004\bV\u0010WR\u001F\u0010\u000B\u001A\u0004\u0018\u00010\n8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bX\u0010Y\u001A\u0004\bZ\u0010[R\u0019\u0010\r\u001A\u0004\u0018\u00010\f8\u0006\u00A2\u0006\f\n\u0004\b\\\u0010]\u001A\u0004\b^\u0010_R\u0019\u0010\u000F\u001A\u0004\u0018\u00010\u000E8\u0006\u00A2\u0006\f\n\u0004\b`\u0010a\u001A\u0004\bb\u0010GR\u001D\u0010\u0010\u001A\u00020\u00048\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bc\u0010M\u001A\u0004\bd\u0010OR\u001F\u0010\u0012\u001A\u0004\u0018\u00010\u00118\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\be\u0010f\u001A\u0004\bg\u0010hR\u0019\u0010\u0014\u001A\u0004\u0018\u00010\u00138\u0006\u00A2\u0006\f\n\u0004\bi\u0010j\u001A\u0004\bk\u0010lR\u0019\u0010\u0016\u001A\u0004\u0018\u00010\u00158\u0006\u00A2\u0006\f\n\u0004\bm\u0010n\u001A\u0004\bo\u0010pR\u001D\u0010\u0018\u001A\u00020\u00178\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bq\u0010M\u001A\u0004\br\u0010OR\u0019\u0010\u001A\u001A\u0004\u0018\u00010\u00198\u0006\u00A2\u0006\f\n\u0004\bs\u0010t\u001A\u0004\bu\u0010vR\u0019\u0010\u001C\u001A\u0004\u0018\u00010\u001B8\u0006\u00A2\u0006\f\n\u0004\bw\u0010x\u001A\u0004\by\u0010zR\u0019\u0010\u001E\u001A\u0004\u0018\u00010\u001D8\u0006\u00A2\u0006\f\n\u0004\b{\u0010|\u001A\u0004\b}\u0010~R\u001C\u0010 \u001A\u0004\u0018\u00010\u001F8\u0006\u00A2\u0006\u000F\n\u0005\b\u007F\u0010\u0080\u0001\u001A\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010#\u001A\u00020\u00178F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0007\u001A\u0005\b\u0083\u0001\u0010OR\u0015\u0010(\u001A\u0004\u0018\u00010\'8F\u00A2\u0006\b\u001A\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0013\u0010*\u001A\u00020)8F\u00A2\u0006\b\u001A\u0006\b\u0086\u0001\u0010\u0087\u0001\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006\u0088\u0001"}, d2 = {"Landroidx/compose/ui/text/SpanStyle;", "", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "textForegroundStyle", "Landroidx/compose/ui/unit/TextUnit;", "fontSize", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "Landroidx/compose/ui/text/style/BaselineShift;", "baselineShift", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textGeometricTransform", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "Landroidx/compose/ui/graphics/Color;", "background", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/PlatformSpanStyle;", "platformStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "<init>", "(Landroidx/compose/ui/text/style/TextForegroundStyle;JLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "color", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/graphics/Brush;", "brush", "", "alpha", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "merge", "(Landroidx/compose/ui/text/SpanStyle;)Landroidx/compose/ui/text/SpanStyle;", "plus", "copy-IuqyXdg", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;)Landroidx/compose/ui/text/SpanStyle;", "copy", "copy-2BkPm_w", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;)Landroidx/compose/ui/text/SpanStyle;", "copy-GSF8kmg", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;)Landroidx/compose/ui/text/SpanStyle;", "copy-NcG25M8", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;)Landroidx/compose/ui/text/SpanStyle;", "", "equals", "(Ljava/lang/Object;)Z", "hasSameLayoutAffectingAttributes$ui_text_release", "(Landroidx/compose/ui/text/SpanStyle;)Z", "hasSameLayoutAffectingAttributes", "hasSameNonLayoutAttributes$ui_text_release", "hasSameNonLayoutAttributes", "", "hashCode", "()I", "hashCodeLayoutAffectingAttributes$ui_text_release", "hashCodeLayoutAffectingAttributes", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "getTextForegroundStyle$ui_text_release", "()Landroidx/compose/ui/text/style/TextForegroundStyle;", "b", "J", "getFontSize-XSAIIZE", "()J", "c", "Landroidx/compose/ui/text/font/FontWeight;", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "d", "Landroidx/compose/ui/text/font/FontStyle;", "getFontStyle-4Lr2A7w", "()Landroidx/compose/ui/text/font/FontStyle;", "e", "Landroidx/compose/ui/text/font/FontSynthesis;", "getFontSynthesis-ZQGJjVo", "()Landroidx/compose/ui/text/font/FontSynthesis;", "f", "Landroidx/compose/ui/text/font/FontFamily;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "g", "Ljava/lang/String;", "getFontFeatureSettings", "h", "getLetterSpacing-XSAIIZE", "i", "Landroidx/compose/ui/text/style/BaselineShift;", "getBaselineShift-5SSeXJ0", "()Landroidx/compose/ui/text/style/BaselineShift;", "j", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "getTextGeometricTransform", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "k", "Landroidx/compose/ui/text/intl/LocaleList;", "getLocaleList", "()Landroidx/compose/ui/text/intl/LocaleList;", "l", "getBackground-0d7_KjU", "m", "Landroidx/compose/ui/text/style/TextDecoration;", "getTextDecoration", "()Landroidx/compose/ui/text/style/TextDecoration;", "n", "Landroidx/compose/ui/graphics/Shadow;", "getShadow", "()Landroidx/compose/ui/graphics/Shadow;", "o", "Landroidx/compose/ui/text/PlatformSpanStyle;", "getPlatformStyle", "()Landroidx/compose/ui/text/PlatformSpanStyle;", "p", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "getDrawStyle", "()Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "getColor-0d7_KjU", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "getAlpha", "()F", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SpanStyle {
    public static final int $stable;
    public final TextForegroundStyle a;
    public final long b;
    public final FontWeight c;
    public final FontStyle d;
    public final FontSynthesis e;
    public final FontFamily f;
    public final String g;
    public final long h;
    public final BaselineShift i;
    public final TextGeometricTransform j;
    public final LocaleList k;
    public final long l;
    public final TextDecoration m;
    public final Shadow n;
    public final PlatformSpanStyle o;
    public final DrawStyle p;

    // 去混淆评级： 低(40)
    public SpanStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, int v4, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v4 & 1) == 0 ? v : 0L), ((v4 & 2) == 0 ? v1 : 0x7FC00000L), ((v4 & 4) == 0 ? fontWeight0 : null), ((v4 & 8) == 0 ? fontStyle0 : null), ((v4 & 16) == 0 ? fontSynthesis0 : null), ((v4 & 0x20) == 0 ? fontFamily0 : null), ((v4 & 0x40) == 0 ? s : null), ((v4 & 0x80) == 0 ? v2 : 0x7FC00000L), ((v4 & 0x100) == 0 ? baselineShift0 : null), ((v4 & 0x200) == 0 ? textGeometricTransform0 : null), ((v4 & 0x400) == 0 ? localeList0 : null), ((v4 & 0x800) == 0 ? v3 : 0L), ((v4 & 0x1000) == 0 ? textDecoration0 : null), ((v4 & 0x2000) == 0 ? shadow0 : null), null);
    }

    // 去混淆评级： 低(40)
    public SpanStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, PlatformSpanStyle platformSpanStyle0, int v4, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v4 & 1) == 0 ? v : 0L), ((v4 & 2) == 0 ? v1 : 0x7FC00000L), ((v4 & 4) == 0 ? fontWeight0 : null), ((v4 & 8) == 0 ? fontStyle0 : null), ((v4 & 16) == 0 ? fontSynthesis0 : null), ((v4 & 0x20) == 0 ? fontFamily0 : null), ((v4 & 0x40) == 0 ? s : null), ((v4 & 0x80) == 0 ? v2 : 0x7FC00000L), ((v4 & 0x100) == 0 ? baselineShift0 : null), ((v4 & 0x200) == 0 ? textGeometricTransform0 : null), ((v4 & 0x400) == 0 ? localeList0 : null), ((v4 & 0x800) == 0 ? v3 : 0L), ((v4 & 0x1000) == 0 ? textDecoration0 : null), ((v4 & 0x2000) == 0 ? shadow0 : null), ((v4 & 0x4000) == 0 ? platformSpanStyle0 : null), null);
    }

    // 去混淆评级： 低(40)
    public SpanStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, PlatformSpanStyle platformSpanStyle0, DrawStyle drawStyle0, int v4, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v4 & 1) == 0 ? v : 0L), ((v4 & 2) == 0 ? v1 : 0x7FC00000L), ((v4 & 4) == 0 ? fontWeight0 : null), ((v4 & 8) == 0 ? fontStyle0 : null), ((v4 & 16) == 0 ? fontSynthesis0 : null), ((v4 & 0x20) == 0 ? fontFamily0 : null), ((v4 & 0x40) == 0 ? s : null), ((v4 & 0x80) == 0 ? v2 : 0x7FC00000L), ((v4 & 0x100) == 0 ? baselineShift0 : null), ((v4 & 0x200) == 0 ? textGeometricTransform0 : null), ((v4 & 0x400) == 0 ? localeList0 : null), ((v4 & 0x800) == 0 ? v3 : 0L), ((v4 & 0x1000) == 0 ? textDecoration0 : null), ((v4 & 0x2000) == 0 ? shadow0 : null), ((v4 & 0x4000) == 0 ? platformSpanStyle0 : null), ((v4 & 0x8000) == 0 ? drawStyle0 : null), null);
    }

    public SpanStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, PlatformSpanStyle platformSpanStyle0, DrawStyle drawStyle0, DefaultConstructorMarker defaultConstructorMarker0) {
        this(TextForegroundStyle.Companion.from-8_81llA(v), v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, platformSpanStyle0, drawStyle0, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "SpanStyle constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable constructor.")
    public SpanStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, PlatformSpanStyle platformSpanStyle0, DefaultConstructorMarker defaultConstructorMarker0) {
        this(TextForegroundStyle.Companion.from-8_81llA(v), v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, platformSpanStyle0, null, 0x8000, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "SpanStyle constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable constructor.")
    public SpanStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, DefaultConstructorMarker defaultConstructorMarker0) {
        this(TextForegroundStyle.Companion.from-8_81llA(v), v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, null, null, 0x8000, null);
    }

    // 去混淆评级： 低(30)
    public SpanStyle(Brush brush0, float f, long v, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v1, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v2, TextDecoration textDecoration0, Shadow shadow0, PlatformSpanStyle platformSpanStyle0, DrawStyle drawStyle0, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this(brush0, ((v3 & 2) == 0 ? f : NaNf), ((v3 & 4) == 0 ? v : 0x7FC00000L), ((v3 & 8) == 0 ? fontWeight0 : null), ((v3 & 16) == 0 ? fontStyle0 : null), ((v3 & 0x20) == 0 ? fontSynthesis0 : null), ((v3 & 0x40) == 0 ? fontFamily0 : null), ((v3 & 0x80) == 0 ? s : null), ((v3 & 0x100) == 0 ? v1 : 0x7FC00000L), ((v3 & 0x200) == 0 ? baselineShift0 : null), ((v3 & 0x400) == 0 ? textGeometricTransform0 : null), ((v3 & 0x800) == 0 ? localeList0 : null), ((v3 & 0x1000) == 0 ? v2 : 0L), ((v3 & 0x2000) == 0 ? textDecoration0 : null), ((v3 & 0x4000) == 0 ? shadow0 : null), ((0x8000 & v3) == 0 ? platformSpanStyle0 : null), ((v3 & 0x10000) == 0 ? drawStyle0 : null), null);
    }

    public SpanStyle(Brush brush0, float f, long v, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v1, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v2, TextDecoration textDecoration0, Shadow shadow0, PlatformSpanStyle platformSpanStyle0, DrawStyle drawStyle0, DefaultConstructorMarker defaultConstructorMarker0) {
        this(TextForegroundStyle.Companion.from(brush0, f), v, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v1, baselineShift0, textGeometricTransform0, localeList0, v2, textDecoration0, shadow0, platformSpanStyle0, drawStyle0, null);
    }

    // 去混淆评级： 低(30)
    public SpanStyle(TextForegroundStyle textForegroundStyle0, long v, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v1, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v2, TextDecoration textDecoration0, Shadow shadow0, PlatformSpanStyle platformSpanStyle0, DrawStyle drawStyle0, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this(textForegroundStyle0, ((v3 & 2) == 0 ? v : 0x7FC00000L), ((v3 & 4) == 0 ? fontWeight0 : null), ((v3 & 8) == 0 ? fontStyle0 : null), ((v3 & 16) == 0 ? fontSynthesis0 : null), ((v3 & 0x20) == 0 ? fontFamily0 : null), ((v3 & 0x40) == 0 ? s : null), ((v3 & 0x80) == 0 ? v1 : 0x7FC00000L), ((v3 & 0x100) == 0 ? baselineShift0 : null), ((v3 & 0x200) == 0 ? textGeometricTransform0 : null), ((v3 & 0x400) == 0 ? localeList0 : null), ((v3 & 0x800) == 0 ? v2 : 0L), ((v3 & 0x1000) == 0 ? textDecoration0 : null), ((v3 & 0x2000) == 0 ? shadow0 : null), ((v3 & 0x4000) == 0 ? platformSpanStyle0 : null), ((v3 & 0x8000) == 0 ? drawStyle0 : null), null);
    }

    public SpanStyle(TextForegroundStyle textForegroundStyle0, long v, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v1, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v2, TextDecoration textDecoration0, Shadow shadow0, PlatformSpanStyle platformSpanStyle0, DrawStyle drawStyle0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = textForegroundStyle0;
        this.b = v;
        this.c = fontWeight0;
        this.d = fontStyle0;
        this.e = fontSynthesis0;
        this.f = fontFamily0;
        this.g = s;
        this.h = v1;
        this.i = baselineShift0;
        this.j = textGeometricTransform0;
        this.k = localeList0;
        this.l = v2;
        this.m = textDecoration0;
        this.n = shadow0;
        this.o = platformSpanStyle0;
        this.p = drawStyle0;
    }

    // 去混淆评级： 低(20)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "SpanStyle copy constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable copy constructor.")
    public final SpanStyle copy-2BkPm_w(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, PlatformSpanStyle platformSpanStyle0) {
        return Color.equals-impl0(v, this.getColor-0d7_KjU()) ? new SpanStyle(this.a, v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, platformSpanStyle0, null, 0x8000, null) : new SpanStyle(TextForegroundStyle.Companion.from-8_81llA(v), v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, platformSpanStyle0, null, 0x8000, null);
    }

    public static SpanStyle copy-2BkPm_w$default(SpanStyle spanStyle0, long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, PlatformSpanStyle platformSpanStyle0, int v4, Object object0) {
        long v5 = (v4 & 1) == 0 ? v : spanStyle0.getColor-0d7_KjU();
        long v6 = (v4 & 2) == 0 ? v1 : spanStyle0.b;
        FontWeight fontWeight1 = (v4 & 4) == 0 ? fontWeight0 : spanStyle0.c;
        FontStyle fontStyle1 = (v4 & 8) == 0 ? fontStyle0 : spanStyle0.d;
        FontSynthesis fontSynthesis1 = (v4 & 16) == 0 ? fontSynthesis0 : spanStyle0.e;
        FontFamily fontFamily1 = (v4 & 0x20) == 0 ? fontFamily0 : spanStyle0.f;
        String s1 = (v4 & 0x40) == 0 ? s : spanStyle0.g;
        long v7 = (v4 & 0x80) == 0 ? v2 : spanStyle0.h;
        BaselineShift baselineShift1 = (v4 & 0x100) == 0 ? baselineShift0 : spanStyle0.i;
        TextGeometricTransform textGeometricTransform1 = (v4 & 0x200) == 0 ? textGeometricTransform0 : spanStyle0.j;
        LocaleList localeList1 = (v4 & 0x400) == 0 ? localeList0 : spanStyle0.k;
        long v8 = (v4 & 0x800) == 0 ? v3 : spanStyle0.l;
        TextDecoration textDecoration1 = (v4 & 0x1000) == 0 ? textDecoration0 : spanStyle0.m;
        Shadow shadow1 = (v4 & 0x2000) == 0 ? shadow0 : spanStyle0.n;
        return (v4 & 0x4000) == 0 ? spanStyle0.copy-2BkPm_w(v5, v6, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v7, baselineShift1, textGeometricTransform1, localeList1, v8, textDecoration1, shadow1, platformSpanStyle0) : spanStyle0.copy-2BkPm_w(v5, v6, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v7, baselineShift1, textGeometricTransform1, localeList1, v8, textDecoration1, shadow1, spanStyle0.o);
    }

    // 去混淆评级： 低(20)
    @NotNull
    public final SpanStyle copy-GSF8kmg(long v, long v1, @Nullable FontWeight fontWeight0, @Nullable FontStyle fontStyle0, @Nullable FontSynthesis fontSynthesis0, @Nullable FontFamily fontFamily0, @Nullable String s, long v2, @Nullable BaselineShift baselineShift0, @Nullable TextGeometricTransform textGeometricTransform0, @Nullable LocaleList localeList0, long v3, @Nullable TextDecoration textDecoration0, @Nullable Shadow shadow0, @Nullable PlatformSpanStyle platformSpanStyle0, @Nullable DrawStyle drawStyle0) {
        return Color.equals-impl0(v, this.getColor-0d7_KjU()) ? new SpanStyle(this.a, v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, platformSpanStyle0, drawStyle0, null) : new SpanStyle(TextForegroundStyle.Companion.from-8_81llA(v), v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, platformSpanStyle0, drawStyle0, null);
    }

    public static SpanStyle copy-GSF8kmg$default(SpanStyle spanStyle0, long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, PlatformSpanStyle platformSpanStyle0, DrawStyle drawStyle0, int v4, Object object0) {
        long v5 = (v4 & 1) == 0 ? v : spanStyle0.getColor-0d7_KjU();
        long v6 = (v4 & 2) == 0 ? v1 : spanStyle0.b;
        FontWeight fontWeight1 = (v4 & 4) == 0 ? fontWeight0 : spanStyle0.c;
        FontStyle fontStyle1 = (v4 & 8) == 0 ? fontStyle0 : spanStyle0.d;
        FontSynthesis fontSynthesis1 = (v4 & 16) == 0 ? fontSynthesis0 : spanStyle0.e;
        FontFamily fontFamily1 = (v4 & 0x20) == 0 ? fontFamily0 : spanStyle0.f;
        String s1 = (v4 & 0x40) == 0 ? s : spanStyle0.g;
        long v7 = (v4 & 0x80) == 0 ? v2 : spanStyle0.h;
        BaselineShift baselineShift1 = (v4 & 0x100) == 0 ? baselineShift0 : spanStyle0.i;
        TextGeometricTransform textGeometricTransform1 = (v4 & 0x200) == 0 ? textGeometricTransform0 : spanStyle0.j;
        LocaleList localeList1 = (v4 & 0x400) == 0 ? localeList0 : spanStyle0.k;
        long v8 = (v4 & 0x800) == 0 ? v3 : spanStyle0.l;
        TextDecoration textDecoration1 = (v4 & 0x1000) == 0 ? textDecoration0 : spanStyle0.m;
        Shadow shadow1 = (v4 & 0x2000) == 0 ? shadow0 : spanStyle0.n;
        PlatformSpanStyle platformSpanStyle1 = (v4 & 0x4000) == 0 ? platformSpanStyle0 : spanStyle0.o;
        return (v4 & 0x8000) == 0 ? spanStyle0.copy-GSF8kmg(v5, v6, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v7, baselineShift1, textGeometricTransform1, localeList1, v8, textDecoration1, shadow1, platformSpanStyle1, drawStyle0) : spanStyle0.copy-GSF8kmg(v5, v6, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v7, baselineShift1, textGeometricTransform1, localeList1, v8, textDecoration1, shadow1, platformSpanStyle1, spanStyle0.p);
    }

    // 去混淆评级： 低(20)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "SpanStyle copy constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable copy constructor.")
    public final SpanStyle copy-IuqyXdg(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0) {
        return Color.equals-impl0(v, this.getColor-0d7_KjU()) ? new SpanStyle(this.a, v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, this.o, this.p, null) : new SpanStyle(TextForegroundStyle.Companion.from-8_81llA(v), v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, this.o, this.p, null);
    }

    public static SpanStyle copy-IuqyXdg$default(SpanStyle spanStyle0, long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, int v4, Object object0) {
        long v5 = (v4 & 1) == 0 ? v : spanStyle0.getColor-0d7_KjU();
        long v6 = (v4 & 2) == 0 ? v1 : spanStyle0.b;
        FontWeight fontWeight1 = (v4 & 4) == 0 ? fontWeight0 : spanStyle0.c;
        FontStyle fontStyle1 = (v4 & 8) == 0 ? fontStyle0 : spanStyle0.d;
        FontSynthesis fontSynthesis1 = (v4 & 16) == 0 ? fontSynthesis0 : spanStyle0.e;
        FontFamily fontFamily1 = (v4 & 0x20) == 0 ? fontFamily0 : spanStyle0.f;
        String s1 = (v4 & 0x40) == 0 ? s : spanStyle0.g;
        long v7 = (v4 & 0x80) == 0 ? v2 : spanStyle0.h;
        BaselineShift baselineShift1 = (v4 & 0x100) == 0 ? baselineShift0 : spanStyle0.i;
        TextGeometricTransform textGeometricTransform1 = (v4 & 0x200) == 0 ? textGeometricTransform0 : spanStyle0.j;
        LocaleList localeList1 = (v4 & 0x400) == 0 ? localeList0 : spanStyle0.k;
        long v8 = (v4 & 0x800) == 0 ? v3 : spanStyle0.l;
        TextDecoration textDecoration1 = (v4 & 0x1000) == 0 ? textDecoration0 : spanStyle0.m;
        return (v4 & 0x2000) == 0 ? spanStyle0.copy-IuqyXdg(v5, v6, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v7, baselineShift1, textGeometricTransform1, localeList1, v8, textDecoration1, shadow0) : spanStyle0.copy-IuqyXdg(v5, v6, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v7, baselineShift1, textGeometricTransform1, localeList1, v8, textDecoration1, spanStyle0.n);
    }

    @NotNull
    public final SpanStyle copy-NcG25M8(@Nullable Brush brush0, float f, long v, @Nullable FontWeight fontWeight0, @Nullable FontStyle fontStyle0, @Nullable FontSynthesis fontSynthesis0, @Nullable FontFamily fontFamily0, @Nullable String s, long v1, @Nullable BaselineShift baselineShift0, @Nullable TextGeometricTransform textGeometricTransform0, @Nullable LocaleList localeList0, long v2, @Nullable TextDecoration textDecoration0, @Nullable Shadow shadow0, @Nullable PlatformSpanStyle platformSpanStyle0, @Nullable DrawStyle drawStyle0) {
        return new SpanStyle(TextForegroundStyle.Companion.from(brush0, f), v, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v1, baselineShift0, textGeometricTransform0, localeList0, v2, textDecoration0, shadow0, platformSpanStyle0, drawStyle0, null);
    }

    public static SpanStyle copy-NcG25M8$default(SpanStyle spanStyle0, Brush brush0, float f, long v, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v1, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v2, TextDecoration textDecoration0, Shadow shadow0, PlatformSpanStyle platformSpanStyle0, DrawStyle drawStyle0, int v3, Object object0) {
        float f1 = (v3 & 2) == 0 ? f : spanStyle0.getAlpha();
        long v4 = (v3 & 4) == 0 ? v : spanStyle0.b;
        FontWeight fontWeight1 = (v3 & 8) == 0 ? fontWeight0 : spanStyle0.c;
        FontStyle fontStyle1 = (v3 & 16) == 0 ? fontStyle0 : spanStyle0.d;
        FontSynthesis fontSynthesis1 = (v3 & 0x20) == 0 ? fontSynthesis0 : spanStyle0.e;
        FontFamily fontFamily1 = (v3 & 0x40) == 0 ? fontFamily0 : spanStyle0.f;
        String s1 = (v3 & 0x80) == 0 ? s : spanStyle0.g;
        long v5 = (v3 & 0x100) == 0 ? v1 : spanStyle0.h;
        BaselineShift baselineShift1 = (v3 & 0x200) == 0 ? baselineShift0 : spanStyle0.i;
        TextGeometricTransform textGeometricTransform1 = (v3 & 0x400) == 0 ? textGeometricTransform0 : spanStyle0.j;
        LocaleList localeList1 = (v3 & 0x800) == 0 ? localeList0 : spanStyle0.k;
        long v6 = (v3 & 0x1000) == 0 ? v2 : spanStyle0.l;
        TextDecoration textDecoration1 = (v3 & 0x2000) == 0 ? textDecoration0 : spanStyle0.m;
        Shadow shadow1 = (v3 & 0x4000) == 0 ? shadow0 : spanStyle0.n;
        if((v3 & 0x8000) != 0) {
            return (v3 & 0x10000) == 0 ? spanStyle0.copy-NcG25M8(brush0, f1, v4, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v5, baselineShift1, textGeometricTransform1, localeList1, v6, textDecoration1, shadow1, spanStyle0.o, drawStyle0) : spanStyle0.copy-NcG25M8(brush0, f1, v4, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v5, baselineShift1, textGeometricTransform1, localeList1, v6, textDecoration1, shadow1, spanStyle0.o, spanStyle0.p);
        }
        return (v3 & 0x10000) == 0 ? spanStyle0.copy-NcG25M8(brush0, f1, v4, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v5, baselineShift1, textGeometricTransform1, localeList1, v6, textDecoration1, shadow1, platformSpanStyle0, drawStyle0) : spanStyle0.copy-NcG25M8(brush0, f1, v4, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v5, baselineShift1, textGeometricTransform1, localeList1, v6, textDecoration1, shadow1, platformSpanStyle0, spanStyle0.p);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof SpanStyle ? this.hasSameLayoutAffectingAttributes$ui_text_release(((SpanStyle)object0)) && this.hasSameNonLayoutAttributes$ui_text_release(((SpanStyle)object0)) : false;
    }

    public final float getAlpha() {
        return this.a.getAlpha();
    }

    public final long getBackground-0d7_KjU() {
        return this.l;
    }

    @Nullable
    public final BaselineShift getBaselineShift-5SSeXJ0() {
        return this.i;
    }

    @Nullable
    public final Brush getBrush() {
        return this.a.getBrush();
    }

    public final long getColor-0d7_KjU() {
        return this.a.getColor-0d7_KjU();
    }

    @Nullable
    public final DrawStyle getDrawStyle() {
        return this.p;
    }

    @Nullable
    public final FontFamily getFontFamily() {
        return this.f;
    }

    @Nullable
    public final String getFontFeatureSettings() {
        return this.g;
    }

    public final long getFontSize-XSAIIZE() {
        return this.b;
    }

    @Nullable
    public final FontStyle getFontStyle-4Lr2A7w() {
        return this.d;
    }

    @Nullable
    public final FontSynthesis getFontSynthesis-ZQGJjVo() {
        return this.e;
    }

    @Nullable
    public final FontWeight getFontWeight() {
        return this.c;
    }

    public final long getLetterSpacing-XSAIIZE() {
        return this.h;
    }

    @Nullable
    public final LocaleList getLocaleList() {
        return this.k;
    }

    @Nullable
    public final PlatformSpanStyle getPlatformStyle() {
        return this.o;
    }

    @Nullable
    public final Shadow getShadow() {
        return this.n;
    }

    @Nullable
    public final TextDecoration getTextDecoration() {
        return this.m;
    }

    @NotNull
    public final TextForegroundStyle getTextForegroundStyle$ui_text_release() {
        return this.a;
    }

    @Nullable
    public final TextGeometricTransform getTextGeometricTransform() {
        return this.j;
    }

    public final boolean hasSameLayoutAffectingAttributes$ui_text_release(@NotNull SpanStyle spanStyle0) {
        if(this == spanStyle0) {
            return true;
        }
        if(!TextUnit.equals-impl0(this.b, spanStyle0.b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, spanStyle0.c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, spanStyle0.d)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, spanStyle0.e)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.f, spanStyle0.f)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.g, spanStyle0.g)) {
            return false;
        }
        if(!TextUnit.equals-impl0(this.h, spanStyle0.h)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.i, spanStyle0.i)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.j, spanStyle0.j)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.k, spanStyle0.k)) {
            return false;
        }
        return Color.equals-impl0(this.l, spanStyle0.l) ? Intrinsics.areEqual(this.o, spanStyle0.o) : false;
    }

    public final boolean hasSameNonLayoutAttributes$ui_text_release(@NotNull SpanStyle spanStyle0) {
        if(!Intrinsics.areEqual(this.a, spanStyle0.a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.m, spanStyle0.m)) {
            return false;
        }
        return Intrinsics.areEqual(this.n, spanStyle0.n) ? Intrinsics.areEqual(this.p, spanStyle0.p) : false;
    }

    @Override
    public int hashCode() {
        int v = Color.hashCode-impl(this.getColor-0d7_KjU());
        Brush brush0 = this.getBrush();
        int v1 = 0;
        int v2 = Float.hashCode(this.getAlpha());
        int v3 = a.a(this.l, ((((TextUnit.hashCode-impl(this.h) + ((((((TextUnit.hashCode-impl(this.b) + (v2 + (v * 0x1F + (brush0 == null ? 0 : brush0.hashCode())) * 0x1F) * 0x1F) * 0x1F + (this.c == null ? 0 : this.c.hashCode())) * 0x1F + (this.d == null ? 0 : FontStyle.hashCode-impl(this.d.unbox-impl()))) * 0x1F + (this.e == null ? 0 : FontSynthesis.hashCode-impl(this.e.unbox-impl()))) * 0x1F + (this.f == null ? 0 : this.f.hashCode())) * 0x1F + (this.g == null ? 0 : this.g.hashCode())) * 0x1F) * 0x1F + (this.i == null ? 0 : BaselineShift.hashCode-impl(this.i.unbox-impl()))) * 0x1F + (this.j == null ? 0 : this.j.hashCode())) * 0x1F + (this.k == null ? 0 : this.k.hashCode())) * 0x1F, 0x1F);
        int v4 = this.m == null ? 0 : this.m.hashCode();
        int v5 = this.n == null ? 0 : this.n.hashCode();
        int v6 = this.o == null ? 0 : this.o.hashCode();
        DrawStyle drawStyle0 = this.p;
        if(drawStyle0 != null) {
            v1 = drawStyle0.hashCode();
        }
        return (((v3 + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v1;
    }

    public final int hashCodeLayoutAffectingAttributes$ui_text_release() {
        int v = 0;
        int v1 = a.a(this.l, ((((TextUnit.hashCode-impl(this.h) + (((((TextUnit.hashCode-impl(this.b) * 0x1F + (this.c == null ? 0 : this.c.hashCode())) * 0x1F + (this.d == null ? 0 : FontStyle.hashCode-impl(this.d.unbox-impl()))) * 0x1F + (this.e == null ? 0 : FontSynthesis.hashCode-impl(this.e.unbox-impl()))) * 0x1F + (this.f == null ? 0 : this.f.hashCode())) * 0x1F + (this.g == null ? 0 : this.g.hashCode())) * 0x1F) * 0x1F + (this.i == null ? 0 : BaselineShift.hashCode-impl(this.i.unbox-impl()))) * 0x1F + (this.j == null ? 0 : this.j.hashCode())) * 0x1F + (this.k == null ? 0 : this.k.hashCode())) * 0x1F, 0x1F);
        PlatformSpanStyle platformSpanStyle0 = this.o;
        if(platformSpanStyle0 != null) {
            v = platformSpanStyle0.hashCode();
        }
        return v1 + v;
    }

    @Stable
    @NotNull
    public final SpanStyle merge(@Nullable SpanStyle spanStyle0) {
        return spanStyle0 == null ? this : SpanStyleKt.fastMerge-dSHsh3o(this, spanStyle0.a.getColor-0d7_KjU(), spanStyle0.a.getBrush(), spanStyle0.a.getAlpha(), spanStyle0.b, spanStyle0.c, spanStyle0.d, spanStyle0.e, spanStyle0.f, spanStyle0.g, spanStyle0.h, spanStyle0.i, spanStyle0.j, spanStyle0.k, spanStyle0.l, spanStyle0.m, spanStyle0.n, spanStyle0.o, spanStyle0.p);
    }

    public static SpanStyle merge$default(SpanStyle spanStyle0, SpanStyle spanStyle1, int v, Object object0) {
        if((v & 1) != 0) {
            spanStyle1 = null;
        }
        return spanStyle0.merge(spanStyle1);
    }

    @Stable
    @NotNull
    public final SpanStyle plus(@NotNull SpanStyle spanStyle0) {
        return this.merge(spanStyle0);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("SpanStyle(color=");
        stringBuilder0.append(Color.toString-impl(this.getColor-0d7_KjU()));
        stringBuilder0.append(", brush=");
        stringBuilder0.append(this.getBrush());
        stringBuilder0.append(", alpha=");
        stringBuilder0.append(this.getAlpha());
        stringBuilder0.append(", fontSize=");
        stringBuilder0.append(TextUnit.toString-impl(this.b));
        stringBuilder0.append(", fontWeight=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", fontStyle=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", fontSynthesis=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", fontFamily=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", fontFeatureSettings=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", letterSpacing=");
        stringBuilder0.append(TextUnit.toString-impl(this.h));
        stringBuilder0.append(", baselineShift=");
        stringBuilder0.append(this.i);
        stringBuilder0.append(", textGeometricTransform=");
        stringBuilder0.append(this.j);
        stringBuilder0.append(", localeList=");
        stringBuilder0.append(this.k);
        stringBuilder0.append(", background=");
        r0.a.x(this.l, ", textDecoration=", stringBuilder0);
        stringBuilder0.append(this.m);
        stringBuilder0.append(", shadow=");
        stringBuilder0.append(this.n);
        stringBuilder0.append(", platformStyle=");
        stringBuilder0.append(this.o);
        stringBuilder0.append(", drawStyle=");
        stringBuilder0.append(this.p);
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

