package s6;

import com.google.android.datatransport.cct.internal.AndroidClientInfo;
import r0.a;

public final class e extends AndroidClientInfo {
    public final Integer a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public e(Integer integer0, String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s10) {
        this.a = integer0;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = s3;
        this.f = s4;
        this.g = s5;
        this.h = s6;
        this.i = s7;
        this.j = s8;
        this.k = s9;
        this.l = s10;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof AndroidClientInfo) {
            AndroidClientInfo androidClientInfo0 = (AndroidClientInfo)object0;
            Integer integer0 = this.a;
            if(integer0 != null) {
                if(integer0.equals(androidClientInfo0.getSdkVersion())) {
                label_9:
                    String s = this.b;
                    if(s != null) {
                        if(s.equals(androidClientInfo0.getModel())) {
                        label_14:
                            String s1 = this.c;
                            if(s1 != null) {
                                if(s1.equals(androidClientInfo0.getHardware())) {
                                label_19:
                                    String s2 = this.d;
                                    if(s2 != null) {
                                        if(s2.equals(androidClientInfo0.getDevice())) {
                                        label_24:
                                            String s3 = this.e;
                                            if(s3 != null) {
                                                if(s3.equals(androidClientInfo0.getProduct())) {
                                                label_29:
                                                    String s4 = this.f;
                                                    if(s4 != null) {
                                                        if(s4.equals(androidClientInfo0.getOsBuild())) {
                                                        label_34:
                                                            String s5 = this.g;
                                                            if(s5 != null) {
                                                                if(s5.equals(androidClientInfo0.getManufacturer())) {
                                                                label_39:
                                                                    String s6 = this.h;
                                                                    if(s6 != null) {
                                                                        if(s6.equals(androidClientInfo0.getFingerprint())) {
                                                                        label_44:
                                                                            String s7 = this.i;
                                                                            if(s7 != null) {
                                                                                if(s7.equals(androidClientInfo0.getLocale())) {
                                                                                label_49:
                                                                                    String s8 = this.j;
                                                                                    if(s8 != null) {
                                                                                        if(s8.equals(androidClientInfo0.getCountry())) {
                                                                                        label_54:
                                                                                            String s9 = this.k;
                                                                                            if(s9 == null) {
                                                                                                if(androidClientInfo0.getMccMnc() == null) {
                                                                                                    return this.l == null ? androidClientInfo0.getApplicationBuild() == null : this.l.equals(androidClientInfo0.getApplicationBuild());
                                                                                                }
                                                                                            }
                                                                                            else if(s9.equals(androidClientInfo0.getMccMnc())) {
                                                                                                return this.l == null ? androidClientInfo0.getApplicationBuild() == null : this.l.equals(androidClientInfo0.getApplicationBuild());
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if(androidClientInfo0.getCountry() == null) {
                                                                                        goto label_54;
                                                                                    }
                                                                                }
                                                                            }
                                                                            else if(androidClientInfo0.getLocale() == null) {
                                                                                goto label_49;
                                                                            }
                                                                        }
                                                                    }
                                                                    else if(androidClientInfo0.getFingerprint() == null) {
                                                                        goto label_44;
                                                                    }
                                                                }
                                                            }
                                                            else if(androidClientInfo0.getManufacturer() == null) {
                                                                goto label_39;
                                                            }
                                                        }
                                                    }
                                                    else if(androidClientInfo0.getOsBuild() == null) {
                                                        goto label_34;
                                                    }
                                                }
                                            }
                                            else if(androidClientInfo0.getProduct() == null) {
                                                goto label_29;
                                            }
                                        }
                                    }
                                    else if(androidClientInfo0.getDevice() == null) {
                                        goto label_24;
                                    }
                                }
                            }
                            else if(androidClientInfo0.getHardware() == null) {
                                goto label_19;
                            }
                        }
                    }
                    else if(androidClientInfo0.getModel() == null) {
                        goto label_14;
                    }
                }
            }
            else if(androidClientInfo0.getSdkVersion() == null) {
                goto label_9;
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final String getApplicationBuild() {
        return this.l;
    }

    @Override  // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final String getCountry() {
        return this.j;
    }

    @Override  // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final String getDevice() {
        return this.d;
    }

    @Override  // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final String getFingerprint() {
        return this.h;
    }

    @Override  // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final String getHardware() {
        return this.c;
    }

    @Override  // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final String getLocale() {
        return this.i;
    }

    @Override  // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final String getManufacturer() {
        return this.g;
    }

    @Override  // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final String getMccMnc() {
        return this.k;
    }

    @Override  // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final String getModel() {
        return this.b;
    }

    @Override  // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final String getOsBuild() {
        return this.f;
    }

    @Override  // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final String getProduct() {
        return this.e;
    }

    @Override  // com.google.android.datatransport.cct.internal.AndroidClientInfo
    public final Integer getSdkVersion() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        int v5 = this.e == null ? 0 : this.e.hashCode();
        int v6 = this.f == null ? 0 : this.f.hashCode();
        int v7 = this.g == null ? 0 : this.g.hashCode();
        int v8 = this.h == null ? 0 : this.h.hashCode();
        int v9 = this.i == null ? 0 : this.i.hashCode();
        int v10 = this.j == null ? 0 : this.j.hashCode();
        int v11 = this.k == null ? 0 : this.k.hashCode();
        String s = this.l;
        if(s != null) {
            v = s.hashCode();
        }
        return v ^ (((((((((((v1 ^ 1000003) * 1000003 ^ v2) * 1000003 ^ v3) * 1000003 ^ v4) * 1000003 ^ v5) * 1000003 ^ v6) * 1000003 ^ v7) * 1000003 ^ v8) * 1000003 ^ v9) * 1000003 ^ v10) * 1000003 ^ v11) * 1000003;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", model=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", hardware=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", device=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", product=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", osBuild=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", manufacturer=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", fingerprint=");
        stringBuilder0.append(this.h);
        stringBuilder0.append(", locale=");
        stringBuilder0.append(this.i);
        stringBuilder0.append(", country=");
        stringBuilder0.append(this.j);
        stringBuilder0.append(", mccMnc=");
        stringBuilder0.append(this.k);
        stringBuilder0.append(", applicationBuild=");
        return a.o(stringBuilder0, this.l, "}");
    }
}

