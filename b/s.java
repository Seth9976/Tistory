package b;

import com.kakao.kandinsky.preview.DimState;
import kotlin.jvm.internal.Intrinsics;
import sd.a;

public enum s {
    Home(null, true, 1),
    Resize(null, false, 3),
    Crop(DimState.None, false, 2),
    Effect(null, true, 1),
    Signature(null, false, 3),
    Sticker(DimState.Image, false, 2),
    Mosaic(null, false, 3),
    Text(DimState.Image, false, 2),
    Border(null, false, 3);

    public final DimState a;
    public final boolean b;
    public static final r c;
    public static final s[] m;

    static {
        s.m = arr_s;
        Intrinsics.checkNotNullParameter(arr_s, "entries");
        new a(arr_s);
        s.c = new r();
    }

    public s(DimState dimState0, boolean z) {
        this.a = dimState0;
        this.b = z;
    }

    public s(DimState dimState0, boolean z, int v1) {
        if((v1 & 1) != 0) {
            dimState0 = DimState.Decoration;
        }
        if((v1 & 2) != 0) {
            z = false;
        }
        this(dimState0, z);
    }
}

