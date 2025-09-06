package com.google.firebase.heartbeatinfo;

import androidx.annotation.NonNull;

public interface HeartBeatInfo {
    public static enum HeartBeat {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);

        public final int a;

        public HeartBeat(int v1) {
            this.a = v1;
        }

        public int getCode() {
            return this.a;
        }
    }

    @NonNull
    HeartBeat getHeartBeatCode(@NonNull String arg1);
}

