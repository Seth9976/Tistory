package androidx.compose.material3.tokens;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000!\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0003\b\u00D7\u0001\b\u00C0\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\r\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u001D\u0010\u0010\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u000E\u0010\n\u001A\u0004\b\u000F\u0010\fR\u001D\u0010\u0013\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u0011\u0010\n\u001A\u0004\b\u0012\u0010\fR\u0017\u0010\u0019\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001C\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u001A\u0010\u0004\u001A\u0004\b\u001B\u0010\u0006R\u001D\u0010\u001F\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u001D\u0010\n\u001A\u0004\b\u001E\u0010\fR\u001D\u0010\"\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b \u0010\n\u001A\u0004\b!\u0010\fR\u001D\u0010%\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b#\u0010\n\u001A\u0004\b$\u0010\fR\u0017\u0010(\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\b&\u0010\u0016\u001A\u0004\b\'\u0010\u0018R\u0017\u0010+\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b)\u0010\u0004\u001A\u0004\b*\u0010\u0006R\u001D\u0010.\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b,\u0010\n\u001A\u0004\b-\u0010\fR\u001D\u00101\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b/\u0010\n\u001A\u0004\b0\u0010\fR\u001D\u00104\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b2\u0010\n\u001A\u0004\b3\u0010\fR\u0017\u00107\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\b5\u0010\u0016\u001A\u0004\b6\u0010\u0018R\u0017\u0010:\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b8\u0010\u0004\u001A\u0004\b9\u0010\u0006R\u001D\u0010=\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b;\u0010\n\u001A\u0004\b<\u0010\fR\u001D\u0010@\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b>\u0010\n\u001A\u0004\b?\u0010\fR\u001D\u0010C\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bA\u0010\n\u001A\u0004\bB\u0010\fR\u0017\u0010F\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\bD\u0010\u0016\u001A\u0004\bE\u0010\u0018R\u0017\u0010I\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bG\u0010\u0004\u001A\u0004\bH\u0010\u0006R\u001D\u0010L\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bJ\u0010\n\u001A\u0004\bK\u0010\fR\u001D\u0010O\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bM\u0010\n\u001A\u0004\bN\u0010\fR\u001D\u0010R\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bP\u0010\n\u001A\u0004\bQ\u0010\fR\u0017\u0010U\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\bS\u0010\u0016\u001A\u0004\bT\u0010\u0018R\u0017\u0010X\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bV\u0010\u0004\u001A\u0004\bW\u0010\u0006R\u001D\u0010[\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bY\u0010\n\u001A\u0004\bZ\u0010\fR\u001D\u0010^\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\\\u0010\n\u001A\u0004\b]\u0010\fR\u001D\u0010a\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b_\u0010\n\u001A\u0004\b`\u0010\fR\u0017\u0010d\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\bb\u0010\u0016\u001A\u0004\bc\u0010\u0018R\u0017\u0010g\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\be\u0010\u0004\u001A\u0004\bf\u0010\u0006R\u001D\u0010j\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bh\u0010\n\u001A\u0004\bi\u0010\fR\u001D\u0010m\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bk\u0010\n\u001A\u0004\bl\u0010\fR\u001D\u0010p\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bn\u0010\n\u001A\u0004\bo\u0010\fR\u0017\u0010s\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\bq\u0010\u0016\u001A\u0004\br\u0010\u0018R\u0017\u0010u\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\n\u0010\u0004\u001A\u0004\bt\u0010\u0006R\u001D\u0010x\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bv\u0010\n\u001A\u0004\bw\u0010\fR\u001D\u0010{\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\by\u0010\n\u001A\u0004\bz\u0010\fR\u001D\u0010~\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b|\u0010\n\u001A\u0004\b}\u0010\fR\u0019\u0010\u0081\u0001\u001A\u00020\u00148\u0006\u00A2\u0006\r\n\u0004\b\u007F\u0010\u0016\u001A\u0005\b\u0080\u0001\u0010\u0018R\u001A\u0010\u0084\u0001\u001A\u00020\u00028\u0006\u00A2\u0006\u000E\n\u0005\b\u0082\u0001\u0010\u0004\u001A\u0005\b\u0083\u0001\u0010\u0006R \u0010\u0087\u0001\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u0085\u0001\u0010\n\u001A\u0005\b\u0086\u0001\u0010\fR \u0010\u008A\u0001\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u0088\u0001\u0010\n\u001A\u0005\b\u0089\u0001\u0010\fR \u0010\u008D\u0001\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u008B\u0001\u0010\n\u001A\u0005\b\u008C\u0001\u0010\fR\u001A\u0010\u0090\u0001\u001A\u00020\u00148\u0006\u00A2\u0006\u000E\n\u0005\b\u008E\u0001\u0010\u0016\u001A\u0005\b\u008F\u0001\u0010\u0018R\u001A\u0010\u0093\u0001\u001A\u00020\u00028\u0006\u00A2\u0006\u000E\n\u0005\b\u0091\u0001\u0010\u0004\u001A\u0005\b\u0092\u0001\u0010\u0006R \u0010\u0096\u0001\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u0094\u0001\u0010\n\u001A\u0005\b\u0095\u0001\u0010\fR \u0010\u0099\u0001\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u0097\u0001\u0010\n\u001A\u0005\b\u0098\u0001\u0010\fR \u0010\u009C\u0001\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u009A\u0001\u0010\n\u001A\u0005\b\u009B\u0001\u0010\fR\u001A\u0010\u009F\u0001\u001A\u00020\u00148\u0006\u00A2\u0006\u000E\n\u0005\b\u009D\u0001\u0010\u0016\u001A\u0005\b\u009E\u0001\u0010\u0018R\u001A\u0010\u00A2\u0001\u001A\u00020\u00028\u0006\u00A2\u0006\u000E\n\u0005\b\u00A0\u0001\u0010\u0004\u001A\u0005\b\u00A1\u0001\u0010\u0006R \u0010\u00A5\u0001\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u00A3\u0001\u0010\n\u001A\u0005\b\u00A4\u0001\u0010\fR \u0010\u00A8\u0001\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u00A6\u0001\u0010\n\u001A\u0005\b\u00A7\u0001\u0010\fR \u0010\u00AB\u0001\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u00A9\u0001\u0010\n\u001A\u0005\b\u00AA\u0001\u0010\fR\u001A\u0010\u00AE\u0001\u001A\u00020\u00148\u0006\u00A2\u0006\u000E\n\u0005\b\u00AC\u0001\u0010\u0016\u001A\u0005\b\u00AD\u0001\u0010\u0018R\u001A\u0010\u00B1\u0001\u001A\u00020\u00028\u0006\u00A2\u0006\u000E\n\u0005\b\u00AF\u0001\u0010\u0004\u001A\u0005\b\u00B0\u0001\u0010\u0006R \u0010\u00B4\u0001\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u00B2\u0001\u0010\n\u001A\u0005\b\u00B3\u0001\u0010\fR \u0010\u00B7\u0001\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u00B5\u0001\u0010\n\u001A\u0005\b\u00B6\u0001\u0010\fR \u0010\u00BA\u0001\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u00B8\u0001\u0010\n\u001A\u0005\b\u00B9\u0001\u0010\fR\u001A\u0010\u00BD\u0001\u001A\u00020\u00148\u0006\u00A2\u0006\u000E\n\u0005\b\u00BB\u0001\u0010\u0016\u001A\u0005\b\u00BC\u0001\u0010\u0018R\u001A\u0010\u00C0\u0001\u001A\u00020\u00028\u0006\u00A2\u0006\u000E\n\u0005\b\u00BE\u0001\u0010\u0004\u001A\u0005\b\u00BF\u0001\u0010\u0006R \u0010\u00C3\u0001\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u00C1\u0001\u0010\n\u001A\u0005\b\u00C2\u0001\u0010\fR \u0010\u00C6\u0001\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u00C4\u0001\u0010\n\u001A\u0005\b\u00C5\u0001\u0010\fR \u0010\u00C9\u0001\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u00C7\u0001\u0010\n\u001A\u0005\b\u00C8\u0001\u0010\fR\u001A\u0010\u00CC\u0001\u001A\u00020\u00148\u0006\u00A2\u0006\u000E\n\u0005\b\u00CA\u0001\u0010\u0016\u001A\u0005\b\u00CB\u0001\u0010\u0018R\u001A\u0010\u00CF\u0001\u001A\u00020\u00028\u0006\u00A2\u0006\u000E\n\u0005\b\u00CD\u0001\u0010\u0004\u001A\u0005\b\u00CE\u0001\u0010\u0006R \u0010\u00D2\u0001\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u00D0\u0001\u0010\n\u001A\u0005\b\u00D1\u0001\u0010\fR \u0010\u00D5\u0001\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u00D3\u0001\u0010\n\u001A\u0005\b\u00D4\u0001\u0010\fR \u0010\u00D8\u0001\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u00D6\u0001\u0010\n\u001A\u0005\b\u00D7\u0001\u0010\fR\u001A\u0010\u00DB\u0001\u001A\u00020\u00148\u0006\u00A2\u0006\u000E\n\u0005\b\u00D9\u0001\u0010\u0016\u001A\u0005\b\u00DA\u0001\u0010\u0018R\u001A\u0010\u00DE\u0001\u001A\u00020\u00028\u0006\u00A2\u0006\u000E\n\u0005\b\u00DC\u0001\u0010\u0004\u001A\u0005\b\u00DD\u0001\u0010\u0006R \u0010\u00E1\u0001\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u00DF\u0001\u0010\n\u001A\u0005\b\u00E0\u0001\u0010\fR \u0010\u00E4\u0001\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u00E2\u0001\u0010\n\u001A\u0005\b\u00E3\u0001\u0010\fR \u0010\u00E7\u0001\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u00E5\u0001\u0010\n\u001A\u0005\b\u00E6\u0001\u0010\fR\u001A\u0010\u00EA\u0001\u001A\u00020\u00148\u0006\u00A2\u0006\u000E\n\u0005\b\u00E8\u0001\u0010\u0016\u001A\u0005\b\u00E9\u0001\u0010\u0018\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006\u00EB\u0001"}, d2 = {"Landroidx/compose/material3/tokens/TypeScaleTokens;", "", "Landroidx/compose/ui/text/font/GenericFontFamily;", "a", "Landroidx/compose/ui/text/font/GenericFontFamily;", "getBodyLargeFont", "()Landroidx/compose/ui/text/font/GenericFontFamily;", "BodyLargeFont", "Landroidx/compose/ui/unit/TextUnit;", "b", "J", "getBodyLargeLineHeight-XSAIIZE", "()J", "BodyLargeLineHeight", "c", "getBodyLargeSize-XSAIIZE", "BodyLargeSize", "d", "getBodyLargeTracking-XSAIIZE", "BodyLargeTracking", "Landroidx/compose/ui/text/font/FontWeight;", "e", "Landroidx/compose/ui/text/font/FontWeight;", "getBodyLargeWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "BodyLargeWeight", "f", "getBodyMediumFont", "BodyMediumFont", "g", "getBodyMediumLineHeight-XSAIIZE", "BodyMediumLineHeight", "h", "getBodyMediumSize-XSAIIZE", "BodyMediumSize", "i", "getBodyMediumTracking-XSAIIZE", "BodyMediumTracking", "j", "getBodyMediumWeight", "BodyMediumWeight", "k", "getBodySmallFont", "BodySmallFont", "l", "getBodySmallLineHeight-XSAIIZE", "BodySmallLineHeight", "m", "getBodySmallSize-XSAIIZE", "BodySmallSize", "n", "getBodySmallTracking-XSAIIZE", "BodySmallTracking", "o", "getBodySmallWeight", "BodySmallWeight", "p", "getDisplayLargeFont", "DisplayLargeFont", "q", "getDisplayLargeLineHeight-XSAIIZE", "DisplayLargeLineHeight", "r", "getDisplayLargeSize-XSAIIZE", "DisplayLargeSize", "s", "getDisplayLargeTracking-XSAIIZE", "DisplayLargeTracking", "t", "getDisplayLargeWeight", "DisplayLargeWeight", "u", "getDisplayMediumFont", "DisplayMediumFont", "v", "getDisplayMediumLineHeight-XSAIIZE", "DisplayMediumLineHeight", "w", "getDisplayMediumSize-XSAIIZE", "DisplayMediumSize", "x", "getDisplayMediumTracking-XSAIIZE", "DisplayMediumTracking", "y", "getDisplayMediumWeight", "DisplayMediumWeight", "z", "getDisplaySmallFont", "DisplaySmallFont", "A", "getDisplaySmallLineHeight-XSAIIZE", "DisplaySmallLineHeight", "B", "getDisplaySmallSize-XSAIIZE", "DisplaySmallSize", "C", "getDisplaySmallTracking-XSAIIZE", "DisplaySmallTracking", "D", "getDisplaySmallWeight", "DisplaySmallWeight", "E", "getHeadlineLargeFont", "HeadlineLargeFont", "F", "getHeadlineLargeLineHeight-XSAIIZE", "HeadlineLargeLineHeight", "G", "getHeadlineLargeSize-XSAIIZE", "HeadlineLargeSize", "H", "getHeadlineLargeTracking-XSAIIZE", "HeadlineLargeTracking", "I", "getHeadlineLargeWeight", "HeadlineLargeWeight", "getHeadlineMediumFont", "HeadlineMediumFont", "K", "getHeadlineMediumLineHeight-XSAIIZE", "HeadlineMediumLineHeight", "L", "getHeadlineMediumSize-XSAIIZE", "HeadlineMediumSize", "M", "getHeadlineMediumTracking-XSAIIZE", "HeadlineMediumTracking", "N", "getHeadlineMediumWeight", "HeadlineMediumWeight", "O", "getHeadlineSmallFont", "HeadlineSmallFont", "P", "getHeadlineSmallLineHeight-XSAIIZE", "HeadlineSmallLineHeight", "Q", "getHeadlineSmallSize-XSAIIZE", "HeadlineSmallSize", "R", "getHeadlineSmallTracking-XSAIIZE", "HeadlineSmallTracking", "S", "getHeadlineSmallWeight", "HeadlineSmallWeight", "T", "getLabelLargeFont", "LabelLargeFont", "U", "getLabelLargeLineHeight-XSAIIZE", "LabelLargeLineHeight", "V", "getLabelLargeSize-XSAIIZE", "LabelLargeSize", "W", "getLabelLargeTracking-XSAIIZE", "LabelLargeTracking", "X", "getLabelLargeWeight", "LabelLargeWeight", "Y", "getLabelMediumFont", "LabelMediumFont", "Z", "getLabelMediumLineHeight-XSAIIZE", "LabelMediumLineHeight", "a0", "getLabelMediumSize-XSAIIZE", "LabelMediumSize", "b0", "getLabelMediumTracking-XSAIIZE", "LabelMediumTracking", "c0", "getLabelMediumWeight", "LabelMediumWeight", "d0", "getLabelSmallFont", "LabelSmallFont", "e0", "getLabelSmallLineHeight-XSAIIZE", "LabelSmallLineHeight", "f0", "getLabelSmallSize-XSAIIZE", "LabelSmallSize", "g0", "getLabelSmallTracking-XSAIIZE", "LabelSmallTracking", "h0", "getLabelSmallWeight", "LabelSmallWeight", "i0", "getTitleLargeFont", "TitleLargeFont", "j0", "getTitleLargeLineHeight-XSAIIZE", "TitleLargeLineHeight", "k0", "getTitleLargeSize-XSAIIZE", "TitleLargeSize", "l0", "getTitleLargeTracking-XSAIIZE", "TitleLargeTracking", "m0", "getTitleLargeWeight", "TitleLargeWeight", "n0", "getTitleMediumFont", "TitleMediumFont", "o0", "getTitleMediumLineHeight-XSAIIZE", "TitleMediumLineHeight", "p0", "getTitleMediumSize-XSAIIZE", "TitleMediumSize", "q0", "getTitleMediumTracking-XSAIIZE", "TitleMediumTracking", "r0", "getTitleMediumWeight", "TitleMediumWeight", "s0", "getTitleSmallFont", "TitleSmallFont", "t0", "getTitleSmallLineHeight-XSAIIZE", "TitleSmallLineHeight", "u0", "getTitleSmallSize-XSAIIZE", "TitleSmallSize", "v0", "getTitleSmallTracking-XSAIIZE", "TitleSmallTracking", "w0", "getTitleSmallWeight", "TitleSmallWeight", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTypeScaleTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeScaleTokens.kt\nandroidx/compose/material3/tokens/TypeScaleTokens\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,100:1\n95#2,2:101\n*S KotlinDebug\n*F\n+ 1 TypeScaleTokens.kt\nandroidx/compose/material3/tokens/TypeScaleTokens\n*L\n42#1:101,2\n*E\n"})
public final class TypeScaleTokens {
    public static final int $stable;
    public static final long A;
    public static final long B;
    public static final long C;
    public static final FontWeight D;
    public static final GenericFontFamily E;
    public static final long F;
    public static final long G;
    public static final long H;
    public static final FontWeight I;
    @NotNull
    public static final TypeScaleTokens INSTANCE;
    public static final GenericFontFamily J;
    public static final long K;
    public static final long L;
    public static final long M;
    public static final FontWeight N;
    public static final GenericFontFamily O;
    public static final long P;
    public static final long Q;
    public static final long R;
    public static final FontWeight S;
    public static final GenericFontFamily T;
    public static final long U;
    public static final long V;
    public static final long W;
    public static final FontWeight X;
    public static final GenericFontFamily Y;
    public static final long Z;
    public static final GenericFontFamily a;
    public static final long a0;
    public static final long b;
    public static final long b0;
    public static final long c;
    public static final FontWeight c0;
    public static final long d;
    public static final GenericFontFamily d0;
    public static final FontWeight e;
    public static final long e0;
    public static final GenericFontFamily f;
    public static final long f0;
    public static final long g;
    public static final long g0;
    public static final long h;
    public static final FontWeight h0;
    public static final long i;
    public static final GenericFontFamily i0;
    public static final FontWeight j;
    public static final long j0;
    public static final GenericFontFamily k;
    public static final long k0;
    public static final long l;
    public static final long l0;
    public static final long m;
    public static final FontWeight m0;
    public static final long n;
    public static final GenericFontFamily n0;
    public static final FontWeight o;
    public static final long o0;
    public static final GenericFontFamily p;
    public static final long p0;
    public static final long q;
    public static final long q0;
    public static final long r;
    public static final FontWeight r0;
    public static final long s;
    public static final GenericFontFamily s0;
    public static final FontWeight t;
    public static final long t0;
    public static final GenericFontFamily u;
    public static final long u0;
    public static final long v;
    public static final long v0;
    public static final long w;
    public static final FontWeight w0;
    public static final long x;
    public static final FontWeight y;
    public static final GenericFontFamily z;

