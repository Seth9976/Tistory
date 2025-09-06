package androidx.compose.ui.graphics;

import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import androidx.annotation.RequiresApi;
import androidx.webkit.internal.k;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p1.a;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u0014\u0010\u0000\u001A\u00020\u0001*\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001A\u0016\u0010\u0005\u001A\u00020\u0006*\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001A\u0011\u0010\t\u001A\u00020\u0002*\u00020\u0006H\u0001¢\u0006\u0002\u0010\n\u001A\u0016\u0010\u000B\u001A\u00020\f*\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000E\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u000F"}, d2 = {"isSupported", "", "Landroidx/compose/ui/graphics/BlendMode;", "isSupported-s9anfk8", "(I)Z", "toAndroidBlendMode", "Landroid/graphics/BlendMode;", "toAndroidBlendMode-s9anfk8", "(I)Landroid/graphics/BlendMode;", "toComposeBlendMode", "(Landroid/graphics/BlendMode;)I", "toPorterDuffMode", "Landroid/graphics/PorterDuff$Mode;", "toPorterDuffMode-s9anfk8", "(I)Landroid/graphics/PorterDuff$Mode;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidBlendMode_androidKt {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[a.e().length];
            try {
                arr_v[0] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[1] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[2] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[3] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[4] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[5] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[6] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[7] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[8] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[9] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[10] = 11;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[11] = 12;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[12] = 13;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[13] = 14;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[14] = 15;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[15] = 16;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[16] = 17;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[17] = 18;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[18] = 19;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[19] = 20;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[20] = 21;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[21] = 22;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[22] = 23;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[23] = 24;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[24] = 25;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[25] = 26;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[26] = 27;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[27] = 28;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[28] = 29;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    // 去混淆评级： 低(30)
    public static final boolean isSupported-s9anfk8(int v) {
        return Build.VERSION.SDK_INT >= 29 || BlendMode.equals-impl0(v, 3) || AndroidBlendMode_androidKt.toPorterDuffMode-s9anfk8(v) != PorterDuff.Mode.SRC_OVER;
    }

    @RequiresApi(29)
    @NotNull
    public static final android.graphics.BlendMode toAndroidBlendMode-s9anfk8(int v) {
        if(BlendMode.equals-impl0(v, 0)) {
            return a.B();
        }
        if(BlendMode.equals-impl0(v, 1)) {
            return k.D();
        }
        if(BlendMode.equals-impl0(v, 2)) {
            return a.h();
        }
        if(BlendMode.equals-impl0(v, 3)) {
            return a.g();
        }
        if(BlendMode.equals-impl0(v, 4)) {
            return a.i();
        }
        if(BlendMode.equals-impl0(v, 5)) {
            return a.j();
        }
        if(BlendMode.equals-impl0(v, 6)) {
            return a.k();
        }
        if(BlendMode.equals-impl0(v, 7)) {
            return a.l();
        }
        if(BlendMode.equals-impl0(v, 8)) {
            return a.m();
        }
        if(BlendMode.equals-impl0(v, 9)) {
            return a.n();
        }
        if(BlendMode.equals-impl0(v, 10)) {
            return a.o();
        }
        if(BlendMode.equals-impl0(v, 11)) {
            return a.p();
        }
        if(BlendMode.equals-impl0(v, 12)) {
            return a.r();
        }
        if(BlendMode.equals-impl0(v, 13)) {
            return a.s();
        }
        if(BlendMode.equals-impl0(v, 14)) {
            return a.t();
        }
        if(BlendMode.equals-impl0(v, 15)) {
            return a.u();
        }
        if(BlendMode.equals-impl0(v, 16)) {
            return a.v();
        }
        if(BlendMode.equals-impl0(v, 17)) {
            return a.w();
        }
        if(BlendMode.equals-impl0(v, 18)) {
            return k.f();
        }
        if(BlendMode.equals-impl0(v, 19)) {
            return k.A();
        }
        if(BlendMode.equals-impl0(v, 20)) {
            return a.b();
        }
        if(BlendMode.equals-impl0(v, 21)) {
            return a.f();
        }
        if(BlendMode.equals-impl0(v, 22)) {
            return a.q();
        }
        if(BlendMode.equals-impl0(v, 23)) {
            return a.x();
        }
        if(BlendMode.equals-impl0(v, 24)) {
            return a.y();
        }
        if(BlendMode.equals-impl0(v, 25)) {
            return a.z();
        }
        if(BlendMode.equals-impl0(v, 26)) {
            return a.A();
        }
        if(BlendMode.equals-impl0(v, 27)) {
            return a.C();
        }
        return BlendMode.equals-impl0(v, 28) ? a.D() : a.g();
    }

    @RequiresApi(29)
    public static final int toComposeBlendMode(@NotNull android.graphics.BlendMode blendMode0) {
        switch(WhenMappings.$EnumSwitchMapping$0[k.a(blendMode0)]) {
            case 1: {
                return 0;
            }
            case 2: {
                return 1;
            }
            case 3: {
                return 2;
            }
            case 4: {
                return 3;
            }
            case 5: {
                return 4;
            }
            case 6: {
                return 5;
            }
            case 7: {
                return 6;
            }
            case 8: {
                return 7;
            }
            case 9: {
                return 8;
            }
            case 10: {
                return 9;
            }
            case 11: {
                return 10;
            }
            case 12: {
                return 11;
            }
            case 13: {
                return 12;
            }
            case 14: {
                return 13;
            }
            case 15: {
                return 14;
            }
            case 16: {
                return 15;
            }
            case 17: {
                return 16;
            }
            case 18: {
                return 17;
            }
            case 19: {
                return 18;
            }
            case 20: {
                return 19;
            }
            case 21: {
                return 20;
            }
            case 22: {
                return 21;
            }
            case 23: {
                return 22;
            }
            case 24: {
                return 23;
            }
            case 25: {
                return 24;
            }
            case 26: {
                return 25;
            }
            case 27: {
                return 26;
            }
            case 28: {
                return 27;
            }
            case 29: {
                return 28;
            }
            default: {
                return 3;
            }
        }
    }

    @NotNull
    public static final PorterDuff.Mode toPorterDuffMode-s9anfk8(int v) {
        if(BlendMode.equals-impl0(v, 0)) {
            return PorterDuff.Mode.CLEAR;
        }
        if(BlendMode.equals-impl0(v, 1)) {
            return PorterDuff.Mode.SRC;
        }
        if(BlendMode.equals-impl0(v, 2)) {
            return PorterDuff.Mode.DST;
        }
        if(BlendMode.equals-impl0(v, 3)) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if(BlendMode.equals-impl0(v, 4)) {
            return PorterDuff.Mode.DST_OVER;
        }
        if(BlendMode.equals-impl0(v, 5)) {
            return PorterDuff.Mode.SRC_IN;
        }
        if(BlendMode.equals-impl0(v, 6)) {
            return PorterDuff.Mode.DST_IN;
        }
        if(BlendMode.equals-impl0(v, 7)) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if(BlendMode.equals-impl0(v, 8)) {
            return PorterDuff.Mode.DST_OUT;
        }
        if(BlendMode.equals-impl0(v, 9)) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if(BlendMode.equals-impl0(v, 10)) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if(BlendMode.equals-impl0(v, 11)) {
            return PorterDuff.Mode.XOR;
        }
        if(BlendMode.equals-impl0(v, 12)) {
            return PorterDuff.Mode.ADD;
        }
        if(BlendMode.equals-impl0(v, 14)) {
            return PorterDuff.Mode.SCREEN;
        }
        if(BlendMode.equals-impl0(v, 15)) {
            return PorterDuff.Mode.OVERLAY;
        }
        if(BlendMode.equals-impl0(v, 16)) {
            return PorterDuff.Mode.DARKEN;
        }
        if(BlendMode.equals-impl0(v, 17)) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return BlendMode.equals-impl0(v, 13) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}

