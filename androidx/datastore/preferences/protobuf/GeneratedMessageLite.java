package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class GeneratedMessageLite extends AbstractMessageLite {
    public static abstract class Builder extends androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder {
        public final GeneratedMessageLite a;
        protected GeneratedMessageLite instance;

        public Builder(GeneratedMessageLite generatedMessageLite0) {
            this.a = generatedMessageLite0;
            if(generatedMessageLite0.j()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.instance = generatedMessageLite0.l();
        }

        public final GeneratedMessageLite build() {
            GeneratedMessageLite generatedMessageLite0 = this.buildPartial();
            if(!generatedMessageLite0.isInitialized()) {
                throw androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(generatedMessageLite0);
            }
            return generatedMessageLite0;
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLite$Builder
        public MessageLite build() {
            return this.build();
        }

        public GeneratedMessageLite buildPartial() {
            if(!this.instance.j()) {
                return this.instance;
            }
            this.instance.makeImmutable();
            return this.instance;
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLite$Builder
        public MessageLite buildPartial() {
            return this.buildPartial();
        }

        public final Builder clear() {
            GeneratedMessageLite generatedMessageLite0 = this.a;
            if(generatedMessageLite0.j()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.instance = generatedMessageLite0.l();
            return this;
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLite$Builder
        public androidx.datastore.preferences.protobuf.MessageLite.Builder clear() {
            return this.clear();
        }

        @Override  // androidx.datastore.preferences.protobuf.AbstractMessageLite$Builder
        public androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder clone() {
            return this.clone();
        }

        public Builder clone() {
            Builder generatedMessageLite$Builder0 = this.getDefaultInstanceForType().newBuilderForType();
            generatedMessageLite$Builder0.instance = this.buildPartial();
            return generatedMessageLite$Builder0;
        }

        @Override  // androidx.datastore.preferences.protobuf.AbstractMessageLite$Builder
        public androidx.datastore.preferences.protobuf.MessageLite.Builder clone() {
            return this.clone();
        }

        @Override  // androidx.datastore.preferences.protobuf.AbstractMessageLite$Builder
        public Object clone() throws CloneNotSupportedException {
            return this.clone();
        }

        public final void copyOnWrite() {
            if(!this.instance.j()) {
                this.copyOnWriteInternal();
            }
        }

        public void copyOnWriteInternal() {
            GeneratedMessageLite generatedMessageLite0 = this.a.l();
            GeneratedMessageLite generatedMessageLite1 = this.instance;
            v2.c.b(generatedMessageLite0).mergeFrom(generatedMessageLite0, generatedMessageLite1);
            this.instance = generatedMessageLite0;
        }

        public GeneratedMessageLite getDefaultInstanceForType() {
            return this.a;
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
        public MessageLite getDefaultInstanceForType() {
            return this.getDefaultInstanceForType();
        }

        @Override  // androidx.datastore.preferences.protobuf.AbstractMessageLite$Builder
        public androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder internalMergeFrom(AbstractMessageLite abstractMessageLite0) {
            return this.internalMergeFrom(((GeneratedMessageLite)abstractMessageLite0));
        }

        public Builder internalMergeFrom(GeneratedMessageLite generatedMessageLite0) {
            return this.mergeFrom(generatedMessageLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return GeneratedMessageLite.isInitialized(this.instance, false);
        }

        @Override  // androidx.datastore.preferences.protobuf.AbstractMessageLite$Builder
        public androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.AbstractMessageLite$Builder
        public androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder mergeFrom(byte[] arr_b, int v, int v1) throws InvalidProtocolBufferException {
            return this.mergeFrom(arr_b, v, v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.AbstractMessageLite$Builder
        public androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder mergeFrom(byte[] arr_b, int v, int v1, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return this.mergeFrom(arr_b, v, v1, extensionRegistryLite0);
        }

        public Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            this.copyOnWrite();
            try {
                v2.c.b(this.instance).mergeFrom(this.instance, (codedInputStream0.d == null ? new y(codedInputStream0) : codedInputStream0.d), extensionRegistryLite0);
                return this;
            }
            catch(RuntimeException runtimeException0) {
                if(runtimeException0.getCause() instanceof IOException) {
                    throw (IOException)runtimeException0.getCause();
                }
                throw runtimeException0;
            }
        }

        public Builder mergeFrom(GeneratedMessageLite generatedMessageLite0) {
            if(this.getDefaultInstanceForType().equals(generatedMessageLite0)) {
                return this;
            }
            this.copyOnWrite();
            GeneratedMessageLite generatedMessageLite1 = this.instance;
            v2.c.b(generatedMessageLite1).mergeFrom(generatedMessageLite1, generatedMessageLite0);
            return this;
        }

        public Builder mergeFrom(byte[] arr_b, int v, int v1) throws InvalidProtocolBufferException {
            return this.mergeFrom(arr_b, v, v1, ExtensionRegistryLite.getEmptyRegistry());
        }

        public Builder mergeFrom(byte[] arr_b, int v, int v1, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            this.copyOnWrite();
            try {
                v2.c.b(this.instance).mergeFrom(this.instance, arr_b, v, v + v1, new g(extensionRegistryLite0));
                return this;
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                throw invalidProtocolBufferException0;
            }
            catch(IndexOutOfBoundsException unused_ex) {
                throw InvalidProtocolBufferException.h();
            }
            catch(IOException iOException0) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", iOException0);
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.AbstractMessageLite$Builder
        public androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.AbstractMessageLite$Builder
        public androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(byte[] arr_b, int v, int v1) throws InvalidProtocolBufferException {
            return this.mergeFrom(arr_b, v, v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.AbstractMessageLite$Builder
        public androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(byte[] arr_b, int v, int v1, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return this.mergeFrom(arr_b, v, v1, extensionRegistryLite0);
        }
    }

    public static class DefaultInstanceBasedParser extends AbstractParser {
        public final GeneratedMessageLite b;

        public DefaultInstanceBasedParser(GeneratedMessageLite generatedMessageLite0) {
            this.b = generatedMessageLite0;
        }

        public GeneratedMessageLite parsePartialFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.n(this.b, codedInputStream0, extensionRegistryLite0);
        }

        public GeneratedMessageLite parsePartialFrom(byte[] arr_b, int v, int v1, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.o(this.b, arr_b, v, v1, extensionRegistryLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.AbstractParser
        public MessageLite parsePartialFrom(byte[] arr_b, int v, int v1, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return this.parsePartialFrom(arr_b, v, v1, extensionRegistryLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.Parser
        public Object parsePartialFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return this.parsePartialFrom(codedInputStream0, extensionRegistryLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.AbstractParser
        public Object parsePartialFrom(byte[] arr_b, int v, int v1, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return this.parsePartialFrom(arr_b, v, v1, extensionRegistryLite0);
        }
    }

    public static abstract class ExtendableBuilder extends Builder implements ExtendableMessageOrBuilder {
        public ExtendableBuilder(ExtendableMessage generatedMessageLite$ExtendableMessage0) {
            super(generatedMessageLite$ExtendableMessage0);
        }

        public final ExtendableBuilder addExtension(ExtensionLite extensionLite0, Object object0) {
            extensionLite0.getClass();
            this.c(((GeneratedExtension)extensionLite0));
            this.copyOnWrite();
            d1 d10 = this.b();
            Object object1 = ((GeneratedExtension)extensionLite0).b(object0);
            d10.a(((GeneratedExtension)extensionLite0).d, object1);
            return this;
        }

        public final d1 b() {
            d1 d10 = ((ExtendableMessage)this.instance).extensions;
            if(d10.b) {
                d10 = d10.b();
                ((ExtendableMessage)this.instance).extensions = d10;
            }
            return d10;
        }

        public final ExtendableMessage buildPartial() {
            if(!((ExtendableMessage)this.instance).j()) {
                return (ExtendableMessage)this.instance;
            }
            ((ExtendableMessage)this.instance).extensions.n();
            return (ExtendableMessage)super.buildPartial();
        }

        @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite$Builder
        public GeneratedMessageLite buildPartial() {
            return this.buildPartial();
        }

        @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite$Builder
        public MessageLite buildPartial() {
            return this.buildPartial();
        }

        public final void c(GeneratedExtension generatedMessageLite$GeneratedExtension0) {
            if(generatedMessageLite$GeneratedExtension0.getContainingTypeDefaultInstance() != this.getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public final ExtendableBuilder clearExtension(ExtensionLite extensionLite0) {
            extensionLite0.getClass();
            this.c(((GeneratedExtension)extensionLite0));
            this.copyOnWrite();
            d1 d10 = this.b();
            d10.a.remove(((GeneratedExtension)extensionLite0).d);
            if(d10.a.isEmpty()) {
                d10.c = false;
            }
            return this;
        }

        @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite$Builder
        public void copyOnWriteInternal() {
            super.copyOnWriteInternal();
            GeneratedMessageLite generatedMessageLite0 = this.instance;
            if(((ExtendableMessage)generatedMessageLite0).extensions != d1.d) {
                ((ExtendableMessage)generatedMessageLite0).extensions = ((ExtendableMessage)generatedMessageLite0).extensions.b();
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder
        public final Object getExtension(ExtensionLite extensionLite0) {
            return ((ExtendableMessage)this.instance).getExtension(extensionLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder
        public final Object getExtension(ExtensionLite extensionLite0, int v) {
            return ((ExtendableMessage)this.instance).getExtension(extensionLite0, v);
        }

        @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder
        public final int getExtensionCount(ExtensionLite extensionLite0) {
            return ((ExtendableMessage)this.instance).getExtensionCount(extensionLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder
        public final boolean hasExtension(ExtensionLite extensionLite0) {
            return ((ExtendableMessage)this.instance).hasExtension(extensionLite0);
        }

        public final ExtendableBuilder setExtension(ExtensionLite extensionLite0, int v, Object object0) {
            extensionLite0.getClass();
            this.c(((GeneratedExtension)extensionLite0));
            this.copyOnWrite();
            d1 d10 = this.b();
            Object object1 = ((GeneratedExtension)extensionLite0).b(object0);
            j1 j10 = ((GeneratedExtension)extensionLite0).d;
            if(!j10.d) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object object2 = d10.f(j10);
            if(object2 == null) {
                throw new IndexOutOfBoundsException();
            }
            d1.r(j10, object1);
            ((List)object2).set(v, object1);
            return this;
        }

        public final ExtendableBuilder setExtension(ExtensionLite extensionLite0, Object object0) {
            extensionLite0.getClass();
            this.c(((GeneratedExtension)extensionLite0));
            this.copyOnWrite();
            d1 d10 = this.b();
            j1 j10 = ((GeneratedExtension)extensionLite0).d;
            if(!j10.d) {
                object0 = ((GeneratedExtension)extensionLite0).b(object0);
            }
            else if(j10.c.getJavaType() == JavaType.ENUM) {
                ArrayList arrayList0 = new ArrayList();
                for(Object object1: ((List)object0)) {
                    arrayList0.add(((GeneratedExtension)extensionLite0).b(object1));
                }
                object0 = arrayList0;
            }
            d10.q(j10, object0);
            return this;
        }
    }

    public static abstract class ExtendableMessage extends GeneratedMessageLite implements ExtendableMessageOrBuilder {
        public class ExtensionWriter {
            public final Iterator a;
            public Map.Entry b;
            public final boolean c;

            public ExtensionWriter(boolean z) {
                Iterator iterator0 = generatedMessageLite$ExtendableMessage0.extensions.m();
                this.a = iterator0;
                if(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    this.b = (Map.Entry)object0;
                }
                this.c = z;
            }

            public void writeUntil(int v, CodedOutputStream codedOutputStream0) throws IOException {
                while(this.b != null && ((j1)this.b.getKey()).b < v) {
                    j1 j10 = (j1)this.b.getKey();
                    if(!this.c || j10.c.getJavaType() != JavaType.MESSAGE || j10.d) {
                        Object object0 = this.b.getValue();
                        FieldType wireFormat$FieldType0 = j10.c;
                        int v1 = j10.b;
                        if(!j10.d) {
                            if(object0 instanceof LazyField) {
                                d1.s(codedOutputStream0, wireFormat$FieldType0, v1, ((LazyField)object0).getValue());
                            }
                            else {
                                d1.s(codedOutputStream0, wireFormat$FieldType0, v1, object0);
                            }
                        }
                        else if(!j10.e) {
                            for(Object object3: ((List)object0)) {
                                d1.s(codedOutputStream0, wireFormat$FieldType0, v1, object3);
                            }
                        }
                        else if(!((List)object0).isEmpty()) {
                            codedOutputStream0.writeTag(v1, 2);
                            int v2 = 0;
                            for(Object object1: ((List)object0)) {
                                v2 += d1.d(wireFormat$FieldType0, object1);
                            }
                            codedOutputStream0.writeUInt32NoTag(v2);
                            for(Object object2: ((List)object0)) {
                                d1.t(codedOutputStream0, wireFormat$FieldType0, object2);
                            }
                        }
                    }
                    else {
                        MessageLite messageLite0 = (MessageLite)this.b.getValue();
                        codedOutputStream0.writeMessageSetExtension(j10.b, messageLite0);
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

        protected d1 extensions;

        public ExtendableMessage() {
            this.extensions = d1.d;
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.k();
        }

        public int extensionsSerializedSize() {
            return this.extensions.i();
        }

        public int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.g();
        }

        @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder
        public final Object getExtension(ExtensionLite extensionLite0) {
            extensionLite0.getClass();
            this.r(((GeneratedExtension)extensionLite0));
            d1 d10 = this.extensions;
            j1 j10 = ((GeneratedExtension)extensionLite0).d;
            ArrayList arrayList0 = d10.f(j10);
            if(arrayList0 == null) {
                return ((GeneratedExtension)extensionLite0).b;
            }
            if(j10.d) {
                if(j10.c.getJavaType() == JavaType.ENUM) {
                    ArrayList arrayList1 = new ArrayList();
                    for(Object object0: arrayList0) {
                        arrayList1.add(((GeneratedExtension)extensionLite0).a(object0));
                    }
                    return arrayList1;
                }
                return arrayList0;
            }
            return ((GeneratedExtension)extensionLite0).a(arrayList0);
        }

        @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder
        public final Object getExtension(ExtensionLite extensionLite0, int v) {
            extensionLite0.getClass();
            this.r(((GeneratedExtension)extensionLite0));
            d1 d10 = this.extensions;
            d10.getClass();
            j1 j10 = ((GeneratedExtension)extensionLite0).d;
            if(!j10.d) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object object0 = d10.f(j10);
            if(object0 == null) {
                throw new IndexOutOfBoundsException();
            }
            return ((GeneratedExtension)extensionLite0).a(((List)object0).get(v));
        }

        @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder
        public final int getExtensionCount(ExtensionLite extensionLite0) {
            extensionLite0.getClass();
            this.r(((GeneratedExtension)extensionLite0));
            d1 d10 = this.extensions;
            d10.getClass();
            j1 j10 = ((GeneratedExtension)extensionLite0).d;
            if(!j10.d) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object object0 = d10.f(j10);
            return object0 == null ? 0 : ((List)object0).size();
        }

        @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder
        public final boolean hasExtension(ExtensionLite extensionLite0) {
            extensionLite0.getClass();
            this.r(((GeneratedExtension)extensionLite0));
            d1 d10 = this.extensions;
            d10.getClass();
            j1 j10 = ((GeneratedExtension)extensionLite0).d;
            if(j10.d) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return d10.a.get(j10) != null;
        }

        public final void mergeExtensionFields(ExtendableMessage generatedMessageLite$ExtendableMessage0) {
            d1 d10 = this.extensions;
            if(d10.b) {
                this.extensions = d10.b();
            }
            this.extensions.o(generatedMessageLite$ExtendableMessage0.extensions);
        }

        public ExtensionWriter newExtensionWriter() {
            return new ExtensionWriter(this, false);
        }

        public ExtensionWriter newMessageSetExtensionWriter() {
            return new ExtensionWriter(this, true);
        }

        public final d1 p() {
            d1 d10 = this.extensions;
            if(d10.b) {
                this.extensions = d10.b();
            }
            return this.extensions;
        }

        public boolean parseUnknownField(MessageLite messageLite0, CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0, int v) throws IOException {
            return this.q(codedInputStream0, extensionRegistryLite0, extensionRegistryLite0.findLiteExtensionByNumber(messageLite0, v >>> 3), v, v >>> 3);
        }

        public boolean parseUnknownFieldAsMessageSet(MessageLite messageLite0, CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0, int v) throws IOException {
            if(v == 11) {
                int v1 = 0;
                androidx.datastore.preferences.protobuf.MessageLite.Builder messageLite$Builder0 = null;
                ByteString byteString0 = null;
                GeneratedExtension generatedMessageLite$GeneratedExtension0 = null;
            alab1:
                while(true) {
                    int v2 = codedInputStream0.readTag();
                    switch(v2) {
                        case 0: {
                            break alab1;
                        }
                        case 16: {
                            v1 = codedInputStream0.readUInt32();
                            if(v1 == 0) {
                                break;
                            }
                            generatedMessageLite$GeneratedExtension0 = extensionRegistryLite0.findLiteExtensionByNumber(messageLite0, v1);
                            break;
                        }
                        case 26: {
                            if(v1 == 0 || generatedMessageLite$GeneratedExtension0 == null) {
                                byteString0 = codedInputStream0.readBytes();
                            }
                            else {
                                this.q(codedInputStream0, extensionRegistryLite0, generatedMessageLite$GeneratedExtension0, v1 << 3 | 2, v1);
                                byteString0 = null;
                            }
                            break;
                        }
                        default: {
                            if(codedInputStream0.skipField(v2)) {
                                break;
                            }
                            break alab1;
                        }
                    }
                }
                codedInputStream0.checkLastTagWas(12);
                if(byteString0 != null && v1 != 0) {
                    if(generatedMessageLite$GeneratedExtension0 != null) {
                        j1 j10 = generatedMessageLite$GeneratedExtension0.d;
                        MessageLite messageLite1 = (MessageLite)this.extensions.f(j10);
                        if(messageLite1 != null) {
                            messageLite$Builder0 = messageLite1.toBuilder();
                        }
                        if(messageLite$Builder0 == null) {
                            messageLite$Builder0 = generatedMessageLite$GeneratedExtension0.getMessageDefaultInstance().newBuilderForType();
                        }
                        messageLite$Builder0.mergeFrom(byteString0, extensionRegistryLite0);
                        MessageLite messageLite2 = messageLite$Builder0.build();
                        this.p().q(j10, generatedMessageLite$GeneratedExtension0.b(messageLite2));
                        return true;
                    }
                    this.mergeLengthDelimitedField(v1, byteString0);
                }
                return true;
            }
            return (v & 7) == 2 ? this.parseUnknownField(messageLite0, codedInputStream0, extensionRegistryLite0, v) : codedInputStream0.skipField(v);
        }

        public final boolean q(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0, GeneratedExtension generatedMessageLite$GeneratedExtension0, int v, int v1) {
            Object object1;
            androidx.datastore.preferences.protobuf.MessageLite.Builder messageLite$Builder0;
            boolean z1;
            boolean z = false;
            if(generatedMessageLite$GeneratedExtension0 == null) {
                z1 = false;
                z = true;
            }
            else {
                j1 j10 = generatedMessageLite$GeneratedExtension0.d;
                if((v & 7) == j10.c.getWireType()) {
                    z1 = false;
                }
                else if(!j10.d || !j10.c.isPackable() || (v & 7) != 2) {
                    z1 = false;
                    z = true;
                }
                else {
                    z1 = true;
                }
            }
            if(z) {
                return this.parseUnknownField(v, codedInputStream0);
            }
            this.p();
            if(z1) {
                int v2 = codedInputStream0.pushLimit(codedInputStream0.readRawVarint32());
                j1 j11 = generatedMessageLite$GeneratedExtension0.d;
                if(j11.c == FieldType.ENUM) {
                    while(codedInputStream0.getBytesUntilLimit() > 0) {
                        int v3 = codedInputStream0.readEnum();
                        EnumLite internal$EnumLite0 = j11.a.findValueByNumber(v3);
                        if(internal$EnumLite0 == null) {
                            return true;
                        }
                        this.extensions.a(j11, generatedMessageLite$GeneratedExtension0.b(internal$EnumLite0));
                    }
                }
                else {
                    while(codedInputStream0.getBytesUntilLimit() > 0) {
                        Object object0 = WireFormat.a(codedInputStream0, j11.c, 1);
                        this.extensions.a(j11, object0);
                    }
                }
                codedInputStream0.popLimit(v2);
                return true;
            }
            j1 j12 = generatedMessageLite$GeneratedExtension0.d;
            switch(i1.a[generatedMessageLite$GeneratedExtension0.d.c.getJavaType().ordinal()]) {
                case 1: {
                    if(j12.d) {
                        messageLite$Builder0 = null;
                    }
                    else {
                        MessageLite messageLite0 = (MessageLite)this.extensions.f(j12);
                        messageLite$Builder0 = messageLite0 == null ? null : messageLite0.toBuilder();
                    }
                    if(messageLite$Builder0 == null) {
                        messageLite$Builder0 = generatedMessageLite$GeneratedExtension0.getMessageDefaultInstance().newBuilderForType();
                    }
                    if(j12.c == FieldType.GROUP) {
                        codedInputStream0.readGroup(generatedMessageLite$GeneratedExtension0.getNumber(), messageLite$Builder0, extensionRegistryLite0);
                    }
                    else {
                        codedInputStream0.readMessage(messageLite$Builder0, extensionRegistryLite0);
                    }
                    object1 = messageLite$Builder0.build();
                    break;
                }
                case 2: {
                    int v4 = codedInputStream0.readEnum();
                    EnumLite internal$EnumLite1 = j12.a.findValueByNumber(v4);
                    if(internal$EnumLite1 == null) {
                        this.mergeVarintField(v1, v4);
                        return true;
                    }
                    object1 = internal$EnumLite1;
                    break;
                }
                default: {
                    object1 = WireFormat.a(codedInputStream0, j12.c, 1);
                }
            }
            if(j12.d) {
                this.extensions.a(j12, generatedMessageLite$GeneratedExtension0.b(object1));
                return true;
            }
            this.extensions.q(j12, generatedMessageLite$GeneratedExtension0.b(object1));
            return true;
        }

        public final void r(GeneratedExtension generatedMessageLite$GeneratedExtension0) {
            if(generatedMessageLite$GeneratedExtension0.getContainingTypeDefaultInstance() != this.getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }
    }

    public interface ExtendableMessageOrBuilder extends MessageLiteOrBuilder {
        Object getExtension(ExtensionLite arg1);

        Object getExtension(ExtensionLite arg1, int arg2);

        int getExtensionCount(ExtensionLite arg1);

        boolean hasExtension(ExtensionLite arg1);
    }

    public static class GeneratedExtension extends ExtensionLite {
        public final MessageLite a;
        public final Object b;
        public final MessageLite c;
        public final j1 d;

        public GeneratedExtension(MessageLite messageLite0, Object object0, MessageLite messageLite1, j1 j10) {
            if(messageLite0 == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if(j10.c == FieldType.MESSAGE && messageLite1 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.a = messageLite0;
            this.b = object0;
            this.c = messageLite1;
            this.d = j10;
        }

        public final Object a(Object object0) {
            j1 j10 = this.d;
            return j10.c.getJavaType() == JavaType.ENUM ? j10.a.findValueByNumber(((int)(((Integer)object0)))) : object0;
        }

        public final Object b(Object object0) {
            return this.d.c.getJavaType() == JavaType.ENUM ? ((EnumLite)object0).getNumber() : object0;
        }

        public MessageLite getContainingTypeDefaultInstance() {
            return this.a;
        }

        @Override  // androidx.datastore.preferences.protobuf.ExtensionLite
        public Object getDefaultValue() {
            return this.b;
        }

        @Override  // androidx.datastore.preferences.protobuf.ExtensionLite
        public FieldType getLiteType() {
            return this.d.c;
        }

        @Override  // androidx.datastore.preferences.protobuf.ExtensionLite
        public MessageLite getMessageDefaultInstance() {
            return this.c;
        }

        @Override  // androidx.datastore.preferences.protobuf.ExtensionLite
        public int getNumber() {
            return this.d.b;
        }

        @Override  // androidx.datastore.preferences.protobuf.ExtensionLite
        public boolean isRepeated() {
            return this.d.d;
        }
    }

    public static enum MethodToInvoke {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER;

    }

    public static final class SerializedForm implements Serializable {
        public final Class a;
        public final String b;
        public final byte[] c;

        public SerializedForm(MessageLite messageLite0) {
            Class class0 = messageLite0.getClass();
            this.a = class0;
            this.b = class0.getName();
            this.c = messageLite0.toByteArray();
        }

        public static SerializedForm of(MessageLite messageLite0) {
            return new SerializedForm(messageLite0);
        }

        public Object readResolve() throws ObjectStreamException {
            String s;
            byte[] arr_b;
            Class class0;
            try {
                class0 = this.a;
                arr_b = this.c;
                s = this.b;
                Field field0 = class0.getDeclaredField("DEFAULT_INSTANCE");
                field0.setAccessible(true);
                return ((MessageLite)field0.get(null)).newBuilderForType().mergeFrom(arr_b).buildPartial();
            }
            catch(ClassNotFoundException classNotFoundException0) {
                throw new RuntimeException("Unable to find proto buffer class: " + s, classNotFoundException0);
            }
            catch(NoSuchFieldException unused_ex) {
                try {
                    Field field1 = class0.getDeclaredField("defaultInstance");
                    field1.setAccessible(true);
                    return ((MessageLite)field1.get(null)).newBuilderForType().mergeFrom(arr_b).buildPartial();
                }
                catch(ClassNotFoundException classNotFoundException1) {
                    throw new RuntimeException("Unable to find proto buffer class: " + s, classNotFoundException1);
                }
                catch(NoSuchFieldException noSuchFieldException0) {
                    throw new RuntimeException("Unable to find defaultInstance in " + s, noSuchFieldException0);
                }
                catch(SecurityException securityException1) {
                    throw new RuntimeException("Unable to call defaultInstance in " + s, securityException1);
                }
                catch(IllegalAccessException illegalAccessException1) {
                    throw new RuntimeException("Unable to call parsePartialFrom", illegalAccessException1);
                }
                catch(InvalidProtocolBufferException invalidProtocolBufferException1) {
                    throw new RuntimeException("Unable to understand proto buffer", invalidProtocolBufferException1);
                }
            }
            catch(SecurityException securityException0) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in " + s, securityException0);
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw new RuntimeException("Unable to call parsePartialFrom", illegalAccessException0);
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                throw new RuntimeException("Unable to understand proto buffer", invalidProtocolBufferException0);
            }
        }
    }

    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = 0x7FFFFFFF;
    private static final int MUTABLE_FLAG_MASK = 0x80000000;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = 0x7FFFFFFF;
    private static Map defaultInstanceMap;
    private int memoizedSerializedSize;
    protected UnknownFieldSetLite unknownFields;

    static {
        GeneratedMessageLite.defaultInstanceMap = new ConcurrentHashMap();
    }

    public GeneratedMessageLite() {
        this.memoizedSerializedSize = -1;
        this.unknownFields = UnknownFieldSetLite.getDefaultInstance();
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractMessageLite
    public final int a() {
        return this.memoizedSerializedSize & 0x7FFFFFFF;
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractMessageLite
    public final int b(Schema schema0) {
        int v1;
        int v;
        if(this.j()) {
            if(schema0 == null) {
                v2.c.getClass();
                Class class0 = this.getClass();
                v = v2.c.a(class0).getSerializedSize(this);
            }
            else {
                v = schema0.getSerializedSize(this);
            }
            if(v < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + v);
            }
            return v;
        }
        if(this.a() != 0x7FFFFFFF) {
            return this.a();
        }
        if(schema0 == null) {
            v2.c.getClass();
            Class class1 = this.getClass();
            v1 = v2.c.a(class1).getSerializedSize(this);
        }
        else {
            v1 = schema0.getSerializedSize(this);
        }
        this.d(v1);
        return v1;
    }

    public final Builder createBuilder() {
        return (Builder)this.dynamicMethod(MethodToInvoke.NEW_BUILDER);
    }

    public final Builder createBuilder(GeneratedMessageLite generatedMessageLite0) {
        return this.createBuilder().mergeFrom(generatedMessageLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractMessageLite
    public final void d(int v) {
        if(v < 0) {
            throw new IllegalStateException("serialized size must be non-negative, was " + v);
        }
        this.memoizedSerializedSize = v & 0x7FFFFFFF | this.memoizedSerializedSize & 0x80000000;
    }

    public Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0) {
        return this.dynamicMethod(generatedMessageLite$MethodToInvoke0, null, null);
    }

    @CanIgnoreReturnValue
    public Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0) {
        return this.dynamicMethod(generatedMessageLite$MethodToInvoke0, object0, null);
    }

    public abstract Object dynamicMethod(MethodToInvoke arg1, Object arg2, Object arg3);

    public static void e(GeneratedMessageLite generatedMessageLite0) {
        if(generatedMessageLite0 != null && !generatedMessageLite0.isInitialized()) {
            throw new UninitializedMessageException(generatedMessageLite0).asInvalidProtocolBufferException().setUnfinishedMessage(generatedMessageLite0);
        }
    }

    public static BooleanList emptyBooleanList() {
        return j.d;
    }

    public static DoubleList emptyDoubleList() {
        return h0.d;
    }

    public static FloatList emptyFloatList() {
        return f1.d;
    }

    public static IntList emptyIntList() {
        return m1.d;
    }

    public static LongList emptyLongList() {
        return z1.d;
    }

    public static ProtobufList emptyProtobufList() {
        return w2.d;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        if(this.getClass() != object0.getClass()) {
            return false;
        }
        v2.c.getClass();
        Class class0 = this.getClass();
        return v2.c.a(class0).equals(this, ((GeneratedMessageLite)object0));
    }

    public final void f() {
        this.memoizedHashCode = 0;
    }

    public final void g() {
        this.d(0x7FFFFFFF);
    }

    public final GeneratedMessageLite getDefaultInstanceForType() {
        return (GeneratedMessageLite)this.dynamicMethod(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
    public MessageLite getDefaultInstanceForType() {
        return this.getDefaultInstanceForType();
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageLite
    public final Parser getParserForType() {
        return (Parser)this.dynamicMethod(MethodToInvoke.GET_PARSER);
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageLite
    public int getSerializedSize() {
        return this.b(null);
    }

    public static GeneratedMessageLite h(Class class0) {
        GeneratedMessageLite generatedMessageLite0 = (GeneratedMessageLite)GeneratedMessageLite.defaultInstanceMap.get(class0);
        if(generatedMessageLite0 == null) {
            try {
                Class.forName(class0.getName(), true, class0.getClassLoader());
            }
            catch(ClassNotFoundException classNotFoundException0) {
                throw new IllegalStateException("Class initialization cannot fail.", classNotFoundException0);
            }
            generatedMessageLite0 = (GeneratedMessageLite)GeneratedMessageLite.defaultInstanceMap.get(class0);
        }
        if(generatedMessageLite0 == null) {
            generatedMessageLite0 = ((GeneratedMessageLite)d4.c(class0)).getDefaultInstanceForType();
            if(generatedMessageLite0 == null) {
                throw new IllegalStateException();
            }
            GeneratedMessageLite.defaultInstanceMap.put(class0, generatedMessageLite0);
            return generatedMessageLite0;
        }
        return generatedMessageLite0;
    }

    @Override
    public int hashCode() {
        if(this.j()) {
            v2.c.getClass();
            Class class0 = this.getClass();
            return v2.c.a(class0).hashCode(this);
        }
        if(this.memoizedHashCode == 0) {
            v2.c.getClass();
            Class class1 = this.getClass();
            this.memoizedHashCode = v2.c.a(class1).hashCode(this);
        }
        return this.memoizedHashCode;
    }

    public static Object i(Method method0, MessageLite messageLite0, Object[] arr_object) {
        try {
            return method0.invoke(messageLite0, arr_object);
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

    public static final boolean isInitialized(GeneratedMessageLite generatedMessageLite0, boolean z) {
        int v = (byte)(((Byte)generatedMessageLite0.dynamicMethod(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)));
        if(v == 1) {
            return true;
        }
        if(v == 0) {
            return false;
        }
        v2.c.getClass();
        Class class0 = generatedMessageLite0.getClass();
        boolean z1 = v2.c.a(class0).isInitialized(generatedMessageLite0);
        if(z) {
            generatedMessageLite0.dynamicMethod(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, (z1 ? generatedMessageLite0 : null));
        }
        return z1;
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return GeneratedMessageLite.isInitialized(this, true);
    }

    public final boolean j() {
        return (this.memoizedSerializedSize & 0x80000000) != 0;
    }

    public final void k() {
        this.memoizedSerializedSize &= 0x7FFFFFFF;
    }

    public final GeneratedMessageLite l() {
        return (GeneratedMessageLite)this.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
    }

    public static GeneratedMessageLite m(GeneratedMessageLite generatedMessageLite0, InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) {
        int v1;
        try {
            int v = inputStream0.read();
            if(v == -1) {
                return null;
            }
            v1 = CodedInputStream.readRawVarint32(v, inputStream0);
        }
        catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
            if(invalidProtocolBufferException0.b) {
                invalidProtocolBufferException0 = new InvalidProtocolBufferException(invalidProtocolBufferException0);
            }
            throw invalidProtocolBufferException0;
        }
        catch(IOException iOException0) {
            throw new InvalidProtocolBufferException(iOException0);
        }
        CodedInputStream codedInputStream0 = CodedInputStream.newInstance(new a(inputStream0, v1));
        GeneratedMessageLite generatedMessageLite1 = GeneratedMessageLite.n(generatedMessageLite0, codedInputStream0, extensionRegistryLite0);
        try {
            codedInputStream0.checkLastTagWas(0);
            return generatedMessageLite1;
        }
        catch(InvalidProtocolBufferException invalidProtocolBufferException1) {
            throw invalidProtocolBufferException1.setUnfinishedMessage(generatedMessageLite1);
        }
    }

    public void makeImmutable() {
        v2.c.getClass();
        Class class0 = this.getClass();
        v2.c.a(class0).makeImmutable(this);
        this.k();
    }

    public void mergeLengthDelimitedField(int v, ByteString byteString0) {
        if(this.unknownFields == UnknownFieldSetLite.getDefaultInstance()) {
            this.unknownFields = new UnknownFieldSetLite();
        }
        UnknownFieldSetLite unknownFieldSetLite0 = this.unknownFields;
        unknownFieldSetLite0.a();
        if(v == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        unknownFieldSetLite0.e(v << 3 | 2, byteString0);
    }

    public final void mergeUnknownFields(UnknownFieldSetLite unknownFieldSetLite0) {
        this.unknownFields = UnknownFieldSetLite.d(this.unknownFields, unknownFieldSetLite0);
    }

    public void mergeVarintField(int v, int v1) {
        if(this.unknownFields == UnknownFieldSetLite.getDefaultInstance()) {
            this.unknownFields = new UnknownFieldSetLite();
        }
        UnknownFieldSetLite unknownFieldSetLite0 = this.unknownFields;
        unknownFieldSetLite0.a();
        if(v == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        unknownFieldSetLite0.e(v << 3, ((long)v1));
    }

    public static BooleanList mutableCopy(BooleanList internal$BooleanList0) {
        int v = internal$BooleanList0.size();
        return v == 0 ? internal$BooleanList0.mutableCopyWithCapacity(10) : internal$BooleanList0.mutableCopyWithCapacity(v * 2);
    }

    public static DoubleList mutableCopy(DoubleList internal$DoubleList0) {
        int v = internal$DoubleList0.size();
        return v == 0 ? internal$DoubleList0.mutableCopyWithCapacity(10) : internal$DoubleList0.mutableCopyWithCapacity(v * 2);
    }

    public static FloatList mutableCopy(FloatList internal$FloatList0) {
        int v = internal$FloatList0.size();
        return v == 0 ? internal$FloatList0.mutableCopyWithCapacity(10) : internal$FloatList0.mutableCopyWithCapacity(v * 2);
    }

    public static IntList mutableCopy(IntList internal$IntList0) {
        int v = internal$IntList0.size();
        return v == 0 ? internal$IntList0.mutableCopyWithCapacity(10) : internal$IntList0.mutableCopyWithCapacity(v * 2);
    }

    public static LongList mutableCopy(LongList internal$LongList0) {
        int v = internal$LongList0.size();
        return v == 0 ? internal$LongList0.mutableCopyWithCapacity(10) : internal$LongList0.mutableCopyWithCapacity(v * 2);
    }

    public static ProtobufList mutableCopy(ProtobufList internal$ProtobufList0) {
        int v = internal$ProtobufList0.size();
        return v == 0 ? internal$ProtobufList0.mutableCopyWithCapacity(10) : internal$ProtobufList0.mutableCopyWithCapacity(v * 2);
    }

    public static GeneratedMessageLite n(GeneratedMessageLite generatedMessageLite0, CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) {
        GeneratedMessageLite generatedMessageLite1 = generatedMessageLite0.l();
        try {
            Schema schema0 = v2.c.b(generatedMessageLite1);
            schema0.mergeFrom(generatedMessageLite1, (codedInputStream0.d == null ? new y(codedInputStream0) : codedInputStream0.d), extensionRegistryLite0);
            schema0.makeImmutable(generatedMessageLite1);
            return generatedMessageLite1;
        }
        catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
            if(invalidProtocolBufferException0.b) {
                invalidProtocolBufferException0 = new InvalidProtocolBufferException(invalidProtocolBufferException0);
            }
            throw invalidProtocolBufferException0.setUnfinishedMessage(generatedMessageLite1);
        }
        catch(UninitializedMessageException uninitializedMessageException0) {
            throw uninitializedMessageException0.asInvalidProtocolBufferException().setUnfinishedMessage(generatedMessageLite1);
        }
        catch(IOException iOException0) {
            throw iOException0.getCause() instanceof InvalidProtocolBufferException ? ((InvalidProtocolBufferException)iOException0.getCause()) : new InvalidProtocolBufferException(iOException0).setUnfinishedMessage(generatedMessageLite1);
        }
        catch(RuntimeException runtimeException0) {
            if(runtimeException0.getCause() instanceof InvalidProtocolBufferException) {
                throw (InvalidProtocolBufferException)runtimeException0.getCause();
            }
            throw runtimeException0;
        }
    }

    public final Builder newBuilderForType() {
        return (Builder)this.dynamicMethod(MethodToInvoke.NEW_BUILDER);
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageLite
    public androidx.datastore.preferences.protobuf.MessageLite.Builder newBuilderForType() {
        return this.newBuilderForType();
    }

    public static Object newMessageInfo(MessageLite messageLite0, String s, Object[] arr_object) {
        return new x2(messageLite0, s, arr_object);
    }

    public static GeneratedExtension newRepeatedGeneratedExtension(MessageLite messageLite0, MessageLite messageLite1, EnumLiteMap internal$EnumLiteMap0, int v, FieldType wireFormat$FieldType0, boolean z, Class class0) {
        return new GeneratedExtension(messageLite0, Collections.emptyList(), messageLite1, new j1(internal$EnumLiteMap0, v, wireFormat$FieldType0, true, z));
    }

    public static GeneratedExtension newSingularGeneratedExtension(MessageLite messageLite0, Object object0, MessageLite messageLite1, EnumLiteMap internal$EnumLiteMap0, int v, FieldType wireFormat$FieldType0, Class class0) {
        return new GeneratedExtension(messageLite0, object0, messageLite1, new j1(internal$EnumLiteMap0, v, wireFormat$FieldType0, false, false));
    }

    public static GeneratedMessageLite o(GeneratedMessageLite generatedMessageLite0, byte[] arr_b, int v, int v1, ExtensionRegistryLite extensionRegistryLite0) {
        GeneratedMessageLite generatedMessageLite1 = generatedMessageLite0.l();
        try {
            Schema schema0 = v2.c.b(generatedMessageLite1);
            schema0.mergeFrom(generatedMessageLite1, arr_b, v, v + v1, new g(extensionRegistryLite0));
            schema0.makeImmutable(generatedMessageLite1);
            return generatedMessageLite1;
        }
        catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
            if(invalidProtocolBufferException0.b) {
                invalidProtocolBufferException0 = new InvalidProtocolBufferException(invalidProtocolBufferException0);
            }
            throw invalidProtocolBufferException0.setUnfinishedMessage(generatedMessageLite1);
        }
        catch(UninitializedMessageException uninitializedMessageException0) {
            throw uninitializedMessageException0.asInvalidProtocolBufferException().setUnfinishedMessage(generatedMessageLite1);
        }
        catch(IOException iOException0) {
            throw iOException0.getCause() instanceof InvalidProtocolBufferException ? ((InvalidProtocolBufferException)iOException0.getCause()) : new InvalidProtocolBufferException(iOException0).setUnfinishedMessage(generatedMessageLite1);
        }
        catch(IndexOutOfBoundsException unused_ex) {
            throw InvalidProtocolBufferException.h().setUnfinishedMessage(generatedMessageLite1);
        }
    }

    public static GeneratedMessageLite parseDelimitedFrom(GeneratedMessageLite generatedMessageLite0, InputStream inputStream0) throws InvalidProtocolBufferException {
        GeneratedMessageLite generatedMessageLite1 = GeneratedMessageLite.m(generatedMessageLite0, inputStream0, ExtensionRegistryLite.getEmptyRegistry());
        GeneratedMessageLite.e(generatedMessageLite1);
        return generatedMessageLite1;
    }

    public static GeneratedMessageLite parseDelimitedFrom(GeneratedMessageLite generatedMessageLite0, InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        GeneratedMessageLite generatedMessageLite1 = GeneratedMessageLite.m(generatedMessageLite0, inputStream0, extensionRegistryLite0);
        GeneratedMessageLite.e(generatedMessageLite1);
        return generatedMessageLite1;
    }

    public static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite0, ByteString byteString0) throws InvalidProtocolBufferException {
        GeneratedMessageLite generatedMessageLite1 = GeneratedMessageLite.parseFrom(generatedMessageLite0, byteString0, ExtensionRegistryLite.getEmptyRegistry());
        GeneratedMessageLite.e(generatedMessageLite1);
        return generatedMessageLite1;
    }

    public static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite0, ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        CodedInputStream codedInputStream0 = byteString0.newCodedInput();
        GeneratedMessageLite generatedMessageLite1 = GeneratedMessageLite.n(generatedMessageLite0, codedInputStream0, extensionRegistryLite0);
        try {
            codedInputStream0.checkLastTagWas(0);
        }
        catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
            throw invalidProtocolBufferException0.setUnfinishedMessage(generatedMessageLite1);
        }
        GeneratedMessageLite.e(generatedMessageLite1);
        return generatedMessageLite1;
    }

    public static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite0, CodedInputStream codedInputStream0) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(generatedMessageLite0, codedInputStream0, ExtensionRegistryLite.getEmptyRegistry());
    }

    public static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite0, CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        GeneratedMessageLite generatedMessageLite1 = GeneratedMessageLite.n(generatedMessageLite0, codedInputStream0, extensionRegistryLite0);
        GeneratedMessageLite.e(generatedMessageLite1);
        return generatedMessageLite1;
    }

    public static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite0, InputStream inputStream0) throws InvalidProtocolBufferException {
        GeneratedMessageLite generatedMessageLite1 = GeneratedMessageLite.n(generatedMessageLite0, CodedInputStream.newInstance(inputStream0), ExtensionRegistryLite.getEmptyRegistry());
        GeneratedMessageLite.e(generatedMessageLite1);
        return generatedMessageLite1;
    }

    public static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite0, InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        GeneratedMessageLite generatedMessageLite1 = GeneratedMessageLite.n(generatedMessageLite0, CodedInputStream.newInstance(inputStream0), extensionRegistryLite0);
        GeneratedMessageLite.e(generatedMessageLite1);
        return generatedMessageLite1;
    }

    public static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite0, ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(generatedMessageLite0, byteBuffer0, ExtensionRegistryLite.getEmptyRegistry());
    }

    public static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite0, ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        GeneratedMessageLite generatedMessageLite1 = GeneratedMessageLite.parseFrom(generatedMessageLite0, CodedInputStream.newInstance(byteBuffer0), extensionRegistryLite0);
        GeneratedMessageLite.e(generatedMessageLite1);
        return generatedMessageLite1;
    }

    public static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite0, byte[] arr_b) throws InvalidProtocolBufferException {
        ExtensionRegistryLite extensionRegistryLite0 = ExtensionRegistryLite.getEmptyRegistry();
        GeneratedMessageLite generatedMessageLite1 = GeneratedMessageLite.o(generatedMessageLite0, arr_b, 0, arr_b.length, extensionRegistryLite0);
        GeneratedMessageLite.e(generatedMessageLite1);
        return generatedMessageLite1;
    }

    public static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite0, byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        GeneratedMessageLite generatedMessageLite1 = GeneratedMessageLite.o(generatedMessageLite0, arr_b, 0, arr_b.length, extensionRegistryLite0);
        GeneratedMessageLite.e(generatedMessageLite1);
        return generatedMessageLite1;
    }

    public static GeneratedMessageLite parsePartialFrom(GeneratedMessageLite generatedMessageLite0, CodedInputStream codedInputStream0) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.n(generatedMessageLite0, codedInputStream0, ExtensionRegistryLite.getEmptyRegistry());
    }

    public boolean parseUnknownField(int v, CodedInputStream codedInputStream0) throws IOException {
        if((v & 7) == 4) {
            return false;
        }
        if(this.unknownFields == UnknownFieldSetLite.getDefaultInstance()) {
            this.unknownFields = new UnknownFieldSetLite();
        }
        return this.unknownFields.c(v, codedInputStream0);
    }

    public static void registerDefaultInstance(Class class0, GeneratedMessageLite generatedMessageLite0) {
        generatedMessageLite0.k();
        GeneratedMessageLite.defaultInstanceMap.put(class0, generatedMessageLite0);
    }

    public final Builder toBuilder() {
        return ((Builder)this.dynamicMethod(MethodToInvoke.NEW_BUILDER)).mergeFrom(this);
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageLite
    public androidx.datastore.preferences.protobuf.MessageLite.Builder toBuilder() {
        return this.toBuilder();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("# ");
        stringBuilder0.append(super.toString());
        g2.c(this, stringBuilder0, 0);
        return stringBuilder0.toString();
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream0) throws IOException {
        v2.c.getClass();
        Class class0 = this.getClass();
        v2.c.a(class0).writeTo(this, (codedOutputStream0.a == null ? new g0(codedOutputStream0) : codedOutputStream0.a));
    }
}