    static {
        TypeScaleTokens.INSTANCE = new TypeScaleTokens();  // 初始化器: Ljava/lang/Object;-><init>()V
        TypefaceTokens typefaceTokens0 = TypefaceTokens.INSTANCE;
        TypeScaleTokens.a = typefaceTokens0.getPlain();
        TypeScaleTokens.b = 0x141C00000L;
        TypeScaleTokens.c = 0x141800000L;
        TypeScaleTokens.d = 0x13F000000L;
        TypeScaleTokens.e = typefaceTokens0.getWeightRegular();
        TypeScaleTokens.f = typefaceTokens0.getPlain();
        TypeScaleTokens.g = 0x141A00000L;
        TypeScaleTokens.h = 0x141600000L;
        TypeScaleTokens.i = 5340187853L;
        TypeScaleTokens.j = typefaceTokens0.getWeightRegular();
        TypeScaleTokens.k = typefaceTokens0.getPlain();
        TypeScaleTokens.l = 0x141800000L;
        TypeScaleTokens.m = 0x141400000L;
        TypeScaleTokens.n = 0x13ECCCCCDL;
        TypeScaleTokens.o = typefaceTokens0.getWeightRegular();
        TypeScaleTokens.p = typefaceTokens0.getBrand();
        TypeScaleTokens.q = 0x142800000L;
        TypeScaleTokens.r = 0x142640000L;
        TextUnitKt.checkArithmetic--R2X_6o(5340187853L);
        TypeScaleTokens.s = 7487671501L;
        TypeScaleTokens.t = typefaceTokens0.getWeightRegular();
        TypeScaleTokens.u = typefaceTokens0.getBrand();
        TypeScaleTokens.v = 0x142500000L;
        TypeScaleTokens.w = 0x142340000L;
        TypeScaleTokens.x = 0x100000000L;
        TypeScaleTokens.y = typefaceTokens0.getWeightRegular();
        TypeScaleTokens.z = typefaceTokens0.getBrand();
        TypeScaleTokens.A = 0x142300000L;
        TypeScaleTokens.B = 0x142100000L;
        TypeScaleTokens.C = 0x100000000L;
        TypeScaleTokens.D = typefaceTokens0.getWeightRegular();
        TypeScaleTokens.E = typefaceTokens0.getBrand();
        TypeScaleTokens.F = 0x142200000L;
        TypeScaleTokens.G = 0x142000000L;
        TypeScaleTokens.H = 0x100000000L;
        TypeScaleTokens.I = typefaceTokens0.getWeightRegular();
        TypeScaleTokens.J = typefaceTokens0.getBrand();
        TypeScaleTokens.K = 0x142100000L;
        TypeScaleTokens.L = 0x141E00000L;
        TypeScaleTokens.M = 0x100000000L;
        TypeScaleTokens.N = typefaceTokens0.getWeightRegular();
        TypeScaleTokens.O = typefaceTokens0.getBrand();
        TypeScaleTokens.P = 0x142000000L;
        TypeScaleTokens.Q = 0x141C00000L;
        TypeScaleTokens.R = 0x100000000L;
        TypeScaleTokens.S = typefaceTokens0.getWeightRegular();
        TypeScaleTokens.T = typefaceTokens0.getPlain();
        TypeScaleTokens.U = 0x141A00000L;
        TypeScaleTokens.V = 0x141600000L;
        TypeScaleTokens.W = 0x13DCCCCCDL;
        TypeScaleTokens.X = typefaceTokens0.getWeightMedium();
        TypeScaleTokens.Y = typefaceTokens0.getPlain();
        TypeScaleTokens.Z = 0x141800000L;
        TypeScaleTokens.a0 = 0x141400000L;
        TypeScaleTokens.b0 = 0x13F000000L;
        TypeScaleTokens.c0 = typefaceTokens0.getWeightMedium();
        TypeScaleTokens.d0 = typefaceTokens0.getPlain();
        TypeScaleTokens.e0 = 0x141800000L;
        TypeScaleTokens.f0 = 0x141300000L;
        TypeScaleTokens.g0 = 0x13F000000L;
        TypeScaleTokens.h0 = typefaceTokens0.getWeightMedium();
        TypeScaleTokens.i0 = typefaceTokens0.getBrand();
        TypeScaleTokens.j0 = 0x141E00000L;
        TypeScaleTokens.k0 = 0x141B00000L;
        TypeScaleTokens.l0 = 0x100000000L;
        TypeScaleTokens.m0 = typefaceTokens0.getWeightRegular();
        TypeScaleTokens.n0 = typefaceTokens0.getPlain();
        TypeScaleTokens.o0 = 0x141C00000L;
        TypeScaleTokens.p0 = 0x141800000L;
        TypeScaleTokens.q0 = 5340187853L;
        TypeScaleTokens.r0 = typefaceTokens0.getWeightMedium();
        TypeScaleTokens.s0 = typefaceTokens0.getPlain();
        TypeScaleTokens.t0 = 0x141A00000L;
        TypeScaleTokens.u0 = 0x141600000L;
        TypeScaleTokens.v0 = 0x13DCCCCCDL;
        TypeScaleTokens.w0 = typefaceTokens0.getWeightMedium();
    }

