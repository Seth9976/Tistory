package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;

public final class BidiFormatter {
    public static final class Builder {
        public final boolean a;
        public int b;
        public TextDirectionHeuristicCompat c;

        public Builder() {
            this.a = TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
            this.c = BidiFormatter.d;
            this.b = 2;
        }

        public Builder(Locale locale0) {
            this.a = TextUtilsCompat.getLayoutDirectionFromLocale(locale0) == 1;
            this.c = BidiFormatter.d;
            this.b = 2;
        }

        public Builder(boolean z) {
            this.a = z;
            this.c = BidiFormatter.d;
            this.b = 2;
        }

        public BidiFormatter build() {
            if(this.b == 2 && this.c == BidiFormatter.d) {
                return this.a ? BidiFormatter.h : BidiFormatter.g;
            }
            return new BidiFormatter(this.a, this.b, this.c);
        }

        public Builder setTextDirectionHeuristic(TextDirectionHeuristicCompat textDirectionHeuristicCompat0) {
            this.c = textDirectionHeuristicCompat0;
            return this;
        }

        public Builder stereoReset(boolean z) {
            if(z) {
                this.b |= 2;
                return this;
            }
            this.b &= -3;
            return this;
        }
    }

    public final boolean a;
    public final int b;
    public final TextDirectionHeuristicCompat c;
    public static final TextDirectionHeuristicCompat d;
    public static final String e;
    public static final String f;
    public static final BidiFormatter g;
    public static final BidiFormatter h;

    static {
        BidiFormatter.d = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
        BidiFormatter.e = "‎";
        BidiFormatter.f = "\u200F";
        BidiFormatter.g = new BidiFormatter(false, 2, TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR);
        BidiFormatter.h = new BidiFormatter(true, 2, TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR);
    }

    public BidiFormatter(boolean z, int v, TextDirectionHeuristicCompat textDirectionHeuristicCompat0) {
        this.a = z;
        this.b = v;
        this.c = textDirectionHeuristicCompat0;
    }

    public static int a(CharSequence charSequence0) {
        int v5;
        a a0 = new a(charSequence0);
        a0.c = 0;
        int v = 0;
        int v1 = 0;
        int v2 = 0;
        while(true) {
            int v3 = a0.c;
            if(v3 >= a0.b || v != 0) {
                break;
            }
            CharSequence charSequence1 = a0.a;
            char c = charSequence1.charAt(v3);
            a0.d = c;
            if(Character.isHighSurrogate(c)) {
                int v4 = Character.codePointAt(charSequence1, a0.c);
                a0.c = Character.charCount(v4) + a0.c;
                v5 = Character.getDirectionality(v4);
            }
            else {
                ++a0.c;
                int v6 = a0.d;
                v5 = v6 < 0x700 ? a.e[v6] : Character.getDirectionality(((char)v6));
            }
        alab1:
            switch(v5) {
                case 0: {
                label_35:
                    if(v2 == 0) {
                        return -1;
                    }
                    break;
                }
                case 1: {
                label_37:
                    if(v2 != 0) {
                        break;
                    }
                    return 1;
                }
                default: {
                    if(v5 == 2) {
                        goto label_37;
                    }
                    else {
                        if(v5 == 9) {
                            continue;
                        }
                        switch(v5) {
                            case 14: 
                            case 15: {
                                ++v2;
                                v1 = -1;
                                continue;
                            }
                            case 16: 
                            case 17: {
                                ++v2;
                                v1 = 1;
                                continue;
                            }
                            case 18: {
                                --v2;
                                v1 = 0;
                                continue;
                            }
                            default: {
                                break alab1;
                            }
                        }
                    }
                    goto label_35;
                }
            }
            v = v2;
        }
        if(v != 0) {
            if(v1 != 0) {
                return v1;
            }
            while(a0.c > 0) {
                switch(a0.a()) {
                    case 14: 
                    case 15: {
                        if(v == v2) {
                            return -1;
                        }
                        --v2;
                        continue;
                    }
                    case 16: 
                    case 17: {
                        if(v != v2) {
                            --v2;
                            continue;
                        }
                        return 1;
                    }
                    case 18: {
                        ++v2;
                    }
                }
            }
        }
        return 0;
    }

