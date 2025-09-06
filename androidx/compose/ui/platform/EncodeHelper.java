package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007\u00A2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000B\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\t\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0018\u0010\u000B\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\r\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0018\u0010\u000B\u001A\u00020\u00042\u0006\u0010\u0012\u001A\u00020\u0011\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0013\u0010\u0010J\u0015\u0010\u000B\u001A\u00020\u00042\u0006\u0010\u0015\u001A\u00020\u0014\u00A2\u0006\u0004\b\u000B\u0010\u0016J\u0018\u0010\u000B\u001A\u00020\u00042\u0006\u0010\u0018\u001A\u00020\u0017\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0018\u0010\u000B\u001A\u00020\u00042\u0006\u0010\u001C\u001A\u00020\u001B\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001D\u0010\u001AJ\u0018\u0010\u000B\u001A\u00020\u00042\u0006\u0010\u001F\u001A\u00020\u001E\u00F8\u0001\u0000\u00A2\u0006\u0004\b \u0010!J\u0015\u0010\u000B\u001A\u00020\u00042\u0006\u0010#\u001A\u00020\"\u00A2\u0006\u0004\b\u000B\u0010$J\u0015\u0010\u000B\u001A\u00020\u00042\u0006\u0010&\u001A\u00020%\u00A2\u0006\u0004\b\u000B\u0010\'J\u0015\u0010\u000B\u001A\u00020\u00042\u0006\u0010)\u001A\u00020(\u00A2\u0006\u0004\b\u000B\u0010*J\u0015\u0010\u000B\u001A\u00020\u00042\u0006\u0010,\u001A\u00020+\u00A2\u0006\u0004\b\u000B\u0010-J\u0015\u0010\u000B\u001A\u00020\u00042\u0006\u0010/\u001A\u00020.\u00A2\u0006\u0004\b\u000B\u0010\u001AJ\u0015\u0010\u000B\u001A\u00020\u00042\u0006\u00101\u001A\u000200\u00A2\u0006\u0004\b\u000B\u0010!J\u0018\u0010\u000B\u001A\u00020\u00042\u0006\u00103\u001A\u000202\u00F8\u0001\u0000\u00A2\u0006\u0004\b4\u0010\u0010J\u0015\u0010\u000B\u001A\u00020\u00042\u0006\u00105\u001A\u00020\u0006\u00A2\u0006\u0004\b\u000B\u00106\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u00067"}, d2 = {"Landroidx/compose/ui/platform/EncodeHelper;", "", "<init>", "()V", "", "reset", "", "encodedString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyle", "encode", "(Landroidx/compose/ui/text/SpanStyle;)V", "Landroidx/compose/ui/graphics/Color;", "color", "encode-8_81llA", "(J)V", "Landroidx/compose/ui/unit/TextUnit;", "textUnit", "encode--R2X_6o", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "(Landroidx/compose/ui/text/font/FontWeight;)V", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "encode-nzbMABs", "(I)V", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "encode-6p3vJLY", "Landroidx/compose/ui/text/style/BaselineShift;", "baselineShift", "encode-4Dl_Bck", "(F)V", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textGeometricTransform", "(Landroidx/compose/ui/text/style/TextGeometricTransform;)V", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "(Landroidx/compose/ui/text/style/TextDecoration;)V", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "(Landroidx/compose/ui/graphics/Shadow;)V", "", "byte", "(B)V", "", "int", "", "float", "Lkotlin/ULong;", "uLong", "encode-VKZWuLQ", "string", "(Ljava/lang/String;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class EncodeHelper {
    public static final int $stable = 8;
    public Parcel a;

    public EncodeHelper() {
        this.a = Parcel.obtain();
    }

    public final void encode(byte b) {
        this.a.writeByte(b);
    }

    public final void encode(float f) {
        this.a.writeFloat(f);
    }

    public final void encode(int v) {
        this.a.writeInt(v);
    }

    public final void encode(@NotNull Shadow shadow0) {
        this.encode-8_81llA(shadow0.getColor-0d7_KjU());
        this.encode(Offset.getX-impl(shadow0.getOffset-F1C5BW0()));
        this.encode(Offset.getY-impl(shadow0.getOffset-F1C5BW0()));
        this.encode(shadow0.getBlurRadius());
    }

    public final void encode(@NotNull SpanStyle spanStyle0) {
        if(!Color.equals-impl0(spanStyle0.getColor-0d7_KjU(), 0L)) {
            this.encode(1);
            this.encode-8_81llA(spanStyle0.getColor-0d7_KjU());
        }
        if(!TextUnit.equals-impl0(spanStyle0.getFontSize-XSAIIZE(), 0x7FC00000L)) {
            this.encode(2);
            this.encode--R2X_6o(spanStyle0.getFontSize-XSAIIZE());
        }
        FontWeight fontWeight0 = spanStyle0.getFontWeight();
        if(fontWeight0 != null) {
            this.encode(3);
            this.encode(fontWeight0);
        }
        FontStyle fontStyle0 = spanStyle0.getFontStyle-4Lr2A7w();
        if(fontStyle0 != null) {
            this.encode(4);
            this.encode-nzbMABs(fontStyle0.unbox-impl());
        }
        FontSynthesis fontSynthesis0 = spanStyle0.getFontSynthesis-ZQGJjVo();
        if(fontSynthesis0 != null) {
            this.encode(5);
            this.encode-6p3vJLY(fontSynthesis0.unbox-impl());
        }
        String s = spanStyle0.getFontFeatureSettings();
        if(s != null) {
            this.encode(6);
            this.encode(s);
        }
        if(!TextUnit.equals-impl0(spanStyle0.getLetterSpacing-XSAIIZE(), 0x7FC00000L)) {
            this.encode(7);
            this.encode--R2X_6o(spanStyle0.getLetterSpacing-XSAIIZE());
        }
        BaselineShift baselineShift0 = spanStyle0.getBaselineShift-5SSeXJ0();
        if(baselineShift0 != null) {
            this.encode(8);
            this.encode-4Dl_Bck(baselineShift0.unbox-impl());
        }
        TextGeometricTransform textGeometricTransform0 = spanStyle0.getTextGeometricTransform();
        if(textGeometricTransform0 != null) {
            this.encode(9);
            this.encode(textGeometricTransform0);
        }
        if(!Color.equals-impl0(spanStyle0.getBackground-0d7_KjU(), 0L)) {
            this.encode(10);
            this.encode-8_81llA(spanStyle0.getBackground-0d7_KjU());
        }
        TextDecoration textDecoration0 = spanStyle0.getTextDecoration();
        if(textDecoration0 != null) {
            this.encode(11);
            this.encode(textDecoration0);
        }
        Shadow shadow0 = spanStyle0.getShadow();
        if(shadow0 != null) {
            this.encode(12);
            this.encode(shadow0);
        }
    }

    public final void encode(@NotNull FontWeight fontWeight0) {
        this.encode(fontWeight0.getWeight());
    }

    public final void encode(@NotNull TextDecoration textDecoration0) {
        this.encode(textDecoration0.getMask());
    }

    public final void encode(@NotNull TextGeometricTransform textGeometricTransform0) {
        this.encode(textGeometricTransform0.getScaleX());
        this.encode(textGeometricTransform0.getSkewX());
    }

    public final void encode(@NotNull String s) {
        this.a.writeString(s);
    }

    public final void encode--R2X_6o(long v) {
        long v1 = TextUnit.getType-UIouoOA(v);
        int v2 = 0;
        if(!TextUnitType.equals-impl0(v1, 0L)) {
            if(TextUnitType.equals-impl0(v1, 0x100000000L)) {
                v2 = 1;
            }
            else if(TextUnitType.equals-impl0(v1, 0x200000000L)) {
                v2 = 2;
            }
        }
        this.encode(((byte)v2));
        if(!TextUnitType.equals-impl0(TextUnit.getType-UIouoOA(v), 0L)) {
            this.encode(TextUnit.getValue-impl(v));
        }
    }

    public final void encode-4Dl_Bck(float f) {
        this.encode(f);
    }

    public final void encode-6p3vJLY(int v) {
        int v1 = 0;
        if(!FontSynthesis.equals-impl0(v, 0)) {
            if(FontSynthesis.equals-impl0(v, 1)) {
                v1 = 1;
            }
            else if(FontSynthesis.equals-impl0(v, 2)) {
                v1 = 2;
            }
            else if(FontSynthesis.equals-impl0(v, 3)) {
                v1 = 3;
            }
        }
        this.encode(((byte)v1));
    }

    public final void encode-8_81llA(long v) {
        this.encode-VKZWuLQ(v);
    }

    public final void encode-VKZWuLQ(long v) {
        this.a.writeLong(v);
    }

    // 去混淆评级： 低(30)
    public final void encode-nzbMABs(int v) {
        this.encode(((byte)(FontStyle.equals-impl0(v, 0) || !FontStyle.equals-impl0(v, 1) ? 0 : 1)));
    }

    @NotNull
    public final String encodedString() {
        return Base64.encodeToString(this.a.marshall(), 0);
    }

    public final void reset() {
        this.a.recycle();
        this.a = Parcel.obtain();
    }
}

