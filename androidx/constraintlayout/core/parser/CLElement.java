package androidx.constraintlayout.core.parser;

import a5.b;

public class CLElement {
    protected static int BASE_INDENT = 2;
    protected static int MAX_LINE = 80;
    public final char[] a;
    public int b;
    protected long end;
    protected CLContainer mContainer;
    protected long start;

    public CLElement(char[] arr_c) {
        this.start = -1L;
        this.end = 0x7FFFFFFFFFFFFFFFL;
        this.a = arr_c;
    }

    public void addIndent(StringBuilder stringBuilder0, int v) {
        for(int v1 = 0; v1 < v; ++v1) {
            stringBuilder0.append(' ');
        }
    }

    public String content() {
        String s = new String(this.a);
        long v = this.end;
        if(v != 0x7FFFFFFFFFFFFFFFL) {
            return v < this.start ? s.substring(((int)this.start), ((int)this.start) + 1) : s.substring(((int)this.start), ((int)v) + 1);
        }
        return s.substring(((int)this.start), ((int)this.start) + 1);
    }

    public CLElement getContainer() {
        return this.mContainer;
    }

    public String getDebugName() [...] // Inlined contents

    public long getEnd() {
        return this.end;
    }

    // 去混淆评级： 低(20)
    public float getFloat() {
        return this instanceof CLNumber ? ((CLNumber)this).getFloat() : NaNf;
    }

    // 去混淆评级： 低(20)
    public int getInt() {
        return this instanceof CLNumber ? ((CLNumber)this).getInt() : 0;
    }

    public int getLine() {
        return this.b;
    }

    public long getStart() {
        return this.start;
    }

    public String getStrClass() {
        String s = this.getClass().toString();
        return s.substring(s.lastIndexOf(46) + 1);
    }

    public boolean isDone() {
        return this.end != 0x7FFFFFFFFFFFFFFFL;
    }

    public boolean isStarted() {
        return this.start > -1L;
    }

    public boolean notStarted() {
        return this.start == -1L;
    }

    public void setContainer(CLContainer cLContainer0) {
        this.mContainer = cLContainer0;
    }

    public void setEnd(long v) {
        if(this.end != 0x7FFFFFFFFFFFFFFFL) {
            return;
        }
        this.end = v;
        CLContainer cLContainer0 = this.mContainer;
        if(cLContainer0 != null) {
            cLContainer0.add(this);
        }
    }

    public void setLine(int v) {
        this.b = v;
    }

    public void setStart(long v) {
        this.start = v;
    }

    public String toFormattedJSON(int v, int v1) {
        return "";
    }

    public String toJSON() [...] // 潜在的解密器

    @Override
    public String toString() {
        if(this.start <= this.end && this.end != 0x7FFFFFFFFFFFFFFFL) {
            String s = new String(this.a).substring(((int)this.start), ((int)this.end) + 1);
            return this.getStrClass() + " (" + this.start + " : " + this.end + ") <<" + s + ">>";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.getClass());
        stringBuilder0.append(" (INVALID, ");
        stringBuilder0.append(this.start);
        stringBuilder0.append("-");
        return b.g(this.end, ")", stringBuilder0);
    }
}

