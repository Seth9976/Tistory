package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage.ExtensionWriter;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.protobuf.ProtocolStringList;

public final class ProtoBuf {
    public static final class Annotation extends GeneratedMessageLite implements ProtoBuf.AnnotationOrBuilder {
        public static final class Argument extends GeneratedMessageLite implements ProtoBuf.Annotation.ArgumentOrBuilder {
            public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder implements ProtoBuf.Annotation.ArgumentOrBuilder {
                public int b;
                public int c;
                public Value d;

                public Builder() {
                    this.d = Value.getDefaultInstance();
                }

                public Argument build() {
                    Argument protoBuf$Annotation$Argument0 = this.buildPartial();
                    if(!protoBuf$Annotation$Argument0.isInitialized()) {
                        throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(protoBuf$Annotation$Argument0);
                    }
                    return protoBuf$Annotation$Argument0;
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite$Builder
                public MessageLite build() {
                    return this.build();
                }

                public Argument buildPartial() {
                    Argument protoBuf$Annotation$Argument0 = new Argument(this);
                    int v = (this.b & 1) == 1 ? 1 : 0;
                    protoBuf$Annotation$Argument0.c = this.c;
                    if((this.b & 2) == 2) {
                        v |= 2;
                    }
                    protoBuf$Annotation$Argument0.d = this.d;
                    protoBuf$Annotation$Argument0.b = v;
                    return protoBuf$Annotation$Argument0;
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
                public Object clone() throws CloneNotSupportedException {
                    return this.clone();
                }

                public Builder clone() {
                    return new Builder().mergeFrom(this.buildPartial());
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
                public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder clone() {
                    return this.clone();
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
                public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder clone() {
                    return this.clone();
                }

                public Argument getDefaultInstanceForType() {
                    return Argument.getDefaultInstance();
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
                public GeneratedMessageLite getDefaultInstanceForType() {
                    return this.getDefaultInstanceForType();
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public MessageLite getDefaultInstanceForType() {
                    return this.getDefaultInstanceForType();
                }

                public Value getValue() {
                    return this.d;
                }

                public boolean hasNameId() {
                    return (this.b & 1) == 1;
                }

                public boolean hasValue() {
                    return (this.b & 2) == 2;
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    if(!this.hasNameId()) {
                        return false;
                    }
                    return this.hasValue() ? this.getValue().isInitialized() : false;
                }

                public Builder mergeFrom(Argument protoBuf$Annotation$Argument0) {
                    if(protoBuf$Annotation$Argument0 == Argument.getDefaultInstance()) {
                        return this;
                    }
                    if(protoBuf$Annotation$Argument0.hasNameId()) {
                        this.setNameId(protoBuf$Annotation$Argument0.getNameId());
                    }
                    if(protoBuf$Annotation$Argument0.hasValue()) {
                        this.mergeValue(protoBuf$Annotation$Argument0.getValue());
                    }
                    this.setUnknownFields(this.getUnknownFields().concat(protoBuf$Annotation$Argument0.a));
                    return this;
                }

                public Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                    Argument protoBuf$Annotation$Argument1;
                    Argument protoBuf$Annotation$Argument0;
                    try {
                        try {
                            protoBuf$Annotation$Argument0 = null;
                            protoBuf$Annotation$Argument1 = (Argument)Argument.PARSER.parsePartialFrom(codedInputStream0, extensionRegistryLite0);
                            goto label_13;
                        }
                        catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                            Argument protoBuf$Annotation$Argument2 = (Argument)invalidProtocolBufferException0.getUnfinishedMessage();
                            try {
                                throw invalidProtocolBufferException0;
                            }
                            catch(Throwable throwable0) {
                                protoBuf$Annotation$Argument0 = protoBuf$Annotation$Argument2;
                            }
                        }
                    }
                    catch(Throwable throwable0) {
                    }
                    if(protoBuf$Annotation$Argument0 != null) {
                        this.mergeFrom(protoBuf$Annotation$Argument0);
                    }
                    throw throwable0;
                label_13:
                    if(protoBuf$Annotation$Argument1 != null) {
                        this.mergeFrom(protoBuf$Annotation$Argument1);
                    }
                    return this;
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
                public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                    return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
                public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedMessageLite0) {
                    return this.mergeFrom(((Argument)generatedMessageLite0));
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
                public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                    return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
                }

                public Builder mergeValue(Value protoBuf$Annotation$Argument$Value0) {
                    this.d = (this.b & 2) != 2 || this.d == Value.getDefaultInstance() ? protoBuf$Annotation$Argument$Value0 : Value.newBuilder(this.d).mergeFrom(protoBuf$Annotation$Argument$Value0).buildPartial();
                    this.b |= 2;
                    return this;
                }

                public Builder setNameId(int v) {
                    this.b |= 1;
                    this.c = v;
                    return this;
                }
            }

            public static final class Value extends GeneratedMessageLite implements ProtoBuf.Annotation.Argument.ValueOrBuilder {
                public static final class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder implements ProtoBuf.Annotation.Argument.ValueOrBuilder {
                    public int b;
                    public Type c;
                    public long d;
                    public float e;
                    public double f;
                    public int g;
                    public int h;
                    public int i;
                    public Annotation j;
                    public List k;
                    public int l;
                    public int m;

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder() {
                        this.c = Type.BYTE;
                        this.j = Annotation.getDefaultInstance();
                        this.k = Collections.emptyList();
                    }

                    public Value build() {
                        Value protoBuf$Annotation$Argument$Value0 = this.buildPartial();
                        if(!protoBuf$Annotation$Argument$Value0.isInitialized()) {
                            throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(protoBuf$Annotation$Argument$Value0);
                        }
                        return protoBuf$Annotation$Argument$Value0;
                    }

                    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite$Builder
                    public MessageLite build() {
                        return this.build();
                    }

                    public Value buildPartial() {
                        Value protoBuf$Annotation$Argument$Value0 = new Value(this);
                        int v = this.b;
                        int v1 = (v & 1) == 1 ? 1 : 0;
                        protoBuf$Annotation$Argument$Value0.c = this.c;
                        if((v & 2) == 2) {
                            v1 |= 2;
                        }
                        protoBuf$Annotation$Argument$Value0.d = this.d;
                        if((v & 4) == 4) {
                            v1 |= 4;
                        }
                        protoBuf$Annotation$Argument$Value0.e = this.e;
                        if((v & 8) == 8) {
                            v1 |= 8;
                        }
                        protoBuf$Annotation$Argument$Value0.f = this.f;
                        if((v & 16) == 16) {
                            v1 |= 16;
                        }
                        protoBuf$Annotation$Argument$Value0.g = this.g;
                        if((v & 0x20) == 0x20) {
                            v1 |= 0x20;
                        }
                        protoBuf$Annotation$Argument$Value0.h = this.h;
                        if((v & 0x40) == 0x40) {
                            v1 |= 0x40;
                        }
                        protoBuf$Annotation$Argument$Value0.i = this.i;
                        if((v & 0x80) == 0x80) {
                            v1 |= 0x80;
                        }
                        protoBuf$Annotation$Argument$Value0.j = this.j;
                        if((v & 0x100) == 0x100) {
                            this.k = Collections.unmodifiableList(this.k);
                            this.b &= 0xFFFFFEFF;
                        }
                        protoBuf$Annotation$Argument$Value0.k = this.k;
                        if((v & 0x200) == 0x200) {
                            v1 |= 0x100;
                        }
                        protoBuf$Annotation$Argument$Value0.l = this.l;
                        if((v & 0x400) == 0x400) {
                            v1 |= 0x200;
                        }
                        protoBuf$Annotation$Argument$Value0.m = this.m;
                        protoBuf$Annotation$Argument$Value0.b = v1;
                        return protoBuf$Annotation$Argument$Value0;
                    }

                    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
                    public Object clone() throws CloneNotSupportedException {
                        return this.clone();
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder clone() {
                        return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder().mergeFrom(this.buildPartial());
                    }

                    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
                    public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder clone() {
                        return this.clone();
                    }

                    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
                    public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder clone() {
                        return this.clone();
                    }

                    public Annotation getAnnotation() {
                        return this.j;
                    }

                    public Value getArrayElement(int v) {
                        return (Value)this.k.get(v);
                    }

                    public int getArrayElementCount() {
                        return this.k.size();
                    }

                    public Value getDefaultInstanceForType() {
                        return Value.getDefaultInstance();
                    }

                    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
                    public GeneratedMessageLite getDefaultInstanceForType() {
                        return this.getDefaultInstanceForType();
                    }

                    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                    public MessageLite getDefaultInstanceForType() {
                        return this.getDefaultInstanceForType();
                    }

                    public boolean hasAnnotation() {
                        return (this.b & 0x80) == 0x80;
                    }

                    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        if(this.hasAnnotation() && !this.getAnnotation().isInitialized()) {
                            return false;
                        }
                        for(int v = 0; v < this.getArrayElementCount(); ++v) {
                            if(!this.getArrayElement(v).isInitialized()) {
                                return false;
                            }
                        }
                        return true;
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder mergeAnnotation(Annotation protoBuf$Annotation0) {
                        this.j = (this.b & 0x80) != 0x80 || this.j == Annotation.getDefaultInstance() ? protoBuf$Annotation0 : Annotation.newBuilder(this.j).mergeFrom(protoBuf$Annotation0).buildPartial();
                        this.b |= 0x80;
                        return this;
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder mergeFrom(Value protoBuf$Annotation$Argument$Value0) {
                        if(protoBuf$Annotation$Argument$Value0 == Value.getDefaultInstance()) {
                            return this;
                        }
                        if(protoBuf$Annotation$Argument$Value0.hasType()) {
                            this.setType(protoBuf$Annotation$Argument$Value0.getType());
                        }
                        if(protoBuf$Annotation$Argument$Value0.hasIntValue()) {
                            this.setIntValue(protoBuf$Annotation$Argument$Value0.getIntValue());
                        }
                        if(protoBuf$Annotation$Argument$Value0.hasFloatValue()) {
                            this.setFloatValue(protoBuf$Annotation$Argument$Value0.getFloatValue());
                        }
                        if(protoBuf$Annotation$Argument$Value0.hasDoubleValue()) {
                            this.setDoubleValue(protoBuf$Annotation$Argument$Value0.getDoubleValue());
                        }
                        if(protoBuf$Annotation$Argument$Value0.hasStringValue()) {
                            this.setStringValue(protoBuf$Annotation$Argument$Value0.getStringValue());
                        }
                        if(protoBuf$Annotation$Argument$Value0.hasClassId()) {
                            this.setClassId(protoBuf$Annotation$Argument$Value0.getClassId());
                        }
                        if(protoBuf$Annotation$Argument$Value0.hasEnumValueId()) {
                            this.setEnumValueId(protoBuf$Annotation$Argument$Value0.getEnumValueId());
                        }
                        if(protoBuf$Annotation$Argument$Value0.hasAnnotation()) {
                            this.mergeAnnotation(protoBuf$Annotation$Argument$Value0.getAnnotation());
                        }
                        if(!protoBuf$Annotation$Argument$Value0.k.isEmpty()) {
                            if(this.k.isEmpty()) {
                                this.k = protoBuf$Annotation$Argument$Value0.k;
                                this.b &= 0xFFFFFEFF;
                            }
                            else {
                                if((this.b & 0x100) != 0x100) {
                                    this.k = new ArrayList(this.k);
                                    this.b |= 0x100;
                                }
                                this.k.addAll(protoBuf$Annotation$Argument$Value0.k);
                            }
                        }
                        if(protoBuf$Annotation$Argument$Value0.hasArrayDimensionCount()) {
                            this.setArrayDimensionCount(protoBuf$Annotation$Argument$Value0.getArrayDimensionCount());
                        }
                        if(protoBuf$Annotation$Argument$Value0.hasFlags()) {
                            this.setFlags(protoBuf$Annotation$Argument$Value0.getFlags());
                        }
                        this.setUnknownFields(this.getUnknownFields().concat(protoBuf$Annotation$Argument$Value0.a));
                        return this;
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                        Value protoBuf$Annotation$Argument$Value1;
                        Value protoBuf$Annotation$Argument$Value0;
                        try {
                            try {
                                protoBuf$Annotation$Argument$Value0 = null;
                                protoBuf$Annotation$Argument$Value1 = (Value)Value.PARSER.parsePartialFrom(codedInputStream0, extensionRegistryLite0);
                                goto label_13;
                            }
                            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                                Value protoBuf$Annotation$Argument$Value2 = (Value)invalidProtocolBufferException0.getUnfinishedMessage();
                                try {
                                    throw invalidProtocolBufferException0;
                                }
                                catch(Throwable throwable0) {
                                    protoBuf$Annotation$Argument$Value0 = protoBuf$Annotation$Argument$Value2;
                                }
                            }
                        }
                        catch(Throwable throwable0) {
                        }
                        if(protoBuf$Annotation$Argument$Value0 != null) {
                            this.mergeFrom(protoBuf$Annotation$Argument$Value0);
                        }
                        throw throwable0;
                    label_13:
                        if(protoBuf$Annotation$Argument$Value1 != null) {
                            this.mergeFrom(protoBuf$Annotation$Argument$Value1);
                        }
                        return this;
                    }

                    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
                    public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                        return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
                    }

                    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
                    public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedMessageLite0) {
                        return this.mergeFrom(((Value)generatedMessageLite0));
                    }

                    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
                    public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                        return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setArrayDimensionCount(int v) {
                        this.b |= 0x200;
                        this.l = v;
                        return this;
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setClassId(int v) {
                        this.b |= 0x20;
                        this.h = v;
                        return this;
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setDoubleValue(double f) {
                        this.b |= 8;
                        this.f = f;
                        return this;
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setEnumValueId(int v) {
                        this.b |= 0x40;
                        this.i = v;
                        return this;
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setFlags(int v) {
                        this.b |= 0x400;
                        this.m = v;
                        return this;
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setFloatValue(float f) {
                        this.b |= 4;
                        this.e = f;
                        return this;
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setIntValue(long v) {
                        this.b |= 2;
                        this.d = v;
                        return this;
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setStringValue(int v) {
                        this.b |= 16;
                        this.g = v;
                        return this;
                    }

                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder setType(Type protoBuf$Annotation$Argument$Value$Type0) {
                        protoBuf$Annotation$Argument$Value$Type0.getClass();
                        this.b |= 1;
                        this.c = protoBuf$Annotation$Argument$Value$Type0;
                        return this;
                    }
                }

                public static enum Type implements EnumLite {
                    BYTE(0),
                    CHAR(1),
                    SHORT(2),
                    INT(3),
                    LONG(4),
                    FLOAT(5),
                    DOUBLE(6),
                    BOOLEAN(7),
                    STRING(8),
                    CLASS(9),
                    ENUM(10),
                    ANNOTATION(11),
                    ARRAY(12);

                    public final int a;

                    public Type(int v1) {
                        this.a = v1;
                    }

                    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.Internal$EnumLite
                    public final int getNumber() {
                        return this.a;
                    }

                    public static Type valueOf(int v) {
                        switch(v) {
                            case 0: {
                                return Type.BYTE;
                            }
                            case 1: {
                                return Type.CHAR;
                            }
                            case 2: {
                                return Type.SHORT;
                            }
                            case 3: {
                                return Type.INT;
                            }
                            case 4: {
                                return Type.LONG;
                            }
                            case 5: {
                                return Type.FLOAT;
                            }
                            case 6: {
                                return Type.DOUBLE;
                            }
                            case 7: {
                                return Type.BOOLEAN;
                            }
                            case 8: {
                                return Type.STRING;
                            }
                            case 9: {
                                return Type.CLASS;
                            }
                            case 10: {
                                return Type.ENUM;
                            }
                            case 11: {
                                return Type.ANNOTATION;
                            }
                            case 12: {
                                return Type.ARRAY;
                            }
                            default: {
                                return null;
                            }
                        }
                    }
                }

                public static Parser PARSER;
                public final ByteString a;
                public int b;
                public Type c;
                public long d;
                public float e;
                public double f;
                public int g;
                public int h;
                public int i;
                public Annotation j;
                public List k;
                public int l;
                public int m;
                public byte n;
                public int o;
                public static final Value p;

                static {
                    Value.PARSER = new c();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/AbstractParser;-><init>()V
                    Value protoBuf$Annotation$Argument$Value0 = new Value();
                    Value.p = protoBuf$Annotation$Argument$Value0;
                    protoBuf$Annotation$Argument$Value0.a();
                }

                public Value() {
                    this.n = -1;
                    this.o = -1;
                    this.a = ByteString.EMPTY;
                }

                public Value(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder protoBuf$Annotation$Argument$Value$Builder0) {
                    super(protoBuf$Annotation$Argument$Value$Builder0);
                    this.n = -1;
                    this.o = -1;
                    this.a = protoBuf$Annotation$Argument$Value$Builder0.getUnknownFields();
                }

                public Value(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) {
                    this.n = -1;
                    this.o = -1;
                    this.a();
                    Output byteString$Output0 = ByteString.newOutput();
                    CodedOutputStream codedOutputStream0 = CodedOutputStream.newInstance(byteString$Output0, 1);
                    int v = 0;
                    boolean z = false;
                    while(!z) {
                        try {
                            try {
                                int v1 = codedInputStream0.readTag();
                                switch(v1) {
                                    case 0: {
                                        z = true;
                                        continue;
                                    }
                                    case 8: {
                                        int v2 = codedInputStream0.readEnum();
                                        Type protoBuf$Annotation$Argument$Value$Type0 = Type.valueOf(v2);
                                        if(protoBuf$Annotation$Argument$Value$Type0 == null) {
                                            codedOutputStream0.writeRawVarint32(8);
                                            codedOutputStream0.writeRawVarint32(v2);
                                        }
                                        else {
                                            this.b |= 1;
                                            this.c = protoBuf$Annotation$Argument$Value$Type0;
                                        }
                                        continue;
                                    }
                                    case 16: {
                                        this.b |= 2;
                                        this.d = codedInputStream0.readSInt64();
                                        continue;
                                    }
                                    case 29: {
                                        this.b |= 4;
                                        this.e = codedInputStream0.readFloat();
                                        continue;
                                    }
                                    case 33: {
                                        this.b |= 8;
                                        this.f = codedInputStream0.readDouble();
                                        continue;
                                    }
                                    case 40: {
                                        this.b |= 16;
                                        this.g = codedInputStream0.readInt32();
                                        continue;
                                    }
                                    case 0x30: {
                                        this.b |= 0x20;
                                        this.h = codedInputStream0.readInt32();
                                        continue;
                                    }
                                    case 56: {
                                        this.b |= 0x40;
                                        this.i = codedInputStream0.readInt32();
                                        continue;
                                    }
                                    case 66: {
                                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder protoBuf$Annotation$Builder0 = (this.b & 0x80) == 0x80 ? this.j.toBuilder() : null;
                                        Annotation protoBuf$Annotation0 = (Annotation)codedInputStream0.readMessage(Annotation.PARSER, extensionRegistryLite0);
                                        this.j = protoBuf$Annotation0;
                                        if(protoBuf$Annotation$Builder0 != null) {
                                            protoBuf$Annotation$Builder0.mergeFrom(protoBuf$Annotation0);
                                            this.j = protoBuf$Annotation$Builder0.buildPartial();
                                        }
                                        this.b |= 0x80;
                                        continue;
                                    }
                                    case 74: {
                                        if((v & 0x100) != 0x100) {
                                            this.k = new ArrayList();
                                            v = 0x100;
                                        }
                                        this.k.add(codedInputStream0.readMessage(Value.PARSER, extensionRegistryLite0));
                                        continue;
                                    }
                                    case 80: {
                                        this.b |= 0x200;
                                        this.m = codedInputStream0.readInt32();
                                        continue;
                                    }
                                    case 88: {
                                        this.b |= 0x100;
                                        this.l = codedInputStream0.readInt32();
                                        continue;
                                    }
                                    default: {
                                        if(!this.parseUnknownField(codedInputStream0, codedOutputStream0, extensionRegistryLite0, v1)) {
                                            z = true;
                                            continue;
                                        }
                                        continue;
                                    }
                                }
                            }
                            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                            }
                            catch(IOException iOException0) {
                                throw new InvalidProtocolBufferException(iOException0.getMessage()).setUnfinishedMessage(this);
                            }
                            throw invalidProtocolBufferException0.setUnfinishedMessage(this);
                        }
                        catch(Throwable throwable0) {
                        }
                        if((v & 0x100) == 0x100) {
                            this.k = Collections.unmodifiableList(this.k);
                        }
                        try {
                            codedOutputStream0.flush();
                            goto label_74;
                        }
                        catch(IOException unused_ex) {
                            goto label_74;
                        }
                        catch(Throwable throwable1) {
                        }
                        this.a = byteString$Output0.toByteString();
                        throw throwable1;
                    label_74:
                        this.a = byteString$Output0.toByteString();
                        this.makeExtensionsImmutable();
                        throw throwable0;
                    }
                    if((v & 0x100) == 0x100) {
                        this.k = Collections.unmodifiableList(this.k);
                    }
                    try {
                        codedOutputStream0.flush();
                        goto label_85;
                    }
                    catch(IOException unused_ex) {
                        goto label_85;
                    }
                    catch(Throwable throwable2) {
                    }
                    this.a = byteString$Output0.toByteString();
                    throw throwable2;
                label_85:
                    this.a = byteString$Output0.toByteString();
                    this.makeExtensionsImmutable();
                }

                public final void a() {
                    this.c = Type.BYTE;
                    this.d = 0L;
                    this.e = 0.0f;
                    this.f = 0.0;
                    this.g = 0;
                    this.h = 0;
                    this.i = 0;
                    this.j = Annotation.getDefaultInstance();
                    this.k = Collections.emptyList();
                    this.l = 0;
                    this.m = 0;
                }

                public Annotation getAnnotation() {
                    return this.j;
                }

                public int getArrayDimensionCount() {
                    return this.l;
                }

                public Value getArrayElement(int v) {
                    return (Value)this.k.get(v);
                }

                public int getArrayElementCount() {
                    return this.k.size();
                }

                public List getArrayElementList() {
                    return this.k;
                }

                public int getClassId() {
                    return this.h;
                }

                public static Value getDefaultInstance() {
                    return Value.p;
                }

                public Value getDefaultInstanceForType() {
                    return Value.p;
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public MessageLite getDefaultInstanceForType() {
                    return this.getDefaultInstanceForType();
                }

                public double getDoubleValue() {
                    return this.f;
                }

                public int getEnumValueId() {
                    return this.i;
                }

                public int getFlags() {
                    return this.m;
                }

                public float getFloatValue() {
                    return this.e;
                }

                public long getIntValue() {
                    return this.d;
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
                public Parser getParserForType() {
                    return Value.PARSER;
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public int getSerializedSize() {
                    int v1 = this.o;
                    if(v1 != -1) {
                        return v1;
                    }
                    int v2 = (this.b & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.c.getNumber()) : 0;
                    if((this.b & 2) == 2) {
                        v2 += CodedOutputStream.computeSInt64Size(2, this.d);
                    }
                    if((this.b & 4) == 4) {
                        v2 += CodedOutputStream.computeFloatSize(3, this.e);
                    }
                    if((this.b & 8) == 8) {
                        v2 += CodedOutputStream.computeDoubleSize(4, this.f);
                    }
                    if((this.b & 16) == 16) {
                        v2 += CodedOutputStream.computeInt32Size(5, this.g);
                    }
                    if((this.b & 0x20) == 0x20) {
                        v2 += CodedOutputStream.computeInt32Size(6, this.h);
                    }
                    if((this.b & 0x40) == 0x40) {
                        v2 += CodedOutputStream.computeInt32Size(7, this.i);
                    }
                    if((this.b & 0x80) == 0x80) {
                        v2 += CodedOutputStream.computeMessageSize(8, this.j);
                    }
                    for(int v = 0; v < this.k.size(); ++v) {
                        v2 += CodedOutputStream.computeMessageSize(9, ((MessageLite)this.k.get(v)));
                    }
                    if((this.b & 0x200) == 0x200) {
                        v2 += CodedOutputStream.computeInt32Size(10, this.m);
                    }
                    if((this.b & 0x100) == 0x100) {
                        v2 += CodedOutputStream.computeInt32Size(11, this.l);
                    }
                    int v3 = this.a.size() + v2;
                    this.o = v3;
                    return v3;
                }

                public int getStringValue() {
                    return this.g;
                }

                public Type getType() {
                    return this.c;
                }

                public boolean hasAnnotation() {
                    return (this.b & 0x80) == 0x80;
                }

                public boolean hasArrayDimensionCount() {
                    return (this.b & 0x100) == 0x100;
                }

                public boolean hasClassId() {
                    return (this.b & 0x20) == 0x20;
                }

                public boolean hasDoubleValue() {
                    return (this.b & 8) == 8;
                }

                public boolean hasEnumValueId() {
                    return (this.b & 0x40) == 0x40;
                }

                public boolean hasFlags() {
                    return (this.b & 0x200) == 0x200;
                }

                public boolean hasFloatValue() {
                    return (this.b & 4) == 4;
                }

                public boolean hasIntValue() {
                    return (this.b & 2) == 2;
                }

                public boolean hasStringValue() {
                    return (this.b & 16) == 16;
                }

                public boolean hasType() {
                    return (this.b & 1) == 1;
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    int v = this.n;
                    if(v == 1) {
                        return true;
                    }
                    if(v == 0) {
                        return false;
                    }
                    if(this.hasAnnotation() && !this.getAnnotation().isInitialized()) {
                        this.n = 0;
                        return false;
                    }
                    for(int v1 = 0; v1 < this.getArrayElementCount(); ++v1) {
                        if(!this.getArrayElement(v1).isInitialized()) {
                            this.n = 0;
                            return false;
                        }
                    }
                    this.n = 1;
                    return true;
                }

                public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder newBuilder() {
                    return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder();
                }

                public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder newBuilder(Value protoBuf$Annotation$Argument$Value0) {
                    return Value.newBuilder().mergeFrom(protoBuf$Annotation$Argument$Value0);
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder newBuilderForType() {
                    return Value.newBuilder();
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder newBuilderForType() {
                    return this.newBuilderForType();
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder toBuilder() {
                    return Value.newBuilder(this);
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder toBuilder() {
                    return this.toBuilder();
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream0) throws IOException {
                    this.getSerializedSize();
                    if((this.b & 1) == 1) {
                        codedOutputStream0.writeEnum(1, this.c.getNumber());
                    }
                    if((this.b & 2) == 2) {
                        codedOutputStream0.writeSInt64(2, this.d);
                    }
                    if((this.b & 4) == 4) {
                        codedOutputStream0.writeFloat(3, this.e);
                    }
                    if((this.b & 8) == 8) {
                        codedOutputStream0.writeDouble(4, this.f);
                    }
                    if((this.b & 16) == 16) {
                        codedOutputStream0.writeInt32(5, this.g);
                    }
                    if((this.b & 0x20) == 0x20) {
                        codedOutputStream0.writeInt32(6, this.h);
                    }
                    if((this.b & 0x40) == 0x40) {
                        codedOutputStream0.writeInt32(7, this.i);
                    }
                    if((this.b & 0x80) == 0x80) {
                        codedOutputStream0.writeMessage(8, this.j);
                    }
                    for(int v = 0; v < this.k.size(); ++v) {
                        codedOutputStream0.writeMessage(9, ((MessageLite)this.k.get(v)));
                    }
                    if((this.b & 0x200) == 0x200) {
                        codedOutputStream0.writeInt32(10, this.m);
                    }
                    if((this.b & 0x100) == 0x100) {
                        codedOutputStream0.writeInt32(11, this.l);
                    }
                    codedOutputStream0.writeRawBytes(this.a);
                }
            }

            public static Parser PARSER;
            public final ByteString a;
            public int b;
            public int c;
            public Value d;
            public byte e;
            public int f;
            public static final Argument g;

            static {
                Argument.PARSER = new b();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/AbstractParser;-><init>()V
                Argument protoBuf$Annotation$Argument0 = new Argument();
                Argument.g = protoBuf$Annotation$Argument0;
                protoBuf$Annotation$Argument0.c = 0;
                protoBuf$Annotation$Argument0.d = Value.getDefaultInstance();
            }

            public Argument() {
                this.e = -1;
                this.f = -1;
                this.a = ByteString.EMPTY;
            }

            public Argument(Builder protoBuf$Annotation$Argument$Builder0) {
                super(protoBuf$Annotation$Argument$Builder0);
                this.e = -1;
                this.f = -1;
                this.a = protoBuf$Annotation$Argument$Builder0.getUnknownFields();
            }

            public Argument(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) {
                this.e = -1;
                this.f = -1;
                this.c = 0;
                this.d = Value.getDefaultInstance();
                Output byteString$Output0 = ByteString.newOutput();
                CodedOutputStream codedOutputStream0 = CodedOutputStream.newInstance(byteString$Output0, 1);
                try {
                    boolean z = false;
                    while(!z) {
                        try {
                            try {
                                int v1 = codedInputStream0.readTag();
                                switch(v1) {
                                    case 0: {
                                        z = true;
                                        continue;
                                    }
                                    case 8: {
                                        this.b |= 1;
                                        this.c = codedInputStream0.readInt32();
                                        continue;
                                    }
                                    case 18: {
                                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder protoBuf$Annotation$Argument$Value$Builder0 = (this.b & 2) == 2 ? this.d.toBuilder() : null;
                                        Value protoBuf$Annotation$Argument$Value0 = (Value)codedInputStream0.readMessage(Value.PARSER, extensionRegistryLite0);
                                        this.d = protoBuf$Annotation$Argument$Value0;
                                        if(protoBuf$Annotation$Argument$Value$Builder0 != null) {
                                            protoBuf$Annotation$Argument$Value$Builder0.mergeFrom(protoBuf$Annotation$Argument$Value0);
                                            this.d = protoBuf$Annotation$Argument$Value$Builder0.buildPartial();
                                        }
                                        break;
                                    }
                                    default: {
                                        if(!this.parseUnknownField(codedInputStream0, codedOutputStream0, extensionRegistryLite0, v1)) {
                                            z = true;
                                            continue;
                                        }
                                        continue;
                                    }
                                }
                                this.b |= 2;
                                continue;
                            }
                            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                            }
                            catch(IOException iOException0) {
                                throw new InvalidProtocolBufferException(iOException0.getMessage()).setUnfinishedMessage(this);
                            }
                            throw invalidProtocolBufferException0.setUnfinishedMessage(this);
                        }
                        catch(Throwable throwable0) {
                        }
                        try {
                            codedOutputStream0.flush();
                            goto label_38;
                        }
                        catch(IOException unused_ex) {
                            goto label_38;
                        }
                        catch(Throwable throwable1) {
                        }
                        throw throwable1;
                    label_38:
                        this.makeExtensionsImmutable();
                        throw throwable0;
                    }
                    try {
                        codedOutputStream0.flush();
                    }
                    catch(IOException unused_ex) {
                    }
                }
                finally {
                    this.a = byteString$Output0.toByteString();
                }
                this.makeExtensionsImmutable();
            }

            public static Argument getDefaultInstance() {
                return Argument.g;
            }

            public Argument getDefaultInstanceForType() {
                return Argument.g;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public MessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            public int getNameId() {
                return this.c;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
            public Parser getParserForType() {
                return Argument.PARSER;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int v = this.f;
                if(v != -1) {
                    return v;
                }
                int v1 = (this.b & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.c) : 0;
                if((this.b & 2) == 2) {
                    v1 += CodedOutputStream.computeMessageSize(2, this.d);
                }
                int v2 = this.a.size() + v1;
                this.f = v2;
                return v2;
            }

            public Value getValue() {
                return this.d;
            }

            public boolean hasNameId() {
                return (this.b & 1) == 1;
            }

            public boolean hasValue() {
                return (this.b & 2) == 2;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                int v = this.e;
                if(v == 1) {
                    return true;
                }
                if(v == 0) {
                    return false;
                }
                if(!this.hasNameId()) {
                    this.e = 0;
                    return false;
                }
                if(!this.hasValue()) {
                    this.e = 0;
                    return false;
                }
                if(!this.getValue().isInitialized()) {
                    this.e = 0;
                    return false;
                }
                this.e = 1;
                return true;
            }

            public static Builder newBuilder() {
                return new Builder();
            }

            public static Builder newBuilder(Argument protoBuf$Annotation$Argument0) {
                return Argument.newBuilder().mergeFrom(protoBuf$Annotation$Argument0);
            }

            public Builder newBuilderForType() {
                return Argument.newBuilder();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder newBuilderForType() {
                return this.newBuilderForType();
            }

            public Builder toBuilder() {
                return Argument.newBuilder(this);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder toBuilder() {
                return this.toBuilder();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream0) throws IOException {
                this.getSerializedSize();
                if((this.b & 1) == 1) {
                    codedOutputStream0.writeInt32(1, this.c);
                }
                if((this.b & 2) == 2) {
                    codedOutputStream0.writeMessage(2, this.d);
                }
                codedOutputStream0.writeRawBytes(this.a);
            }
        }

        public static final class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder implements ProtoBuf.AnnotationOrBuilder {
            public int b;
            public int c;
            public List d;

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder() {
                this.d = Collections.emptyList();
            }

            public Annotation build() {
                Annotation protoBuf$Annotation0 = this.buildPartial();
                if(!protoBuf$Annotation0.isInitialized()) {
                    throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(protoBuf$Annotation0);
                }
                return protoBuf$Annotation0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite$Builder
            public MessageLite build() {
                return this.build();
            }

            public Annotation buildPartial() {
                Annotation protoBuf$Annotation0 = new Annotation(this);
                int v = this.b;
                protoBuf$Annotation0.c = this.c;
                if((v & 2) == 2) {
                    this.d = Collections.unmodifiableList(this.d);
                    this.b &= -3;
                }
                protoBuf$Annotation0.d = this.d;
                protoBuf$Annotation0.b = (v & 1) == 1 ? 1 : 0;
                return protoBuf$Annotation0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public Object clone() throws CloneNotSupportedException {
                return this.clone();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder().mergeFrom(this.buildPartial());
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder clone() {
                return this.clone();
            }

            public Argument getArgument(int v) {
                return (Argument)this.d.get(v);
            }

            public int getArgumentCount() {
                return this.d.size();
            }

            public Annotation getDefaultInstanceForType() {
                return Annotation.getDefaultInstance();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public GeneratedMessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public MessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            public boolean hasId() {
                return (this.b & 1) == 1;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if(!this.hasId()) {
                    return false;
                }
                for(int v = 0; v < this.getArgumentCount(); ++v) {
                    if(!this.getArgument(v).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder mergeFrom(Annotation protoBuf$Annotation0) {
                if(protoBuf$Annotation0 == Annotation.getDefaultInstance()) {
                    return this;
                }
                if(protoBuf$Annotation0.hasId()) {
                    this.setId(protoBuf$Annotation0.getId());
                }
                if(!protoBuf$Annotation0.d.isEmpty()) {
                    if(this.d.isEmpty()) {
                        this.d = protoBuf$Annotation0.d;
                        this.b &= -3;
                    }
                    else {
                        if((this.b & 2) != 2) {
                            this.d = new ArrayList(this.d);
                            this.b |= 2;
                        }
                        this.d.addAll(protoBuf$Annotation0.d);
                    }
                }
                this.setUnknownFields(this.getUnknownFields().concat(protoBuf$Annotation0.a));
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                Annotation protoBuf$Annotation1;
                Annotation protoBuf$Annotation0;
                try {
                    try {
                        protoBuf$Annotation0 = null;
                        protoBuf$Annotation1 = (Annotation)Annotation.PARSER.parsePartialFrom(codedInputStream0, extensionRegistryLite0);
                        goto label_13;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                        Annotation protoBuf$Annotation2 = (Annotation)invalidProtocolBufferException0.getUnfinishedMessage();
                        try {
                            throw invalidProtocolBufferException0;
                        }
                        catch(Throwable throwable0) {
                            protoBuf$Annotation0 = protoBuf$Annotation2;
                        }
                    }
                }
                catch(Throwable throwable0) {
                }
                if(protoBuf$Annotation0 != null) {
                    this.mergeFrom(protoBuf$Annotation0);
                }
                throw throwable0;
            label_13:
                if(protoBuf$Annotation1 != null) {
                    this.mergeFrom(protoBuf$Annotation1);
                }
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedMessageLite0) {
                return this.mergeFrom(((Annotation)generatedMessageLite0));
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder setId(int v) {
                this.b |= 1;
                this.c = v;
                return this;
            }
        }

        public static Parser PARSER;
        public final ByteString a;
        public int b;
        public int c;
        public List d;
        public byte e;
        public int f;
        public static final Annotation g;

        static {
            Annotation.PARSER = new a();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/AbstractParser;-><init>()V
            Annotation protoBuf$Annotation0 = new Annotation();
            Annotation.g = protoBuf$Annotation0;
            protoBuf$Annotation0.c = 0;
            protoBuf$Annotation0.d = Collections.emptyList();
        }

        public Annotation() {
            this.e = -1;
            this.f = -1;
            this.a = ByteString.EMPTY;
        }

        public Annotation(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder protoBuf$Annotation$Builder0) {
            super(protoBuf$Annotation$Builder0);
            this.e = -1;
            this.f = -1;
            this.a = protoBuf$Annotation$Builder0.getUnknownFields();
        }

        public Annotation(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) {
            this.e = -1;
            this.f = -1;
            this.c = 0;
            this.d = Collections.emptyList();
            Output byteString$Output0 = ByteString.newOutput();
            CodedOutputStream codedOutputStream0 = CodedOutputStream.newInstance(byteString$Output0, 1);
            int v = 0;
            boolean z = false;
            while(!z) {
                try {
                    try {
                        int v1 = codedInputStream0.readTag();
                        switch(v1) {
                            case 0: {
                                z = true;
                                continue;
                            }
                            case 8: {
                                this.b |= 1;
                                this.c = codedInputStream0.readInt32();
                                continue;
                            }
                            case 18: {
                                if((v & 2) != 2) {
                                    this.d = new ArrayList();
                                    v = 2;
                                }
                                break;
                            }
                            default: {
                                if(!this.parseUnknownField(codedInputStream0, codedOutputStream0, extensionRegistryLite0, v1)) {
                                    z = true;
                                    continue;
                                }
                                continue;
                            }
                        }
                        this.d.add(codedInputStream0.readMessage(Argument.PARSER, extensionRegistryLite0));
                        continue;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                    }
                    catch(IOException iOException0) {
                        throw new InvalidProtocolBufferException(iOException0.getMessage()).setUnfinishedMessage(this);
                    }
                    throw invalidProtocolBufferException0.setUnfinishedMessage(this);
                }
                catch(Throwable throwable0) {
                }
                if((v & 2) == 2) {
                    this.d = Collections.unmodifiableList(this.d);
                }
                try {
                    codedOutputStream0.flush();
                    goto label_37;
                }
                catch(IOException unused_ex) {
                    goto label_37;
                }
                catch(Throwable throwable1) {
                }
                this.a = byteString$Output0.toByteString();
                throw throwable1;
            label_37:
                this.a = byteString$Output0.toByteString();
                this.makeExtensionsImmutable();
                throw throwable0;
            }
            if((v & 2) == 2) {
                this.d = Collections.unmodifiableList(this.d);
            }
            try {
                codedOutputStream0.flush();
                goto label_47;
            }
            catch(IOException unused_ex) {
                goto label_47;
            }
            catch(Throwable throwable2) {
            }
            this.a = byteString$Output0.toByteString();
            throw throwable2;
        label_47:
            this.a = byteString$Output0.toByteString();
            this.makeExtensionsImmutable();
        }

        public Argument getArgument(int v) {
            return (Argument)this.d.get(v);
        }

        public int getArgumentCount() {
            return this.d.size();
        }

        public List getArgumentList() {
            return this.d;
        }

        public static Annotation getDefaultInstance() {
            return Annotation.g;
        }

        public Annotation getDefaultInstanceForType() {
            return Annotation.g;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public MessageLite getDefaultInstanceForType() {
            return this.getDefaultInstanceForType();
        }

        public int getId() {
            return this.c;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser getParserForType() {
            return Annotation.PARSER;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int v1 = this.f;
            if(v1 != -1) {
                return v1;
            }
            int v2 = (this.b & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.c) : 0;
            for(int v = 0; v < this.d.size(); ++v) {
                v2 += CodedOutputStream.computeMessageSize(2, ((MessageLite)this.d.get(v)));
            }
            int v3 = this.a.size() + v2;
            this.f = v3;
            return v3;
        }

        public boolean hasId() {
            return (this.b & 1) == 1;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            int v = this.e;
            if(v == 1) {
                return true;
            }
            if(v == 0) {
                return false;
            }
            if(!this.hasId()) {
                this.e = 0;
                return false;
            }
            for(int v1 = 0; v1 < this.getArgumentCount(); ++v1) {
                if(!this.getArgument(v1).isInitialized()) {
                    this.e = 0;
                    return false;
                }
            }
            this.e = 1;
            return true;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder newBuilder() {
            return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder newBuilder(Annotation protoBuf$Annotation0) {
            return Annotation.newBuilder().mergeFrom(protoBuf$Annotation0);
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder newBuilderForType() {
            return Annotation.newBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder newBuilderForType() {
            return this.newBuilderForType();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder toBuilder() {
            return Annotation.newBuilder(this);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder toBuilder() {
            return this.toBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream0) throws IOException {
            this.getSerializedSize();
            if((this.b & 1) == 1) {
                codedOutputStream0.writeInt32(1, this.c);
            }
            for(int v = 0; v < this.d.size(); ++v) {
                codedOutputStream0.writeMessage(2, ((MessageLite)this.d.get(v)));
            }
            codedOutputStream0.writeRawBytes(this.a);
        }
    }

    public static final class Class extends ExtendableMessage implements ProtoBuf.ClassOrBuilder {
        public static final class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder extends ExtendableBuilder implements ProtoBuf.ClassOrBuilder {
            public List A;
            public VersionRequirementTable B;
            public int d;
            public int e;
            public int f;
            public int g;
            public List h;
            public List i;
            public List j;
            public List k;
            public List l;
            public List m;
            public List n;
            public List o;
            public List p;
            public List q;
            public List r;
            public List s;
            public int t;
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type u;
            public int v;
            public List w;
            public List x;
            public List y;
            public TypeTable z;

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder() {
                this.e = 6;
                this.h = Collections.emptyList();
                this.i = Collections.emptyList();
                this.j = Collections.emptyList();
                this.k = Collections.emptyList();
                this.l = Collections.emptyList();
                this.m = Collections.emptyList();
                this.n = Collections.emptyList();
                this.o = Collections.emptyList();
                this.p = Collections.emptyList();
                this.q = Collections.emptyList();
                this.r = Collections.emptyList();
                this.s = Collections.emptyList();
                this.u = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
                this.w = Collections.emptyList();
                this.x = Collections.emptyList();
                this.y = Collections.emptyList();
                this.z = TypeTable.getDefaultInstance();
                this.A = Collections.emptyList();
                this.B = VersionRequirementTable.getDefaultInstance();
            }

            public Class build() {
                Class protoBuf$Class0 = this.buildPartial();
                if(!protoBuf$Class0.isInitialized()) {
                    throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(protoBuf$Class0);
                }
                return protoBuf$Class0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite$Builder
            public MessageLite build() {
                return this.build();
            }

            public Class buildPartial() {
                Class protoBuf$Class0 = new Class(this);
                int v = this.d;
                int v1 = (v & 1) == 1 ? 1 : 0;
                protoBuf$Class0.d = this.e;
                if((v & 2) == 2) {
                    v1 |= 2;
                }
                protoBuf$Class0.e = this.f;
                if((v & 4) == 4) {
                    v1 |= 4;
                }
                protoBuf$Class0.f = this.g;
                if((v & 8) == 8) {
                    this.h = Collections.unmodifiableList(this.h);
                    this.d &= -9;
                }
                protoBuf$Class0.g = this.h;
                if((this.d & 16) == 16) {
                    this.i = Collections.unmodifiableList(this.i);
                    this.d &= -17;
                }
                protoBuf$Class0.h = this.i;
                if((this.d & 0x20) == 0x20) {
                    this.j = Collections.unmodifiableList(this.j);
                    this.d &= -33;
                }
                protoBuf$Class0.i = this.j;
                if((this.d & 0x40) == 0x40) {
                    this.k = Collections.unmodifiableList(this.k);
                    this.d &= -65;
                }
                protoBuf$Class0.k = this.k;
                if((this.d & 0x80) == 0x80) {
                    this.l = Collections.unmodifiableList(this.l);
                    this.d &= 0xFFFFFF7F;
                }
                protoBuf$Class0.m = this.l;
                if((this.d & 0x100) == 0x100) {
                    this.m = Collections.unmodifiableList(this.m);
                    this.d &= 0xFFFFFEFF;
                }
                protoBuf$Class0.n = this.m;
                if((this.d & 0x200) == 0x200) {
                    this.n = Collections.unmodifiableList(this.n);
                    this.d &= 0xFFFFFDFF;
                }
                protoBuf$Class0.p = this.n;
                if((this.d & 0x400) == 0x400) {
                    this.o = Collections.unmodifiableList(this.o);
                    this.d &= 0xFFFFFBFF;
                }
                protoBuf$Class0.q = this.o;
                if((this.d & 0x800) == 0x800) {
                    this.p = Collections.unmodifiableList(this.p);
                    this.d &= 0xFFFFF7FF;
                }
                protoBuf$Class0.r = this.p;
                if((this.d & 0x1000) == 0x1000) {
                    this.q = Collections.unmodifiableList(this.q);
                    this.d &= 0xFFFFEFFF;
                }
                protoBuf$Class0.s = this.q;
                if((this.d & 0x2000) == 0x2000) {
                    this.r = Collections.unmodifiableList(this.r);
                    this.d &= 0xFFFFDFFF;
                }
                protoBuf$Class0.t = this.r;
                if((this.d & 0x4000) == 0x4000) {
                    this.s = Collections.unmodifiableList(this.s);
                    this.d &= 0xFFFFBFFF;
                }
                protoBuf$Class0.u = this.s;
                if((v & 0x8000) == 0x8000) {
                    v1 |= 8;
                }
                protoBuf$Class0.w = this.t;
                if((v & 0x10000) == 0x10000) {
                    v1 |= 16;
                }
                protoBuf$Class0.x = this.u;
                if((v & 0x20000) == 0x20000) {
                    v1 |= 0x20;
                }
                protoBuf$Class0.y = this.v;
                if((this.d & 0x40000) == 0x40000) {
                    this.w = Collections.unmodifiableList(this.w);
                    this.d &= 0xFFFBFFFF;
                }
                protoBuf$Class0.z = this.w;
                if((this.d & 0x80000) == 0x80000) {
                    this.x = Collections.unmodifiableList(this.x);
                    this.d &= 0xFFF7FFFF;
                }
                protoBuf$Class0.B = this.x;
                if((this.d & 0x100000) == 0x100000) {
                    this.y = Collections.unmodifiableList(this.y);
                    this.d &= 0xFFEFFFFF;
                }
                protoBuf$Class0.C = this.y;
                if((v & 0x200000) == 0x200000) {
                    v1 |= 0x40;
                }
                protoBuf$Class0.E = this.z;
                if((this.d & 0x400000) == 0x400000) {
                    this.A = Collections.unmodifiableList(this.A);
                    this.d &= 0xFFBFFFFF;
                }
                protoBuf$Class0.F = this.A;
                if((v & 0x800000) == 0x800000) {
                    v1 |= 0x80;
                }
                protoBuf$Class0.G = this.B;
                protoBuf$Class0.c = v1;
                return protoBuf$Class0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public Object clone() throws CloneNotSupportedException {
                return this.clone();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder().mergeFrom(this.buildPartial());
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public ExtendableBuilder clone() {
                return this.clone();
            }

            public Constructor getConstructor(int v) {
                return (Constructor)this.n.get(v);
            }

            public int getConstructorCount() {
                return this.n.size();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getContextReceiverType(int v) {
                return (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type)this.l.get(v);
            }

            public int getContextReceiverTypeCount() {
                return this.l.size();
            }

            public Class getDefaultInstanceForType() {
                return Class.getDefaultInstance();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public GeneratedMessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public MessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            public EnumEntry getEnumEntry(int v) {
                return (EnumEntry)this.r.get(v);
            }

            public int getEnumEntryCount() {
                return this.r.size();
            }

            public Function getFunction(int v) {
                return (Function)this.o.get(v);
            }

            public int getFunctionCount() {
                return this.o.size();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getInlineClassUnderlyingType() {
                return this.u;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getMultiFieldValueClassUnderlyingType(int v) {
                return (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type)this.x.get(v);
            }

            public int getMultiFieldValueClassUnderlyingTypeCount() {
                return this.x.size();
            }

            public Property getProperty(int v) {
                return (Property)this.p.get(v);
            }

            public int getPropertyCount() {
                return this.p.size();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getSupertype(int v) {
                return (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type)this.i.get(v);
            }

            public int getSupertypeCount() {
                return this.i.size();
            }

            public TypeAlias getTypeAlias(int v) {
                return (TypeAlias)this.q.get(v);
            }

            public int getTypeAliasCount() {
                return this.q.size();
            }

            public TypeParameter getTypeParameter(int v) {
                return (TypeParameter)this.h.get(v);
            }

            public int getTypeParameterCount() {
                return this.h.size();
            }

            public TypeTable getTypeTable() {
                return this.z;
            }

            public boolean hasFqName() {
                return (this.d & 2) == 2;
            }

            public boolean hasInlineClassUnderlyingType() {
                return (this.d & 0x10000) == 0x10000;
            }

            public boolean hasTypeTable() {
                return (this.d & 0x200000) == 0x200000;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if(!this.hasFqName()) {
                    return false;
                }
                for(int v = 0; v < this.getTypeParameterCount(); ++v) {
                    if(!this.getTypeParameter(v).isInitialized()) {
                        return false;
                    }
                }
                for(int v1 = 0; v1 < this.getSupertypeCount(); ++v1) {
                    if(!this.getSupertype(v1).isInitialized()) {
                        return false;
                    }
                }
                for(int v2 = 0; v2 < this.getContextReceiverTypeCount(); ++v2) {
                    if(!this.getContextReceiverType(v2).isInitialized()) {
                        return false;
                    }
                }
                for(int v3 = 0; v3 < this.getConstructorCount(); ++v3) {
                    if(!this.getConstructor(v3).isInitialized()) {
                        return false;
                    }
                }
                for(int v4 = 0; v4 < this.getFunctionCount(); ++v4) {
                    if(!this.getFunction(v4).isInitialized()) {
                        return false;
                    }
                }
                for(int v5 = 0; v5 < this.getPropertyCount(); ++v5) {
                    if(!this.getProperty(v5).isInitialized()) {
                        return false;
                    }
                }
                for(int v6 = 0; v6 < this.getTypeAliasCount(); ++v6) {
                    if(!this.getTypeAlias(v6).isInitialized()) {
                        return false;
                    }
                }
                for(int v7 = 0; v7 < this.getEnumEntryCount(); ++v7) {
                    if(!this.getEnumEntry(v7).isInitialized()) {
                        return false;
                    }
                }
                if(this.hasInlineClassUnderlyingType() && !this.getInlineClassUnderlyingType().isInitialized()) {
                    return false;
                }
                for(int v8 = 0; v8 < this.getMultiFieldValueClassUnderlyingTypeCount(); ++v8) {
                    if(!this.getMultiFieldValueClassUnderlyingType(v8).isInitialized()) {
                        return false;
                    }
                }
                return !this.hasTypeTable() || this.getTypeTable().isInitialized() ? this.extensionsAreInitialized() : false;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder mergeFrom(Class protoBuf$Class0) {
                if(protoBuf$Class0 == Class.getDefaultInstance()) {
                    return this;
                }
                if(protoBuf$Class0.hasFlags()) {
                    this.setFlags(protoBuf$Class0.getFlags());
                }
                if(protoBuf$Class0.hasFqName()) {
                    this.setFqName(protoBuf$Class0.getFqName());
                }
                if(protoBuf$Class0.hasCompanionObjectName()) {
                    this.setCompanionObjectName(protoBuf$Class0.getCompanionObjectName());
                }
                if(!protoBuf$Class0.g.isEmpty()) {
                    if(this.h.isEmpty()) {
                        this.h = protoBuf$Class0.g;
                        this.d &= -9;
                    }
                    else {
                        if((this.d & 8) != 8) {
                            this.h = new ArrayList(this.h);
                            this.d |= 8;
                        }
                        this.h.addAll(protoBuf$Class0.g);
                    }
                }
                if(!protoBuf$Class0.h.isEmpty()) {
                    if(this.i.isEmpty()) {
                        this.i = protoBuf$Class0.h;
                        this.d &= -17;
                    }
                    else {
                        if((this.d & 16) != 16) {
                            this.i = new ArrayList(this.i);
                            this.d |= 16;
                        }
                        this.i.addAll(protoBuf$Class0.h);
                    }
                }
                if(!protoBuf$Class0.i.isEmpty()) {
                    if(this.j.isEmpty()) {
                        this.j = protoBuf$Class0.i;
                        this.d &= -33;
                    }
                    else {
                        if((this.d & 0x20) != 0x20) {
                            this.j = new ArrayList(this.j);
                            this.d |= 0x20;
                        }
                        this.j.addAll(protoBuf$Class0.i);
                    }
                }
                if(!protoBuf$Class0.k.isEmpty()) {
                    if(this.k.isEmpty()) {
                        this.k = protoBuf$Class0.k;
                        this.d &= -65;
                    }
                    else {
                        if((this.d & 0x40) != 0x40) {
                            this.k = new ArrayList(this.k);
                            this.d |= 0x40;
                        }
                        this.k.addAll(protoBuf$Class0.k);
                    }
                }
                if(!protoBuf$Class0.m.isEmpty()) {
                    if(this.l.isEmpty()) {
                        this.l = protoBuf$Class0.m;
                        this.d &= 0xFFFFFF7F;
                    }
                    else {
                        if((this.d & 0x80) != 0x80) {
                            this.l = new ArrayList(this.l);
                            this.d |= 0x80;
                        }
                        this.l.addAll(protoBuf$Class0.m);
                    }
                }
                if(!protoBuf$Class0.n.isEmpty()) {
                    if(this.m.isEmpty()) {
                        this.m = protoBuf$Class0.n;
                        this.d &= 0xFFFFFEFF;
                    }
                    else {
                        if((this.d & 0x100) != 0x100) {
                            this.m = new ArrayList(this.m);
                            this.d |= 0x100;
                        }
                        this.m.addAll(protoBuf$Class0.n);
                    }
                }
                if(!protoBuf$Class0.p.isEmpty()) {
                    if(this.n.isEmpty()) {
                        this.n = protoBuf$Class0.p;
                        this.d &= 0xFFFFFDFF;
                    }
                    else {
                        if((this.d & 0x200) != 0x200) {
                            this.n = new ArrayList(this.n);
                            this.d |= 0x200;
                        }
                        this.n.addAll(protoBuf$Class0.p);
                    }
                }
                if(!protoBuf$Class0.q.isEmpty()) {
                    if(this.o.isEmpty()) {
                        this.o = protoBuf$Class0.q;
                        this.d &= 0xFFFFFBFF;
                    }
                    else {
                        if((this.d & 0x400) != 0x400) {
                            this.o = new ArrayList(this.o);
                            this.d |= 0x400;
                        }
                        this.o.addAll(protoBuf$Class0.q);
                    }
                }
                if(!protoBuf$Class0.r.isEmpty()) {
                    if(this.p.isEmpty()) {
                        this.p = protoBuf$Class0.r;
                        this.d &= 0xFFFFF7FF;
                    }
                    else {
                        if((this.d & 0x800) != 0x800) {
                            this.p = new ArrayList(this.p);
                            this.d |= 0x800;
                        }
                        this.p.addAll(protoBuf$Class0.r);
                    }
                }
                if(!protoBuf$Class0.s.isEmpty()) {
                    if(this.q.isEmpty()) {
                        this.q = protoBuf$Class0.s;
                        this.d &= 0xFFFFEFFF;
                    }
                    else {
                        if((this.d & 0x1000) != 0x1000) {
                            this.q = new ArrayList(this.q);
                            this.d |= 0x1000;
                        }
                        this.q.addAll(protoBuf$Class0.s);
                    }
                }
                if(!protoBuf$Class0.t.isEmpty()) {
                    if(this.r.isEmpty()) {
                        this.r = protoBuf$Class0.t;
                        this.d &= 0xFFFFDFFF;
                    }
                    else {
                        if((this.d & 0x2000) != 0x2000) {
                            this.r = new ArrayList(this.r);
                            this.d |= 0x2000;
                        }
                        this.r.addAll(protoBuf$Class0.t);
                    }
                }
                if(!protoBuf$Class0.u.isEmpty()) {
                    if(this.s.isEmpty()) {
                        this.s = protoBuf$Class0.u;
                        this.d &= 0xFFFFBFFF;
                    }
                    else {
                        if((this.d & 0x4000) != 0x4000) {
                            this.s = new ArrayList(this.s);
                            this.d |= 0x4000;
                        }
                        this.s.addAll(protoBuf$Class0.u);
                    }
                }
                if(protoBuf$Class0.hasInlineClassUnderlyingPropertyName()) {
                    this.setInlineClassUnderlyingPropertyName(protoBuf$Class0.getInlineClassUnderlyingPropertyName());
                }
                if(protoBuf$Class0.hasInlineClassUnderlyingType()) {
                    this.mergeInlineClassUnderlyingType(protoBuf$Class0.getInlineClassUnderlyingType());
                }
                if(protoBuf$Class0.hasInlineClassUnderlyingTypeId()) {
                    this.setInlineClassUnderlyingTypeId(protoBuf$Class0.getInlineClassUnderlyingTypeId());
                }
                if(!protoBuf$Class0.z.isEmpty()) {
                    if(this.w.isEmpty()) {
                        this.w = protoBuf$Class0.z;
                        this.d &= 0xFFFBFFFF;
                    }
                    else {
                        if((this.d & 0x40000) != 0x40000) {
                            this.w = new ArrayList(this.w);
                            this.d |= 0x40000;
                        }
                        this.w.addAll(protoBuf$Class0.z);
                    }
                }
                if(!protoBuf$Class0.B.isEmpty()) {
                    if(this.x.isEmpty()) {
                        this.x = protoBuf$Class0.B;
                        this.d &= 0xFFF7FFFF;
                    }
                    else {
                        if((this.d & 0x80000) != 0x80000) {
                            this.x = new ArrayList(this.x);
                            this.d |= 0x80000;
                        }
                        this.x.addAll(protoBuf$Class0.B);
                    }
                }
                if(!protoBuf$Class0.C.isEmpty()) {
                    if(this.y.isEmpty()) {
                        this.y = protoBuf$Class0.C;
                        this.d &= 0xFFEFFFFF;
                    }
                    else {
                        if((this.d & 0x100000) != 0x100000) {
                            this.y = new ArrayList(this.y);
                            this.d |= 0x100000;
                        }
                        this.y.addAll(protoBuf$Class0.C);
                    }
                }
                if(protoBuf$Class0.hasTypeTable()) {
                    this.mergeTypeTable(protoBuf$Class0.getTypeTable());
                }
                if(!protoBuf$Class0.F.isEmpty()) {
                    if(this.A.isEmpty()) {
                        this.A = protoBuf$Class0.F;
                        this.d &= 0xFFBFFFFF;
                    }
                    else {
                        if((this.d & 0x400000) != 0x400000) {
                            this.A = new ArrayList(this.A);
                            this.d |= 0x400000;
                        }
                        this.A.addAll(protoBuf$Class0.F);
                    }
                }
                if(protoBuf$Class0.hasVersionRequirementTable()) {
                    this.mergeVersionRequirementTable(protoBuf$Class0.getVersionRequirementTable());
                }
                this.mergeExtensionFields(protoBuf$Class0);
                this.setUnknownFields(this.getUnknownFields().concat(protoBuf$Class0.b));
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                Class protoBuf$Class1;
                Class protoBuf$Class0;
                try {
                    try {
                        protoBuf$Class0 = null;
                        protoBuf$Class1 = (Class)Class.PARSER.parsePartialFrom(codedInputStream0, extensionRegistryLite0);
                        goto label_13;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                        Class protoBuf$Class2 = (Class)invalidProtocolBufferException0.getUnfinishedMessage();
                        try {
                            throw invalidProtocolBufferException0;
                        }
                        catch(Throwable throwable0) {
                            protoBuf$Class0 = protoBuf$Class2;
                        }
                    }
                }
                catch(Throwable throwable0) {
                }
                if(protoBuf$Class0 != null) {
                    this.mergeFrom(protoBuf$Class0);
                }
                throw throwable0;
            label_13:
                if(protoBuf$Class1 != null) {
                    this.mergeFrom(protoBuf$Class1);
                }
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedMessageLite0) {
                return this.mergeFrom(((Class)generatedMessageLite0));
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder mergeInlineClassUnderlyingType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type0) {
                this.u = (this.d & 0x10000) != 0x10000 || this.u == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance() ? protoBuf$Type0 : kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.u).mergeFrom(protoBuf$Type0).buildPartial();
                this.d |= 0x10000;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder mergeTypeTable(TypeTable protoBuf$TypeTable0) {
                this.z = (this.d & 0x200000) != 0x200000 || this.z == TypeTable.getDefaultInstance() ? protoBuf$TypeTable0 : TypeTable.newBuilder(this.z).mergeFrom(protoBuf$TypeTable0).buildPartial();
                this.d |= 0x200000;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder mergeVersionRequirementTable(VersionRequirementTable protoBuf$VersionRequirementTable0) {
                this.B = (this.d & 0x800000) != 0x800000 || this.B == VersionRequirementTable.getDefaultInstance() ? protoBuf$VersionRequirementTable0 : VersionRequirementTable.newBuilder(this.B).mergeFrom(protoBuf$VersionRequirementTable0).buildPartial();
                this.d |= 0x800000;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder setCompanionObjectName(int v) {
                this.d |= 4;
                this.g = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder setFlags(int v) {
                this.d |= 1;
                this.e = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder setFqName(int v) {
                this.d |= 2;
                this.f = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder setInlineClassUnderlyingPropertyName(int v) {
                this.d |= 0x8000;
                this.t = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder setInlineClassUnderlyingTypeId(int v) {
                this.d |= 0x20000;
                this.v = v;
                return this;
            }
        }

        public static enum Kind implements EnumLite {
            CLASS(0),
            INTERFACE(1),
            ENUM_CLASS(2),
            ENUM_ENTRY(3),
            ANNOTATION_CLASS(4),
            OBJECT(5),
            COMPANION_OBJECT(6);

            public final int a;

            public Kind(int v1) {
                this.a = v1;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.Internal$EnumLite
            public final int getNumber() {
                return this.a;
            }

            public static Kind valueOf(int v) {
                switch(v) {
                    case 0: {
                        return Kind.CLASS;
                    }
                    case 1: {
                        return Kind.INTERFACE;
                    }
                    case 2: {
                        return Kind.ENUM_CLASS;
                    }
                    case 3: {
                        return Kind.ENUM_ENTRY;
                    }
                    case 4: {
                        return Kind.ANNOTATION_CLASS;
                    }
                    case 5: {
                        return Kind.OBJECT;
                    }
                    case 6: {
                        return Kind.COMPANION_OBJECT;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }

        public int A;
        public List B;
        public List C;
        public int D;
        public TypeTable E;
        public List F;
        public VersionRequirementTable G;
        public byte H;
        public int I;
        public static final Class J;
        public static Parser PARSER;
        public final ByteString b;
        public int c;
        public int d;
        public int e;
        public int f;
        public List g;
        public List h;
        public List i;
        public int j;
        public List k;
        public int l;
        public List m;
        public List n;
        public int o;
        public List p;
        public List q;
        public List r;
        public List s;
        public List t;
        public List u;
        public int v;
        public int w;
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type x;
        public int y;
        public List z;

        static {
            Class.PARSER = new d();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/AbstractParser;-><init>()V
            Class protoBuf$Class0 = new Class();
            Class.J = protoBuf$Class0;
            protoBuf$Class0.b();
        }

        public Class() {
            this.j = -1;
            this.l = -1;
            this.o = -1;
            this.v = -1;
            this.A = -1;
            this.D = -1;
            this.H = -1;
            this.I = -1;
            this.b = ByteString.EMPTY;
        }

        public Class(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder protoBuf$Class$Builder0) {
            super(protoBuf$Class$Builder0);
            this.j = -1;
            this.l = -1;
            this.o = -1;
            this.v = -1;
            this.A = -1;
            this.D = -1;
            this.H = -1;
            this.I = -1;
            this.b = protoBuf$Class$Builder0.getUnknownFields();
        }

        public Class(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) {
            InvalidProtocolBufferException invalidProtocolBufferException1;
            Throwable throwable1;
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder protoBuf$Type$Builder0;
            this.j = -1;
            this.l = -1;
            this.o = -1;
            this.v = -1;
            this.A = -1;
            this.D = -1;
            this.H = -1;
            this.I = -1;
            this.b();
            Output byteString$Output0 = ByteString.newOutput();
            CodedOutputStream codedOutputStream0 = CodedOutputStream.newInstance(byteString$Output0, 1);
            int v = 0;
            boolean z = false;
            while(!z) {
                try {
                    int v1 = codedInputStream0.readTag();
                    protoBuf$Type$Builder0 = null;
                    switch(v1) {
                        case 0: {
                            break;
                        }
                        case 8: {
                            this.c |= 1;
                            this.d = codedInputStream0.readInt32();
                            continue;
                        }
                        case 16: {
                            goto label_26;
                        }
                        case 18: {
                            goto label_31;
                        }
                        case 24: {
                            this.c |= 2;
                            this.e = codedInputStream0.readInt32();
                            continue;
                        }
                        case 0x20: {
                            this.c |= 4;
                            this.f = codedInputStream0.readInt32();
                            continue;
                        }
                        case 42: {
                            goto label_46;
                        }
                        case 50: {
                            goto label_51;
                        }
                        case 56: {
                            goto label_56;
                        }
                        case 58: {
                            goto label_61;
                        }
                        case 66: {
                            goto label_70;
                        }
                        case 74: {
                            goto label_75;
                        }
                        case 82: {
                            goto label_80;
                        }
                        case 90: {
                            goto label_85;
                        }
                        case 106: {
                            goto label_90;
                        }
                        case 0x80: {
                            goto label_95;
                        }
                        case 130: {
                            goto label_100;
                        }
                        case 0x88: {
                            this.c |= 8;
                            this.w = codedInputStream0.readInt32();
                            continue;
                        }
                        case 0x92: {
                            goto label_112;
                        }
                        case 0x98: {
                            this.c |= 0x20;
                            this.y = codedInputStream0.readInt32();
                            continue;
                        }
                        case 0xA2: {
                            goto label_124;
                        }
                        case 0xA8: {
                            goto label_129;
                        }
                        case 170: {
                            goto label_134;
                        }
                        case 0xB0: {
                            goto label_143;
                        }
                        case 0xB2: {
                            goto label_148;
                        }
                        case 0xBA: {
                            goto label_157;
                        }
                        case 0xC0: {
                            goto label_162;
                        }
                        case 0xC2: {
                            goto label_167;
                        }
                        case 0xF2: {
                            goto label_176;
                        }
                        case 0xF8: {
                            goto label_185;
                        }
                        case 0xFA: {
                            goto label_190;
                        }
                        case 0x102: {
                            goto label_199;
                        }
                        default: {
                            if(this.parseUnknownField(codedInputStream0, codedOutputStream0, extensionRegistryLite0, v1)) {
                                continue;
                            }
                            z = true;
                            continue;
                        }
                    }
                }
                catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                    invalidProtocolBufferException1 = invalidProtocolBufferException0;
                    throw invalidProtocolBufferException1.setUnfinishedMessage(this);
                }
                catch(IOException iOException0) {
                    goto label_212;
                }
                catch(Throwable throwable0) {
                    throwable1 = throwable0;
                    goto label_218;
                }
                z = true;
                continue;
                try {
                    try {
                        this.c |= 1;
                        this.d = codedInputStream0.readInt32();
                        continue;
                    label_26:
                        if((v & 0x20) != 0x20) {
                            this.i = new ArrayList();
                            v |= 0x20;
                        }
                        this.i.add(codedInputStream0.readInt32());
                        continue;
                    label_31:
                        int v2 = codedInputStream0.pushLimit(codedInputStream0.readRawVarint32());
                        if((v & 0x20) != 0x20 && codedInputStream0.getBytesUntilLimit() > 0) {
                            this.i = new ArrayList();
                            v |= 0x20;
                        }
                        while(codedInputStream0.getBytesUntilLimit() > 0) {
                            this.i.add(codedInputStream0.readInt32());
                        }
                        codedInputStream0.popLimit(v2);
                        continue;
                    label_46:
                        if((v & 8) != 8) {
                            this.g = new ArrayList();
                            v |= 8;
                        }
                        this.g.add(codedInputStream0.readMessage(TypeParameter.PARSER, extensionRegistryLite0));
                        continue;
                    label_51:
                        if((v & 16) != 16) {
                            this.h = new ArrayList();
                            v |= 16;
                        }
                        this.h.add(codedInputStream0.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite0));
                        continue;
                    label_56:
                        if((v & 0x40) != 0x40) {
                            this.k = new ArrayList();
                            v |= 0x40;
                        }
                        this.k.add(codedInputStream0.readInt32());
                        continue;
                    label_61:
                        int v3 = codedInputStream0.pushLimit(codedInputStream0.readRawVarint32());
                        if((v & 0x40) != 0x40 && codedInputStream0.getBytesUntilLimit() > 0) {
                            this.k = new ArrayList();
                            v |= 0x40;
                        }
                        while(codedInputStream0.getBytesUntilLimit() > 0) {
                            this.k.add(codedInputStream0.readInt32());
                        }
                        codedInputStream0.popLimit(v3);
                        continue;
                    label_70:
                        if((v & 0x200) != 0x200) {
                            this.p = new ArrayList();
                            v |= 0x200;
                        }
                        this.p.add(codedInputStream0.readMessage(Constructor.PARSER, extensionRegistryLite0));
                        continue;
                    label_75:
                        if((v & 0x400) != 0x400) {
                            this.q = new ArrayList();
                            v |= 0x400;
                        }
                        this.q.add(codedInputStream0.readMessage(Function.PARSER, extensionRegistryLite0));
                        continue;
                    label_80:
                        if((v & 0x800) != 0x800) {
                            this.r = new ArrayList();
                            v |= 0x800;
                        }
                        this.r.add(codedInputStream0.readMessage(Property.PARSER, extensionRegistryLite0));
                        continue;
                    label_85:
                        if((v & 0x1000) != 0x1000) {
                            this.s = new ArrayList();
                            v |= 0x1000;
                        }
                        this.s.add(codedInputStream0.readMessage(TypeAlias.PARSER, extensionRegistryLite0));
                        continue;
                    label_90:
                        if((v & 0x2000) != 0x2000) {
                            this.t = new ArrayList();
                            v |= 0x2000;
                        }
                        this.t.add(codedInputStream0.readMessage(EnumEntry.PARSER, extensionRegistryLite0));
                        continue;
                    label_95:
                        if((v & 0x4000) != 0x4000) {
                            this.u = new ArrayList();
                            v |= 0x4000;
                        }
                        this.u.add(codedInputStream0.readInt32());
                        continue;
                    label_100:
                        int v4 = codedInputStream0.pushLimit(codedInputStream0.readRawVarint32());
                        if((v & 0x4000) != 0x4000 && codedInputStream0.getBytesUntilLimit() > 0) {
                            this.u = new ArrayList();
                            v |= 0x4000;
                        }
                        while(codedInputStream0.getBytesUntilLimit() > 0) {
                            this.u.add(codedInputStream0.readInt32());
                        }
                        codedInputStream0.popLimit(v4);
                        continue;
                    label_112:
                        if((this.c & 16) == 16) {
                            protoBuf$Type$Builder0 = this.x.toBuilder();
                        }
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type)codedInputStream0.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite0);
                        this.x = protoBuf$Type0;
                        if(protoBuf$Type$Builder0 != null) {
                            protoBuf$Type$Builder0.mergeFrom(protoBuf$Type0);
                            this.x = protoBuf$Type$Builder0.buildPartial();
                        }
                        this.c |= 16;
                        continue;
                    label_124:
                        if((v & 0x80) != 0x80) {
                            this.m = new ArrayList();
                            v |= 0x80;
                        }
                        this.m.add(codedInputStream0.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite0));
                        continue;
                    label_129:
                        if((v & 0x100) != 0x100) {
                            this.n = new ArrayList();
                            v |= 0x100;
                        }
                        this.n.add(codedInputStream0.readInt32());
                        continue;
                    label_134:
                        int v5 = codedInputStream0.pushLimit(codedInputStream0.readRawVarint32());
                        if((v & 0x100) != 0x100 && codedInputStream0.getBytesUntilLimit() > 0) {
                            this.n = new ArrayList();
                            v |= 0x100;
                        }
                        while(codedInputStream0.getBytesUntilLimit() > 0) {
                            this.n.add(codedInputStream0.readInt32());
                        }
                        codedInputStream0.popLimit(v5);
                        continue;
                    label_143:
                        if((v & 0x40000) != 0x40000) {
                            this.z = new ArrayList();
                            v |= 0x40000;
                        }
                        this.z.add(codedInputStream0.readInt32());
                        continue;
                    label_148:
                        int v6 = codedInputStream0.pushLimit(codedInputStream0.readRawVarint32());
                        if((v & 0x40000) != 0x40000 && codedInputStream0.getBytesUntilLimit() > 0) {
                            this.z = new ArrayList();
                            v |= 0x40000;
                        }
                        while(codedInputStream0.getBytesUntilLimit() > 0) {
                            this.z.add(codedInputStream0.readInt32());
                        }
                        codedInputStream0.popLimit(v6);
                        continue;
                    label_157:
                        if((v & 0x80000) != 0x80000) {
                            this.B = new ArrayList();
                            v |= 0x80000;
                        }
                        this.B.add(codedInputStream0.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite0));
                        continue;
                    label_162:
                        if((v & 0x100000) != 0x100000) {
                            this.C = new ArrayList();
                            v |= 0x100000;
                        }
                        this.C.add(codedInputStream0.readInt32());
                        continue;
                    label_167:
                        int v7 = codedInputStream0.pushLimit(codedInputStream0.readRawVarint32());
                        if((v & 0x100000) != 0x100000 && codedInputStream0.getBytesUntilLimit() > 0) {
                            this.C = new ArrayList();
                            v |= 0x100000;
                        }
                        while(codedInputStream0.getBytesUntilLimit() > 0) {
                            this.C.add(codedInputStream0.readInt32());
                        }
                        codedInputStream0.popLimit(v7);
                        continue;
                    label_176:
                        if((this.c & 0x40) == 0x40) {
                            protoBuf$Type$Builder0 = this.E.toBuilder();
                        }
                        TypeTable protoBuf$TypeTable0 = (TypeTable)codedInputStream0.readMessage(TypeTable.PARSER, extensionRegistryLite0);
                        this.E = protoBuf$TypeTable0;
                        if(protoBuf$Type$Builder0 != null) {
                            ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder)protoBuf$Type$Builder0).mergeFrom(protoBuf$TypeTable0);
                            this.E = ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder)protoBuf$Type$Builder0).buildPartial();
                        }
                        this.c |= 0x40;
                        continue;
                    label_185:
                        if((v & 0x400000) != 0x400000) {
                            this.F = new ArrayList();
                            v |= 0x400000;
                        }
                        this.F.add(codedInputStream0.readInt32());
                        continue;
                    label_190:
                        int v8 = codedInputStream0.pushLimit(codedInputStream0.readRawVarint32());
                        if((v & 0x400000) != 0x400000 && codedInputStream0.getBytesUntilLimit() > 0) {
                            this.F = new ArrayList();
                            v |= 0x400000;
                        }
                        while(codedInputStream0.getBytesUntilLimit() > 0) {
                            this.F.add(codedInputStream0.readInt32());
                        }
                        codedInputStream0.popLimit(v8);
                        continue;
                    label_199:
                        if((this.c & 0x80) == 0x80) {
                            protoBuf$Type$Builder0 = this.G.toBuilder();
                        }
                        VersionRequirementTable protoBuf$VersionRequirementTable0 = (VersionRequirementTable)codedInputStream0.readMessage(VersionRequirementTable.PARSER, extensionRegistryLite0);
                        this.G = protoBuf$VersionRequirementTable0;
                        if(protoBuf$Type$Builder0 != null) {
                            ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder)protoBuf$Type$Builder0).mergeFrom(protoBuf$VersionRequirementTable0);
                            this.G = ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder)protoBuf$Type$Builder0).buildPartial();
                        }
                        this.c |= 0x80;
                        continue;
                    label_212:
                        IOException iOException1 = iOException0;
                        throw new InvalidProtocolBufferException(iOException1.getMessage()).setUnfinishedMessage(this);
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                        invalidProtocolBufferException1 = invalidProtocolBufferException0;
                        throw invalidProtocolBufferException1.setUnfinishedMessage(this);
                    }
                    catch(IOException iOException0) {
                        goto label_212;
                    }
                    throw invalidProtocolBufferException1.setUnfinishedMessage(this);
                }
                catch(Throwable throwable0) {
                    throwable1 = throwable0;
                }
            label_218:
                if((v & 0x20) == 0x20) {
                    this.i = Collections.unmodifiableList(this.i);
                }
                if((v & 8) == 8) {
                    this.g = Collections.unmodifiableList(this.g);
                }
                if((v & 16) == 16) {
                    this.h = Collections.unmodifiableList(this.h);
                }
                if((v & 0x40) == 0x40) {
                    this.k = Collections.unmodifiableList(this.k);
                }
                if((v & 0x200) == 0x200) {
                    this.p = Collections.unmodifiableList(this.p);
                }
                if((v & 0x400) == 0x400) {
                    this.q = Collections.unmodifiableList(this.q);
                }
                if((v & 0x800) == 0x800) {
                    this.r = Collections.unmodifiableList(this.r);
                }
                if((v & 0x1000) == 0x1000) {
                    this.s = Collections.unmodifiableList(this.s);
                }
                if((v & 0x2000) == 0x2000) {
                    this.t = Collections.unmodifiableList(this.t);
                }
                if((v & 0x4000) == 0x4000) {
                    this.u = Collections.unmodifiableList(this.u);
                }
                if((v & 0x80) == 0x80) {
                    this.m = Collections.unmodifiableList(this.m);
                }
                if((v & 0x100) == 0x100) {
                    this.n = Collections.unmodifiableList(this.n);
                }
                if((v & 0x40000) == 0x40000) {
                    this.z = Collections.unmodifiableList(this.z);
                }
                if((v & 0x80000) == 0x80000) {
                    this.B = Collections.unmodifiableList(this.B);
                }
                if((v & 0x100000) == 0x100000) {
                    this.C = Collections.unmodifiableList(this.C);
                }
                if((v & 0x400000) == 0x400000) {
                    this.F = Collections.unmodifiableList(this.F);
                }
                try {
                    codedOutputStream0.flush();
                    goto label_255;
                }
                catch(IOException unused_ex) {
                    goto label_255;
                }
                catch(Throwable throwable2) {
                }
                this.b = byteString$Output0.toByteString();
                throw throwable2;
            label_255:
                this.b = byteString$Output0.toByteString();
                this.makeExtensionsImmutable();
                throw throwable1;
            }
            if((v & 0x20) == 0x20) {
                this.i = Collections.unmodifiableList(this.i);
            }
            if((v & 8) == 8) {
                this.g = Collections.unmodifiableList(this.g);
            }
            if((v & 16) == 16) {
                this.h = Collections.unmodifiableList(this.h);
            }
            if((v & 0x40) == 0x40) {
                this.k = Collections.unmodifiableList(this.k);
            }
            if((v & 0x200) == 0x200) {
                this.p = Collections.unmodifiableList(this.p);
            }
            if((v & 0x400) == 0x400) {
                this.q = Collections.unmodifiableList(this.q);
            }
            if((v & 0x800) == 0x800) {
                this.r = Collections.unmodifiableList(this.r);
            }
            if((v & 0x1000) == 0x1000) {
                this.s = Collections.unmodifiableList(this.s);
            }
            if((v & 0x2000) == 0x2000) {
                this.t = Collections.unmodifiableList(this.t);
            }
            if((v & 0x4000) == 0x4000) {
                this.u = Collections.unmodifiableList(this.u);
            }
            if((v & 0x80) == 0x80) {
                this.m = Collections.unmodifiableList(this.m);
            }
            if((v & 0x100) == 0x100) {
                this.n = Collections.unmodifiableList(this.n);
            }
            if((v & 0x40000) == 0x40000) {
                this.z = Collections.unmodifiableList(this.z);
            }
            if((v & 0x80000) == 0x80000) {
                this.B = Collections.unmodifiableList(this.B);
            }
            if((v & 0x100000) == 0x100000) {
                this.C = Collections.unmodifiableList(this.C);
            }
            if((v & 0x400000) == 0x400000) {
                this.F = Collections.unmodifiableList(this.F);
            }
            try {
                codedOutputStream0.flush();
                goto label_295;
            }
            catch(IOException unused_ex) {
                goto label_295;
            }
            catch(Throwable throwable3) {
            }
            this.b = byteString$Output0.toByteString();
            throw throwable3;
        label_295:
            this.b = byteString$Output0.toByteString();
            this.makeExtensionsImmutable();
        }

        public final void b() {
            this.d = 6;
            this.e = 0;
            this.f = 0;
            this.g = Collections.emptyList();
            this.h = Collections.emptyList();
            this.i = Collections.emptyList();
            this.k = Collections.emptyList();
            this.m = Collections.emptyList();
            this.n = Collections.emptyList();
            this.p = Collections.emptyList();
            this.q = Collections.emptyList();
            this.r = Collections.emptyList();
            this.s = Collections.emptyList();
            this.t = Collections.emptyList();
            this.u = Collections.emptyList();
            this.w = 0;
            this.x = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            this.y = 0;
            this.z = Collections.emptyList();
            this.B = Collections.emptyList();
            this.C = Collections.emptyList();
            this.E = TypeTable.getDefaultInstance();
            this.F = Collections.emptyList();
            this.G = VersionRequirementTable.getDefaultInstance();
        }

        public int getCompanionObjectName() {
            return this.f;
        }

        public Constructor getConstructor(int v) {
            return (Constructor)this.p.get(v);
        }

        public int getConstructorCount() {
            return this.p.size();
        }

        public List getConstructorList() {
            return this.p;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getContextReceiverType(int v) {
            return (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type)this.m.get(v);
        }

        public int getContextReceiverTypeCount() {
            return this.m.size();
        }

        public List getContextReceiverTypeIdList() {
            return this.n;
        }

        public List getContextReceiverTypeList() {
            return this.m;
        }

        public static Class getDefaultInstance() {
            return Class.J;
        }

        public Class getDefaultInstanceForType() {
            return Class.J;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public MessageLite getDefaultInstanceForType() {
            return this.getDefaultInstanceForType();
        }

        public EnumEntry getEnumEntry(int v) {
            return (EnumEntry)this.t.get(v);
        }

        public int getEnumEntryCount() {
            return this.t.size();
        }

        public List getEnumEntryList() {
            return this.t;
        }

        public int getFlags() {
            return this.d;
        }

        public int getFqName() {
            return this.e;
        }

        public Function getFunction(int v) {
            return (Function)this.q.get(v);
        }

        public int getFunctionCount() {
            return this.q.size();
        }

        public List getFunctionList() {
            return this.q;
        }

        public int getInlineClassUnderlyingPropertyName() {
            return this.w;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getInlineClassUnderlyingType() {
            return this.x;
        }

        public int getInlineClassUnderlyingTypeId() {
            return this.y;
        }

        public int getMultiFieldValueClassUnderlyingNameCount() {
            return this.z.size();
        }

        public List getMultiFieldValueClassUnderlyingNameList() {
            return this.z;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getMultiFieldValueClassUnderlyingType(int v) {
            return (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type)this.B.get(v);
        }

        public int getMultiFieldValueClassUnderlyingTypeCount() {
            return this.B.size();
        }

        public int getMultiFieldValueClassUnderlyingTypeIdCount() {
            return this.C.size();
        }

        public List getMultiFieldValueClassUnderlyingTypeIdList() {
            return this.C;
        }

        public List getMultiFieldValueClassUnderlyingTypeList() {
            return this.B;
        }

        public List getNestedClassNameList() {
            return this.k;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser getParserForType() {
            return Class.PARSER;
        }

        public Property getProperty(int v) {
            return (Property)this.r.get(v);
        }

        public int getPropertyCount() {
            return this.r.size();
        }

        public List getPropertyList() {
            return this.r;
        }

        public List getSealedSubclassFqNameList() {
            return this.u;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int v1 = this.I;
            if(v1 != -1) {
                return v1;
            }
            int v2 = (this.c & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.d) : 0;
            int v4 = 0;
            for(int v3 = 0; v3 < this.i.size(); ++v3) {
                v4 += CodedOutputStream.computeInt32SizeNoTag(((int)(((Integer)this.i.get(v3)))));
            }
            int v5 = this.getSupertypeIdList().isEmpty() ? v2 + v4 : v2 + v4 + 1 + CodedOutputStream.computeInt32SizeNoTag(v4);
            this.j = v4;
            if((this.c & 2) == 2) {
                v5 += CodedOutputStream.computeInt32Size(3, this.e);
            }
            if((this.c & 4) == 4) {
                v5 += CodedOutputStream.computeInt32Size(4, this.f);
            }
            for(int v6 = 0; v6 < this.g.size(); ++v6) {
                v5 += CodedOutputStream.computeMessageSize(5, ((MessageLite)this.g.get(v6)));
            }
            for(int v7 = 0; v7 < this.h.size(); ++v7) {
                v5 += CodedOutputStream.computeMessageSize(6, ((MessageLite)this.h.get(v7)));
            }
            int v9 = 0;
            for(int v8 = 0; v8 < this.k.size(); ++v8) {
                v9 += CodedOutputStream.computeInt32SizeNoTag(((int)(((Integer)this.k.get(v8)))));
            }
            int v10 = this.getNestedClassNameList().isEmpty() ? v5 + v9 : v5 + v9 + 1 + CodedOutputStream.computeInt32SizeNoTag(v9);
            this.l = v9;
            for(int v11 = 0; v11 < this.p.size(); ++v11) {
                v10 += CodedOutputStream.computeMessageSize(8, ((MessageLite)this.p.get(v11)));
            }
            for(int v12 = 0; v12 < this.q.size(); ++v12) {
                v10 += CodedOutputStream.computeMessageSize(9, ((MessageLite)this.q.get(v12)));
            }
            for(int v13 = 0; v13 < this.r.size(); ++v13) {
                v10 += CodedOutputStream.computeMessageSize(10, ((MessageLite)this.r.get(v13)));
            }
            for(int v14 = 0; v14 < this.s.size(); ++v14) {
                v10 += CodedOutputStream.computeMessageSize(11, ((MessageLite)this.s.get(v14)));
            }
            for(int v15 = 0; v15 < this.t.size(); ++v15) {
                v10 += CodedOutputStream.computeMessageSize(13, ((MessageLite)this.t.get(v15)));
            }
            int v17 = 0;
            for(int v16 = 0; v16 < this.u.size(); ++v16) {
                v17 += CodedOutputStream.computeInt32SizeNoTag(((int)(((Integer)this.u.get(v16)))));
            }
            int v18 = this.getSealedSubclassFqNameList().isEmpty() ? v10 + v17 : v10 + v17 + 2 + CodedOutputStream.computeInt32SizeNoTag(v17);
            this.v = v17;
            if((this.c & 8) == 8) {
                v18 += CodedOutputStream.computeInt32Size(17, this.w);
            }
            if((this.c & 16) == 16) {
                v18 += CodedOutputStream.computeMessageSize(18, this.x);
            }
            if((this.c & 0x20) == 0x20) {
                v18 += CodedOutputStream.computeInt32Size(19, this.y);
            }
            for(int v19 = 0; v19 < this.m.size(); ++v19) {
                v18 += CodedOutputStream.computeMessageSize(20, ((MessageLite)this.m.get(v19)));
            }
            int v21 = 0;
            for(int v20 = 0; v20 < this.n.size(); ++v20) {
                v21 += CodedOutputStream.computeInt32SizeNoTag(((int)(((Integer)this.n.get(v20)))));
            }
            int v22 = this.getContextReceiverTypeIdList().isEmpty() ? v18 + v21 : v18 + v21 + 2 + CodedOutputStream.computeInt32SizeNoTag(v21);
            this.o = v21;
            int v24 = 0;
            for(int v23 = 0; v23 < this.z.size(); ++v23) {
                v24 += CodedOutputStream.computeInt32SizeNoTag(((int)(((Integer)this.z.get(v23)))));
            }
            int v25 = this.getMultiFieldValueClassUnderlyingNameList().isEmpty() ? v22 + v24 : v22 + v24 + 2 + CodedOutputStream.computeInt32SizeNoTag(v24);
            this.A = v24;
            for(int v26 = 0; v26 < this.B.size(); ++v26) {
                v25 += CodedOutputStream.computeMessageSize(23, ((MessageLite)this.B.get(v26)));
            }
            int v28 = 0;
            for(int v27 = 0; v27 < this.C.size(); ++v27) {
                v28 += CodedOutputStream.computeInt32SizeNoTag(((int)(((Integer)this.C.get(v27)))));
            }
            int v29 = this.getMultiFieldValueClassUnderlyingTypeIdList().isEmpty() ? v25 + v28 : v25 + v28 + 2 + CodedOutputStream.computeInt32SizeNoTag(v28);
            this.D = v28;
            if((this.c & 0x40) == 0x40) {
                v29 += CodedOutputStream.computeMessageSize(30, this.E);
            }
            int v30 = 0;
            for(int v = 0; v < this.F.size(); ++v) {
                v30 += CodedOutputStream.computeInt32SizeNoTag(((int)(((Integer)this.F.get(v)))));
            }
            int v31 = this.getVersionRequirementList().size() * 2 + (v29 + v30);
            if((this.c & 0x80) == 0x80) {
                v31 += CodedOutputStream.computeMessageSize(0x20, this.G);
            }
            int v32 = this.extensionsSerializedSize();
            int v33 = this.b.size() + (v32 + v31);
            this.I = v33;
            return v33;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getSupertype(int v) {
            return (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type)this.h.get(v);
        }

        public int getSupertypeCount() {
            return this.h.size();
        }

        public List getSupertypeIdList() {
            return this.i;
        }

        public List getSupertypeList() {
            return this.h;
        }

        public TypeAlias getTypeAlias(int v) {
            return (TypeAlias)this.s.get(v);
        }

        public int getTypeAliasCount() {
            return this.s.size();
        }

        public List getTypeAliasList() {
            return this.s;
        }

        public TypeParameter getTypeParameter(int v) {
            return (TypeParameter)this.g.get(v);
        }

        public int getTypeParameterCount() {
            return this.g.size();
        }

        public List getTypeParameterList() {
            return this.g;
        }

        public TypeTable getTypeTable() {
            return this.E;
        }

        public List getVersionRequirementList() {
            return this.F;
        }

        public VersionRequirementTable getVersionRequirementTable() {
            return this.G;
        }

        public boolean hasCompanionObjectName() {
            return (this.c & 4) == 4;
        }

        public boolean hasFlags() {
            return (this.c & 1) == 1;
        }

        public boolean hasFqName() {
            return (this.c & 2) == 2;
        }

        public boolean hasInlineClassUnderlyingPropertyName() {
            return (this.c & 8) == 8;
        }

        public boolean hasInlineClassUnderlyingType() {
            return (this.c & 16) == 16;
        }

        public boolean hasInlineClassUnderlyingTypeId() {
            return (this.c & 0x20) == 0x20;
        }

        public boolean hasTypeTable() {
            return (this.c & 0x40) == 0x40;
        }

        public boolean hasVersionRequirementTable() {
            return (this.c & 0x80) == 0x80;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            int v = this.H;
            if(v == 1) {
                return true;
            }
            if(v == 0) {
                return false;
            }
            if(!this.hasFqName()) {
                this.H = 0;
                return false;
            }
            for(int v1 = 0; v1 < this.getTypeParameterCount(); ++v1) {
                if(!this.getTypeParameter(v1).isInitialized()) {
                    this.H = 0;
                    return false;
                }
            }
            for(int v2 = 0; v2 < this.getSupertypeCount(); ++v2) {
                if(!this.getSupertype(v2).isInitialized()) {
                    this.H = 0;
                    return false;
                }
            }
            for(int v3 = 0; v3 < this.getContextReceiverTypeCount(); ++v3) {
                if(!this.getContextReceiverType(v3).isInitialized()) {
                    this.H = 0;
                    return false;
                }
            }
            for(int v4 = 0; v4 < this.getConstructorCount(); ++v4) {
                if(!this.getConstructor(v4).isInitialized()) {
                    this.H = 0;
                    return false;
                }
            }
            for(int v5 = 0; v5 < this.getFunctionCount(); ++v5) {
                if(!this.getFunction(v5).isInitialized()) {
                    this.H = 0;
                    return false;
                }
            }
            for(int v6 = 0; v6 < this.getPropertyCount(); ++v6) {
                if(!this.getProperty(v6).isInitialized()) {
                    this.H = 0;
                    return false;
                }
            }
            for(int v7 = 0; v7 < this.getTypeAliasCount(); ++v7) {
                if(!this.getTypeAlias(v7).isInitialized()) {
                    this.H = 0;
                    return false;
                }
            }
            for(int v8 = 0; v8 < this.getEnumEntryCount(); ++v8) {
                if(!this.getEnumEntry(v8).isInitialized()) {
                    this.H = 0;
                    return false;
                }
            }
            if(this.hasInlineClassUnderlyingType() && !this.getInlineClassUnderlyingType().isInitialized()) {
                this.H = 0;
                return false;
            }
            for(int v9 = 0; v9 < this.getMultiFieldValueClassUnderlyingTypeCount(); ++v9) {
                if(!this.getMultiFieldValueClassUnderlyingType(v9).isInitialized()) {
                    this.H = 0;
                    return false;
                }
            }
            if(this.hasTypeTable() && !this.getTypeTable().isInitialized()) {
                this.H = 0;
                return false;
            }
            if(!this.extensionsAreInitialized()) {
                this.H = 0;
                return false;
            }
            this.H = 1;
            return true;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder newBuilder() {
            return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder newBuilder(Class protoBuf$Class0) {
            return Class.newBuilder().mergeFrom(protoBuf$Class0);
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder newBuilderForType() {
            return Class.newBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder newBuilderForType() {
            return this.newBuilderForType();
        }

        public static Class parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (Class)Class.PARSER.parseFrom(inputStream0, extensionRegistryLite0);
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder toBuilder() {
            return Class.newBuilder(this);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder toBuilder() {
            return this.toBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream0) throws IOException {
            this.getSerializedSize();
            ExtensionWriter generatedMessageLite$ExtendableMessage$ExtensionWriter0 = this.newExtensionWriter();
            if((this.c & 1) == 1) {
                codedOutputStream0.writeInt32(1, this.d);
            }
            if(this.getSupertypeIdList().size() > 0) {
                codedOutputStream0.writeRawVarint32(18);
                codedOutputStream0.writeRawVarint32(this.j);
            }
            for(int v1 = 0; v1 < this.i.size(); ++v1) {
                codedOutputStream0.writeInt32NoTag(((int)(((Integer)this.i.get(v1)))));
            }
            if((this.c & 2) == 2) {
                codedOutputStream0.writeInt32(3, this.e);
            }
            if((this.c & 4) == 4) {
                codedOutputStream0.writeInt32(4, this.f);
            }
            for(int v2 = 0; v2 < this.g.size(); ++v2) {
                codedOutputStream0.writeMessage(5, ((MessageLite)this.g.get(v2)));
            }
            for(int v3 = 0; v3 < this.h.size(); ++v3) {
                codedOutputStream0.writeMessage(6, ((MessageLite)this.h.get(v3)));
            }
            if(this.getNestedClassNameList().size() > 0) {
                codedOutputStream0.writeRawVarint32(58);
                codedOutputStream0.writeRawVarint32(this.l);
            }
            for(int v4 = 0; v4 < this.k.size(); ++v4) {
                codedOutputStream0.writeInt32NoTag(((int)(((Integer)this.k.get(v4)))));
            }
            for(int v5 = 0; v5 < this.p.size(); ++v5) {
                codedOutputStream0.writeMessage(8, ((MessageLite)this.p.get(v5)));
            }
            for(int v6 = 0; v6 < this.q.size(); ++v6) {
                codedOutputStream0.writeMessage(9, ((MessageLite)this.q.get(v6)));
            }
            for(int v7 = 0; v7 < this.r.size(); ++v7) {
                codedOutputStream0.writeMessage(10, ((MessageLite)this.r.get(v7)));
            }
            for(int v8 = 0; v8 < this.s.size(); ++v8) {
                codedOutputStream0.writeMessage(11, ((MessageLite)this.s.get(v8)));
            }
            for(int v9 = 0; v9 < this.t.size(); ++v9) {
                codedOutputStream0.writeMessage(13, ((MessageLite)this.t.get(v9)));
            }
            if(this.getSealedSubclassFqNameList().size() > 0) {
                codedOutputStream0.writeRawVarint32(130);
                codedOutputStream0.writeRawVarint32(this.v);
            }
            for(int v10 = 0; v10 < this.u.size(); ++v10) {
                codedOutputStream0.writeInt32NoTag(((int)(((Integer)this.u.get(v10)))));
            }
            if((this.c & 8) == 8) {
                codedOutputStream0.writeInt32(17, this.w);
            }
            if((this.c & 16) == 16) {
                codedOutputStream0.writeMessage(18, this.x);
            }
            if((this.c & 0x20) == 0x20) {
                codedOutputStream0.writeInt32(19, this.y);
            }
            for(int v11 = 0; v11 < this.m.size(); ++v11) {
                codedOutputStream0.writeMessage(20, ((MessageLite)this.m.get(v11)));
            }
            if(this.getContextReceiverTypeIdList().size() > 0) {
                codedOutputStream0.writeRawVarint32(170);
                codedOutputStream0.writeRawVarint32(this.o);
            }
            for(int v12 = 0; v12 < this.n.size(); ++v12) {
                codedOutputStream0.writeInt32NoTag(((int)(((Integer)this.n.get(v12)))));
            }
            if(this.getMultiFieldValueClassUnderlyingNameList().size() > 0) {
                codedOutputStream0.writeRawVarint32(0xB2);
                codedOutputStream0.writeRawVarint32(this.A);
            }
            for(int v13 = 0; v13 < this.z.size(); ++v13) {
                codedOutputStream0.writeInt32NoTag(((int)(((Integer)this.z.get(v13)))));
            }
            for(int v14 = 0; v14 < this.B.size(); ++v14) {
                codedOutputStream0.writeMessage(23, ((MessageLite)this.B.get(v14)));
            }
            if(this.getMultiFieldValueClassUnderlyingTypeIdList().size() > 0) {
                codedOutputStream0.writeRawVarint32(0xC2);
                codedOutputStream0.writeRawVarint32(this.D);
            }
            for(int v15 = 0; v15 < this.C.size(); ++v15) {
                codedOutputStream0.writeInt32NoTag(((int)(((Integer)this.C.get(v15)))));
            }
            if((this.c & 0x40) == 0x40) {
                codedOutputStream0.writeMessage(30, this.E);
            }
            for(int v = 0; v < this.F.size(); ++v) {
                codedOutputStream0.writeInt32(0x1F, ((int)(((Integer)this.F.get(v)))));
            }
            if((this.c & 0x80) == 0x80) {
                codedOutputStream0.writeMessage(0x20, this.G);
            }
            generatedMessageLite$ExtendableMessage$ExtensionWriter0.writeUntil(19000, codedOutputStream0);
            codedOutputStream0.writeRawBytes(this.b);
        }
    }

    public static final class Constructor extends ExtendableMessage implements ProtoBuf.ConstructorOrBuilder {
        public static final class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder extends ExtendableBuilder implements ProtoBuf.ConstructorOrBuilder {
            public int d;
            public int e;
            public List f;
            public List g;

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder() {
                this.e = 6;
                this.f = Collections.emptyList();
                this.g = Collections.emptyList();
            }

            public Constructor build() {
                Constructor protoBuf$Constructor0 = this.buildPartial();
                if(!protoBuf$Constructor0.isInitialized()) {
                    throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(protoBuf$Constructor0);
                }
                return protoBuf$Constructor0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite$Builder
            public MessageLite build() {
                return this.build();
            }

            public Constructor buildPartial() {
                Constructor protoBuf$Constructor0 = new Constructor(this);
                int v = this.d;
                protoBuf$Constructor0.d = this.e;
                if((v & 2) == 2) {
                    this.f = Collections.unmodifiableList(this.f);
                    this.d &= -3;
                }
                protoBuf$Constructor0.e = this.f;
                if((this.d & 4) == 4) {
                    this.g = Collections.unmodifiableList(this.g);
                    this.d &= -5;
                }
                protoBuf$Constructor0.f = this.g;
                protoBuf$Constructor0.c = (v & 1) == 1 ? 1 : 0;
                return protoBuf$Constructor0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public Object clone() throws CloneNotSupportedException {
                return this.clone();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder().mergeFrom(this.buildPartial());
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public ExtendableBuilder clone() {
                return this.clone();
            }

            public Constructor getDefaultInstanceForType() {
                return Constructor.getDefaultInstance();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public GeneratedMessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public MessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            public ValueParameter getValueParameter(int v) {
                return (ValueParameter)this.f.get(v);
            }

            public int getValueParameterCount() {
                return this.f.size();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for(int v = 0; v < this.getValueParameterCount(); ++v) {
                    if(!this.getValueParameter(v).isInitialized()) {
                        return false;
                    }
                }
                return this.extensionsAreInitialized();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder mergeFrom(Constructor protoBuf$Constructor0) {
                if(protoBuf$Constructor0 == Constructor.getDefaultInstance()) {
                    return this;
                }
                if(protoBuf$Constructor0.hasFlags()) {
                    this.setFlags(protoBuf$Constructor0.getFlags());
                }
                if(!protoBuf$Constructor0.e.isEmpty()) {
                    if(this.f.isEmpty()) {
                        this.f = protoBuf$Constructor0.e;
                        this.d &= -3;
                    }
                    else {
                        if((this.d & 2) != 2) {
                            this.f = new ArrayList(this.f);
                            this.d |= 2;
                        }
                        this.f.addAll(protoBuf$Constructor0.e);
                    }
                }
                if(!protoBuf$Constructor0.f.isEmpty()) {
                    if(this.g.isEmpty()) {
                        this.g = protoBuf$Constructor0.f;
                        this.d &= -5;
                    }
                    else {
                        if((this.d & 4) != 4) {
                            this.g = new ArrayList(this.g);
                            this.d |= 4;
                        }
                        this.g.addAll(protoBuf$Constructor0.f);
                    }
                }
                this.mergeExtensionFields(protoBuf$Constructor0);
                this.setUnknownFields(this.getUnknownFields().concat(protoBuf$Constructor0.b));
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                Constructor protoBuf$Constructor1;
                Constructor protoBuf$Constructor0;
                try {
                    try {
                        protoBuf$Constructor0 = null;
                        protoBuf$Constructor1 = (Constructor)Constructor.PARSER.parsePartialFrom(codedInputStream0, extensionRegistryLite0);
                        goto label_13;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                        Constructor protoBuf$Constructor2 = (Constructor)invalidProtocolBufferException0.getUnfinishedMessage();
                        try {
                            throw invalidProtocolBufferException0;
                        }
                        catch(Throwable throwable0) {
                            protoBuf$Constructor0 = protoBuf$Constructor2;
                        }
                    }
                }
                catch(Throwable throwable0) {
                }
                if(protoBuf$Constructor0 != null) {
                    this.mergeFrom(protoBuf$Constructor0);
                }
                throw throwable0;
            label_13:
                if(protoBuf$Constructor1 != null) {
                    this.mergeFrom(protoBuf$Constructor1);
                }
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedMessageLite0) {
                return this.mergeFrom(((Constructor)generatedMessageLite0));
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder setFlags(int v) {
                this.d |= 1;
                this.e = v;
                return this;
            }
        }

        public static Parser PARSER;
        public final ByteString b;
        public int c;
        public int d;
        public List e;
        public List f;
        public byte g;
        public int h;
        public static final Constructor i;

        static {
            Constructor.PARSER = new e();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/AbstractParser;-><init>()V
            Constructor protoBuf$Constructor0 = new Constructor();
            Constructor.i = protoBuf$Constructor0;
            protoBuf$Constructor0.d = 6;
            protoBuf$Constructor0.e = Collections.emptyList();
            protoBuf$Constructor0.f = Collections.emptyList();
        }

        public Constructor() {
            this.g = -1;
            this.h = -1;
            this.b = ByteString.EMPTY;
        }

        public Constructor(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder protoBuf$Constructor$Builder0) {
            super(protoBuf$Constructor$Builder0);
            this.g = -1;
            this.h = -1;
            this.b = protoBuf$Constructor$Builder0.getUnknownFields();
        }

        public Constructor(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) {
            this.g = -1;
            this.h = -1;
            this.d = 6;
            this.e = Collections.emptyList();
            this.f = Collections.emptyList();
            Output byteString$Output0 = ByteString.newOutput();
            CodedOutputStream codedOutputStream0 = CodedOutputStream.newInstance(byteString$Output0, 1);
            int v = 0;
            boolean z = false;
            while(!z) {
                try {
                    try {
                        int v1 = codedInputStream0.readTag();
                        switch(v1) {
                            case 0: {
                            label_14:
                                z = true;
                                continue;
                            }
                            case 8: {
                                this.c |= 1;
                                this.d = codedInputStream0.readInt32();
                                continue;
                            }
                            case 18: {
                                if((v & 2) != 2) {
                                    this.e = new ArrayList();
                                    v |= 2;
                                }
                                this.e.add(codedInputStream0.readMessage(ValueParameter.PARSER, extensionRegistryLite0));
                                continue;
                            }
                            case 0xF8: {
                                if((v & 4) != 4) {
                                    this.f = new ArrayList();
                                    v |= 4;
                                }
                                this.f.add(codedInputStream0.readInt32());
                                continue;
                            }
                            case 0xFA: {
                                int v2 = codedInputStream0.pushLimit(codedInputStream0.readRawVarint32());
                                if((v & 4) != 4 && codedInputStream0.getBytesUntilLimit() > 0) {
                                    this.f = new ArrayList();
                                    v |= 4;
                                }
                                while(codedInputStream0.getBytesUntilLimit() > 0) {
                                    this.f.add(codedInputStream0.readInt32());
                                }
                                codedInputStream0.popLimit(v2);
                                continue;
                            }
                            default: {
                                if(!this.parseUnknownField(codedInputStream0, codedOutputStream0, extensionRegistryLite0, v1)) {
                                    goto label_14;
                                }
                                continue;
                            }
                        }
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                    }
                    catch(IOException iOException0) {
                        throw new InvalidProtocolBufferException(iOException0.getMessage()).setUnfinishedMessage(this);
                    }
                    throw invalidProtocolBufferException0.setUnfinishedMessage(this);
                }
                catch(Throwable throwable0) {
                }
                if((v & 2) == 2) {
                    this.e = Collections.unmodifiableList(this.e);
                }
                if((v & 4) == 4) {
                    this.f = Collections.unmodifiableList(this.f);
                }
                try {
                    codedOutputStream0.flush();
                    goto label_54;
                }
                catch(IOException unused_ex) {
                    goto label_54;
                }
                catch(Throwable throwable1) {
                }
                this.b = byteString$Output0.toByteString();
                throw throwable1;
            label_54:
                this.b = byteString$Output0.toByteString();
                this.makeExtensionsImmutable();
                throw throwable0;
            }
            if((v & 2) == 2) {
                this.e = Collections.unmodifiableList(this.e);
            }
            if((v & 4) == 4) {
                this.f = Collections.unmodifiableList(this.f);
            }
            try {
                codedOutputStream0.flush();
                goto label_67;
            }
            catch(IOException unused_ex) {
                goto label_67;
            }
            catch(Throwable throwable2) {
            }
            this.b = byteString$Output0.toByteString();
            throw throwable2;
        label_67:
            this.b = byteString$Output0.toByteString();
            this.makeExtensionsImmutable();
        }

        public static Constructor getDefaultInstance() {
            return Constructor.i;
        }

        public Constructor getDefaultInstanceForType() {
            return Constructor.i;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public MessageLite getDefaultInstanceForType() {
            return this.getDefaultInstanceForType();
        }

        public int getFlags() {
            return this.d;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser getParserForType() {
            return Constructor.PARSER;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int v1 = this.h;
            if(v1 != -1) {
                return v1;
            }
            int v2 = (this.c & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.d) : 0;
            for(int v3 = 0; v3 < this.e.size(); ++v3) {
                v2 += CodedOutputStream.computeMessageSize(2, ((MessageLite)this.e.get(v3)));
            }
            int v4 = 0;
            for(int v = 0; v < this.f.size(); ++v) {
                v4 += CodedOutputStream.computeInt32SizeNoTag(((int)(((Integer)this.f.get(v)))));
            }
            int v5 = this.extensionsSerializedSize();
            int v6 = this.b.size() + (v5 + (this.getVersionRequirementList().size() * 2 + (v2 + v4)));
            this.h = v6;
            return v6;
        }

        public ValueParameter getValueParameter(int v) {
            return (ValueParameter)this.e.get(v);
        }

        public int getValueParameterCount() {
            return this.e.size();
        }

        public List getValueParameterList() {
            return this.e;
        }

        public List getVersionRequirementList() {
            return this.f;
        }

        public boolean hasFlags() {
            return (this.c & 1) == 1;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            int v = this.g;
            if(v == 1) {
                return true;
            }
            if(v == 0) {
                return false;
            }
            for(int v1 = 0; v1 < this.getValueParameterCount(); ++v1) {
                if(!this.getValueParameter(v1).isInitialized()) {
                    this.g = 0;
                    return false;
                }
            }
            if(!this.extensionsAreInitialized()) {
                this.g = 0;
                return false;
            }
            this.g = 1;
            return true;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder newBuilder() {
            return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder newBuilder(Constructor protoBuf$Constructor0) {
            return Constructor.newBuilder().mergeFrom(protoBuf$Constructor0);
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder newBuilderForType() {
            return Constructor.newBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder newBuilderForType() {
            return this.newBuilderForType();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder toBuilder() {
            return Constructor.newBuilder(this);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder toBuilder() {
            return this.toBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream0) throws IOException {
            this.getSerializedSize();
            ExtensionWriter generatedMessageLite$ExtendableMessage$ExtensionWriter0 = this.newExtensionWriter();
            if((this.c & 1) == 1) {
                codedOutputStream0.writeInt32(1, this.d);
            }
            for(int v1 = 0; v1 < this.e.size(); ++v1) {
                codedOutputStream0.writeMessage(2, ((MessageLite)this.e.get(v1)));
            }
            for(int v = 0; v < this.f.size(); ++v) {
                codedOutputStream0.writeInt32(0x1F, ((int)(((Integer)this.f.get(v)))));
            }
            generatedMessageLite$ExtendableMessage$ExtensionWriter0.writeUntil(19000, codedOutputStream0);
            codedOutputStream0.writeRawBytes(this.b);
        }
    }

    public static final class Contract extends GeneratedMessageLite implements ProtoBuf.ContractOrBuilder {
        public static final class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder implements ProtoBuf.ContractOrBuilder {
            public int b;
            public List c;

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder() {
                this.c = Collections.emptyList();
            }

            public Contract build() {
                Contract protoBuf$Contract0 = this.buildPartial();
                if(!protoBuf$Contract0.isInitialized()) {
                    throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(protoBuf$Contract0);
                }
                return protoBuf$Contract0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite$Builder
            public MessageLite build() {
                return this.build();
            }

            public Contract buildPartial() {
                Contract protoBuf$Contract0 = new Contract(this);
                if((this.b & 1) == 1) {
                    this.c = Collections.unmodifiableList(this.c);
                    this.b &= -2;
                }
                protoBuf$Contract0.b = this.c;
                return protoBuf$Contract0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public Object clone() throws CloneNotSupportedException {
                return this.clone();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder().mergeFrom(this.buildPartial());
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder clone() {
                return this.clone();
            }

            public Contract getDefaultInstanceForType() {
                return Contract.getDefaultInstance();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public GeneratedMessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public MessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            public Effect getEffect(int v) {
                return (Effect)this.c.get(v);
            }

            public int getEffectCount() {
                return this.c.size();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for(int v = 0; v < this.getEffectCount(); ++v) {
                    if(!this.getEffect(v).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder mergeFrom(Contract protoBuf$Contract0) {
                if(protoBuf$Contract0 == Contract.getDefaultInstance()) {
                    return this;
                }
                if(!protoBuf$Contract0.b.isEmpty()) {
                    if(this.c.isEmpty()) {
                        this.c = protoBuf$Contract0.b;
                        this.b &= -2;
                    }
                    else {
                        if((this.b & 1) != 1) {
                            this.c = new ArrayList(this.c);
                            this.b |= 1;
                        }
                        this.c.addAll(protoBuf$Contract0.b);
                    }
                }
                this.setUnknownFields(this.getUnknownFields().concat(protoBuf$Contract0.a));
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                Contract protoBuf$Contract1;
                Contract protoBuf$Contract0;
                try {
                    try {
                        protoBuf$Contract0 = null;
                        protoBuf$Contract1 = (Contract)Contract.PARSER.parsePartialFrom(codedInputStream0, extensionRegistryLite0);
                        goto label_13;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                        Contract protoBuf$Contract2 = (Contract)invalidProtocolBufferException0.getUnfinishedMessage();
                        try {
                            throw invalidProtocolBufferException0;
                        }
                        catch(Throwable throwable0) {
                            protoBuf$Contract0 = protoBuf$Contract2;
                        }
                    }
                }
                catch(Throwable throwable0) {
                }
                if(protoBuf$Contract0 != null) {
                    this.mergeFrom(protoBuf$Contract0);
                }
                throw throwable0;
            label_13:
                if(protoBuf$Contract1 != null) {
                    this.mergeFrom(protoBuf$Contract1);
                }
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedMessageLite0) {
                return this.mergeFrom(((Contract)generatedMessageLite0));
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }
        }

        public static Parser PARSER;
        public final ByteString a;
        public List b;
        public byte c;
        public int d;
        public static final Contract e;

        static {
            Contract.PARSER = new f();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/AbstractParser;-><init>()V
            Contract protoBuf$Contract0 = new Contract();
            Contract.e = protoBuf$Contract0;
            protoBuf$Contract0.b = Collections.emptyList();
        }

        public Contract() {
            this.c = -1;
            this.d = -1;
            this.a = ByteString.EMPTY;
        }

        public Contract(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder protoBuf$Contract$Builder0) {
            super(protoBuf$Contract$Builder0);
            this.c = -1;
            this.d = -1;
            this.a = protoBuf$Contract$Builder0.getUnknownFields();
        }

        public Contract(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) {
            this.c = -1;
            this.d = -1;
            this.b = Collections.emptyList();
            Output byteString$Output0 = ByteString.newOutput();
            CodedOutputStream codedOutputStream0 = CodedOutputStream.newInstance(byteString$Output0, 1);
            boolean z = false;
            boolean z1 = false;
            while(!z1) {
                try {
                    try {
                        int v = codedInputStream0.readTag();
                        switch(v) {
                            case 0: {
                                z1 = true;
                                continue;
                            }
                            case 10: {
                                break;
                            }
                            default: {
                                if(!this.parseUnknownField(codedInputStream0, codedOutputStream0, extensionRegistryLite0, v)) {
                                    z1 = true;
                                    continue;
                                }
                                continue;
                            }
                        }
                        if(!z) {
                            this.b = new ArrayList();
                            z = true;
                        }
                        this.b.add(codedInputStream0.readMessage(Effect.PARSER, extensionRegistryLite0));
                        continue;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                    }
                    catch(IOException iOException0) {
                        throw new InvalidProtocolBufferException(iOException0.getMessage()).setUnfinishedMessage(this);
                    }
                    throw invalidProtocolBufferException0.setUnfinishedMessage(this);
                }
                catch(Throwable throwable0) {
                }
                if(z) {
                    this.b = Collections.unmodifiableList(this.b);
                }
                try {
                    codedOutputStream0.flush();
                    goto label_33;
                }
                catch(IOException unused_ex) {
                    goto label_33;
                }
                catch(Throwable throwable1) {
                }
                this.a = byteString$Output0.toByteString();
                throw throwable1;
            label_33:
                this.a = byteString$Output0.toByteString();
                this.makeExtensionsImmutable();
                throw throwable0;
            }
            if(z) {
                this.b = Collections.unmodifiableList(this.b);
            }
            try {
                codedOutputStream0.flush();
                goto label_43;
            }
            catch(IOException unused_ex) {
                goto label_43;
            }
            catch(Throwable throwable2) {
            }
            this.a = byteString$Output0.toByteString();
            throw throwable2;
        label_43:
            this.a = byteString$Output0.toByteString();
            this.makeExtensionsImmutable();
        }

        public static Contract getDefaultInstance() {
            return Contract.e;
        }

        public Contract getDefaultInstanceForType() {
            return Contract.e;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public MessageLite getDefaultInstanceForType() {
            return this.getDefaultInstanceForType();
        }

        public Effect getEffect(int v) {
            return (Effect)this.b.get(v);
        }

        public int getEffectCount() {
            return this.b.size();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser getParserForType() {
            return Contract.PARSER;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int v = this.d;
            if(v != -1) {
                return v;
            }
            int v2 = 0;
            for(int v1 = 0; v1 < this.b.size(); ++v1) {
                v2 += CodedOutputStream.computeMessageSize(1, ((MessageLite)this.b.get(v1)));
            }
            int v3 = this.a.size() + v2;
            this.d = v3;
            return v3;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            int v = this.c;
            if(v == 1) {
                return true;
            }
            if(v == 0) {
                return false;
            }
            for(int v1 = 0; v1 < this.getEffectCount(); ++v1) {
                if(!this.getEffect(v1).isInitialized()) {
                    this.c = 0;
                    return false;
                }
            }
            this.c = 1;
            return true;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder newBuilder() {
            return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder newBuilder(Contract protoBuf$Contract0) {
            return Contract.newBuilder().mergeFrom(protoBuf$Contract0);
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder newBuilderForType() {
            return Contract.newBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder newBuilderForType() {
            return this.newBuilderForType();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder toBuilder() {
            return Contract.newBuilder(this);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder toBuilder() {
            return this.toBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream0) throws IOException {
            this.getSerializedSize();
            for(int v = 0; v < this.b.size(); ++v) {
                codedOutputStream0.writeMessage(1, ((MessageLite)this.b.get(v)));
            }
            codedOutputStream0.writeRawBytes(this.a);
        }
    }

    public static final class Effect extends GeneratedMessageLite implements ProtoBuf.EffectOrBuilder {
        public static final class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder implements ProtoBuf.EffectOrBuilder {
            public int b;
            public EffectType c;
            public List d;
            public Expression e;
            public InvocationKind f;

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder() {
                this.c = EffectType.RETURNS_CONSTANT;
                this.d = Collections.emptyList();
                this.e = Expression.getDefaultInstance();
                this.f = InvocationKind.AT_MOST_ONCE;
            }

            public Effect build() {
                Effect protoBuf$Effect0 = this.buildPartial();
                if(!protoBuf$Effect0.isInitialized()) {
                    throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(protoBuf$Effect0);
                }
                return protoBuf$Effect0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite$Builder
            public MessageLite build() {
                return this.build();
            }

            public Effect buildPartial() {
                Effect protoBuf$Effect0 = new Effect(this);
                int v = this.b;
                int v1 = (v & 1) == 1 ? 1 : 0;
                protoBuf$Effect0.c = this.c;
                if((v & 2) == 2) {
                    this.d = Collections.unmodifiableList(this.d);
                    this.b &= -3;
                }
                protoBuf$Effect0.d = this.d;
                if((v & 4) == 4) {
                    v1 |= 2;
                }
                protoBuf$Effect0.e = this.e;
                if((v & 8) == 8) {
                    v1 |= 4;
                }
                protoBuf$Effect0.f = this.f;
                protoBuf$Effect0.b = v1;
                return protoBuf$Effect0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public Object clone() throws CloneNotSupportedException {
                return this.clone();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder().mergeFrom(this.buildPartial());
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder clone() {
                return this.clone();
            }

            public Expression getConclusionOfConditionalEffect() {
                return this.e;
            }

            public Effect getDefaultInstanceForType() {
                return Effect.getDefaultInstance();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public GeneratedMessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public MessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            public Expression getEffectConstructorArgument(int v) {
                return (Expression)this.d.get(v);
            }

            public int getEffectConstructorArgumentCount() {
                return this.d.size();
            }

            public boolean hasConclusionOfConditionalEffect() {
                return (this.b & 4) == 4;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for(int v = 0; v < this.getEffectConstructorArgumentCount(); ++v) {
                    if(!this.getEffectConstructorArgument(v).isInitialized()) {
                        return false;
                    }
                }
                return !this.hasConclusionOfConditionalEffect() || this.getConclusionOfConditionalEffect().isInitialized();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder mergeConclusionOfConditionalEffect(Expression protoBuf$Expression0) {
                this.e = (this.b & 4) != 4 || this.e == Expression.getDefaultInstance() ? protoBuf$Expression0 : Expression.newBuilder(this.e).mergeFrom(protoBuf$Expression0).buildPartial();
                this.b |= 4;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder mergeFrom(Effect protoBuf$Effect0) {
                if(protoBuf$Effect0 == Effect.getDefaultInstance()) {
                    return this;
                }
                if(protoBuf$Effect0.hasEffectType()) {
                    this.setEffectType(protoBuf$Effect0.getEffectType());
                }
                if(!protoBuf$Effect0.d.isEmpty()) {
                    if(this.d.isEmpty()) {
                        this.d = protoBuf$Effect0.d;
                        this.b &= -3;
                    }
                    else {
                        if((this.b & 2) != 2) {
                            this.d = new ArrayList(this.d);
                            this.b |= 2;
                        }
                        this.d.addAll(protoBuf$Effect0.d);
                    }
                }
                if(protoBuf$Effect0.hasConclusionOfConditionalEffect()) {
                    this.mergeConclusionOfConditionalEffect(protoBuf$Effect0.getConclusionOfConditionalEffect());
                }
                if(protoBuf$Effect0.hasKind()) {
                    this.setKind(protoBuf$Effect0.getKind());
                }
                this.setUnknownFields(this.getUnknownFields().concat(protoBuf$Effect0.a));
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                Effect protoBuf$Effect1;
                Effect protoBuf$Effect0;
                try {
                    try {
                        protoBuf$Effect0 = null;
                        protoBuf$Effect1 = (Effect)Effect.PARSER.parsePartialFrom(codedInputStream0, extensionRegistryLite0);
                        goto label_13;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                        Effect protoBuf$Effect2 = (Effect)invalidProtocolBufferException0.getUnfinishedMessage();
                        try {
                            throw invalidProtocolBufferException0;
                        }
                        catch(Throwable throwable0) {
                            protoBuf$Effect0 = protoBuf$Effect2;
                        }
                    }
                }
                catch(Throwable throwable0) {
                }
                if(protoBuf$Effect0 != null) {
                    this.mergeFrom(protoBuf$Effect0);
                }
                throw throwable0;
            label_13:
                if(protoBuf$Effect1 != null) {
                    this.mergeFrom(protoBuf$Effect1);
                }
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedMessageLite0) {
                return this.mergeFrom(((Effect)generatedMessageLite0));
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder setEffectType(EffectType protoBuf$Effect$EffectType0) {
                protoBuf$Effect$EffectType0.getClass();
                this.b |= 1;
                this.c = protoBuf$Effect$EffectType0;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder setKind(InvocationKind protoBuf$Effect$InvocationKind0) {
                protoBuf$Effect$InvocationKind0.getClass();
                this.b |= 8;
                this.f = protoBuf$Effect$InvocationKind0;
                return this;
            }
        }

        public static enum EffectType implements EnumLite {
            RETURNS_CONSTANT(0),
            CALLS(1),
            RETURNS_NOT_NULL(2);

            public final int a;

            public EffectType(int v1) {
                this.a = v1;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.Internal$EnumLite
            public final int getNumber() {
                return this.a;
            }

            public static EffectType valueOf(int v) {
                switch(v) {
                    case 0: {
                        return EffectType.RETURNS_CONSTANT;
                    }
                    case 1: {
                        return EffectType.CALLS;
                    }
                    case 2: {
                        return EffectType.RETURNS_NOT_NULL;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }

        public static enum InvocationKind implements EnumLite {
            AT_MOST_ONCE(0),
            EXACTLY_ONCE(1),
            AT_LEAST_ONCE(2);

            public final int a;

            public InvocationKind(int v1) {
                this.a = v1;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.Internal$EnumLite
            public final int getNumber() {
                return this.a;
            }

            public static InvocationKind valueOf(int v) {
                switch(v) {
                    case 0: {
                        return InvocationKind.AT_MOST_ONCE;
                    }
                    case 1: {
                        return InvocationKind.EXACTLY_ONCE;
                    }
                    case 2: {
                        return InvocationKind.AT_LEAST_ONCE;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }

        public static Parser PARSER;
        public final ByteString a;
        public int b;
        public EffectType c;
        public List d;
        public Expression e;
        public InvocationKind f;
        public byte g;
        public int h;
        public static final Effect i;

        static {
            Effect.PARSER = new g();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/AbstractParser;-><init>()V
            Effect protoBuf$Effect0 = new Effect();
            Effect.i = protoBuf$Effect0;
            protoBuf$Effect0.c = EffectType.RETURNS_CONSTANT;
            protoBuf$Effect0.d = Collections.emptyList();
            protoBuf$Effect0.e = Expression.getDefaultInstance();
            protoBuf$Effect0.f = InvocationKind.AT_MOST_ONCE;
        }

        public Effect() {
            this.g = -1;
            this.h = -1;
            this.a = ByteString.EMPTY;
        }

        public Effect(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder protoBuf$Effect$Builder0) {
            super(protoBuf$Effect$Builder0);
            this.g = -1;
            this.h = -1;
            this.a = protoBuf$Effect$Builder0.getUnknownFields();
        }

        public Effect(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) {
            EffectType protoBuf$Effect$EffectType0;
            this.g = -1;
            this.h = -1;
            this.c = EffectType.RETURNS_CONSTANT;
            this.d = Collections.emptyList();
            this.e = Expression.getDefaultInstance();
            this.f = InvocationKind.AT_MOST_ONCE;
            Output byteString$Output0 = ByteString.newOutput();
            CodedOutputStream codedOutputStream0 = CodedOutputStream.newInstance(byteString$Output0, 1);
            int v = 0;
            boolean z = false;
            while(!z) {
                try {
                    int v1 = codedInputStream0.readTag();
                    switch(v1) {
                        case 0: {
                            z = true;
                            break;
                        }
                        case 8: {
                            int v3 = codedInputStream0.readEnum();
                            protoBuf$Effect$EffectType0 = EffectType.valueOf(v3);
                            if(protoBuf$Effect$EffectType0 == null) {
                                codedOutputStream0.writeRawVarint32(8);
                                codedOutputStream0.writeRawVarint32(v3);
                            }
                            else {
                                this.b |= 1;
                                this.c = protoBuf$Effect$EffectType0;
                                continue;
                            }
                            break;
                        }
                        case 18: {
                            if((v & 2) != 2) {
                                this.d = new ArrayList();
                                v = 2;
                            }
                            this.d.add(codedInputStream0.readMessage(Expression.PARSER, extensionRegistryLite0));
                            break;
                        }
                        case 26: {
                            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder protoBuf$Expression$Builder0 = (this.b & 2) == 2 ? this.e.toBuilder() : null;
                            Expression protoBuf$Expression0 = (Expression)codedInputStream0.readMessage(Expression.PARSER, extensionRegistryLite0);
                            this.e = protoBuf$Expression0;
                            if(protoBuf$Expression$Builder0 != null) {
                                protoBuf$Expression$Builder0.mergeFrom(protoBuf$Expression0);
                                this.e = protoBuf$Expression$Builder0.buildPartial();
                            }
                            this.b |= 2;
                            break;
                        }
                        case 0x20: {
                            int v2 = codedInputStream0.readEnum();
                            InvocationKind protoBuf$Effect$InvocationKind0 = InvocationKind.valueOf(v2);
                            if(protoBuf$Effect$InvocationKind0 == null) {
                                codedOutputStream0.writeRawVarint32(0x20);
                                codedOutputStream0.writeRawVarint32(v2);
                            }
                            else {
                                this.b |= 4;
                                this.f = protoBuf$Effect$InvocationKind0;
                            }
                            break;
                        }
                        default: {
                            if(!this.parseUnknownField(codedInputStream0, codedOutputStream0, extensionRegistryLite0, v1)) {
                                z = true;
                                break;
                            }
                        }
                    }
                    continue;
                }
                catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                    throw invalidProtocolBufferException0.setUnfinishedMessage(this);
                }
                catch(IOException iOException0) {
                    throw new InvalidProtocolBufferException(iOException0.getMessage()).setUnfinishedMessage(this);
                }
                catch(Throwable throwable0) {
                }
                if((v & 2) == 2) {
                    this.d = Collections.unmodifiableList(this.d);
                }
                try {
                    codedOutputStream0.flush();
                    goto label_63;
                }
                catch(IOException unused_ex) {
                    goto label_63;
                }
                catch(Throwable throwable1) {
                }
                this.a = byteString$Output0.toByteString();
                throw throwable1;
            label_63:
                this.a = byteString$Output0.toByteString();
                this.makeExtensionsImmutable();
                throw throwable0;
            }
            if((v & 2) == 2) {
                this.d = Collections.unmodifiableList(this.d);
            }
            try {
                codedOutputStream0.flush();
                goto label_73;
            }
            catch(IOException unused_ex) {
                goto label_73;
            }
            catch(Throwable throwable2) {
            }
            this.a = byteString$Output0.toByteString();
            throw throwable2;
        label_73:
            this.a = byteString$Output0.toByteString();
            this.makeExtensionsImmutable();
        }

        public Expression getConclusionOfConditionalEffect() {
            return this.e;
        }

        public static Effect getDefaultInstance() {
            return Effect.i;
        }

        public Effect getDefaultInstanceForType() {
            return Effect.i;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public MessageLite getDefaultInstanceForType() {
            return this.getDefaultInstanceForType();
        }

        public Expression getEffectConstructorArgument(int v) {
            return (Expression)this.d.get(v);
        }

        public int getEffectConstructorArgumentCount() {
            return this.d.size();
        }

        public EffectType getEffectType() {
            return this.c;
        }

        public InvocationKind getKind() {
            return this.f;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser getParserForType() {
            return Effect.PARSER;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int v1 = this.h;
            if(v1 != -1) {
                return v1;
            }
            int v2 = (this.b & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.c.getNumber()) : 0;
            for(int v = 0; v < this.d.size(); ++v) {
                v2 += CodedOutputStream.computeMessageSize(2, ((MessageLite)this.d.get(v)));
            }
            if((this.b & 2) == 2) {
                v2 += CodedOutputStream.computeMessageSize(3, this.e);
            }
            if((this.b & 4) == 4) {
                v2 += CodedOutputStream.computeEnumSize(4, this.f.getNumber());
            }
            int v3 = this.a.size() + v2;
            this.h = v3;
            return v3;
        }

        public boolean hasConclusionOfConditionalEffect() {
            return (this.b & 2) == 2;
        }

        public boolean hasEffectType() {
            return (this.b & 1) == 1;
        }

        public boolean hasKind() {
            return (this.b & 4) == 4;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            int v = this.g;
            if(v == 1) {
                return true;
            }
            if(v == 0) {
                return false;
            }
            for(int v1 = 0; v1 < this.getEffectConstructorArgumentCount(); ++v1) {
                if(!this.getEffectConstructorArgument(v1).isInitialized()) {
                    this.g = 0;
                    return false;
                }
            }
            if(this.hasConclusionOfConditionalEffect() && !this.getConclusionOfConditionalEffect().isInitialized()) {
                this.g = 0;
                return false;
            }
            this.g = 1;
            return true;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder newBuilder() {
            return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder newBuilder(Effect protoBuf$Effect0) {
            return Effect.newBuilder().mergeFrom(protoBuf$Effect0);
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder newBuilderForType() {
            return Effect.newBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder newBuilderForType() {
            return this.newBuilderForType();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder toBuilder() {
            return Effect.newBuilder(this);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder toBuilder() {
            return this.toBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream0) throws IOException {
            this.getSerializedSize();
            if((this.b & 1) == 1) {
                codedOutputStream0.writeEnum(1, this.c.getNumber());
            }
            for(int v = 0; v < this.d.size(); ++v) {
                codedOutputStream0.writeMessage(2, ((MessageLite)this.d.get(v)));
            }
            if((this.b & 2) == 2) {
                codedOutputStream0.writeMessage(3, this.e);
            }
            if((this.b & 4) == 4) {
                codedOutputStream0.writeEnum(4, this.f.getNumber());
            }
            codedOutputStream0.writeRawBytes(this.a);
        }
    }

    public static final class EnumEntry extends ExtendableMessage implements ProtoBuf.EnumEntryOrBuilder {
        public static final class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder extends ExtendableBuilder implements ProtoBuf.EnumEntryOrBuilder {
            public int d;
            public int e;

            public EnumEntry build() {
                EnumEntry protoBuf$EnumEntry0 = this.buildPartial();
                if(!protoBuf$EnumEntry0.isInitialized()) {
                    throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(protoBuf$EnumEntry0);
                }
                return protoBuf$EnumEntry0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite$Builder
            public MessageLite build() {
                return this.build();
            }

            public EnumEntry buildPartial() {
                EnumEntry protoBuf$EnumEntry0 = new EnumEntry(this);
                int v = (this.d & 1) == 1 ? 1 : 0;
                protoBuf$EnumEntry0.d = this.e;
                protoBuf$EnumEntry0.c = v;
                return protoBuf$EnumEntry0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public Object clone() throws CloneNotSupportedException {
                return this.clone();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder().mergeFrom(this.buildPartial());  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$ExtendableBuilder;-><init>()V
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public ExtendableBuilder clone() {
                return this.clone();
            }

            public EnumEntry getDefaultInstanceForType() {
                return EnumEntry.getDefaultInstance();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public GeneratedMessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public MessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return this.extensionsAreInitialized();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder mergeFrom(EnumEntry protoBuf$EnumEntry0) {
                if(protoBuf$EnumEntry0 == EnumEntry.getDefaultInstance()) {
                    return this;
                }
                if(protoBuf$EnumEntry0.hasName()) {
                    this.setName(protoBuf$EnumEntry0.getName());
                }
                this.mergeExtensionFields(protoBuf$EnumEntry0);
                this.setUnknownFields(this.getUnknownFields().concat(protoBuf$EnumEntry0.b));
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                EnumEntry protoBuf$EnumEntry1;
                EnumEntry protoBuf$EnumEntry0;
                try {
                    try {
                        protoBuf$EnumEntry0 = null;
                        protoBuf$EnumEntry1 = (EnumEntry)EnumEntry.PARSER.parsePartialFrom(codedInputStream0, extensionRegistryLite0);
                        goto label_13;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                        EnumEntry protoBuf$EnumEntry2 = (EnumEntry)invalidProtocolBufferException0.getUnfinishedMessage();
                        try {
                            throw invalidProtocolBufferException0;
                        }
                        catch(Throwable throwable0) {
                            protoBuf$EnumEntry0 = protoBuf$EnumEntry2;
                        }
                    }
                }
                catch(Throwable throwable0) {
                }
                if(protoBuf$EnumEntry0 != null) {
                    this.mergeFrom(protoBuf$EnumEntry0);
                }
                throw throwable0;
            label_13:
                if(protoBuf$EnumEntry1 != null) {
                    this.mergeFrom(protoBuf$EnumEntry1);
                }
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedMessageLite0) {
                return this.mergeFrom(((EnumEntry)generatedMessageLite0));
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder setName(int v) {
                this.d |= 1;
                this.e = v;
                return this;
            }
        }

        public static Parser PARSER;
        public final ByteString b;
        public int c;
        public int d;
        public byte e;
        public int f;
        public static final EnumEntry g;

        static {
            EnumEntry.PARSER = new h();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/AbstractParser;-><init>()V
            EnumEntry protoBuf$EnumEntry0 = new EnumEntry();
            EnumEntry.g = protoBuf$EnumEntry0;
            protoBuf$EnumEntry0.d = 0;
        }

        public EnumEntry() {
            this.e = -1;
            this.f = -1;
            this.b = ByteString.EMPTY;
        }

        public EnumEntry(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder protoBuf$EnumEntry$Builder0) {
            super(protoBuf$EnumEntry$Builder0);
            this.e = -1;
            this.f = -1;
            this.b = protoBuf$EnumEntry$Builder0.getUnknownFields();
        }

        public EnumEntry(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) {
            this.e = -1;
            this.f = -1;
            this.d = 0;
            Output byteString$Output0 = ByteString.newOutput();
            CodedOutputStream codedOutputStream0 = CodedOutputStream.newInstance(byteString$Output0, 1);
            try {
                boolean z = false;
                while(!z) {
                    try {
                        try {
                            int v1 = codedInputStream0.readTag();
                            switch(v1) {
                                case 0: {
                                    z = true;
                                    continue;
                                }
                                case 8: {
                                    break;
                                }
                                default: {
                                    if(!this.parseUnknownField(codedInputStream0, codedOutputStream0, extensionRegistryLite0, v1)) {
                                        z = true;
                                        continue;
                                    }
                                    continue;
                                }
                            }
                            this.c |= 1;
                            this.d = codedInputStream0.readInt32();
                            continue;
                        }
                        catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                        }
                        catch(IOException iOException0) {
                            throw new InvalidProtocolBufferException(iOException0.getMessage()).setUnfinishedMessage(this);
                        }
                        throw invalidProtocolBufferException0.setUnfinishedMessage(this);
                    }
                    catch(Throwable throwable0) {
                    }
                    try {
                        codedOutputStream0.flush();
                        goto label_29;
                    }
                    catch(IOException unused_ex) {
                        goto label_29;
                    }
                    catch(Throwable throwable1) {
                    }
                    throw throwable1;
                label_29:
                    this.makeExtensionsImmutable();
                    throw throwable0;
                }
                try {
                    codedOutputStream0.flush();
                }
                catch(IOException unused_ex) {
                }
            }
            finally {
                this.b = byteString$Output0.toByteString();
            }
            this.makeExtensionsImmutable();
        }

        public static EnumEntry getDefaultInstance() {
            return EnumEntry.g;
        }

        public EnumEntry getDefaultInstanceForType() {
            return EnumEntry.g;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public MessageLite getDefaultInstanceForType() {
            return this.getDefaultInstanceForType();
        }

        public int getName() {
            return this.d;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser getParserForType() {
            return EnumEntry.PARSER;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int v = this.f;
            if(v != -1) {
                return v;
            }
            int v1 = (this.c & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.d) : 0;
            int v2 = this.extensionsSerializedSize();
            int v3 = this.b.size() + (v2 + v1);
            this.f = v3;
            return v3;
        }

        public boolean hasName() {
            return (this.c & 1) == 1;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            int v = this.e;
            if(v == 1) {
                return true;
            }
            if(v == 0) {
                return false;
            }
            if(!this.extensionsAreInitialized()) {
                this.e = 0;
                return false;
            }
            this.e = 1;
            return true;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder newBuilder() {
            return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$ExtendableBuilder;-><init>()V
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder newBuilder(EnumEntry protoBuf$EnumEntry0) {
            return EnumEntry.newBuilder().mergeFrom(protoBuf$EnumEntry0);
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder newBuilderForType() {
            return EnumEntry.newBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder newBuilderForType() {
            return this.newBuilderForType();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder toBuilder() {
            return EnumEntry.newBuilder(this);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder toBuilder() {
            return this.toBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream0) throws IOException {
            this.getSerializedSize();
            ExtensionWriter generatedMessageLite$ExtendableMessage$ExtensionWriter0 = this.newExtensionWriter();
            if((this.c & 1) == 1) {
                codedOutputStream0.writeInt32(1, this.d);
            }
            generatedMessageLite$ExtendableMessage$ExtensionWriter0.writeUntil(200, codedOutputStream0);
            codedOutputStream0.writeRawBytes(this.b);
        }
    }

    public static final class Expression extends GeneratedMessageLite implements ProtoBuf.ExpressionOrBuilder {
        public static final class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder implements ProtoBuf.ExpressionOrBuilder {
            public int b;
            public int c;
            public int d;
            public ConstantValue e;
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type f;
            public int g;
            public List h;
            public List i;

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder() {
                this.e = ConstantValue.TRUE;
                this.f = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
                this.h = Collections.emptyList();
                this.i = Collections.emptyList();
            }

            public Expression build() {
                Expression protoBuf$Expression0 = this.buildPartial();
                if(!protoBuf$Expression0.isInitialized()) {
                    throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(protoBuf$Expression0);
                }
                return protoBuf$Expression0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite$Builder
            public MessageLite build() {
                return this.build();
            }

            public Expression buildPartial() {
                Expression protoBuf$Expression0 = new Expression(this);
                int v = this.b;
                int v1 = (v & 1) == 1 ? 1 : 0;
                protoBuf$Expression0.c = this.c;
                if((v & 2) == 2) {
                    v1 |= 2;
                }
                protoBuf$Expression0.d = this.d;
                if((v & 4) == 4) {
                    v1 |= 4;
                }
                protoBuf$Expression0.e = this.e;
                if((v & 8) == 8) {
                    v1 |= 8;
                }
                protoBuf$Expression0.f = this.f;
                if((v & 16) == 16) {
                    v1 |= 16;
                }
                protoBuf$Expression0.g = this.g;
                if((v & 0x20) == 0x20) {
                    this.h = Collections.unmodifiableList(this.h);
                    this.b &= -33;
                }
                protoBuf$Expression0.h = this.h;
                if((this.b & 0x40) == 0x40) {
                    this.i = Collections.unmodifiableList(this.i);
                    this.b &= -65;
                }
                protoBuf$Expression0.i = this.i;
                protoBuf$Expression0.b = v1;
                return protoBuf$Expression0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public Object clone() throws CloneNotSupportedException {
                return this.clone();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder().mergeFrom(this.buildPartial());
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder clone() {
                return this.clone();
            }

            public Expression getAndArgument(int v) {
                return (Expression)this.h.get(v);
            }

            public int getAndArgumentCount() {
                return this.h.size();
            }

            public Expression getDefaultInstanceForType() {
                return Expression.getDefaultInstance();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public GeneratedMessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public MessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getIsInstanceType() {
                return this.f;
            }

            public Expression getOrArgument(int v) {
                return (Expression)this.i.get(v);
            }

            public int getOrArgumentCount() {
                return this.i.size();
            }

            public boolean hasIsInstanceType() {
                return (this.b & 8) == 8;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if(this.hasIsInstanceType() && !this.getIsInstanceType().isInitialized()) {
                    return false;
                }
                for(int v = 0; v < this.getAndArgumentCount(); ++v) {
                    if(!this.getAndArgument(v).isInitialized()) {
                        return false;
                    }
                }
                for(int v1 = 0; v1 < this.getOrArgumentCount(); ++v1) {
                    if(!this.getOrArgument(v1).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder mergeFrom(Expression protoBuf$Expression0) {
                if(protoBuf$Expression0 == Expression.getDefaultInstance()) {
                    return this;
                }
                if(protoBuf$Expression0.hasFlags()) {
                    this.setFlags(protoBuf$Expression0.getFlags());
                }
                if(protoBuf$Expression0.hasValueParameterReference()) {
                    this.setValueParameterReference(protoBuf$Expression0.getValueParameterReference());
                }
                if(protoBuf$Expression0.hasConstantValue()) {
                    this.setConstantValue(protoBuf$Expression0.getConstantValue());
                }
                if(protoBuf$Expression0.hasIsInstanceType()) {
                    this.mergeIsInstanceType(protoBuf$Expression0.getIsInstanceType());
                }
                if(protoBuf$Expression0.hasIsInstanceTypeId()) {
                    this.setIsInstanceTypeId(protoBuf$Expression0.getIsInstanceTypeId());
                }
                if(!protoBuf$Expression0.h.isEmpty()) {
                    if(this.h.isEmpty()) {
                        this.h = protoBuf$Expression0.h;
                        this.b &= -33;
                    }
                    else {
                        if((this.b & 0x20) != 0x20) {
                            this.h = new ArrayList(this.h);
                            this.b |= 0x20;
                        }
                        this.h.addAll(protoBuf$Expression0.h);
                    }
                }
                if(!protoBuf$Expression0.i.isEmpty()) {
                    if(this.i.isEmpty()) {
                        this.i = protoBuf$Expression0.i;
                        this.b &= -65;
                    }
                    else {
                        if((this.b & 0x40) != 0x40) {
                            this.i = new ArrayList(this.i);
                            this.b |= 0x40;
                        }
                        this.i.addAll(protoBuf$Expression0.i);
                    }
                }
                this.setUnknownFields(this.getUnknownFields().concat(protoBuf$Expression0.a));
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                Expression protoBuf$Expression1;
                Expression protoBuf$Expression0;
                try {
                    try {
                        protoBuf$Expression0 = null;
                        protoBuf$Expression1 = (Expression)Expression.PARSER.parsePartialFrom(codedInputStream0, extensionRegistryLite0);
                        goto label_13;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                        Expression protoBuf$Expression2 = (Expression)invalidProtocolBufferException0.getUnfinishedMessage();
                        try {
                            throw invalidProtocolBufferException0;
                        }
                        catch(Throwable throwable0) {
                            protoBuf$Expression0 = protoBuf$Expression2;
                        }
                    }
                }
                catch(Throwable throwable0) {
                }
                if(protoBuf$Expression0 != null) {
                    this.mergeFrom(protoBuf$Expression0);
                }
                throw throwable0;
            label_13:
                if(protoBuf$Expression1 != null) {
                    this.mergeFrom(protoBuf$Expression1);
                }
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedMessageLite0) {
                return this.mergeFrom(((Expression)generatedMessageLite0));
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder mergeIsInstanceType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type0) {
                this.f = (this.b & 8) != 8 || this.f == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance() ? protoBuf$Type0 : kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.f).mergeFrom(protoBuf$Type0).buildPartial();
                this.b |= 8;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder setConstantValue(ConstantValue protoBuf$Expression$ConstantValue0) {
                protoBuf$Expression$ConstantValue0.getClass();
                this.b |= 4;
                this.e = protoBuf$Expression$ConstantValue0;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder setFlags(int v) {
                this.b |= 1;
                this.c = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder setIsInstanceTypeId(int v) {
                this.b |= 16;
                this.g = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder setValueParameterReference(int v) {
                this.b |= 2;
                this.d = v;
                return this;
            }
        }

        public static enum ConstantValue implements EnumLite {
            TRUE(0),
            FALSE(1),
            NULL(2);

            public final int a;

            public ConstantValue(int v1) {
                this.a = v1;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.Internal$EnumLite
            public final int getNumber() {
                return this.a;
            }

            public static ConstantValue valueOf(int v) {
                switch(v) {
                    case 0: {
                        return ConstantValue.TRUE;
                    }
                    case 1: {
                        return ConstantValue.FALSE;
                    }
                    case 2: {
                        return ConstantValue.NULL;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }

        public static Parser PARSER;
        public final ByteString a;
        public int b;
        public int c;
        public int d;
        public ConstantValue e;
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type f;
        public int g;
        public List h;
        public List i;
        public byte j;
        public int k;
        public static final Expression l;

        static {
            Expression.PARSER = new i();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/AbstractParser;-><init>()V
            Expression protoBuf$Expression0 = new Expression();
            Expression.l = protoBuf$Expression0;
            protoBuf$Expression0.c = 0;
            protoBuf$Expression0.d = 0;
            protoBuf$Expression0.e = ConstantValue.TRUE;
            protoBuf$Expression0.f = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            protoBuf$Expression0.g = 0;
            protoBuf$Expression0.h = Collections.emptyList();
            protoBuf$Expression0.i = Collections.emptyList();
        }

        public Expression() {
            this.j = -1;
            this.k = -1;
            this.a = ByteString.EMPTY;
        }

        public Expression(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder protoBuf$Expression$Builder0) {
            super(protoBuf$Expression$Builder0);
            this.j = -1;
            this.k = -1;
            this.a = protoBuf$Expression$Builder0.getUnknownFields();
        }

        public Expression(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) {
            this.j = -1;
            this.k = -1;
            this.c = 0;
            this.d = 0;
            this.e = ConstantValue.TRUE;
            this.f = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            this.g = 0;
            this.h = Collections.emptyList();
            this.i = Collections.emptyList();
            Output byteString$Output0 = ByteString.newOutput();
            CodedOutputStream codedOutputStream0 = CodedOutputStream.newInstance(byteString$Output0, 1);
            int v = 0;
            boolean z = false;
            while(!z) {
                try {
                    try {
                        int v1 = codedInputStream0.readTag();
                        switch(v1) {
                            case 0: {
                                z = true;
                                continue;
                            }
                            case 8: {
                                this.b |= 1;
                                this.c = codedInputStream0.readInt32();
                                continue;
                            }
                            case 16: {
                                this.b |= 2;
                                this.d = codedInputStream0.readInt32();
                                continue;
                            }
                            case 24: {
                                int v2 = codedInputStream0.readEnum();
                                ConstantValue protoBuf$Expression$ConstantValue0 = ConstantValue.valueOf(v2);
                                if(protoBuf$Expression$ConstantValue0 == null) {
                                    codedOutputStream0.writeRawVarint32(24);
                                    codedOutputStream0.writeRawVarint32(v2);
                                }
                                else {
                                    this.b |= 4;
                                    this.e = protoBuf$Expression$ConstantValue0;
                                }
                                continue;
                            }
                            case 34: {
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder protoBuf$Type$Builder0 = (this.b & 8) == 8 ? this.f.toBuilder() : null;
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type)codedInputStream0.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite0);
                                this.f = protoBuf$Type0;
                                if(protoBuf$Type$Builder0 != null) {
                                    protoBuf$Type$Builder0.mergeFrom(protoBuf$Type0);
                                    this.f = protoBuf$Type$Builder0.buildPartial();
                                }
                                this.b |= 8;
                                continue;
                            }
                            case 40: {
                                this.b |= 16;
                                this.g = codedInputStream0.readInt32();
                                continue;
                            }
                            case 50: {
                                if((v & 0x20) != 0x20) {
                                    this.h = new ArrayList();
                                    v |= 0x20;
                                }
                                this.h.add(codedInputStream0.readMessage(Expression.PARSER, extensionRegistryLite0));
                                continue;
                            }
                            case 58: {
                                if((v & 0x40) != 0x40) {
                                    this.i = new ArrayList();
                                    v |= 0x40;
                                }
                                this.i.add(codedInputStream0.readMessage(Expression.PARSER, extensionRegistryLite0));
                                continue;
                            }
                            default: {
                                if(!this.parseUnknownField(codedInputStream0, codedOutputStream0, extensionRegistryLite0, v1)) {
                                    z = true;
                                    continue;
                                }
                                continue;
                            }
                        }
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                    }
                    catch(IOException iOException0) {
                        throw new InvalidProtocolBufferException(iOException0.getMessage()).setUnfinishedMessage(this);
                    }
                    throw invalidProtocolBufferException0.setUnfinishedMessage(this);
                }
                catch(Throwable throwable0) {
                }
                if((v & 0x20) == 0x20) {
                    this.h = Collections.unmodifiableList(this.h);
                }
                if((v & 0x40) == 0x40) {
                    this.i = Collections.unmodifiableList(this.i);
                }
                try {
                    codedOutputStream0.flush();
                    goto label_72;
                }
                catch(IOException unused_ex) {
                    goto label_72;
                }
                catch(Throwable throwable1) {
                }
                this.a = byteString$Output0.toByteString();
                throw throwable1;
            label_72:
                this.a = byteString$Output0.toByteString();
                this.makeExtensionsImmutable();
                throw throwable0;
            }
            if((v & 0x20) == 0x20) {
                this.h = Collections.unmodifiableList(this.h);
            }
            if((v & 0x40) == 0x40) {
                this.i = Collections.unmodifiableList(this.i);
            }
            try {
                codedOutputStream0.flush();
                goto label_85;
            }
            catch(IOException unused_ex) {
                goto label_85;
            }
            catch(Throwable throwable2) {
            }
            this.a = byteString$Output0.toByteString();
            throw throwable2;
        label_85:
            this.a = byteString$Output0.toByteString();
            this.makeExtensionsImmutable();
        }

        public Expression getAndArgument(int v) {
            return (Expression)this.h.get(v);
        }

        public int getAndArgumentCount() {
            return this.h.size();
        }

        public ConstantValue getConstantValue() {
            return this.e;
        }

        public static Expression getDefaultInstance() {
            return Expression.l;
        }

        public Expression getDefaultInstanceForType() {
            return Expression.l;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public MessageLite getDefaultInstanceForType() {
            return this.getDefaultInstanceForType();
        }

        public int getFlags() {
            return this.c;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getIsInstanceType() {
            return this.f;
        }

        public int getIsInstanceTypeId() {
            return this.g;
        }

        public Expression getOrArgument(int v) {
            return (Expression)this.i.get(v);
        }

        public int getOrArgumentCount() {
            return this.i.size();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser getParserForType() {
            return Expression.PARSER;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int v1 = this.k;
            if(v1 != -1) {
                return v1;
            }
            int v2 = (this.b & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.c) : 0;
            if((this.b & 2) == 2) {
                v2 += CodedOutputStream.computeInt32Size(2, this.d);
            }
            if((this.b & 4) == 4) {
                v2 += CodedOutputStream.computeEnumSize(3, this.e.getNumber());
            }
            if((this.b & 8) == 8) {
                v2 += CodedOutputStream.computeMessageSize(4, this.f);
            }
            if((this.b & 16) == 16) {
                v2 += CodedOutputStream.computeInt32Size(5, this.g);
            }
            for(int v3 = 0; v3 < this.h.size(); ++v3) {
                v2 += CodedOutputStream.computeMessageSize(6, ((MessageLite)this.h.get(v3)));
            }
            for(int v = 0; v < this.i.size(); ++v) {
                v2 += CodedOutputStream.computeMessageSize(7, ((MessageLite)this.i.get(v)));
            }
            int v4 = this.a.size() + v2;
            this.k = v4;
            return v4;
        }

        public int getValueParameterReference() {
            return this.d;
        }

        public boolean hasConstantValue() {
            return (this.b & 4) == 4;
        }

        public boolean hasFlags() {
            return (this.b & 1) == 1;
        }

        public boolean hasIsInstanceType() {
            return (this.b & 8) == 8;
        }

        public boolean hasIsInstanceTypeId() {
            return (this.b & 16) == 16;
        }

        public boolean hasValueParameterReference() {
            return (this.b & 2) == 2;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            int v = this.j;
            if(v == 1) {
                return true;
            }
            if(v == 0) {
                return false;
            }
            if(this.hasIsInstanceType() && !this.getIsInstanceType().isInitialized()) {
                this.j = 0;
                return false;
            }
            for(int v1 = 0; v1 < this.getAndArgumentCount(); ++v1) {
                if(!this.getAndArgument(v1).isInitialized()) {
                    this.j = 0;
                    return false;
                }
            }
            for(int v2 = 0; v2 < this.getOrArgumentCount(); ++v2) {
                if(!this.getOrArgument(v2).isInitialized()) {
                    this.j = 0;
                    return false;
                }
            }
            this.j = 1;
            return true;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder newBuilder() {
            return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder newBuilder(Expression protoBuf$Expression0) {
            return Expression.newBuilder().mergeFrom(protoBuf$Expression0);
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder newBuilderForType() {
            return Expression.newBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder newBuilderForType() {
            return this.newBuilderForType();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder toBuilder() {
            return Expression.newBuilder(this);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder toBuilder() {
            return this.toBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream0) throws IOException {
            this.getSerializedSize();
            if((this.b & 1) == 1) {
                codedOutputStream0.writeInt32(1, this.c);
            }
            if((this.b & 2) == 2) {
                codedOutputStream0.writeInt32(2, this.d);
            }
            if((this.b & 4) == 4) {
                codedOutputStream0.writeEnum(3, this.e.getNumber());
            }
            if((this.b & 8) == 8) {
                codedOutputStream0.writeMessage(4, this.f);
            }
            if((this.b & 16) == 16) {
                codedOutputStream0.writeInt32(5, this.g);
            }
            for(int v1 = 0; v1 < this.h.size(); ++v1) {
                codedOutputStream0.writeMessage(6, ((MessageLite)this.h.get(v1)));
            }
            for(int v = 0; v < this.i.size(); ++v) {
                codedOutputStream0.writeMessage(7, ((MessageLite)this.i.get(v)));
            }
            codedOutputStream0.writeRawBytes(this.a);
        }
    }

    public static final class Function extends ExtendableMessage implements ProtoBuf.FunctionOrBuilder {
        public static final class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder extends ExtendableBuilder implements ProtoBuf.FunctionOrBuilder {
            public int d;
            public int e;
            public int f;
            public int g;
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type h;
            public int i;
            public List j;
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type k;
            public int l;
            public List m;
            public List n;
            public List o;
            public TypeTable p;
            public List q;
            public Contract r;

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder() {
                this.e = 6;
                this.f = 6;
                this.h = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
                this.j = Collections.emptyList();
                this.k = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
                this.m = Collections.emptyList();
                this.n = Collections.emptyList();
                this.o = Collections.emptyList();
                this.p = TypeTable.getDefaultInstance();
                this.q = Collections.emptyList();
                this.r = Contract.getDefaultInstance();
            }

            public Function build() {
                Function protoBuf$Function0 = this.buildPartial();
                if(!protoBuf$Function0.isInitialized()) {
                    throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(protoBuf$Function0);
                }
                return protoBuf$Function0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite$Builder
            public MessageLite build() {
                return this.build();
            }

            public Function buildPartial() {
                Function protoBuf$Function0 = new Function(this);
                int v = this.d;
                int v1 = (v & 1) == 1 ? 1 : 0;
                protoBuf$Function0.d = this.e;
                if((v & 2) == 2) {
                    v1 |= 2;
                }
                protoBuf$Function0.e = this.f;
                if((v & 4) == 4) {
                    v1 |= 4;
                }
                protoBuf$Function0.f = this.g;
                if((v & 8) == 8) {
                    v1 |= 8;
                }
                protoBuf$Function0.g = this.h;
                if((v & 16) == 16) {
                    v1 |= 16;
                }
                protoBuf$Function0.h = this.i;
                if((v & 0x20) == 0x20) {
                    this.j = Collections.unmodifiableList(this.j);
                    this.d &= -33;
                }
                protoBuf$Function0.i = this.j;
                if((v & 0x40) == 0x40) {
                    v1 |= 0x20;
                }
                protoBuf$Function0.j = this.k;
                if((v & 0x80) == 0x80) {
                    v1 |= 0x40;
                }
                protoBuf$Function0.k = this.l;
                if((this.d & 0x100) == 0x100) {
                    this.m = Collections.unmodifiableList(this.m);
                    this.d &= 0xFFFFFEFF;
                }
                protoBuf$Function0.l = this.m;
                if((this.d & 0x200) == 0x200) {
                    this.n = Collections.unmodifiableList(this.n);
                    this.d &= 0xFFFFFDFF;
                }
                protoBuf$Function0.m = this.n;
                if((this.d & 0x400) == 0x400) {
                    this.o = Collections.unmodifiableList(this.o);
                    this.d &= 0xFFFFFBFF;
                }
                protoBuf$Function0.o = this.o;
                if((v & 0x800) == 0x800) {
                    v1 |= 0x80;
                }
                protoBuf$Function0.p = this.p;
                if((this.d & 0x1000) == 0x1000) {
                    this.q = Collections.unmodifiableList(this.q);
                    this.d &= 0xFFFFEFFF;
                }
                protoBuf$Function0.q = this.q;
                if((v & 0x2000) == 0x2000) {
                    v1 |= 0x100;
                }
                protoBuf$Function0.r = this.r;
                protoBuf$Function0.c = v1;
                return protoBuf$Function0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public Object clone() throws CloneNotSupportedException {
                return this.clone();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder().mergeFrom(this.buildPartial());
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public ExtendableBuilder clone() {
                return this.clone();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getContextReceiverType(int v) {
                return (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type)this.m.get(v);
            }

            public int getContextReceiverTypeCount() {
                return this.m.size();
            }

            public Contract getContract() {
                return this.r;
            }

            public Function getDefaultInstanceForType() {
                return Function.getDefaultInstance();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public GeneratedMessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public MessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getReceiverType() {
                return this.k;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getReturnType() {
                return this.h;
            }

            public TypeParameter getTypeParameter(int v) {
                return (TypeParameter)this.j.get(v);
            }

            public int getTypeParameterCount() {
                return this.j.size();
            }

            public TypeTable getTypeTable() {
                return this.p;
            }

            public ValueParameter getValueParameter(int v) {
                return (ValueParameter)this.o.get(v);
            }

            public int getValueParameterCount() {
                return this.o.size();
            }

            public boolean hasContract() {
                return (this.d & 0x2000) == 0x2000;
            }

            public boolean hasName() {
                return (this.d & 4) == 4;
            }

            public boolean hasReceiverType() {
                return (this.d & 0x40) == 0x40;
            }

            public boolean hasReturnType() {
                return (this.d & 8) == 8;
            }

            public boolean hasTypeTable() {
                return (this.d & 0x800) == 0x800;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if(!this.hasName()) {
                    return false;
                }
                if(this.hasReturnType() && !this.getReturnType().isInitialized()) {
                    return false;
                }
                for(int v = 0; v < this.getTypeParameterCount(); ++v) {
                    if(!this.getTypeParameter(v).isInitialized()) {
                        return false;
                    }
                }
                if(this.hasReceiverType() && !this.getReceiverType().isInitialized()) {
                    return false;
                }
                for(int v1 = 0; v1 < this.getContextReceiverTypeCount(); ++v1) {
                    if(!this.getContextReceiverType(v1).isInitialized()) {
                        return false;
                    }
                }
                for(int v2 = 0; v2 < this.getValueParameterCount(); ++v2) {
                    if(!this.getValueParameter(v2).isInitialized()) {
                        return false;
                    }
                }
                if(this.hasTypeTable() && !this.getTypeTable().isInitialized()) {
                    return false;
                }
                return !this.hasContract() || this.getContract().isInitialized() ? this.extensionsAreInitialized() : false;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder mergeContract(Contract protoBuf$Contract0) {
                this.r = (this.d & 0x2000) != 0x2000 || this.r == Contract.getDefaultInstance() ? protoBuf$Contract0 : Contract.newBuilder(this.r).mergeFrom(protoBuf$Contract0).buildPartial();
                this.d |= 0x2000;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder mergeFrom(Function protoBuf$Function0) {
                if(protoBuf$Function0 == Function.getDefaultInstance()) {
                    return this;
                }
                if(protoBuf$Function0.hasFlags()) {
                    this.setFlags(protoBuf$Function0.getFlags());
                }
                if(protoBuf$Function0.hasOldFlags()) {
                    this.setOldFlags(protoBuf$Function0.getOldFlags());
                }
                if(protoBuf$Function0.hasName()) {
                    this.setName(protoBuf$Function0.getName());
                }
                if(protoBuf$Function0.hasReturnType()) {
                    this.mergeReturnType(protoBuf$Function0.getReturnType());
                }
                if(protoBuf$Function0.hasReturnTypeId()) {
                    this.setReturnTypeId(protoBuf$Function0.getReturnTypeId());
                }
                if(!protoBuf$Function0.i.isEmpty()) {
                    if(this.j.isEmpty()) {
                        this.j = protoBuf$Function0.i;
                        this.d &= -33;
                    }
                    else {
                        if((this.d & 0x20) != 0x20) {
                            this.j = new ArrayList(this.j);
                            this.d |= 0x20;
                        }
                        this.j.addAll(protoBuf$Function0.i);
                    }
                }
                if(protoBuf$Function0.hasReceiverType()) {
                    this.mergeReceiverType(protoBuf$Function0.getReceiverType());
                }
                if(protoBuf$Function0.hasReceiverTypeId()) {
                    this.setReceiverTypeId(protoBuf$Function0.getReceiverTypeId());
                }
                if(!protoBuf$Function0.l.isEmpty()) {
                    if(this.m.isEmpty()) {
                        this.m = protoBuf$Function0.l;
                        this.d &= 0xFFFFFEFF;
                    }
                    else {
                        if((this.d & 0x100) != 0x100) {
                            this.m = new ArrayList(this.m);
                            this.d |= 0x100;
                        }
                        this.m.addAll(protoBuf$Function0.l);
                    }
                }
                if(!protoBuf$Function0.m.isEmpty()) {
                    if(this.n.isEmpty()) {
                        this.n = protoBuf$Function0.m;
                        this.d &= 0xFFFFFDFF;
                    }
                    else {
                        if((this.d & 0x200) != 0x200) {
                            this.n = new ArrayList(this.n);
                            this.d |= 0x200;
                        }
                        this.n.addAll(protoBuf$Function0.m);
                    }
                }
                if(!protoBuf$Function0.o.isEmpty()) {
                    if(this.o.isEmpty()) {
                        this.o = protoBuf$Function0.o;
                        this.d &= 0xFFFFFBFF;
                    }
                    else {
                        if((this.d & 0x400) != 0x400) {
                            this.o = new ArrayList(this.o);
                            this.d |= 0x400;
                        }
                        this.o.addAll(protoBuf$Function0.o);
                    }
                }
                if(protoBuf$Function0.hasTypeTable()) {
                    this.mergeTypeTable(protoBuf$Function0.getTypeTable());
                }
                if(!protoBuf$Function0.q.isEmpty()) {
                    if(this.q.isEmpty()) {
                        this.q = protoBuf$Function0.q;
                        this.d &= 0xFFFFEFFF;
                    }
                    else {
                        if((this.d & 0x1000) != 0x1000) {
                            this.q = new ArrayList(this.q);
                            this.d |= 0x1000;
                        }
                        this.q.addAll(protoBuf$Function0.q);
                    }
                }
                if(protoBuf$Function0.hasContract()) {
                    this.mergeContract(protoBuf$Function0.getContract());
                }
                this.mergeExtensionFields(protoBuf$Function0);
                this.setUnknownFields(this.getUnknownFields().concat(protoBuf$Function0.b));
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                Function protoBuf$Function1;
                Function protoBuf$Function0;
                try {
                    try {
                        protoBuf$Function0 = null;
                        protoBuf$Function1 = (Function)Function.PARSER.parsePartialFrom(codedInputStream0, extensionRegistryLite0);
                        goto label_13;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                        Function protoBuf$Function2 = (Function)invalidProtocolBufferException0.getUnfinishedMessage();
                        try {
                            throw invalidProtocolBufferException0;
                        }
                        catch(Throwable throwable0) {
                            protoBuf$Function0 = protoBuf$Function2;
                        }
                    }
                }
                catch(Throwable throwable0) {
                }
                if(protoBuf$Function0 != null) {
                    this.mergeFrom(protoBuf$Function0);
                }
                throw throwable0;
            label_13:
                if(protoBuf$Function1 != null) {
                    this.mergeFrom(protoBuf$Function1);
                }
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedMessageLite0) {
                return this.mergeFrom(((Function)generatedMessageLite0));
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder mergeReceiverType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type0) {
                this.k = (this.d & 0x40) != 0x40 || this.k == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance() ? protoBuf$Type0 : kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.k).mergeFrom(protoBuf$Type0).buildPartial();
                this.d |= 0x40;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder mergeReturnType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type0) {
                this.h = (this.d & 8) != 8 || this.h == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance() ? protoBuf$Type0 : kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.h).mergeFrom(protoBuf$Type0).buildPartial();
                this.d |= 8;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder mergeTypeTable(TypeTable protoBuf$TypeTable0) {
                this.p = (this.d & 0x800) != 0x800 || this.p == TypeTable.getDefaultInstance() ? protoBuf$TypeTable0 : TypeTable.newBuilder(this.p).mergeFrom(protoBuf$TypeTable0).buildPartial();
                this.d |= 0x800;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder setFlags(int v) {
                this.d |= 1;
                this.e = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder setName(int v) {
                this.d |= 4;
                this.g = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder setOldFlags(int v) {
                this.d |= 2;
                this.f = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder setReceiverTypeId(int v) {
                this.d |= 0x80;
                this.l = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder setReturnTypeId(int v) {
                this.d |= 16;
                this.i = v;
                return this;
            }
        }

        public static Parser PARSER;
        public final ByteString b;
        public int c;
        public int d;
        public int e;
        public int f;
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type g;
        public int h;
        public List i;
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type j;
        public int k;
        public List l;
        public List m;
        public int n;
        public List o;
        public TypeTable p;
        public List q;
        public Contract r;
        public byte s;
        public int t;
        public static final Function u;

        static {
            Function.PARSER = new j();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/AbstractParser;-><init>()V
            Function protoBuf$Function0 = new Function();
            Function.u = protoBuf$Function0;
            protoBuf$Function0.b();
        }

        public Function() {
            this.n = -1;
            this.s = -1;
            this.t = -1;
            this.b = ByteString.EMPTY;
        }

        public Function(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder protoBuf$Function$Builder0) {
            super(protoBuf$Function$Builder0);
            this.n = -1;
            this.s = -1;
            this.t = -1;
            this.b = protoBuf$Function$Builder0.getUnknownFields();
        }

        public Function(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) {
            this.n = -1;
            this.s = -1;
            this.t = -1;
            this.b();
            Output byteString$Output0 = ByteString.newOutput();
            CodedOutputStream codedOutputStream0 = CodedOutputStream.newInstance(byteString$Output0, 1);
            int v = 0;
            boolean z = false;
            while(!z) {
                try {
                    try {
                        int v1 = codedInputStream0.readTag();
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder protoBuf$Type$Builder0 = null;
                        switch(v1) {
                            case 0: {
                            label_14:
                                z = true;
                                continue;
                            }
                            case 8: {
                                this.c |= 2;
                                this.e = codedInputStream0.readInt32();
                                continue;
                            }
                            case 16: {
                                this.c |= 4;
                                this.f = codedInputStream0.readInt32();
                                continue;
                            }
                            case 26: {
                                if((this.c & 8) == 8) {
                                    protoBuf$Type$Builder0 = this.g.toBuilder();
                                }
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type)codedInputStream0.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite0);
                                this.g = protoBuf$Type0;
                                if(protoBuf$Type$Builder0 != null) {
                                    protoBuf$Type$Builder0.mergeFrom(protoBuf$Type0);
                                    this.g = protoBuf$Type$Builder0.buildPartial();
                                }
                                this.c |= 8;
                                continue;
                            }
                            case 34: {
                                if((v & 0x20) != 0x20) {
                                    this.i = new ArrayList();
                                    v |= 0x20;
                                }
                                this.i.add(codedInputStream0.readMessage(TypeParameter.PARSER, extensionRegistryLite0));
                                continue;
                            }
                            case 42: {
                                if((this.c & 0x20) == 0x20) {
                                    protoBuf$Type$Builder0 = this.j.toBuilder();
                                }
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type)codedInputStream0.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite0);
                                this.j = protoBuf$Type1;
                                if(protoBuf$Type$Builder0 != null) {
                                    protoBuf$Type$Builder0.mergeFrom(protoBuf$Type1);
                                    this.j = protoBuf$Type$Builder0.buildPartial();
                                }
                                this.c |= 0x20;
                                continue;
                            }
                            case 50: {
                                if((v & 0x400) != 0x400) {
                                    this.o = new ArrayList();
                                    v |= 0x400;
                                }
                                this.o.add(codedInputStream0.readMessage(ValueParameter.PARSER, extensionRegistryLite0));
                                continue;
                            }
                            case 56: {
                                this.c |= 16;
                                this.h = codedInputStream0.readInt32();
                                continue;
                            }
                            case 0x40: {
                                this.c |= 0x40;
                                this.k = codedInputStream0.readInt32();
                                continue;
                            }
                            case 72: {
                                this.c |= 1;
                                this.d = codedInputStream0.readInt32();
                                continue;
                            }
                            case 82: {
                                if((v & 0x100) != 0x100) {
                                    this.l = new ArrayList();
                                    v |= 0x100;
                                }
                                this.l.add(codedInputStream0.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite0));
                                continue;
                            }
                            case 88: {
                                if((v & 0x200) != 0x200) {
                                    this.m = new ArrayList();
                                    v |= 0x200;
                                }
                                this.m.add(codedInputStream0.readInt32());
                                continue;
                            }
                            case 90: {
                                int v2 = codedInputStream0.pushLimit(codedInputStream0.readRawVarint32());
                                if((v & 0x200) != 0x200 && codedInputStream0.getBytesUntilLimit() > 0) {
                                    this.m = new ArrayList();
                                    v |= 0x200;
                                }
                                while(codedInputStream0.getBytesUntilLimit() > 0) {
                                    this.m.add(codedInputStream0.readInt32());
                                }
                                codedInputStream0.popLimit(v2);
                                continue;
                            }
                            case 0xF2: {
                                if((this.c & 0x80) == 0x80) {
                                    protoBuf$Type$Builder0 = this.p.toBuilder();
                                }
                                TypeTable protoBuf$TypeTable0 = (TypeTable)codedInputStream0.readMessage(TypeTable.PARSER, extensionRegistryLite0);
                                this.p = protoBuf$TypeTable0;
                                if(protoBuf$Type$Builder0 != null) {
                                    ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder)protoBuf$Type$Builder0).mergeFrom(protoBuf$TypeTable0);
                                    this.p = ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder)protoBuf$Type$Builder0).buildPartial();
                                }
                                this.c |= 0x80;
                                continue;
                            }
                            case 0xF8: {
                                if((v & 0x1000) != 0x1000) {
                                    this.q = new ArrayList();
                                    v |= 0x1000;
                                }
                                this.q.add(codedInputStream0.readInt32());
                                continue;
                            }
                            case 0xFA: {
                                int v3 = codedInputStream0.pushLimit(codedInputStream0.readRawVarint32());
                                if((v & 0x1000) != 0x1000 && codedInputStream0.getBytesUntilLimit() > 0) {
                                    this.q = new ArrayList();
                                    v |= 0x1000;
                                }
                                while(codedInputStream0.getBytesUntilLimit() > 0) {
                                    this.q.add(codedInputStream0.readInt32());
                                }
                                codedInputStream0.popLimit(v3);
                                continue;
                            }
                            case 0x102: {
                                if((this.c & 0x100) == 0x100) {
                                    protoBuf$Type$Builder0 = this.r.toBuilder();
                                }
                                Contract protoBuf$Contract0 = (Contract)codedInputStream0.readMessage(Contract.PARSER, extensionRegistryLite0);
                                this.r = protoBuf$Contract0;
                                if(protoBuf$Type$Builder0 != null) {
                                    ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder)protoBuf$Type$Builder0).mergeFrom(protoBuf$Contract0);
                                    this.r = ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder)protoBuf$Type$Builder0).buildPartial();
                                }
                                break;
                            }
                            default: {
                                if(!this.parseUnknownField(codedInputStream0, codedOutputStream0, extensionRegistryLite0, v1)) {
                                    goto label_14;
                                }
                                continue;
                            }
                        }
                        this.c |= 0x100;
                        continue;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                    }
                    catch(IOException iOException0) {
                        throw new InvalidProtocolBufferException(iOException0.getMessage()).setUnfinishedMessage(this);
                    }
                    throw invalidProtocolBufferException0.setUnfinishedMessage(this);
                }
                catch(Throwable throwable0) {
                }
                if((v & 0x20) == 0x20) {
                    this.i = Collections.unmodifiableList(this.i);
                }
                if((v & 0x400) == 0x400) {
                    this.o = Collections.unmodifiableList(this.o);
                }
                if((v & 0x100) == 0x100) {
                    this.l = Collections.unmodifiableList(this.l);
                }
                if((v & 0x200) == 0x200) {
                    this.m = Collections.unmodifiableList(this.m);
                }
                if((v & 0x1000) == 0x1000) {
                    this.q = Collections.unmodifiableList(this.q);
                }
                try {
                    codedOutputStream0.flush();
                    goto label_132;
                }
                catch(IOException unused_ex) {
                    goto label_132;
                }
                catch(Throwable throwable1) {
                }
                this.b = byteString$Output0.toByteString();
                throw throwable1;
            label_132:
                this.b = byteString$Output0.toByteString();
                this.makeExtensionsImmutable();
                throw throwable0;
            }
            if((v & 0x20) == 0x20) {
                this.i = Collections.unmodifiableList(this.i);
            }
            if((v & 0x400) == 0x400) {
                this.o = Collections.unmodifiableList(this.o);
            }
            if((v & 0x100) == 0x100) {
                this.l = Collections.unmodifiableList(this.l);
            }
            if((v & 0x200) == 0x200) {
                this.m = Collections.unmodifiableList(this.m);
            }
            if((v & 0x1000) == 0x1000) {
                this.q = Collections.unmodifiableList(this.q);
            }
            try {
                codedOutputStream0.flush();
                goto label_150;
            }
            catch(IOException unused_ex) {
                goto label_150;
            }
            catch(Throwable throwable2) {
            }
            this.b = byteString$Output0.toByteString();
            throw throwable2;
        label_150:
            this.b = byteString$Output0.toByteString();
            this.makeExtensionsImmutable();
        }

        public final void b() {
            this.d = 6;
            this.e = 6;
            this.f = 0;
            this.g = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            this.h = 0;
            this.i = Collections.emptyList();
            this.j = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            this.k = 0;
            this.l = Collections.emptyList();
            this.m = Collections.emptyList();
            this.o = Collections.emptyList();
            this.p = TypeTable.getDefaultInstance();
            this.q = Collections.emptyList();
            this.r = Contract.getDefaultInstance();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getContextReceiverType(int v) {
            return (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type)this.l.get(v);
        }

        public int getContextReceiverTypeCount() {
            return this.l.size();
        }

        public List getContextReceiverTypeIdList() {
            return this.m;
        }

        public List getContextReceiverTypeList() {
            return this.l;
        }

        public Contract getContract() {
            return this.r;
        }

        public static Function getDefaultInstance() {
            return Function.u;
        }

        public Function getDefaultInstanceForType() {
            return Function.u;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public MessageLite getDefaultInstanceForType() {
            return this.getDefaultInstanceForType();
        }

        public int getFlags() {
            return this.d;
        }

        public int getName() {
            return this.f;
        }

        public int getOldFlags() {
            return this.e;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser getParserForType() {
            return Function.PARSER;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getReceiverType() {
            return this.j;
        }

        public int getReceiverTypeId() {
            return this.k;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getReturnType() {
            return this.g;
        }

        public int getReturnTypeId() {
            return this.h;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int v1 = this.t;
            if(v1 != -1) {
                return v1;
            }
            int v2 = (this.c & 2) == 2 ? CodedOutputStream.computeInt32Size(1, this.e) : 0;
            if((this.c & 4) == 4) {
                v2 += CodedOutputStream.computeInt32Size(2, this.f);
            }
            if((this.c & 8) == 8) {
                v2 += CodedOutputStream.computeMessageSize(3, this.g);
            }
            for(int v3 = 0; v3 < this.i.size(); ++v3) {
                v2 += CodedOutputStream.computeMessageSize(4, ((MessageLite)this.i.get(v3)));
            }
            if((this.c & 0x20) == 0x20) {
                v2 += CodedOutputStream.computeMessageSize(5, this.j);
            }
            for(int v4 = 0; v4 < this.o.size(); ++v4) {
                v2 += CodedOutputStream.computeMessageSize(6, ((MessageLite)this.o.get(v4)));
            }
            if((this.c & 16) == 16) {
                v2 += CodedOutputStream.computeInt32Size(7, this.h);
            }
            if((this.c & 0x40) == 0x40) {
                v2 += CodedOutputStream.computeInt32Size(8, this.k);
            }
            if((this.c & 1) == 1) {
                v2 += CodedOutputStream.computeInt32Size(9, this.d);
            }
            for(int v5 = 0; v5 < this.l.size(); ++v5) {
                v2 += CodedOutputStream.computeMessageSize(10, ((MessageLite)this.l.get(v5)));
            }
            int v7 = 0;
            for(int v6 = 0; v6 < this.m.size(); ++v6) {
                v7 += CodedOutputStream.computeInt32SizeNoTag(((int)(((Integer)this.m.get(v6)))));
            }
            int v8 = this.getContextReceiverTypeIdList().isEmpty() ? v2 + v7 : v2 + v7 + 1 + CodedOutputStream.computeInt32SizeNoTag(v7);
            this.n = v7;
            if((this.c & 0x80) == 0x80) {
                v8 += CodedOutputStream.computeMessageSize(30, this.p);
            }
            int v9 = 0;
            for(int v = 0; v < this.q.size(); ++v) {
                v9 += CodedOutputStream.computeInt32SizeNoTag(((int)(((Integer)this.q.get(v)))));
            }
            int v10 = this.getVersionRequirementList().size() * 2 + (v8 + v9);
            if((this.c & 0x100) == 0x100) {
                v10 += CodedOutputStream.computeMessageSize(0x20, this.r);
            }
            int v11 = this.extensionsSerializedSize();
            int v12 = this.b.size() + (v11 + v10);
            this.t = v12;
            return v12;
        }

        public TypeParameter getTypeParameter(int v) {
            return (TypeParameter)this.i.get(v);
        }

        public int getTypeParameterCount() {
            return this.i.size();
        }

        public List getTypeParameterList() {
            return this.i;
        }

        public TypeTable getTypeTable() {
            return this.p;
        }

        public ValueParameter getValueParameter(int v) {
            return (ValueParameter)this.o.get(v);
        }

        public int getValueParameterCount() {
            return this.o.size();
        }

        public List getValueParameterList() {
            return this.o;
        }

        public List getVersionRequirementList() {
            return this.q;
        }

        public boolean hasContract() {
            return (this.c & 0x100) == 0x100;
        }

        public boolean hasFlags() {
            return (this.c & 1) == 1;
        }

        public boolean hasName() {
            return (this.c & 4) == 4;
        }

        public boolean hasOldFlags() {
            return (this.c & 2) == 2;
        }

        public boolean hasReceiverType() {
            return (this.c & 0x20) == 0x20;
        }

        public boolean hasReceiverTypeId() {
            return (this.c & 0x40) == 0x40;
        }

        public boolean hasReturnType() {
            return (this.c & 8) == 8;
        }

        public boolean hasReturnTypeId() {
            return (this.c & 16) == 16;
        }

        public boolean hasTypeTable() {
            return (this.c & 0x80) == 0x80;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            int v = this.s;
            if(v == 1) {
                return true;
            }
            if(v == 0) {
                return false;
            }
            if(!this.hasName()) {
                this.s = 0;
                return false;
            }
            if(this.hasReturnType() && !this.getReturnType().isInitialized()) {
                this.s = 0;
                return false;
            }
            for(int v1 = 0; v1 < this.getTypeParameterCount(); ++v1) {
                if(!this.getTypeParameter(v1).isInitialized()) {
                    this.s = 0;
                    return false;
                }
            }
            if(this.hasReceiverType() && !this.getReceiverType().isInitialized()) {
                this.s = 0;
                return false;
            }
            for(int v2 = 0; v2 < this.getContextReceiverTypeCount(); ++v2) {
                if(!this.getContextReceiverType(v2).isInitialized()) {
                    this.s = 0;
                    return false;
                }
            }
            for(int v3 = 0; v3 < this.getValueParameterCount(); ++v3) {
                if(!this.getValueParameter(v3).isInitialized()) {
                    this.s = 0;
                    return false;
                }
            }
            if(this.hasTypeTable() && !this.getTypeTable().isInitialized()) {
                this.s = 0;
                return false;
            }
            if(this.hasContract() && !this.getContract().isInitialized()) {
                this.s = 0;
                return false;
            }
            if(!this.extensionsAreInitialized()) {
                this.s = 0;
                return false;
            }
            this.s = 1;
            return true;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder newBuilder() {
            return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder newBuilder(Function protoBuf$Function0) {
            return Function.newBuilder().mergeFrom(protoBuf$Function0);
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder newBuilderForType() {
            return Function.newBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder newBuilderForType() {
            return this.newBuilderForType();
        }

        public static Function parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (Function)Function.PARSER.parseFrom(inputStream0, extensionRegistryLite0);
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder toBuilder() {
            return Function.newBuilder(this);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder toBuilder() {
            return this.toBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream0) throws IOException {
            this.getSerializedSize();
            ExtensionWriter generatedMessageLite$ExtendableMessage$ExtensionWriter0 = this.newExtensionWriter();
            if((this.c & 2) == 2) {
                codedOutputStream0.writeInt32(1, this.e);
            }
            if((this.c & 4) == 4) {
                codedOutputStream0.writeInt32(2, this.f);
            }
            if((this.c & 8) == 8) {
                codedOutputStream0.writeMessage(3, this.g);
            }
            for(int v1 = 0; v1 < this.i.size(); ++v1) {
                codedOutputStream0.writeMessage(4, ((MessageLite)this.i.get(v1)));
            }
            if((this.c & 0x20) == 0x20) {
                codedOutputStream0.writeMessage(5, this.j);
            }
            for(int v2 = 0; v2 < this.o.size(); ++v2) {
                codedOutputStream0.writeMessage(6, ((MessageLite)this.o.get(v2)));
            }
            if((this.c & 16) == 16) {
                codedOutputStream0.writeInt32(7, this.h);
            }
            if((this.c & 0x40) == 0x40) {
                codedOutputStream0.writeInt32(8, this.k);
            }
            if((this.c & 1) == 1) {
                codedOutputStream0.writeInt32(9, this.d);
            }
            for(int v3 = 0; v3 < this.l.size(); ++v3) {
                codedOutputStream0.writeMessage(10, ((MessageLite)this.l.get(v3)));
            }
            if(this.getContextReceiverTypeIdList().size() > 0) {
                codedOutputStream0.writeRawVarint32(90);
                codedOutputStream0.writeRawVarint32(this.n);
            }
            for(int v4 = 0; v4 < this.m.size(); ++v4) {
                codedOutputStream0.writeInt32NoTag(((int)(((Integer)this.m.get(v4)))));
            }
            if((this.c & 0x80) == 0x80) {
                codedOutputStream0.writeMessage(30, this.p);
            }
            for(int v = 0; v < this.q.size(); ++v) {
                codedOutputStream0.writeInt32(0x1F, ((int)(((Integer)this.q.get(v)))));
            }
            if((this.c & 0x100) == 0x100) {
                codedOutputStream0.writeMessage(0x20, this.r);
            }
            generatedMessageLite$ExtendableMessage$ExtensionWriter0.writeUntil(19000, codedOutputStream0);
            codedOutputStream0.writeRawBytes(this.b);
        }
    }

    public static enum MemberKind implements EnumLite {
        DECLARATION(0),
        FAKE_OVERRIDE(1),
        DELEGATION(2),
        SYNTHESIZED(3);

        public final int a;

        public MemberKind(int v1) {
            this.a = v1;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.Internal$EnumLite
        public final int getNumber() {
            return this.a;
        }

        public static MemberKind valueOf(int v) {
            switch(v) {
                case 0: {
                    return MemberKind.DECLARATION;
                }
                case 1: {
                    return MemberKind.FAKE_OVERRIDE;
                }
                case 2: {
                    return MemberKind.DELEGATION;
                }
                case 3: {
                    return MemberKind.SYNTHESIZED;
                }
                default: {
                    return null;
                }
            }
        }
    }

    public static enum Modality implements EnumLite {
        FINAL(0),
        OPEN(1),
        ABSTRACT(2),
        SEALED(3);

        public final int a;

        public Modality(int v1) {
            this.a = v1;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.Internal$EnumLite
        public final int getNumber() {
            return this.a;
        }

        public static Modality valueOf(int v) {
            switch(v) {
                case 0: {
                    return Modality.FINAL;
                }
                case 1: {
                    return Modality.OPEN;
                }
                case 2: {
                    return Modality.ABSTRACT;
                }
                case 3: {
                    return Modality.SEALED;
                }
                default: {
                    return null;
                }
            }
        }
    }

    public static final class Package extends ExtendableMessage implements ProtoBuf.PackageOrBuilder {
        public static final class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder extends ExtendableBuilder implements ProtoBuf.PackageOrBuilder {
            public int d;
            public List e;
            public List f;
            public List g;
            public TypeTable h;
            public VersionRequirementTable i;

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder() {
                this.e = Collections.emptyList();
                this.f = Collections.emptyList();
                this.g = Collections.emptyList();
                this.h = TypeTable.getDefaultInstance();
                this.i = VersionRequirementTable.getDefaultInstance();
            }

            public Package build() {
                Package protoBuf$Package0 = this.buildPartial();
                if(!protoBuf$Package0.isInitialized()) {
                    throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(protoBuf$Package0);
                }
                return protoBuf$Package0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite$Builder
            public MessageLite build() {
                return this.build();
            }

            public Package buildPartial() {
                Package protoBuf$Package0 = new Package(this);
                int v = this.d;
                int v1 = 1;
                if((v & 1) == 1) {
                    this.e = Collections.unmodifiableList(this.e);
                    this.d &= -2;
                }
                protoBuf$Package0.d = this.e;
                if((this.d & 2) == 2) {
                    this.f = Collections.unmodifiableList(this.f);
                    this.d &= -3;
                }
                protoBuf$Package0.e = this.f;
                if((this.d & 4) == 4) {
                    this.g = Collections.unmodifiableList(this.g);
                    this.d &= -5;
                }
                protoBuf$Package0.f = this.g;
                if((v & 8) != 8) {
                    v1 = 0;
                }
                protoBuf$Package0.g = this.h;
                if((v & 16) == 16) {
                    v1 |= 2;
                }
                protoBuf$Package0.h = this.i;
                protoBuf$Package0.c = v1;
                return protoBuf$Package0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public Object clone() throws CloneNotSupportedException {
                return this.clone();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder().mergeFrom(this.buildPartial());
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public ExtendableBuilder clone() {
                return this.clone();
            }

            public Package getDefaultInstanceForType() {
                return Package.getDefaultInstance();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public GeneratedMessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public MessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            public Function getFunction(int v) {
                return (Function)this.e.get(v);
            }

            public int getFunctionCount() {
                return this.e.size();
            }

            public Property getProperty(int v) {
                return (Property)this.f.get(v);
            }

            public int getPropertyCount() {
                return this.f.size();
            }

            public TypeAlias getTypeAlias(int v) {
                return (TypeAlias)this.g.get(v);
            }

            public int getTypeAliasCount() {
                return this.g.size();
            }

            public TypeTable getTypeTable() {
                return this.h;
            }

            public boolean hasTypeTable() {
                return (this.d & 8) == 8;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for(int v = 0; v < this.getFunctionCount(); ++v) {
                    if(!this.getFunction(v).isInitialized()) {
                        return false;
                    }
                }
                for(int v1 = 0; v1 < this.getPropertyCount(); ++v1) {
                    if(!this.getProperty(v1).isInitialized()) {
                        return false;
                    }
                }
                for(int v2 = 0; v2 < this.getTypeAliasCount(); ++v2) {
                    if(!this.getTypeAlias(v2).isInitialized()) {
                        return false;
                    }
                }
                return !this.hasTypeTable() || this.getTypeTable().isInitialized() ? this.extensionsAreInitialized() : false;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder mergeFrom(Package protoBuf$Package0) {
                if(protoBuf$Package0 == Package.getDefaultInstance()) {
                    return this;
                }
                if(!protoBuf$Package0.d.isEmpty()) {
                    if(this.e.isEmpty()) {
                        this.e = protoBuf$Package0.d;
                        this.d &= -2;
                    }
                    else {
                        if((this.d & 1) != 1) {
                            this.e = new ArrayList(this.e);
                            this.d |= 1;
                        }
                        this.e.addAll(protoBuf$Package0.d);
                    }
                }
                if(!protoBuf$Package0.e.isEmpty()) {
                    if(this.f.isEmpty()) {
                        this.f = protoBuf$Package0.e;
                        this.d &= -3;
                    }
                    else {
                        if((this.d & 2) != 2) {
                            this.f = new ArrayList(this.f);
                            this.d |= 2;
                        }
                        this.f.addAll(protoBuf$Package0.e);
                    }
                }
                if(!protoBuf$Package0.f.isEmpty()) {
                    if(this.g.isEmpty()) {
                        this.g = protoBuf$Package0.f;
                        this.d &= -5;
                    }
                    else {
                        if((this.d & 4) != 4) {
                            this.g = new ArrayList(this.g);
                            this.d |= 4;
                        }
                        this.g.addAll(protoBuf$Package0.f);
                    }
                }
                if(protoBuf$Package0.hasTypeTable()) {
                    this.mergeTypeTable(protoBuf$Package0.getTypeTable());
                }
                if(protoBuf$Package0.hasVersionRequirementTable()) {
                    this.mergeVersionRequirementTable(protoBuf$Package0.getVersionRequirementTable());
                }
                this.mergeExtensionFields(protoBuf$Package0);
                this.setUnknownFields(this.getUnknownFields().concat(protoBuf$Package0.b));
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                Package protoBuf$Package1;
                Package protoBuf$Package0;
                try {
                    try {
                        protoBuf$Package0 = null;
                        protoBuf$Package1 = (Package)Package.PARSER.parsePartialFrom(codedInputStream0, extensionRegistryLite0);
                        goto label_13;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                        Package protoBuf$Package2 = (Package)invalidProtocolBufferException0.getUnfinishedMessage();
                        try {
                            throw invalidProtocolBufferException0;
                        }
                        catch(Throwable throwable0) {
                            protoBuf$Package0 = protoBuf$Package2;
                        }
                    }
                }
                catch(Throwable throwable0) {
                }
                if(protoBuf$Package0 != null) {
                    this.mergeFrom(protoBuf$Package0);
                }
                throw throwable0;
            label_13:
                if(protoBuf$Package1 != null) {
                    this.mergeFrom(protoBuf$Package1);
                }
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedMessageLite0) {
                return this.mergeFrom(((Package)generatedMessageLite0));
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder mergeTypeTable(TypeTable protoBuf$TypeTable0) {
                this.h = (this.d & 8) != 8 || this.h == TypeTable.getDefaultInstance() ? protoBuf$TypeTable0 : TypeTable.newBuilder(this.h).mergeFrom(protoBuf$TypeTable0).buildPartial();
                this.d |= 8;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder mergeVersionRequirementTable(VersionRequirementTable protoBuf$VersionRequirementTable0) {
                this.i = (this.d & 16) != 16 || this.i == VersionRequirementTable.getDefaultInstance() ? protoBuf$VersionRequirementTable0 : VersionRequirementTable.newBuilder(this.i).mergeFrom(protoBuf$VersionRequirementTable0).buildPartial();
                this.d |= 16;
                return this;
            }
        }

        public static Parser PARSER;
        public final ByteString b;
        public int c;
        public List d;
        public List e;
        public List f;
        public TypeTable g;
        public VersionRequirementTable h;
        public byte i;
        public int j;
        public static final Package k;

        static {
            Package.PARSER = new k();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/AbstractParser;-><init>()V
            Package protoBuf$Package0 = new Package();
            Package.k = protoBuf$Package0;
            protoBuf$Package0.d = Collections.emptyList();
            protoBuf$Package0.e = Collections.emptyList();
            protoBuf$Package0.f = Collections.emptyList();
            protoBuf$Package0.g = TypeTable.getDefaultInstance();
            protoBuf$Package0.h = VersionRequirementTable.getDefaultInstance();
        }

        public Package() {
            this.i = -1;
            this.j = -1;
            this.b = ByteString.EMPTY;
        }

        public Package(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder protoBuf$Package$Builder0) {
            super(protoBuf$Package$Builder0);
            this.i = -1;
            this.j = -1;
            this.b = protoBuf$Package$Builder0.getUnknownFields();
        }

        public Package(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) {
            this.i = -1;
            this.j = -1;
            this.d = Collections.emptyList();
            this.e = Collections.emptyList();
            this.f = Collections.emptyList();
            this.g = TypeTable.getDefaultInstance();
            this.h = VersionRequirementTable.getDefaultInstance();
            Output byteString$Output0 = ByteString.newOutput();
            CodedOutputStream codedOutputStream0 = CodedOutputStream.newInstance(byteString$Output0, 1);
            int v = 0;
            boolean z = false;
            while(!z) {
                try {
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder protoBuf$TypeTable$Builder0 = null;
                    int v1 = codedInputStream0.readTag();
                alab1:
                    switch(v1) {
                        case 0: {
                            z = true;
                            continue;
                        }
                        case 26: {
                            goto label_47;
                        }
                        case 34: {
                            goto label_52;
                        }
                        default: {
                            if(v1 == 42) {
                                goto label_40;
                            }
                            else {
                                switch(v1) {
                                    case 0xF2: {
                                        if((this.c & 1) == 1) {
                                            protoBuf$TypeTable$Builder0 = this.g.toBuilder();
                                        }
                                        TypeTable protoBuf$TypeTable0 = (TypeTable)codedInputStream0.readMessage(TypeTable.PARSER, extensionRegistryLite0);
                                        this.g = protoBuf$TypeTable0;
                                        if(protoBuf$TypeTable$Builder0 != null) {
                                            protoBuf$TypeTable$Builder0.mergeFrom(protoBuf$TypeTable0);
                                            this.g = protoBuf$TypeTable$Builder0.buildPartial();
                                        }
                                        this.c |= 1;
                                        break alab1;
                                    }
                                    case 0x102: {
                                        if((this.c & 2) == 2) {
                                            protoBuf$TypeTable$Builder0 = this.h.toBuilder();
                                        }
                                        VersionRequirementTable protoBuf$VersionRequirementTable0 = (VersionRequirementTable)codedInputStream0.readMessage(VersionRequirementTable.PARSER, extensionRegistryLite0);
                                        this.h = protoBuf$VersionRequirementTable0;
                                        if(protoBuf$TypeTable$Builder0 != null) {
                                            ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder)protoBuf$TypeTable$Builder0).mergeFrom(protoBuf$VersionRequirementTable0);
                                            this.h = ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder)protoBuf$TypeTable$Builder0).buildPartial();
                                        }
                                        this.c |= 2;
                                        break alab1;
                                    }
                                    default: {
                                        if(this.parseUnknownField(codedInputStream0, codedOutputStream0, extensionRegistryLite0, v1)) {
                                            break alab1;
                                        }
                                    }
                                }
                            }
                            z = true;
                            continue;
                        }
                    }
                }
                catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                    throw invalidProtocolBufferException0.setUnfinishedMessage(this);
                }
                catch(IOException iOException0) {
                    throw new InvalidProtocolBufferException(iOException0.getMessage()).setUnfinishedMessage(this);
                }
                catch(Throwable throwable0) {
                    goto label_64;
                }
                continue;
                try {
                    try {
                    label_40:
                        if((v & 4) != 4) {
                            this.f = new ArrayList();
                            v |= 4;
                        }
                        this.f.add(codedInputStream0.readMessage(TypeAlias.PARSER, extensionRegistryLite0));
                        continue;
                    label_47:
                        if((v & 1) != 1) {
                            this.d = new ArrayList();
                            v |= 1;
                        }
                        this.d.add(codedInputStream0.readMessage(Function.PARSER, extensionRegistryLite0));
                        continue;
                    label_52:
                        if((v & 2) != 2) {
                            this.e = new ArrayList();
                            v |= 2;
                        }
                        this.e.add(codedInputStream0.readMessage(Property.PARSER, extensionRegistryLite0));
                        continue;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                    }
                    catch(IOException iOException0) {
                        throw new InvalidProtocolBufferException(iOException0.getMessage()).setUnfinishedMessage(this);
                    }
                    throw invalidProtocolBufferException0.setUnfinishedMessage(this);
                }
                catch(Throwable throwable0) {
                }
            label_64:
                if((v & 1) == 1) {
                    this.d = Collections.unmodifiableList(this.d);
                }
                if((v & 2) == 2) {
                    this.e = Collections.unmodifiableList(this.e);
                }
                if((v & 4) == 4) {
                    this.f = Collections.unmodifiableList(this.f);
                }
                try {
                    codedOutputStream0.flush();
                    goto label_75;
                }
                catch(IOException unused_ex) {
                    goto label_75;
                }
                catch(Throwable throwable1) {
                }
                this.b = byteString$Output0.toByteString();
                throw throwable1;
            label_75:
                this.b = byteString$Output0.toByteString();
                this.makeExtensionsImmutable();
                throw throwable0;
            }
            if((v & 1) == 1) {
                this.d = Collections.unmodifiableList(this.d);
            }
            if((v & 2) == 2) {
                this.e = Collections.unmodifiableList(this.e);
            }
            if((v & 4) == 4) {
                this.f = Collections.unmodifiableList(this.f);
            }
            try {
                codedOutputStream0.flush();
                goto label_89;
            }
            catch(IOException unused_ex) {
                goto label_89;
            }
            catch(Throwable throwable2) {
            }
            this.b = byteString$Output0.toByteString();
            throw throwable2;
        label_89:
            this.b = byteString$Output0.toByteString();
            this.makeExtensionsImmutable();
        }

        public static Package getDefaultInstance() {
            return Package.k;
        }

        public Package getDefaultInstanceForType() {
            return Package.k;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public MessageLite getDefaultInstanceForType() {
            return this.getDefaultInstanceForType();
        }

        public Function getFunction(int v) {
            return (Function)this.d.get(v);
        }

        public int getFunctionCount() {
            return this.d.size();
        }

        public List getFunctionList() {
            return this.d;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser getParserForType() {
            return Package.PARSER;
        }

        public Property getProperty(int v) {
            return (Property)this.e.get(v);
        }

        public int getPropertyCount() {
            return this.e.size();
        }

        public List getPropertyList() {
            return this.e;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int v = this.j;
            if(v != -1) {
                return v;
            }
            int v3 = 0;
            for(int v2 = 0; v2 < this.d.size(); ++v2) {
                v3 += CodedOutputStream.computeMessageSize(3, ((MessageLite)this.d.get(v2)));
            }
            for(int v4 = 0; v4 < this.e.size(); ++v4) {
                v3 += CodedOutputStream.computeMessageSize(4, ((MessageLite)this.e.get(v4)));
            }
            for(int v1 = 0; v1 < this.f.size(); ++v1) {
                v3 += CodedOutputStream.computeMessageSize(5, ((MessageLite)this.f.get(v1)));
            }
            if((this.c & 1) == 1) {
                v3 += CodedOutputStream.computeMessageSize(30, this.g);
            }
            if((this.c & 2) == 2) {
                v3 += CodedOutputStream.computeMessageSize(0x20, this.h);
            }
            int v5 = this.extensionsSerializedSize();
            int v6 = this.b.size() + (v5 + v3);
            this.j = v6;
            return v6;
        }

        public TypeAlias getTypeAlias(int v) {
            return (TypeAlias)this.f.get(v);
        }

        public int getTypeAliasCount() {
            return this.f.size();
        }

        public List getTypeAliasList() {
            return this.f;
        }

        public TypeTable getTypeTable() {
            return this.g;
        }

        public VersionRequirementTable getVersionRequirementTable() {
            return this.h;
        }

        public boolean hasTypeTable() {
            return (this.c & 1) == 1;
        }

        public boolean hasVersionRequirementTable() {
            return (this.c & 2) == 2;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            int v = this.i;
            if(v == 1) {
                return true;
            }
            if(v == 0) {
                return false;
            }
            for(int v1 = 0; v1 < this.getFunctionCount(); ++v1) {
                if(!this.getFunction(v1).isInitialized()) {
                    this.i = 0;
                    return false;
                }
            }
            for(int v2 = 0; v2 < this.getPropertyCount(); ++v2) {
                if(!this.getProperty(v2).isInitialized()) {
                    this.i = 0;
                    return false;
                }
            }
            for(int v3 = 0; v3 < this.getTypeAliasCount(); ++v3) {
                if(!this.getTypeAlias(v3).isInitialized()) {
                    this.i = 0;
                    return false;
                }
            }
            if(this.hasTypeTable() && !this.getTypeTable().isInitialized()) {
                this.i = 0;
                return false;
            }
            if(!this.extensionsAreInitialized()) {
                this.i = 0;
                return false;
            }
            this.i = 1;
            return true;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder newBuilder() {
            return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder newBuilder(Package protoBuf$Package0) {
            return Package.newBuilder().mergeFrom(protoBuf$Package0);
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder newBuilderForType() {
            return Package.newBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder newBuilderForType() {
            return this.newBuilderForType();
        }

        public static Package parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (Package)Package.PARSER.parseFrom(inputStream0, extensionRegistryLite0);
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder toBuilder() {
            return Package.newBuilder(this);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder toBuilder() {
            return this.toBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream0) throws IOException {
            this.getSerializedSize();
            ExtensionWriter generatedMessageLite$ExtendableMessage$ExtensionWriter0 = this.newExtensionWriter();
            for(int v1 = 0; v1 < this.d.size(); ++v1) {
                codedOutputStream0.writeMessage(3, ((MessageLite)this.d.get(v1)));
            }
            for(int v2 = 0; v2 < this.e.size(); ++v2) {
                codedOutputStream0.writeMessage(4, ((MessageLite)this.e.get(v2)));
            }
            for(int v = 0; v < this.f.size(); ++v) {
                codedOutputStream0.writeMessage(5, ((MessageLite)this.f.get(v)));
            }
            if((this.c & 1) == 1) {
                codedOutputStream0.writeMessage(30, this.g);
            }
            if((this.c & 2) == 2) {
                codedOutputStream0.writeMessage(0x20, this.h);
            }
            generatedMessageLite$ExtendableMessage$ExtensionWriter0.writeUntil(200, codedOutputStream0);
            codedOutputStream0.writeRawBytes(this.b);
        }
    }

    public static final class PackageFragment extends ExtendableMessage implements ProtoBuf.PackageFragmentOrBuilder {
        public static final class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder extends ExtendableBuilder implements ProtoBuf.PackageFragmentOrBuilder {
            public int d;
            public StringTable e;
            public QualifiedNameTable f;
            public Package g;
            public List h;

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder() {
                this.e = StringTable.getDefaultInstance();
                this.f = QualifiedNameTable.getDefaultInstance();
                this.g = Package.getDefaultInstance();
                this.h = Collections.emptyList();
            }

            public PackageFragment build() {
                PackageFragment protoBuf$PackageFragment0 = this.buildPartial();
                if(!protoBuf$PackageFragment0.isInitialized()) {
                    throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(protoBuf$PackageFragment0);
                }
                return protoBuf$PackageFragment0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite$Builder
            public MessageLite build() {
                return this.build();
            }

            public PackageFragment buildPartial() {
                PackageFragment protoBuf$PackageFragment0 = new PackageFragment(this);
                int v = this.d;
                int v1 = (v & 1) == 1 ? 1 : 0;
                protoBuf$PackageFragment0.d = this.e;
                if((v & 2) == 2) {
                    v1 |= 2;
                }
                protoBuf$PackageFragment0.e = this.f;
                if((v & 4) == 4) {
                    v1 |= 4;
                }
                protoBuf$PackageFragment0.f = this.g;
                if((v & 8) == 8) {
                    this.h = Collections.unmodifiableList(this.h);
                    this.d &= -9;
                }
                protoBuf$PackageFragment0.g = this.h;
                protoBuf$PackageFragment0.c = v1;
                return protoBuf$PackageFragment0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public Object clone() throws CloneNotSupportedException {
                return this.clone();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder().mergeFrom(this.buildPartial());
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public ExtendableBuilder clone() {
                return this.clone();
            }

            public Class getClass_(int v) {
                return (Class)this.h.get(v);
            }

            public int getClass_Count() {
                return this.h.size();
            }

            public PackageFragment getDefaultInstanceForType() {
                return PackageFragment.getDefaultInstance();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public GeneratedMessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public MessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            public Package getPackage() {
                return this.g;
            }

            public QualifiedNameTable getQualifiedNames() {
                return this.f;
            }

            public boolean hasPackage() {
                return (this.d & 4) == 4;
            }

            public boolean hasQualifiedNames() {
                return (this.d & 2) == 2;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if(this.hasQualifiedNames() && !this.getQualifiedNames().isInitialized()) {
                    return false;
                }
                if(this.hasPackage() && !this.getPackage().isInitialized()) {
                    return false;
                }
                for(int v = 0; v < this.getClass_Count(); ++v) {
                    if(!this.getClass_(v).isInitialized()) {
                        return false;
                    }
                }
                return this.extensionsAreInitialized();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder mergeFrom(PackageFragment protoBuf$PackageFragment0) {
                if(protoBuf$PackageFragment0 == PackageFragment.getDefaultInstance()) {
                    return this;
                }
                if(protoBuf$PackageFragment0.hasStrings()) {
                    this.mergeStrings(protoBuf$PackageFragment0.getStrings());
                }
                if(protoBuf$PackageFragment0.hasQualifiedNames()) {
                    this.mergeQualifiedNames(protoBuf$PackageFragment0.getQualifiedNames());
                }
                if(protoBuf$PackageFragment0.hasPackage()) {
                    this.mergePackage(protoBuf$PackageFragment0.getPackage());
                }
                if(!protoBuf$PackageFragment0.g.isEmpty()) {
                    if(this.h.isEmpty()) {
                        this.h = protoBuf$PackageFragment0.g;
                        this.d &= -9;
                    }
                    else {
                        if((this.d & 8) != 8) {
                            this.h = new ArrayList(this.h);
                            this.d |= 8;
                        }
                        this.h.addAll(protoBuf$PackageFragment0.g);
                    }
                }
                this.mergeExtensionFields(protoBuf$PackageFragment0);
                this.setUnknownFields(this.getUnknownFields().concat(protoBuf$PackageFragment0.b));
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                PackageFragment protoBuf$PackageFragment1;
                PackageFragment protoBuf$PackageFragment0;
                try {
                    try {
                        protoBuf$PackageFragment0 = null;
                        protoBuf$PackageFragment1 = (PackageFragment)PackageFragment.PARSER.parsePartialFrom(codedInputStream0, extensionRegistryLite0);
                        goto label_13;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                        PackageFragment protoBuf$PackageFragment2 = (PackageFragment)invalidProtocolBufferException0.getUnfinishedMessage();
                        try {
                            throw invalidProtocolBufferException0;
                        }
                        catch(Throwable throwable0) {
                            protoBuf$PackageFragment0 = protoBuf$PackageFragment2;
                        }
                    }
                }
                catch(Throwable throwable0) {
                }
                if(protoBuf$PackageFragment0 != null) {
                    this.mergeFrom(protoBuf$PackageFragment0);
                }
                throw throwable0;
            label_13:
                if(protoBuf$PackageFragment1 != null) {
                    this.mergeFrom(protoBuf$PackageFragment1);
                }
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedMessageLite0) {
                return this.mergeFrom(((PackageFragment)generatedMessageLite0));
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder mergePackage(Package protoBuf$Package0) {
                this.g = (this.d & 4) != 4 || this.g == Package.getDefaultInstance() ? protoBuf$Package0 : Package.newBuilder(this.g).mergeFrom(protoBuf$Package0).buildPartial();
                this.d |= 4;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder mergeQualifiedNames(QualifiedNameTable protoBuf$QualifiedNameTable0) {
                this.f = (this.d & 2) != 2 || this.f == QualifiedNameTable.getDefaultInstance() ? protoBuf$QualifiedNameTable0 : QualifiedNameTable.newBuilder(this.f).mergeFrom(protoBuf$QualifiedNameTable0).buildPartial();
                this.d |= 2;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder mergeStrings(StringTable protoBuf$StringTable0) {
                this.e = (this.d & 1) != 1 || this.e == StringTable.getDefaultInstance() ? protoBuf$StringTable0 : StringTable.newBuilder(this.e).mergeFrom(protoBuf$StringTable0).buildPartial();
                this.d |= 1;
                return this;
            }
        }

        public static Parser PARSER;
        public final ByteString b;
        public int c;
        public StringTable d;
        public QualifiedNameTable e;
        public Package f;
        public List g;
        public byte h;
        public int i;
        public static final PackageFragment j;

        static {
            PackageFragment.PARSER = new l();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/AbstractParser;-><init>()V
            PackageFragment protoBuf$PackageFragment0 = new PackageFragment();
            PackageFragment.j = protoBuf$PackageFragment0;
            protoBuf$PackageFragment0.d = StringTable.getDefaultInstance();
            protoBuf$PackageFragment0.e = QualifiedNameTable.getDefaultInstance();
            protoBuf$PackageFragment0.f = Package.getDefaultInstance();
            protoBuf$PackageFragment0.g = Collections.emptyList();
        }

        public PackageFragment() {
            this.h = -1;
            this.i = -1;
            this.b = ByteString.EMPTY;
        }

        public PackageFragment(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder protoBuf$PackageFragment$Builder0) {
            super(protoBuf$PackageFragment$Builder0);
            this.h = -1;
            this.i = -1;
            this.b = protoBuf$PackageFragment$Builder0.getUnknownFields();
        }

        public PackageFragment(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) {
            this.h = -1;
            this.i = -1;
            this.d = StringTable.getDefaultInstance();
            this.e = QualifiedNameTable.getDefaultInstance();
            this.f = Package.getDefaultInstance();
            this.g = Collections.emptyList();
            Output byteString$Output0 = ByteString.newOutput();
            CodedOutputStream codedOutputStream0 = CodedOutputStream.newInstance(byteString$Output0, 1);
            int v = 0;
            boolean z = false;
            while(!z) {
                try {
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder protoBuf$StringTable$Builder0 = null;
                    int v1 = codedInputStream0.readTag();
                    if(v1 != 0) {
                        switch(v1) {
                            case 10: {
                                if((this.c & 1) == 1) {
                                    protoBuf$StringTable$Builder0 = this.d.toBuilder();
                                }
                                StringTable protoBuf$StringTable0 = (StringTable)codedInputStream0.readMessage(StringTable.PARSER, extensionRegistryLite0);
                                this.d = protoBuf$StringTable0;
                                if(protoBuf$StringTable$Builder0 != null) {
                                    protoBuf$StringTable$Builder0.mergeFrom(protoBuf$StringTable0);
                                    this.d = protoBuf$StringTable$Builder0.buildPartial();
                                }
                                this.c |= 1;
                                continue;
                            }
                            case 18: {
                                if((this.c & 2) == 2) {
                                    protoBuf$StringTable$Builder0 = this.e.toBuilder();
                                }
                                QualifiedNameTable protoBuf$QualifiedNameTable0 = (QualifiedNameTable)codedInputStream0.readMessage(QualifiedNameTable.PARSER, extensionRegistryLite0);
                                this.e = protoBuf$QualifiedNameTable0;
                                if(protoBuf$StringTable$Builder0 != null) {
                                    ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder)protoBuf$StringTable$Builder0).mergeFrom(protoBuf$QualifiedNameTable0);
                                    this.e = ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder)protoBuf$StringTable$Builder0).buildPartial();
                                }
                                this.c |= 2;
                                continue;
                            }
                            case 26: {
                                if((this.c & 4) == 4) {
                                    protoBuf$StringTable$Builder0 = this.f.toBuilder();
                                }
                                Package protoBuf$Package0 = (Package)codedInputStream0.readMessage(Package.PARSER, extensionRegistryLite0);
                                this.f = protoBuf$Package0;
                                if(protoBuf$StringTable$Builder0 != null) {
                                    ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder)protoBuf$StringTable$Builder0).mergeFrom(protoBuf$Package0);
                                    this.f = ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder)protoBuf$StringTable$Builder0).buildPartial();
                                }
                                this.c |= 4;
                                continue;
                            }
                            case 34: {
                                if((v & 8) != 8) {
                                    this.g = new ArrayList();
                                    v = 8;
                                }
                                this.g.add(codedInputStream0.readMessage(Class.PARSER, extensionRegistryLite0));
                                continue;
                            }
                            default: {
                                if(this.parseUnknownField(codedInputStream0, codedOutputStream0, extensionRegistryLite0, v1)) {
                                    continue;
                                }
                            }
                        }
                    }
                    try {
                        try {
                            z = true;
                            continue;
                        }
                        catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                        }
                        catch(IOException iOException0) {
                            throw new InvalidProtocolBufferException(iOException0.getMessage()).setUnfinishedMessage(this);
                        }
                        throw invalidProtocolBufferException0.setUnfinishedMessage(this);
                    }
                    catch(Throwable throwable0) {
                    }
                }
                catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                    throw invalidProtocolBufferException0.setUnfinishedMessage(this);
                }
                catch(IOException iOException0) {
                    throw new InvalidProtocolBufferException(iOException0.getMessage()).setUnfinishedMessage(this);
                }
                catch(Throwable throwable0) {
                }
                if((v & 8) == 8) {
                    this.g = Collections.unmodifiableList(this.g);
                }
                try {
                    codedOutputStream0.flush();
                    goto label_70;
                }
                catch(IOException unused_ex) {
                    goto label_70;
                }
                catch(Throwable throwable1) {
                }
                this.b = byteString$Output0.toByteString();
                throw throwable1;
            label_70:
                this.b = byteString$Output0.toByteString();
                this.makeExtensionsImmutable();
                throw throwable0;
            }
            if((v & 8) == 8) {
                this.g = Collections.unmodifiableList(this.g);
            }
            try {
                codedOutputStream0.flush();
                goto label_80;
            }
            catch(IOException unused_ex) {
                goto label_80;
            }
            catch(Throwable throwable2) {
            }
            this.b = byteString$Output0.toByteString();
            throw throwable2;
        label_80:
            this.b = byteString$Output0.toByteString();
            this.makeExtensionsImmutable();
        }

        public Class getClass_(int v) {
            return (Class)this.g.get(v);
        }

        public int getClass_Count() {
            return this.g.size();
        }

        public List getClass_List() {
            return this.g;
        }

        public static PackageFragment getDefaultInstance() {
            return PackageFragment.j;
        }

        public PackageFragment getDefaultInstanceForType() {
            return PackageFragment.j;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public MessageLite getDefaultInstanceForType() {
            return this.getDefaultInstanceForType();
        }

        public Package getPackage() {
            return this.f;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser getParserForType() {
            return PackageFragment.PARSER;
        }

        public QualifiedNameTable getQualifiedNames() {
            return this.e;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int v1 = this.i;
            if(v1 != -1) {
                return v1;
            }
            int v2 = (this.c & 1) == 1 ? CodedOutputStream.computeMessageSize(1, this.d) : 0;
            if((this.c & 2) == 2) {
                v2 += CodedOutputStream.computeMessageSize(2, this.e);
            }
            if((this.c & 4) == 4) {
                v2 += CodedOutputStream.computeMessageSize(3, this.f);
            }
            for(int v = 0; v < this.g.size(); ++v) {
                v2 += CodedOutputStream.computeMessageSize(4, ((MessageLite)this.g.get(v)));
            }
            int v3 = this.extensionsSerializedSize();
            int v4 = this.b.size() + (v3 + v2);
            this.i = v4;
            return v4;
        }

        public StringTable getStrings() {
            return this.d;
        }

        public boolean hasPackage() {
            return (this.c & 4) == 4;
        }

        public boolean hasQualifiedNames() {
            return (this.c & 2) == 2;
        }

        public boolean hasStrings() {
            return (this.c & 1) == 1;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            int v = this.h;
            if(v == 1) {
                return true;
            }
            if(v == 0) {
                return false;
            }
            if(this.hasQualifiedNames() && !this.getQualifiedNames().isInitialized()) {
                this.h = 0;
                return false;
            }
            if(this.hasPackage() && !this.getPackage().isInitialized()) {
                this.h = 0;
                return false;
            }
            for(int v1 = 0; v1 < this.getClass_Count(); ++v1) {
                if(!this.getClass_(v1).isInitialized()) {
                    this.h = 0;
                    return false;
                }
            }
            if(!this.extensionsAreInitialized()) {
                this.h = 0;
                return false;
            }
            this.h = 1;
            return true;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder newBuilder() {
            return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder newBuilder(PackageFragment protoBuf$PackageFragment0) {
            return PackageFragment.newBuilder().mergeFrom(protoBuf$PackageFragment0);
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder newBuilderForType() {
            return PackageFragment.newBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder newBuilderForType() {
            return this.newBuilderForType();
        }

        public static PackageFragment parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (PackageFragment)PackageFragment.PARSER.parseFrom(inputStream0, extensionRegistryLite0);
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder toBuilder() {
            return PackageFragment.newBuilder(this);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder toBuilder() {
            return this.toBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream0) throws IOException {
            this.getSerializedSize();
            ExtensionWriter generatedMessageLite$ExtendableMessage$ExtensionWriter0 = this.newExtensionWriter();
            if((this.c & 1) == 1) {
                codedOutputStream0.writeMessage(1, this.d);
            }
            if((this.c & 2) == 2) {
                codedOutputStream0.writeMessage(2, this.e);
            }
            if((this.c & 4) == 4) {
                codedOutputStream0.writeMessage(3, this.f);
            }
            for(int v = 0; v < this.g.size(); ++v) {
                codedOutputStream0.writeMessage(4, ((MessageLite)this.g.get(v)));
            }
            generatedMessageLite$ExtendableMessage$ExtensionWriter0.writeUntil(200, codedOutputStream0);
            codedOutputStream0.writeRawBytes(this.b);
        }
    }

    public static final class Property extends ExtendableMessage implements ProtoBuf.PropertyOrBuilder {
        public static final class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder extends ExtendableBuilder implements ProtoBuf.PropertyOrBuilder {
            public int d;
            public int e;
            public int f;
            public int g;
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type h;
            public int i;
            public List j;
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type k;
            public int l;
            public List m;
            public List n;
            public ValueParameter o;
            public int p;
            public int q;
            public List r;

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder() {
                this.e = 0x206;
                this.f = 0x806;
                this.h = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
                this.j = Collections.emptyList();
                this.k = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
                this.m = Collections.emptyList();
                this.n = Collections.emptyList();
                this.o = ValueParameter.getDefaultInstance();
                this.r = Collections.emptyList();
            }

            public Property build() {
                Property protoBuf$Property0 = this.buildPartial();
                if(!protoBuf$Property0.isInitialized()) {
                    throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(protoBuf$Property0);
                }
                return protoBuf$Property0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite$Builder
            public MessageLite build() {
                return this.build();
            }

            public Property buildPartial() {
                Property protoBuf$Property0 = new Property(this);
                int v = this.d;
                int v1 = (v & 1) == 1 ? 1 : 0;
                protoBuf$Property0.d = this.e;
                if((v & 2) == 2) {
                    v1 |= 2;
                }
                protoBuf$Property0.e = this.f;
                if((v & 4) == 4) {
                    v1 |= 4;
                }
                protoBuf$Property0.f = this.g;
                if((v & 8) == 8) {
                    v1 |= 8;
                }
                protoBuf$Property0.g = this.h;
                if((v & 16) == 16) {
                    v1 |= 16;
                }
                protoBuf$Property0.h = this.i;
                if((v & 0x20) == 0x20) {
                    this.j = Collections.unmodifiableList(this.j);
                    this.d &= -33;
                }
                protoBuf$Property0.i = this.j;
                if((v & 0x40) == 0x40) {
                    v1 |= 0x20;
                }
                protoBuf$Property0.j = this.k;
                if((v & 0x80) == 0x80) {
                    v1 |= 0x40;
                }
                protoBuf$Property0.k = this.l;
                if((this.d & 0x100) == 0x100) {
                    this.m = Collections.unmodifiableList(this.m);
                    this.d &= 0xFFFFFEFF;
                }
                protoBuf$Property0.l = this.m;
                if((this.d & 0x200) == 0x200) {
                    this.n = Collections.unmodifiableList(this.n);
                    this.d &= 0xFFFFFDFF;
                }
                protoBuf$Property0.m = this.n;
                if((v & 0x400) == 0x400) {
                    v1 |= 0x80;
                }
                protoBuf$Property0.o = this.o;
                if((v & 0x800) == 0x800) {
                    v1 |= 0x100;
                }
                protoBuf$Property0.p = this.p;
                if((v & 0x1000) == 0x1000) {
                    v1 |= 0x200;
                }
                protoBuf$Property0.q = this.q;
                if((this.d & 0x2000) == 0x2000) {
                    this.r = Collections.unmodifiableList(this.r);
                    this.d &= 0xFFFFDFFF;
                }
                protoBuf$Property0.r = this.r;
                protoBuf$Property0.c = v1;
                return protoBuf$Property0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public Object clone() throws CloneNotSupportedException {
                return this.clone();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder().mergeFrom(this.buildPartial());
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public ExtendableBuilder clone() {
                return this.clone();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getContextReceiverType(int v) {
                return (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type)this.m.get(v);
            }

            public int getContextReceiverTypeCount() {
                return this.m.size();
            }

            public Property getDefaultInstanceForType() {
                return Property.getDefaultInstance();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public GeneratedMessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public MessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getReceiverType() {
                return this.k;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getReturnType() {
                return this.h;
            }

            public ValueParameter getSetterValueParameter() {
                return this.o;
            }

            public TypeParameter getTypeParameter(int v) {
                return (TypeParameter)this.j.get(v);
            }

            public int getTypeParameterCount() {
                return this.j.size();
            }

            public boolean hasName() {
                return (this.d & 4) == 4;
            }

            public boolean hasReceiverType() {
                return (this.d & 0x40) == 0x40;
            }

            public boolean hasReturnType() {
                return (this.d & 8) == 8;
            }

            public boolean hasSetterValueParameter() {
                return (this.d & 0x400) == 0x400;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if(!this.hasName()) {
                    return false;
                }
                if(this.hasReturnType() && !this.getReturnType().isInitialized()) {
                    return false;
                }
                for(int v = 0; v < this.getTypeParameterCount(); ++v) {
                    if(!this.getTypeParameter(v).isInitialized()) {
                        return false;
                    }
                }
                if(this.hasReceiverType() && !this.getReceiverType().isInitialized()) {
                    return false;
                }
                for(int v1 = 0; v1 < this.getContextReceiverTypeCount(); ++v1) {
                    if(!this.getContextReceiverType(v1).isInitialized()) {
                        return false;
                    }
                }
                return !this.hasSetterValueParameter() || this.getSetterValueParameter().isInitialized() ? this.extensionsAreInitialized() : false;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder mergeFrom(Property protoBuf$Property0) {
                if(protoBuf$Property0 == Property.getDefaultInstance()) {
                    return this;
                }
                if(protoBuf$Property0.hasFlags()) {
                    this.setFlags(protoBuf$Property0.getFlags());
                }
                if(protoBuf$Property0.hasOldFlags()) {
                    this.setOldFlags(protoBuf$Property0.getOldFlags());
                }
                if(protoBuf$Property0.hasName()) {
                    this.setName(protoBuf$Property0.getName());
                }
                if(protoBuf$Property0.hasReturnType()) {
                    this.mergeReturnType(protoBuf$Property0.getReturnType());
                }
                if(protoBuf$Property0.hasReturnTypeId()) {
                    this.setReturnTypeId(protoBuf$Property0.getReturnTypeId());
                }
                if(!protoBuf$Property0.i.isEmpty()) {
                    if(this.j.isEmpty()) {
                        this.j = protoBuf$Property0.i;
                        this.d &= -33;
                    }
                    else {
                        if((this.d & 0x20) != 0x20) {
                            this.j = new ArrayList(this.j);
                            this.d |= 0x20;
                        }
                        this.j.addAll(protoBuf$Property0.i);
                    }
                }
                if(protoBuf$Property0.hasReceiverType()) {
                    this.mergeReceiverType(protoBuf$Property0.getReceiverType());
                }
                if(protoBuf$Property0.hasReceiverTypeId()) {
                    this.setReceiverTypeId(protoBuf$Property0.getReceiverTypeId());
                }
                if(!protoBuf$Property0.l.isEmpty()) {
                    if(this.m.isEmpty()) {
                        this.m = protoBuf$Property0.l;
                        this.d &= 0xFFFFFEFF;
                    }
                    else {
                        if((this.d & 0x100) != 0x100) {
                            this.m = new ArrayList(this.m);
                            this.d |= 0x100;
                        }
                        this.m.addAll(protoBuf$Property0.l);
                    }
                }
                if(!protoBuf$Property0.m.isEmpty()) {
                    if(this.n.isEmpty()) {
                        this.n = protoBuf$Property0.m;
                        this.d &= 0xFFFFFDFF;
                    }
                    else {
                        if((this.d & 0x200) != 0x200) {
                            this.n = new ArrayList(this.n);
                            this.d |= 0x200;
                        }
                        this.n.addAll(protoBuf$Property0.m);
                    }
                }
                if(protoBuf$Property0.hasSetterValueParameter()) {
                    this.mergeSetterValueParameter(protoBuf$Property0.getSetterValueParameter());
                }
                if(protoBuf$Property0.hasGetterFlags()) {
                    this.setGetterFlags(protoBuf$Property0.getGetterFlags());
                }
                if(protoBuf$Property0.hasSetterFlags()) {
                    this.setSetterFlags(protoBuf$Property0.getSetterFlags());
                }
                if(!protoBuf$Property0.r.isEmpty()) {
                    if(this.r.isEmpty()) {
                        this.r = protoBuf$Property0.r;
                        this.d &= 0xFFFFDFFF;
                    }
                    else {
                        if((this.d & 0x2000) != 0x2000) {
                            this.r = new ArrayList(this.r);
                            this.d |= 0x2000;
                        }
                        this.r.addAll(protoBuf$Property0.r);
                    }
                }
                this.mergeExtensionFields(protoBuf$Property0);
                this.setUnknownFields(this.getUnknownFields().concat(protoBuf$Property0.b));
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                Property protoBuf$Property1;
                Property protoBuf$Property0;
                try {
                    try {
                        protoBuf$Property0 = null;
                        protoBuf$Property1 = (Property)Property.PARSER.parsePartialFrom(codedInputStream0, extensionRegistryLite0);
                        goto label_13;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                        Property protoBuf$Property2 = (Property)invalidProtocolBufferException0.getUnfinishedMessage();
                        try {
                            throw invalidProtocolBufferException0;
                        }
                        catch(Throwable throwable0) {
                            protoBuf$Property0 = protoBuf$Property2;
                        }
                    }
                }
                catch(Throwable throwable0) {
                }
                if(protoBuf$Property0 != null) {
                    this.mergeFrom(protoBuf$Property0);
                }
                throw throwable0;
            label_13:
                if(protoBuf$Property1 != null) {
                    this.mergeFrom(protoBuf$Property1);
                }
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedMessageLite0) {
                return this.mergeFrom(((Property)generatedMessageLite0));
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder mergeReceiverType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type0) {
                this.k = (this.d & 0x40) != 0x40 || this.k == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance() ? protoBuf$Type0 : kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.k).mergeFrom(protoBuf$Type0).buildPartial();
                this.d |= 0x40;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder mergeReturnType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type0) {
                this.h = (this.d & 8) != 8 || this.h == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance() ? protoBuf$Type0 : kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.h).mergeFrom(protoBuf$Type0).buildPartial();
                this.d |= 8;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder mergeSetterValueParameter(ValueParameter protoBuf$ValueParameter0) {
                this.o = (this.d & 0x400) != 0x400 || this.o == ValueParameter.getDefaultInstance() ? protoBuf$ValueParameter0 : ValueParameter.newBuilder(this.o).mergeFrom(protoBuf$ValueParameter0).buildPartial();
                this.d |= 0x400;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder setFlags(int v) {
                this.d |= 1;
                this.e = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder setGetterFlags(int v) {
                this.d |= 0x800;
                this.p = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder setName(int v) {
                this.d |= 4;
                this.g = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder setOldFlags(int v) {
                this.d |= 2;
                this.f = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder setReceiverTypeId(int v) {
                this.d |= 0x80;
                this.l = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder setReturnTypeId(int v) {
                this.d |= 16;
                this.i = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder setSetterFlags(int v) {
                this.d |= 0x1000;
                this.q = v;
                return this;
            }
        }

        public static Parser PARSER;
        public final ByteString b;
        public int c;
        public int d;
        public int e;
        public int f;
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type g;
        public int h;
        public List i;
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type j;
        public int k;
        public List l;
        public List m;
        public int n;
        public ValueParameter o;
        public int p;
        public int q;
        public List r;
        public byte s;
        public int t;
        public static final Property u;

        static {
            Property.PARSER = new m();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/AbstractParser;-><init>()V
            Property protoBuf$Property0 = new Property();
            Property.u = protoBuf$Property0;
            protoBuf$Property0.b();
        }

        public Property() {
            this.n = -1;
            this.s = -1;
            this.t = -1;
            this.b = ByteString.EMPTY;
        }

        public Property(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder protoBuf$Property$Builder0) {
            super(protoBuf$Property$Builder0);
            this.n = -1;
            this.s = -1;
            this.t = -1;
            this.b = protoBuf$Property$Builder0.getUnknownFields();
        }

        public Property(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) {
            int v3;
            this.n = -1;
            this.s = -1;
            this.t = -1;
            this.b();
            Output byteString$Output0 = ByteString.newOutput();
            CodedOutputStream codedOutputStream0 = CodedOutputStream.newInstance(byteString$Output0, 1);
            int v = 0;
            boolean z = false;
            while(!z) {
                try {
                    try {
                        int v1 = codedInputStream0.readTag();
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder protoBuf$Type$Builder0 = null;
                    alab1:
                        switch(v1) {
                            case 0: {
                            label_14:
                                z = true;
                                continue;
                            }
                            case 8: {
                                this.c |= 2;
                                this.e = codedInputStream0.readInt32();
                                continue;
                            }
                            case 16: {
                                this.c |= 4;
                                this.f = codedInputStream0.readInt32();
                                continue;
                            }
                            case 26: {
                                if((this.c & 8) == 8) {
                                    protoBuf$Type$Builder0 = this.g.toBuilder();
                                }
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type)codedInputStream0.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite0);
                                this.g = protoBuf$Type0;
                                if(protoBuf$Type$Builder0 != null) {
                                    protoBuf$Type$Builder0.mergeFrom(protoBuf$Type0);
                                    this.g = protoBuf$Type$Builder0.buildPartial();
                                }
                                this.c |= 8;
                                continue;
                            }
                            case 34: {
                                if((v & 0x20) != 0x20) {
                                    this.i = new ArrayList();
                                    v |= 0x20;
                                }
                                this.i.add(codedInputStream0.readMessage(TypeParameter.PARSER, extensionRegistryLite0));
                                continue;
                            }
                            case 42: {
                                if((this.c & 0x20) == 0x20) {
                                    protoBuf$Type$Builder0 = this.j.toBuilder();
                                }
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type)codedInputStream0.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite0);
                                this.j = protoBuf$Type1;
                                if(protoBuf$Type$Builder0 != null) {
                                    protoBuf$Type$Builder0.mergeFrom(protoBuf$Type1);
                                    this.j = protoBuf$Type$Builder0.buildPartial();
                                }
                                this.c |= 0x20;
                                continue;
                            }
                            case 50: {
                                if((this.c & 0x80) == 0x80) {
                                    protoBuf$Type$Builder0 = this.o.toBuilder();
                                }
                                ValueParameter protoBuf$ValueParameter0 = (ValueParameter)codedInputStream0.readMessage(ValueParameter.PARSER, extensionRegistryLite0);
                                this.o = protoBuf$ValueParameter0;
                                if(protoBuf$Type$Builder0 != null) {
                                    ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder)protoBuf$Type$Builder0).mergeFrom(protoBuf$ValueParameter0);
                                    this.o = ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder)protoBuf$Type$Builder0).buildPartial();
                                }
                                this.c |= 0x80;
                                continue;
                            }
                            case 56: {
                                this.c |= 0x100;
                                this.p = codedInputStream0.readInt32();
                                continue;
                            }
                            case 0x40: {
                                this.c |= 0x200;
                                this.q = codedInputStream0.readInt32();
                                continue;
                            }
                            case 72: {
                                this.c |= 16;
                                this.h = codedInputStream0.readInt32();
                                continue;
                            }
                            case 80: {
                                this.c |= 0x40;
                                this.k = codedInputStream0.readInt32();
                                continue;
                            }
                            case 88: {
                                this.c |= 1;
                                this.d = codedInputStream0.readInt32();
                                continue;
                            }
                            case 98: {
                                if((v & 0x100) != 0x100) {
                                    this.l = new ArrayList();
                                    v |= 0x100;
                                }
                                this.l.add(codedInputStream0.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite0));
                                continue;
                            }
                            case 104: {
                                if((v & 0x200) != 0x200) {
                                    this.m = new ArrayList();
                                    v |= 0x200;
                                }
                                this.m.add(codedInputStream0.readInt32());
                                continue;
                            }
                            case 106: {
                                int v2 = codedInputStream0.pushLimit(codedInputStream0.readRawVarint32());
                                if((v & 0x200) != 0x200 && codedInputStream0.getBytesUntilLimit() > 0) {
                                    this.m = new ArrayList();
                                    v |= 0x200;
                                }
                                while(codedInputStream0.getBytesUntilLimit() > 0) {
                                    this.m.add(codedInputStream0.readInt32());
                                }
                                codedInputStream0.popLimit(v2);
                                continue;
                            }
                            case 0xF8: {
                                if((v & 0x2000) != 0x2000) {
                                    this.r = new ArrayList();
                                    v |= 0x2000;
                                }
                                this.r.add(codedInputStream0.readInt32());
                                continue;
                            }
                            case 0xFA: {
                                v3 = codedInputStream0.pushLimit(codedInputStream0.readRawVarint32());
                                if((v & 0x2000) != 0x2000 && codedInputStream0.getBytesUntilLimit() > 0) {
                                    this.r = new ArrayList();
                                    v |= 0x2000;
                                }
                                while(true) {
                                    if(codedInputStream0.getBytesUntilLimit() <= 0) {
                                        break alab1;
                                    }
                                    this.r.add(codedInputStream0.readInt32());
                                }
                            }
                            default: {
                                if(!this.parseUnknownField(codedInputStream0, codedOutputStream0, extensionRegistryLite0, v1)) {
                                    goto label_14;
                                }
                                continue;
                            }
                        }
                        codedInputStream0.popLimit(v3);
                        continue;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                    }
                    catch(IOException iOException0) {
                        throw new InvalidProtocolBufferException(iOException0.getMessage()).setUnfinishedMessage(this);
                    }
                    throw invalidProtocolBufferException0.setUnfinishedMessage(this);
                }
                catch(Throwable throwable0) {
                }
                if((v & 0x20) == 0x20) {
                    this.i = Collections.unmodifiableList(this.i);
                }
                if((v & 0x100) == 0x100) {
                    this.l = Collections.unmodifiableList(this.l);
                }
                if((v & 0x200) == 0x200) {
                    this.m = Collections.unmodifiableList(this.m);
                }
                if((v & 0x2000) == 0x2000) {
                    this.r = Collections.unmodifiableList(this.r);
                }
                try {
                    codedOutputStream0.flush();
                    goto label_122;
                }
                catch(IOException unused_ex) {
                    goto label_122;
                }
                catch(Throwable throwable1) {
                }
                this.b = byteString$Output0.toByteString();
                throw throwable1;
            label_122:
                this.b = byteString$Output0.toByteString();
                this.makeExtensionsImmutable();
                throw throwable0;
            }
            if((v & 0x20) == 0x20) {
                this.i = Collections.unmodifiableList(this.i);
            }
            if((v & 0x100) == 0x100) {
                this.l = Collections.unmodifiableList(this.l);
            }
            if((v & 0x200) == 0x200) {
                this.m = Collections.unmodifiableList(this.m);
            }
            if((v & 0x2000) == 0x2000) {
                this.r = Collections.unmodifiableList(this.r);
            }
            try {
                codedOutputStream0.flush();
                goto label_138;
            }
            catch(IOException unused_ex) {
                goto label_138;
            }
            catch(Throwable throwable2) {
            }
            this.b = byteString$Output0.toByteString();
            throw throwable2;
        label_138:
            this.b = byteString$Output0.toByteString();
            this.makeExtensionsImmutable();
        }

        public final void b() {
            this.d = 0x206;
            this.e = 0x806;
            this.f = 0;
            this.g = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            this.h = 0;
            this.i = Collections.emptyList();
            this.j = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            this.k = 0;
            this.l = Collections.emptyList();
            this.m = Collections.emptyList();
            this.o = ValueParameter.getDefaultInstance();
            this.p = 0;
            this.q = 0;
            this.r = Collections.emptyList();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getContextReceiverType(int v) {
            return (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type)this.l.get(v);
        }

        public int getContextReceiverTypeCount() {
            return this.l.size();
        }

        public List getContextReceiverTypeIdList() {
            return this.m;
        }

        public List getContextReceiverTypeList() {
            return this.l;
        }

        public static Property getDefaultInstance() {
            return Property.u;
        }

        public Property getDefaultInstanceForType() {
            return Property.u;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public MessageLite getDefaultInstanceForType() {
            return this.getDefaultInstanceForType();
        }

        public int getFlags() {
            return this.d;
        }

        public int getGetterFlags() {
            return this.p;
        }

        public int getName() {
            return this.f;
        }

        public int getOldFlags() {
            return this.e;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser getParserForType() {
            return Property.PARSER;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getReceiverType() {
            return this.j;
        }

        public int getReceiverTypeId() {
            return this.k;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getReturnType() {
            return this.g;
        }

        public int getReturnTypeId() {
            return this.h;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int v1 = this.t;
            if(v1 != -1) {
                return v1;
            }
            int v2 = (this.c & 2) == 2 ? CodedOutputStream.computeInt32Size(1, this.e) : 0;
            if((this.c & 4) == 4) {
                v2 += CodedOutputStream.computeInt32Size(2, this.f);
            }
            if((this.c & 8) == 8) {
                v2 += CodedOutputStream.computeMessageSize(3, this.g);
            }
            for(int v3 = 0; v3 < this.i.size(); ++v3) {
                v2 += CodedOutputStream.computeMessageSize(4, ((MessageLite)this.i.get(v3)));
            }
            if((this.c & 0x20) == 0x20) {
                v2 += CodedOutputStream.computeMessageSize(5, this.j);
            }
            if((this.c & 0x80) == 0x80) {
                v2 += CodedOutputStream.computeMessageSize(6, this.o);
            }
            if((this.c & 0x100) == 0x100) {
                v2 += CodedOutputStream.computeInt32Size(7, this.p);
            }
            if((this.c & 0x200) == 0x200) {
                v2 += CodedOutputStream.computeInt32Size(8, this.q);
            }
            if((this.c & 16) == 16) {
                v2 += CodedOutputStream.computeInt32Size(9, this.h);
            }
            if((this.c & 0x40) == 0x40) {
                v2 += CodedOutputStream.computeInt32Size(10, this.k);
            }
            if((this.c & 1) == 1) {
                v2 += CodedOutputStream.computeInt32Size(11, this.d);
            }
            for(int v4 = 0; v4 < this.l.size(); ++v4) {
                v2 += CodedOutputStream.computeMessageSize(12, ((MessageLite)this.l.get(v4)));
            }
            int v6 = 0;
            for(int v5 = 0; v5 < this.m.size(); ++v5) {
                v6 += CodedOutputStream.computeInt32SizeNoTag(((int)(((Integer)this.m.get(v5)))));
            }
            int v7 = this.getContextReceiverTypeIdList().isEmpty() ? v2 + v6 : v2 + v6 + 1 + CodedOutputStream.computeInt32SizeNoTag(v6);
            this.n = v6;
            int v8 = 0;
            for(int v = 0; v < this.r.size(); ++v) {
                v8 += CodedOutputStream.computeInt32SizeNoTag(((int)(((Integer)this.r.get(v)))));
            }
            int v9 = this.extensionsSerializedSize();
            int v10 = this.b.size() + (v9 + (this.getVersionRequirementList().size() * 2 + (v7 + v8)));
            this.t = v10;
            return v10;
        }

        public int getSetterFlags() {
            return this.q;
        }

        public ValueParameter getSetterValueParameter() {
            return this.o;
        }

        public TypeParameter getTypeParameter(int v) {
            return (TypeParameter)this.i.get(v);
        }

        public int getTypeParameterCount() {
            return this.i.size();
        }

        public List getTypeParameterList() {
            return this.i;
        }

        public List getVersionRequirementList() {
            return this.r;
        }

        public boolean hasFlags() {
            return (this.c & 1) == 1;
        }

        public boolean hasGetterFlags() {
            return (this.c & 0x100) == 0x100;
        }

        public boolean hasName() {
            return (this.c & 4) == 4;
        }

        public boolean hasOldFlags() {
            return (this.c & 2) == 2;
        }

        public boolean hasReceiverType() {
            return (this.c & 0x20) == 0x20;
        }

        public boolean hasReceiverTypeId() {
            return (this.c & 0x40) == 0x40;
        }

        public boolean hasReturnType() {
            return (this.c & 8) == 8;
        }

        public boolean hasReturnTypeId() {
            return (this.c & 16) == 16;
        }

        public boolean hasSetterFlags() {
            return (this.c & 0x200) == 0x200;
        }

        public boolean hasSetterValueParameter() {
            return (this.c & 0x80) == 0x80;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            int v = this.s;
            if(v == 1) {
                return true;
            }
            if(v == 0) {
                return false;
            }
            if(!this.hasName()) {
                this.s = 0;
                return false;
            }
            if(this.hasReturnType() && !this.getReturnType().isInitialized()) {
                this.s = 0;
                return false;
            }
            for(int v1 = 0; v1 < this.getTypeParameterCount(); ++v1) {
                if(!this.getTypeParameter(v1).isInitialized()) {
                    this.s = 0;
                    return false;
                }
            }
            if(this.hasReceiverType() && !this.getReceiverType().isInitialized()) {
                this.s = 0;
                return false;
            }
            for(int v2 = 0; v2 < this.getContextReceiverTypeCount(); ++v2) {
                if(!this.getContextReceiverType(v2).isInitialized()) {
                    this.s = 0;
                    return false;
                }
            }
            if(this.hasSetterValueParameter() && !this.getSetterValueParameter().isInitialized()) {
                this.s = 0;
                return false;
            }
            if(!this.extensionsAreInitialized()) {
                this.s = 0;
                return false;
            }
            this.s = 1;
            return true;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder newBuilder() {
            return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder newBuilder(Property protoBuf$Property0) {
            return Property.newBuilder().mergeFrom(protoBuf$Property0);
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder newBuilderForType() {
            return Property.newBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder newBuilderForType() {
            return this.newBuilderForType();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder toBuilder() {
            return Property.newBuilder(this);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder toBuilder() {
            return this.toBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream0) throws IOException {
            this.getSerializedSize();
            ExtensionWriter generatedMessageLite$ExtendableMessage$ExtensionWriter0 = this.newExtensionWriter();
            if((this.c & 2) == 2) {
                codedOutputStream0.writeInt32(1, this.e);
            }
            if((this.c & 4) == 4) {
                codedOutputStream0.writeInt32(2, this.f);
            }
            if((this.c & 8) == 8) {
                codedOutputStream0.writeMessage(3, this.g);
            }
            for(int v1 = 0; v1 < this.i.size(); ++v1) {
                codedOutputStream0.writeMessage(4, ((MessageLite)this.i.get(v1)));
            }
            if((this.c & 0x20) == 0x20) {
                codedOutputStream0.writeMessage(5, this.j);
            }
            if((this.c & 0x80) == 0x80) {
                codedOutputStream0.writeMessage(6, this.o);
            }
            if((this.c & 0x100) == 0x100) {
                codedOutputStream0.writeInt32(7, this.p);
            }
            if((this.c & 0x200) == 0x200) {
                codedOutputStream0.writeInt32(8, this.q);
            }
            if((this.c & 16) == 16) {
                codedOutputStream0.writeInt32(9, this.h);
            }
            if((this.c & 0x40) == 0x40) {
                codedOutputStream0.writeInt32(10, this.k);
            }
            if((this.c & 1) == 1) {
                codedOutputStream0.writeInt32(11, this.d);
            }
            for(int v2 = 0; v2 < this.l.size(); ++v2) {
                codedOutputStream0.writeMessage(12, ((MessageLite)this.l.get(v2)));
            }
            if(this.getContextReceiverTypeIdList().size() > 0) {
                codedOutputStream0.writeRawVarint32(106);
                codedOutputStream0.writeRawVarint32(this.n);
            }
            for(int v3 = 0; v3 < this.m.size(); ++v3) {
                codedOutputStream0.writeInt32NoTag(((int)(((Integer)this.m.get(v3)))));
            }
            for(int v = 0; v < this.r.size(); ++v) {
                codedOutputStream0.writeInt32(0x1F, ((int)(((Integer)this.r.get(v)))));
            }
            generatedMessageLite$ExtendableMessage$ExtensionWriter0.writeUntil(19000, codedOutputStream0);
            codedOutputStream0.writeRawBytes(this.b);
        }
    }

    public static final class QualifiedNameTable extends GeneratedMessageLite implements ProtoBuf.QualifiedNameTableOrBuilder {
        public static final class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder implements ProtoBuf.QualifiedNameTableOrBuilder {
            public int b;
            public List c;

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder() {
                this.c = Collections.emptyList();
            }

            public QualifiedNameTable build() {
                QualifiedNameTable protoBuf$QualifiedNameTable0 = this.buildPartial();
                if(!protoBuf$QualifiedNameTable0.isInitialized()) {
                    throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(protoBuf$QualifiedNameTable0);
                }
                return protoBuf$QualifiedNameTable0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite$Builder
            public MessageLite build() {
                return this.build();
            }

            public QualifiedNameTable buildPartial() {
                QualifiedNameTable protoBuf$QualifiedNameTable0 = new QualifiedNameTable(this);
                if((this.b & 1) == 1) {
                    this.c = Collections.unmodifiableList(this.c);
                    this.b &= -2;
                }
                protoBuf$QualifiedNameTable0.b = this.c;
                return protoBuf$QualifiedNameTable0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public Object clone() throws CloneNotSupportedException {
                return this.clone();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder().mergeFrom(this.buildPartial());
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder clone() {
                return this.clone();
            }

            public QualifiedNameTable getDefaultInstanceForType() {
                return QualifiedNameTable.getDefaultInstance();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public GeneratedMessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public MessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            public QualifiedName getQualifiedName(int v) {
                return (QualifiedName)this.c.get(v);
            }

            public int getQualifiedNameCount() {
                return this.c.size();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for(int v = 0; v < this.getQualifiedNameCount(); ++v) {
                    if(!this.getQualifiedName(v).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder mergeFrom(QualifiedNameTable protoBuf$QualifiedNameTable0) {
                if(protoBuf$QualifiedNameTable0 == QualifiedNameTable.getDefaultInstance()) {
                    return this;
                }
                if(!protoBuf$QualifiedNameTable0.b.isEmpty()) {
                    if(this.c.isEmpty()) {
                        this.c = protoBuf$QualifiedNameTable0.b;
                        this.b &= -2;
                    }
                    else {
                        if((this.b & 1) != 1) {
                            this.c = new ArrayList(this.c);
                            this.b |= 1;
                        }
                        this.c.addAll(protoBuf$QualifiedNameTable0.b);
                    }
                }
                this.setUnknownFields(this.getUnknownFields().concat(protoBuf$QualifiedNameTable0.a));
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                QualifiedNameTable protoBuf$QualifiedNameTable1;
                QualifiedNameTable protoBuf$QualifiedNameTable0;
                try {
                    try {
                        protoBuf$QualifiedNameTable0 = null;
                        protoBuf$QualifiedNameTable1 = (QualifiedNameTable)QualifiedNameTable.PARSER.parsePartialFrom(codedInputStream0, extensionRegistryLite0);
                        goto label_13;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                        QualifiedNameTable protoBuf$QualifiedNameTable2 = (QualifiedNameTable)invalidProtocolBufferException0.getUnfinishedMessage();
                        try {
                            throw invalidProtocolBufferException0;
                        }
                        catch(Throwable throwable0) {
                            protoBuf$QualifiedNameTable0 = protoBuf$QualifiedNameTable2;
                        }
                    }
                }
                catch(Throwable throwable0) {
                }
                if(protoBuf$QualifiedNameTable0 != null) {
                    this.mergeFrom(protoBuf$QualifiedNameTable0);
                }
                throw throwable0;
            label_13:
                if(protoBuf$QualifiedNameTable1 != null) {
                    this.mergeFrom(protoBuf$QualifiedNameTable1);
                }
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedMessageLite0) {
                return this.mergeFrom(((QualifiedNameTable)generatedMessageLite0));
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }
        }

        public static final class QualifiedName extends GeneratedMessageLite implements ProtoBuf.QualifiedNameTable.QualifiedNameOrBuilder {
            public static final class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder implements ProtoBuf.QualifiedNameTable.QualifiedNameOrBuilder {
                public int b;
                public int c;
                public int d;
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind e;

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder() {
                    this.c = -1;
                    this.e = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind.PACKAGE;
                }

                public QualifiedName build() {
                    QualifiedName protoBuf$QualifiedNameTable$QualifiedName0 = this.buildPartial();
                    if(!protoBuf$QualifiedNameTable$QualifiedName0.isInitialized()) {
                        throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(protoBuf$QualifiedNameTable$QualifiedName0);
                    }
                    return protoBuf$QualifiedNameTable$QualifiedName0;
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite$Builder
                public MessageLite build() {
                    return this.build();
                }

                public QualifiedName buildPartial() {
                    QualifiedName protoBuf$QualifiedNameTable$QualifiedName0 = new QualifiedName(this);
                    int v = this.b;
                    int v1 = (v & 1) == 1 ? 1 : 0;
                    protoBuf$QualifiedNameTable$QualifiedName0.c = this.c;
                    if((v & 2) == 2) {
                        v1 |= 2;
                    }
                    protoBuf$QualifiedNameTable$QualifiedName0.d = this.d;
                    if((v & 4) == 4) {
                        v1 |= 4;
                    }
                    protoBuf$QualifiedNameTable$QualifiedName0.e = this.e;
                    protoBuf$QualifiedNameTable$QualifiedName0.b = v1;
                    return protoBuf$QualifiedNameTable$QualifiedName0;
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
                public Object clone() throws CloneNotSupportedException {
                    return this.clone();
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder clone() {
                    return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder().mergeFrom(this.buildPartial());
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
                public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder clone() {
                    return this.clone();
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
                public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder clone() {
                    return this.clone();
                }

                public QualifiedName getDefaultInstanceForType() {
                    return QualifiedName.getDefaultInstance();
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
                public GeneratedMessageLite getDefaultInstanceForType() {
                    return this.getDefaultInstanceForType();
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public MessageLite getDefaultInstanceForType() {
                    return this.getDefaultInstanceForType();
                }

                public boolean hasShortName() {
                    return (this.b & 2) == 2;
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return this.hasShortName();
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder mergeFrom(QualifiedName protoBuf$QualifiedNameTable$QualifiedName0) {
                    if(protoBuf$QualifiedNameTable$QualifiedName0 == QualifiedName.getDefaultInstance()) {
                        return this;
                    }
                    if(protoBuf$QualifiedNameTable$QualifiedName0.hasParentQualifiedName()) {
                        this.setParentQualifiedName(protoBuf$QualifiedNameTable$QualifiedName0.getParentQualifiedName());
                    }
                    if(protoBuf$QualifiedNameTable$QualifiedName0.hasShortName()) {
                        this.setShortName(protoBuf$QualifiedNameTable$QualifiedName0.getShortName());
                    }
                    if(protoBuf$QualifiedNameTable$QualifiedName0.hasKind()) {
                        this.setKind(protoBuf$QualifiedNameTable$QualifiedName0.getKind());
                    }
                    this.setUnknownFields(this.getUnknownFields().concat(protoBuf$QualifiedNameTable$QualifiedName0.a));
                    return this;
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                    QualifiedName protoBuf$QualifiedNameTable$QualifiedName1;
                    QualifiedName protoBuf$QualifiedNameTable$QualifiedName0;
                    try {
                        try {
                            protoBuf$QualifiedNameTable$QualifiedName0 = null;
                            protoBuf$QualifiedNameTable$QualifiedName1 = (QualifiedName)QualifiedName.PARSER.parsePartialFrom(codedInputStream0, extensionRegistryLite0);
                            goto label_13;
                        }
                        catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                            QualifiedName protoBuf$QualifiedNameTable$QualifiedName2 = (QualifiedName)invalidProtocolBufferException0.getUnfinishedMessage();
                            try {
                                throw invalidProtocolBufferException0;
                            }
                            catch(Throwable throwable0) {
                                protoBuf$QualifiedNameTable$QualifiedName0 = protoBuf$QualifiedNameTable$QualifiedName2;
                            }
                        }
                    }
                    catch(Throwable throwable0) {
                    }
                    if(protoBuf$QualifiedNameTable$QualifiedName0 != null) {
                        this.mergeFrom(protoBuf$QualifiedNameTable$QualifiedName0);
                    }
                    throw throwable0;
                label_13:
                    if(protoBuf$QualifiedNameTable$QualifiedName1 != null) {
                        this.mergeFrom(protoBuf$QualifiedNameTable$QualifiedName1);
                    }
                    return this;
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
                public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                    return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
                public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedMessageLite0) {
                    return this.mergeFrom(((QualifiedName)generatedMessageLite0));
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
                public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                    return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder setKind(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind protoBuf$QualifiedNameTable$QualifiedName$Kind0) {
                    protoBuf$QualifiedNameTable$QualifiedName$Kind0.getClass();
                    this.b |= 4;
                    this.e = protoBuf$QualifiedNameTable$QualifiedName$Kind0;
                    return this;
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder setParentQualifiedName(int v) {
                    this.b |= 1;
                    this.c = v;
                    return this;
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder setShortName(int v) {
                    this.b |= 2;
                    this.d = v;
                    return this;
                }
            }

            public static enum kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind implements EnumLite {
                CLASS(0),
                PACKAGE(1),
                LOCAL(2);

                public final int a;

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind(int v1) {
                    this.a = v1;
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.Internal$EnumLite
                public final int getNumber() {
                    return this.a;
                }

                public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind valueOf(int v) {
                    switch(v) {
                        case 0: {
                            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind.CLASS;
                        }
                        case 1: {
                            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind.PACKAGE;
                        }
                        case 2: {
                            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind.LOCAL;
                        }
                        default: {
                            return null;
                        }
                    }
                }
            }

            public static Parser PARSER;
            public final ByteString a;
            public int b;
            public int c;
            public int d;
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind e;
            public byte f;
            public int g;
            public static final QualifiedName h;

            static {
                QualifiedName.PARSER = new o();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/AbstractParser;-><init>()V
                QualifiedName protoBuf$QualifiedNameTable$QualifiedName0 = new QualifiedName();
                QualifiedName.h = protoBuf$QualifiedNameTable$QualifiedName0;
                protoBuf$QualifiedNameTable$QualifiedName0.c = -1;
                protoBuf$QualifiedNameTable$QualifiedName0.d = 0;
                protoBuf$QualifiedNameTable$QualifiedName0.e = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind.PACKAGE;
            }

            public QualifiedName() {
                this.f = -1;
                this.g = -1;
                this.a = ByteString.EMPTY;
            }

            public QualifiedName(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder protoBuf$QualifiedNameTable$QualifiedName$Builder0) {
                super(protoBuf$QualifiedNameTable$QualifiedName$Builder0);
                this.f = -1;
                this.g = -1;
                this.a = protoBuf$QualifiedNameTable$QualifiedName$Builder0.getUnknownFields();
            }

            public QualifiedName(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind protoBuf$QualifiedNameTable$QualifiedName$Kind0;
                this.f = -1;
                this.g = -1;
                this.c = -1;
                this.d = 0;
                this.e = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind.PACKAGE;
                Output byteString$Output0 = ByteString.newOutput();
                CodedOutputStream codedOutputStream0 = CodedOutputStream.newInstance(byteString$Output0, 1);
                try {
                    boolean z = false;
                    while(!z) {
                        try {
                            int v1 = codedInputStream0.readTag();
                            switch(v1) {
                                case 0: {
                                    z = true;
                                    break;
                                }
                                case 8: {
                                    this.b |= 1;
                                    this.c = codedInputStream0.readInt32();
                                    break;
                                }
                                case 16: {
                                    this.b |= 2;
                                    this.d = codedInputStream0.readInt32();
                                    break;
                                }
                                case 24: {
                                    int v2 = codedInputStream0.readEnum();
                                    protoBuf$QualifiedNameTable$QualifiedName$Kind0 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind.valueOf(v2);
                                    if(protoBuf$QualifiedNameTable$QualifiedName$Kind0 == null) {
                                        codedOutputStream0.writeRawVarint32(24);
                                        codedOutputStream0.writeRawVarint32(v2);
                                    }
                                    else {
                                        this.b |= 4;
                                        this.e = protoBuf$QualifiedNameTable$QualifiedName$Kind0;
                                        continue;
                                    }
                                    break;
                                }
                                default: {
                                    if(!this.parseUnknownField(codedInputStream0, codedOutputStream0, extensionRegistryLite0, v1)) {
                                        z = true;
                                        break;
                                    }
                                }
                            }
                            continue;
                        }
                        catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                            throw invalidProtocolBufferException0.setUnfinishedMessage(this);
                        }
                        catch(IOException iOException0) {
                            throw new InvalidProtocolBufferException(iOException0.getMessage()).setUnfinishedMessage(this);
                        }
                        catch(Throwable throwable0) {
                        }
                        try {
                            codedOutputStream0.flush();
                            goto label_44;
                        }
                        catch(IOException unused_ex) {
                            goto label_44;
                        }
                        catch(Throwable throwable1) {
                        }
                        throw throwable1;
                    label_44:
                        this.makeExtensionsImmutable();
                        throw throwable0;
                    }
                    try {
                        codedOutputStream0.flush();
                    }
                    catch(IOException unused_ex) {
                    }
                }
                finally {
                    this.a = byteString$Output0.toByteString();
                }
                this.makeExtensionsImmutable();
            }

            public static QualifiedName getDefaultInstance() {
                return QualifiedName.h;
            }

            public QualifiedName getDefaultInstanceForType() {
                return QualifiedName.h;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public MessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind getKind() {
                return this.e;
            }

            public int getParentQualifiedName() {
                return this.c;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
            public Parser getParserForType() {
                return QualifiedName.PARSER;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int v = this.g;
                if(v != -1) {
                    return v;
                }
                int v1 = (this.b & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.c) : 0;
                if((this.b & 2) == 2) {
                    v1 += CodedOutputStream.computeInt32Size(2, this.d);
                }
                if((this.b & 4) == 4) {
                    v1 += CodedOutputStream.computeEnumSize(3, this.e.getNumber());
                }
                int v2 = this.a.size() + v1;
                this.g = v2;
                return v2;
            }

            public int getShortName() {
                return this.d;
            }

            public boolean hasKind() {
                return (this.b & 4) == 4;
            }

            public boolean hasParentQualifiedName() {
                return (this.b & 1) == 1;
            }

            public boolean hasShortName() {
                return (this.b & 2) == 2;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                int v = this.f;
                if(v == 1) {
                    return true;
                }
                if(v == 0) {
                    return false;
                }
                if(!this.hasShortName()) {
                    this.f = 0;
                    return false;
                }
                this.f = 1;
                return true;
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder newBuilder() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder();
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder newBuilder(QualifiedName protoBuf$QualifiedNameTable$QualifiedName0) {
                return QualifiedName.newBuilder().mergeFrom(protoBuf$QualifiedNameTable$QualifiedName0);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder newBuilderForType() {
                return QualifiedName.newBuilder();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder newBuilderForType() {
                return this.newBuilderForType();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder toBuilder() {
                return QualifiedName.newBuilder(this);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder toBuilder() {
                return this.toBuilder();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream0) throws IOException {
                this.getSerializedSize();
                if((this.b & 1) == 1) {
                    codedOutputStream0.writeInt32(1, this.c);
                }
                if((this.b & 2) == 2) {
                    codedOutputStream0.writeInt32(2, this.d);
                }
                if((this.b & 4) == 4) {
                    codedOutputStream0.writeEnum(3, this.e.getNumber());
                }
                codedOutputStream0.writeRawBytes(this.a);
            }
        }

        public static Parser PARSER;
        public final ByteString a;
        public List b;
        public byte c;
        public int d;
        public static final QualifiedNameTable e;

        static {
            QualifiedNameTable.PARSER = new n();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/AbstractParser;-><init>()V
            QualifiedNameTable protoBuf$QualifiedNameTable0 = new QualifiedNameTable();
            QualifiedNameTable.e = protoBuf$QualifiedNameTable0;
            protoBuf$QualifiedNameTable0.b = Collections.emptyList();
        }

        public QualifiedNameTable() {
            this.c = -1;
            this.d = -1;
            this.a = ByteString.EMPTY;
        }

        public QualifiedNameTable(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder protoBuf$QualifiedNameTable$Builder0) {
            super(protoBuf$QualifiedNameTable$Builder0);
            this.c = -1;
            this.d = -1;
            this.a = protoBuf$QualifiedNameTable$Builder0.getUnknownFields();
        }

        public QualifiedNameTable(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) {
            this.c = -1;
            this.d = -1;
            this.b = Collections.emptyList();
            Output byteString$Output0 = ByteString.newOutput();
            CodedOutputStream codedOutputStream0 = CodedOutputStream.newInstance(byteString$Output0, 1);
            boolean z = false;
            boolean z1 = false;
            while(!z1) {
                try {
                    try {
                        int v = codedInputStream0.readTag();
                        switch(v) {
                            case 0: {
                                z1 = true;
                                continue;
                            }
                            case 10: {
                                break;
                            }
                            default: {
                                if(!this.parseUnknownField(codedInputStream0, codedOutputStream0, extensionRegistryLite0, v)) {
                                    z1 = true;
                                    continue;
                                }
                                continue;
                            }
                        }
                        if(!z) {
                            this.b = new ArrayList();
                            z = true;
                        }
                        this.b.add(codedInputStream0.readMessage(QualifiedName.PARSER, extensionRegistryLite0));
                        continue;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                    }
                    catch(IOException iOException0) {
                        throw new InvalidProtocolBufferException(iOException0.getMessage()).setUnfinishedMessage(this);
                    }
                    throw invalidProtocolBufferException0.setUnfinishedMessage(this);
                }
                catch(Throwable throwable0) {
                }
                if(z) {
                    this.b = Collections.unmodifiableList(this.b);
                }
                try {
                    codedOutputStream0.flush();
                    goto label_33;
                }
                catch(IOException unused_ex) {
                    goto label_33;
                }
                catch(Throwable throwable1) {
                }
                this.a = byteString$Output0.toByteString();
                throw throwable1;
            label_33:
                this.a = byteString$Output0.toByteString();
                this.makeExtensionsImmutable();
                throw throwable0;
            }
            if(z) {
                this.b = Collections.unmodifiableList(this.b);
            }
            try {
                codedOutputStream0.flush();
                goto label_43;
            }
            catch(IOException unused_ex) {
                goto label_43;
            }
            catch(Throwable throwable2) {
            }
            this.a = byteString$Output0.toByteString();
            throw throwable2;
        label_43:
            this.a = byteString$Output0.toByteString();
            this.makeExtensionsImmutable();
        }

        public static QualifiedNameTable getDefaultInstance() {
            return QualifiedNameTable.e;
        }

        public QualifiedNameTable getDefaultInstanceForType() {
            return QualifiedNameTable.e;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public MessageLite getDefaultInstanceForType() {
            return this.getDefaultInstanceForType();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser getParserForType() {
            return QualifiedNameTable.PARSER;
        }

        public QualifiedName getQualifiedName(int v) {
            return (QualifiedName)this.b.get(v);
        }

        public int getQualifiedNameCount() {
            return this.b.size();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int v = this.d;
            if(v != -1) {
                return v;
            }
            int v2 = 0;
            for(int v1 = 0; v1 < this.b.size(); ++v1) {
                v2 += CodedOutputStream.computeMessageSize(1, ((MessageLite)this.b.get(v1)));
            }
            int v3 = this.a.size() + v2;
            this.d = v3;
            return v3;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            int v = this.c;
            if(v == 1) {
                return true;
            }
            if(v == 0) {
                return false;
            }
            for(int v1 = 0; v1 < this.getQualifiedNameCount(); ++v1) {
                if(!this.getQualifiedName(v1).isInitialized()) {
                    this.c = 0;
                    return false;
                }
            }
            this.c = 1;
            return true;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder newBuilder() {
            return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder newBuilder(QualifiedNameTable protoBuf$QualifiedNameTable0) {
            return QualifiedNameTable.newBuilder().mergeFrom(protoBuf$QualifiedNameTable0);
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder newBuilderForType() {
            return QualifiedNameTable.newBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder newBuilderForType() {
            return this.newBuilderForType();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder toBuilder() {
            return QualifiedNameTable.newBuilder(this);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder toBuilder() {
            return this.toBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream0) throws IOException {
            this.getSerializedSize();
            for(int v = 0; v < this.b.size(); ++v) {
                codedOutputStream0.writeMessage(1, ((MessageLite)this.b.get(v)));
            }
            codedOutputStream0.writeRawBytes(this.a);
        }
    }

    public static final class StringTable extends GeneratedMessageLite implements ProtoBuf.StringTableOrBuilder {
        public static final class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder implements ProtoBuf.StringTableOrBuilder {
            public int b;
            public LazyStringList c;

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder() {
                this.c = LazyStringArrayList.EMPTY;
            }

            public StringTable build() {
                StringTable protoBuf$StringTable0 = this.buildPartial();
                if(!protoBuf$StringTable0.isInitialized()) {
                    throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(protoBuf$StringTable0);
                }
                return protoBuf$StringTable0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite$Builder
            public MessageLite build() {
                return this.build();
            }

            public StringTable buildPartial() {
                StringTable protoBuf$StringTable0 = new StringTable(this);
                if((this.b & 1) == 1) {
                    this.c = this.c.getUnmodifiableView();
                    this.b &= -2;
                }
                protoBuf$StringTable0.b = this.c;
                return protoBuf$StringTable0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public Object clone() throws CloneNotSupportedException {
                return this.clone();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder().mergeFrom(this.buildPartial());
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder clone() {
                return this.clone();
            }

            public StringTable getDefaultInstanceForType() {
                return StringTable.getDefaultInstance();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public GeneratedMessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public MessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder mergeFrom(StringTable protoBuf$StringTable0) {
                if(protoBuf$StringTable0 == StringTable.getDefaultInstance()) {
                    return this;
                }
                if(!protoBuf$StringTable0.b.isEmpty()) {
                    if(this.c.isEmpty()) {
                        this.c = protoBuf$StringTable0.b;
                        this.b &= -2;
                    }
                    else {
                        if((this.b & 1) != 1) {
                            this.c = new LazyStringArrayList(this.c);
                            this.b |= 1;
                        }
                        this.c.addAll(protoBuf$StringTable0.b);
                    }
                }
                this.setUnknownFields(this.getUnknownFields().concat(protoBuf$StringTable0.a));
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                StringTable protoBuf$StringTable1;
                StringTable protoBuf$StringTable0;
                try {
                    try {
                        protoBuf$StringTable0 = null;
                        protoBuf$StringTable1 = (StringTable)StringTable.PARSER.parsePartialFrom(codedInputStream0, extensionRegistryLite0);
                        goto label_13;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                        StringTable protoBuf$StringTable2 = (StringTable)invalidProtocolBufferException0.getUnfinishedMessage();
                        try {
                            throw invalidProtocolBufferException0;
                        }
                        catch(Throwable throwable0) {
                            protoBuf$StringTable0 = protoBuf$StringTable2;
                        }
                    }
                }
                catch(Throwable throwable0) {
                }
                if(protoBuf$StringTable0 != null) {
                    this.mergeFrom(protoBuf$StringTable0);
                }
                throw throwable0;
            label_13:
                if(protoBuf$StringTable1 != null) {
                    this.mergeFrom(protoBuf$StringTable1);
                }
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedMessageLite0) {
                return this.mergeFrom(((StringTable)generatedMessageLite0));
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }
        }

        public static Parser PARSER;
        public final ByteString a;
        public LazyStringList b;
        public byte c;
        public int d;
        public static final StringTable e;

        static {
            StringTable.PARSER = new p();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/AbstractParser;-><init>()V
            StringTable protoBuf$StringTable0 = new StringTable();
            StringTable.e = protoBuf$StringTable0;
            protoBuf$StringTable0.b = LazyStringArrayList.EMPTY;
        }

        public StringTable() {
            this.c = -1;
            this.d = -1;
            this.a = ByteString.EMPTY;
        }

        public StringTable(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder protoBuf$StringTable$Builder0) {
            super(protoBuf$StringTable$Builder0);
            this.c = -1;
            this.d = -1;
            this.a = protoBuf$StringTable$Builder0.getUnknownFields();
        }

        public StringTable(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) {
            this.c = -1;
            this.d = -1;
            this.b = LazyStringArrayList.EMPTY;
            Output byteString$Output0 = ByteString.newOutput();
            CodedOutputStream codedOutputStream0 = CodedOutputStream.newInstance(byteString$Output0, 1);
            boolean z = false;
            boolean z1 = false;
            while(!z1) {
                try {
                    try {
                        int v = codedInputStream0.readTag();
                        switch(v) {
                            case 0: {
                                z1 = true;
                                continue;
                            }
                            case 10: {
                                break;
                            }
                            default: {
                                if(!this.parseUnknownField(codedInputStream0, codedOutputStream0, extensionRegistryLite0, v)) {
                                    z1 = true;
                                    continue;
                                }
                                continue;
                            }
                        }
                        ByteString byteString0 = codedInputStream0.readBytes();
                        if(!z) {
                            this.b = new LazyStringArrayList();
                            z = true;
                        }
                        this.b.add(byteString0);
                        continue;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                    }
                    catch(IOException iOException0) {
                        throw new InvalidProtocolBufferException(iOException0.getMessage()).setUnfinishedMessage(this);
                    }
                    throw invalidProtocolBufferException0.setUnfinishedMessage(this);
                }
                catch(Throwable throwable0) {
                }
                if(z) {
                    this.b = this.b.getUnmodifiableView();
                }
                try {
                    codedOutputStream0.flush();
                    goto label_34;
                }
                catch(IOException unused_ex) {
                    goto label_34;
                }
                catch(Throwable throwable1) {
                }
                this.a = byteString$Output0.toByteString();
                throw throwable1;
            label_34:
                this.a = byteString$Output0.toByteString();
                this.makeExtensionsImmutable();
                throw throwable0;
            }
            if(z) {
                this.b = this.b.getUnmodifiableView();
            }
            try {
                codedOutputStream0.flush();
                goto label_44;
            }
            catch(IOException unused_ex) {
                goto label_44;
            }
            catch(Throwable throwable2) {
            }
            this.a = byteString$Output0.toByteString();
            throw throwable2;
        label_44:
            this.a = byteString$Output0.toByteString();
            this.makeExtensionsImmutable();
        }

        public static StringTable getDefaultInstance() {
            return StringTable.e;
        }

        public StringTable getDefaultInstanceForType() {
            return StringTable.e;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public MessageLite getDefaultInstanceForType() {
            return this.getDefaultInstanceForType();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser getParserForType() {
            return StringTable.PARSER;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int v = this.d;
            if(v != -1) {
                return v;
            }
            int v2 = 0;
            for(int v1 = 0; v1 < this.b.size(); ++v1) {
                v2 += CodedOutputStream.computeBytesSizeNoTag(this.b.getByteString(v1));
            }
            int v3 = this.a.size() + (this.getStringList().size() + v2);
            this.d = v3;
            return v3;
        }

        public String getString(int v) {
            return (String)this.b.get(v);
        }

        public ProtocolStringList getStringList() {
            return this.b;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            int v = this.c;
            if(v == 1) {
                return true;
            }
            if(v == 0) {
                return false;
            }
            this.c = 1;
            return true;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder newBuilder() {
            return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder newBuilder(StringTable protoBuf$StringTable0) {
            return StringTable.newBuilder().mergeFrom(protoBuf$StringTable0);
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder newBuilderForType() {
            return StringTable.newBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder newBuilderForType() {
            return this.newBuilderForType();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder toBuilder() {
            return StringTable.newBuilder(this);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder toBuilder() {
            return this.toBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream0) throws IOException {
            this.getSerializedSize();
            for(int v = 0; v < this.b.size(); ++v) {
                codedOutputStream0.writeBytes(1, this.b.getByteString(v));
            }
            codedOutputStream0.writeRawBytes(this.a);
        }
    }

    public static final class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type extends ExtendableMessage implements ProtoBuf.TypeOrBuilder {
        public static final class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument extends GeneratedMessageLite implements ProtoBuf.Type.ArgumentOrBuilder {
            public static final class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder implements ProtoBuf.Type.ArgumentOrBuilder {
                public int b;
                public Projection c;
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type d;
                public int e;

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder() {
                    this.c = Projection.INV;
                    this.d = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument build() {
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument protoBuf$Type$Argument0 = this.buildPartial();
                    if(!protoBuf$Type$Argument0.isInitialized()) {
                        throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(protoBuf$Type$Argument0);
                    }
                    return protoBuf$Type$Argument0;
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite$Builder
                public MessageLite build() {
                    return this.build();
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument buildPartial() {
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument protoBuf$Type$Argument0 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument(this);
                    int v = this.b;
                    int v1 = (v & 1) == 1 ? 1 : 0;
                    protoBuf$Type$Argument0.c = this.c;
                    if((v & 2) == 2) {
                        v1 |= 2;
                    }
                    protoBuf$Type$Argument0.d = this.d;
                    if((v & 4) == 4) {
                        v1 |= 4;
                    }
                    protoBuf$Type$Argument0.e = this.e;
                    protoBuf$Type$Argument0.b = v1;
                    return protoBuf$Type$Argument0;
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
                public Object clone() throws CloneNotSupportedException {
                    return this.clone();
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder clone() {
                    return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder().mergeFrom(this.buildPartial());
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
                public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder clone() {
                    return this.clone();
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
                public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder clone() {
                    return this.clone();
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument getDefaultInstanceForType() {
                    return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.getDefaultInstance();
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
                public GeneratedMessageLite getDefaultInstanceForType() {
                    return this.getDefaultInstanceForType();
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public MessageLite getDefaultInstanceForType() {
                    return this.getDefaultInstanceForType();
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getType() {
                    return this.d;
                }

                public boolean hasType() {
                    return (this.b & 2) == 2;
                }

                // 去混淆评级： 低(20)
                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return !this.hasType() || this.getType().isInitialized();
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument protoBuf$Type$Argument0) {
                    if(protoBuf$Type$Argument0 == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.getDefaultInstance()) {
                        return this;
                    }
                    if(protoBuf$Type$Argument0.hasProjection()) {
                        this.setProjection(protoBuf$Type$Argument0.getProjection());
                    }
                    if(protoBuf$Type$Argument0.hasType()) {
                        this.mergeType(protoBuf$Type$Argument0.getType());
                    }
                    if(protoBuf$Type$Argument0.hasTypeId()) {
                        this.setTypeId(protoBuf$Type$Argument0.getTypeId());
                    }
                    this.setUnknownFields(this.getUnknownFields().concat(protoBuf$Type$Argument0.a));
                    return this;
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument protoBuf$Type$Argument1;
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument protoBuf$Type$Argument0;
                    try {
                        try {
                            protoBuf$Type$Argument0 = null;
                            protoBuf$Type$Argument1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument)kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.PARSER.parsePartialFrom(codedInputStream0, extensionRegistryLite0);
                            goto label_13;
                        }
                        catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument protoBuf$Type$Argument2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument)invalidProtocolBufferException0.getUnfinishedMessage();
                            try {
                                throw invalidProtocolBufferException0;
                            }
                            catch(Throwable throwable0) {
                                protoBuf$Type$Argument0 = protoBuf$Type$Argument2;
                            }
                        }
                    }
                    catch(Throwable throwable0) {
                    }
                    if(protoBuf$Type$Argument0 != null) {
                        this.mergeFrom(protoBuf$Type$Argument0);
                    }
                    throw throwable0;
                label_13:
                    if(protoBuf$Type$Argument1 != null) {
                        this.mergeFrom(protoBuf$Type$Argument1);
                    }
                    return this;
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
                public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                    return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
                public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedMessageLite0) {
                    return this.mergeFrom(((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument)generatedMessageLite0));
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
                public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                    return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder mergeType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type0) {
                    this.d = (this.b & 2) != 2 || this.d == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance() ? protoBuf$Type0 : kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.d).mergeFrom(protoBuf$Type0).buildPartial();
                    this.b |= 2;
                    return this;
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder setProjection(Projection protoBuf$Type$Argument$Projection0) {
                    protoBuf$Type$Argument$Projection0.getClass();
                    this.b |= 1;
                    this.c = protoBuf$Type$Argument$Projection0;
                    return this;
                }

                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder setTypeId(int v) {
                    this.b |= 4;
                    this.e = v;
                    return this;
                }
            }

            public static enum Projection implements EnumLite {
                IN(0),
                OUT(1),
                INV(2),
                STAR(3);

                public final int a;

                public Projection(int v1) {
                    this.a = v1;
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.Internal$EnumLite
                public final int getNumber() {
                    return this.a;
                }

                public static Projection valueOf(int v) {
                    switch(v) {
                        case 0: {
                            return Projection.IN;
                        }
                        case 1: {
                            return Projection.OUT;
                        }
                        case 2: {
                            return Projection.INV;
                        }
                        case 3: {
                            return Projection.STAR;
                        }
                        default: {
                            return null;
                        }
                    }
                }
            }

            public static Parser PARSER;
            public final ByteString a;
            public int b;
            public Projection c;
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type d;
            public int e;
            public byte f;
            public int g;
            public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument h;

            static {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.PARSER = new r();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/AbstractParser;-><init>()V
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument protoBuf$Type$Argument0 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument();
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.h = protoBuf$Type$Argument0;
                protoBuf$Type$Argument0.c = Projection.INV;
                protoBuf$Type$Argument0.d = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
                protoBuf$Type$Argument0.e = 0;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument() {
                this.f = -1;
                this.g = -1;
                this.a = ByteString.EMPTY;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder protoBuf$Type$Argument$Builder0) {
                super(protoBuf$Type$Argument$Builder0);
                this.f = -1;
                this.g = -1;
                this.a = protoBuf$Type$Argument$Builder0.getUnknownFields();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) {
                this.f = -1;
                this.g = -1;
                this.c = Projection.INV;
                this.d = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
                this.e = 0;
                Output byteString$Output0 = ByteString.newOutput();
                CodedOutputStream codedOutputStream0 = CodedOutputStream.newInstance(byteString$Output0, 1);
                try {
                    boolean z = false;
                    while(!z) {
                        try {
                            try {
                                int v1 = codedInputStream0.readTag();
                                switch(v1) {
                                    case 0: {
                                        z = true;
                                        continue;
                                    }
                                    case 8: {
                                        int v2 = codedInputStream0.readEnum();
                                        Projection protoBuf$Type$Argument$Projection0 = Projection.valueOf(v2);
                                        if(protoBuf$Type$Argument$Projection0 == null) {
                                            codedOutputStream0.writeRawVarint32(8);
                                            codedOutputStream0.writeRawVarint32(v2);
                                        }
                                        else {
                                            this.b |= 1;
                                            this.c = protoBuf$Type$Argument$Projection0;
                                        }
                                        continue;
                                    }
                                    case 18: {
                                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder protoBuf$Type$Builder0 = (this.b & 2) == 2 ? this.d.toBuilder() : null;
                                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type)codedInputStream0.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite0);
                                        this.d = protoBuf$Type0;
                                        if(protoBuf$Type$Builder0 != null) {
                                            protoBuf$Type$Builder0.mergeFrom(protoBuf$Type0);
                                            this.d = protoBuf$Type$Builder0.buildPartial();
                                        }
                                        this.b |= 2;
                                        continue;
                                    }
                                    case 24: {
                                        this.b |= 4;
                                        this.e = codedInputStream0.readInt32();
                                        continue;
                                    }
                                    default: {
                                        if(!this.parseUnknownField(codedInputStream0, codedOutputStream0, extensionRegistryLite0, v1)) {
                                            z = true;
                                            continue;
                                        }
                                        continue;
                                    }
                                }
                            }
                            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                            }
                            catch(IOException iOException0) {
                                throw new InvalidProtocolBufferException(iOException0.getMessage()).setUnfinishedMessage(this);
                            }
                            throw invalidProtocolBufferException0.setUnfinishedMessage(this);
                        }
                        catch(Throwable throwable0) {
                        }
                        try {
                            codedOutputStream0.flush();
                            goto label_48;
                        }
                        catch(IOException unused_ex) {
                            goto label_48;
                        }
                        catch(Throwable throwable1) {
                        }
                        throw throwable1;
                    label_48:
                        this.makeExtensionsImmutable();
                        throw throwable0;
                    }
                    try {
                        codedOutputStream0.flush();
                    }
                    catch(IOException unused_ex) {
                    }
                }
                finally {
                    this.a = byteString$Output0.toByteString();
                }
                this.makeExtensionsImmutable();
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument getDefaultInstance() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.h;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.h;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public MessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
            public Parser getParserForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.PARSER;
            }

            public Projection getProjection() {
                return this.c;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int v = this.g;
                if(v != -1) {
                    return v;
                }
                int v1 = (this.b & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.c.getNumber()) : 0;
                if((this.b & 2) == 2) {
                    v1 += CodedOutputStream.computeMessageSize(2, this.d);
                }
                if((this.b & 4) == 4) {
                    v1 += CodedOutputStream.computeInt32Size(3, this.e);
                }
                int v2 = this.a.size() + v1;
                this.g = v2;
                return v2;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getType() {
                return this.d;
            }

            public int getTypeId() {
                return this.e;
            }

            public boolean hasProjection() {
                return (this.b & 1) == 1;
            }

            public boolean hasType() {
                return (this.b & 2) == 2;
            }

            public boolean hasTypeId() {
                return (this.b & 4) == 4;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                int v = this.f;
                if(v == 1) {
                    return true;
                }
                if(v == 0) {
                    return false;
                }
                if(this.hasType() && !this.getType().isInitialized()) {
                    this.f = 0;
                    return false;
                }
                this.f = 1;
                return true;
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder newBuilder() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder();
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument protoBuf$Type$Argument0) {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.newBuilder().mergeFrom(protoBuf$Type$Argument0);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder newBuilderForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.newBuilder();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder newBuilderForType() {
                return this.newBuilderForType();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder toBuilder() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.newBuilder(this);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder toBuilder() {
                return this.toBuilder();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream0) throws IOException {
                this.getSerializedSize();
                if((this.b & 1) == 1) {
                    codedOutputStream0.writeEnum(1, this.c.getNumber());
                }
                if((this.b & 2) == 2) {
                    codedOutputStream0.writeMessage(2, this.d);
                }
                if((this.b & 4) == 4) {
                    codedOutputStream0.writeInt32(3, this.e);
                }
                codedOutputStream0.writeRawBytes(this.a);
            }
        }

        public static final class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder extends ExtendableBuilder implements ProtoBuf.TypeOrBuilder {
            public int d;
            public List e;
            public boolean f;
            public int g;
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type h;
            public int i;
            public int j;
            public int k;
            public int l;
            public int m;
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type n;
            public int o;
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type p;
            public int q;
            public int r;

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder() {
                this.e = Collections.emptyList();
                this.h = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
                this.n = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
                this.p = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type build() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type0 = this.buildPartial();
                if(!protoBuf$Type0.isInitialized()) {
                    throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(protoBuf$Type0);
                }
                return protoBuf$Type0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite$Builder
            public MessageLite build() {
                return this.build();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type buildPartial() {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type0 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type(this);
                int v = this.d;
                int v1 = 1;
                if((v & 1) == 1) {
                    this.e = Collections.unmodifiableList(this.e);
                    this.d &= -2;
                }
                protoBuf$Type0.d = this.e;
                if((v & 2) != 2) {
                    v1 = 0;
                }
                protoBuf$Type0.e = this.f;
                if((v & 4) == 4) {
                    v1 |= 2;
                }
                protoBuf$Type0.f = this.g;
                if((v & 8) == 8) {
                    v1 |= 4;
                }
                protoBuf$Type0.g = this.h;
                if((v & 16) == 16) {
                    v1 |= 8;
                }
                protoBuf$Type0.h = this.i;
                if((v & 0x20) == 0x20) {
                    v1 |= 16;
                }
                protoBuf$Type0.i = this.j;
                if((v & 0x40) == 0x40) {
                    v1 |= 0x20;
                }
                protoBuf$Type0.j = this.k;
                if((v & 0x80) == 0x80) {
                    v1 |= 0x40;
                }
                protoBuf$Type0.k = this.l;
                if((v & 0x100) == 0x100) {
                    v1 |= 0x80;
                }
                protoBuf$Type0.l = this.m;
                if((v & 0x200) == 0x200) {
                    v1 |= 0x100;
                }
                protoBuf$Type0.m = this.n;
                if((v & 0x400) == 0x400) {
                    v1 |= 0x200;
                }
                protoBuf$Type0.n = this.o;
                if((v & 0x800) == 0x800) {
                    v1 |= 0x400;
                }
                protoBuf$Type0.o = this.p;
                if((v & 0x1000) == 0x1000) {
                    v1 |= 0x800;
                }
                protoBuf$Type0.p = this.q;
                if((v & 0x2000) == 0x2000) {
                    v1 |= 0x1000;
                }
                protoBuf$Type0.q = this.r;
                protoBuf$Type0.c = v1;
                return protoBuf$Type0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public Object clone() throws CloneNotSupportedException {
                return this.clone();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder().mergeFrom(this.buildPartial());
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public ExtendableBuilder clone() {
                return this.clone();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getAbbreviatedType() {
                return this.p;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument getArgument(int v) {
                return (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument)this.e.get(v);
            }

            public int getArgumentCount() {
                return this.e.size();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getDefaultInstanceForType() {
                return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public GeneratedMessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public MessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getFlexibleUpperBound() {
                return this.h;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getOuterType() {
                return this.n;
            }

            public boolean hasAbbreviatedType() {
                return (this.d & 0x800) == 0x800;
            }

            public boolean hasFlexibleUpperBound() {
                return (this.d & 8) == 8;
            }

            public boolean hasOuterType() {
                return (this.d & 0x200) == 0x200;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for(int v = 0; v < this.getArgumentCount(); ++v) {
                    if(!this.getArgument(v).isInitialized()) {
                        return false;
                    }
                }
                if(this.hasFlexibleUpperBound() && !this.getFlexibleUpperBound().isInitialized()) {
                    return false;
                }
                if(this.hasOuterType() && !this.getOuterType().isInitialized()) {
                    return false;
                }
                return !this.hasAbbreviatedType() || this.getAbbreviatedType().isInitialized() ? this.extensionsAreInitialized() : false;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder mergeAbbreviatedType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type0) {
                this.p = (this.d & 0x800) != 0x800 || this.p == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance() ? protoBuf$Type0 : kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.p).mergeFrom(protoBuf$Type0).buildPartial();
                this.d |= 0x800;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder mergeFlexibleUpperBound(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type0) {
                this.h = (this.d & 8) != 8 || this.h == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance() ? protoBuf$Type0 : kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.h).mergeFrom(protoBuf$Type0).buildPartial();
                this.d |= 8;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type0) {
                if(protoBuf$Type0 == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance()) {
                    return this;
                }
                if(!protoBuf$Type0.d.isEmpty()) {
                    if(this.e.isEmpty()) {
                        this.e = protoBuf$Type0.d;
                        this.d &= -2;
                    }
                    else {
                        if((this.d & 1) != 1) {
                            this.e = new ArrayList(this.e);
                            this.d |= 1;
                        }
                        this.e.addAll(protoBuf$Type0.d);
                    }
                }
                if(protoBuf$Type0.hasNullable()) {
                    this.setNullable(protoBuf$Type0.getNullable());
                }
                if(protoBuf$Type0.hasFlexibleTypeCapabilitiesId()) {
                    this.setFlexibleTypeCapabilitiesId(protoBuf$Type0.getFlexibleTypeCapabilitiesId());
                }
                if(protoBuf$Type0.hasFlexibleUpperBound()) {
                    this.mergeFlexibleUpperBound(protoBuf$Type0.getFlexibleUpperBound());
                }
                if(protoBuf$Type0.hasFlexibleUpperBoundId()) {
                    this.setFlexibleUpperBoundId(protoBuf$Type0.getFlexibleUpperBoundId());
                }
                if(protoBuf$Type0.hasClassName()) {
                    this.setClassName(protoBuf$Type0.getClassName());
                }
                if(protoBuf$Type0.hasTypeParameter()) {
                    this.setTypeParameter(protoBuf$Type0.getTypeParameter());
                }
                if(protoBuf$Type0.hasTypeParameterName()) {
                    this.setTypeParameterName(protoBuf$Type0.getTypeParameterName());
                }
                if(protoBuf$Type0.hasTypeAliasName()) {
                    this.setTypeAliasName(protoBuf$Type0.getTypeAliasName());
                }
                if(protoBuf$Type0.hasOuterType()) {
                    this.mergeOuterType(protoBuf$Type0.getOuterType());
                }
                if(protoBuf$Type0.hasOuterTypeId()) {
                    this.setOuterTypeId(protoBuf$Type0.getOuterTypeId());
                }
                if(protoBuf$Type0.hasAbbreviatedType()) {
                    this.mergeAbbreviatedType(protoBuf$Type0.getAbbreviatedType());
                }
                if(protoBuf$Type0.hasAbbreviatedTypeId()) {
                    this.setAbbreviatedTypeId(protoBuf$Type0.getAbbreviatedTypeId());
                }
                if(protoBuf$Type0.hasFlags()) {
                    this.setFlags(protoBuf$Type0.getFlags());
                }
                this.mergeExtensionFields(protoBuf$Type0);
                this.setUnknownFields(this.getUnknownFields().concat(protoBuf$Type0.b));
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type1;
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type0;
                try {
                    try {
                        protoBuf$Type0 = null;
                        protoBuf$Type1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type)kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER.parsePartialFrom(codedInputStream0, extensionRegistryLite0);
                        goto label_13;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type)invalidProtocolBufferException0.getUnfinishedMessage();
                        try {
                            throw invalidProtocolBufferException0;
                        }
                        catch(Throwable throwable0) {
                            protoBuf$Type0 = protoBuf$Type2;
                        }
                    }
                }
                catch(Throwable throwable0) {
                }
                if(protoBuf$Type0 != null) {
                    this.mergeFrom(protoBuf$Type0);
                }
                throw throwable0;
            label_13:
                if(protoBuf$Type1 != null) {
                    this.mergeFrom(protoBuf$Type1);
                }
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedMessageLite0) {
                return this.mergeFrom(((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type)generatedMessageLite0));
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder mergeOuterType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type0) {
                this.n = (this.d & 0x200) != 0x200 || this.n == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance() ? protoBuf$Type0 : kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.n).mergeFrom(protoBuf$Type0).buildPartial();
                this.d |= 0x200;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder setAbbreviatedTypeId(int v) {
                this.d |= 0x1000;
                this.q = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder setClassName(int v) {
                this.d |= 0x20;
                this.j = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder setFlags(int v) {
                this.d |= 0x2000;
                this.r = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder setFlexibleTypeCapabilitiesId(int v) {
                this.d |= 4;
                this.g = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder setFlexibleUpperBoundId(int v) {
                this.d |= 16;
                this.i = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder setNullable(boolean z) {
                this.d |= 2;
                this.f = z;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder setOuterTypeId(int v) {
                this.d |= 0x400;
                this.o = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder setTypeAliasName(int v) {
                this.d |= 0x100;
                this.m = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder setTypeParameter(int v) {
                this.d |= 0x40;
                this.k = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder setTypeParameterName(int v) {
                this.d |= 0x80;
                this.l = v;
                return this;
            }
        }

        public static Parser PARSER;
        public final ByteString b;
        public int c;
        public List d;
        public boolean e;
        public int f;
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type m;
        public int n;
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type o;
        public int p;
        public int q;
        public byte r;
        public int s;
        public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type t;

        static {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER = new q();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/AbstractParser;-><init>()V
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type0 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type();
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.t = protoBuf$Type0;
            protoBuf$Type0.b();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type() {
            this.r = -1;
            this.s = -1;
            this.b = ByteString.EMPTY;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder protoBuf$Type$Builder0) {
            super(protoBuf$Type$Builder0);
            this.r = -1;
            this.s = -1;
            this.b = protoBuf$Type$Builder0.getUnknownFields();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) {
            this.r = -1;
            this.s = -1;
            this.b();
            Output byteString$Output0 = ByteString.newOutput();
            CodedOutputStream codedOutputStream0 = CodedOutputStream.newInstance(byteString$Output0, 1);
            boolean z = false;
            boolean z1 = false;
            while(!z1) {
                try {
                    try {
                        int v = codedInputStream0.readTag();
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder protoBuf$Type$Builder0 = null;
                        switch(v) {
                            case 0: {
                                z1 = true;
                                continue;
                            }
                            case 8: {
                                this.c |= 0x1000;
                                this.q = codedInputStream0.readInt32();
                                continue;
                            }
                            case 18: {
                                if(!z) {
                                    this.d = new ArrayList();
                                    z = true;
                                }
                                this.d.add(codedInputStream0.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.PARSER, extensionRegistryLite0));
                                continue;
                            }
                            case 24: {
                                this.c |= 1;
                                this.e = codedInputStream0.readBool();
                                continue;
                            }
                            case 0x20: {
                                this.c |= 2;
                                this.f = codedInputStream0.readInt32();
                                continue;
                            }
                            case 42: {
                                if((this.c & 4) == 4) {
                                    protoBuf$Type$Builder0 = this.g.toBuilder();
                                }
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type)codedInputStream0.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite0);
                                this.g = protoBuf$Type0;
                                if(protoBuf$Type$Builder0 != null) {
                                    protoBuf$Type$Builder0.mergeFrom(protoBuf$Type0);
                                    this.g = protoBuf$Type$Builder0.buildPartial();
                                }
                                this.c |= 4;
                                continue;
                            }
                            case 0x30: {
                                this.c |= 16;
                                this.i = codedInputStream0.readInt32();
                                continue;
                            }
                            case 56: {
                                this.c |= 0x20;
                                this.j = codedInputStream0.readInt32();
                                continue;
                            }
                            case 0x40: {
                                this.c |= 8;
                                this.h = codedInputStream0.readInt32();
                                continue;
                            }
                            case 72: {
                                this.c |= 0x40;
                                this.k = codedInputStream0.readInt32();
                                continue;
                            }
                            case 82: {
                                if((this.c & 0x100) == 0x100) {
                                    protoBuf$Type$Builder0 = this.m.toBuilder();
                                }
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type)codedInputStream0.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite0);
                                this.m = protoBuf$Type1;
                                if(protoBuf$Type$Builder0 != null) {
                                    protoBuf$Type$Builder0.mergeFrom(protoBuf$Type1);
                                    this.m = protoBuf$Type$Builder0.buildPartial();
                                }
                                this.c |= 0x100;
                                continue;
                            }
                            case 88: {
                                this.c |= 0x200;
                                this.n = codedInputStream0.readInt32();
                                continue;
                            }
                            case 0x60: {
                                this.c |= 0x80;
                                this.l = codedInputStream0.readInt32();
                                continue;
                            }
                            case 106: {
                                if((this.c & 0x400) == 0x400) {
                                    protoBuf$Type$Builder0 = this.o.toBuilder();
                                }
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type)codedInputStream0.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite0);
                                this.o = protoBuf$Type2;
                                if(protoBuf$Type$Builder0 != null) {
                                    protoBuf$Type$Builder0.mergeFrom(protoBuf$Type2);
                                    this.o = protoBuf$Type$Builder0.buildPartial();
                                }
                                this.c |= 0x400;
                                continue;
                            }
                            case 0x70: {
                                this.c |= 0x800;
                                this.p = codedInputStream0.readInt32();
                                continue;
                            }
                            default: {
                                if(!this.parseUnknownField(codedInputStream0, codedOutputStream0, extensionRegistryLite0, v)) {
                                    z1 = true;
                                    continue;
                                }
                                continue;
                            }
                        }
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                    }
                    catch(IOException iOException0) {
                        throw new InvalidProtocolBufferException(iOException0.getMessage()).setUnfinishedMessage(this);
                    }
                    throw invalidProtocolBufferException0.setUnfinishedMessage(this);
                }
                catch(Throwable throwable0) {
                }
                if(z) {
                    this.d = Collections.unmodifiableList(this.d);
                }
                try {
                    codedOutputStream0.flush();
                    goto label_91;
                }
                catch(IOException unused_ex) {
                    goto label_91;
                }
                catch(Throwable throwable1) {
                }
                this.b = byteString$Output0.toByteString();
                throw throwable1;
            label_91:
                this.b = byteString$Output0.toByteString();
                this.makeExtensionsImmutable();
                throw throwable0;
            }
            if(z) {
                this.d = Collections.unmodifiableList(this.d);
            }
            try {
                codedOutputStream0.flush();
                goto label_102;
            }
            catch(IOException unused_ex) {
                goto label_102;
            }
            catch(Throwable throwable2) {
            }
            this.b = byteString$Output0.toByteString();
            throw throwable2;
        label_102:
            this.b = byteString$Output0.toByteString();
            this.makeExtensionsImmutable();
        }

        public final void b() {
            this.d = Collections.emptyList();
            this.e = false;
            this.f = 0;
            this.g = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            this.h = 0;
            this.i = 0;
            this.j = 0;
            this.k = 0;
            this.l = 0;
            this.m = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            this.n = 0;
            this.o = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            this.p = 0;
            this.q = 0;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getAbbreviatedType() {
            return this.o;
        }

        public int getAbbreviatedTypeId() {
            return this.p;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument getArgument(int v) {
            return (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument)this.d.get(v);
        }

        public int getArgumentCount() {
            return this.d.size();
        }

        public List getArgumentList() {
            return this.d;
        }

        public int getClassName() {
            return this.i;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getDefaultInstance() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.t;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getDefaultInstanceForType() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.t;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public MessageLite getDefaultInstanceForType() {
            return this.getDefaultInstanceForType();
        }

        public int getFlags() {
            return this.q;
        }

        public int getFlexibleTypeCapabilitiesId() {
            return this.f;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getFlexibleUpperBound() {
            return this.g;
        }

        public int getFlexibleUpperBoundId() {
            return this.h;
        }

        public boolean getNullable() {
            return this.e;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getOuterType() {
            return this.m;
        }

        public int getOuterTypeId() {
            return this.n;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser getParserForType() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int v1 = this.s;
            if(v1 != -1) {
                return v1;
            }
            int v2 = (this.c & 0x1000) == 0x1000 ? CodedOutputStream.computeInt32Size(1, this.q) : 0;
            for(int v = 0; v < this.d.size(); ++v) {
                v2 += CodedOutputStream.computeMessageSize(2, ((MessageLite)this.d.get(v)));
            }
            if((this.c & 1) == 1) {
                v2 += CodedOutputStream.computeBoolSize(3, this.e);
            }
            if((this.c & 2) == 2) {
                v2 += CodedOutputStream.computeInt32Size(4, this.f);
            }
            if((this.c & 4) == 4) {
                v2 += CodedOutputStream.computeMessageSize(5, this.g);
            }
            if((this.c & 16) == 16) {
                v2 += CodedOutputStream.computeInt32Size(6, this.i);
            }
            if((this.c & 0x20) == 0x20) {
                v2 += CodedOutputStream.computeInt32Size(7, this.j);
            }
            if((this.c & 8) == 8) {
                v2 += CodedOutputStream.computeInt32Size(8, this.h);
            }
            if((this.c & 0x40) == 0x40) {
                v2 += CodedOutputStream.computeInt32Size(9, this.k);
            }
            if((this.c & 0x100) == 0x100) {
                v2 += CodedOutputStream.computeMessageSize(10, this.m);
            }
            if((this.c & 0x200) == 0x200) {
                v2 += CodedOutputStream.computeInt32Size(11, this.n);
            }
            if((this.c & 0x80) == 0x80) {
                v2 += CodedOutputStream.computeInt32Size(12, this.l);
            }
            if((this.c & 0x400) == 0x400) {
                v2 += CodedOutputStream.computeMessageSize(13, this.o);
            }
            if((this.c & 0x800) == 0x800) {
                v2 += CodedOutputStream.computeInt32Size(14, this.p);
            }
            int v3 = this.extensionsSerializedSize();
            int v4 = this.b.size() + (v3 + v2);
            this.s = v4;
            return v4;
        }

        public int getTypeAliasName() {
            return this.l;
        }

        public int getTypeParameter() {
            return this.j;
        }

        public int getTypeParameterName() {
            return this.k;
        }

        public boolean hasAbbreviatedType() {
            return (this.c & 0x400) == 0x400;
        }

        public boolean hasAbbreviatedTypeId() {
            return (this.c & 0x800) == 0x800;
        }

        public boolean hasClassName() {
            return (this.c & 16) == 16;
        }

        public boolean hasFlags() {
            return (this.c & 0x1000) == 0x1000;
        }

        public boolean hasFlexibleTypeCapabilitiesId() {
            return (this.c & 2) == 2;
        }

        public boolean hasFlexibleUpperBound() {
            return (this.c & 4) == 4;
        }

        public boolean hasFlexibleUpperBoundId() {
            return (this.c & 8) == 8;
        }

        public boolean hasNullable() {
            return (this.c & 1) == 1;
        }

        public boolean hasOuterType() {
            return (this.c & 0x100) == 0x100;
        }

        public boolean hasOuterTypeId() {
            return (this.c & 0x200) == 0x200;
        }

        public boolean hasTypeAliasName() {
            return (this.c & 0x80) == 0x80;
        }

        public boolean hasTypeParameter() {
            return (this.c & 0x20) == 0x20;
        }

        public boolean hasTypeParameterName() {
            return (this.c & 0x40) == 0x40;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            int v = this.r;
            if(v == 1) {
                return true;
            }
            if(v == 0) {
                return false;
            }
            for(int v1 = 0; v1 < this.getArgumentCount(); ++v1) {
                if(!this.getArgument(v1).isInitialized()) {
                    this.r = 0;
                    return false;
                }
            }
            if(this.hasFlexibleUpperBound() && !this.getFlexibleUpperBound().isInitialized()) {
                this.r = 0;
                return false;
            }
            if(this.hasOuterType() && !this.getOuterType().isInitialized()) {
                this.r = 0;
                return false;
            }
            if(this.hasAbbreviatedType() && !this.getAbbreviatedType().isInitialized()) {
                this.r = 0;
                return false;
            }
            if(!this.extensionsAreInitialized()) {
                this.r = 0;
                return false;
            }
            this.r = 1;
            return true;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder newBuilder() {
            return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder newBuilder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type0) {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder().mergeFrom(protoBuf$Type0);
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder newBuilderForType() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder newBuilderForType() {
            return this.newBuilderForType();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder toBuilder() {
            return kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder toBuilder() {
            return this.toBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream0) throws IOException {
            this.getSerializedSize();
            ExtensionWriter generatedMessageLite$ExtendableMessage$ExtensionWriter0 = this.newExtensionWriter();
            if((this.c & 0x1000) == 0x1000) {
                codedOutputStream0.writeInt32(1, this.q);
            }
            for(int v = 0; v < this.d.size(); ++v) {
                codedOutputStream0.writeMessage(2, ((MessageLite)this.d.get(v)));
            }
            if((this.c & 1) == 1) {
                codedOutputStream0.writeBool(3, this.e);
            }
            if((this.c & 2) == 2) {
                codedOutputStream0.writeInt32(4, this.f);
            }
            if((this.c & 4) == 4) {
                codedOutputStream0.writeMessage(5, this.g);
            }
            if((this.c & 16) == 16) {
                codedOutputStream0.writeInt32(6, this.i);
            }
            if((this.c & 0x20) == 0x20) {
                codedOutputStream0.writeInt32(7, this.j);
            }
            if((this.c & 8) == 8) {
                codedOutputStream0.writeInt32(8, this.h);
            }
            if((this.c & 0x40) == 0x40) {
                codedOutputStream0.writeInt32(9, this.k);
            }
            if((this.c & 0x100) == 0x100) {
                codedOutputStream0.writeMessage(10, this.m);
            }
            if((this.c & 0x200) == 0x200) {
                codedOutputStream0.writeInt32(11, this.n);
            }
            if((this.c & 0x80) == 0x80) {
                codedOutputStream0.writeInt32(12, this.l);
            }
            if((this.c & 0x400) == 0x400) {
                codedOutputStream0.writeMessage(13, this.o);
            }
            if((this.c & 0x800) == 0x800) {
                codedOutputStream0.writeInt32(14, this.p);
            }
            generatedMessageLite$ExtendableMessage$ExtensionWriter0.writeUntil(200, codedOutputStream0);
            codedOutputStream0.writeRawBytes(this.b);
        }
    }

    public static final class TypeAlias extends ExtendableMessage implements ProtoBuf.TypeAliasOrBuilder {
        public static final class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder extends ExtendableBuilder implements ProtoBuf.TypeAliasOrBuilder {
            public int d;
            public int e;
            public int f;
            public List g;
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type h;
            public int i;
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type j;
            public int k;
            public List l;
            public List m;

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder() {
                this.e = 6;
                this.g = Collections.emptyList();
                this.h = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
                this.j = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
                this.l = Collections.emptyList();
                this.m = Collections.emptyList();
            }

            public TypeAlias build() {
                TypeAlias protoBuf$TypeAlias0 = this.buildPartial();
                if(!protoBuf$TypeAlias0.isInitialized()) {
                    throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(protoBuf$TypeAlias0);
                }
                return protoBuf$TypeAlias0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite$Builder
            public MessageLite build() {
                return this.build();
            }

            public TypeAlias buildPartial() {
                TypeAlias protoBuf$TypeAlias0 = new TypeAlias(this);
                int v = this.d;
                int v1 = (v & 1) == 1 ? 1 : 0;
                protoBuf$TypeAlias0.d = this.e;
                if((v & 2) == 2) {
                    v1 |= 2;
                }
                protoBuf$TypeAlias0.e = this.f;
                if((v & 4) == 4) {
                    this.g = Collections.unmodifiableList(this.g);
                    this.d &= -5;
                }
                protoBuf$TypeAlias0.f = this.g;
                if((v & 8) == 8) {
                    v1 |= 4;
                }
                protoBuf$TypeAlias0.g = this.h;
                if((v & 16) == 16) {
                    v1 |= 8;
                }
                protoBuf$TypeAlias0.h = this.i;
                if((v & 0x20) == 0x20) {
                    v1 |= 16;
                }
                protoBuf$TypeAlias0.i = this.j;
                if((v & 0x40) == 0x40) {
                    v1 |= 0x20;
                }
                protoBuf$TypeAlias0.j = this.k;
                if((this.d & 0x80) == 0x80) {
                    this.l = Collections.unmodifiableList(this.l);
                    this.d &= 0xFFFFFF7F;
                }
                protoBuf$TypeAlias0.k = this.l;
                if((this.d & 0x100) == 0x100) {
                    this.m = Collections.unmodifiableList(this.m);
                    this.d &= 0xFFFFFEFF;
                }
                protoBuf$TypeAlias0.l = this.m;
                protoBuf$TypeAlias0.c = v1;
                return protoBuf$TypeAlias0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public Object clone() throws CloneNotSupportedException {
                return this.clone();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder().mergeFrom(this.buildPartial());
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public ExtendableBuilder clone() {
                return this.clone();
            }

            public Annotation getAnnotation(int v) {
                return (Annotation)this.l.get(v);
            }

            public int getAnnotationCount() {
                return this.l.size();
            }

            public TypeAlias getDefaultInstanceForType() {
                return TypeAlias.getDefaultInstance();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public GeneratedMessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public MessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getExpandedType() {
                return this.j;
            }

            public TypeParameter getTypeParameter(int v) {
                return (TypeParameter)this.g.get(v);
            }

            public int getTypeParameterCount() {
                return this.g.size();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getUnderlyingType() {
                return this.h;
            }

            public boolean hasExpandedType() {
                return (this.d & 0x20) == 0x20;
            }

            public boolean hasName() {
                return (this.d & 2) == 2;
            }

            public boolean hasUnderlyingType() {
                return (this.d & 8) == 8;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if(!this.hasName()) {
                    return false;
                }
                for(int v = 0; v < this.getTypeParameterCount(); ++v) {
                    if(!this.getTypeParameter(v).isInitialized()) {
                        return false;
                    }
                }
                if(this.hasUnderlyingType() && !this.getUnderlyingType().isInitialized()) {
                    return false;
                }
                if(this.hasExpandedType() && !this.getExpandedType().isInitialized()) {
                    return false;
                }
                for(int v1 = 0; v1 < this.getAnnotationCount(); ++v1) {
                    if(!this.getAnnotation(v1).isInitialized()) {
                        return false;
                    }
                }
                return this.extensionsAreInitialized();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder mergeExpandedType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type0) {
                this.j = (this.d & 0x20) != 0x20 || this.j == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance() ? protoBuf$Type0 : kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.j).mergeFrom(protoBuf$Type0).buildPartial();
                this.d |= 0x20;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder mergeFrom(TypeAlias protoBuf$TypeAlias0) {
                if(protoBuf$TypeAlias0 == TypeAlias.getDefaultInstance()) {
                    return this;
                }
                if(protoBuf$TypeAlias0.hasFlags()) {
                    this.setFlags(protoBuf$TypeAlias0.getFlags());
                }
                if(protoBuf$TypeAlias0.hasName()) {
                    this.setName(protoBuf$TypeAlias0.getName());
                }
                if(!protoBuf$TypeAlias0.f.isEmpty()) {
                    if(this.g.isEmpty()) {
                        this.g = protoBuf$TypeAlias0.f;
                        this.d &= -5;
                    }
                    else {
                        if((this.d & 4) != 4) {
                            this.g = new ArrayList(this.g);
                            this.d |= 4;
                        }
                        this.g.addAll(protoBuf$TypeAlias0.f);
                    }
                }
                if(protoBuf$TypeAlias0.hasUnderlyingType()) {
                    this.mergeUnderlyingType(protoBuf$TypeAlias0.getUnderlyingType());
                }
                if(protoBuf$TypeAlias0.hasUnderlyingTypeId()) {
                    this.setUnderlyingTypeId(protoBuf$TypeAlias0.getUnderlyingTypeId());
                }
                if(protoBuf$TypeAlias0.hasExpandedType()) {
                    this.mergeExpandedType(protoBuf$TypeAlias0.getExpandedType());
                }
                if(protoBuf$TypeAlias0.hasExpandedTypeId()) {
                    this.setExpandedTypeId(protoBuf$TypeAlias0.getExpandedTypeId());
                }
                if(!protoBuf$TypeAlias0.k.isEmpty()) {
                    if(this.l.isEmpty()) {
                        this.l = protoBuf$TypeAlias0.k;
                        this.d &= 0xFFFFFF7F;
                    }
                    else {
                        if((this.d & 0x80) != 0x80) {
                            this.l = new ArrayList(this.l);
                            this.d |= 0x80;
                        }
                        this.l.addAll(protoBuf$TypeAlias0.k);
                    }
                }
                if(!protoBuf$TypeAlias0.l.isEmpty()) {
                    if(this.m.isEmpty()) {
                        this.m = protoBuf$TypeAlias0.l;
                        this.d &= 0xFFFFFEFF;
                    }
                    else {
                        if((this.d & 0x100) != 0x100) {
                            this.m = new ArrayList(this.m);
                            this.d |= 0x100;
                        }
                        this.m.addAll(protoBuf$TypeAlias0.l);
                    }
                }
                this.mergeExtensionFields(protoBuf$TypeAlias0);
                this.setUnknownFields(this.getUnknownFields().concat(protoBuf$TypeAlias0.b));
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                TypeAlias protoBuf$TypeAlias1;
                TypeAlias protoBuf$TypeAlias0;
                try {
                    try {
                        protoBuf$TypeAlias0 = null;
                        protoBuf$TypeAlias1 = (TypeAlias)TypeAlias.PARSER.parsePartialFrom(codedInputStream0, extensionRegistryLite0);
                        goto label_13;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                        TypeAlias protoBuf$TypeAlias2 = (TypeAlias)invalidProtocolBufferException0.getUnfinishedMessage();
                        try {
                            throw invalidProtocolBufferException0;
                        }
                        catch(Throwable throwable0) {
                            protoBuf$TypeAlias0 = protoBuf$TypeAlias2;
                        }
                    }
                }
                catch(Throwable throwable0) {
                }
                if(protoBuf$TypeAlias0 != null) {
                    this.mergeFrom(protoBuf$TypeAlias0);
                }
                throw throwable0;
            label_13:
                if(protoBuf$TypeAlias1 != null) {
                    this.mergeFrom(protoBuf$TypeAlias1);
                }
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedMessageLite0) {
                return this.mergeFrom(((TypeAlias)generatedMessageLite0));
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder mergeUnderlyingType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type0) {
                this.h = (this.d & 8) != 8 || this.h == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance() ? protoBuf$Type0 : kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.h).mergeFrom(protoBuf$Type0).buildPartial();
                this.d |= 8;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder setExpandedTypeId(int v) {
                this.d |= 0x40;
                this.k = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder setFlags(int v) {
                this.d |= 1;
                this.e = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder setName(int v) {
                this.d |= 2;
                this.f = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder setUnderlyingTypeId(int v) {
                this.d |= 16;
                this.i = v;
                return this;
            }
        }

        public static Parser PARSER;
        public final ByteString b;
        public int c;
        public int d;
        public int e;
        public List f;
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type g;
        public int h;
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type i;
        public int j;
        public List k;
        public List l;
        public byte m;
        public int n;
        public static final TypeAlias o;

        static {
            TypeAlias.PARSER = new s();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/AbstractParser;-><init>()V
            TypeAlias protoBuf$TypeAlias0 = new TypeAlias();
            TypeAlias.o = protoBuf$TypeAlias0;
            protoBuf$TypeAlias0.b();
        }

        public TypeAlias() {
            this.m = -1;
            this.n = -1;
            this.b = ByteString.EMPTY;
        }

        public TypeAlias(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder protoBuf$TypeAlias$Builder0) {
            super(protoBuf$TypeAlias$Builder0);
            this.m = -1;
            this.n = -1;
            this.b = protoBuf$TypeAlias$Builder0.getUnknownFields();
        }

        public TypeAlias(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) {
            int v2;
            this.m = -1;
            this.n = -1;
            this.b();
            Output byteString$Output0 = ByteString.newOutput();
            CodedOutputStream codedOutputStream0 = CodedOutputStream.newInstance(byteString$Output0, 1);
            int v = 0;
            boolean z = false;
            while(!z) {
                try {
                    try {
                        int v1 = codedInputStream0.readTag();
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder protoBuf$Type$Builder0 = null;
                    alab1:
                        switch(v1) {
                            case 0: {
                            label_13:
                                z = true;
                                continue;
                            }
                            case 8: {
                                this.c |= 1;
                                this.d = codedInputStream0.readInt32();
                                continue;
                            }
                            case 16: {
                                this.c |= 2;
                                this.e = codedInputStream0.readInt32();
                                continue;
                            }
                            case 26: {
                                if((v & 4) != 4) {
                                    this.f = new ArrayList();
                                    v |= 4;
                                }
                                this.f.add(codedInputStream0.readMessage(TypeParameter.PARSER, extensionRegistryLite0));
                                continue;
                            }
                            case 34: {
                                if((this.c & 4) == 4) {
                                    protoBuf$Type$Builder0 = this.g.toBuilder();
                                }
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type)codedInputStream0.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite0);
                                this.g = protoBuf$Type0;
                                if(protoBuf$Type$Builder0 != null) {
                                    protoBuf$Type$Builder0.mergeFrom(protoBuf$Type0);
                                    this.g = protoBuf$Type$Builder0.buildPartial();
                                }
                                this.c |= 4;
                                continue;
                            }
                            case 40: {
                                this.c |= 8;
                                this.h = codedInputStream0.readInt32();
                                continue;
                            }
                            case 50: {
                                if((this.c & 16) == 16) {
                                    protoBuf$Type$Builder0 = this.i.toBuilder();
                                }
                                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type)codedInputStream0.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite0);
                                this.i = protoBuf$Type1;
                                if(protoBuf$Type$Builder0 != null) {
                                    protoBuf$Type$Builder0.mergeFrom(protoBuf$Type1);
                                    this.i = protoBuf$Type$Builder0.buildPartial();
                                }
                                this.c |= 16;
                                continue;
                            }
                            case 56: {
                                this.c |= 0x20;
                                this.j = codedInputStream0.readInt32();
                                continue;
                            }
                            case 66: {
                                if((v & 0x80) != 0x80) {
                                    this.k = new ArrayList();
                                    v |= 0x80;
                                }
                                this.k.add(codedInputStream0.readMessage(Annotation.PARSER, extensionRegistryLite0));
                                continue;
                            }
                            case 0xF8: {
                                if((v & 0x100) != 0x100) {
                                    this.l = new ArrayList();
                                    v |= 0x100;
                                }
                                this.l.add(codedInputStream0.readInt32());
                                continue;
                            }
                            case 0xFA: {
                                v2 = codedInputStream0.pushLimit(codedInputStream0.readRawVarint32());
                                if((v & 0x100) != 0x100 && codedInputStream0.getBytesUntilLimit() > 0) {
                                    this.l = new ArrayList();
                                    v |= 0x100;
                                }
                                while(true) {
                                    if(codedInputStream0.getBytesUntilLimit() <= 0) {
                                        break alab1;
                                    }
                                    this.l.add(codedInputStream0.readInt32());
                                }
                            }
                            default: {
                                if(!this.parseUnknownField(codedInputStream0, codedOutputStream0, extensionRegistryLite0, v1)) {
                                    goto label_13;
                                }
                                continue;
                            }
                        }
                        codedInputStream0.popLimit(v2);
                        continue;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                    }
                    catch(IOException iOException0) {
                        throw new InvalidProtocolBufferException(iOException0.getMessage()).setUnfinishedMessage(this);
                    }
                    throw invalidProtocolBufferException0.setUnfinishedMessage(this);
                }
                catch(Throwable throwable0) {
                }
                if((v & 4) == 4) {
                    this.f = Collections.unmodifiableList(this.f);
                }
                if((v & 0x80) == 0x80) {
                    this.k = Collections.unmodifiableList(this.k);
                }
                if((v & 0x100) == 0x100) {
                    this.l = Collections.unmodifiableList(this.l);
                }
                try {
                    codedOutputStream0.flush();
                    goto label_87;
                }
                catch(IOException unused_ex) {
                    goto label_87;
                }
                catch(Throwable throwable1) {
                }
                this.b = byteString$Output0.toByteString();
                throw throwable1;
            label_87:
                this.b = byteString$Output0.toByteString();
                this.makeExtensionsImmutable();
                throw throwable0;
            }
            if((v & 4) == 4) {
                this.f = Collections.unmodifiableList(this.f);
            }
            if((v & 0x80) == 0x80) {
                this.k = Collections.unmodifiableList(this.k);
            }
            if((v & 0x100) == 0x100) {
                this.l = Collections.unmodifiableList(this.l);
            }
            try {
                codedOutputStream0.flush();
                goto label_101;
            }
            catch(IOException unused_ex) {
                goto label_101;
            }
            catch(Throwable throwable2) {
            }
            this.b = byteString$Output0.toByteString();
            throw throwable2;
        label_101:
            this.b = byteString$Output0.toByteString();
            this.makeExtensionsImmutable();
        }

        public final void b() {
            this.d = 6;
            this.e = 0;
            this.f = Collections.emptyList();
            this.g = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            this.h = 0;
            this.i = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            this.j = 0;
            this.k = Collections.emptyList();
            this.l = Collections.emptyList();
        }

        public Annotation getAnnotation(int v) {
            return (Annotation)this.k.get(v);
        }

        public int getAnnotationCount() {
            return this.k.size();
        }

        public List getAnnotationList() {
            return this.k;
        }

        public static TypeAlias getDefaultInstance() {
            return TypeAlias.o;
        }

        public TypeAlias getDefaultInstanceForType() {
            return TypeAlias.o;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public MessageLite getDefaultInstanceForType() {
            return this.getDefaultInstanceForType();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getExpandedType() {
            return this.i;
        }

        public int getExpandedTypeId() {
            return this.j;
        }

        public int getFlags() {
            return this.d;
        }

        public int getName() {
            return this.e;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser getParserForType() {
            return TypeAlias.PARSER;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int v1 = this.n;
            if(v1 != -1) {
                return v1;
            }
            int v2 = (this.c & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.d) : 0;
            if((this.c & 2) == 2) {
                v2 += CodedOutputStream.computeInt32Size(2, this.e);
            }
            for(int v3 = 0; v3 < this.f.size(); ++v3) {
                v2 += CodedOutputStream.computeMessageSize(3, ((MessageLite)this.f.get(v3)));
            }
            if((this.c & 4) == 4) {
                v2 += CodedOutputStream.computeMessageSize(4, this.g);
            }
            if((this.c & 8) == 8) {
                v2 += CodedOutputStream.computeInt32Size(5, this.h);
            }
            if((this.c & 16) == 16) {
                v2 += CodedOutputStream.computeMessageSize(6, this.i);
            }
            if((this.c & 0x20) == 0x20) {
                v2 += CodedOutputStream.computeInt32Size(7, this.j);
            }
            for(int v4 = 0; v4 < this.k.size(); ++v4) {
                v2 += CodedOutputStream.computeMessageSize(8, ((MessageLite)this.k.get(v4)));
            }
            int v5 = 0;
            for(int v = 0; v < this.l.size(); ++v) {
                v5 += CodedOutputStream.computeInt32SizeNoTag(((int)(((Integer)this.l.get(v)))));
            }
            int v6 = this.extensionsSerializedSize();
            int v7 = this.b.size() + (v6 + (this.getVersionRequirementList().size() * 2 + (v2 + v5)));
            this.n = v7;
            return v7;
        }

        public TypeParameter getTypeParameter(int v) {
            return (TypeParameter)this.f.get(v);
        }

        public int getTypeParameterCount() {
            return this.f.size();
        }

        public List getTypeParameterList() {
            return this.f;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getUnderlyingType() {
            return this.g;
        }

        public int getUnderlyingTypeId() {
            return this.h;
        }

        public List getVersionRequirementList() {
            return this.l;
        }

        public boolean hasExpandedType() {
            return (this.c & 16) == 16;
        }

        public boolean hasExpandedTypeId() {
            return (this.c & 0x20) == 0x20;
        }

        public boolean hasFlags() {
            return (this.c & 1) == 1;
        }

        public boolean hasName() {
            return (this.c & 2) == 2;
        }

        public boolean hasUnderlyingType() {
            return (this.c & 4) == 4;
        }

        public boolean hasUnderlyingTypeId() {
            return (this.c & 8) == 8;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            int v = this.m;
            if(v == 1) {
                return true;
            }
            if(v == 0) {
                return false;
            }
            if(!this.hasName()) {
                this.m = 0;
                return false;
            }
            for(int v1 = 0; v1 < this.getTypeParameterCount(); ++v1) {
                if(!this.getTypeParameter(v1).isInitialized()) {
                    this.m = 0;
                    return false;
                }
            }
            if(this.hasUnderlyingType() && !this.getUnderlyingType().isInitialized()) {
                this.m = 0;
                return false;
            }
            if(this.hasExpandedType() && !this.getExpandedType().isInitialized()) {
                this.m = 0;
                return false;
            }
            for(int v2 = 0; v2 < this.getAnnotationCount(); ++v2) {
                if(!this.getAnnotation(v2).isInitialized()) {
                    this.m = 0;
                    return false;
                }
            }
            if(!this.extensionsAreInitialized()) {
                this.m = 0;
                return false;
            }
            this.m = 1;
            return true;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder newBuilder() {
            return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder newBuilder(TypeAlias protoBuf$TypeAlias0) {
            return TypeAlias.newBuilder().mergeFrom(protoBuf$TypeAlias0);
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder newBuilderForType() {
            return TypeAlias.newBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder newBuilderForType() {
            return this.newBuilderForType();
        }

        public static TypeAlias parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (TypeAlias)TypeAlias.PARSER.parseDelimitedFrom(inputStream0, extensionRegistryLite0);
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder toBuilder() {
            return TypeAlias.newBuilder(this);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder toBuilder() {
            return this.toBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream0) throws IOException {
            this.getSerializedSize();
            ExtensionWriter generatedMessageLite$ExtendableMessage$ExtensionWriter0 = this.newExtensionWriter();
            if((this.c & 1) == 1) {
                codedOutputStream0.writeInt32(1, this.d);
            }
            if((this.c & 2) == 2) {
                codedOutputStream0.writeInt32(2, this.e);
            }
            for(int v1 = 0; v1 < this.f.size(); ++v1) {
                codedOutputStream0.writeMessage(3, ((MessageLite)this.f.get(v1)));
            }
            if((this.c & 4) == 4) {
                codedOutputStream0.writeMessage(4, this.g);
            }
            if((this.c & 8) == 8) {
                codedOutputStream0.writeInt32(5, this.h);
            }
            if((this.c & 16) == 16) {
                codedOutputStream0.writeMessage(6, this.i);
            }
            if((this.c & 0x20) == 0x20) {
                codedOutputStream0.writeInt32(7, this.j);
            }
            for(int v2 = 0; v2 < this.k.size(); ++v2) {
                codedOutputStream0.writeMessage(8, ((MessageLite)this.k.get(v2)));
            }
            for(int v = 0; v < this.l.size(); ++v) {
                codedOutputStream0.writeInt32(0x1F, ((int)(((Integer)this.l.get(v)))));
            }
            generatedMessageLite$ExtendableMessage$ExtensionWriter0.writeUntil(200, codedOutputStream0);
            codedOutputStream0.writeRawBytes(this.b);
        }
    }

    public static final class TypeParameter extends ExtendableMessage implements ProtoBuf.TypeParameterOrBuilder {
        public static final class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder extends ExtendableBuilder implements ProtoBuf.TypeParameterOrBuilder {
            public int d;
            public int e;
            public int f;
            public boolean g;
            public Variance h;
            public List i;
            public List j;

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder() {
                this.h = Variance.INV;
                this.i = Collections.emptyList();
                this.j = Collections.emptyList();
            }

            public TypeParameter build() {
                TypeParameter protoBuf$TypeParameter0 = this.buildPartial();
                if(!protoBuf$TypeParameter0.isInitialized()) {
                    throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(protoBuf$TypeParameter0);
                }
                return protoBuf$TypeParameter0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite$Builder
            public MessageLite build() {
                return this.build();
            }

            public TypeParameter buildPartial() {
                TypeParameter protoBuf$TypeParameter0 = new TypeParameter(this);
                int v = this.d;
                int v1 = (v & 1) == 1 ? 1 : 0;
                protoBuf$TypeParameter0.d = this.e;
                if((v & 2) == 2) {
                    v1 |= 2;
                }
                protoBuf$TypeParameter0.e = this.f;
                if((v & 4) == 4) {
                    v1 |= 4;
                }
                protoBuf$TypeParameter0.f = this.g;
                if((v & 8) == 8) {
                    v1 |= 8;
                }
                protoBuf$TypeParameter0.g = this.h;
                if((v & 16) == 16) {
                    this.i = Collections.unmodifiableList(this.i);
                    this.d &= -17;
                }
                protoBuf$TypeParameter0.h = this.i;
                if((this.d & 0x20) == 0x20) {
                    this.j = Collections.unmodifiableList(this.j);
                    this.d &= -33;
                }
                protoBuf$TypeParameter0.i = this.j;
                protoBuf$TypeParameter0.c = v1;
                return protoBuf$TypeParameter0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public Object clone() throws CloneNotSupportedException {
                return this.clone();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder().mergeFrom(this.buildPartial());
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public ExtendableBuilder clone() {
                return this.clone();
            }

            public TypeParameter getDefaultInstanceForType() {
                return TypeParameter.getDefaultInstance();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public GeneratedMessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public MessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getUpperBound(int v) {
                return (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type)this.i.get(v);
            }

            public int getUpperBoundCount() {
                return this.i.size();
            }

            public boolean hasId() {
                return (this.d & 1) == 1;
            }

            public boolean hasName() {
                return (this.d & 2) == 2;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if(!this.hasId()) {
                    return false;
                }
                if(!this.hasName()) {
                    return false;
                }
                for(int v = 0; v < this.getUpperBoundCount(); ++v) {
                    if(!this.getUpperBound(v).isInitialized()) {
                        return false;
                    }
                }
                return this.extensionsAreInitialized();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder mergeFrom(TypeParameter protoBuf$TypeParameter0) {
                if(protoBuf$TypeParameter0 == TypeParameter.getDefaultInstance()) {
                    return this;
                }
                if(protoBuf$TypeParameter0.hasId()) {
                    this.setId(protoBuf$TypeParameter0.getId());
                }
                if(protoBuf$TypeParameter0.hasName()) {
                    this.setName(protoBuf$TypeParameter0.getName());
                }
                if(protoBuf$TypeParameter0.hasReified()) {
                    this.setReified(protoBuf$TypeParameter0.getReified());
                }
                if(protoBuf$TypeParameter0.hasVariance()) {
                    this.setVariance(protoBuf$TypeParameter0.getVariance());
                }
                if(!protoBuf$TypeParameter0.h.isEmpty()) {
                    if(this.i.isEmpty()) {
                        this.i = protoBuf$TypeParameter0.h;
                        this.d &= -17;
                    }
                    else {
                        if((this.d & 16) != 16) {
                            this.i = new ArrayList(this.i);
                            this.d |= 16;
                        }
                        this.i.addAll(protoBuf$TypeParameter0.h);
                    }
                }
                if(!protoBuf$TypeParameter0.i.isEmpty()) {
                    if(this.j.isEmpty()) {
                        this.j = protoBuf$TypeParameter0.i;
                        this.d &= -33;
                    }
                    else {
                        if((this.d & 0x20) != 0x20) {
                            this.j = new ArrayList(this.j);
                            this.d |= 0x20;
                        }
                        this.j.addAll(protoBuf$TypeParameter0.i);
                    }
                }
                this.mergeExtensionFields(protoBuf$TypeParameter0);
                this.setUnknownFields(this.getUnknownFields().concat(protoBuf$TypeParameter0.b));
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                TypeParameter protoBuf$TypeParameter1;
                TypeParameter protoBuf$TypeParameter0;
                try {
                    try {
                        protoBuf$TypeParameter0 = null;
                        protoBuf$TypeParameter1 = (TypeParameter)TypeParameter.PARSER.parsePartialFrom(codedInputStream0, extensionRegistryLite0);
                        goto label_13;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                        TypeParameter protoBuf$TypeParameter2 = (TypeParameter)invalidProtocolBufferException0.getUnfinishedMessage();
                        try {
                            throw invalidProtocolBufferException0;
                        }
                        catch(Throwable throwable0) {
                            protoBuf$TypeParameter0 = protoBuf$TypeParameter2;
                        }
                    }
                }
                catch(Throwable throwable0) {
                }
                if(protoBuf$TypeParameter0 != null) {
                    this.mergeFrom(protoBuf$TypeParameter0);
                }
                throw throwable0;
            label_13:
                if(protoBuf$TypeParameter1 != null) {
                    this.mergeFrom(protoBuf$TypeParameter1);
                }
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedMessageLite0) {
                return this.mergeFrom(((TypeParameter)generatedMessageLite0));
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder setId(int v) {
                this.d |= 1;
                this.e = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder setName(int v) {
                this.d |= 2;
                this.f = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder setReified(boolean z) {
                this.d |= 4;
                this.g = z;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder setVariance(Variance protoBuf$TypeParameter$Variance0) {
                protoBuf$TypeParameter$Variance0.getClass();
                this.d |= 8;
                this.h = protoBuf$TypeParameter$Variance0;
                return this;
            }
        }

        public static enum Variance implements EnumLite {
            IN(0),
            OUT(1),
            INV(2);

            public final int a;

            public Variance(int v1) {
                this.a = v1;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.Internal$EnumLite
            public final int getNumber() {
                return this.a;
            }

            public static Variance valueOf(int v) {
                switch(v) {
                    case 0: {
                        return Variance.IN;
                    }
                    case 1: {
                        return Variance.OUT;
                    }
                    case 2: {
                        return Variance.INV;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }

        public static Parser PARSER;
        public final ByteString b;
        public int c;
        public int d;
        public int e;
        public boolean f;
        public Variance g;
        public List h;
        public List i;
        public int j;
        public byte k;
        public int l;
        public static final TypeParameter m;

        static {
            TypeParameter.PARSER = new t();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/AbstractParser;-><init>()V
            TypeParameter protoBuf$TypeParameter0 = new TypeParameter();
            TypeParameter.m = protoBuf$TypeParameter0;
            protoBuf$TypeParameter0.d = 0;
            protoBuf$TypeParameter0.e = 0;
            protoBuf$TypeParameter0.f = false;
            protoBuf$TypeParameter0.g = Variance.INV;
            protoBuf$TypeParameter0.h = Collections.emptyList();
            protoBuf$TypeParameter0.i = Collections.emptyList();
        }

        public TypeParameter() {
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.b = ByteString.EMPTY;
        }

        public TypeParameter(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder protoBuf$TypeParameter$Builder0) {
            super(protoBuf$TypeParameter$Builder0);
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.b = protoBuf$TypeParameter$Builder0.getUnknownFields();
        }

        public TypeParameter(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) {
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.d = 0;
            this.e = 0;
            this.f = false;
            this.g = Variance.INV;
            this.h = Collections.emptyList();
            this.i = Collections.emptyList();
            Output byteString$Output0 = ByteString.newOutput();
            CodedOutputStream codedOutputStream0 = CodedOutputStream.newInstance(byteString$Output0, 1);
            int v = 0;
            boolean z = false;
            while(!z) {
                try {
                    int v1 = codedInputStream0.readTag();
                    if(v1 != 0) {
                        switch(v1) {
                            case 8: {
                                this.c |= 1;
                                this.d = codedInputStream0.readInt32();
                                continue;
                            }
                            case 16: {
                                this.c |= 2;
                                this.e = codedInputStream0.readInt32();
                                continue;
                            }
                            case 24: {
                                this.c |= 4;
                                this.f = codedInputStream0.readBool();
                                continue;
                            }
                            case 0x20: {
                                int v2 = codedInputStream0.readEnum();
                                Variance protoBuf$TypeParameter$Variance0 = Variance.valueOf(v2);
                                if(protoBuf$TypeParameter$Variance0 == null) {
                                    codedOutputStream0.writeRawVarint32(0x20);
                                    codedOutputStream0.writeRawVarint32(v2);
                                }
                                else {
                                    this.c |= 8;
                                    this.g = protoBuf$TypeParameter$Variance0;
                                }
                                continue;
                            }
                            case 42: {
                                if((v & 16) != 16) {
                                    this.h = new ArrayList();
                                    v |= 16;
                                }
                                this.h.add(codedInputStream0.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite0));
                                continue;
                            }
                            case 0x30: {
                                if((v & 0x20) != 0x20) {
                                    this.i = new ArrayList();
                                    v |= 0x20;
                                }
                                this.i.add(codedInputStream0.readInt32());
                                continue;
                            }
                            case 50: {
                                int v3 = codedInputStream0.pushLimit(codedInputStream0.readRawVarint32());
                                if((v & 0x20) != 0x20 && codedInputStream0.getBytesUntilLimit() > 0) {
                                    this.i = new ArrayList();
                                    v |= 0x20;
                                }
                                while(codedInputStream0.getBytesUntilLimit() > 0) {
                                    this.i.add(codedInputStream0.readInt32());
                                }
                                codedInputStream0.popLimit(v3);
                                continue;
                            }
                            default: {
                                if(this.parseUnknownField(codedInputStream0, codedOutputStream0, extensionRegistryLite0, v1)) {
                                    continue;
                                }
                            }
                        }
                    }
                    try {
                        try {
                            z = true;
                            continue;
                        }
                        catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                        }
                        catch(IOException iOException0) {
                            throw new InvalidProtocolBufferException(iOException0.getMessage()).setUnfinishedMessage(this);
                        }
                        throw invalidProtocolBufferException0.setUnfinishedMessage(this);
                    }
                    catch(Throwable throwable0) {
                    }
                }
                catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                    throw invalidProtocolBufferException0.setUnfinishedMessage(this);
                }
                catch(IOException iOException0) {
                    throw new InvalidProtocolBufferException(iOException0.getMessage()).setUnfinishedMessage(this);
                }
                catch(Throwable throwable0) {
                }
                if((v & 16) == 16) {
                    this.h = Collections.unmodifiableList(this.h);
                }
                if((v & 0x20) == 0x20) {
                    this.i = Collections.unmodifiableList(this.i);
                }
                try {
                    codedOutputStream0.flush();
                    goto label_82;
                }
                catch(IOException unused_ex) {
                    goto label_82;
                }
                catch(Throwable throwable1) {
                }
                this.b = byteString$Output0.toByteString();
                throw throwable1;
            label_82:
                this.b = byteString$Output0.toByteString();
                this.makeExtensionsImmutable();
                throw throwable0;
            }
            if((v & 16) == 16) {
                this.h = Collections.unmodifiableList(this.h);
            }
            if((v & 0x20) == 0x20) {
                this.i = Collections.unmodifiableList(this.i);
            }
            try {
                codedOutputStream0.flush();
                goto label_94;
            }
            catch(IOException unused_ex) {
                goto label_94;
            }
            catch(Throwable throwable2) {
            }
            this.b = byteString$Output0.toByteString();
            throw throwable2;
        label_94:
            this.b = byteString$Output0.toByteString();
            this.makeExtensionsImmutable();
        }

        public static TypeParameter getDefaultInstance() {
            return TypeParameter.m;
        }

        public TypeParameter getDefaultInstanceForType() {
            return TypeParameter.m;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public MessageLite getDefaultInstanceForType() {
            return this.getDefaultInstanceForType();
        }

        public int getId() {
            return this.d;
        }

        public int getName() {
            return this.e;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser getParserForType() {
            return TypeParameter.PARSER;
        }

        public boolean getReified() {
            return this.f;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int v1 = this.l;
            if(v1 != -1) {
                return v1;
            }
            int v2 = (this.c & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.d) : 0;
            if((this.c & 2) == 2) {
                v2 += CodedOutputStream.computeInt32Size(2, this.e);
            }
            if((this.c & 4) == 4) {
                v2 += CodedOutputStream.computeBoolSize(3, this.f);
            }
            if((this.c & 8) == 8) {
                v2 += CodedOutputStream.computeEnumSize(4, this.g.getNumber());
            }
            for(int v3 = 0; v3 < this.h.size(); ++v3) {
                v2 += CodedOutputStream.computeMessageSize(5, ((MessageLite)this.h.get(v3)));
            }
            int v4 = 0;
            for(int v = 0; v < this.i.size(); ++v) {
                v4 += CodedOutputStream.computeInt32SizeNoTag(((int)(((Integer)this.i.get(v)))));
            }
            this.j = v4;
            int v5 = this.extensionsSerializedSize();
            int v6 = this.b.size() + (v5 + (this.getUpperBoundIdList().isEmpty() ? v2 + v4 : v2 + v4 + 1 + CodedOutputStream.computeInt32SizeNoTag(v4)));
            this.l = v6;
            return v6;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getUpperBound(int v) {
            return (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type)this.h.get(v);
        }

        public int getUpperBoundCount() {
            return this.h.size();
        }

        public List getUpperBoundIdList() {
            return this.i;
        }

        public List getUpperBoundList() {
            return this.h;
        }

        public Variance getVariance() {
            return this.g;
        }

        public boolean hasId() {
            return (this.c & 1) == 1;
        }

        public boolean hasName() {
            return (this.c & 2) == 2;
        }

        public boolean hasReified() {
            return (this.c & 4) == 4;
        }

        public boolean hasVariance() {
            return (this.c & 8) == 8;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            int v = this.k;
            if(v == 1) {
                return true;
            }
            if(v == 0) {
                return false;
            }
            if(!this.hasId()) {
                this.k = 0;
                return false;
            }
            if(!this.hasName()) {
                this.k = 0;
                return false;
            }
            for(int v1 = 0; v1 < this.getUpperBoundCount(); ++v1) {
                if(!this.getUpperBound(v1).isInitialized()) {
                    this.k = 0;
                    return false;
                }
            }
            if(!this.extensionsAreInitialized()) {
                this.k = 0;
                return false;
            }
            this.k = 1;
            return true;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder newBuilder() {
            return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder newBuilder(TypeParameter protoBuf$TypeParameter0) {
            return TypeParameter.newBuilder().mergeFrom(protoBuf$TypeParameter0);
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder newBuilderForType() {
            return TypeParameter.newBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder newBuilderForType() {
            return this.newBuilderForType();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder toBuilder() {
            return TypeParameter.newBuilder(this);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder toBuilder() {
            return this.toBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream0) throws IOException {
            this.getSerializedSize();
            ExtensionWriter generatedMessageLite$ExtendableMessage$ExtensionWriter0 = this.newExtensionWriter();
            if((this.c & 1) == 1) {
                codedOutputStream0.writeInt32(1, this.d);
            }
            if((this.c & 2) == 2) {
                codedOutputStream0.writeInt32(2, this.e);
            }
            if((this.c & 4) == 4) {
                codedOutputStream0.writeBool(3, this.f);
            }
            if((this.c & 8) == 8) {
                codedOutputStream0.writeEnum(4, this.g.getNumber());
            }
            for(int v1 = 0; v1 < this.h.size(); ++v1) {
                codedOutputStream0.writeMessage(5, ((MessageLite)this.h.get(v1)));
            }
            if(this.getUpperBoundIdList().size() > 0) {
                codedOutputStream0.writeRawVarint32(50);
                codedOutputStream0.writeRawVarint32(this.j);
            }
            for(int v = 0; v < this.i.size(); ++v) {
                codedOutputStream0.writeInt32NoTag(((int)(((Integer)this.i.get(v)))));
            }
            generatedMessageLite$ExtendableMessage$ExtensionWriter0.writeUntil(1000, codedOutputStream0);
            codedOutputStream0.writeRawBytes(this.b);
        }
    }

    public static final class TypeTable extends GeneratedMessageLite implements ProtoBuf.TypeTableOrBuilder {
        public static final class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder implements ProtoBuf.TypeTableOrBuilder {
            public int b;
            public List c;
            public int d;

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder() {
                this.c = Collections.emptyList();
                this.d = -1;
            }

            public TypeTable build() {
                TypeTable protoBuf$TypeTable0 = this.buildPartial();
                if(!protoBuf$TypeTable0.isInitialized()) {
                    throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(protoBuf$TypeTable0);
                }
                return protoBuf$TypeTable0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite$Builder
            public MessageLite build() {
                return this.build();
            }

            public TypeTable buildPartial() {
                TypeTable protoBuf$TypeTable0 = new TypeTable(this);
                int v = this.b;
                int v1 = 1;
                if((v & 1) == 1) {
                    this.c = Collections.unmodifiableList(this.c);
                    this.b &= -2;
                }
                protoBuf$TypeTable0.c = this.c;
                if((v & 2) != 2) {
                    v1 = 0;
                }
                protoBuf$TypeTable0.d = this.d;
                protoBuf$TypeTable0.b = v1;
                return protoBuf$TypeTable0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public Object clone() throws CloneNotSupportedException {
                return this.clone();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder().mergeFrom(this.buildPartial());
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder clone() {
                return this.clone();
            }

            public TypeTable getDefaultInstanceForType() {
                return TypeTable.getDefaultInstance();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public GeneratedMessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public MessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getType(int v) {
                return (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type)this.c.get(v);
            }

            public int getTypeCount() {
                return this.c.size();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for(int v = 0; v < this.getTypeCount(); ++v) {
                    if(!this.getType(v).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder mergeFrom(TypeTable protoBuf$TypeTable0) {
                if(protoBuf$TypeTable0 == TypeTable.getDefaultInstance()) {
                    return this;
                }
                if(!protoBuf$TypeTable0.c.isEmpty()) {
                    if(this.c.isEmpty()) {
                        this.c = protoBuf$TypeTable0.c;
                        this.b &= -2;
                    }
                    else {
                        if((this.b & 1) != 1) {
                            this.c = new ArrayList(this.c);
                            this.b |= 1;
                        }
                        this.c.addAll(protoBuf$TypeTable0.c);
                    }
                }
                if(protoBuf$TypeTable0.hasFirstNullable()) {
                    this.setFirstNullable(protoBuf$TypeTable0.getFirstNullable());
                }
                this.setUnknownFields(this.getUnknownFields().concat(protoBuf$TypeTable0.a));
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                TypeTable protoBuf$TypeTable1;
                TypeTable protoBuf$TypeTable0;
                try {
                    try {
                        protoBuf$TypeTable0 = null;
                        protoBuf$TypeTable1 = (TypeTable)TypeTable.PARSER.parsePartialFrom(codedInputStream0, extensionRegistryLite0);
                        goto label_13;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                        TypeTable protoBuf$TypeTable2 = (TypeTable)invalidProtocolBufferException0.getUnfinishedMessage();
                        try {
                            throw invalidProtocolBufferException0;
                        }
                        catch(Throwable throwable0) {
                            protoBuf$TypeTable0 = protoBuf$TypeTable2;
                        }
                    }
                }
                catch(Throwable throwable0) {
                }
                if(protoBuf$TypeTable0 != null) {
                    this.mergeFrom(protoBuf$TypeTable0);
                }
                throw throwable0;
            label_13:
                if(protoBuf$TypeTable1 != null) {
                    this.mergeFrom(protoBuf$TypeTable1);
                }
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedMessageLite0) {
                return this.mergeFrom(((TypeTable)generatedMessageLite0));
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder setFirstNullable(int v) {
                this.b |= 2;
                this.d = v;
                return this;
            }
        }

        public static Parser PARSER;
        public final ByteString a;
        public int b;
        public List c;
        public int d;
        public byte e;
        public int f;
        public static final TypeTable g;

        static {
            TypeTable.PARSER = new u();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/AbstractParser;-><init>()V
            TypeTable protoBuf$TypeTable0 = new TypeTable();
            TypeTable.g = protoBuf$TypeTable0;
            protoBuf$TypeTable0.c = Collections.emptyList();
            protoBuf$TypeTable0.d = -1;
        }

        public TypeTable() {
            this.e = -1;
            this.f = -1;
            this.a = ByteString.EMPTY;
        }

        public TypeTable(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder protoBuf$TypeTable$Builder0) {
            super(protoBuf$TypeTable$Builder0);
            this.e = -1;
            this.f = -1;
            this.a = protoBuf$TypeTable$Builder0.getUnknownFields();
        }

        public TypeTable(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) {
            this.e = -1;
            this.f = -1;
            this.c = Collections.emptyList();
            this.d = -1;
            Output byteString$Output0 = ByteString.newOutput();
            CodedOutputStream codedOutputStream0 = CodedOutputStream.newInstance(byteString$Output0, 1);
            boolean z = false;
            boolean z1 = false;
            while(!z1) {
                try {
                    try {
                        int v = codedInputStream0.readTag();
                        switch(v) {
                            case 0: {
                                z1 = true;
                                continue;
                            }
                            case 10: {
                                if(!z) {
                                    this.c = new ArrayList();
                                    z = true;
                                }
                                this.c.add(codedInputStream0.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite0));
                                continue;
                            }
                            case 16: {
                                this.b |= 1;
                                this.d = codedInputStream0.readInt32();
                                continue;
                            }
                            default: {
                                if(!this.parseUnknownField(codedInputStream0, codedOutputStream0, extensionRegistryLite0, v)) {
                                    z1 = true;
                                    continue;
                                }
                                continue;
                            }
                        }
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                    }
                    catch(IOException iOException0) {
                        throw new InvalidProtocolBufferException(iOException0.getMessage()).setUnfinishedMessage(this);
                    }
                    throw invalidProtocolBufferException0.setUnfinishedMessage(this);
                }
                catch(Throwable throwable0) {
                }
                if(z) {
                    this.c = Collections.unmodifiableList(this.c);
                }
                try {
                    codedOutputStream0.flush();
                    goto label_37;
                }
                catch(IOException unused_ex) {
                    goto label_37;
                }
                catch(Throwable throwable1) {
                }
                this.a = byteString$Output0.toByteString();
                throw throwable1;
            label_37:
                this.a = byteString$Output0.toByteString();
                this.makeExtensionsImmutable();
                throw throwable0;
            }
            if(z) {
                this.c = Collections.unmodifiableList(this.c);
            }
            try {
                codedOutputStream0.flush();
                goto label_48;
            }
            catch(IOException unused_ex) {
                goto label_48;
            }
            catch(Throwable throwable2) {
            }
            this.a = byteString$Output0.toByteString();
            throw throwable2;
        label_48:
            this.a = byteString$Output0.toByteString();
            this.makeExtensionsImmutable();
        }

        public static TypeTable getDefaultInstance() {
            return TypeTable.g;
        }

        public TypeTable getDefaultInstanceForType() {
            return TypeTable.g;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public MessageLite getDefaultInstanceForType() {
            return this.getDefaultInstanceForType();
        }

        public int getFirstNullable() {
            return this.d;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser getParserForType() {
            return TypeTable.PARSER;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int v = this.f;
            if(v != -1) {
                return v;
            }
            int v2 = 0;
            for(int v1 = 0; v1 < this.c.size(); ++v1) {
                v2 += CodedOutputStream.computeMessageSize(1, ((MessageLite)this.c.get(v1)));
            }
            if((this.b & 1) == 1) {
                v2 += CodedOutputStream.computeInt32Size(2, this.d);
            }
            int v3 = this.a.size() + v2;
            this.f = v3;
            return v3;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getType(int v) {
            return (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type)this.c.get(v);
        }

        public int getTypeCount() {
            return this.c.size();
        }

        public List getTypeList() {
            return this.c;
        }

        public boolean hasFirstNullable() {
            return (this.b & 1) == 1;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            int v = this.e;
            if(v == 1) {
                return true;
            }
            if(v == 0) {
                return false;
            }
            for(int v1 = 0; v1 < this.getTypeCount(); ++v1) {
                if(!this.getType(v1).isInitialized()) {
                    this.e = 0;
                    return false;
                }
            }
            this.e = 1;
            return true;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder newBuilder() {
            return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder newBuilder(TypeTable protoBuf$TypeTable0) {
            return TypeTable.newBuilder().mergeFrom(protoBuf$TypeTable0);
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder newBuilderForType() {
            return TypeTable.newBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder newBuilderForType() {
            return this.newBuilderForType();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder toBuilder() {
            return TypeTable.newBuilder(this);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder toBuilder() {
            return this.toBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream0) throws IOException {
            this.getSerializedSize();
            for(int v = 0; v < this.c.size(); ++v) {
                codedOutputStream0.writeMessage(1, ((MessageLite)this.c.get(v)));
            }
            if((this.b & 1) == 1) {
                codedOutputStream0.writeInt32(2, this.d);
            }
            codedOutputStream0.writeRawBytes(this.a);
        }
    }

    public static final class ValueParameter extends ExtendableMessage implements ProtoBuf.ValueParameterOrBuilder {
        public static final class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder extends ExtendableBuilder implements ProtoBuf.ValueParameterOrBuilder {
            public int d;
            public int e;
            public int f;
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type g;
            public int h;
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type i;
            public int j;

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder() {
                this.g = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
                this.i = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            }

            public ValueParameter build() {
                ValueParameter protoBuf$ValueParameter0 = this.buildPartial();
                if(!protoBuf$ValueParameter0.isInitialized()) {
                    throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(protoBuf$ValueParameter0);
                }
                return protoBuf$ValueParameter0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite$Builder
            public MessageLite build() {
                return this.build();
            }

            public ValueParameter buildPartial() {
                ValueParameter protoBuf$ValueParameter0 = new ValueParameter(this);
                int v = this.d;
                int v1 = (v & 1) == 1 ? 1 : 0;
                protoBuf$ValueParameter0.d = this.e;
                if((v & 2) == 2) {
                    v1 |= 2;
                }
                protoBuf$ValueParameter0.e = this.f;
                if((v & 4) == 4) {
                    v1 |= 4;
                }
                protoBuf$ValueParameter0.f = this.g;
                if((v & 8) == 8) {
                    v1 |= 8;
                }
                protoBuf$ValueParameter0.g = this.h;
                if((v & 16) == 16) {
                    v1 |= 16;
                }
                protoBuf$ValueParameter0.h = this.i;
                if((v & 0x20) == 0x20) {
                    v1 |= 0x20;
                }
                protoBuf$ValueParameter0.i = this.j;
                protoBuf$ValueParameter0.c = v1;
                return protoBuf$ValueParameter0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public Object clone() throws CloneNotSupportedException {
                return this.clone();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder().mergeFrom(this.buildPartial());
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableBuilder
            public ExtendableBuilder clone() {
                return this.clone();
            }

            public ValueParameter getDefaultInstanceForType() {
                return ValueParameter.getDefaultInstance();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public GeneratedMessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public MessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getType() {
                return this.g;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getVarargElementType() {
                return this.i;
            }

            public boolean hasName() {
                return (this.d & 2) == 2;
            }

            public boolean hasType() {
                return (this.d & 4) == 4;
            }

            public boolean hasVarargElementType() {
                return (this.d & 16) == 16;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if(!this.hasName()) {
                    return false;
                }
                if(this.hasType() && !this.getType().isInitialized()) {
                    return false;
                }
                return !this.hasVarargElementType() || this.getVarargElementType().isInitialized() ? this.extensionsAreInitialized() : false;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder mergeFrom(ValueParameter protoBuf$ValueParameter0) {
                if(protoBuf$ValueParameter0 == ValueParameter.getDefaultInstance()) {
                    return this;
                }
                if(protoBuf$ValueParameter0.hasFlags()) {
                    this.setFlags(protoBuf$ValueParameter0.getFlags());
                }
                if(protoBuf$ValueParameter0.hasName()) {
                    this.setName(protoBuf$ValueParameter0.getName());
                }
                if(protoBuf$ValueParameter0.hasType()) {
                    this.mergeType(protoBuf$ValueParameter0.getType());
                }
                if(protoBuf$ValueParameter0.hasTypeId()) {
                    this.setTypeId(protoBuf$ValueParameter0.getTypeId());
                }
                if(protoBuf$ValueParameter0.hasVarargElementType()) {
                    this.mergeVarargElementType(protoBuf$ValueParameter0.getVarargElementType());
                }
                if(protoBuf$ValueParameter0.hasVarargElementTypeId()) {
                    this.setVarargElementTypeId(protoBuf$ValueParameter0.getVarargElementTypeId());
                }
                this.mergeExtensionFields(protoBuf$ValueParameter0);
                this.setUnknownFields(this.getUnknownFields().concat(protoBuf$ValueParameter0.b));
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                ValueParameter protoBuf$ValueParameter1;
                ValueParameter protoBuf$ValueParameter0;
                try {
                    try {
                        protoBuf$ValueParameter0 = null;
                        protoBuf$ValueParameter1 = (ValueParameter)ValueParameter.PARSER.parsePartialFrom(codedInputStream0, extensionRegistryLite0);
                        goto label_13;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                        ValueParameter protoBuf$ValueParameter2 = (ValueParameter)invalidProtocolBufferException0.getUnfinishedMessage();
                        try {
                            throw invalidProtocolBufferException0;
                        }
                        catch(Throwable throwable0) {
                            protoBuf$ValueParameter0 = protoBuf$ValueParameter2;
                        }
                    }
                }
                catch(Throwable throwable0) {
                }
                if(protoBuf$ValueParameter0 != null) {
                    this.mergeFrom(protoBuf$ValueParameter0);
                }
                throw throwable0;
            label_13:
                if(protoBuf$ValueParameter1 != null) {
                    this.mergeFrom(protoBuf$ValueParameter1);
                }
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedMessageLite0) {
                return this.mergeFrom(((ValueParameter)generatedMessageLite0));
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder mergeType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type0) {
                this.g = (this.d & 4) != 4 || this.g == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance() ? protoBuf$Type0 : kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.g).mergeFrom(protoBuf$Type0).buildPartial();
                this.d |= 4;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder mergeVarargElementType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type0) {
                this.i = (this.d & 16) != 16 || this.i == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance() ? protoBuf$Type0 : kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.newBuilder(this.i).mergeFrom(protoBuf$Type0).buildPartial();
                this.d |= 16;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder setFlags(int v) {
                this.d |= 1;
                this.e = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder setName(int v) {
                this.d |= 2;
                this.f = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder setTypeId(int v) {
                this.d |= 8;
                this.h = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder setVarargElementTypeId(int v) {
                this.d |= 0x20;
                this.j = v;
                return this;
            }
        }

        public static Parser PARSER;
        public final ByteString b;
        public int c;
        public int d;
        public int e;
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type f;
        public int g;
        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type h;
        public int i;
        public byte j;
        public int k;
        public static final ValueParameter l;

        static {
            ValueParameter.PARSER = new v();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/AbstractParser;-><init>()V
            ValueParameter protoBuf$ValueParameter0 = new ValueParameter();
            ValueParameter.l = protoBuf$ValueParameter0;
            protoBuf$ValueParameter0.d = 0;
            protoBuf$ValueParameter0.e = 0;
            protoBuf$ValueParameter0.f = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            protoBuf$ValueParameter0.g = 0;
            protoBuf$ValueParameter0.h = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            protoBuf$ValueParameter0.i = 0;
        }

        public ValueParameter() {
            this.j = -1;
            this.k = -1;
            this.b = ByteString.EMPTY;
        }

        public ValueParameter(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder protoBuf$ValueParameter$Builder0) {
            super(protoBuf$ValueParameter$Builder0);
            this.j = -1;
            this.k = -1;
            this.b = protoBuf$ValueParameter$Builder0.getUnknownFields();
        }

        public ValueParameter(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) {
            this.j = -1;
            this.k = -1;
            this.d = 0;
            this.e = 0;
            this.f = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            this.g = 0;
            this.h = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.getDefaultInstance();
            this.i = 0;
            Output byteString$Output0 = ByteString.newOutput();
            CodedOutputStream codedOutputStream0 = CodedOutputStream.newInstance(byteString$Output0, 1);
            try {
                boolean z = false;
                while(!z) {
                    try {
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder protoBuf$Type$Builder0 = null;
                        int v1 = codedInputStream0.readTag();
                    alab1:
                        switch(v1) {
                            case 0: {
                                z = true;
                                break;
                            }
                            case 8: {
                                this.c |= 1;
                                this.d = codedInputStream0.readInt32();
                                continue;
                            }
                            default: {
                                if(v1 == 16) {
                                    this.c |= 2;
                                    this.e = codedInputStream0.readInt32();
                                    break;
                                }
                                else {
                                    switch(v1) {
                                        case 26: {
                                            if((this.c & 4) == 4) {
                                                protoBuf$Type$Builder0 = this.f.toBuilder();
                                            }
                                            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type)codedInputStream0.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite0);
                                            this.f = protoBuf$Type0;
                                            if(protoBuf$Type$Builder0 != null) {
                                                protoBuf$Type$Builder0.mergeFrom(protoBuf$Type0);
                                                this.f = protoBuf$Type$Builder0.buildPartial();
                                            }
                                            this.c |= 4;
                                            break alab1;
                                        }
                                        case 34: {
                                            if((this.c & 16) == 16) {
                                                protoBuf$Type$Builder0 = this.h.toBuilder();
                                            }
                                            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type protoBuf$Type1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type)codedInputStream0.readMessage(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER, extensionRegistryLite0);
                                            this.h = protoBuf$Type1;
                                            if(protoBuf$Type$Builder0 != null) {
                                                protoBuf$Type$Builder0.mergeFrom(protoBuf$Type1);
                                                this.h = protoBuf$Type$Builder0.buildPartial();
                                            }
                                            this.c |= 16;
                                            break alab1;
                                        }
                                        case 40: {
                                            this.c |= 8;
                                            this.g = codedInputStream0.readInt32();
                                            break alab1;
                                        }
                                        case 0x30: {
                                            this.c |= 0x20;
                                            this.i = codedInputStream0.readInt32();
                                            break alab1;
                                        }
                                        default: {
                                            if(this.parseUnknownField(codedInputStream0, codedOutputStream0, extensionRegistryLite0, v1)) {
                                                break alab1;
                                            }
                                        }
                                    }
                                }
                                z = true;
                                break;
                            }
                        }
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                        throw invalidProtocolBufferException0.setUnfinishedMessage(this);
                    }
                    catch(IOException iOException0) {
                        throw new InvalidProtocolBufferException(iOException0.getMessage()).setUnfinishedMessage(this);
                    }
                    catch(Throwable throwable0) {
                        goto label_65;
                    }
                    continue;
                    try {
                        try {
                            this.c |= 1;
                            this.d = codedInputStream0.readInt32();
                            continue;
                        }
                        catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                        }
                        catch(IOException iOException0) {
                            throw new InvalidProtocolBufferException(iOException0.getMessage()).setUnfinishedMessage(this);
                        }
                        throw invalidProtocolBufferException0.setUnfinishedMessage(this);
                    }
                    catch(Throwable throwable0) {
                    }
                    try {
                    label_65:
                        codedOutputStream0.flush();
                        goto label_70;
                    }
                    catch(IOException unused_ex) {
                        goto label_70;
                    }
                    catch(Throwable throwable1) {
                    }
                    throw throwable1;
                label_70:
                    this.makeExtensionsImmutable();
                    throw throwable0;
                }
                try {
                    codedOutputStream0.flush();
                }
                catch(IOException unused_ex) {
                }
            }
            finally {
                this.b = byteString$Output0.toByteString();
            }
            this.makeExtensionsImmutable();
        }

        public static ValueParameter getDefaultInstance() {
            return ValueParameter.l;
        }

        public ValueParameter getDefaultInstanceForType() {
            return ValueParameter.l;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public MessageLite getDefaultInstanceForType() {
            return this.getDefaultInstanceForType();
        }

        public int getFlags() {
            return this.d;
        }

        public int getName() {
            return this.e;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser getParserForType() {
            return ValueParameter.PARSER;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int v = this.k;
            if(v != -1) {
                return v;
            }
            int v1 = (this.c & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.d) : 0;
            if((this.c & 2) == 2) {
                v1 += CodedOutputStream.computeInt32Size(2, this.e);
            }
            if((this.c & 4) == 4) {
                v1 += CodedOutputStream.computeMessageSize(3, this.f);
            }
            if((this.c & 16) == 16) {
                v1 += CodedOutputStream.computeMessageSize(4, this.h);
            }
            if((this.c & 8) == 8) {
                v1 += CodedOutputStream.computeInt32Size(5, this.g);
            }
            if((this.c & 0x20) == 0x20) {
                v1 += CodedOutputStream.computeInt32Size(6, this.i);
            }
            int v2 = this.extensionsSerializedSize();
            int v3 = this.b.size() + (v2 + v1);
            this.k = v3;
            return v3;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getType() {
            return this.f;
        }

        public int getTypeId() {
            return this.g;
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type getVarargElementType() {
            return this.h;
        }

        public int getVarargElementTypeId() {
            return this.i;
        }

        public boolean hasFlags() {
            return (this.c & 1) == 1;
        }

        public boolean hasName() {
            return (this.c & 2) == 2;
        }

        public boolean hasType() {
            return (this.c & 4) == 4;
        }

        public boolean hasTypeId() {
            return (this.c & 8) == 8;
        }

        public boolean hasVarargElementType() {
            return (this.c & 16) == 16;
        }

        public boolean hasVarargElementTypeId() {
            return (this.c & 0x20) == 0x20;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            int v = this.j;
            if(v == 1) {
                return true;
            }
            if(v == 0) {
                return false;
            }
            if(!this.hasName()) {
                this.j = 0;
                return false;
            }
            if(this.hasType() && !this.getType().isInitialized()) {
                this.j = 0;
                return false;
            }
            if(this.hasVarargElementType() && !this.getVarargElementType().isInitialized()) {
                this.j = 0;
                return false;
            }
            if(!this.extensionsAreInitialized()) {
                this.j = 0;
                return false;
            }
            this.j = 1;
            return true;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder newBuilder() {
            return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder newBuilder(ValueParameter protoBuf$ValueParameter0) {
            return ValueParameter.newBuilder().mergeFrom(protoBuf$ValueParameter0);
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder newBuilderForType() {
            return ValueParameter.newBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder newBuilderForType() {
            return this.newBuilderForType();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder toBuilder() {
            return ValueParameter.newBuilder(this);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder toBuilder() {
            return this.toBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream0) throws IOException {
            this.getSerializedSize();
            ExtensionWriter generatedMessageLite$ExtendableMessage$ExtensionWriter0 = this.newExtensionWriter();
            if((this.c & 1) == 1) {
                codedOutputStream0.writeInt32(1, this.d);
            }
            if((this.c & 2) == 2) {
                codedOutputStream0.writeInt32(2, this.e);
            }
            if((this.c & 4) == 4) {
                codedOutputStream0.writeMessage(3, this.f);
            }
            if((this.c & 16) == 16) {
                codedOutputStream0.writeMessage(4, this.h);
            }
            if((this.c & 8) == 8) {
                codedOutputStream0.writeInt32(5, this.g);
            }
            if((this.c & 0x20) == 0x20) {
                codedOutputStream0.writeInt32(6, this.i);
            }
            generatedMessageLite$ExtendableMessage$ExtensionWriter0.writeUntil(200, codedOutputStream0);
            codedOutputStream0.writeRawBytes(this.b);
        }
    }

    public static final class VersionRequirement extends GeneratedMessageLite implements ProtoBuf.VersionRequirementOrBuilder {
        public static final class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder implements ProtoBuf.VersionRequirementOrBuilder {
            public int b;
            public int c;
            public int d;
            public Level e;
            public int f;
            public int g;
            public VersionKind h;

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder() {
                this.e = Level.ERROR;
                this.h = VersionKind.LANGUAGE_VERSION;
            }

            public VersionRequirement build() {
                VersionRequirement protoBuf$VersionRequirement0 = this.buildPartial();
                if(!protoBuf$VersionRequirement0.isInitialized()) {
                    throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(protoBuf$VersionRequirement0);
                }
                return protoBuf$VersionRequirement0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite$Builder
            public MessageLite build() {
                return this.build();
            }

            public VersionRequirement buildPartial() {
                VersionRequirement protoBuf$VersionRequirement0 = new VersionRequirement(this);
                int v = this.b;
                int v1 = (v & 1) == 1 ? 1 : 0;
                protoBuf$VersionRequirement0.c = this.c;
                if((v & 2) == 2) {
                    v1 |= 2;
                }
                protoBuf$VersionRequirement0.d = this.d;
                if((v & 4) == 4) {
                    v1 |= 4;
                }
                protoBuf$VersionRequirement0.e = this.e;
                if((v & 8) == 8) {
                    v1 |= 8;
                }
                protoBuf$VersionRequirement0.f = this.f;
                if((v & 16) == 16) {
                    v1 |= 16;
                }
                protoBuf$VersionRequirement0.g = this.g;
                if((v & 0x20) == 0x20) {
                    v1 |= 0x20;
                }
                protoBuf$VersionRequirement0.h = this.h;
                protoBuf$VersionRequirement0.b = v1;
                return protoBuf$VersionRequirement0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public Object clone() throws CloneNotSupportedException {
                return this.clone();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder().mergeFrom(this.buildPartial());
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder clone() {
                return this.clone();
            }

            public VersionRequirement getDefaultInstanceForType() {
                return VersionRequirement.getDefaultInstance();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public GeneratedMessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public MessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder mergeFrom(VersionRequirement protoBuf$VersionRequirement0) {
                if(protoBuf$VersionRequirement0 == VersionRequirement.getDefaultInstance()) {
                    return this;
                }
                if(protoBuf$VersionRequirement0.hasVersion()) {
                    this.setVersion(protoBuf$VersionRequirement0.getVersion());
                }
                if(protoBuf$VersionRequirement0.hasVersionFull()) {
                    this.setVersionFull(protoBuf$VersionRequirement0.getVersionFull());
                }
                if(protoBuf$VersionRequirement0.hasLevel()) {
                    this.setLevel(protoBuf$VersionRequirement0.getLevel());
                }
                if(protoBuf$VersionRequirement0.hasErrorCode()) {
                    this.setErrorCode(protoBuf$VersionRequirement0.getErrorCode());
                }
                if(protoBuf$VersionRequirement0.hasMessage()) {
                    this.setMessage(protoBuf$VersionRequirement0.getMessage());
                }
                if(protoBuf$VersionRequirement0.hasVersionKind()) {
                    this.setVersionKind(protoBuf$VersionRequirement0.getVersionKind());
                }
                this.setUnknownFields(this.getUnknownFields().concat(protoBuf$VersionRequirement0.a));
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                VersionRequirement protoBuf$VersionRequirement1;
                VersionRequirement protoBuf$VersionRequirement0;
                try {
                    try {
                        protoBuf$VersionRequirement0 = null;
                        protoBuf$VersionRequirement1 = (VersionRequirement)VersionRequirement.PARSER.parsePartialFrom(codedInputStream0, extensionRegistryLite0);
                        goto label_13;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                        VersionRequirement protoBuf$VersionRequirement2 = (VersionRequirement)invalidProtocolBufferException0.getUnfinishedMessage();
                        try {
                            throw invalidProtocolBufferException0;
                        }
                        catch(Throwable throwable0) {
                            protoBuf$VersionRequirement0 = protoBuf$VersionRequirement2;
                        }
                    }
                }
                catch(Throwable throwable0) {
                }
                if(protoBuf$VersionRequirement0 != null) {
                    this.mergeFrom(protoBuf$VersionRequirement0);
                }
                throw throwable0;
            label_13:
                if(protoBuf$VersionRequirement1 != null) {
                    this.mergeFrom(protoBuf$VersionRequirement1);
                }
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedMessageLite0) {
                return this.mergeFrom(((VersionRequirement)generatedMessageLite0));
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder setErrorCode(int v) {
                this.b |= 8;
                this.f = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder setLevel(Level protoBuf$VersionRequirement$Level0) {
                protoBuf$VersionRequirement$Level0.getClass();
                this.b |= 4;
                this.e = protoBuf$VersionRequirement$Level0;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder setMessage(int v) {
                this.b |= 16;
                this.g = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder setVersion(int v) {
                this.b |= 1;
                this.c = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder setVersionFull(int v) {
                this.b |= 2;
                this.d = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder setVersionKind(VersionKind protoBuf$VersionRequirement$VersionKind0) {
                protoBuf$VersionRequirement$VersionKind0.getClass();
                this.b |= 0x20;
                this.h = protoBuf$VersionRequirement$VersionKind0;
                return this;
            }
        }

        public static enum Level implements EnumLite {
            WARNING(0),
            ERROR(1),
            HIDDEN(2);

            public final int a;

            public Level(int v1) {
                this.a = v1;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.Internal$EnumLite
            public final int getNumber() {
                return this.a;
            }

            public static Level valueOf(int v) {
                switch(v) {
                    case 0: {
                        return Level.WARNING;
                    }
                    case 1: {
                        return Level.ERROR;
                    }
                    case 2: {
                        return Level.HIDDEN;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }

        public static enum VersionKind implements EnumLite {
            LANGUAGE_VERSION(0),
            COMPILER_VERSION(1),
            API_VERSION(2);

            public final int a;

            public VersionKind(int v1) {
                this.a = v1;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.Internal$EnumLite
            public final int getNumber() {
                return this.a;
            }

            public static VersionKind valueOf(int v) {
                switch(v) {
                    case 0: {
                        return VersionKind.LANGUAGE_VERSION;
                    }
                    case 1: {
                        return VersionKind.COMPILER_VERSION;
                    }
                    case 2: {
                        return VersionKind.API_VERSION;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }

        public static Parser PARSER;
        public final ByteString a;
        public int b;
        public int c;
        public int d;
        public Level e;
        public int f;
        public int g;
        public VersionKind h;
        public byte i;
        public int j;
        public static final VersionRequirement k;

        static {
            VersionRequirement.PARSER = new w();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/AbstractParser;-><init>()V
            VersionRequirement protoBuf$VersionRequirement0 = new VersionRequirement();
            VersionRequirement.k = protoBuf$VersionRequirement0;
            protoBuf$VersionRequirement0.c = 0;
            protoBuf$VersionRequirement0.d = 0;
            protoBuf$VersionRequirement0.e = Level.ERROR;
            protoBuf$VersionRequirement0.f = 0;
            protoBuf$VersionRequirement0.g = 0;
            protoBuf$VersionRequirement0.h = VersionKind.LANGUAGE_VERSION;
        }

        public VersionRequirement() {
            this.i = -1;
            this.j = -1;
            this.a = ByteString.EMPTY;
        }

        public VersionRequirement(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder protoBuf$VersionRequirement$Builder0) {
            super(protoBuf$VersionRequirement$Builder0);
            this.i = -1;
            this.j = -1;
            this.a = protoBuf$VersionRequirement$Builder0.getUnknownFields();
        }

        public VersionRequirement(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) {
            this.i = -1;
            this.j = -1;
            this.c = 0;
            this.d = 0;
            this.e = Level.ERROR;
            this.f = 0;
            this.g = 0;
            this.h = VersionKind.LANGUAGE_VERSION;
            Output byteString$Output0 = ByteString.newOutput();
            CodedOutputStream codedOutputStream0 = CodedOutputStream.newInstance(byteString$Output0, 1);
            try {
                boolean z = false;
                while(!z) {
                    try {
                        try {
                            int v1 = codedInputStream0.readTag();
                            switch(v1) {
                                case 0: {
                                    z = true;
                                    continue;
                                }
                                case 8: {
                                    this.b |= 1;
                                    this.c = codedInputStream0.readInt32();
                                    continue;
                                }
                                case 16: {
                                    this.b |= 2;
                                    this.d = codedInputStream0.readInt32();
                                    continue;
                                }
                                case 24: {
                                    int v3 = codedInputStream0.readEnum();
                                    Level protoBuf$VersionRequirement$Level0 = Level.valueOf(v3);
                                    if(protoBuf$VersionRequirement$Level0 == null) {
                                        codedOutputStream0.writeRawVarint32(24);
                                        codedOutputStream0.writeRawVarint32(v3);
                                    }
                                    else {
                                        this.b |= 4;
                                        this.e = protoBuf$VersionRequirement$Level0;
                                    }
                                    continue;
                                }
                                case 0x20: {
                                    this.b |= 8;
                                    this.f = codedInputStream0.readInt32();
                                    continue;
                                }
                                case 40: {
                                    this.b |= 16;
                                    this.g = codedInputStream0.readInt32();
                                    continue;
                                }
                                case 0x30: {
                                    int v2 = codedInputStream0.readEnum();
                                    VersionKind protoBuf$VersionRequirement$VersionKind0 = VersionKind.valueOf(v2);
                                    if(protoBuf$VersionRequirement$VersionKind0 == null) {
                                        codedOutputStream0.writeRawVarint32(0x30);
                                        codedOutputStream0.writeRawVarint32(v2);
                                    }
                                    else {
                                        this.b |= 0x20;
                                        this.h = protoBuf$VersionRequirement$VersionKind0;
                                    }
                                    continue;
                                }
                                default: {
                                    if(!this.parseUnknownField(codedInputStream0, codedOutputStream0, extensionRegistryLite0, v1)) {
                                        z = true;
                                        continue;
                                    }
                                    continue;
                                }
                            }
                        }
                        catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                        }
                        catch(IOException iOException0) {
                            throw new InvalidProtocolBufferException(iOException0.getMessage()).setUnfinishedMessage(this);
                        }
                        throw invalidProtocolBufferException0.setUnfinishedMessage(this);
                    }
                    catch(Throwable throwable0) {
                    }
                    try {
                        codedOutputStream0.flush();
                        goto label_61;
                    }
                    catch(IOException unused_ex) {
                        goto label_61;
                    }
                    catch(Throwable throwable1) {
                    }
                    throw throwable1;
                label_61:
                    this.makeExtensionsImmutable();
                    throw throwable0;
                }
                try {
                    codedOutputStream0.flush();
                }
                catch(IOException unused_ex) {
                }
            }
            finally {
                this.a = byteString$Output0.toByteString();
            }
            this.makeExtensionsImmutable();
        }

        public static VersionRequirement getDefaultInstance() {
            return VersionRequirement.k;
        }

        public VersionRequirement getDefaultInstanceForType() {
            return VersionRequirement.k;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public MessageLite getDefaultInstanceForType() {
            return this.getDefaultInstanceForType();
        }

        public int getErrorCode() {
            return this.f;
        }

        public Level getLevel() {
            return this.e;
        }

        public int getMessage() {
            return this.g;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser getParserForType() {
            return VersionRequirement.PARSER;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int v = this.j;
            if(v != -1) {
                return v;
            }
            int v1 = (this.b & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.c) : 0;
            if((this.b & 2) == 2) {
                v1 += CodedOutputStream.computeInt32Size(2, this.d);
            }
            if((this.b & 4) == 4) {
                v1 += CodedOutputStream.computeEnumSize(3, this.e.getNumber());
            }
            if((this.b & 8) == 8) {
                v1 += CodedOutputStream.computeInt32Size(4, this.f);
            }
            if((this.b & 16) == 16) {
                v1 += CodedOutputStream.computeInt32Size(5, this.g);
            }
            if((this.b & 0x20) == 0x20) {
                v1 += CodedOutputStream.computeEnumSize(6, this.h.getNumber());
            }
            int v2 = this.a.size() + v1;
            this.j = v2;
            return v2;
        }

        public int getVersion() {
            return this.c;
        }

        public int getVersionFull() {
            return this.d;
        }

        public VersionKind getVersionKind() {
            return this.h;
        }

        public boolean hasErrorCode() {
            return (this.b & 8) == 8;
        }

        public boolean hasLevel() {
            return (this.b & 4) == 4;
        }

        public boolean hasMessage() {
            return (this.b & 16) == 16;
        }

        public boolean hasVersion() {
            return (this.b & 1) == 1;
        }

        public boolean hasVersionFull() {
            return (this.b & 2) == 2;
        }

        public boolean hasVersionKind() {
            return (this.b & 0x20) == 0x20;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            int v = this.i;
            if(v == 1) {
                return true;
            }
            if(v == 0) {
                return false;
            }
            this.i = 1;
            return true;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder newBuilder() {
            return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder newBuilder(VersionRequirement protoBuf$VersionRequirement0) {
            return VersionRequirement.newBuilder().mergeFrom(protoBuf$VersionRequirement0);
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder newBuilderForType() {
            return VersionRequirement.newBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder newBuilderForType() {
            return this.newBuilderForType();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder toBuilder() {
            return VersionRequirement.newBuilder(this);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder toBuilder() {
            return this.toBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream0) throws IOException {
            this.getSerializedSize();
            if((this.b & 1) == 1) {
                codedOutputStream0.writeInt32(1, this.c);
            }
            if((this.b & 2) == 2) {
                codedOutputStream0.writeInt32(2, this.d);
            }
            if((this.b & 4) == 4) {
                codedOutputStream0.writeEnum(3, this.e.getNumber());
            }
            if((this.b & 8) == 8) {
                codedOutputStream0.writeInt32(4, this.f);
            }
            if((this.b & 16) == 16) {
                codedOutputStream0.writeInt32(5, this.g);
            }
            if((this.b & 0x20) == 0x20) {
                codedOutputStream0.writeEnum(6, this.h.getNumber());
            }
            codedOutputStream0.writeRawBytes(this.a);
        }
    }

    public static final class VersionRequirementTable extends GeneratedMessageLite implements ProtoBuf.VersionRequirementTableOrBuilder {
        public static final class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder implements ProtoBuf.VersionRequirementTableOrBuilder {
            public int b;
            public List c;

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder() {
                this.c = Collections.emptyList();
            }

            public VersionRequirementTable build() {
                VersionRequirementTable protoBuf$VersionRequirementTable0 = this.buildPartial();
                if(!protoBuf$VersionRequirementTable0.isInitialized()) {
                    throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(protoBuf$VersionRequirementTable0);
                }
                return protoBuf$VersionRequirementTable0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite$Builder
            public MessageLite build() {
                return this.build();
            }

            public VersionRequirementTable buildPartial() {
                VersionRequirementTable protoBuf$VersionRequirementTable0 = new VersionRequirementTable(this);
                if((this.b & 1) == 1) {
                    this.c = Collections.unmodifiableList(this.c);
                    this.b &= -2;
                }
                protoBuf$VersionRequirementTable0.b = this.c;
                return protoBuf$VersionRequirementTable0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public Object clone() throws CloneNotSupportedException {
                return this.clone();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder().mergeFrom(this.buildPartial());
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder clone() {
                return this.clone();
            }

            public VersionRequirementTable getDefaultInstanceForType() {
                return VersionRequirementTable.getDefaultInstance();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public GeneratedMessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public MessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder mergeFrom(VersionRequirementTable protoBuf$VersionRequirementTable0) {
                if(protoBuf$VersionRequirementTable0 == VersionRequirementTable.getDefaultInstance()) {
                    return this;
                }
                if(!protoBuf$VersionRequirementTable0.b.isEmpty()) {
                    if(this.c.isEmpty()) {
                        this.c = protoBuf$VersionRequirementTable0.b;
                        this.b &= -2;
                    }
                    else {
                        if((this.b & 1) != 1) {
                            this.c = new ArrayList(this.c);
                            this.b |= 1;
                        }
                        this.c.addAll(protoBuf$VersionRequirementTable0.b);
                    }
                }
                this.setUnknownFields(this.getUnknownFields().concat(protoBuf$VersionRequirementTable0.a));
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                VersionRequirementTable protoBuf$VersionRequirementTable1;
                VersionRequirementTable protoBuf$VersionRequirementTable0;
                try {
                    try {
                        protoBuf$VersionRequirementTable0 = null;
                        protoBuf$VersionRequirementTable1 = (VersionRequirementTable)VersionRequirementTable.PARSER.parsePartialFrom(codedInputStream0, extensionRegistryLite0);
                        goto label_13;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                        VersionRequirementTable protoBuf$VersionRequirementTable2 = (VersionRequirementTable)invalidProtocolBufferException0.getUnfinishedMessage();
                        try {
                            throw invalidProtocolBufferException0;
                        }
                        catch(Throwable throwable0) {
                            protoBuf$VersionRequirementTable0 = protoBuf$VersionRequirementTable2;
                        }
                    }
                }
                catch(Throwable throwable0) {
                }
                if(protoBuf$VersionRequirementTable0 != null) {
                    this.mergeFrom(protoBuf$VersionRequirementTable0);
                }
                throw throwable0;
            label_13:
                if(protoBuf$VersionRequirementTable1 != null) {
                    this.mergeFrom(protoBuf$VersionRequirementTable1);
                }
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedMessageLite0) {
                return this.mergeFrom(((VersionRequirementTable)generatedMessageLite0));
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }
        }

        public static Parser PARSER;
        public final ByteString a;
        public List b;
        public byte c;
        public int d;
        public static final VersionRequirementTable e;

        static {
            VersionRequirementTable.PARSER = new x();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/AbstractParser;-><init>()V
            VersionRequirementTable protoBuf$VersionRequirementTable0 = new VersionRequirementTable();
            VersionRequirementTable.e = protoBuf$VersionRequirementTable0;
            protoBuf$VersionRequirementTable0.b = Collections.emptyList();
        }

        public VersionRequirementTable() {
            this.c = -1;
            this.d = -1;
            this.a = ByteString.EMPTY;
        }

        public VersionRequirementTable(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder protoBuf$VersionRequirementTable$Builder0) {
            super(protoBuf$VersionRequirementTable$Builder0);
            this.c = -1;
            this.d = -1;
            this.a = protoBuf$VersionRequirementTable$Builder0.getUnknownFields();
        }

        public VersionRequirementTable(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) {
            this.c = -1;
            this.d = -1;
            this.b = Collections.emptyList();
            Output byteString$Output0 = ByteString.newOutput();
            CodedOutputStream codedOutputStream0 = CodedOutputStream.newInstance(byteString$Output0, 1);
            boolean z = false;
            boolean z1 = false;
            while(!z1) {
                try {
                    try {
                        int v = codedInputStream0.readTag();
                        switch(v) {
                            case 0: {
                                z1 = true;
                                continue;
                            }
                            case 10: {
                                break;
                            }
                            default: {
                                if(!this.parseUnknownField(codedInputStream0, codedOutputStream0, extensionRegistryLite0, v)) {
                                    z1 = true;
                                    continue;
                                }
                                continue;
                            }
                        }
                        if(!z) {
                            this.b = new ArrayList();
                            z = true;
                        }
                        this.b.add(codedInputStream0.readMessage(VersionRequirement.PARSER, extensionRegistryLite0));
                        continue;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                    }
                    catch(IOException iOException0) {
                        throw new InvalidProtocolBufferException(iOException0.getMessage()).setUnfinishedMessage(this);
                    }
                    throw invalidProtocolBufferException0.setUnfinishedMessage(this);
                }
                catch(Throwable throwable0) {
                }
                if(z) {
                    this.b = Collections.unmodifiableList(this.b);
                }
                try {
                    codedOutputStream0.flush();
                    goto label_33;
                }
                catch(IOException unused_ex) {
                    goto label_33;
                }
                catch(Throwable throwable1) {
                }
                this.a = byteString$Output0.toByteString();
                throw throwable1;
            label_33:
                this.a = byteString$Output0.toByteString();
                this.makeExtensionsImmutable();
                throw throwable0;
            }
            if(z) {
                this.b = Collections.unmodifiableList(this.b);
            }
            try {
                codedOutputStream0.flush();
                goto label_43;
            }
            catch(IOException unused_ex) {
                goto label_43;
            }
            catch(Throwable throwable2) {
            }
            this.a = byteString$Output0.toByteString();
            throw throwable2;
        label_43:
            this.a = byteString$Output0.toByteString();
            this.makeExtensionsImmutable();
        }

        public static VersionRequirementTable getDefaultInstance() {
            return VersionRequirementTable.e;
        }

        public VersionRequirementTable getDefaultInstanceForType() {
            return VersionRequirementTable.e;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public MessageLite getDefaultInstanceForType() {
            return this.getDefaultInstanceForType();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser getParserForType() {
            return VersionRequirementTable.PARSER;
        }

        public int getRequirementCount() {
            return this.b.size();
        }

        public List getRequirementList() {
            return this.b;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int v = this.d;
            if(v != -1) {
                return v;
            }
            int v2 = 0;
            for(int v1 = 0; v1 < this.b.size(); ++v1) {
                v2 += CodedOutputStream.computeMessageSize(1, ((MessageLite)this.b.get(v1)));
            }
            int v3 = this.a.size() + v2;
            this.d = v3;
            return v3;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            int v = this.c;
            if(v == 1) {
                return true;
            }
            if(v == 0) {
                return false;
            }
            this.c = 1;
            return true;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder newBuilder() {
            return new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder newBuilder(VersionRequirementTable protoBuf$VersionRequirementTable0) {
            return VersionRequirementTable.newBuilder().mergeFrom(protoBuf$VersionRequirementTable0);
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder newBuilderForType() {
            return VersionRequirementTable.newBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder newBuilderForType() {
            return this.newBuilderForType();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder toBuilder() {
            return VersionRequirementTable.newBuilder(this);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder toBuilder() {
            return this.toBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream0) throws IOException {
            this.getSerializedSize();
            for(int v = 0; v < this.b.size(); ++v) {
                codedOutputStream0.writeMessage(1, ((MessageLite)this.b.get(v)));
            }
            codedOutputStream0.writeRawBytes(this.a);
        }
    }

    public static enum Visibility implements EnumLite {
        INTERNAL(0),
        PRIVATE(1),
        PROTECTED(2),
        PUBLIC(3),
        PRIVATE_TO_THIS(4),
        LOCAL(5);

        public final int a;

        public Visibility(int v1) {
            this.a = v1;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.Internal$EnumLite
        public final int getNumber() {
            return this.a;
        }

        public static Visibility valueOf(int v) {
            switch(v) {
                case 0: {
                    return Visibility.INTERNAL;
                }
                case 1: {
                    return Visibility.PRIVATE;
                }
                case 2: {
                    return Visibility.PROTECTED;
                }
                case 3: {
                    return Visibility.PUBLIC;
                }
                case 4: {
                    return Visibility.PRIVATE_TO_THIS;
                }
                case 5: {
                    return Visibility.LOCAL;
                }
                default: {
                    return null;
                }
            }
        }
    }

}