    @NotNull
    public final GenericFontFamily getBodyLargeFont() {
        return TypeScaleTokens.a;
    }

    public final long getBodyLargeLineHeight-XSAIIZE() [...] // 潜在的解密器

    public final long getBodyLargeSize-XSAIIZE() [...] // 潜在的解密器

    public final long getBodyLargeTracking-XSAIIZE() [...] // 潜在的解密器

    @NotNull
    public final FontWeight getBodyLargeWeight() {
        return TypeScaleTokens.e;
    }

    @NotNull
    public final GenericFontFamily getBodyMediumFont() {
        return TypeScaleTokens.f;
    }

    public final long getBodyMediumLineHeight-XSAIIZE() [...] // 潜在的解密器

    public final long getBodyMediumSize-XSAIIZE() [...] // 潜在的解密器

    public final long getBodyMediumTracking-XSAIIZE() [...] // 潜在的解密器

    @NotNull
    public final FontWeight getBodyMediumWeight() {
        return TypeScaleTokens.j;
    }

    @NotNull
    public final GenericFontFamily getBodySmallFont() {
        return TypeScaleTokens.k;
    }

    public final long getBodySmallLineHeight-XSAIIZE() [...] // 潜在的解密器

    public final long getBodySmallSize-XSAIIZE() [...] // 潜在的解密器

