package com.bumptech.glide.load.engine;

public final class a0 implements Appendable {
    public final Appendable a;
    public boolean b;

    public a0(Appendable appendable0) {
        this.b = true;
        this.a = appendable0;
    }

    @Override
    public final Appendable append(char c) {
        Appendable appendable0 = this.a;
        boolean z = false;
        if(this.b) {
            this.b = false;
            appendable0.append("  ");
        }
        if(c == 10) {
            z = true;
        }
        this.b = z;
        appendable0.append(c);
        return this;
    }

    @Override
    public final Appendable append(CharSequence charSequence0) {
        if(charSequence0 == null) {
            charSequence0 = "";
        }
        this.append(charSequence0, 0, charSequence0.length());
        return this;
    }

    @Override
    public final Appendable append(CharSequence charSequence0, int v, int v1) {
        if(charSequence0 == null) {
            charSequence0 = "";
        }
        Appendable appendable0 = this.a;
        boolean z = false;
        if(this.b) {
            this.b = false;
            appendable0.append("  ");
        }
        if(charSequence0.length() > 0 && charSequence0.charAt(v1 - 1) == 10) {
            z = true;
        }
        this.b = z;
        appendable0.append(charSequence0, v, v1);
        return this;
    }
}