    public static int b(CharSequence charSequence0) {
        a a0 = new a(charSequence0);
        a0.c = a0.b;
        int v = 0;
    alab1:
        while(true) {
            int v1 = v;
        label_4:
            if(a0.c <= 0) {
                return 0;
            }
            switch(a0.a()) {
                case 0: {
                    if(v == 0) {
                        return -1;
                    }
                    if(v1 != 0) {
                        goto label_4;
                    }
                    break;
                }
                case 1: 
                case 2: {
                    if(v == 0) {
                        return 1;
                    }
                    if(v1 != 0) {
                        goto label_4;
                    }
                    break;
                }
                case 9: {
                    goto label_4;
                }
                case 14: 
                case 15: {
                    break alab1;
                }
                case 16: 
                case 17: {
                    goto label_16;
                }
                case 18: {
                    ++v;
                    goto label_4;
                }
                default: {
                    if(v1 != 0) {
                        goto label_4;
                    }
                }
            }
        }
        if(v1 == v) {
            return -1;
        label_16:
            if(v1 == v) {
                return 1;
            }
        }
        --v;
        goto label_4;
    }

    public static BidiFormatter getInstance() {
        return new Builder().build();
    }

    public static BidiFormatter getInstance(Locale locale0) {
        return new Builder(locale0).build();
    }

    public static BidiFormatter getInstance(boolean z) {
        return new Builder(z).build();
    }

    public boolean getStereoReset() {
        return (this.b & 2) != 0;
    }

    public boolean isRtl(CharSequence charSequence0) {
        int v = charSequence0.length();
        return this.c.isRtl(charSequence0, 0, v);
    }

    public boolean isRtl(String s) {
        return this.isRtl(s);
    }

    public boolean isRtlContext() {
        return this.a;
    }

    public CharSequence unicodeWrap(CharSequence charSequence0) {
        return this.unicodeWrap(charSequence0, this.c, true);
    }

    public CharSequence unicodeWrap(CharSequence charSequence0, TextDirectionHeuristicCompat textDirectionHeuristicCompat0) {
        return this.unicodeWrap(charSequence0, textDirectionHeuristicCompat0, true);
    }

    public CharSequence unicodeWrap(CharSequence charSequence0, TextDirectionHeuristicCompat textDirectionHeuristicCompat0, boolean z) {
        String s1;
        if(charSequence0 == null) {
            return null;
        }
        boolean z1 = textDirectionHeuristicCompat0.isRtl(charSequence0, 0, charSequence0.length());
        CharSequence charSequence1 = new SpannableStringBuilder();
        String s = "";
        boolean z2 = this.a;
        if(this.getStereoReset() && z) {
            boolean z3 = (z1 ? TextDirectionHeuristicsCompat.RTL : TextDirectionHeuristicsCompat.LTR).isRtl(charSequence0, 0, charSequence0.length());
            if(z2 || !z3 && BidiFormatter.a(charSequence0) != 1) {
                s1 = !z2 || z3 && BidiFormatter.a(charSequence0) != -1 ? "" : "\u200F";
            }
            else {
                s1 = "‎";
            }
            ((SpannableStringBuilder)charSequence1).append(s1);
        }
        if(z1 == z2) {
            ((SpannableStringBuilder)charSequence1).append(charSequence0);
        }
        else {
            ((SpannableStringBuilder)charSequence1).append(((char)(z1 ? 0x202B : 0x202A)));
            ((SpannableStringBuilder)charSequence1).append(charSequence0);
            ((SpannableStringBuilder)charSequence1).append('‬');
        }
        if(z) {
            boolean z4 = (z1 ? TextDirectionHeuristicsCompat.RTL : TextDirectionHeuristicsCompat.LTR).isRtl(charSequence0, 0, charSequence0.length());
            if(!z2 && (z4 || BidiFormatter.b(charSequence0) == 1)) {
                s = "‎";
            }
            else if(z2 && (!z4 || BidiFormatter.b(charSequence0) == -1)) {
                s = "\u200F";
            }
            ((SpannableStringBuilder)charSequence1).append(s);
        }
        return charSequence1;
    }

    public CharSequence unicodeWrap(CharSequence charSequence0, boolean z) {
        return this.unicodeWrap(charSequence0, this.c, z);
    }

    public String unicodeWrap(String s) {
        return this.unicodeWrap(s, this.c, true);
    }

    public String unicodeWrap(String s, TextDirectionHeuristicCompat textDirectionHeuristicCompat0) {
        return this.unicodeWrap(s, textDirectionHeuristicCompat0, true);
    }

    public String unicodeWrap(String s, TextDirectionHeuristicCompat textDirectionHeuristicCompat0, boolean z) {
        return s == null ? null : this.unicodeWrap(s, textDirectionHeuristicCompat0, z).toString();
    }

    public String unicodeWrap(String s, boolean z) {
        return this.unicodeWrap(s, this.c, z);
    }
}