    public final long getBodySmallTracking-XSAIIZE() [...] // 潜在的解密器

    @NotNull
    public final FontWeight getBodySmallWeight() {
        return TypeScaleTokens.o;
    }

    @NotNull
    public final GenericFontFamily getDisplayLargeFont() {
        return TypeScaleTokens.p;
    }

    public final long getDisplayLargeLineHeight-XSAIIZE() [...] // 潜在的解密器

    public final long getDisplayLargeSize-XSAIIZE() [...] // 潜在的解密器

    public final long getDisplayLargeTracking-XSAIIZE() [...] // 潜在的解密器

    @NotNull
    public final FontWeight getDisplayLargeWeight() {
        return TypeScaleTokens.t;
    }

    @NotNull
    public final GenericFontFamily getDisplayMediumFont() {
        return TypeScaleTokens.u;
    }

    public final long getDisplayMediumLineHeight-XSAIIZE() [...] // 潜在的解密器

    public final long getDisplayMediumSize-XSAIIZE() [...] // 潜在的解密器

    public final long getDisplayMediumTracking-XSAIIZE() [...] // 潜在的解密器

    @NotNull
    public final FontWeight getDisplayMediumWeight() {
        return TypeScaleTokens.y;
    }

    @NotNull
    public final GenericFontFamily getDisplaySmallFont() {
        return TypeScaleTokens.z;
    }

