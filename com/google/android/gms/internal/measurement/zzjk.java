package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzjk extends IOException {
    public zzjk(IndexOutOfBoundsException indexOutOfBoundsException0) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException0);
    }

    public zzjk(String s, IndexOutOfBoundsException indexOutOfBoundsException0) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + s, indexOutOfBoundsException0);
    }
}

