package com.google.gson.internal;

import java.math.BigDecimal;

public final class LazilyParsedNumber extends Number {
    public final String a;

    public LazilyParsedNumber(String s) {
        this.a = s;
    }

    @Override
    public double doubleValue() {
        return Double.parseDouble(this.a);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 instanceof LazilyParsedNumber) {
            String s = ((LazilyParsedNumber)object0).a;
            return this.a == s || this.a.equals(s);
        }
        return false;
    }

    @Override
    public float floatValue() {
        return Float.parseFloat(this.a);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public int intValue() {
        String s;
        try {
            s = this.a;
            return Integer.parseInt(s);
        }
        catch(NumberFormatException unused_ex) {
            try {
                return (int)Long.parseLong(s);
            }
            catch(NumberFormatException unused_ex) {
                return new BigDecimal(s).intValue();
            }
        }
    }

    @Override
    public long longValue() {
        String s;
        try {
            s = this.a;
            return Long.parseLong(s);
        }
        catch(NumberFormatException unused_ex) {
            return new BigDecimal(s).longValue();
        }
    }

    @Override
    public String toString() {
        return this.a;
    }
}

