package androidx.constraintlayout.core.parser;

import l1.a;

public class CLParser {
    public final String a;
    public boolean b;
    public int c;

    public CLParser(String s) {
        this.b = false;
        this.a = s;
    }

    public final CLElement a(CLElement cLElement0, int v, int v1, char[] arr_c) {
        CLElement cLElement1;
        switch(a.c(v1)) {
            case 1: {
                cLElement1 = CLObject.allocate(arr_c);
                ++v;
                break;
            }
            case 2: {
                cLElement1 = CLArray.allocate(arr_c);
                ++v;
                break;
            }
            case 3: {
                cLElement1 = CLNumber.allocate(arr_c);
                break;
            }
            case 4: {
                cLElement1 = CLString.allocate(arr_c);
                break;
            }
            case 5: {
                cLElement1 = CLKey.allocate(arr_c);
                break;
            }
            case 6: {
                cLElement1 = CLToken.allocate(arr_c);
                break;
            }
            default: {
                cLElement1 = null;
            }
        }
        if(cLElement1 == null) {
            return null;
        }
        cLElement1.setLine(this.c);
        cLElement1.setStart(((long)v));
        if(cLElement0 instanceof CLContainer) {
            cLElement1.setContainer(((CLContainer)cLElement0));
        }
        return cLElement1;
    }

    public final CLElement b(int v, char c, CLElement cLElement0, char[] arr_c) {
        switch(c) {
            case 34: 
            case 39: {
                return cLElement0 instanceof CLObject ? this.a(cLElement0, v, 6, arr_c) : this.a(cLElement0, v, 5, arr_c);
            }
            case 0x2F: {
                if(v + 1 < arr_c.length && arr_c[v + 1] == 0x2F) {
                    this.b = true;
                    return cLElement0;
                }
                break;
            }
            case 43: 
            case 45: 
            case 46: 
            case 0x30: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 54: 
            case 55: 
            case 56: 
            case 57: {
                return this.a(cLElement0, v, 4, arr_c);
            }
            case 9: 
            case 10: 
            case 13: 
            case 0x20: 
            case 44: 
            case 58: {
                break;
            }
            case 91: {
                return this.a(cLElement0, v, 3, arr_c);
            }
            case 0x7B: {
                return this.a(cLElement0, v, 2, arr_c);
            label_10:
                if(!(cLElement0 instanceof CLContainer) || cLElement0 instanceof CLObject) {
                    return this.a(cLElement0, v, 6, arr_c);
                }
                cLElement0 = this.a(cLElement0, v, 7, arr_c);
                if(!((CLToken)cLElement0).validate(c, ((long)v))) {
                    throw new CLParsingException("incorrect token <" + c + "> at line " + this.c, ((CLToken)cLElement0));
                }
                break;
            }
            case 93: 
            case 0x7D: {
                cLElement0.setEnd(((long)(v - 1)));
                cLElement0 = cLElement0.getContainer();
                cLElement0.setEnd(((long)v));
                return cLElement0;
            }
            default: {
                goto label_10;
            }
        }
        return cLElement0;
    }

    public static CLObject parse(String s) throws CLParsingException {
        return new CLParser(s).parse();
    }

    public CLObject parse() throws CLParsingException {
        char[] arr_c = this.a.toCharArray();
        this.c = 1;
        int v;
        for(v = 0; true; ++v) {
            if(v >= arr_c.length) {
                v = -1;
                break;
            }
            int v1 = arr_c[v];
            if(v1 == 0x7B) {
                break;
            }
            if(v1 == 10) {
                ++this.c;
            }
        }
        if(v == -1) {
            throw new CLParsingException("invalid json content", null);
        }
        CLObject cLObject0 = CLObject.allocate(arr_c);
        cLObject0.setLine(this.c);
        cLObject0.setStart(((long)v));
        int v2 = v + 1;
        CLElement cLElement0 = cLObject0;
        while(v2 < arr_c.length) {
            int v3 = arr_c[v2];
            if(v3 == 10) {
                ++this.c;
            }
            if(!this.b) {
            label_25:
                if(cLElement0 == null) {
                    break;
                }
                if(cLElement0.isDone()) {
                    cLElement0 = this.b(v2, ((char)v3), cLElement0, arr_c);
                }
                else if(cLElement0 instanceof CLObject) {
                    if(v3 == 0x7D) {
                        cLElement0.setEnd(((long)(v2 - 1)));
                    }
                    else {
                        cLElement0 = this.b(v2, ((char)v3), cLElement0, arr_c);
                    }
                }
                else if(cLElement0 instanceof CLArray) {
                    if(v3 == 93) {
                        cLElement0.setEnd(((long)(v2 - 1)));
                    }
                    else {
                        cLElement0 = this.b(v2, ((char)v3), cLElement0, arr_c);
                    }
                }
                else if(cLElement0 instanceof CLString) {
                    long v4 = cLElement0.start;
                    if(arr_c[((int)v4)] == v3) {
                        cLElement0.setStart(v4 + 1L);
                        cLElement0.setEnd(((long)(v2 - 1)));
                    }
                }
                else {
                    if(cLElement0 instanceof CLToken && !((CLToken)cLElement0).validate(((char)v3), ((long)v2))) {
                        throw new CLParsingException("parsing incorrect token " + ((CLToken)cLElement0).content() + " at line " + this.c, ((CLToken)cLElement0));
                    }
                    if(cLElement0 instanceof CLKey || cLElement0 instanceof CLString) {
                        long v5 = cLElement0.start;
                        int v6 = arr_c[((int)v5)];
                        if((v6 == 34 || v6 == 39) && v6 == v3) {
                            cLElement0.setStart(v5 + 1L);
                            cLElement0.setEnd(((long)(v2 - 1)));
                        }
                    }
                    if(!cLElement0.isDone()) {
                        if(v3 != 93 && v3 != 0x7D) {
                            switch(v3) {
                                case 9: 
                                case 10: 
                                case 13: 
                                case 0x20: 
                                case 44: 
                                case 58: {
                                    break;
                                }
                                default: {
                                    goto label_66;
                                }
                            }
                        }
                        cLElement0.setEnd(((long)(v2 - 1)));
                        if(v3 == 93 || v3 == 0x7D) {
                            cLElement0 = cLElement0.getContainer();
                            cLElement0.setEnd(((long)(v2 - 1)));
                            if(cLElement0 instanceof CLKey) {
                                cLElement0 = cLElement0.getContainer();
                                cLElement0.setEnd(((long)(v2 - 1)));
                            }
                        }
                    }
                }
            label_66:
                if(cLElement0.isDone() && (!(cLElement0 instanceof CLKey) || ((CLKey)cLElement0).c.size() > 0)) {
                    cLElement0 = cLElement0.getContainer();
                }
            }
            else if(v3 == 10) {
                this.b = false;
                goto label_25;
            }
            ++v2;
        }
        while(cLElement0 != null && !cLElement0.isDone()) {
            if(cLElement0 instanceof CLString) {
                cLElement0.setStart(((long)(((int)cLElement0.start) + 1)));
            }
            cLElement0.setEnd(((long)(arr_c.length - 1)));
            cLElement0 = cLElement0.getContainer();
        }
        return cLObject0;
    }
}