    public final long getDisplaySmallLineHeight-XSAIIZE() [...] // 潜在的解密器

    public final long getDisplaySmallSize-XSAIIZE() [...] // 潜在的解密器

    public final long getDisplaySmallTracking-XSAIIZE() [...] // 潜在的解密器

    @NotNull
    public final FontWeight getDisplaySmallWeight() {
        return TypeScaleTokens.D;
    }

    @NotNull
    public final GenericFontFamily getHeadlineLargeFont() {
        return TypeScaleTokens.E;
    }

    public final long getHeadlineLargeLineHeight-XSAIIZE() [...] // 潜在的解密器

    public final long getHeadlineLargeSize-XSAIIZE() [...] // 潜在的解密器

    public final long getHeadlineLargeTracking-XSAIIZE() [...] // 潜在的解密器

    @NotNull
    public final FontWeight getHeadlineLargeWeight() {
        return TypeScaleTokens.I;
    }

    @NotNull
    public final GenericFontFamily getHeadlineMediumFont() {
        return TypeScaleTokens.J;
    }

    public final long getHeadlineMediumLineHeight-XSAIIZE() [...] // 潜在的解密器

    public final long getHeadlineMediumSize-XSAIIZE() [...] // 潜在的解密器

    public final long getHeadlineMediumTracking-XSAIIZE() [...] // 潜在的解密器

