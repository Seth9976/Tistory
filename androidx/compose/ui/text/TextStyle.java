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
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000\u00C0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b \n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\bL\b\u0007\u0018\u0000 \u00AF\u00012\u00020\u0001:\u0002\u00AF\u0001B%\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\u0004\b\b\u0010\tB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\b\u0010\nB\u00D7\u0001\b\u0017\u0012\b\b\u0002\u0010\f\u001A\u00020\u000B\u0012\b\b\u0002\u0010\u000E\u001A\u00020\r\u0012\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F\u0012\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001A\u00020\r\u0012\n\b\u0002\u0010\u001B\u001A\u0004\u0018\u00010\u001A\u0012\n\b\u0002\u0010\u001D\u001A\u0004\u0018\u00010\u001C\u0012\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010\u001E\u0012\b\b\u0002\u0010 \u001A\u00020\u000B\u0012\n\b\u0002\u0010\"\u001A\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001A\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001A\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001A\u0004\u0018\u00010\'\u0012\b\b\u0002\u0010)\u001A\u00020\r\u0012\n\b\u0002\u0010+\u001A\u0004\u0018\u00010*\u00A2\u0006\u0004\b\b\u0010,B\u00EF\u0001\b\u0017\u0012\b\b\u0002\u0010\f\u001A\u00020\u000B\u0012\b\b\u0002\u0010\u000E\u001A\u00020\r\u0012\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F\u0012\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001A\u00020\r\u0012\n\b\u0002\u0010\u001B\u001A\u0004\u0018\u00010\u001A\u0012\n\b\u0002\u0010\u001D\u001A\u0004\u0018\u00010\u001C\u0012\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010\u001E\u0012\b\b\u0002\u0010 \u001A\u00020\u000B\u0012\n\b\u0002\u0010\"\u001A\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001A\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001A\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001A\u0004\u0018\u00010\'\u0012\b\b\u0002\u0010)\u001A\u00020\r\u0012\n\b\u0002\u0010+\u001A\u0004\u0018\u00010*\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010.\u001A\u0004\u0018\u00010-\u00A2\u0006\u0004\b\b\u0010/B\u0087\u0002\b\u0017\u0012\b\b\u0002\u0010\f\u001A\u00020\u000B\u0012\b\b\u0002\u0010\u000E\u001A\u00020\r\u0012\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F\u0012\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001A\u00020\r\u0012\n\b\u0002\u0010\u001B\u001A\u0004\u0018\u00010\u001A\u0012\n\b\u0002\u0010\u001D\u001A\u0004\u0018\u00010\u001C\u0012\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010\u001E\u0012\b\b\u0002\u0010 \u001A\u00020\u000B\u0012\n\b\u0002\u0010\"\u001A\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001A\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001A\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001A\u0004\u0018\u00010\'\u0012\b\b\u0002\u0010)\u001A\u00020\r\u0012\n\b\u0002\u0010+\u001A\u0004\u0018\u00010*\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010.\u001A\u0004\u0018\u00010-\u0012\n\b\u0002\u00101\u001A\u0004\u0018\u000100\u0012\n\b\u0002\u00103\u001A\u0004\u0018\u000102\u00A2\u0006\u0004\b\b\u00104B\u009F\u0002\b\u0017\u0012\b\b\u0002\u0010\f\u001A\u00020\u000B\u0012\b\b\u0002\u0010\u000E\u001A\u00020\r\u0012\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F\u0012\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001A\u00020\r\u0012\n\b\u0002\u0010\u001B\u001A\u0004\u0018\u00010\u001A\u0012\n\b\u0002\u0010\u001D\u001A\u0004\u0018\u00010\u001C\u0012\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010\u001E\u0012\b\b\u0002\u0010 \u001A\u00020\u000B\u0012\n\b\u0002\u0010\"\u001A\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001A\u0004\u0018\u00010#\u0012\n\b\u0002\u00106\u001A\u0004\u0018\u000105\u0012\n\b\u0002\u0010&\u001A\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001A\u0004\u0018\u00010\'\u0012\b\b\u0002\u0010)\u001A\u00020\r\u0012\n\b\u0002\u0010+\u001A\u0004\u0018\u00010*\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010.\u001A\u0004\u0018\u00010-\u0012\n\b\u0002\u00101\u001A\u0004\u0018\u000100\u0012\n\b\u0002\u00103\u001A\u0004\u0018\u000102\u0012\n\b\u0002\u00108\u001A\u0004\u0018\u000107\u00A2\u0006\u0004\b\b\u00109B\u0097\u0002\b\u0016\u0012\b\b\u0002\u0010\f\u001A\u00020\u000B\u0012\b\b\u0002\u0010\u000E\u001A\u00020\r\u0012\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F\u0012\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001A\u00020\r\u0012\n\b\u0002\u0010\u001B\u001A\u0004\u0018\u00010\u001A\u0012\n\b\u0002\u0010\u001D\u001A\u0004\u0018\u00010\u001C\u0012\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010\u001E\u0012\b\b\u0002\u0010 \u001A\u00020\u000B\u0012\n\b\u0002\u0010\"\u001A\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001A\u0004\u0018\u00010#\u0012\n\b\u0002\u00106\u001A\u0004\u0018\u000105\u0012\b\b\u0002\u0010&\u001A\u00020%\u0012\b\b\u0002\u0010(\u001A\u00020\'\u0012\b\b\u0002\u0010)\u001A\u00020\r\u0012\n\b\u0002\u0010+\u001A\u0004\u0018\u00010*\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010.\u001A\u0004\u0018\u00010-\u0012\b\b\u0002\u00101\u001A\u000200\u0012\b\b\u0002\u00103\u001A\u000202\u0012\n\b\u0002\u00108\u001A\u0004\u0018\u000107\u00A2\u0006\u0004\b\b\u0010:B\u00A1\u0002\b\u0016\u0012\b\u0010<\u001A\u0004\u0018\u00010;\u0012\b\b\u0002\u0010>\u001A\u00020=\u0012\b\b\u0002\u0010\u000E\u001A\u00020\r\u0012\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F\u0012\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001A\u00020\r\u0012\n\b\u0002\u0010\u001B\u001A\u0004\u0018\u00010\u001A\u0012\n\b\u0002\u0010\u001D\u001A\u0004\u0018\u00010\u001C\u0012\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010\u001E\u0012\b\b\u0002\u0010 \u001A\u00020\u000B\u0012\n\b\u0002\u0010\"\u001A\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001A\u0004\u0018\u00010#\u0012\n\b\u0002\u00106\u001A\u0004\u0018\u000105\u0012\b\b\u0002\u0010&\u001A\u00020%\u0012\b\b\u0002\u0010(\u001A\u00020\'\u0012\b\b\u0002\u0010)\u001A\u00020\r\u0012\n\b\u0002\u0010+\u001A\u0004\u0018\u00010*\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010.\u001A\u0004\u0018\u00010-\u0012\b\b\u0002\u00101\u001A\u000200\u0012\b\b\u0002\u00103\u001A\u000202\u0012\n\b\u0002\u00108\u001A\u0004\u0018\u000107\u00A2\u0006\u0004\b\b\u0010?B\u00A9\u0002\b\u0017\u0012\b\u0010<\u001A\u0004\u0018\u00010;\u0012\b\b\u0002\u0010>\u001A\u00020=\u0012\b\b\u0002\u0010\u000E\u001A\u00020\r\u0012\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F\u0012\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001A\u00020\r\u0012\n\b\u0002\u0010\u001B\u001A\u0004\u0018\u00010\u001A\u0012\n\b\u0002\u0010\u001D\u001A\u0004\u0018\u00010\u001C\u0012\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010\u001E\u0012\b\b\u0002\u0010 \u001A\u00020\u000B\u0012\n\b\u0002\u0010\"\u001A\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001A\u0004\u0018\u00010#\u0012\n\b\u0002\u00106\u001A\u0004\u0018\u000105\u0012\n\b\u0002\u0010&\u001A\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001A\u0004\u0018\u00010\'\u0012\b\b\u0002\u0010)\u001A\u00020\r\u0012\n\b\u0002\u0010+\u001A\u0004\u0018\u00010*\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010.\u001A\u0004\u0018\u00010-\u0012\n\b\u0002\u00101\u001A\u0004\u0018\u000100\u0012\n\b\u0002\u00103\u001A\u0004\u0018\u000102\u0012\n\b\u0002\u00108\u001A\u0004\u0018\u000107\u00A2\u0006\u0004\b\b\u0010@J\u000F\u0010A\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\bA\u0010BJ\u000F\u0010C\u001A\u00020\u0004H\u0007\u00A2\u0006\u0004\bC\u0010DJ\u001B\u0010F\u001A\u00020\u00002\n\b\u0002\u0010E\u001A\u0004\u0018\u00010\u0000H\u0007\u00A2\u0006\u0004\bF\u0010GJ\u00A0\u0002\u0010F\u001A\u00020\u00002\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001A\u00020\r2\n\b\u0002\u0010\u001B\u001A\u0004\u0018\u00010\u001A2\n\b\u0002\u0010\u001D\u001A\u0004\u0018\u00010\u001C2\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010\u001E2\b\b\u0002\u0010 \u001A\u00020\u000B2\n\b\u0002\u0010\"\u001A\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001A\u0004\u0018\u00010#2\n\b\u0002\u00106\u001A\u0004\u0018\u0001052\b\b\u0002\u0010&\u001A\u00020%2\b\b\u0002\u0010(\u001A\u00020\'2\b\b\u0002\u0010)\u001A\u00020\r2\n\b\u0002\u0010+\u001A\u0004\u0018\u00010*2\n\b\u0002\u0010.\u001A\u0004\u0018\u00010-2\b\b\u0002\u00101\u001A\u0002002\b\b\u0002\u00103\u001A\u0002022\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u00108\u001A\u0004\u0018\u000107H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\bH\u0010IJ\u00A8\u0002\u0010F\u001A\u00020\u00002\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001A\u00020\r2\n\b\u0002\u0010\u001B\u001A\u0004\u0018\u00010\u001A2\n\b\u0002\u0010\u001D\u001A\u0004\u0018\u00010\u001C2\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010\u001E2\b\b\u0002\u0010 \u001A\u00020\u000B2\n\b\u0002\u0010\"\u001A\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001A\u0004\u0018\u00010#2\n\b\u0002\u00106\u001A\u0004\u0018\u0001052\n\b\u0002\u0010&\u001A\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001A\u0004\u0018\u00010\'2\b\b\u0002\u0010)\u001A\u00020\r2\n\b\u0002\u0010+\u001A\u0004\u0018\u00010*2\n\b\u0002\u0010.\u001A\u0004\u0018\u00010-2\n\b\u0002\u00101\u001A\u0004\u0018\u0001002\n\b\u0002\u00103\u001A\u0004\u0018\u0001022\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u00108\u001A\u0004\u0018\u000107H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\bJ\u0010KJ\u0017\u0010F\u001A\u00020\u00002\u0006\u0010E\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\bF\u0010LJ\u0017\u0010F\u001A\u00020\u00002\u0006\u0010E\u001A\u00020\u0004H\u0007\u00A2\u0006\u0004\bF\u0010MJ\u0018\u0010N\u001A\u00020\u00002\u0006\u0010E\u001A\u00020\u0000H\u0087\u0002\u00A2\u0006\u0004\bN\u0010GJ\u0018\u0010N\u001A\u00020\u00002\u0006\u0010E\u001A\u00020\u0004H\u0087\u0002\u00A2\u0006\u0004\bN\u0010MJ\u0018\u0010N\u001A\u00020\u00002\u0006\u0010E\u001A\u00020\u0002H\u0087\u0002\u00A2\u0006\u0004\bN\u0010LJ\u00E0\u0001\u0010Q\u001A\u00020\u00002\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001A\u00020\r2\n\b\u0002\u0010\u001B\u001A\u0004\u0018\u00010\u001A2\n\b\u0002\u0010\u001D\u001A\u0004\u0018\u00010\u001C2\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010\u001E2\b\b\u0002\u0010 \u001A\u00020\u000B2\n\b\u0002\u0010\"\u001A\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001A\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001A\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001A\u0004\u0018\u00010\'2\b\b\u0002\u0010)\u001A\u00020\r2\n\b\u0002\u0010+\u001A\u0004\u0018\u00010*H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\bO\u0010PJ\u00F8\u0001\u0010Q\u001A\u00020\u00002\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001A\u00020\r2\n\b\u0002\u0010\u001B\u001A\u0004\u0018\u00010\u001A2\n\b\u0002\u0010\u001D\u001A\u0004\u0018\u00010\u001C2\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010\u001E2\b\b\u0002\u0010 \u001A\u00020\u000B2\n\b\u0002\u0010\"\u001A\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001A\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001A\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001A\u0004\u0018\u00010\'2\b\b\u0002\u0010)\u001A\u00020\r2\n\b\u0002\u0010+\u001A\u0004\u0018\u00010*2\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010.\u001A\u0004\u0018\u00010-H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\bR\u0010SJ\u0090\u0002\u0010Q\u001A\u00020\u00002\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001A\u00020\r2\n\b\u0002\u0010\u001B\u001A\u0004\u0018\u00010\u001A2\n\b\u0002\u0010\u001D\u001A\u0004\u0018\u00010\u001C2\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010\u001E2\b\b\u0002\u0010 \u001A\u00020\u000B2\n\b\u0002\u0010\"\u001A\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001A\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001A\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001A\u0004\u0018\u00010\'2\b\b\u0002\u0010)\u001A\u00020\r2\n\b\u0002\u0010+\u001A\u0004\u0018\u00010*2\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010.\u001A\u0004\u0018\u00010-2\n\b\u0002\u00101\u001A\u0004\u0018\u0001002\n\b\u0002\u00103\u001A\u0004\u0018\u000102H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\bT\u0010UJ\u00A8\u0002\u0010Q\u001A\u00020\u00002\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001A\u00020\r2\n\b\u0002\u0010\u001B\u001A\u0004\u0018\u00010\u001A2\n\b\u0002\u0010\u001D\u001A\u0004\u0018\u00010\u001C2\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010\u001E2\b\b\u0002\u0010 \u001A\u00020\u000B2\n\b\u0002\u0010\"\u001A\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001A\u0004\u0018\u00010#2\n\b\u0002\u00106\u001A\u0004\u0018\u0001052\n\b\u0002\u0010&\u001A\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001A\u0004\u0018\u00010\'2\b\b\u0002\u0010)\u001A\u00020\r2\n\b\u0002\u0010+\u001A\u0004\u0018\u00010*2\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010.\u001A\u0004\u0018\u00010-2\n\b\u0002\u00101\u001A\u0004\u0018\u0001002\n\b\u0002\u00103\u001A\u0004\u0018\u0001022\n\b\u0002\u00108\u001A\u0004\u0018\u000107H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\bV\u0010WJ\u009E\u0002\u0010Q\u001A\u00020\u00002\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001A\u00020\r2\n\b\u0002\u0010\u001B\u001A\u0004\u0018\u00010\u001A2\n\b\u0002\u0010\u001D\u001A\u0004\u0018\u00010\u001C2\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010\u001E2\b\b\u0002\u0010 \u001A\u00020\u000B2\n\b\u0002\u0010\"\u001A\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001A\u0004\u0018\u00010#2\n\b\u0002\u00106\u001A\u0004\u0018\u0001052\b\b\u0002\u0010&\u001A\u00020%2\b\b\u0002\u0010(\u001A\u00020\'2\b\b\u0002\u0010)\u001A\u00020\r2\n\b\u0002\u0010+\u001A\u0004\u0018\u00010*2\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010.\u001A\u0004\u0018\u00010-2\b\b\u0002\u00101\u001A\u0002002\b\b\u0002\u00103\u001A\u0002022\n\b\u0002\u00108\u001A\u0004\u0018\u000107\u00F8\u0001\u0000\u00A2\u0006\u0004\bX\u0010YJ\u00B2\u0002\u0010Q\u001A\u00020\u00002\b\u0010<\u001A\u0004\u0018\u00010;2\b\b\u0002\u0010>\u001A\u00020=2\b\b\u0002\u0010\u000E\u001A\u00020\r2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001A\u00020\r2\n\b\u0002\u0010\u001B\u001A\u0004\u0018\u00010\u001A2\n\b\u0002\u0010\u001D\u001A\u0004\u0018\u00010\u001C2\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010\u001E2\b\b\u0002\u0010 \u001A\u00020\u000B2\n\b\u0002\u0010\"\u001A\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001A\u0004\u0018\u00010#2\n\b\u0002\u00106\u001A\u0004\u0018\u0001052\n\b\u0002\u0010&\u001A\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001A\u0004\u0018\u00010\'2\b\b\u0002\u0010)\u001A\u00020\r2\n\b\u0002\u0010+\u001A\u0004\u0018\u00010*2\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010.\u001A\u0004\u0018\u00010-2\n\b\u0002\u00101\u001A\u0004\u0018\u0001002\n\b\u0002\u00103\u001A\u0004\u0018\u0001022\n\b\u0002\u00108\u001A\u0004\u0018\u000107H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\bZ\u0010[J\u00A8\u0002\u0010Q\u001A\u00020\u00002\b\u0010<\u001A\u0004\u0018\u00010;2\b\b\u0002\u0010>\u001A\u00020=2\b\b\u0002\u0010\u000E\u001A\u00020\r2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001A\u00020\r2\n\b\u0002\u0010\u001B\u001A\u0004\u0018\u00010\u001A2\n\b\u0002\u0010\u001D\u001A\u0004\u0018\u00010\u001C2\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010\u001E2\b\b\u0002\u0010 \u001A\u00020\u000B2\n\b\u0002\u0010\"\u001A\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001A\u0004\u0018\u00010#2\n\b\u0002\u00106\u001A\u0004\u0018\u0001052\b\b\u0002\u0010&\u001A\u00020%2\b\b\u0002\u0010(\u001A\u00020\'2\b\b\u0002\u0010)\u001A\u00020\r2\n\b\u0002\u0010+\u001A\u0004\u0018\u00010*2\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010.\u001A\u0004\u0018\u00010-2\b\b\u0002\u00101\u001A\u0002002\b\b\u0002\u00103\u001A\u0002022\n\b\u0002\u00108\u001A\u0004\u0018\u000107\u00F8\u0001\u0000\u00A2\u0006\u0004\b\\\u0010]J\u001A\u0010_\u001A\u00020^2\b\u0010E\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b_\u0010`J\u0015\u0010a\u001A\u00020^2\u0006\u0010E\u001A\u00020\u0000\u00A2\u0006\u0004\ba\u0010bJ\u0015\u0010c\u001A\u00020^2\u0006\u0010E\u001A\u00020\u0000\u00A2\u0006\u0004\bc\u0010bJ\u000F\u0010e\u001A\u00020dH\u0016\u00A2\u0006\u0004\be\u0010fJ\u000F\u0010h\u001A\u00020dH\u0000\u00A2\u0006\u0004\bg\u0010fJ\u000F\u0010i\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\bi\u0010jR\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bk\u0010l\u001A\u0004\bm\u0010BR\u001A\u0010\u0005\u001A\u00020\u00048\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bn\u0010o\u001A\u0004\bp\u0010DR\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0006\u00A2\u0006\f\n\u0004\bq\u0010r\u001A\u0004\bs\u0010tR\u0013\u0010<\u001A\u0004\u0018\u00010;8F\u00A2\u0006\u0006\u001A\u0004\bu\u0010vR\u0017\u0010\f\u001A\u00020\u000B8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bw\u0010xR\u0011\u0010>\u001A\u00020=8F\u00A2\u0006\u0006\u001A\u0004\by\u0010zR\u0017\u0010\u000E\u001A\u00020\r8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\b{\u0010xR\u0013\u0010\u0010\u001A\u0004\u0018\u00010\u000F8F\u00A2\u0006\u0006\u001A\u0004\b|\u0010}R\u0019\u0010\u0012\u001A\u0004\u0018\u00010\u00118F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\b~\u0010\u007FR\u001B\u0010\u0014\u001A\u0004\u0018\u00010\u00138F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\b\u001A\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0015\u0010\u0016\u001A\u0004\u0018\u00010\u00158F\u00A2\u0006\b\u001A\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0014\u0010\u0018\u001A\u0004\u0018\u00010\u00178F\u00A2\u0006\u0007\u001A\u0005\b\u0084\u0001\u0010jR\u0018\u0010\u0019\u001A\u00020\r8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0007\u001A\u0005\b\u0085\u0001\u0010xR\u001B\u0010\u001B\u001A\u0004\u0018\u00010\u001A8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\b\u001A\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0015\u0010\u001D\u001A\u0004\u0018\u00010\u001C8F\u00A2\u0006\b\u001A\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0015\u0010\u001F\u001A\u0004\u0018\u00010\u001E8F\u00A2\u0006\b\u001A\u0006\b\u008A\u0001\u0010\u008B\u0001R\u0018\u0010 \u001A\u00020\u000B8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0007\u001A\u0005\b\u008C\u0001\u0010xR\u0015\u0010\"\u001A\u0004\u0018\u00010!8F\u00A2\u0006\b\u001A\u0006\b\u008D\u0001\u0010\u008E\u0001R\u0015\u0010$\u001A\u0004\u0018\u00010#8F\u00A2\u0006\b\u001A\u0006\b\u008F\u0001\u0010\u0090\u0001R\u0015\u00106\u001A\u0004\u0018\u0001058F\u00A2\u0006\b\u001A\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0018\u0010&\u001A\u00020%8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0007\u001A\u0005\b\u0093\u0001\u0010fR\'\u0010\u0098\u0001\u001A\u0004\u0018\u00010%8GX\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0010\u0012\u0006\b\u0096\u0001\u0010\u0097\u0001\u001A\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0018\u0010(\u001A\u00020\'8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0007\u001A\u0005\b\u0099\u0001\u0010fR\'\u0010\u009D\u0001\u001A\u0004\u0018\u00010\'8GX\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0010\u0012\u0006\b\u009C\u0001\u0010\u0097\u0001\u001A\u0006\b\u009A\u0001\u0010\u009B\u0001R\u0018\u0010)\u001A\u00020\r8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0007\u001A\u0005\b\u009E\u0001\u0010xR\u0015\u0010+\u001A\u0004\u0018\u00010*8F\u00A2\u0006\b\u001A\u0006\b\u009F\u0001\u0010\u00A0\u0001R\u0015\u0010.\u001A\u0004\u0018\u00010-8F\u00A2\u0006\b\u001A\u0006\b\u00A1\u0001\u0010\u00A2\u0001R\u0018\u00103\u001A\u0002028F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0007\u001A\u0005\b\u00A3\u0001\u0010fR\'\u0010\u00A7\u0001\u001A\u0004\u0018\u0001028GX\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0010\u0012\u0006\b\u00A6\u0001\u0010\u0097\u0001\u001A\u0006\b\u00A4\u0001\u0010\u00A5\u0001R\u0018\u00101\u001A\u0002008F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0007\u001A\u0005\b\u00A8\u0001\u0010fR\'\u0010\u00AC\u0001\u001A\u0004\u0018\u0001008GX\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0010\u0012\u0006\b\u00AB\u0001\u0010\u0097\u0001\u001A\u0006\b\u00A9\u0001\u0010\u00AA\u0001R\u0015\u00108\u001A\u0004\u0018\u0001078F\u00A2\u0006\b\u001A\u0006\b\u00AD\u0001\u0010\u00AE\u0001\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006\u00B0\u0001"}, d2 = {"Landroidx/compose/ui/text/TextStyle;", "", "Landroidx/compose/ui/text/SpanStyle;", "spanStyle", "Landroidx/compose/ui/text/ParagraphStyle;", "paragraphStyle", "Landroidx/compose/ui/text/PlatformTextStyle;", "platformStyle", "<init>", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/ParagraphStyle;Landroidx/compose/ui/text/PlatformTextStyle;)V", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/ParagraphStyle;)V", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/unit/TextUnit;", "fontSize", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "Landroidx/compose/ui/text/style/BaselineShift;", "baselineShift", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textGeometricTransform", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "background", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/style/TextAlign;", "textAlign", "Landroidx/compose/ui/text/style/TextDirection;", "textDirection", "lineHeight", "Landroidx/compose/ui/text/style/TextIndent;", "textIndent", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/text/style/LineHeightStyle;", "lineHeightStyle", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/text/style/LineBreak;", "lineBreak", "Landroidx/compose/ui/text/style/Hyphens;", "hyphens", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "Landroidx/compose/ui/text/style/TextMotion;", "textMotion", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/graphics/Brush;", "brush", "", "alpha", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "toSpanStyle", "()Landroidx/compose/ui/text/SpanStyle;", "toParagraphStyle", "()Landroidx/compose/ui/text/ParagraphStyle;", "other", "merge", "(Landroidx/compose/ui/text/TextStyle;)Landroidx/compose/ui/text/TextStyle;", "merge-dA7vx0o", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "merge-Z1GrekI", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "(Landroidx/compose/ui/text/SpanStyle;)Landroidx/compose/ui/text/TextStyle;", "(Landroidx/compose/ui/text/ParagraphStyle;)Landroidx/compose/ui/text/TextStyle;", "plus", "copy-HL5avdY", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;)Landroidx/compose/ui/text/TextStyle;", "copy", "copy-NOaFTUo", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;)Landroidx/compose/ui/text/TextStyle;", "copy-CXVQc50", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;)Landroidx/compose/ui/text/TextStyle;", "copy-v2rsoow", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "copy-p1EtxEg", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "copy-aIRg9q4", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "copy-Ns73l9s", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "", "equals", "(Ljava/lang/Object;)Z", "hasSameLayoutAffectingAttributes", "(Landroidx/compose/ui/text/TextStyle;)Z", "hasSameDrawAffectingAttributes", "", "hashCode", "()I", "hashCodeLayoutAffectingAttributes$ui_text_release", "hashCodeLayoutAffectingAttributes", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/ui/text/SpanStyle;", "getSpanStyle$ui_text_release", "b", "Landroidx/compose/ui/text/ParagraphStyle;", "getParagraphStyle$ui_text_release", "c", "Landroidx/compose/ui/text/PlatformTextStyle;", "getPlatformStyle", "()Landroidx/compose/ui/text/PlatformTextStyle;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "getColor-0d7_KjU", "()J", "getAlpha", "()F", "getFontSize-XSAIIZE", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "getFontStyle-4Lr2A7w", "()Landroidx/compose/ui/text/font/FontStyle;", "getFontSynthesis-ZQGJjVo", "()Landroidx/compose/ui/text/font/FontSynthesis;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getFontFeatureSettings", "getLetterSpacing-XSAIIZE", "getBaselineShift-5SSeXJ0", "()Landroidx/compose/ui/text/style/BaselineShift;", "getTextGeometricTransform", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "getLocaleList", "()Landroidx/compose/ui/text/intl/LocaleList;", "getBackground-0d7_KjU", "getTextDecoration", "()Landroidx/compose/ui/text/style/TextDecoration;", "getShadow", "()Landroidx/compose/ui/graphics/Shadow;", "getDrawStyle", "()Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "getTextAlign-e0LSkKk", "getTextAlign-buA522U", "()Landroidx/compose/ui/text/style/TextAlign;", "getTextAlign-buA522U$annotations", "()V", "deprecated_boxing_textAlign", "getTextDirection-s_7X-co", "getTextDirection-mmuk1to", "()Landroidx/compose/ui/text/style/TextDirection;", "getTextDirection-mmuk1to$annotations", "deprecated_boxing_textDirection", "getLineHeight-XSAIIZE", "getTextIndent", "()Landroidx/compose/ui/text/style/TextIndent;", "getLineHeightStyle", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "getHyphens-vmbZdU8", "getHyphens-EaSxIns", "()Landroidx/compose/ui/text/style/Hyphens;", "getHyphens-EaSxIns$annotations", "deprecated_boxing_hyphens", "getLineBreak-rAG3T2k", "getLineBreak-LgCVezo", "()Landroidx/compose/ui/text/style/LineBreak;", "getLineBreak-LgCVezo$annotations", "deprecated_boxing_lineBreak", "getTextMotion", "()Landroidx/compose/ui/text/style/TextMotion;", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextStyle {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/TextStyle$Companion;", "", "Landroidx/compose/ui/text/TextStyle;", "Default", "Landroidx/compose/ui/text/TextStyle;", "getDefault", "()Landroidx/compose/ui/text/TextStyle;", "getDefault$annotations", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final TextStyle getDefault() {
            return TextStyle.d;
        }

        @Stable
        public static void getDefault$annotations() {
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final SpanStyle a;
    public final ParagraphStyle b;
    public final PlatformTextStyle c;
    public static final TextStyle d;

    static {
        TextStyle.Companion = new Companion(null);
        TextStyle.d = new TextStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFF, null);
    }

    // 去混淆评级： 中等(90)
    public TextStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, DrawStyle drawStyle0, int v4, int v5, long v6, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, int v7, int v8, TextMotion textMotion0, int v9, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v9 & 1) == 0 ? v : 0L), ((v9 & 2) == 0 ? v1 : 0x7FC00000L), ((v9 & 4) == 0 ? fontWeight0 : null), ((v9 & 8) == 0 ? fontStyle0 : null), ((v9 & 16) == 0 ? fontSynthesis0 : null), ((v9 & 0x20) == 0 ? fontFamily0 : null), ((v9 & 0x40) == 0 ? s : null), ((v9 & 0x80) == 0 ? v2 : 0x7FC00000L), ((v9 & 0x100) == 0 ? baselineShift0 : null), ((v9 & 0x200) == 0 ? textGeometricTransform0 : null), ((v9 & 0x400) == 0 ? localeList0 : null), ((v9 & 0x800) == 0 ? v3 : 0L), ((v9 & 0x1000) == 0 ? textDecoration0 : null), ((v9 & 0x2000) == 0 ? shadow0 : null), ((v9 & 0x4000) == 0 ? drawStyle0 : null), ((v9 & 0x8000) == 0 ? v4 : 0x80000000), ((v9 & 0x10000) == 0 ? v5 : 0x80000000), ((v9 & 0x20000) == 0 ? v6 : 0x7FC00000L), ((v9 & 0x40000) == 0 ? textIndent0 : null), ((v9 & 0x80000) == 0 ? platformTextStyle0 : null), ((v9 & 0x100000) == 0 ? lineHeightStyle0 : null), ((v9 & 0x200000) == 0 ? v7 : 0), ((v9 & 0x400000) == 0 ? v8 : 0x80000000), ((v9 & 0x800000) == 0 ? textMotion0 : null), null);
    }

    public TextStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, DrawStyle drawStyle0, int v4, int v5, long v6, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, int v7, int v8, TextMotion textMotion0, DefaultConstructorMarker defaultConstructorMarker0) {
        PlatformParagraphStyle platformParagraphStyle0 = null;
        SpanStyle spanStyle0 = new SpanStyle(v, v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, (platformTextStyle0 == null ? null : platformTextStyle0.getSpanStyle()), drawStyle0, null);
        if(platformTextStyle0 != null) {
            platformParagraphStyle0 = platformTextStyle0.getParagraphStyle();
        }
        this(spanStyle0, new ParagraphStyle(v4, v5, v6, textIndent0, platformParagraphStyle0, lineHeightStyle0, v7, v8, textMotion0, null), platformTextStyle0);
    }

    // 去混淆评级： 中等(50)
    public TextStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, DrawStyle drawStyle0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, TextMotion textMotion0, int v5, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v5 & 1) == 0 ? v : 0L), ((v5 & 2) == 0 ? v1 : 0x7FC00000L), ((v5 & 4) == 0 ? fontWeight0 : null), ((v5 & 8) == 0 ? fontStyle0 : null), ((v5 & 16) == 0 ? fontSynthesis0 : null), ((v5 & 0x20) == 0 ? fontFamily0 : null), ((v5 & 0x40) == 0 ? s : null), ((v5 & 0x80) == 0 ? v2 : 0x7FC00000L), ((v5 & 0x100) == 0 ? baselineShift0 : null), ((v5 & 0x200) == 0 ? textGeometricTransform0 : null), ((v5 & 0x400) == 0 ? localeList0 : null), ((v5 & 0x800) == 0 ? v3 : 0L), ((v5 & 0x1000) == 0 ? textDecoration0 : null), ((v5 & 0x2000) == 0 ? shadow0 : null), ((v5 & 0x4000) == 0 ? drawStyle0 : null), ((v5 & 0x8000) == 0 ? textAlign0 : null), ((v5 & 0x10000) == 0 ? textDirection0 : null), ((v5 & 0x20000) == 0 ? v4 : 0x7FC00000L), ((v5 & 0x40000) == 0 ? textIndent0 : null), ((v5 & 0x80000) == 0 ? platformTextStyle0 : null), ((v5 & 0x100000) == 0 ? lineHeightStyle0 : null), ((v5 & 0x200000) == 0 ? lineBreak0 : null), ((v5 & 0x400000) == 0 ? hyphens0 : null), ((v5 & 0x800000) == 0 ? textMotion0 : null), null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "TextStyle constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public TextStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, DrawStyle drawStyle0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, TextMotion textMotion0, DefaultConstructorMarker defaultConstructorMarker0) {
        PlatformParagraphStyle platformParagraphStyle0 = null;
        SpanStyle spanStyle0 = new SpanStyle(v, v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, (platformTextStyle0 == null ? null : platformTextStyle0.getSpanStyle()), drawStyle0, null);
        int v5 = textAlign0 == null ? 0x80000000 : textAlign0.unbox-impl();
        int v6 = textDirection0 == null ? 0x80000000 : textDirection0.unbox-impl();
        if(platformTextStyle0 != null) {
            platformParagraphStyle0 = platformTextStyle0.getParagraphStyle();
        }
        this(spanStyle0, new ParagraphStyle(v5, v6, v4, textIndent0, platformParagraphStyle0, lineHeightStyle0, (lineBreak0 == null ? 0 : lineBreak0.unbox-impl()), (hyphens0 == null ? 0x80000000 : hyphens0.unbox-impl()), textMotion0, null), platformTextStyle0);
    }

    // 去混淆评级： 中等(50)
    public TextStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, int v5, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v5 & 1) == 0 ? v : 0L), ((v5 & 2) == 0 ? v1 : 0x7FC00000L), ((v5 & 4) == 0 ? fontWeight0 : null), ((v5 & 8) == 0 ? fontStyle0 : null), ((v5 & 16) == 0 ? fontSynthesis0 : null), ((v5 & 0x20) == 0 ? fontFamily0 : null), ((v5 & 0x40) == 0 ? s : null), ((v5 & 0x80) == 0 ? v2 : 0x7FC00000L), ((v5 & 0x100) == 0 ? baselineShift0 : null), ((v5 & 0x200) == 0 ? textGeometricTransform0 : null), ((v5 & 0x400) == 0 ? localeList0 : null), ((v5 & 0x800) == 0 ? v3 : 0L), ((v5 & 0x1000) == 0 ? textDecoration0 : null), ((v5 & 0x2000) == 0 ? shadow0 : null), ((v5 & 0x4000) == 0 ? textAlign0 : null), ((v5 & 0x8000) == 0 ? textDirection0 : null), ((v5 & 0x10000) == 0 ? v4 : 0x7FC00000L), ((v5 & 0x20000) == 0 ? textIndent0 : null), null);
    }

    // 去混淆评级： 中等(50)
    public TextStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, int v5, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v5 & 1) == 0 ? v : 0L), ((v5 & 2) == 0 ? v1 : 0x7FC00000L), ((v5 & 4) == 0 ? fontWeight0 : null), ((v5 & 8) == 0 ? fontStyle0 : null), ((v5 & 16) == 0 ? fontSynthesis0 : null), ((v5 & 0x20) == 0 ? fontFamily0 : null), ((v5 & 0x40) == 0 ? s : null), ((v5 & 0x80) == 0 ? v2 : 0x7FC00000L), ((v5 & 0x100) == 0 ? baselineShift0 : null), ((v5 & 0x200) == 0 ? textGeometricTransform0 : null), ((v5 & 0x400) == 0 ? localeList0 : null), ((v5 & 0x800) == 0 ? v3 : 0L), ((v5 & 0x1000) == 0 ? textDecoration0 : null), ((v5 & 0x2000) == 0 ? shadow0 : null), ((v5 & 0x4000) == 0 ? textAlign0 : null), ((v5 & 0x8000) == 0 ? textDirection0 : null), ((v5 & 0x10000) == 0 ? v4 : 0x7FC00000L), ((v5 & 0x20000) == 0 ? textIndent0 : null), ((v5 & 0x40000) == 0 ? platformTextStyle0 : null), ((v5 & 0x80000) == 0 ? lineHeightStyle0 : null), null);
    }

    // 去混淆评级： 中等(50)
    public TextStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, int v5, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v5 & 1) == 0 ? v : 0L), ((v5 & 2) == 0 ? v1 : 0x7FC00000L), ((v5 & 4) == 0 ? fontWeight0 : null), ((v5 & 8) == 0 ? fontStyle0 : null), ((v5 & 16) == 0 ? fontSynthesis0 : null), ((v5 & 0x20) == 0 ? fontFamily0 : null), ((v5 & 0x40) == 0 ? s : null), ((v5 & 0x80) == 0 ? v2 : 0x7FC00000L), ((v5 & 0x100) == 0 ? baselineShift0 : null), ((v5 & 0x200) == 0 ? textGeometricTransform0 : null), ((v5 & 0x400) == 0 ? localeList0 : null), ((v5 & 0x800) == 0 ? v3 : 0L), ((v5 & 0x1000) == 0 ? textDecoration0 : null), ((v5 & 0x2000) == 0 ? shadow0 : null), ((v5 & 0x4000) == 0 ? textAlign0 : null), ((v5 & 0x8000) == 0 ? textDirection0 : null), ((v5 & 0x10000) == 0 ? v4 : 0x7FC00000L), ((v5 & 0x20000) == 0 ? textIndent0 : null), ((v5 & 0x40000) == 0 ? platformTextStyle0 : null), ((v5 & 0x80000) == 0 ? lineHeightStyle0 : null), ((v5 & 0x100000) == 0 ? lineBreak0 : null), ((v5 & 0x200000) == 0 ? hyphens0 : null), null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "TextStyle constructors that do not take new stable parameters like TextMotion are deprecated. Please use the new stable constructor.")
    public TextStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, DefaultConstructorMarker defaultConstructorMarker0) {
        PlatformParagraphStyle platformParagraphStyle0 = null;
        SpanStyle spanStyle0 = new SpanStyle(v, v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, (platformTextStyle0 == null ? null : platformTextStyle0.getSpanStyle()), null, 0x8000, null);
        int v5 = textAlign0 == null ? 0x80000000 : textAlign0.unbox-impl();
        int v6 = textDirection0 == null ? 0x80000000 : textDirection0.unbox-impl();
        if(platformTextStyle0 != null) {
            platformParagraphStyle0 = platformTextStyle0.getParagraphStyle();
        }
        this(spanStyle0, new ParagraphStyle(v5, v6, v4, textIndent0, platformParagraphStyle0, lineHeightStyle0, (lineBreak0 == null ? 0 : lineBreak0.unbox-impl()), (hyphens0 == null ? 0x80000000 : hyphens0.unbox-impl()), null, 0x100, null), platformTextStyle0);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "TextStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public TextStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, DefaultConstructorMarker defaultConstructorMarker0) {
        PlatformParagraphStyle platformParagraphStyle0 = null;
        SpanStyle spanStyle0 = new SpanStyle(v, v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, (platformTextStyle0 == null ? null : platformTextStyle0.getSpanStyle()), null, null);
        int v5 = textAlign0 == null ? 0x80000000 : textAlign0.unbox-impl();
        int v6 = textDirection0 == null ? 0x80000000 : textDirection0.unbox-impl();
        if(platformTextStyle0 != null) {
            platformParagraphStyle0 = platformTextStyle0.getParagraphStyle();
        }
        this(spanStyle0, new ParagraphStyle(v5, v6, v4, textIndent0, platformParagraphStyle0, lineHeightStyle0, 0, 0x80000000, null, null), platformTextStyle0);
    }

    // 去混淆评级： 低(40)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "TextStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public TextStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, DefaultConstructorMarker defaultConstructorMarker0) {
        this(new SpanStyle(v, v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, null, null, null), new ParagraphStyle((textAlign0 == null ? 0x80000000 : textAlign0.unbox-impl()), (textDirection0 == null ? 0x80000000 : textDirection0.unbox-impl()), v4, textIndent0, null, null, 0, 0x80000000, null, null), null);
    }

    // 去混淆评级： 中等(80)
    public TextStyle(Brush brush0, float f, long v, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v1, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v2, TextDecoration textDecoration0, Shadow shadow0, DrawStyle drawStyle0, int v3, int v4, long v5, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, int v6, int v7, TextMotion textMotion0, int v8, DefaultConstructorMarker defaultConstructorMarker0) {
        this(brush0, ((v8 & 2) == 0 ? f : NaNf), ((v8 & 4) == 0 ? v : 0x7FC00000L), ((v8 & 8) == 0 ? fontWeight0 : null), ((v8 & 16) == 0 ? fontStyle0 : null), ((v8 & 0x20) == 0 ? fontSynthesis0 : null), ((v8 & 0x40) == 0 ? fontFamily0 : null), ((v8 & 0x80) == 0 ? s : null), ((v8 & 0x100) == 0 ? v1 : 0x7FC00000L), ((v8 & 0x200) == 0 ? baselineShift0 : null), ((v8 & 0x400) == 0 ? textGeometricTransform0 : null), ((v8 & 0x800) == 0 ? localeList0 : null), ((v8 & 0x1000) == 0 ? v2 : 0L), ((v8 & 0x2000) == 0 ? textDecoration0 : null), ((v8 & 0x4000) == 0 ? shadow0 : null), ((0x8000 & v8) == 0 ? drawStyle0 : null), ((0x10000 & v8) == 0 ? v3 : 0x80000000), ((0x20000 & v8) == 0 ? v4 : 0x80000000), ((0x40000 & v8) == 0 ? v5 : 0x7FC00000L), ((0x80000 & v8) == 0 ? textIndent0 : null), ((0x100000 & v8) == 0 ? platformTextStyle0 : null), ((0x200000 & v8) == 0 ? lineHeightStyle0 : null), ((0x400000 & v8) == 0 ? v6 : 0), ((0x800000 & v8) == 0 ? v7 : 0x80000000), ((v8 & 0x1000000) == 0 ? textMotion0 : null), null);
    }

    public TextStyle(Brush brush0, float f, long v, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v1, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v2, TextDecoration textDecoration0, Shadow shadow0, DrawStyle drawStyle0, int v3, int v4, long v5, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, int v6, int v7, TextMotion textMotion0, DefaultConstructorMarker defaultConstructorMarker0) {
        PlatformParagraphStyle platformParagraphStyle0 = null;
        SpanStyle spanStyle0 = new SpanStyle(brush0, f, v, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v1, baselineShift0, textGeometricTransform0, localeList0, v2, textDecoration0, shadow0, (platformTextStyle0 == null ? null : platformTextStyle0.getSpanStyle()), drawStyle0, null);
        if(platformTextStyle0 != null) {
            platformParagraphStyle0 = platformTextStyle0.getParagraphStyle();
        }
        this(spanStyle0, new ParagraphStyle(v3, v4, v5, textIndent0, platformParagraphStyle0, lineHeightStyle0, v6, v7, textMotion0, null), platformTextStyle0);
    }

    // 去混淆评级： 低(40)
    public TextStyle(Brush brush0, float f, long v, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v1, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v2, TextDecoration textDecoration0, Shadow shadow0, DrawStyle drawStyle0, TextAlign textAlign0, TextDirection textDirection0, long v3, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, TextMotion textMotion0, int v4, DefaultConstructorMarker defaultConstructorMarker0) {
        this(brush0, ((v4 & 2) == 0 ? f : NaNf), ((v4 & 4) == 0 ? v : 0x7FC00000L), ((v4 & 8) == 0 ? fontWeight0 : null), ((v4 & 16) == 0 ? fontStyle0 : null), ((v4 & 0x20) == 0 ? fontSynthesis0 : null), ((v4 & 0x40) == 0 ? fontFamily0 : null), ((v4 & 0x80) == 0 ? s : null), ((v4 & 0x100) == 0 ? v1 : 0x7FC00000L), ((v4 & 0x200) == 0 ? baselineShift0 : null), ((v4 & 0x400) == 0 ? textGeometricTransform0 : null), ((v4 & 0x800) == 0 ? localeList0 : null), ((v4 & 0x1000) == 0 ? v2 : 0L), ((v4 & 0x2000) == 0 ? textDecoration0 : null), ((v4 & 0x4000) == 0 ? shadow0 : null), ((0x8000 & v4) == 0 ? drawStyle0 : null), ((0x10000 & v4) == 0 ? textAlign0 : null), ((0x20000 & v4) == 0 ? textDirection0 : null), ((0x40000 & v4) == 0 ? v3 : 0x7FC00000L), ((0x80000 & v4) == 0 ? textIndent0 : null), ((0x100000 & v4) == 0 ? platformTextStyle0 : null), ((0x200000 & v4) == 0 ? lineHeightStyle0 : null), ((0x400000 & v4) == 0 ? lineBreak0 : null), ((0x800000 & v4) == 0 ? hyphens0 : null), ((v4 & 0x1000000) == 0 ? textMotion0 : null), null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "TextStyle constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public TextStyle(Brush brush0, float f, long v, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v1, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v2, TextDecoration textDecoration0, Shadow shadow0, DrawStyle drawStyle0, TextAlign textAlign0, TextDirection textDirection0, long v3, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, TextMotion textMotion0, DefaultConstructorMarker defaultConstructorMarker0) {
        PlatformParagraphStyle platformParagraphStyle0 = null;
        SpanStyle spanStyle0 = new SpanStyle(brush0, f, v, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v1, baselineShift0, textGeometricTransform0, localeList0, v2, textDecoration0, shadow0, (platformTextStyle0 == null ? null : platformTextStyle0.getSpanStyle()), drawStyle0, null);
        int v4 = textAlign0 == null ? 0x80000000 : textAlign0.unbox-impl();
        int v5 = textDirection0 == null ? 0x80000000 : textDirection0.unbox-impl();
        if(platformTextStyle0 != null) {
            platformParagraphStyle0 = platformTextStyle0.getParagraphStyle();
        }
        this(spanStyle0, new ParagraphStyle(v4, v5, v3, textIndent0, platformParagraphStyle0, lineHeightStyle0, (lineBreak0 == null ? 0 : lineBreak0.unbox-impl()), (hyphens0 == null ? 0x80000000 : hyphens0.unbox-impl()), textMotion0, null), platformTextStyle0);
    }

    public TextStyle(@NotNull SpanStyle spanStyle0, @NotNull ParagraphStyle paragraphStyle0) {
        this(spanStyle0, paragraphStyle0, TextStyleKt.access$createPlatformTextStyleInternal(spanStyle0.getPlatformStyle(), paragraphStyle0.getPlatformStyle()));
    }

    public TextStyle(@NotNull SpanStyle spanStyle0, @NotNull ParagraphStyle paragraphStyle0, @Nullable PlatformTextStyle platformTextStyle0) {
        this.a = spanStyle0;
        this.b = paragraphStyle0;
        this.c = platformTextStyle0;
    }

    public TextStyle(SpanStyle spanStyle0, ParagraphStyle paragraphStyle0, PlatformTextStyle platformTextStyle0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            platformTextStyle0 = null;
        }
        this(spanStyle0, paragraphStyle0, platformTextStyle0);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "TextStyle copy constructors that do not take new stable parameters like LineBreak, Hyphens, and TextMotion are deprecated. Please use the new stable copy constructor.")
    public final TextStyle copy-CXVQc50(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0) {
        PlatformParagraphStyle platformParagraphStyle0 = null;
        SpanStyle spanStyle0 = new SpanStyle((Color.equals-impl0(v, this.a.getColor-0d7_KjU()) ? this.a.getTextForegroundStyle$ui_text_release() : TextForegroundStyle.Companion.from-8_81llA(v)), v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, (platformTextStyle0 == null ? null : platformTextStyle0.getSpanStyle()), this.getDrawStyle(), null);
        int v5 = textAlign0 == null ? 0x80000000 : textAlign0.unbox-impl();
        int v6 = textDirection0 == null ? 0x80000000 : textDirection0.unbox-impl();
        if(platformTextStyle0 != null) {
            platformParagraphStyle0 = platformTextStyle0.getParagraphStyle();
        }
        int v7 = lineBreak0 == null ? 0 : lineBreak0.unbox-impl();
        return hyphens0 == null ? new TextStyle(spanStyle0, new ParagraphStyle(v5, v6, v4, textIndent0, platformParagraphStyle0, lineHeightStyle0, v7, 0x80000000, this.getTextMotion(), null), platformTextStyle0) : new TextStyle(spanStyle0, new ParagraphStyle(v5, v6, v4, textIndent0, platformParagraphStyle0, lineHeightStyle0, v7, hyphens0.unbox-impl(), this.getTextMotion(), null), platformTextStyle0);
    }

    public static TextStyle copy-CXVQc50$default(TextStyle textStyle0, long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, int v5, Object object0) {
        long v6 = (v5 & 1) == 0 ? v : textStyle0.a.getColor-0d7_KjU();
        long v7 = (v5 & 2) == 0 ? v1 : textStyle0.a.getFontSize-XSAIIZE();
        FontWeight fontWeight1 = (v5 & 4) == 0 ? fontWeight0 : textStyle0.a.getFontWeight();
        FontStyle fontStyle1 = (v5 & 8) == 0 ? fontStyle0 : textStyle0.a.getFontStyle-4Lr2A7w();
        FontSynthesis fontSynthesis1 = (v5 & 16) == 0 ? fontSynthesis0 : textStyle0.a.getFontSynthesis-ZQGJjVo();
        FontFamily fontFamily1 = (v5 & 0x20) == 0 ? fontFamily0 : textStyle0.a.getFontFamily();
        String s1 = (v5 & 0x40) == 0 ? s : textStyle0.a.getFontFeatureSettings();
        long v8 = (v5 & 0x80) == 0 ? v2 : textStyle0.a.getLetterSpacing-XSAIIZE();
        BaselineShift baselineShift1 = (v5 & 0x100) == 0 ? baselineShift0 : textStyle0.a.getBaselineShift-5SSeXJ0();
        TextGeometricTransform textGeometricTransform1 = (v5 & 0x200) == 0 ? textGeometricTransform0 : textStyle0.a.getTextGeometricTransform();
        LocaleList localeList1 = (v5 & 0x400) == 0 ? localeList0 : textStyle0.a.getLocaleList();
        long v9 = (v5 & 0x800) == 0 ? v3 : textStyle0.a.getBackground-0d7_KjU();
        TextDecoration textDecoration1 = (v5 & 0x1000) == 0 ? textDecoration0 : textStyle0.a.getTextDecoration();
        Shadow shadow1 = (v5 & 0x2000) == 0 ? shadow0 : textStyle0.a.getShadow();
        TextAlign textAlign1 = (v5 & 0x4000) == 0 ? textAlign0 : TextAlign.box-impl(textStyle0.b.getTextAlign-e0LSkKk());
        TextDirection textDirection1 = (v5 & 0x8000) == 0 ? textDirection0 : TextDirection.box-impl(textStyle0.b.getTextDirection-s_7X-co());
        long v10 = (v5 & 0x10000) == 0 ? v4 : textStyle0.b.getLineHeight-XSAIIZE();
        TextIndent textIndent1 = (v5 & 0x20000) == 0 ? textIndent0 : textStyle0.b.getTextIndent();
        PlatformTextStyle platformTextStyle1 = (v5 & 0x40000) == 0 ? platformTextStyle0 : textStyle0.c;
        LineHeightStyle lineHeightStyle1 = (v5 & 0x80000) == 0 ? lineHeightStyle0 : textStyle0.b.getLineHeightStyle();
        LineBreak lineBreak1 = (v5 & 0x100000) == 0 ? lineBreak0 : LineBreak.box-impl(textStyle0.b.getLineBreak-rAG3T2k());
        return (v5 & 0x200000) == 0 ? textStyle0.copy-CXVQc50(v6, v7, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v8, baselineShift1, textGeometricTransform1, localeList1, v9, textDecoration1, shadow1, textAlign1, textDirection1, v10, textIndent1, platformTextStyle1, lineHeightStyle1, lineBreak1, hyphens0) : textStyle0.copy-CXVQc50(v6, v7, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v8, baselineShift1, textGeometricTransform1, localeList1, v9, textDecoration1, shadow1, textAlign1, textDirection1, v10, textIndent1, platformTextStyle1, lineHeightStyle1, lineBreak1, Hyphens.box-impl(textStyle0.b.getHyphens-vmbZdU8()));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "TextStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    public final TextStyle copy-HL5avdY(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0) {
        SpanStyle spanStyle0 = new SpanStyle((Color.equals-impl0(v, this.a.getColor-0d7_KjU()) ? this.a.getTextForegroundStyle$ui_text_release() : TextForegroundStyle.Companion.from-8_81llA(v)), v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, this.a.getPlatformStyle(), this.a.getDrawStyle(), null);
        LineHeightStyle lineHeightStyle0 = this.getLineHeightStyle();
        int v5 = this.getLineBreak-rAG3T2k();
        int v6 = this.getHyphens-vmbZdU8();
        TextMotion textMotion0 = this.getTextMotion();
        return new TextStyle(spanStyle0, new ParagraphStyle((textAlign0 == null ? 0x80000000 : textAlign0.unbox-impl()), (textDirection0 == null ? 0x80000000 : textDirection0.unbox-impl()), v4, textIndent0, this.b.getPlatformStyle(), lineHeightStyle0, v5, v6, textMotion0, null), this.c);
    }

    public static TextStyle copy-HL5avdY$default(TextStyle textStyle0, long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, int v5, Object object0) {
        long v6 = (v5 & 1) == 0 ? v : textStyle0.a.getColor-0d7_KjU();
        long v7 = (v5 & 2) == 0 ? v1 : textStyle0.a.getFontSize-XSAIIZE();
        FontWeight fontWeight1 = (v5 & 4) == 0 ? fontWeight0 : textStyle0.a.getFontWeight();
        FontStyle fontStyle1 = (v5 & 8) == 0 ? fontStyle0 : textStyle0.a.getFontStyle-4Lr2A7w();
        FontSynthesis fontSynthesis1 = (v5 & 16) == 0 ? fontSynthesis0 : textStyle0.a.getFontSynthesis-ZQGJjVo();
        FontFamily fontFamily1 = (v5 & 0x20) == 0 ? fontFamily0 : textStyle0.a.getFontFamily();
        String s1 = (v5 & 0x40) == 0 ? s : textStyle0.a.getFontFeatureSettings();
        long v8 = (v5 & 0x80) == 0 ? v2 : textStyle0.a.getLetterSpacing-XSAIIZE();
        BaselineShift baselineShift1 = (v5 & 0x100) == 0 ? baselineShift0 : textStyle0.a.getBaselineShift-5SSeXJ0();
        TextGeometricTransform textGeometricTransform1 = (v5 & 0x200) == 0 ? textGeometricTransform0 : textStyle0.a.getTextGeometricTransform();
        LocaleList localeList1 = (v5 & 0x400) == 0 ? localeList0 : textStyle0.a.getLocaleList();
        long v9 = (v5 & 0x800) == 0 ? v3 : textStyle0.a.getBackground-0d7_KjU();
        TextDecoration textDecoration1 = (v5 & 0x1000) == 0 ? textDecoration0 : textStyle0.a.getTextDecoration();
        Shadow shadow1 = (v5 & 0x2000) == 0 ? shadow0 : textStyle0.a.getShadow();
        TextAlign textAlign1 = (v5 & 0x4000) == 0 ? textAlign0 : TextAlign.box-impl(textStyle0.b.getTextAlign-e0LSkKk());
        TextDirection textDirection1 = (v5 & 0x8000) == 0 ? textDirection0 : TextDirection.box-impl(textStyle0.b.getTextDirection-s_7X-co());
        long v10 = (v5 & 0x10000) == 0 ? v4 : textStyle0.b.getLineHeight-XSAIIZE();
        return (v5 & 0x20000) == 0 ? textStyle0.copy-HL5avdY(v6, v7, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v8, baselineShift1, textGeometricTransform1, localeList1, v9, textDecoration1, shadow1, textAlign1, textDirection1, v10, textIndent0) : textStyle0.copy-HL5avdY(v6, v7, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v8, baselineShift1, textGeometricTransform1, localeList1, v9, textDecoration1, shadow1, textAlign1, textDirection1, v10, textStyle0.b.getTextIndent());
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "TextStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    public final TextStyle copy-NOaFTUo(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0) {
        PlatformParagraphStyle platformParagraphStyle0 = null;
        SpanStyle spanStyle0 = new SpanStyle((Color.equals-impl0(v, this.a.getColor-0d7_KjU()) ? this.a.getTextForegroundStyle$ui_text_release() : TextForegroundStyle.Companion.from-8_81llA(v)), v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, (platformTextStyle0 == null ? null : platformTextStyle0.getSpanStyle()), this.a.getDrawStyle(), null);
        int v5 = textAlign0 == null ? 0x80000000 : textAlign0.unbox-impl();
        int v6 = textDirection0 == null ? 0x80000000 : textDirection0.unbox-impl();
        if(platformTextStyle0 != null) {
            platformParagraphStyle0 = platformTextStyle0.getParagraphStyle();
        }
        return new TextStyle(spanStyle0, new ParagraphStyle(v5, v6, v4, textIndent0, platformParagraphStyle0, lineHeightStyle0, this.getLineBreak-rAG3T2k(), this.getHyphens-vmbZdU8(), this.getTextMotion(), null), platformTextStyle0);
    }

    public static TextStyle copy-NOaFTUo$default(TextStyle textStyle0, long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, int v5, Object object0) {
        long v6 = (v5 & 1) == 0 ? v : textStyle0.a.getColor-0d7_KjU();
        long v7 = (v5 & 2) == 0 ? v1 : textStyle0.a.getFontSize-XSAIIZE();
        FontWeight fontWeight1 = (v5 & 4) == 0 ? fontWeight0 : textStyle0.a.getFontWeight();
        FontStyle fontStyle1 = (v5 & 8) == 0 ? fontStyle0 : textStyle0.a.getFontStyle-4Lr2A7w();
        FontSynthesis fontSynthesis1 = (v5 & 16) == 0 ? fontSynthesis0 : textStyle0.a.getFontSynthesis-ZQGJjVo();
        FontFamily fontFamily1 = (v5 & 0x20) == 0 ? fontFamily0 : textStyle0.a.getFontFamily();
        String s1 = (v5 & 0x40) == 0 ? s : textStyle0.a.getFontFeatureSettings();
        long v8 = (v5 & 0x80) == 0 ? v2 : textStyle0.a.getLetterSpacing-XSAIIZE();
        BaselineShift baselineShift1 = (v5 & 0x100) == 0 ? baselineShift0 : textStyle0.a.getBaselineShift-5SSeXJ0();
        TextGeometricTransform textGeometricTransform1 = (v5 & 0x200) == 0 ? textGeometricTransform0 : textStyle0.a.getTextGeometricTransform();
        LocaleList localeList1 = (v5 & 0x400) == 0 ? localeList0 : textStyle0.a.getLocaleList();
        long v9 = (v5 & 0x800) == 0 ? v3 : textStyle0.a.getBackground-0d7_KjU();
        TextDecoration textDecoration1 = (v5 & 0x1000) == 0 ? textDecoration0 : textStyle0.a.getTextDecoration();
        Shadow shadow1 = (v5 & 0x2000) == 0 ? shadow0 : textStyle0.a.getShadow();
        TextAlign textAlign1 = (v5 & 0x4000) == 0 ? textAlign0 : TextAlign.box-impl(textStyle0.b.getTextAlign-e0LSkKk());
        TextDirection textDirection1 = (v5 & 0x8000) == 0 ? textDirection0 : TextDirection.box-impl(textStyle0.b.getTextDirection-s_7X-co());
        long v10 = (v5 & 0x10000) == 0 ? v4 : textStyle0.b.getLineHeight-XSAIIZE();
        TextIndent textIndent1 = (v5 & 0x20000) == 0 ? textIndent0 : textStyle0.b.getTextIndent();
        PlatformTextStyle platformTextStyle1 = (v5 & 0x40000) == 0 ? platformTextStyle0 : textStyle0.c;
        return (v5 & 0x80000) == 0 ? textStyle0.copy-NOaFTUo(v6, v7, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v8, baselineShift1, textGeometricTransform1, localeList1, v9, textDecoration1, shadow1, textAlign1, textDirection1, v10, textIndent1, platformTextStyle1, lineHeightStyle0) : textStyle0.copy-NOaFTUo(v6, v7, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v8, baselineShift1, textGeometricTransform1, localeList1, v9, textDecoration1, shadow1, textAlign1, textDirection1, v10, textIndent1, platformTextStyle1, textStyle0.b.getLineHeightStyle());
    }

    @NotNull
    public final TextStyle copy-Ns73l9s(@Nullable Brush brush0, float f, long v, @Nullable FontWeight fontWeight0, @Nullable FontStyle fontStyle0, @Nullable FontSynthesis fontSynthesis0, @Nullable FontFamily fontFamily0, @Nullable String s, long v1, @Nullable BaselineShift baselineShift0, @Nullable TextGeometricTransform textGeometricTransform0, @Nullable LocaleList localeList0, long v2, @Nullable TextDecoration textDecoration0, @Nullable Shadow shadow0, @Nullable DrawStyle drawStyle0, int v3, int v4, long v5, @Nullable TextIndent textIndent0, @Nullable PlatformTextStyle platformTextStyle0, @Nullable LineHeightStyle lineHeightStyle0, int v6, int v7, @Nullable TextMotion textMotion0) {
        PlatformParagraphStyle platformParagraphStyle0 = null;
        SpanStyle spanStyle0 = new SpanStyle(brush0, f, v, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v1, baselineShift0, textGeometricTransform0, localeList0, v2, textDecoration0, shadow0, (platformTextStyle0 == null ? null : platformTextStyle0.getSpanStyle()), drawStyle0, null);
        if(platformTextStyle0 != null) {
            platformParagraphStyle0 = platformTextStyle0.getParagraphStyle();
        }
        return new TextStyle(spanStyle0, new ParagraphStyle(v3, v4, v5, textIndent0, platformParagraphStyle0, lineHeightStyle0, v6, v7, textMotion0, null), platformTextStyle0);
    }

    public static TextStyle copy-Ns73l9s$default(TextStyle textStyle0, Brush brush0, float f, long v, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v1, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v2, TextDecoration textDecoration0, Shadow shadow0, DrawStyle drawStyle0, int v3, int v4, long v5, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, int v6, int v7, TextMotion textMotion0, int v8, Object object0) {
        float f1 = (v8 & 2) == 0 ? f : textStyle0.a.getAlpha();
        long v9 = (v8 & 4) == 0 ? v : textStyle0.a.getFontSize-XSAIIZE();
        FontWeight fontWeight1 = (v8 & 8) == 0 ? fontWeight0 : textStyle0.a.getFontWeight();
        FontStyle fontStyle1 = (v8 & 16) == 0 ? fontStyle0 : textStyle0.a.getFontStyle-4Lr2A7w();
        FontSynthesis fontSynthesis1 = (v8 & 0x20) == 0 ? fontSynthesis0 : textStyle0.a.getFontSynthesis-ZQGJjVo();
        FontFamily fontFamily1 = (v8 & 0x40) == 0 ? fontFamily0 : textStyle0.a.getFontFamily();
        String s1 = (v8 & 0x80) == 0 ? s : textStyle0.a.getFontFeatureSettings();
        long v10 = (v8 & 0x100) == 0 ? v1 : textStyle0.a.getLetterSpacing-XSAIIZE();
        BaselineShift baselineShift1 = (v8 & 0x200) == 0 ? baselineShift0 : textStyle0.a.getBaselineShift-5SSeXJ0();
        TextGeometricTransform textGeometricTransform1 = (v8 & 0x400) == 0 ? textGeometricTransform0 : textStyle0.a.getTextGeometricTransform();
        LocaleList localeList1 = (v8 & 0x800) == 0 ? localeList0 : textStyle0.a.getLocaleList();
        long v11 = (v8 & 0x1000) == 0 ? v2 : textStyle0.a.getBackground-0d7_KjU();
        TextDecoration textDecoration1 = (v8 & 0x2000) == 0 ? textDecoration0 : textStyle0.a.getTextDecoration();
        Shadow shadow1 = (v8 & 0x4000) == 0 ? shadow0 : textStyle0.a.getShadow();
        DrawStyle drawStyle1 = (v8 & 0x8000) == 0 ? drawStyle0 : textStyle0.a.getDrawStyle();
        int v12 = (v8 & 0x10000) == 0 ? v3 : textStyle0.b.getTextAlign-e0LSkKk();
        int v13 = (v8 & 0x20000) == 0 ? v4 : textStyle0.b.getTextDirection-s_7X-co();
        long v14 = (v8 & 0x40000) == 0 ? v5 : textStyle0.b.getLineHeight-XSAIIZE();
        TextIndent textIndent1 = (0x80000 & v8) == 0 ? textIndent0 : textStyle0.b.getTextIndent();
        PlatformTextStyle platformTextStyle1 = (v8 & 0x100000) == 0 ? platformTextStyle0 : textStyle0.c;
        LineHeightStyle lineHeightStyle1 = (v8 & 0x200000) == 0 ? lineHeightStyle0 : textStyle0.b.getLineHeightStyle();
        int v15 = (v8 & 0x400000) == 0 ? v6 : textStyle0.b.getLineBreak-rAG3T2k();
        if((v8 & 0x800000) != 0) {
            int v16 = textStyle0.b.getHyphens-vmbZdU8();
            return (v8 & 0x1000000) == 0 ? textStyle0.copy-Ns73l9s(brush0, f1, v9, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v10, baselineShift1, textGeometricTransform1, localeList1, v11, textDecoration1, shadow1, drawStyle1, v12, v13, v14, textIndent1, platformTextStyle1, lineHeightStyle1, v15, v16, textMotion0) : textStyle0.copy-Ns73l9s(brush0, f1, v9, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v10, baselineShift1, textGeometricTransform1, localeList1, v11, textDecoration1, shadow1, drawStyle1, v12, v13, v14, textIndent1, platformTextStyle1, lineHeightStyle1, v15, v16, textStyle0.b.getTextMotion());
        }
        return (v8 & 0x1000000) == 0 ? textStyle0.copy-Ns73l9s(brush0, f1, v9, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v10, baselineShift1, textGeometricTransform1, localeList1, v11, textDecoration1, shadow1, drawStyle1, v12, v13, v14, textIndent1, platformTextStyle1, lineHeightStyle1, v15, v7, textMotion0) : textStyle0.copy-Ns73l9s(brush0, f1, v9, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v10, baselineShift1, textGeometricTransform1, localeList1, v11, textDecoration1, shadow1, drawStyle1, v12, v13, v14, textIndent1, platformTextStyle1, lineHeightStyle1, v15, v7, textStyle0.b.getTextMotion());
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "copy constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public final TextStyle copy-aIRg9q4(Brush brush0, float f, long v, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v1, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v2, TextDecoration textDecoration0, Shadow shadow0, DrawStyle drawStyle0, TextAlign textAlign0, TextDirection textDirection0, long v3, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, TextMotion textMotion0) {
        PlatformParagraphStyle platformParagraphStyle0 = null;
        SpanStyle spanStyle0 = new SpanStyle(brush0, f, v, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v1, baselineShift0, textGeometricTransform0, localeList0, v2, textDecoration0, shadow0, (platformTextStyle0 == null ? null : platformTextStyle0.getSpanStyle()), drawStyle0, null);
        int v4 = textAlign0 == null ? 0x80000000 : textAlign0.unbox-impl();
        int v5 = textDirection0 == null ? 0x80000000 : textDirection0.unbox-impl();
        if(platformTextStyle0 != null) {
            platformParagraphStyle0 = platformTextStyle0.getParagraphStyle();
        }
        int v6 = lineBreak0 == null ? 0 : lineBreak0.unbox-impl();
        return hyphens0 == null ? new TextStyle(spanStyle0, new ParagraphStyle(v4, v5, v3, textIndent0, platformParagraphStyle0, lineHeightStyle0, v6, 0x80000000, textMotion0, null), platformTextStyle0) : new TextStyle(spanStyle0, new ParagraphStyle(v4, v5, v3, textIndent0, platformParagraphStyle0, lineHeightStyle0, v6, hyphens0.unbox-impl(), textMotion0, null), platformTextStyle0);
    }

    public static TextStyle copy-aIRg9q4$default(TextStyle textStyle0, Brush brush0, float f, long v, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v1, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v2, TextDecoration textDecoration0, Shadow shadow0, DrawStyle drawStyle0, TextAlign textAlign0, TextDirection textDirection0, long v3, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, TextMotion textMotion0, int v4, Object object0) {
        float f1 = (v4 & 2) == 0 ? f : textStyle0.a.getAlpha();
        long v5 = (v4 & 4) == 0 ? v : textStyle0.a.getFontSize-XSAIIZE();
        FontWeight fontWeight1 = (v4 & 8) == 0 ? fontWeight0 : textStyle0.a.getFontWeight();
        FontStyle fontStyle1 = (v4 & 16) == 0 ? fontStyle0 : textStyle0.a.getFontStyle-4Lr2A7w();
        FontSynthesis fontSynthesis1 = (v4 & 0x20) == 0 ? fontSynthesis0 : textStyle0.a.getFontSynthesis-ZQGJjVo();
        FontFamily fontFamily1 = (v4 & 0x40) == 0 ? fontFamily0 : textStyle0.a.getFontFamily();
        String s1 = (v4 & 0x80) == 0 ? s : textStyle0.a.getFontFeatureSettings();
        long v6 = (v4 & 0x100) == 0 ? v1 : textStyle0.a.getLetterSpacing-XSAIIZE();
        BaselineShift baselineShift1 = (v4 & 0x200) == 0 ? baselineShift0 : textStyle0.a.getBaselineShift-5SSeXJ0();
        TextGeometricTransform textGeometricTransform1 = (v4 & 0x400) == 0 ? textGeometricTransform0 : textStyle0.a.getTextGeometricTransform();
        LocaleList localeList1 = (v4 & 0x800) == 0 ? localeList0 : textStyle0.a.getLocaleList();
        long v7 = (v4 & 0x1000) == 0 ? v2 : textStyle0.a.getBackground-0d7_KjU();
        TextDecoration textDecoration1 = (v4 & 0x2000) == 0 ? textDecoration0 : textStyle0.a.getTextDecoration();
        Shadow shadow1 = (v4 & 0x4000) == 0 ? shadow0 : textStyle0.a.getShadow();
        DrawStyle drawStyle1 = (v4 & 0x8000) == 0 ? drawStyle0 : textStyle0.a.getDrawStyle();
        TextAlign textAlign1 = (v4 & 0x10000) == 0 ? textAlign0 : TextAlign.box-impl(textStyle0.b.getTextAlign-e0LSkKk());
        TextDirection textDirection1 = (v4 & 0x20000) == 0 ? textDirection0 : TextDirection.box-impl(textStyle0.b.getTextDirection-s_7X-co());
        long v8 = (v4 & 0x40000) == 0 ? v3 : textStyle0.b.getLineHeight-XSAIIZE();
        TextIndent textIndent1 = (0x80000 & v4) == 0 ? textIndent0 : textStyle0.b.getTextIndent();
        PlatformTextStyle platformTextStyle1 = (v4 & 0x100000) == 0 ? platformTextStyle0 : textStyle0.c;
        LineHeightStyle lineHeightStyle1 = (v4 & 0x200000) == 0 ? lineHeightStyle0 : textStyle0.b.getLineHeightStyle();
        LineBreak lineBreak1 = (v4 & 0x400000) == 0 ? lineBreak0 : LineBreak.box-impl(textStyle0.b.getLineBreak-rAG3T2k());
        if((v4 & 0x800000) != 0) {
            Hyphens hyphens1 = Hyphens.box-impl(textStyle0.b.getHyphens-vmbZdU8());
            return (v4 & 0x1000000) == 0 ? textStyle0.copy-aIRg9q4(brush0, f1, v5, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v6, baselineShift1, textGeometricTransform1, localeList1, v7, textDecoration1, shadow1, drawStyle1, textAlign1, textDirection1, v8, textIndent1, platformTextStyle1, lineHeightStyle1, lineBreak1, hyphens1, textMotion0) : textStyle0.copy-aIRg9q4(brush0, f1, v5, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v6, baselineShift1, textGeometricTransform1, localeList1, v7, textDecoration1, shadow1, drawStyle1, textAlign1, textDirection1, v8, textIndent1, platformTextStyle1, lineHeightStyle1, lineBreak1, hyphens1, textStyle0.b.getTextMotion());
        }
        return (v4 & 0x1000000) == 0 ? textStyle0.copy-aIRg9q4(brush0, f1, v5, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v6, baselineShift1, textGeometricTransform1, localeList1, v7, textDecoration1, shadow1, drawStyle1, textAlign1, textDirection1, v8, textIndent1, platformTextStyle1, lineHeightStyle1, lineBreak1, hyphens0, textMotion0) : textStyle0.copy-aIRg9q4(brush0, f1, v5, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v6, baselineShift1, textGeometricTransform1, localeList1, v7, textDecoration1, shadow1, drawStyle1, textAlign1, textDirection1, v8, textIndent1, platformTextStyle1, lineHeightStyle1, lineBreak1, hyphens0, textStyle0.b.getTextMotion());
    }

    @NotNull
    public final TextStyle copy-p1EtxEg(long v, long v1, @Nullable FontWeight fontWeight0, @Nullable FontStyle fontStyle0, @Nullable FontSynthesis fontSynthesis0, @Nullable FontFamily fontFamily0, @Nullable String s, long v2, @Nullable BaselineShift baselineShift0, @Nullable TextGeometricTransform textGeometricTransform0, @Nullable LocaleList localeList0, long v3, @Nullable TextDecoration textDecoration0, @Nullable Shadow shadow0, @Nullable DrawStyle drawStyle0, int v4, int v5, long v6, @Nullable TextIndent textIndent0, @Nullable PlatformTextStyle platformTextStyle0, @Nullable LineHeightStyle lineHeightStyle0, int v7, int v8, @Nullable TextMotion textMotion0) {
        PlatformParagraphStyle platformParagraphStyle0 = null;
        SpanStyle spanStyle0 = new SpanStyle((Color.equals-impl0(v, this.a.getColor-0d7_KjU()) ? this.a.getTextForegroundStyle$ui_text_release() : TextForegroundStyle.Companion.from-8_81llA(v)), v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, (platformTextStyle0 == null ? null : platformTextStyle0.getSpanStyle()), drawStyle0, null);
        if(platformTextStyle0 != null) {
            platformParagraphStyle0 = platformTextStyle0.getParagraphStyle();
        }
        return new TextStyle(spanStyle0, new ParagraphStyle(v4, v5, v6, textIndent0, platformParagraphStyle0, lineHeightStyle0, v7, v8, textMotion0, null), platformTextStyle0);
    }

    public static TextStyle copy-p1EtxEg$default(TextStyle textStyle0, long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, DrawStyle drawStyle0, int v4, int v5, long v6, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, int v7, int v8, TextMotion textMotion0, int v9, Object object0) {
        long v10 = (v9 & 1) == 0 ? v : textStyle0.a.getColor-0d7_KjU();
        long v11 = (v9 & 2) == 0 ? v1 : textStyle0.a.getFontSize-XSAIIZE();
        FontWeight fontWeight1 = (v9 & 4) == 0 ? fontWeight0 : textStyle0.a.getFontWeight();
        FontStyle fontStyle1 = (v9 & 8) == 0 ? fontStyle0 : textStyle0.a.getFontStyle-4Lr2A7w();
        FontSynthesis fontSynthesis1 = (v9 & 16) == 0 ? fontSynthesis0 : textStyle0.a.getFontSynthesis-ZQGJjVo();
        FontFamily fontFamily1 = (v9 & 0x20) == 0 ? fontFamily0 : textStyle0.a.getFontFamily();
        String s1 = (v9 & 0x40) == 0 ? s : textStyle0.a.getFontFeatureSettings();
        long v12 = (v9 & 0x80) == 0 ? v2 : textStyle0.a.getLetterSpacing-XSAIIZE();
        BaselineShift baselineShift1 = (v9 & 0x100) == 0 ? baselineShift0 : textStyle0.a.getBaselineShift-5SSeXJ0();
        TextGeometricTransform textGeometricTransform1 = (v9 & 0x200) == 0 ? textGeometricTransform0 : textStyle0.a.getTextGeometricTransform();
        LocaleList localeList1 = (v9 & 0x400) == 0 ? localeList0 : textStyle0.a.getLocaleList();
        long v13 = (v9 & 0x800) == 0 ? v3 : textStyle0.a.getBackground-0d7_KjU();
        TextDecoration textDecoration1 = (v9 & 0x1000) == 0 ? textDecoration0 : textStyle0.a.getTextDecoration();
        Shadow shadow1 = (v9 & 0x2000) == 0 ? shadow0 : textStyle0.a.getShadow();
        DrawStyle drawStyle1 = (v9 & 0x4000) == 0 ? drawStyle0 : textStyle0.a.getDrawStyle();
        int v14 = (v9 & 0x8000) == 0 ? v4 : textStyle0.b.getTextAlign-e0LSkKk();
        int v15 = (v9 & 0x10000) == 0 ? v5 : textStyle0.b.getTextDirection-s_7X-co();
        long v16 = (v9 & 0x20000) == 0 ? v6 : textStyle0.b.getLineHeight-XSAIIZE();
        TextIndent textIndent1 = (v9 & 0x40000) == 0 ? textIndent0 : textStyle0.b.getTextIndent();
        PlatformTextStyle platformTextStyle1 = (v9 & 0x80000) == 0 ? platformTextStyle0 : textStyle0.c;
        LineHeightStyle lineHeightStyle1 = (v9 & 0x100000) == 0 ? lineHeightStyle0 : textStyle0.b.getLineHeightStyle();
        int v17 = (v9 & 0x200000) == 0 ? v7 : textStyle0.b.getLineBreak-rAG3T2k();
        int v18 = (v9 & 0x400000) == 0 ? v8 : textStyle0.b.getHyphens-vmbZdU8();
        return (v9 & 0x800000) == 0 ? textStyle0.copy-p1EtxEg(v10, v11, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v12, baselineShift1, textGeometricTransform1, localeList1, v13, textDecoration1, shadow1, drawStyle1, v14, v15, v16, textIndent1, platformTextStyle1, lineHeightStyle1, v17, v18, textMotion0) : textStyle0.copy-p1EtxEg(v10, v11, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v12, baselineShift1, textGeometricTransform1, localeList1, v13, textDecoration1, shadow1, drawStyle1, v14, v15, v16, textIndent1, platformTextStyle1, lineHeightStyle1, v17, v18, textStyle0.b.getTextMotion());
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "copy constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public final TextStyle copy-v2rsoow(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, DrawStyle drawStyle0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, TextMotion textMotion0) {
        PlatformParagraphStyle platformParagraphStyle0 = null;
        SpanStyle spanStyle0 = new SpanStyle((Color.equals-impl0(v, this.a.getColor-0d7_KjU()) ? this.a.getTextForegroundStyle$ui_text_release() : TextForegroundStyle.Companion.from-8_81llA(v)), v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, (platformTextStyle0 == null ? null : platformTextStyle0.getSpanStyle()), drawStyle0, null);
        int v5 = textAlign0 == null ? 0x80000000 : textAlign0.unbox-impl();
        int v6 = textDirection0 == null ? 0x80000000 : textDirection0.unbox-impl();
        if(platformTextStyle0 != null) {
            platformParagraphStyle0 = platformTextStyle0.getParagraphStyle();
        }
        int v7 = lineBreak0 == null ? 0 : lineBreak0.unbox-impl();
        return hyphens0 == null ? new TextStyle(spanStyle0, new ParagraphStyle(v5, v6, v4, textIndent0, platformParagraphStyle0, lineHeightStyle0, v7, 0x80000000, textMotion0, null), platformTextStyle0) : new TextStyle(spanStyle0, new ParagraphStyle(v5, v6, v4, textIndent0, platformParagraphStyle0, lineHeightStyle0, v7, hyphens0.unbox-impl(), textMotion0, null), platformTextStyle0);
    }

    public static TextStyle copy-v2rsoow$default(TextStyle textStyle0, long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, DrawStyle drawStyle0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, PlatformTextStyle platformTextStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, TextMotion textMotion0, int v5, Object object0) {
        long v6 = (v5 & 1) == 0 ? v : textStyle0.a.getColor-0d7_KjU();
        long v7 = (v5 & 2) == 0 ? v1 : textStyle0.a.getFontSize-XSAIIZE();
        FontWeight fontWeight1 = (v5 & 4) == 0 ? fontWeight0 : textStyle0.a.getFontWeight();
        FontStyle fontStyle1 = (v5 & 8) == 0 ? fontStyle0 : textStyle0.a.getFontStyle-4Lr2A7w();
        FontSynthesis fontSynthesis1 = (v5 & 16) == 0 ? fontSynthesis0 : textStyle0.a.getFontSynthesis-ZQGJjVo();
        FontFamily fontFamily1 = (v5 & 0x20) == 0 ? fontFamily0 : textStyle0.a.getFontFamily();
        String s1 = (v5 & 0x40) == 0 ? s : textStyle0.a.getFontFeatureSettings();
        long v8 = (v5 & 0x80) == 0 ? v2 : textStyle0.a.getLetterSpacing-XSAIIZE();
        BaselineShift baselineShift1 = (v5 & 0x100) == 0 ? baselineShift0 : textStyle0.a.getBaselineShift-5SSeXJ0();
        TextGeometricTransform textGeometricTransform1 = (v5 & 0x200) == 0 ? textGeometricTransform0 : textStyle0.a.getTextGeometricTransform();
        LocaleList localeList1 = (v5 & 0x400) == 0 ? localeList0 : textStyle0.a.getLocaleList();
        long v9 = (v5 & 0x800) == 0 ? v3 : textStyle0.a.getBackground-0d7_KjU();
        TextDecoration textDecoration1 = (v5 & 0x1000) == 0 ? textDecoration0 : textStyle0.a.getTextDecoration();
        Shadow shadow1 = (v5 & 0x2000) == 0 ? shadow0 : textStyle0.a.getShadow();
        DrawStyle drawStyle1 = (v5 & 0x4000) == 0 ? drawStyle0 : textStyle0.a.getDrawStyle();
        TextAlign textAlign1 = (v5 & 0x8000) == 0 ? textAlign0 : TextAlign.box-impl(textStyle0.b.getTextAlign-e0LSkKk());
        TextDirection textDirection1 = (v5 & 0x10000) == 0 ? textDirection0 : TextDirection.box-impl(textStyle0.b.getTextDirection-s_7X-co());
        long v10 = (v5 & 0x20000) == 0 ? v4 : textStyle0.b.getLineHeight-XSAIIZE();
        TextIndent textIndent1 = (v5 & 0x40000) == 0 ? textIndent0 : textStyle0.b.getTextIndent();
        PlatformTextStyle platformTextStyle1 = (v5 & 0x80000) == 0 ? platformTextStyle0 : textStyle0.c;
        LineHeightStyle lineHeightStyle1 = (v5 & 0x100000) == 0 ? lineHeightStyle0 : textStyle0.b.getLineHeightStyle();
        LineBreak lineBreak1 = (v5 & 0x200000) == 0 ? lineBreak0 : LineBreak.box-impl(textStyle0.b.getLineBreak-rAG3T2k());
        Hyphens hyphens1 = (v5 & 0x400000) == 0 ? hyphens0 : Hyphens.box-impl(textStyle0.b.getHyphens-vmbZdU8());
        return (v5 & 0x800000) == 0 ? textStyle0.copy-v2rsoow(v6, v7, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v8, baselineShift1, textGeometricTransform1, localeList1, v9, textDecoration1, shadow1, drawStyle1, textAlign1, textDirection1, v10, textIndent1, platformTextStyle1, lineHeightStyle1, lineBreak1, hyphens1, textMotion0) : textStyle0.copy-v2rsoow(v6, v7, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v8, baselineShift1, textGeometricTransform1, localeList1, v9, textDecoration1, shadow1, drawStyle1, textAlign1, textDirection1, v10, textIndent1, platformTextStyle1, lineHeightStyle1, lineBreak1, hyphens1, textStyle0.b.getTextMotion());
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TextStyle)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((TextStyle)object0).a)) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((TextStyle)object0).b) ? Intrinsics.areEqual(this.c, ((TextStyle)object0).c) : false;
    }

    public final float getAlpha() {
        return this.a.getAlpha();
    }

    public final long getBackground-0d7_KjU() {
        return this.a.getBackground-0d7_KjU();
    }

    @Nullable
    public final BaselineShift getBaselineShift-5SSeXJ0() {
        return this.a.getBaselineShift-5SSeXJ0();
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
        return this.a.getDrawStyle();
    }

    @Nullable
    public final FontFamily getFontFamily() {
        return this.a.getFontFamily();
    }

    @Nullable
    public final String getFontFeatureSettings() {
        return this.a.getFontFeatureSettings();
    }

    public final long getFontSize-XSAIIZE() {
        return this.a.getFontSize-XSAIIZE();
    }

    @Nullable
    public final FontStyle getFontStyle-4Lr2A7w() {
        return this.a.getFontStyle-4Lr2A7w();
    }

    @Nullable
    public final FontSynthesis getFontSynthesis-ZQGJjVo() {
        return this.a.getFontSynthesis-ZQGJjVo();
    }

    @Nullable
    public final FontWeight getFontWeight() {
        return this.a.getFontWeight();
    }

    @JvmName(name = "getHyphens-EaSxIns")
    @Nullable
    public final Hyphens getHyphens-EaSxIns() {
        return Hyphens.box-impl(this.getHyphens-vmbZdU8());
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    public static void getHyphens-EaSxIns$annotations() {
    }

    public final int getHyphens-vmbZdU8() {
        return this.b.getHyphens-vmbZdU8();
    }

    public final long getLetterSpacing-XSAIIZE() {
        return this.a.getLetterSpacing-XSAIIZE();
    }

    @JvmName(name = "getLineBreak-LgCVezo")
    @Nullable
    public final LineBreak getLineBreak-LgCVezo() {
        return LineBreak.box-impl(this.getLineBreak-rAG3T2k());
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    public static void getLineBreak-LgCVezo$annotations() {
    }

    public final int getLineBreak-rAG3T2k() {
        return this.b.getLineBreak-rAG3T2k();
    }

    public final long getLineHeight-XSAIIZE() {
        return this.b.getLineHeight-XSAIIZE();
    }

    @Nullable
    public final LineHeightStyle getLineHeightStyle() {
        return this.b.getLineHeightStyle();
    }

    @Nullable
    public final LocaleList getLocaleList() {
        return this.a.getLocaleList();
    }

    @NotNull
    public final ParagraphStyle getParagraphStyle$ui_text_release() {
        return this.b;
    }

    @Nullable
    public final PlatformTextStyle getPlatformStyle() {
        return this.c;
    }

    @Nullable
    public final Shadow getShadow() {
        return this.a.getShadow();
    }

    @NotNull
    public final SpanStyle getSpanStyle$ui_text_release() {
        return this.a;
    }

    @JvmName(name = "getTextAlign-buA522U")
    @Nullable
    public final TextAlign getTextAlign-buA522U() {
        return TextAlign.box-impl(this.getTextAlign-e0LSkKk());
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    public static void getTextAlign-buA522U$annotations() {
    }

    public final int getTextAlign-e0LSkKk() {
        return this.b.getTextAlign-e0LSkKk();
    }

    @Nullable
    public final TextDecoration getTextDecoration() {
        return this.a.getTextDecoration();
    }

    @JvmName(name = "getTextDirection-mmuk1to")
    @Nullable
    public final TextDirection getTextDirection-mmuk1to() {
        return TextDirection.box-impl(this.getTextDirection-s_7X-co());
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    public static void getTextDirection-mmuk1to$annotations() {
    }

    public final int getTextDirection-s_7X-co() {
        return this.b.getTextDirection-s_7X-co();
    }

    @Nullable
    public final TextGeometricTransform getTextGeometricTransform() {
        return this.a.getTextGeometricTransform();
    }

    @Nullable
    public final TextIndent getTextIndent() {
        return this.b.getTextIndent();
    }

    @Nullable
    public final TextMotion getTextMotion() {
        return this.b.getTextMotion();
    }

    public final boolean hasSameDrawAffectingAttributes(@NotNull TextStyle textStyle0) {
        return this == textStyle0 || this.a.hasSameNonLayoutAttributes$ui_text_release(textStyle0.a);
    }

    // 去混淆评级： 低(20)
    public final boolean hasSameLayoutAffectingAttributes(@NotNull TextStyle textStyle0) {
        return this == textStyle0 || Intrinsics.areEqual(this.b, textStyle0.b) && this.a.hasSameLayoutAffectingAttributes$ui_text_release(textStyle0.a);
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b.hashCode();
        return this.c == null ? (v1 + v * 0x1F) * 0x1F : (v1 + v * 0x1F) * 0x1F + this.c.hashCode();
    }

    public final int hashCodeLayoutAffectingAttributes$ui_text_release() {
        int v = this.a.hashCodeLayoutAffectingAttributes$ui_text_release();
        int v1 = this.b.hashCode();
        return this.c == null ? (v1 + v * 0x1F) * 0x1F : (v1 + v * 0x1F) * 0x1F + this.c.hashCode();
    }

    @Stable
    @NotNull
    public final TextStyle merge(@NotNull ParagraphStyle paragraphStyle0) {
        return new TextStyle(this.toSpanStyle(), this.toParagraphStyle().merge(paragraphStyle0));
    }

    @Stable
    @NotNull
    public final TextStyle merge(@NotNull SpanStyle spanStyle0) {
        return new TextStyle(this.toSpanStyle().merge(spanStyle0), this.toParagraphStyle());
    }

    @Stable
    @NotNull
    public final TextStyle merge(@Nullable TextStyle textStyle0) {
        return textStyle0 == null || Intrinsics.areEqual(textStyle0, TextStyle.d) ? this : new TextStyle(this.toSpanStyle().merge(textStyle0.toSpanStyle()), this.toParagraphStyle().merge(textStyle0.toParagraphStyle()));
    }

    public static TextStyle merge$default(TextStyle textStyle0, TextStyle textStyle1, int v, Object object0) {
        if((v & 1) != 0) {
            textStyle1 = null;
        }
        return textStyle0.merge(textStyle1);
    }

    @Stable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "merge that takes nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public final TextStyle merge-Z1GrekI(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, DrawStyle drawStyle0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, PlatformTextStyle platformTextStyle0, TextMotion textMotion0) {
        PlatformParagraphStyle platformParagraphStyle0 = null;
        SpanStyle spanStyle0 = SpanStyleKt.fastMerge-dSHsh3o(this.a, v, null, NaNf, v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, (platformTextStyle0 == null ? null : platformTextStyle0.getSpanStyle()), drawStyle0);
        int v5 = textAlign0 == null ? 0x80000000 : textAlign0.unbox-impl();
        int v6 = textDirection0 == null ? 0x80000000 : textDirection0.unbox-impl();
        if(platformTextStyle0 != null) {
            platformParagraphStyle0 = platformTextStyle0.getParagraphStyle();
        }
        ParagraphStyle paragraphStyle0 = ParagraphStyleKt.fastMerge-j5T8yCg(this.b, v5, v6, v4, textIndent0, platformParagraphStyle0, lineHeightStyle0, (lineBreak0 == null ? 0 : lineBreak0.unbox-impl()), (hyphens0 == null ? 0x80000000 : hyphens0.unbox-impl()), textMotion0);
        return this.a != spanStyle0 || this.b != paragraphStyle0 ? new TextStyle(spanStyle0, paragraphStyle0) : this;
    }

    public static TextStyle merge-Z1GrekI$default(TextStyle textStyle0, long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, DrawStyle drawStyle0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, PlatformTextStyle platformTextStyle0, TextMotion textMotion0, int v5, Object object0) {
        long v6 = (v5 & 1) == 0 ? v : 0L;
        long v7 = (v5 & 2) == 0 ? v1 : 0x7FC00000L;
        FontWeight fontWeight1 = (v5 & 4) == 0 ? fontWeight0 : null;
        FontStyle fontStyle1 = (v5 & 8) == 0 ? fontStyle0 : null;
        FontSynthesis fontSynthesis1 = (v5 & 16) == 0 ? fontSynthesis0 : null;
        FontFamily fontFamily1 = (v5 & 0x20) == 0 ? fontFamily0 : null;
        String s1 = (v5 & 0x40) == 0 ? s : null;
        long v8 = (v5 & 0x80) == 0 ? v2 : 0x7FC00000L;
        BaselineShift baselineShift1 = (v5 & 0x100) == 0 ? baselineShift0 : null;
        TextGeometricTransform textGeometricTransform1 = (v5 & 0x200) == 0 ? textGeometricTransform0 : null;
        LocaleList localeList1 = (v5 & 0x400) == 0 ? localeList0 : null;
        long v9 = (v5 & 0x800) == 0 ? v3 : 0L;
        TextDecoration textDecoration1 = (v5 & 0x1000) == 0 ? textDecoration0 : null;
        Shadow shadow1 = (v5 & 0x2000) == 0 ? shadow0 : null;
        DrawStyle drawStyle1 = (v5 & 0x4000) == 0 ? drawStyle0 : null;
        TextAlign textAlign1 = (v5 & 0x8000) == 0 ? textAlign0 : null;
        TextDirection textDirection1 = (v5 & 0x10000) == 0 ? textDirection0 : null;
        long v10 = (v5 & 0x20000) == 0 ? v4 : 0x7FC00000L;
        TextIndent textIndent1 = (v5 & 0x40000) == 0 ? textIndent0 : null;
        LineHeightStyle lineHeightStyle1 = (v5 & 0x80000) == 0 ? lineHeightStyle0 : null;
        LineBreak lineBreak1 = (v5 & 0x100000) == 0 ? lineBreak0 : null;
        Hyphens hyphens1 = (v5 & 0x200000) == 0 ? hyphens0 : null;
        PlatformTextStyle platformTextStyle1 = (v5 & 0x400000) == 0 ? platformTextStyle0 : null;
        return (v5 & 0x800000) == 0 ? textStyle0.merge-Z1GrekI(v6, v7, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v8, baselineShift1, textGeometricTransform1, localeList1, v9, textDecoration1, shadow1, drawStyle1, textAlign1, textDirection1, v10, textIndent1, lineHeightStyle1, lineBreak1, hyphens1, platformTextStyle1, textMotion0) : textStyle0.merge-Z1GrekI(v6, v7, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v8, baselineShift1, textGeometricTransform1, localeList1, v9, textDecoration1, shadow1, drawStyle1, textAlign1, textDirection1, v10, textIndent1, lineHeightStyle1, lineBreak1, hyphens1, platformTextStyle1, null);
    }

    @Stable
    @NotNull
    public final TextStyle merge-dA7vx0o(long v, long v1, @Nullable FontWeight fontWeight0, @Nullable FontStyle fontStyle0, @Nullable FontSynthesis fontSynthesis0, @Nullable FontFamily fontFamily0, @Nullable String s, long v2, @Nullable BaselineShift baselineShift0, @Nullable TextGeometricTransform textGeometricTransform0, @Nullable LocaleList localeList0, long v3, @Nullable TextDecoration textDecoration0, @Nullable Shadow shadow0, @Nullable DrawStyle drawStyle0, int v4, int v5, long v6, @Nullable TextIndent textIndent0, @Nullable LineHeightStyle lineHeightStyle0, int v7, int v8, @Nullable PlatformTextStyle platformTextStyle0, @Nullable TextMotion textMotion0) {
        PlatformParagraphStyle platformParagraphStyle0 = null;
        SpanStyle spanStyle0 = SpanStyleKt.fastMerge-dSHsh3o(this.a, v, null, NaNf, v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, (platformTextStyle0 == null ? null : platformTextStyle0.getSpanStyle()), drawStyle0);
        if(platformTextStyle0 != null) {
            platformParagraphStyle0 = platformTextStyle0.getParagraphStyle();
        }
        ParagraphStyle paragraphStyle0 = ParagraphStyleKt.fastMerge-j5T8yCg(this.b, v4, v5, v6, textIndent0, platformParagraphStyle0, lineHeightStyle0, v7, v8, textMotion0);
        return this.a != spanStyle0 || this.b != paragraphStyle0 ? new TextStyle(spanStyle0, paragraphStyle0) : this;
    }

    public static TextStyle merge-dA7vx0o$default(TextStyle textStyle0, long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, DrawStyle drawStyle0, int v4, int v5, long v6, TextIndent textIndent0, LineHeightStyle lineHeightStyle0, int v7, int v8, PlatformTextStyle platformTextStyle0, TextMotion textMotion0, int v9, Object object0) {
        long v10 = (v9 & 1) == 0 ? v : 0L;
        long v11 = (v9 & 2) == 0 ? v1 : 0x7FC00000L;
        FontWeight fontWeight1 = (v9 & 4) == 0 ? fontWeight0 : null;
        FontStyle fontStyle1 = (v9 & 8) == 0 ? fontStyle0 : null;
        FontSynthesis fontSynthesis1 = (v9 & 16) == 0 ? fontSynthesis0 : null;
        FontFamily fontFamily1 = (v9 & 0x20) == 0 ? fontFamily0 : null;
        String s1 = (v9 & 0x40) == 0 ? s : null;
        long v12 = (v9 & 0x80) == 0 ? v2 : 0x7FC00000L;
        BaselineShift baselineShift1 = (v9 & 0x100) == 0 ? baselineShift0 : null;
        TextGeometricTransform textGeometricTransform1 = (v9 & 0x200) == 0 ? textGeometricTransform0 : null;
        LocaleList localeList1 = (v9 & 0x400) == 0 ? localeList0 : null;
        long v13 = (v9 & 0x800) == 0 ? v3 : 0L;
        TextDecoration textDecoration1 = (v9 & 0x1000) == 0 ? textDecoration0 : null;
        Shadow shadow1 = (v9 & 0x2000) == 0 ? shadow0 : null;
        DrawStyle drawStyle1 = (v9 & 0x4000) == 0 ? drawStyle0 : null;
        int v14 = (v9 & 0x8000) == 0 ? v4 : 0x80000000;
        int v15 = (v9 & 0x10000) == 0 ? v5 : 0x80000000;
        long v16 = (v9 & 0x20000) == 0 ? v6 : 0x7FC00000L;
        TextIndent textIndent1 = (v9 & 0x40000) == 0 ? textIndent0 : null;
        LineHeightStyle lineHeightStyle1 = (v9 & 0x80000) == 0 ? lineHeightStyle0 : null;
        int v17 = (v9 & 0x100000) == 0 ? v7 : 0;
        int v18 = (v9 & 0x200000) == 0 ? v8 : 0x80000000;
        PlatformTextStyle platformTextStyle1 = (v9 & 0x400000) == 0 ? platformTextStyle0 : null;
        return (v9 & 0x800000) == 0 ? textStyle0.merge-dA7vx0o(v10, v11, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v12, baselineShift1, textGeometricTransform1, localeList1, v13, textDecoration1, shadow1, drawStyle1, v14, v15, v16, textIndent1, lineHeightStyle1, v17, v18, platformTextStyle1, textMotion0) : textStyle0.merge-dA7vx0o(v10, v11, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v12, baselineShift1, textGeometricTransform1, localeList1, v13, textDecoration1, shadow1, drawStyle1, v14, v15, v16, textIndent1, lineHeightStyle1, v17, v18, platformTextStyle1, null);
    }

    @Stable
    @NotNull
    public final TextStyle plus(@NotNull ParagraphStyle paragraphStyle0) {
        return this.merge(paragraphStyle0);
    }

    @Stable
    @NotNull
    public final TextStyle plus(@NotNull SpanStyle spanStyle0) {
        return this.merge(spanStyle0);
    }

    @Stable
    @NotNull
    public final TextStyle plus(@NotNull TextStyle textStyle0) {
        return this.merge(textStyle0);
    }

    @Stable
    @NotNull
    public final ParagraphStyle toParagraphStyle() {
        return this.b;
    }

    @Stable
    @NotNull
    public final SpanStyle toSpanStyle() {
        return this.a;
    }

    @Override
    @NotNull
    public String toString() {
        return "TextStyle(color=" + Color.toString-impl(this.getColor-0d7_KjU()) + ", brush=" + this.getBrush() + ", alpha=" + this.getAlpha() + ", fontSize=" + TextUnit.toString-impl(this.getFontSize-XSAIIZE()) + ", fontWeight=" + this.getFontWeight() + ", fontStyle=" + this.getFontStyle-4Lr2A7w() + ", fontSynthesis=" + this.getFontSynthesis-ZQGJjVo() + ", fontFamily=" + this.getFontFamily() + ", fontFeatureSettings=" + this.getFontFeatureSettings() + ", letterSpacing=" + TextUnit.toString-impl(this.getLetterSpacing-XSAIIZE()) + ", baselineShift=" + this.getBaselineShift-5SSeXJ0() + ", textGeometricTransform=" + this.getTextGeometricTransform() + ", localeList=" + this.getLocaleList() + ", background=" + Color.toString-impl(this.getBackground-0d7_KjU()) + ", textDecoration=" + this.getTextDecoration() + ", shadow=" + this.getShadow() + ", drawStyle=" + this.getDrawStyle() + ", textAlign=" + TextAlign.toString-impl(this.getTextAlign-e0LSkKk()) + ", textDirection=" + TextDirection.toString-impl(this.getTextDirection-s_7X-co()) + ", lineHeight=" + TextUnit.toString-impl(this.getLineHeight-XSAIIZE()) + ", textIndent=" + this.getTextIndent() + ", platformStyle=" + this.c + ", lineHeightStyle=" + this.getLineHeightStyle() + ", lineBreak=" + LineBreak.toString-impl(this.getLineBreak-rAG3T2k()) + ", hyphens=" + Hyphens.toString-impl(this.getHyphens-vmbZdU8()) + ", textMotion=" + this.getTextMotion() + ')';
    }
}

