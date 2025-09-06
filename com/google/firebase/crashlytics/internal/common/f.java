package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.FilenameFilter;

public final class f implements FilenameFilter {
    public final int a;

    public f(int v) {
        this.a = v;
        super();
    }

    @Override
    public final boolean accept(File file0, String s) {
        switch(this.a) {
            case 0: {
                return s.startsWith(".ae");
            }
            case 1: {
                return s.startsWith("event");
            }
            default: {
                return s.startsWith("event") && !s.endsWith("_");
            }
        }
    }
}

