package androidx.constraintlayout.core.parser;

import a5.b;
import java.util.ArrayList;

public class CLContainer extends CLElement {
    public final ArrayList c;

    public CLContainer(char[] arr_c) {
        super(arr_c);
        this.c = new ArrayList();
    }

    public void add(CLElement cLElement0) {
        this.c.add(cLElement0);
    }

    public static CLElement allocate(char[] arr_c) {
        return new CLContainer(arr_c);
    }

    public CLElement get(int v) throws CLParsingException {
        if(v >= 0) {
            ArrayList arrayList0 = this.c;
            if(v < arrayList0.size()) {
                return (CLElement)arrayList0.get(v);
            }
        }
        throw new CLParsingException("no element at index " + v, this);
    }

    public CLElement get(String s) throws CLParsingException {
        for(Object object0: this.c) {
            CLKey cLKey0 = (CLKey)(((CLElement)object0));
            if(cLKey0.content().equals(s)) {
                return cLKey0.getValue();
            }
            if(false) {
                break;
            }
        }
        throw new CLParsingException("no element for key <" + s + ">", this);
    }

    public CLArray getArray(int v) throws CLParsingException {
        CLElement cLElement0 = this.get(v);
        if(!(cLElement0 instanceof CLArray)) {
            throw new CLParsingException("no array at index " + v, this);
        }
        return (CLArray)cLElement0;
    }

    public CLArray getArray(String s) throws CLParsingException {
        CLElement cLElement0 = this.get(s);
        if(cLElement0 instanceof CLArray) {
            return (CLArray)cLElement0;
        }
        StringBuilder stringBuilder0 = b.v("no array found for key <", s, ">, found [");
        stringBuilder0.append(cLElement0.getStrClass());
        stringBuilder0.append("] : ");
        stringBuilder0.append(cLElement0);
        throw new CLParsingException(stringBuilder0.toString(), this);
    }

    public CLArray getArrayOrNull(String s) {
        CLElement cLElement0 = this.getOrNull(s);
        return cLElement0 instanceof CLArray ? ((CLArray)cLElement0) : null;
    }

    public boolean getBoolean(int v) throws CLParsingException {
        CLElement cLElement0 = this.get(v);
        if(!(cLElement0 instanceof CLToken)) {
            throw new CLParsingException("no boolean at index " + v, this);
        }
        return ((CLToken)cLElement0).getBoolean();
    }

    public boolean getBoolean(String s) throws CLParsingException {
        CLElement cLElement0 = this.get(s);
        if(cLElement0 instanceof CLToken) {
            return ((CLToken)cLElement0).getBoolean();
        }
        StringBuilder stringBuilder0 = b.v("no boolean found for key <", s, ">, found [");
        stringBuilder0.append(cLElement0.getStrClass());
        stringBuilder0.append("] : ");
        stringBuilder0.append(cLElement0);
        throw new CLParsingException(stringBuilder0.toString(), this);
    }

    public float getFloat(int v) throws CLParsingException {
        CLElement cLElement0 = this.get(v);
        if(cLElement0 == null) {
            throw new CLParsingException("no float at index " + v, this);
        }
        return cLElement0.getFloat();
    }

    public float getFloat(String s) throws CLParsingException {
        CLElement cLElement0 = this.get(s);
        if(cLElement0 != null) {
            return cLElement0.getFloat();
        }
        b.v("no float found for key <", s, ">, found [");
        throw new NullPointerException();
    }

    public float getFloatOrNaN(String s) {
        CLElement cLElement0 = this.getOrNull(s);
        return cLElement0 instanceof CLNumber ? cLElement0.getFloat() : NaNf;
    }

    public int getInt(int v) throws CLParsingException {
        CLElement cLElement0 = this.get(v);
        if(cLElement0 == null) {
            throw new CLParsingException("no int at index " + v, this);
        }
        return cLElement0.getInt();
    }

    public int getInt(String s) throws CLParsingException {
        CLElement cLElement0 = this.get(s);
        if(cLElement0 != null) {
            return cLElement0.getInt();
        }
        b.v("no int found for key <", s, ">, found [");
        throw new NullPointerException();
    }

