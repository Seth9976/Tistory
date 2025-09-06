package com.kakao.kandinsky.crop.contract;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\n\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\tR\u0017\u0010\r\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000B\u0010\u0007\u001A\u0004\b\f\u0010\tR\u0017\u0010\u0013\u001A\u00020\u000E8\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001A\u00020\u000E8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001A\u0004\b\u0015\u0010\u0012j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001Aj\u0002\b\u001Bj\u0002\b\u001Cj\u0002\b\u001Dj\u0002\b\u001E¨\u0006\u001F"}, d2 = {"Lcom/kakao/kandinsky/crop/contract/CropRatioType;", "", "", "isFixedRatio", "()Z", "", "a", "I", "getNameRes", "()I", "nameRes", "b", "getIcon", "icon", "", "c", "F", "getRatioX", "()F", "ratioX", "d", "getRatioY", "ratioY", "Original", "Free", "Ratio1x1", "Ratio4x3", "Ratio3x2", "Ratio16x9", "Ratio2x3", "Ratio3x4", "crop_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum CropRatioType {
    Original(0x7F12029C, 0x7F0701C3, 0.0f, 0.0f),  // string:crop_ratio_original "원본"
    Free(0x7F12029B, 0x7F0701C2, 0.0f, 0.0f),  // string:crop_ratio_free "자유"
    Ratio1x1(0x7F120296, 0x7F0701BD, 1.0f, 1.0f),  // string:crop_ratio_1_1 "1:1"
    Ratio4x3(0x7F12029A, 0x7F0701C1, 4.0f, 3.0f),  // string:crop_ratio_4_3 "4:3"
    Ratio3x2(0x7F120298, 0x7F0701BF, 3.0f, 2.0f),  // string:crop_ratio_3_2 "3:2"
    Ratio16x9(0x7F120295, 0x7F0701BC, 16.0f, 9.0f),  // string:crop_ratio_16_9 "16:9"
    Ratio2x3(0x7F120297, 0x7F0701BE, 2.0f, 3.0f),  // string:crop_ratio_2_3 "2:3"
    Ratio3x4(0x7F120299, 0x7F0701C0, 3.0f, 4.0f);  // string:crop_ratio_3_4 "3:4"

    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public static final CropRatioType[] e;
    public static final EnumEntries f;

    static {
        CropRatioType.e = arr_cropRatioType;
        Intrinsics.checkNotNullParameter(arr_cropRatioType, "entries");
        CropRatioType.f = new a(arr_cropRatioType);
    }

    public CropRatioType(int v1, int v2, float f, float f1) {
        this.a = v1;
        this.b = v2;
        this.c = f;
        this.d = f1;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return CropRatioType.f;
    }

    public final int getIcon() {
        return this.b;
    }

    public final int getNameRes() {
        return this.a;
    }

    public final float getRatioX() {
        return this.c;
    }

    public final float getRatioY() {
        return this.d;
    }

    public final boolean isFixedRatio() [...] // 潜在的解密器
}

