package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public abstract class FieldNamingPolicy extends Enum implements FieldNamingStrategy {
    public static final enum FieldNamingPolicy IDENTITY;
    public static final enum FieldNamingPolicy LOWER_CASE_WITH_DASHES;
    public static final enum FieldNamingPolicy LOWER_CASE_WITH_DOTS;
    public static final enum FieldNamingPolicy LOWER_CASE_WITH_UNDERSCORES;
    public static final enum FieldNamingPolicy UPPER_CAMEL_CASE;
    public static final enum FieldNamingPolicy UPPER_CAMEL_CASE_WITH_SPACES;
    public static final enum FieldNamingPolicy UPPER_CASE_WITH_UNDERSCORES;
    public static final FieldNamingPolicy[] a;

    static {
        a a0 = new a();
        FieldNamingPolicy.IDENTITY = a0;
        b b0 = new b();
        FieldNamingPolicy.UPPER_CAMEL_CASE = b0;
        com.google.gson.FieldNamingPolicy.c c0 = new FieldNamingPolicy() {
            @Override  // com.google.gson.FieldNamingStrategy
            public final String translateName(Field field0) {
                return FieldNamingPolicy.b(FieldNamingPolicy.a(field0.getName(), ' '));
            }
        };
        FieldNamingPolicy.UPPER_CAMEL_CASE_WITH_SPACES = c0;
        com.google.gson.FieldNamingPolicy.d d0 = new FieldNamingPolicy() {
            @Override  // com.google.gson.FieldNamingStrategy
            public final String translateName(Field field0) {
                return FieldNamingPolicy.a(field0.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        FieldNamingPolicy.UPPER_CASE_WITH_UNDERSCORES = d0;
        com.google.gson.FieldNamingPolicy.e e0 = new FieldNamingPolicy() {
            @Override  // com.google.gson.FieldNamingStrategy
            public final String translateName(Field field0) {
                return FieldNamingPolicy.a(field0.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES = e0;
        com.google.gson.FieldNamingPolicy.f f0 = new FieldNamingPolicy() {
            @Override  // com.google.gson.FieldNamingStrategy
            public final String translateName(Field field0) {
                return FieldNamingPolicy.a(field0.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        FieldNamingPolicy.LOWER_CASE_WITH_DASHES = f0;
        com.google.gson.FieldNamingPolicy.g g0 = new FieldNamingPolicy() {
            @Override  // com.google.gson.FieldNamingStrategy
            public final String translateName(Field field0) {
                return FieldNamingPolicy.a(field0.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        };
        FieldNamingPolicy.LOWER_CASE_WITH_DOTS = g0;
        FieldNamingPolicy.a = new FieldNamingPolicy[]{a0, b0, c0, d0, e0, f0, g0};
    }

    public static String a(String s, char c) {
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = s.charAt(v1);
            if(Character.isUpperCase(((char)v2)) && stringBuilder0.length() != 0) {
                stringBuilder0.append(c);
            }
            stringBuilder0.append(((char)v2));
        }
        return stringBuilder0.toString();
    }

    public static String b(String s) {
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = s.charAt(v1);
            if(Character.isLetter(((char)v2))) {
                if(Character.isUpperCase(((char)v2))) {
                    return s;
                }
                int v3 = Character.toUpperCase(((char)v2));
                return v1 == 0 ? ((char)v3) + s.substring(1) : s.substring(0, v1) + ((char)v3) + s.substring(v1 + 1);
            }
        }
        return s;
    }

    public static FieldNamingPolicy valueOf(String s) {
        return (FieldNamingPolicy)Enum.valueOf(FieldNamingPolicy.class, s);
    }

    public static FieldNamingPolicy[] values() {
        return (FieldNamingPolicy[])FieldNamingPolicy.a.clone();
    }
}

