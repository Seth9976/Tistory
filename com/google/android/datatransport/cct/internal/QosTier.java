package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;
import androidx.annotation.Nullable;

public enum QosTier {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);

    public final int a;

    static {
        SparseArray sparseArray0 = new SparseArray();
        sparseArray0.put(0, QosTier.DEFAULT);
        sparseArray0.put(1, QosTier.UNMETERED_ONLY);
        sparseArray0.put(2, QosTier.UNMETERED_OR_DAILY);
        sparseArray0.put(3, QosTier.FAST_IF_RADIO_AWAKE);
        sparseArray0.put(4, QosTier.NEVER);
        sparseArray0.put(-1, QosTier.UNRECOGNIZED);
    }

    public QosTier(int v1) {
        this.a = v1;
    }

    @Nullable
    public static QosTier forNumber(int v) {
        switch(v) {
            case 0: {
                return QosTier.DEFAULT;
            }
            case 1: {
                return QosTier.UNMETERED_ONLY;
            }
            case 2: {
                return QosTier.UNMETERED_OR_DAILY;
            }
            case 3: {
                return QosTier.FAST_IF_RADIO_AWAKE;
            }
            case 4: {
                return QosTier.NEVER;
            }
            default: {
                return null;
            }
        }
    }

    public final int getNumber() {
        return this.a;
    }
}