    @NotNull
    public final FontWeight getHeadlineMediumWeight() {
        return TypeScaleTokens.N;
    }

    @NotNull
    public final GenericFontFamily getHeadlineSmallFont() {
        return TypeScaleTokens.O;
    }

    public final long getHeadlineSmallLineHeight-XSAIIZE() [...] // 潜在的解密器

    public final long getHeadlineSmallSize-XSAIIZE() [...] // 潜在的解密器

    public final long getHeadlineSmallTracking-XSAIIZE() [...] // 潜在的解密器

    @NotNull
    public final FontWeight getHeadlineSmallWeight() {
        return TypeScaleTokens.S;
    }

    @NotNull
    public final GenericFontFamily getLabelLargeFont() {
        return TypeScaleTokens.T;
    }

    public final long getLabelLargeLineHeight-XSAIIZE() [...] // 潜在的解密器

    public final long getLabelLargeSize-XSAIIZE() [...] // 潜在的解密器

    public final long getLabelLargeTracking-XSAIIZE() [...] // 潜在的解密器

    @NotNull
    public final FontWeight getLabelLargeWeight() {
        return TypeScaleTokens.X;
    }

    @NotNull
    public final GenericFontFamily getLabelMediumFont() {
        return TypeScaleTokens.Y;
    }

