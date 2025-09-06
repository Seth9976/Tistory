package com.google.firebase.platforminfo;

import android.content.Context;
import com.google.firebase.components.Component;
import com.google.firebase.components.Dependency;
import y8.a;
import y8.b;

public class LibraryVersionComponent {
    public interface VersionExtractor {
        String extract(Object arg1);
    }

    public static Component create(String s, String s1) {
        return Component.intoSet(new a(s, s1), a.class);
    }

    public static Component fromContext(String s, VersionExtractor libraryVersionComponent$VersionExtractor0) {
        return Component.intoSetBuilder(a.class).add(Dependency.required(Context.class)).factory(new b(libraryVersionComponent$VersionExtractor0, 0, s)).build();
    }
}

