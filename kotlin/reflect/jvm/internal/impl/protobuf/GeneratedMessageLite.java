package kotlin.reflect.jvm.internal.impl.protobuf;

import a5.b;
import androidx.datastore.preferences.protobuf.k3;
import gd.w;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public abstract class GeneratedMessageLite extends AbstractMessageLite implements Serializable {
    public static abstract class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder {
        public ByteString a;

        public Builder() {
            this.a = ByteString.EMPTY;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
        public Object clone() throws CloneNotSupportedException {
            return this.clone();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
        public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder clone() {
            return this.clone();
        }

        public Builder clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public abstract GeneratedMessageLite getDefaultInstanceForType();

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public MessageLite getDefaultInstanceForType() {
            return this.getDefaultInstanceForType();
        }

        public final ByteString getUnknownFields() {
            return this.a;
        }

        public abstract Builder mergeFrom(GeneratedMessageLite arg1);

        public final Builder setUnknownFields(ByteString byteString0) {
            this.a = byteString0;
            return this;
        }
    }

    public static abstract class ExtendableBuilder extends Builder implements ExtendableMessageOrBuilder {
        public d b;
        public boolean c;

        public ExtendableBuilder() {
            this.b = d.d;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
        public Object clone() throws CloneNotSupportedException {
            return this.clone();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
        public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder clone() {
            return this.clone();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
        public Builder clone() {
            return this.clone();
        }

        public ExtendableBuilder clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public boolean extensionsAreInitialized() {
            return this.b.f();
        }

        public final void mergeExtensionFields(ExtendableMessage generatedMessageLite$ExtendableMessage0) {
            if(!this.c) {
                this.b = this.b.b();
                this.c = true;
            }
            d d0 = this.b;
            d d1 = generatedMessageLite$ExtendableMessage0.a;
            d0.getClass();
            for(int v = 0; true; ++v) {
                l l0 = d1.a;
                if(v >= d1.a.b.size()) {
                    break;
                }
                d0.i(((Map.Entry)l0.b.get(v)));
            }
            for(Object object0: l0.c()) {
                d0.i(((Map.Entry)object0));
            }
        }
    }

    public static abstract class ExtendableMessage extends GeneratedMessageLite implements ExtendableMessageOrBuilder {
        public class ExtensionWriter {
            public final Iterator a;
            public Map.Entry b;

            public ExtensionWriter() {
                Iterator iterator1;
                l l0 = generatedMessageLite$ExtendableMessage0.a.a;
                if(generatedMessageLite$ExtendableMessage0.a.c) {
                    Iterator iterator0 = ((k3)l0.entrySet()).iterator();
                    iterator1 = new w();
                    iterator1.b = iterator0;
                }
                else {
                    iterator1 = ((k3)l0.entrySet()).iterator();
                }
                this.a = iterator1;
                if(iterator1.hasNext()) {
                    Object object0 = iterator1.next();
                    this.b = (Map.Entry)object0;
                }
            }

            public void writeUntil(int v, CodedOutputStream codedOutputStream0) throws IOException {
                while(this.b != null && ((f)this.b.getKey()).b < v) {
                    f f0 = (f)this.b.getKey();
                    Object object0 = this.b.getValue();
                    FieldType wireFormat$FieldType0 = f0.c;
                    int v1 = f0.b;
                    if(f0.d) {
                        if(f0.e) {
                            codedOutputStream0.writeTag(v1, 2);
                            int v2 = 0;
                            for(Object object1: ((List)object0)) {
                                v2 += d.c(wireFormat$FieldType0, object1);
                            }
                            codedOutputStream0.writeRawVarint32(v2);
                            for(Object object2: ((List)object0)) {
                                d.n(codedOutputStream0, wireFormat$FieldType0, object2);
                            }
                        }
                        else {
                            for(Object object3: ((List)object0)) {
                                d.m(codedOutputStream0, wireFormat$FieldType0, v1, object3);
                            }
                        }
                    }
                    else if(object0 instanceof LazyField) {
                        d.m(codedOutputStream0, wireFormat$FieldType0, v1, ((LazyField)object0).getValue());
                    }
                    else {
                        d.m(codedOutputStream0, wireFormat$FieldType0, v1, object0);
                    }
                    Iterator iterator3 = this.a;
                    if(iterator3.hasNext()) {
                        Object object4 = iterator3.next();
                        this.b = (Map.Entry)object4;
                    }
                    else {
                        this.b = null;
                    }
                }
            }
        }

        public final d a;

        public ExtendableMessage() {
            this.a = new d();
        }

        public ExtendableMessage(ExtendableBuilder generatedMessageLite$ExtendableBuilder0) {
            generatedMessageLite$ExtendableBuilder0.b.h();
            generatedMessageLite$ExtendableBuilder0.c = false;
            this.a = generatedMessageLite$ExtendableBuilder0.b;
        }

        public final void a(GeneratedExtension generatedMessageLite$GeneratedExtension0) {
            if(generatedMessageLite$GeneratedExtension0.getContainingTypeDefaultInstance() != this.getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public boolean extensionsAreInitialized() {
            return this.a.f();
        }

        public int extensionsSerializedSize() {
            int v1 = 0;
            for(int v = 0; true; ++v) {
                l l0 = this.a.a;
                if(v >= l0.b.size()) {
                    break;
                }
                Map.Entry map$Entry0 = (Map.Entry)l0.b.get(v);
                v1 += d.d(((FieldSet.FieldDescriptorLite)map$Entry0.getKey()), map$Entry0.getValue());
            }
            for(Object object0: l0.c()) {
                v1 += d.d(((FieldSet.FieldDescriptorLite)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
            }
            return v1;
        }

        public final Object getExtension(GeneratedExtension generatedMessageLite$GeneratedExtension0) {
            this.a(generatedMessageLite$GeneratedExtension0);
            f f0 = generatedMessageLite$GeneratedExtension0.d;
            ArrayList arrayList0 = this.a.e(f0);
            if(arrayList0 == null) {
                return generatedMessageLite$GeneratedExtension0.b;
            }
            if(f0.d) {
                if(f0.c.getJavaType() == JavaType.ENUM) {
                    ArrayList arrayList1 = new ArrayList();
                    for(Object object0: arrayList0) {
                        arrayList1.add(generatedMessageLite$GeneratedExtension0.a(object0));
                    }
                    return arrayList1;
                }
                return arrayList0;
            }
            return generatedMessageLite$GeneratedExtension0.a(arrayList0);
        }

        public final Object getExtension(GeneratedExtension generatedMessageLite$GeneratedExtension0, int v) {
            this.a(generatedMessageLite$GeneratedExtension0);
            d d0 = this.a;
            d0.getClass();
            f f0 = generatedMessageLite$GeneratedExtension0.d;
            if(!f0.d) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object object0 = d0.e(f0);
            if(object0 == null) {
                throw new IndexOutOfBoundsException();
            }
            return generatedMessageLite$GeneratedExtension0.a(((List)object0).get(v));
        }

        public final int getExtensionCount(GeneratedExtension generatedMessageLite$GeneratedExtension0) {
            this.a(generatedMessageLite$GeneratedExtension0);
            d d0 = this.a;
            d0.getClass();
            f f0 = generatedMessageLite$GeneratedExtension0.d;
            if(!f0.d) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object object0 = d0.e(f0);
            return object0 == null ? 0 : ((List)object0).size();
        }

        public final boolean hasExtension(GeneratedExtension generatedMessageLite$GeneratedExtension0) {
            this.a(generatedMessageLite$GeneratedExtension0);
            d d0 = this.a;
            d0.getClass();
            f f0 = generatedMessageLite$GeneratedExtension0.d;
            if(f0.d) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return d0.a.get(f0) != null;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public void makeExtensionsImmutable() {
            this.a.h();
        }

        public ExtensionWriter newExtensionWriter() {
            return new ExtensionWriter(this);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public boolean parseUnknownField(CodedInputStream codedInputStream0, CodedOutputStream codedOutputStream0, ExtensionRegistryLite extensionRegistryLite0, int v) throws IOException {
            Object object0;
            kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder messageLite$Builder0;
            boolean z1;
            GeneratedExtension generatedMessageLite$GeneratedExtension0 = extensionRegistryLite0.findLiteExtensionByNumber(this.getDefaultInstanceForType(), v >>> 3);
            boolean z = false;
            if(generatedMessageLite$GeneratedExtension0 == null) {
                z1 = false;
                z = true;
            }
            else {
                f f0 = generatedMessageLite$GeneratedExtension0.d;
                if((v & 7) == f0.c.getWireType()) {
                    z1 = false;
                }
                else if(!f0.d || !f0.c.isPackable() || (v & 7) != 2) {
                    z1 = false;
                    z = true;
                }
                else {
                    z1 = true;
                }
            }
            if(z) {
                return codedInputStream0.skipField(v, codedOutputStream0);
            }
            d d0 = this.a;
            if(z1) {
                int v1 = codedInputStream0.pushLimit(codedInputStream0.readRawVarint32());
                f f1 = generatedMessageLite$GeneratedExtension0.d;
                if(f1.c == FieldType.ENUM) {
                    while(codedInputStream0.getBytesUntilLimit() > 0) {
                        int v2 = codedInputStream0.readEnum();
                        EnumLite internal$EnumLite0 = f1.a.findValueByNumber(v2);
                        if(internal$EnumLite0 == null) {
                            return true;
                        }
                        d0.a(f1, generatedMessageLite$GeneratedExtension0.b(internal$EnumLite0));
                    }
                }
                else {
                    while(codedInputStream0.getBytesUntilLimit() > 0) {
                        d0.a(f1, d.j(codedInputStream0, f1.c));
                    }
                }
                codedInputStream0.popLimit(v1);
                return true;
            }
            else {
                f f2 = generatedMessageLite$GeneratedExtension0.d;
                switch(e.a[generatedMessageLite$GeneratedExtension0.d.c.getJavaType().ordinal()]) {
                    case 1: {
                        if(f2.d) {
                            messageLite$Builder0 = null;
                        }
                        else {
                            MessageLite messageLite0 = (MessageLite)d0.e(f2);
                            messageLite$Builder0 = messageLite0 == null ? null : messageLite0.toBuilder();
                        }
                        if(messageLite$Builder0 == null) {
                            messageLite$Builder0 = generatedMessageLite$GeneratedExtension0.getMessageDefaultInstance().newBuilderForType();
                        }
                        if(f2.c == FieldType.GROUP) {
                            codedInputStream0.readGroup(generatedMessageLite$GeneratedExtension0.getNumber(), messageLite$Builder0, extensionRegistryLite0);
                        }
                        else {
                            codedInputStream0.readMessage(messageLite$Builder0, extensionRegistryLite0);
                        }
                        object0 = messageLite$Builder0.build();
                        break;
                    }
                    case 2: {
                        int v3 = codedInputStream0.readEnum();
                        EnumLite internal$EnumLite1 = f2.a.findValueByNumber(v3);
                        if(internal$EnumLite1 == null) {
                            codedOutputStream0.writeRawVarint32(v);
                            codedOutputStream0.writeUInt32NoTag(v3);
                            return true;
                        }
                        object0 = internal$EnumLite1;
                        break;
                    }
                    default: {
                        object0 = d.j(codedInputStream0, f2.c);
                    }
                }
                if(f2.d) {
                    d0.a(f2, generatedMessageLite$GeneratedExtension0.b(object0));
                    return true;
                }
                d0.k(f2, generatedMessageLite$GeneratedExtension0.b(object0));
            }
            return true;
        }
    }

    public interface ExtendableMessageOrBuilder extends MessageLiteOrBuilder {
    }

    public static class GeneratedExtension {
        public final MessageLite a;
        public final Object b;
        public final MessageLite c;
        public final f d;
        public final Method e;

        public GeneratedExtension(MessageLite messageLite0, Object object0, MessageLite messageLite1, f f0, Class class0) {
            if(messageLite0 == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if(f0.c == FieldType.MESSAGE && messageLite1 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.a = messageLite0;
            this.b = object0;
            this.c = messageLite1;
            this.d = f0;
            if(EnumLite.class.isAssignableFrom(class0)) {
                try {
                    this.e = class0.getMethod("valueOf", Integer.TYPE);
                    return;
                }
                catch(NoSuchMethodException noSuchMethodException0) {
                    String s = class0.getName();
                    throw new RuntimeException(b.q(new StringBuilder(s.length() + 52), "Generated message class \"", s, "\" missing method \"valueOf\"."), noSuchMethodException0);
                }
            }
            this.e = null;
        }

        public final Object a(Object object0) {
            if(this.d.c.getJavaType() == JavaType.ENUM) {
                Object[] arr_object = {((Integer)object0)};
                try {
                    return this.e.invoke(null, arr_object);
                }
                catch(IllegalAccessException illegalAccessException0) {
                    throw new RuntimeException("Couldn\'t use Java reflection to implement protocol message reflection.", illegalAccessException0);
                }
                catch(InvocationTargetException invocationTargetException0) {
                    Throwable throwable0 = invocationTargetException0.getCause();
                    if(throwable0 instanceof RuntimeException) {
                        throw (RuntimeException)throwable0;
                    }
                    if(throwable0 instanceof Error) {
                        throw (Error)throwable0;
                    }
                    throw new RuntimeException("Unexpected exception thrown by generated accessor method.", throwable0);
                }
            }
            return object0;
        }

        public final Object b(Object object0) {
            return this.d.c.getJavaType() == JavaType.ENUM ? ((EnumLite)object0).getNumber() : object0;
        }

        public MessageLite getContainingTypeDefaultInstance() {
            return this.a;
        }

        public MessageLite getMessageDefaultInstance() {
            return this.c;
        }

        public int getNumber() {
            return this.d.b;
        }
    }

    public GeneratedMessageLite() {
    }

    public GeneratedMessageLite(Builder generatedMessageLite$Builder0) {
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
    public Parser getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    public void makeExtensionsImmutable() {
    }

    public static GeneratedExtension newRepeatedGeneratedExtension(MessageLite messageLite0, MessageLite messageLite1, EnumLiteMap internal$EnumLiteMap0, int v, FieldType wireFormat$FieldType0, boolean z, Class class0) {
        return new GeneratedExtension(messageLite0, Collections.emptyList(), messageLite1, new f(internal$EnumLiteMap0, v, wireFormat$FieldType0, true, z), class0);
    }

    public static GeneratedExtension newSingularGeneratedExtension(MessageLite messageLite0, Object object0, MessageLite messageLite1, EnumLiteMap internal$EnumLiteMap0, int v, FieldType wireFormat$FieldType0, Class class0) {
        return new GeneratedExtension(messageLite0, object0, messageLite1, new f(internal$EnumLiteMap0, v, wireFormat$FieldType0, false, false), class0);
    }

    public boolean parseUnknownField(CodedInputStream codedInputStream0, CodedOutputStream codedOutputStream0, ExtensionRegistryLite extensionRegistryLite0, int v) throws IOException {
        return codedInputStream0.skipField(v, codedOutputStream0);
    }
}

