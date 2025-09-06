package com.google.android.gms.internal.measurement;

import java.io.IOException;

public class zzkp extends IOException {
    public static final int a;

    public zzkp(String s) {
        super(s);
    }

    public static zzkp a() {
        return new zzkp("Protocol message had invalid UTF-8.");
    }

    public static zzkp b() {
        return new zzkp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzkp c() {
        return new zzkp("Failed to parse the message.");
    }

    public static zzkp d() {
        return new zzkp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}

