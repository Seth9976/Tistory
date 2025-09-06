package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration.Companion;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\f\u001A\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0013\u0010\u000F\u001A\u00020\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000E\u0010\u000BJ\r\u0010\u0011\u001A\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0016\u001A\u00020\u0013ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0019\u001A\u00020\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0015\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006\u001A"}, d2 = {"Landroidx/compose/ui/platform/DecodeHelper;", "", "", "string", "<init>", "(Ljava/lang/String;)V", "Landroidx/compose/ui/text/SpanStyle;", "decodeSpanStyle", "()Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/graphics/Color;", "decodeColor-0d7_KjU", "()J", "decodeColor", "Landroidx/compose/ui/unit/TextUnit;", "decodeTextUnit-XSAIIZE", "decodeTextUnit", "Landroidx/compose/ui/text/font/FontWeight;", "decodeFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "decodeFontStyle-_-LCdwA", "()I", "decodeFontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "decodeFontSynthesis-GVVA2EU", "decodeFontSynthesis", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DecodeHelper {
    public static final int $stable = 8;
    public final Parcel a;

    public DecodeHelper(@NotNull String s) {
        Parcel parcel0 = Parcel.obtain();
        this.a = parcel0;
        byte[] arr_b = Base64.decode(s, 0);
        parcel0.unmarshall(arr_b, 0, arr_b.length);
        parcel0.setDataPosition(0);
    }

    public final long decodeColor-0d7_KjU() {
        return Color.constructor-impl(ULong.constructor-impl(this.a.readLong()));
    }

    public final int decodeFontStyle-_-LCdwA() {
        int v = this.a.readByte();
        if(v == 0) {
            return 0;
        }
        return v == 1 ? 1 : 0;
    }

    public final int decodeFontSynthesis-GVVA2EU() {
        int v = this.a.readByte();
        if(v == 0) {
            return 0;
        }
        switch(v) {
            case 1: {
                return 1;
            }
            case 2: {
                return 2;
            }
            case 3: {
                return 3;
            }
            default: {
                return 0;
            }
        }
    }

    @NotNull
    public final FontWeight decodeFontWeight() {
        return new FontWeight(this.a.readInt());
    }

    @NotNull
    public final SpanStyle decodeSpanStyle() {
        TextDecoration textDecoration1;
        FontWeight fontWeight0 = null;
        FontStyle fontStyle0 = null;
        FontSynthesis fontSynthesis0 = null;
        String s = null;
        BaselineShift baselineShift0 = null;
        TextGeometricTransform textGeometricTransform0 = null;
        TextDecoration textDecoration0 = null;
        Shadow shadow0 = null;
        long v = 0x7FC00000L;
        long v1 = 0x7FC00000L;
        long v2 = 0L;
    alab1:
        while(true) {
            Parcel parcel0 = this.a;
            boolean z = true;
            if(parcel0.dataAvail() <= 1) {
                break;
            }
            switch(parcel0.readByte()) {
                case 2: {
                    if(parcel0.dataAvail() < 5) {
                        break alab1;
                    }
                    v = this.decodeTextUnit-XSAIIZE();
                    continue;
                }
                case 3: {
                    if(parcel0.dataAvail() < 4) {
                        break alab1;
                    }
                    fontWeight0 = this.decodeFontWeight();
                    continue;
                }
                case 4: {
                    if(parcel0.dataAvail() < 1) {
                        break alab1;
                    }
                    fontStyle0 = FontStyle.box-impl(this.decodeFontStyle-_-LCdwA());
                    continue;
                }
                case 5: {
                    if(parcel0.dataAvail() < 1) {
                        break alab1;
                    }
                    fontSynthesis0 = FontSynthesis.box-impl(this.decodeFontSynthesis-GVVA2EU());
                    continue;
                }
                case 6: {
                    s = parcel0.readString();
                    continue;
                }
                case 7: {
                    if(parcel0.dataAvail() < 5) {
                        break alab1;
                    }
                    v1 = this.decodeTextUnit-XSAIIZE();
                    continue;
                }
                case 8: {
                    if(parcel0.dataAvail() < 4) {
                        break alab1;
                    }
                    baselineShift0 = BaselineShift.box-impl(BaselineShift.constructor-impl(parcel0.readFloat()));
                    continue;
                }
                case 9: {
                    if(parcel0.dataAvail() < 8) {
                        break alab1;
                    }
                    textGeometricTransform0 = new TextGeometricTransform(parcel0.readFloat(), parcel0.readFloat());
                    continue;
                }
                case 10: {
                    if(parcel0.dataAvail() < 8) {
                        break alab1;
                    }
                    v2 = this.decodeColor-0d7_KjU();
                    continue;
                }
                case 11: {
                    if(parcel0.dataAvail() < 4) {
                        break alab1;
                    }
                    int v3 = parcel0.readInt();
                    Companion textDecoration$Companion0 = TextDecoration.Companion;
                    boolean z1 = (textDecoration$Companion0.getLineThrough().getMask() & v3) != 0;
                    if((v3 & textDecoration$Companion0.getUnderline().getMask()) == 0) {
                        z = false;
                    }
                    if(z1 && z) {
                        textDecoration1 = textDecoration$Companion0.combine(CollectionsKt__CollectionsKt.listOf(new TextDecoration[]{textDecoration$Companion0.getLineThrough(), textDecoration$Companion0.getUnderline()}));
                    }
                    else if(z1) {
                        textDecoration1 = textDecoration$Companion0.getLineThrough();
                    }
                    else {
                        textDecoration1 = z ? textDecoration$Companion0.getUnderline() : textDecoration$Companion0.getNone();
                    }
                    textDecoration0 = textDecoration1;
                    continue;
                }
                case 12: {
                    if(parcel0.dataAvail() >= 20) {
                        break;
                    }
                    break alab1;
                }
                default: {
                    continue;
                }
            }
            shadow0 = new Shadow(this.decodeColor-0d7_KjU(), OffsetKt.Offset(parcel0.readFloat(), parcel0.readFloat()), parcel0.readFloat(), null);
        }
        return new SpanStyle(0L, v, fontWeight0, fontStyle0, fontSynthesis0, null, s, v1, baselineShift0, textGeometricTransform0, null, v2, textDecoration0, shadow0, null, null, 0xC000, null);
    }

    // 去混淆评级： 低(25)
    public final long decodeTextUnit-XSAIIZE() {
        Parcel parcel0 = this.a;
        int v = parcel0.readByte();
        if(v == 1) {
            return TextUnitKt.TextUnit-anM5pPY(parcel0.readFloat(), 0x100000000L);
        }
        long v1 = v == 2 ? 0x200000000L : 0L;
        return TextUnitType.equals-impl0(v1, 0L) ? 0x7FC00000L : TextUnitKt.TextUnit-anM5pPY(parcel0.readFloat(), v1);
    }
}

