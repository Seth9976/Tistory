package com.google.firebase.emulators;

import androidx.annotation.NonNull;

public final class EmulatedServiceSettings {
    public final String a;
    public final int b;

    public EmulatedServiceSettings(@NonNull String s, int v) {
        this.a = s;
        this.b = v;
    }

    public String getHost() {
        return this.a;
    }

    public int getPort() {
        return this.b;
    }
}

