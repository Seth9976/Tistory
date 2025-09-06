package androidx.datastore.preferences.protobuf;

public abstract class w3 {
    public abstract UnknownFieldSetLite a(Object arg1);

    public abstract void b(Object arg1);

    public final boolean c(Object object0, Reader reader0) {
        int v = reader0.getTag();
        switch(v & 7) {
            case 0: {
                ((UnknownFieldSetLite)object0).e(v >>> 3 << 3, reader0.readInt64());
                return true;
            }
            case 1: {
                ((UnknownFieldSetLite)object0).e(v >>> 3 << 3 | 1, reader0.readFixed64());
                return true;
            }
            case 2: {
                ((UnknownFieldSetLite)object0).e(v >>> 3 << 3 | 2, reader0.readBytes());
                return true;
            }
            case 3: {
                UnknownFieldSetLite unknownFieldSetLite0 = new UnknownFieldSetLite();
                while(reader0.getFieldNumber() != 0x7FFFFFFF && this.c(unknownFieldSetLite0, reader0)) {
                }
                if((v >>> 3 << 3 | 4) != reader0.getTag()) {
                    throw InvalidProtocolBufferException.a();
                }
                unknownFieldSetLite0.makeImmutable();
                ((UnknownFieldSetLite)object0).e(v >>> 3 << 3 | 3, unknownFieldSetLite0);
                return true;
            }
            case 4: {
                return false;
            }
            case 5: {
                ((UnknownFieldSetLite)object0).e(v >>> 3 << 3 | 5, reader0.readFixed32());
                return true;
            }
            default: {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public abstract void d(Object arg1, Object arg2);
}

