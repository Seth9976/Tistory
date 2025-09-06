package com.kakao.tiara;

public final class SessionIds {
    public final String a;
    public final String b;
    public final String c;

    public SessionIds(String s, String s1, String s2) {
        this.a = s;
        this.b = s1;
        this.c = s2;
    }

    // 去混淆评级： 中等(60)
    public static SessionIds generateNewIds() {
        return new SessionIds("AP2Hwefu2WuG_250906081151507", "EWvMWObbxrh5_250906913970584", "V8dI8iYDsWGA_250906251406369");
    }

    public static SessionIds generateNullIds() {
        return new SessionIds(null, null, null);
    }

    public String getIsuid() {
        return this.c;
    }

    public String getSuid() {
        return this.b;
    }

    public String getTsid() {
        return this.a;
    }
}