    public final long getLabelMediumLineHeight-XSAIIZE() [...] // 潜在的解密器

    public final long getLabelMediumSize-XSAIIZE() [...] // 潜在的解密器

    public final long getLabelMediumTracking-XSAIIZE() [...] // 潜在的解密器

    @NotNull
    public final FontWeight getLabelMediumWeight() {
        return TypeScaleTokens.c0;
    }

    @NotNull
    public final GenericFontFamily getLabelSmallFont() {
        return TypeScaleTokens.d0;
    }

    public final long getLabelSmallLineHeight-XSAIIZE() [...] // 潜在的解密器

    public final long getLabelSmallSize-XSAIIZE() [...] // 潜在的解密器

    public final long getLabelSmallTracking-XSAIIZE() [...] // 潜在的解密器

    @NotNull
    public final FontWeight getLabelSmallWeight() {
        return TypeScaleTokens.h0;
    }

    @NotNull
    public final GenericFontFamily getTitleLargeFont() {
        return TypeScaleTokens.i0;
    }

    public final long getTitleLargeLineHeight-XSAIIZE() [...] // 潜在的解密器

    public final long getTitleLargeSize-XSAIIZE() [...] // 潜在的解密器

    public final long getTitleLargeTracking-XSAIIZE() [...] // 潜在的解密器

    @NotNull
    public final FontWeight getTitleLargeWeight() {
        return TypeScaleTokens.m0;
    }

    @NotNull
    public final GenericFontFamily getTitleMediumFont() {
        return TypeScaleTokens.n0;
    }

    public final long getTitleMediumLineHeight-XSAIIZE() [...] // 潜在的解密器

    public final long getTitleMediumSize-XSAIIZE() [...] // 潜在的解密器

    public final long getTitleMediumTracking-XSAIIZE() [...] // 潜在的解密器

    @NotNull
    public final FontWeight getTitleMediumWeight() {
        return TypeScaleTokens.r0;
    }

    @NotNull
    public final GenericFontFamily getTitleSmallFont() {
        return TypeScaleTokens.s0;
    }

    public final long getTitleSmallLineHeight-XSAIIZE() [...] // 潜在的解密器

    public final long getTitleSmallSize-XSAIIZE() [...] // 潜在的解密器

    public final long getTitleSmallTracking-XSAIIZE() [...] // 潜在的解密器

    @NotNull
    public final FontWeight getTitleSmallWeight() {
        return TypeScaleTokens.w0;
    }
}

