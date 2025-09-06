package j7;

import androidx.appcompat.view.menu.f;
import com.google.android.gms.internal.common.zzo;
import com.google.android.gms.internal.common.zzs;
import com.google.android.gms.internal.common.zzx;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class i implements Iterator {
    public String a;
    public int b;
    public final CharSequence c;
    public final boolean d;
    public int e;
    public int f;
    public final f g;

    public i(f f0, zzx zzx0, CharSequence charSequence0) {
        this.g = f0;
        this.b = 2;
        this.e = 0;
        this.d = zzx0.b;
        this.f = 0x7FFFFFFF;
        this.c = charSequence0;
    }

    @Override
    public final boolean hasNext() {
        int v5;
        CharSequence charSequence0;
        int v2;
        String s = null;
        int v = this.b;
        switch(v) {
            case 0: {
                throw null;
            }
            case 4: {
                throw new IllegalStateException();
            }
            default: {
                switch(v - 1) {
                    case 0: {
                        return true;
                    label_6:
                        this.b = 4;
                        int v1 = this.e;
                        while(true) {
                            v2 = this.e;
                            if(v2 == -1) {
                                goto label_50;
                            }
                            f f0 = this.g;
                            charSequence0 = this.c;
                            int v3 = charSequence0.length();
                            zzs.zzb(v2, v3, "index");
                            while(true) {
                                if(v2 < v3) {
                                    int v4 = charSequence0.charAt(v2);
                                    if(((zzo)f0.b).zza(((char)v4))) {
                                        break;
                                    }
                                    else {
                                        ++v2;
                                        continue;
                                    }
                                }
                                v2 = -1;
                                break;
                            }
                            if(v2 == -1) {
                                v2 = charSequence0.length();
                                this.e = -1;
                                v5 = -1;
                            }
                            else {
                                v5 = v2 + 1;
                                this.e = v5;
                            }
                            if(v5 == v1) {
                                this.e = v5 + 1;
                                if(v5 + 1 <= charSequence0.length()) {
                                    continue;
                                }
                                this.e = -1;
                                continue;
                            }
                            else {
                                if(v1 < v2) {
                                    charSequence0.charAt(v1);
                                }
                                if(v1 < v2) {
                                    charSequence0.charAt(v2 - 1);
                                }
                                if(this.d && v1 == v2) {
                                    v1 = this.e;
                                    continue;
                                }
                                break;
                            }
                            goto label_51;
                        }
                        int v6 = this.f;
                        if(v6 == 1) {
                            v2 = charSequence0.length();
                            this.e = -1;
                            if(v2 > v1) {
                                charSequence0.charAt(v2 - 1);
                            }
                        }
                        else {
                            this.f = v6 - 1;
                        }
                        s = charSequence0.subSequence(v1, v2).toString();
                        goto label_51;
                    label_50:
                        this.b = 3;
                    label_51:
                        this.a = s;
                        if(this.b != 3) {
                            this.b = 1;
                            return true;
                        }
                        break;
                    }
                    case 2: {
                        break;
                    }
                    default: {
                        goto label_6;
                    }
                }
                return false;
            }
        }
    }

    @Override
    public final Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = 2;
        String s = this.a;
        this.a = null;
        return s;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