    public CLObject getObject(int v) throws CLParsingException {
        CLElement cLElement0 = this.get(v);
        if(!(cLElement0 instanceof CLObject)) {
            throw new CLParsingException("no object at index " + v, this);
        }
        return (CLObject)cLElement0;
    }

    public CLObject getObject(String s) throws CLParsingException {
        CLElement cLElement0 = this.get(s);
        if(cLElement0 instanceof CLObject) {
            return (CLObject)cLElement0;
        }
        StringBuilder stringBuilder0 = b.v("no object found for key <", s, ">, found [");
        stringBuilder0.append(cLElement0.getStrClass());
        stringBuilder0.append("] : ");
        stringBuilder0.append(cLElement0);
        throw new CLParsingException(stringBuilder0.toString(), this);
    }

    public CLObject getObjectOrNull(String s) {
        CLElement cLElement0 = this.getOrNull(s);
        return cLElement0 instanceof CLObject ? ((CLObject)cLElement0) : null;
    }

    public CLElement getOrNull(int v) {
        if(v >= 0) {
            return v >= this.c.size() ? null : ((CLElement)this.c.get(v));
        }
        return null;
    }

    public CLElement getOrNull(String s) {
        for(Object object0: this.c) {
            CLKey cLKey0 = (CLKey)(((CLElement)object0));
            if(cLKey0.content().equals(s)) {
                return cLKey0.getValue();
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public String getString(int v) throws CLParsingException {
        CLElement cLElement0 = this.get(v);
        if(!(cLElement0 instanceof CLString)) {
            throw new CLParsingException("no string at index " + v, this);
        }
        return cLElement0.content();
    }

    public String getString(String s) throws CLParsingException {
        CLElement cLElement0 = this.get(s);
        if(cLElement0 instanceof CLString) {
            return cLElement0.content();
        }
        StringBuilder stringBuilder0 = b.w("no string found for key <", s, ">, found [", (cLElement0 == null ? null : cLElement0.getStrClass()), "] : ");
        stringBuilder0.append(cLElement0);
        throw new CLParsingException(stringBuilder0.toString(), this);
    }

    public String getStringOrNull(int v) {
        CLElement cLElement0 = this.getOrNull(v);
        return cLElement0 instanceof CLString ? cLElement0.content() : null;
    }

    public String getStringOrNull(String s) {
        CLElement cLElement0 = this.getOrNull(s);
        return cLElement0 instanceof CLString ? cLElement0.content() : null;
    }

    public boolean has(String s) {
        for(Object object0: this.c) {
            if(((CLElement)object0) instanceof CLKey && ((CLKey)(((CLElement)object0))).content().equals(s)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public ArrayList names() {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.c) {
            CLElement cLElement0 = (CLElement)object0;
            if(cLElement0 instanceof CLKey) {
                arrayList0.add(((CLKey)cLElement0).content());
            }
        }
        return arrayList0;
    }

    public void put(String s, CLElement cLElement0) {
        ArrayList arrayList0 = this.c;
        for(Object object0: arrayList0) {
            CLKey cLKey0 = (CLKey)(((CLElement)object0));
            if(cLKey0.content().equals(s)) {
                cLKey0.set(cLElement0);
                return;
            }
            if(false) {
                break;
            }
        }
        arrayList0.add(((CLKey)CLKey.allocate(s, cLElement0)));
    }

    public void putNumber(String s, float f) {
        this.put(s, new CLNumber(f));
    }

    public void remove(String s) {
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = this.c;
        for(Object object0: arrayList1) {
            CLElement cLElement0 = (CLElement)object0;
            if(((CLKey)cLElement0).content().equals(s)) {
                arrayList0.add(cLElement0);
            }
        }
        for(Object object1: arrayList0) {
            arrayList1.remove(((CLElement)object1));
        }
    }

    public int size() {
        return this.c.size();
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(Object object0: this.c) {
            if(stringBuilder0.length() > 0) {
                stringBuilder0.append("; ");
            }
            stringBuilder0.append(((CLElement)object0));
        }
        return super.toString() + " = <" + stringBuilder0 + " >";
    }
}

