package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType;

public final class JvmProtoBuf {
    public static final class JvmFieldSignature extends GeneratedMessageLite implements JvmProtoBuf.JvmFieldSignatureOrBuilder {
        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder implements JvmProtoBuf.JvmFieldSignatureOrBuilder {
            public int b;
            public int c;
            public int d;

            public JvmFieldSignature build() {
                JvmFieldSignature jvmProtoBuf$JvmFieldSignature0 = this.buildPartial();
                if(!jvmProtoBuf$JvmFieldSignature0.isInitialized()) {
                    throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(jvmProtoBuf$JvmFieldSignature0);
                }
                return jvmProtoBuf$JvmFieldSignature0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite$Builder
            public MessageLite build() {
                return this.build();
            }

            public JvmFieldSignature buildPartial() {
                JvmFieldSignature jvmProtoBuf$JvmFieldSignature0 = new JvmFieldSignature(this);
                int v = (this.b & 1) == 1 ? 1 : 0;
                jvmProtoBuf$JvmFieldSignature0.c = this.c;
                if((this.b & 2) == 2) {
                    v |= 2;
                }
                jvmProtoBuf$JvmFieldSignature0.d = this.d;
                jvmProtoBuf$JvmFieldSignature0.b = v;
                return jvmProtoBuf$JvmFieldSignature0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public Object clone() throws CloneNotSupportedException {
                return this.clone();
            }

            public Builder clone() {
                return new Builder().mergeFrom(this.buildPartial());  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$Builder;-><init>()V
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder clone() {
                return this.clone();
            }

            public JvmFieldSignature getDefaultInstanceForType() {
                return JvmFieldSignature.getDefaultInstance();
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

            public Builder mergeFrom(JvmFieldSignature jvmProtoBuf$JvmFieldSignature0) {
                if(jvmProtoBuf$JvmFieldSignature0 == JvmFieldSignature.getDefaultInstance()) {
                    return this;
                }
                if(jvmProtoBuf$JvmFieldSignature0.hasName()) {
                    this.setName(jvmProtoBuf$JvmFieldSignature0.getName());
                }
                if(jvmProtoBuf$JvmFieldSignature0.hasDesc()) {
                    this.setDesc(jvmProtoBuf$JvmFieldSignature0.getDesc());
                }
                this.setUnknownFields(this.getUnknownFields().concat(jvmProtoBuf$JvmFieldSignature0.a));
                return this;
            }

            public Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                JvmFieldSignature jvmProtoBuf$JvmFieldSignature1;
                JvmFieldSignature jvmProtoBuf$JvmFieldSignature0;
                try {
                    try {
                        jvmProtoBuf$JvmFieldSignature0 = null;
                        jvmProtoBuf$JvmFieldSignature1 = (JvmFieldSignature)JvmFieldSignature.PARSER.parsePartialFrom(codedInputStream0, extensionRegistryLite0);
                        goto label_13;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                        JvmFieldSignature jvmProtoBuf$JvmFieldSignature2 = (JvmFieldSignature)invalidProtocolBufferException0.getUnfinishedMessage();
                        try {
                            throw invalidProtocolBufferException0;
                        }
                        catch(Throwable throwable0) {
                            jvmProtoBuf$JvmFieldSignature0 = jvmProtoBuf$JvmFieldSignature2;
                        }
                    }
                }
                catch(Throwable throwable0) {
                }
                if(jvmProtoBuf$JvmFieldSignature0 != null) {
                    this.mergeFrom(jvmProtoBuf$JvmFieldSignature0);
                }
                throw throwable0;
            label_13:
                if(jvmProtoBuf$JvmFieldSignature1 != null) {
                    this.mergeFrom(jvmProtoBuf$JvmFieldSignature1);
                }
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedMessageLite0) {
                return this.mergeFrom(((JvmFieldSignature)generatedMessageLite0));
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            public Builder setDesc(int v) {
                this.b |= 2;
                this.d = v;
                return this;
            }

            public Builder setName(int v) {
                this.b |= 1;
                this.c = v;
                return this;
            }
        }

        public static Parser PARSER;
        public final ByteString a;
        public int b;
        public int c;
        public int d;
        public byte e;
        public int f;
        public static final JvmFieldSignature g;

        static {
            JvmFieldSignature.PARSER = new a();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/AbstractParser;-><init>()V
            JvmFieldSignature jvmProtoBuf$JvmFieldSignature0 = new JvmFieldSignature();
            JvmFieldSignature.g = jvmProtoBuf$JvmFieldSignature0;
            jvmProtoBuf$JvmFieldSignature0.c = 0;
            jvmProtoBuf$JvmFieldSignature0.d = 0;
        }

        public JvmFieldSignature() {
            this.e = -1;
            this.f = -1;
            this.a = ByteString.EMPTY;
        }

        public JvmFieldSignature(Builder jvmProtoBuf$JvmFieldSignature$Builder0) {
            super(jvmProtoBuf$JvmFieldSignature$Builder0);
            this.e = -1;
            this.f = -1;
            this.a = jvmProtoBuf$JvmFieldSignature$Builder0.getUnknownFields();
        }

        public JvmFieldSignature(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) {
            this.e = -1;
            this.f = -1;
            this.c = 0;
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
                                    this.b |= 1;
                                    this.c = codedInputStream0.readInt32();
                                    continue;
                                }
                                case 16: {
                                    this.b |= 2;
                                    this.d = codedInputStream0.readInt32();
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
                        goto label_33;
                    }
                    catch(IOException unused_ex) {
                        goto label_33;
                    }
                    catch(Throwable throwable1) {
                    }
                    throw throwable1;
                label_33:
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

        public static JvmFieldSignature getDefaultInstance() {
            return JvmFieldSignature.g;
        }

        public JvmFieldSignature getDefaultInstanceForType() {
            return JvmFieldSignature.g;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public MessageLite getDefaultInstanceForType() {
            return this.getDefaultInstanceForType();
        }

        public int getDesc() {
            return this.d;
        }

        public int getName() {
            return this.c;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser getParserForType() {
            return JvmFieldSignature.PARSER;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int v = this.f;
            if(v != -1) {
                return v;
            }
            int v1 = (this.b & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.c) : 0;
            if((this.b & 2) == 2) {
                v1 += CodedOutputStream.computeInt32Size(2, this.d);
            }
            int v2 = this.a.size() + v1;
            this.f = v2;
            return v2;
        }

        public boolean hasDesc() {
            return (this.b & 2) == 2;
        }

        public boolean hasName() {
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
            this.e = 1;
            return true;
        }

        public static Builder newBuilder() {
            return new Builder();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$Builder;-><init>()V
        }

        public static Builder newBuilder(JvmFieldSignature jvmProtoBuf$JvmFieldSignature0) {
            return JvmFieldSignature.newBuilder().mergeFrom(jvmProtoBuf$JvmFieldSignature0);
        }

        public Builder newBuilderForType() {
            return JvmFieldSignature.newBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder newBuilderForType() {
            return this.newBuilderForType();
        }

        public Builder toBuilder() {
            return JvmFieldSignature.newBuilder(this);
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
            codedOutputStream0.writeRawBytes(this.a);
        }
    }

    public static final class JvmMethodSignature extends GeneratedMessageLite implements JvmProtoBuf.JvmMethodSignatureOrBuilder {
        public static final class kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder implements JvmProtoBuf.JvmMethodSignatureOrBuilder {
            public int b;
            public int c;
            public int d;

            public JvmMethodSignature build() {
                JvmMethodSignature jvmProtoBuf$JvmMethodSignature0 = this.buildPartial();
                if(!jvmProtoBuf$JvmMethodSignature0.isInitialized()) {
                    throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(jvmProtoBuf$JvmMethodSignature0);
                }
                return jvmProtoBuf$JvmMethodSignature0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite$Builder
            public MessageLite build() {
                return this.build();
            }

            public JvmMethodSignature buildPartial() {
                JvmMethodSignature jvmProtoBuf$JvmMethodSignature0 = new JvmMethodSignature(this);
                int v = (this.b & 1) == 1 ? 1 : 0;
                jvmProtoBuf$JvmMethodSignature0.c = this.c;
                if((this.b & 2) == 2) {
                    v |= 2;
                }
                jvmProtoBuf$JvmMethodSignature0.d = this.d;
                jvmProtoBuf$JvmMethodSignature0.b = v;
                return jvmProtoBuf$JvmMethodSignature0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public Object clone() throws CloneNotSupportedException {
                return this.clone();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.Builder clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.Builder().mergeFrom(this.buildPartial());  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$Builder;-><init>()V
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder clone() {
                return this.clone();
            }

            public JvmMethodSignature getDefaultInstanceForType() {
                return JvmMethodSignature.getDefaultInstance();
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

            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.Builder mergeFrom(JvmMethodSignature jvmProtoBuf$JvmMethodSignature0) {
                if(jvmProtoBuf$JvmMethodSignature0 == JvmMethodSignature.getDefaultInstance()) {
                    return this;
                }
                if(jvmProtoBuf$JvmMethodSignature0.hasName()) {
                    this.setName(jvmProtoBuf$JvmMethodSignature0.getName());
                }
                if(jvmProtoBuf$JvmMethodSignature0.hasDesc()) {
                    this.setDesc(jvmProtoBuf$JvmMethodSignature0.getDesc());
                }
                this.setUnknownFields(this.getUnknownFields().concat(jvmProtoBuf$JvmMethodSignature0.a));
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                JvmMethodSignature jvmProtoBuf$JvmMethodSignature1;
                JvmMethodSignature jvmProtoBuf$JvmMethodSignature0;
                try {
                    try {
                        jvmProtoBuf$JvmMethodSignature0 = null;
                        jvmProtoBuf$JvmMethodSignature1 = (JvmMethodSignature)JvmMethodSignature.PARSER.parsePartialFrom(codedInputStream0, extensionRegistryLite0);
                        goto label_13;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                        JvmMethodSignature jvmProtoBuf$JvmMethodSignature2 = (JvmMethodSignature)invalidProtocolBufferException0.getUnfinishedMessage();
                        try {
                            throw invalidProtocolBufferException0;
                        }
                        catch(Throwable throwable0) {
                            jvmProtoBuf$JvmMethodSignature0 = jvmProtoBuf$JvmMethodSignature2;
                        }
                    }
                }
                catch(Throwable throwable0) {
                }
                if(jvmProtoBuf$JvmMethodSignature0 != null) {
                    this.mergeFrom(jvmProtoBuf$JvmMethodSignature0);
                }
                throw throwable0;
            label_13:
                if(jvmProtoBuf$JvmMethodSignature1 != null) {
                    this.mergeFrom(jvmProtoBuf$JvmMethodSignature1);
                }
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedMessageLite0) {
                return this.mergeFrom(((JvmMethodSignature)generatedMessageLite0));
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.Builder setDesc(int v) {
                this.b |= 2;
                this.d = v;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.Builder setName(int v) {
                this.b |= 1;
                this.c = v;
                return this;
            }
        }

        public static Parser PARSER;
        public final ByteString a;
        public int b;
        public int c;
        public int d;
        public byte e;
        public int f;
        public static final JvmMethodSignature g;

        static {
            JvmMethodSignature.PARSER = new b();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/AbstractParser;-><init>()V
            JvmMethodSignature jvmProtoBuf$JvmMethodSignature0 = new JvmMethodSignature();
            JvmMethodSignature.g = jvmProtoBuf$JvmMethodSignature0;
            jvmProtoBuf$JvmMethodSignature0.c = 0;
            jvmProtoBuf$JvmMethodSignature0.d = 0;
        }

        public JvmMethodSignature() {
            this.e = -1;
            this.f = -1;
            this.a = ByteString.EMPTY;
        }

        public JvmMethodSignature(kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.Builder jvmProtoBuf$JvmMethodSignature$Builder0) {
            super(jvmProtoBuf$JvmMethodSignature$Builder0);
            this.e = -1;
            this.f = -1;
            this.a = jvmProtoBuf$JvmMethodSignature$Builder0.getUnknownFields();
        }

        public JvmMethodSignature(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) {
            this.e = -1;
            this.f = -1;
            this.c = 0;
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
                                    this.b |= 1;
                                    this.c = codedInputStream0.readInt32();
                                    continue;
                                }
                                case 16: {
                                    this.b |= 2;
                                    this.d = codedInputStream0.readInt32();
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
                        goto label_33;
                    }
                    catch(IOException unused_ex) {
                        goto label_33;
                    }
                    catch(Throwable throwable1) {
                    }
                    throw throwable1;
                label_33:
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

        public static JvmMethodSignature getDefaultInstance() {
            return JvmMethodSignature.g;
        }

        public JvmMethodSignature getDefaultInstanceForType() {
            return JvmMethodSignature.g;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public MessageLite getDefaultInstanceForType() {
            return this.getDefaultInstanceForType();
        }

        public int getDesc() {
            return this.d;
        }

        public int getName() {
            return this.c;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser getParserForType() {
            return JvmMethodSignature.PARSER;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int v = this.f;
            if(v != -1) {
                return v;
            }
            int v1 = (this.b & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.c) : 0;
            if((this.b & 2) == 2) {
                v1 += CodedOutputStream.computeInt32Size(2, this.d);
            }
            int v2 = this.a.size() + v1;
            this.f = v2;
            return v2;
        }

        public boolean hasDesc() {
            return (this.b & 2) == 2;
        }

        public boolean hasName() {
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
            this.e = 1;
            return true;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.Builder newBuilder() {
            return new kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.Builder();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$Builder;-><init>()V
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.Builder newBuilder(JvmMethodSignature jvmProtoBuf$JvmMethodSignature0) {
            return JvmMethodSignature.newBuilder().mergeFrom(jvmProtoBuf$JvmMethodSignature0);
        }

        public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.Builder newBuilderForType() {
            return JvmMethodSignature.newBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder newBuilderForType() {
            return this.newBuilderForType();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.Builder toBuilder() {
            return JvmMethodSignature.newBuilder(this);
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
            codedOutputStream0.writeRawBytes(this.a);
        }
    }

    public static final class JvmPropertySignature extends GeneratedMessageLite implements JvmProtoBuf.JvmPropertySignatureOrBuilder {
        public static final class kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder implements JvmProtoBuf.JvmPropertySignatureOrBuilder {
            public int b;
            public JvmFieldSignature c;
            public JvmMethodSignature d;
            public JvmMethodSignature e;
            public JvmMethodSignature f;
            public JvmMethodSignature g;

            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.Builder() {
                this.c = JvmFieldSignature.getDefaultInstance();
                this.d = JvmMethodSignature.getDefaultInstance();
                this.e = JvmMethodSignature.getDefaultInstance();
                this.f = JvmMethodSignature.getDefaultInstance();
                this.g = JvmMethodSignature.getDefaultInstance();
            }

            public JvmPropertySignature build() {
                JvmPropertySignature jvmProtoBuf$JvmPropertySignature0 = this.buildPartial();
                if(!jvmProtoBuf$JvmPropertySignature0.isInitialized()) {
                    throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(jvmProtoBuf$JvmPropertySignature0);
                }
                return jvmProtoBuf$JvmPropertySignature0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite$Builder
            public MessageLite build() {
                return this.build();
            }

            public JvmPropertySignature buildPartial() {
                JvmPropertySignature jvmProtoBuf$JvmPropertySignature0 = new JvmPropertySignature(this);
                int v = this.b;
                int v1 = (v & 1) == 1 ? 1 : 0;
                jvmProtoBuf$JvmPropertySignature0.c = this.c;
                if((v & 2) == 2) {
                    v1 |= 2;
                }
                jvmProtoBuf$JvmPropertySignature0.d = this.d;
                if((v & 4) == 4) {
                    v1 |= 4;
                }
                jvmProtoBuf$JvmPropertySignature0.e = this.e;
                if((v & 8) == 8) {
                    v1 |= 8;
                }
                jvmProtoBuf$JvmPropertySignature0.f = this.f;
                if((v & 16) == 16) {
                    v1 |= 16;
                }
                jvmProtoBuf$JvmPropertySignature0.g = this.g;
                jvmProtoBuf$JvmPropertySignature0.b = v1;
                return jvmProtoBuf$JvmPropertySignature0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public Object clone() throws CloneNotSupportedException {
                return this.clone();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.Builder clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.Builder().mergeFrom(this.buildPartial());
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder clone() {
                return this.clone();
            }

            public JvmPropertySignature getDefaultInstanceForType() {
                return JvmPropertySignature.getDefaultInstance();
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

            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.Builder mergeDelegateMethod(JvmMethodSignature jvmProtoBuf$JvmMethodSignature0) {
                this.g = (this.b & 16) != 16 || this.g == JvmMethodSignature.getDefaultInstance() ? jvmProtoBuf$JvmMethodSignature0 : JvmMethodSignature.newBuilder(this.g).mergeFrom(jvmProtoBuf$JvmMethodSignature0).buildPartial();
                this.b |= 16;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.Builder mergeField(JvmFieldSignature jvmProtoBuf$JvmFieldSignature0) {
                this.c = (this.b & 1) != 1 || this.c == JvmFieldSignature.getDefaultInstance() ? jvmProtoBuf$JvmFieldSignature0 : JvmFieldSignature.newBuilder(this.c).mergeFrom(jvmProtoBuf$JvmFieldSignature0).buildPartial();
                this.b |= 1;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.Builder mergeFrom(JvmPropertySignature jvmProtoBuf$JvmPropertySignature0) {
                if(jvmProtoBuf$JvmPropertySignature0 == JvmPropertySignature.getDefaultInstance()) {
                    return this;
                }
                if(jvmProtoBuf$JvmPropertySignature0.hasField()) {
                    this.mergeField(jvmProtoBuf$JvmPropertySignature0.getField());
                }
                if(jvmProtoBuf$JvmPropertySignature0.hasSyntheticMethod()) {
                    this.mergeSyntheticMethod(jvmProtoBuf$JvmPropertySignature0.getSyntheticMethod());
                }
                if(jvmProtoBuf$JvmPropertySignature0.hasGetter()) {
                    this.mergeGetter(jvmProtoBuf$JvmPropertySignature0.getGetter());
                }
                if(jvmProtoBuf$JvmPropertySignature0.hasSetter()) {
                    this.mergeSetter(jvmProtoBuf$JvmPropertySignature0.getSetter());
                }
                if(jvmProtoBuf$JvmPropertySignature0.hasDelegateMethod()) {
                    this.mergeDelegateMethod(jvmProtoBuf$JvmPropertySignature0.getDelegateMethod());
                }
                this.setUnknownFields(this.getUnknownFields().concat(jvmProtoBuf$JvmPropertySignature0.a));
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                JvmPropertySignature jvmProtoBuf$JvmPropertySignature1;
                JvmPropertySignature jvmProtoBuf$JvmPropertySignature0;
                try {
                    try {
                        jvmProtoBuf$JvmPropertySignature0 = null;
                        jvmProtoBuf$JvmPropertySignature1 = (JvmPropertySignature)JvmPropertySignature.PARSER.parsePartialFrom(codedInputStream0, extensionRegistryLite0);
                        goto label_13;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                        JvmPropertySignature jvmProtoBuf$JvmPropertySignature2 = (JvmPropertySignature)invalidProtocolBufferException0.getUnfinishedMessage();
                        try {
                            throw invalidProtocolBufferException0;
                        }
                        catch(Throwable throwable0) {
                            jvmProtoBuf$JvmPropertySignature0 = jvmProtoBuf$JvmPropertySignature2;
                        }
                    }
                }
                catch(Throwable throwable0) {
                }
                if(jvmProtoBuf$JvmPropertySignature0 != null) {
                    this.mergeFrom(jvmProtoBuf$JvmPropertySignature0);
                }
                throw throwable0;
            label_13:
                if(jvmProtoBuf$JvmPropertySignature1 != null) {
                    this.mergeFrom(jvmProtoBuf$JvmPropertySignature1);
                }
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedMessageLite0) {
                return this.mergeFrom(((JvmPropertySignature)generatedMessageLite0));
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.Builder mergeGetter(JvmMethodSignature jvmProtoBuf$JvmMethodSignature0) {
                this.e = (this.b & 4) != 4 || this.e == JvmMethodSignature.getDefaultInstance() ? jvmProtoBuf$JvmMethodSignature0 : JvmMethodSignature.newBuilder(this.e).mergeFrom(jvmProtoBuf$JvmMethodSignature0).buildPartial();
                this.b |= 4;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.Builder mergeSetter(JvmMethodSignature jvmProtoBuf$JvmMethodSignature0) {
                this.f = (this.b & 8) != 8 || this.f == JvmMethodSignature.getDefaultInstance() ? jvmProtoBuf$JvmMethodSignature0 : JvmMethodSignature.newBuilder(this.f).mergeFrom(jvmProtoBuf$JvmMethodSignature0).buildPartial();
                this.b |= 8;
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.Builder mergeSyntheticMethod(JvmMethodSignature jvmProtoBuf$JvmMethodSignature0) {
                this.d = (this.b & 2) != 2 || this.d == JvmMethodSignature.getDefaultInstance() ? jvmProtoBuf$JvmMethodSignature0 : JvmMethodSignature.newBuilder(this.d).mergeFrom(jvmProtoBuf$JvmMethodSignature0).buildPartial();
                this.b |= 2;
                return this;
            }
        }

        public static Parser PARSER;
        public final ByteString a;
        public int b;
        public JvmFieldSignature c;
        public JvmMethodSignature d;
        public JvmMethodSignature e;
        public JvmMethodSignature f;
        public JvmMethodSignature g;
        public byte h;
        public int i;
        public static final JvmPropertySignature j;

        static {
            JvmPropertySignature.PARSER = new c();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/AbstractParser;-><init>()V
            JvmPropertySignature jvmProtoBuf$JvmPropertySignature0 = new JvmPropertySignature();
            JvmPropertySignature.j = jvmProtoBuf$JvmPropertySignature0;
            jvmProtoBuf$JvmPropertySignature0.c = JvmFieldSignature.getDefaultInstance();
            jvmProtoBuf$JvmPropertySignature0.d = JvmMethodSignature.getDefaultInstance();
            jvmProtoBuf$JvmPropertySignature0.e = JvmMethodSignature.getDefaultInstance();
            jvmProtoBuf$JvmPropertySignature0.f = JvmMethodSignature.getDefaultInstance();
            jvmProtoBuf$JvmPropertySignature0.g = JvmMethodSignature.getDefaultInstance();
        }

        public JvmPropertySignature() {
            this.h = -1;
            this.i = -1;
            this.a = ByteString.EMPTY;
        }

        public JvmPropertySignature(kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.Builder jvmProtoBuf$JvmPropertySignature$Builder0) {
            super(jvmProtoBuf$JvmPropertySignature$Builder0);
            this.h = -1;
            this.i = -1;
            this.a = jvmProtoBuf$JvmPropertySignature$Builder0.getUnknownFields();
        }

        public JvmPropertySignature(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) {
            this.h = -1;
            this.i = -1;
            this.c = JvmFieldSignature.getDefaultInstance();
            this.d = JvmMethodSignature.getDefaultInstance();
            this.e = JvmMethodSignature.getDefaultInstance();
            this.f = JvmMethodSignature.getDefaultInstance();
            this.g = JvmMethodSignature.getDefaultInstance();
            Output byteString$Output0 = ByteString.newOutput();
            CodedOutputStream codedOutputStream0 = CodedOutputStream.newInstance(byteString$Output0, 1);
            try {
                boolean z = false;
                while(!z) {
                    try {
                        int v1 = codedInputStream0.readTag();
                        if(v1 != 0) {
                            Builder jvmProtoBuf$JvmFieldSignature$Builder0 = null;
                            switch(v1) {
                                case 10: {
                                    if((this.b & 1) == 1) {
                                        jvmProtoBuf$JvmFieldSignature$Builder0 = this.c.toBuilder();
                                    }
                                    JvmFieldSignature jvmProtoBuf$JvmFieldSignature0 = (JvmFieldSignature)codedInputStream0.readMessage(JvmFieldSignature.PARSER, extensionRegistryLite0);
                                    this.c = jvmProtoBuf$JvmFieldSignature0;
                                    if(jvmProtoBuf$JvmFieldSignature$Builder0 != null) {
                                        jvmProtoBuf$JvmFieldSignature$Builder0.mergeFrom(jvmProtoBuf$JvmFieldSignature0);
                                        this.c = jvmProtoBuf$JvmFieldSignature$Builder0.buildPartial();
                                    }
                                    this.b |= 1;
                                    continue;
                                }
                                case 18: {
                                    if((this.b & 2) == 2) {
                                        jvmProtoBuf$JvmFieldSignature$Builder0 = this.d.toBuilder();
                                    }
                                    JvmMethodSignature jvmProtoBuf$JvmMethodSignature3 = (JvmMethodSignature)codedInputStream0.readMessage(JvmMethodSignature.PARSER, extensionRegistryLite0);
                                    this.d = jvmProtoBuf$JvmMethodSignature3;
                                    if(jvmProtoBuf$JvmFieldSignature$Builder0 != null) {
                                        ((kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.Builder)jvmProtoBuf$JvmFieldSignature$Builder0).mergeFrom(jvmProtoBuf$JvmMethodSignature3);
                                        this.d = ((kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.Builder)jvmProtoBuf$JvmFieldSignature$Builder0).buildPartial();
                                    }
                                    this.b |= 2;
                                    continue;
                                }
                                case 26: {
                                    if((this.b & 4) == 4) {
                                        jvmProtoBuf$JvmFieldSignature$Builder0 = this.e.toBuilder();
                                    }
                                    JvmMethodSignature jvmProtoBuf$JvmMethodSignature2 = (JvmMethodSignature)codedInputStream0.readMessage(JvmMethodSignature.PARSER, extensionRegistryLite0);
                                    this.e = jvmProtoBuf$JvmMethodSignature2;
                                    if(jvmProtoBuf$JvmFieldSignature$Builder0 != null) {
                                        ((kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.Builder)jvmProtoBuf$JvmFieldSignature$Builder0).mergeFrom(jvmProtoBuf$JvmMethodSignature2);
                                        this.e = ((kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.Builder)jvmProtoBuf$JvmFieldSignature$Builder0).buildPartial();
                                    }
                                    this.b |= 4;
                                    continue;
                                }
                                case 34: {
                                    if((this.b & 8) == 8) {
                                        jvmProtoBuf$JvmFieldSignature$Builder0 = this.f.toBuilder();
                                    }
                                    JvmMethodSignature jvmProtoBuf$JvmMethodSignature1 = (JvmMethodSignature)codedInputStream0.readMessage(JvmMethodSignature.PARSER, extensionRegistryLite0);
                                    this.f = jvmProtoBuf$JvmMethodSignature1;
                                    if(jvmProtoBuf$JvmFieldSignature$Builder0 != null) {
                                        ((kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.Builder)jvmProtoBuf$JvmFieldSignature$Builder0).mergeFrom(jvmProtoBuf$JvmMethodSignature1);
                                        this.f = ((kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.Builder)jvmProtoBuf$JvmFieldSignature$Builder0).buildPartial();
                                    }
                                    this.b |= 8;
                                    continue;
                                }
                                case 42: {
                                    if((this.b & 16) == 16) {
                                        jvmProtoBuf$JvmFieldSignature$Builder0 = this.g.toBuilder();
                                    }
                                    JvmMethodSignature jvmProtoBuf$JvmMethodSignature0 = (JvmMethodSignature)codedInputStream0.readMessage(JvmMethodSignature.PARSER, extensionRegistryLite0);
                                    this.g = jvmProtoBuf$JvmMethodSignature0;
                                    if(jvmProtoBuf$JvmFieldSignature$Builder0 != null) {
                                        ((kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.Builder)jvmProtoBuf$JvmFieldSignature$Builder0).mergeFrom(jvmProtoBuf$JvmMethodSignature0);
                                        this.g = ((kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.Builder)jvmProtoBuf$JvmFieldSignature$Builder0).buildPartial();
                                    }
                                    this.b |= 16;
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
                    try {
                        codedOutputStream0.flush();
                        goto label_83;
                    }
                    catch(IOException unused_ex) {
                        goto label_83;
                    }
                    catch(Throwable throwable1) {
                    }
                    throw throwable1;
                label_83:
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

        public static JvmPropertySignature getDefaultInstance() {
            return JvmPropertySignature.j;
        }

        public JvmPropertySignature getDefaultInstanceForType() {
            return JvmPropertySignature.j;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public MessageLite getDefaultInstanceForType() {
            return this.getDefaultInstanceForType();
        }

        public JvmMethodSignature getDelegateMethod() {
            return this.g;
        }

        public JvmFieldSignature getField() {
            return this.c;
        }

        public JvmMethodSignature getGetter() {
            return this.e;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser getParserForType() {
            return JvmPropertySignature.PARSER;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int v = this.i;
            if(v != -1) {
                return v;
            }
            int v1 = (this.b & 1) == 1 ? CodedOutputStream.computeMessageSize(1, this.c) : 0;
            if((this.b & 2) == 2) {
                v1 += CodedOutputStream.computeMessageSize(2, this.d);
            }
            if((this.b & 4) == 4) {
                v1 += CodedOutputStream.computeMessageSize(3, this.e);
            }
            if((this.b & 8) == 8) {
                v1 += CodedOutputStream.computeMessageSize(4, this.f);
            }
            if((this.b & 16) == 16) {
                v1 += CodedOutputStream.computeMessageSize(5, this.g);
            }
            int v2 = this.a.size() + v1;
            this.i = v2;
            return v2;
        }

        public JvmMethodSignature getSetter() {
            return this.f;
        }

        public JvmMethodSignature getSyntheticMethod() {
            return this.d;
        }

        public boolean hasDelegateMethod() {
            return (this.b & 16) == 16;
        }

        public boolean hasField() {
            return (this.b & 1) == 1;
        }

        public boolean hasGetter() {
            return (this.b & 4) == 4;
        }

        public boolean hasSetter() {
            return (this.b & 8) == 8;
        }

        public boolean hasSyntheticMethod() {
            return (this.b & 2) == 2;
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
            this.h = 1;
            return true;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.Builder newBuilder() {
            return new kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.Builder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.Builder newBuilder(JvmPropertySignature jvmProtoBuf$JvmPropertySignature0) {
            return JvmPropertySignature.newBuilder().mergeFrom(jvmProtoBuf$JvmPropertySignature0);
        }

        public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.Builder newBuilderForType() {
            return JvmPropertySignature.newBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder newBuilderForType() {
            return this.newBuilderForType();
        }

        public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.Builder toBuilder() {
            return JvmPropertySignature.newBuilder(this);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder toBuilder() {
            return this.toBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream0) throws IOException {
            this.getSerializedSize();
            if((this.b & 1) == 1) {
                codedOutputStream0.writeMessage(1, this.c);
            }
            if((this.b & 2) == 2) {
                codedOutputStream0.writeMessage(2, this.d);
            }
            if((this.b & 4) == 4) {
                codedOutputStream0.writeMessage(3, this.e);
            }
            if((this.b & 8) == 8) {
                codedOutputStream0.writeMessage(4, this.f);
            }
            if((this.b & 16) == 16) {
                codedOutputStream0.writeMessage(5, this.g);
            }
            codedOutputStream0.writeRawBytes(this.a);
        }
    }

    public static final class StringTableTypes extends GeneratedMessageLite implements JvmProtoBuf.StringTableTypesOrBuilder {
        public static final class kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder implements JvmProtoBuf.StringTableTypesOrBuilder {
            public int b;
            public List c;
            public List d;

            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Builder() {
                this.c = Collections.emptyList();
                this.d = Collections.emptyList();
            }

            public StringTableTypes build() {
                StringTableTypes jvmProtoBuf$StringTableTypes0 = this.buildPartial();
                if(!jvmProtoBuf$StringTableTypes0.isInitialized()) {
                    throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(jvmProtoBuf$StringTableTypes0);
                }
                return jvmProtoBuf$StringTableTypes0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite$Builder
            public MessageLite build() {
                return this.build();
            }

            public StringTableTypes buildPartial() {
                StringTableTypes jvmProtoBuf$StringTableTypes0 = new StringTableTypes(this);
                if((this.b & 1) == 1) {
                    this.c = Collections.unmodifiableList(this.c);
                    this.b &= -2;
                }
                jvmProtoBuf$StringTableTypes0.b = this.c;
                if((this.b & 2) == 2) {
                    this.d = Collections.unmodifiableList(this.d);
                    this.b &= -3;
                }
                jvmProtoBuf$StringTableTypes0.c = this.d;
                return jvmProtoBuf$StringTableTypes0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public Object clone() throws CloneNotSupportedException {
                return this.clone();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Builder clone() {
                return new kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Builder().mergeFrom(this.buildPartial());
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder clone() {
                return this.clone();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder clone() {
                return this.clone();
            }

            public StringTableTypes getDefaultInstanceForType() {
                return StringTableTypes.getDefaultInstance();
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

            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Builder mergeFrom(StringTableTypes jvmProtoBuf$StringTableTypes0) {
                if(jvmProtoBuf$StringTableTypes0 == StringTableTypes.getDefaultInstance()) {
                    return this;
                }
                if(!jvmProtoBuf$StringTableTypes0.b.isEmpty()) {
                    if(this.c.isEmpty()) {
                        this.c = jvmProtoBuf$StringTableTypes0.b;
                        this.b &= -2;
                    }
                    else {
                        if((this.b & 1) != 1) {
                            this.c = new ArrayList(this.c);
                            this.b |= 1;
                        }
                        this.c.addAll(jvmProtoBuf$StringTableTypes0.b);
                    }
                }
                if(!jvmProtoBuf$StringTableTypes0.c.isEmpty()) {
                    if(this.d.isEmpty()) {
                        this.d = jvmProtoBuf$StringTableTypes0.c;
                        this.b &= -3;
                    }
                    else {
                        if((this.b & 2) != 2) {
                            this.d = new ArrayList(this.d);
                            this.b |= 2;
                        }
                        this.d.addAll(jvmProtoBuf$StringTableTypes0.c);
                    }
                }
                this.setUnknownFields(this.getUnknownFields().concat(jvmProtoBuf$StringTableTypes0.a));
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                StringTableTypes jvmProtoBuf$StringTableTypes1;
                StringTableTypes jvmProtoBuf$StringTableTypes0;
                try {
                    try {
                        jvmProtoBuf$StringTableTypes0 = null;
                        jvmProtoBuf$StringTableTypes1 = (StringTableTypes)StringTableTypes.PARSER.parsePartialFrom(codedInputStream0, extensionRegistryLite0);
                        goto label_13;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                        StringTableTypes jvmProtoBuf$StringTableTypes2 = (StringTableTypes)invalidProtocolBufferException0.getUnfinishedMessage();
                        try {
                            throw invalidProtocolBufferException0;
                        }
                        catch(Throwable throwable0) {
                            jvmProtoBuf$StringTableTypes0 = jvmProtoBuf$StringTableTypes2;
                        }
                    }
                }
                catch(Throwable throwable0) {
                }
                if(jvmProtoBuf$StringTableTypes0 != null) {
                    this.mergeFrom(jvmProtoBuf$StringTableTypes0);
                }
                throw throwable0;
            label_13:
                if(jvmProtoBuf$StringTableTypes1 != null) {
                    this.mergeFrom(jvmProtoBuf$StringTableTypes1);
                }
                return this;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedMessageLite0) {
                return this.mergeFrom(((StringTableTypes)generatedMessageLite0));
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
            public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
            }
        }

        public static final class Record extends GeneratedMessageLite implements JvmProtoBuf.StringTableTypes.RecordOrBuilder {
            public static final class kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder implements JvmProtoBuf.StringTableTypes.RecordOrBuilder {
                public int b;
                public int c;
                public int d;
                public Object e;
                public Operation f;
                public List g;
                public List h;

                public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Builder() {
                    this.c = 1;
                    this.e = "";
                    this.f = Operation.NONE;
                    this.g = Collections.emptyList();
                    this.h = Collections.emptyList();
                }

                public Record build() {
                    Record jvmProtoBuf$StringTableTypes$Record0 = this.buildPartial();
                    if(!jvmProtoBuf$StringTableTypes$Record0.isInitialized()) {
                        throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(jvmProtoBuf$StringTableTypes$Record0);
                    }
                    return jvmProtoBuf$StringTableTypes$Record0;
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite$Builder
                public MessageLite build() {
                    return this.build();
                }

                public Record buildPartial() {
                    Record jvmProtoBuf$StringTableTypes$Record0 = new Record(this);
                    int v = this.b;
                    int v1 = (v & 1) == 1 ? 1 : 0;
                    jvmProtoBuf$StringTableTypes$Record0.c = this.c;
                    if((v & 2) == 2) {
                        v1 |= 2;
                    }
                    jvmProtoBuf$StringTableTypes$Record0.d = this.d;
                    if((v & 4) == 4) {
                        v1 |= 4;
                    }
                    jvmProtoBuf$StringTableTypes$Record0.e = this.e;
                    if((v & 8) == 8) {
                        v1 |= 8;
                    }
                    jvmProtoBuf$StringTableTypes$Record0.f = this.f;
                    if((v & 16) == 16) {
                        this.g = Collections.unmodifiableList(this.g);
                        this.b &= -17;
                    }
                    jvmProtoBuf$StringTableTypes$Record0.g = this.g;
                    if((this.b & 0x20) == 0x20) {
                        this.h = Collections.unmodifiableList(this.h);
                        this.b &= -33;
                    }
                    jvmProtoBuf$StringTableTypes$Record0.i = this.h;
                    jvmProtoBuf$StringTableTypes$Record0.b = v1;
                    return jvmProtoBuf$StringTableTypes$Record0;
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
                public Object clone() throws CloneNotSupportedException {
                    return this.clone();
                }

                public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Builder clone() {
                    return new kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Builder().mergeFrom(this.buildPartial());
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
                public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder clone() {
                    return this.clone();
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
                public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder clone() {
                    return this.clone();
                }

                public Record getDefaultInstanceForType() {
                    return Record.getDefaultInstance();
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

                public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Builder mergeFrom(Record jvmProtoBuf$StringTableTypes$Record0) {
                    if(jvmProtoBuf$StringTableTypes$Record0 == Record.getDefaultInstance()) {
                        return this;
                    }
                    if(jvmProtoBuf$StringTableTypes$Record0.hasRange()) {
                        this.setRange(jvmProtoBuf$StringTableTypes$Record0.getRange());
                    }
                    if(jvmProtoBuf$StringTableTypes$Record0.hasPredefinedIndex()) {
                        this.setPredefinedIndex(jvmProtoBuf$StringTableTypes$Record0.getPredefinedIndex());
                    }
                    if(jvmProtoBuf$StringTableTypes$Record0.hasString()) {
                        this.b |= 4;
                        this.e = jvmProtoBuf$StringTableTypes$Record0.e;
                    }
                    if(jvmProtoBuf$StringTableTypes$Record0.hasOperation()) {
                        this.setOperation(jvmProtoBuf$StringTableTypes$Record0.getOperation());
                    }
                    if(!jvmProtoBuf$StringTableTypes$Record0.g.isEmpty()) {
                        if(this.g.isEmpty()) {
                            this.g = jvmProtoBuf$StringTableTypes$Record0.g;
                            this.b &= -17;
                        }
                        else {
                            if((this.b & 16) != 16) {
                                this.g = new ArrayList(this.g);
                                this.b |= 16;
                            }
                            this.g.addAll(jvmProtoBuf$StringTableTypes$Record0.g);
                        }
                    }
                    if(!jvmProtoBuf$StringTableTypes$Record0.i.isEmpty()) {
                        if(this.h.isEmpty()) {
                            this.h = jvmProtoBuf$StringTableTypes$Record0.i;
                            this.b &= -33;
                        }
                        else {
                            if((this.b & 0x20) != 0x20) {
                                this.h = new ArrayList(this.h);
                                this.b |= 0x20;
                            }
                            this.h.addAll(jvmProtoBuf$StringTableTypes$Record0.i);
                        }
                    }
                    this.setUnknownFields(this.getUnknownFields().concat(jvmProtoBuf$StringTableTypes$Record0.a));
                    return this;
                }

                public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                    Record jvmProtoBuf$StringTableTypes$Record1;
                    Record jvmProtoBuf$StringTableTypes$Record0;
                    try {
                        try {
                            jvmProtoBuf$StringTableTypes$Record0 = null;
                            jvmProtoBuf$StringTableTypes$Record1 = (Record)Record.PARSER.parsePartialFrom(codedInputStream0, extensionRegistryLite0);
                            goto label_13;
                        }
                        catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                            Record jvmProtoBuf$StringTableTypes$Record2 = (Record)invalidProtocolBufferException0.getUnfinishedMessage();
                            try {
                                throw invalidProtocolBufferException0;
                            }
                            catch(Throwable throwable0) {
                                jvmProtoBuf$StringTableTypes$Record0 = jvmProtoBuf$StringTableTypes$Record2;
                            }
                        }
                    }
                    catch(Throwable throwable0) {
                    }
                    if(jvmProtoBuf$StringTableTypes$Record0 != null) {
                        this.mergeFrom(jvmProtoBuf$StringTableTypes$Record0);
                    }
                    throw throwable0;
                label_13:
                    if(jvmProtoBuf$StringTableTypes$Record1 != null) {
                        this.mergeFrom(jvmProtoBuf$StringTableTypes$Record1);
                    }
                    return this;
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
                public kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                    return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$Builder
                public kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedMessageLite0) {
                    return this.mergeFrom(((Record)generatedMessageLite0));
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder
                public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                    return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
                }

                public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Builder setOperation(Operation jvmProtoBuf$StringTableTypes$Record$Operation0) {
                    jvmProtoBuf$StringTableTypes$Record$Operation0.getClass();
                    this.b |= 8;
                    this.f = jvmProtoBuf$StringTableTypes$Record$Operation0;
                    return this;
                }

                public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Builder setPredefinedIndex(int v) {
                    this.b |= 2;
                    this.d = v;
                    return this;
                }

                public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Builder setRange(int v) {
                    this.b |= 1;
                    this.c = v;
                    return this;
                }
            }

            public static enum Operation implements EnumLite {
                NONE(0),
                INTERNAL_TO_CLASS_ID(1),
                DESC_TO_CLASS_ID(2);

                public final int a;

                public Operation(int v1) {
                    this.a = v1;
                }

                @Override  // kotlin.reflect.jvm.internal.impl.protobuf.Internal$EnumLite
                public final int getNumber() {
                    return this.a;
                }

                public static Operation valueOf(int v) {
                    switch(v) {
                        case 0: {
                            return Operation.NONE;
                        }
                        case 1: {
                            return Operation.INTERNAL_TO_CLASS_ID;
                        }
                        case 2: {
                            return Operation.DESC_TO_CLASS_ID;
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
            public Object e;
            public Operation f;
            public List g;
            public int h;
            public List i;
            public int j;
            public byte k;
            public int l;
            public static final Record m;

            static {
                Record.PARSER = new e();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/AbstractParser;-><init>()V
                Record jvmProtoBuf$StringTableTypes$Record0 = new Record();
                Record.m = jvmProtoBuf$StringTableTypes$Record0;
                jvmProtoBuf$StringTableTypes$Record0.c = 1;
                jvmProtoBuf$StringTableTypes$Record0.d = 0;
                jvmProtoBuf$StringTableTypes$Record0.e = "";
                jvmProtoBuf$StringTableTypes$Record0.f = Operation.NONE;
                jvmProtoBuf$StringTableTypes$Record0.g = Collections.emptyList();
                jvmProtoBuf$StringTableTypes$Record0.i = Collections.emptyList();
            }

            public Record() {
                this.h = -1;
                this.j = -1;
                this.k = -1;
                this.l = -1;
                this.a = ByteString.EMPTY;
            }

            public Record(kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Builder jvmProtoBuf$StringTableTypes$Record$Builder0) {
                super(jvmProtoBuf$StringTableTypes$Record$Builder0);
                this.h = -1;
                this.j = -1;
                this.k = -1;
                this.l = -1;
                this.a = jvmProtoBuf$StringTableTypes$Record$Builder0.getUnknownFields();
            }

            public Record(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) {
                this.h = -1;
                this.j = -1;
                this.k = -1;
                this.l = -1;
                this.c = 1;
                this.d = 0;
                this.e = "";
                this.f = Operation.NONE;
                this.g = Collections.emptyList();
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
                                    Operation jvmProtoBuf$StringTableTypes$Record$Operation0 = Operation.valueOf(v2);
                                    if(jvmProtoBuf$StringTableTypes$Record$Operation0 == null) {
                                        codedOutputStream0.writeRawVarint32(24);
                                        codedOutputStream0.writeRawVarint32(v2);
                                    }
                                    else {
                                        this.b |= 8;
                                        this.f = jvmProtoBuf$StringTableTypes$Record$Operation0;
                                    }
                                    continue;
                                }
                                case 0x20: {
                                    if((v & 16) != 16) {
                                        this.g = new ArrayList();
                                        v |= 16;
                                    }
                                    this.g.add(codedInputStream0.readInt32());
                                    continue;
                                }
                                case 34: {
                                    int v3 = codedInputStream0.pushLimit(codedInputStream0.readRawVarint32());
                                    if((v & 16) != 16 && codedInputStream0.getBytesUntilLimit() > 0) {
                                        this.g = new ArrayList();
                                        v |= 16;
                                    }
                                    while(codedInputStream0.getBytesUntilLimit() > 0) {
                                        this.g.add(codedInputStream0.readInt32());
                                    }
                                    codedInputStream0.popLimit(v3);
                                    continue;
                                }
                                case 40: {
                                    if((v & 0x20) != 0x20) {
                                        this.i = new ArrayList();
                                        v |= 0x20;
                                    }
                                    this.i.add(codedInputStream0.readInt32());
                                    continue;
                                }
                                case 42: {
                                    int v4 = codedInputStream0.pushLimit(codedInputStream0.readRawVarint32());
                                    if((v & 0x20) != 0x20 && codedInputStream0.getBytesUntilLimit() > 0) {
                                        this.i = new ArrayList();
                                        v |= 0x20;
                                    }
                                    while(codedInputStream0.getBytesUntilLimit() > 0) {
                                        this.i.add(codedInputStream0.readInt32());
                                    }
                                    codedInputStream0.popLimit(v4);
                                    continue;
                                }
                                case 50: {
                                    ByteString byteString0 = codedInputStream0.readBytes();
                                    this.b |= 4;
                                    this.e = byteString0;
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
                        this.g = Collections.unmodifiableList(this.g);
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
                    catch(Throwable throwable1) {
                    }
                    this.a = byteString$Output0.toByteString();
                    throw throwable1;
                label_94:
                    this.a = byteString$Output0.toByteString();
                    this.makeExtensionsImmutable();
                    throw throwable0;
                }
                if((v & 16) == 16) {
                    this.g = Collections.unmodifiableList(this.g);
                }
                if((v & 0x20) == 0x20) {
                    this.i = Collections.unmodifiableList(this.i);
                }
                try {
                    codedOutputStream0.flush();
                    goto label_106;
                }
                catch(IOException unused_ex) {
                    goto label_106;
                }
                catch(Throwable throwable2) {
                }
                this.a = byteString$Output0.toByteString();
                throw throwable2;
            label_106:
                this.a = byteString$Output0.toByteString();
                this.makeExtensionsImmutable();
            }

            public static Record getDefaultInstance() {
                return Record.m;
            }

            public Record getDefaultInstanceForType() {
                return Record.m;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public MessageLite getDefaultInstanceForType() {
                return this.getDefaultInstanceForType();
            }

            public Operation getOperation() {
                return this.f;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
            public Parser getParserForType() {
                return Record.PARSER;
            }

            public int getPredefinedIndex() {
                return this.d;
            }

            public int getRange() {
                return this.c;
            }

            public int getReplaceCharCount() {
                return this.i.size();
            }

            public List getReplaceCharList() {
                return this.i;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int v1 = this.l;
                if(v1 != -1) {
                    return v1;
                }
                int v2 = (this.b & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.c) : 0;
                if((this.b & 2) == 2) {
                    v2 += CodedOutputStream.computeInt32Size(2, this.d);
                }
                if((this.b & 8) == 8) {
                    v2 += CodedOutputStream.computeEnumSize(3, this.f.getNumber());
                }
                int v4 = 0;
                for(int v3 = 0; v3 < this.g.size(); ++v3) {
                    v4 += CodedOutputStream.computeInt32SizeNoTag(((int)(((Integer)this.g.get(v3)))));
                }
                int v5 = this.getSubstringIndexList().isEmpty() ? v2 + v4 : v2 + v4 + 1 + CodedOutputStream.computeInt32SizeNoTag(v4);
                this.h = v4;
                int v6 = 0;
                for(int v = 0; v < this.i.size(); ++v) {
                    v6 += CodedOutputStream.computeInt32SizeNoTag(((int)(((Integer)this.i.get(v)))));
                }
                int v7 = this.getReplaceCharList().isEmpty() ? v5 + v6 : v5 + v6 + 1 + CodedOutputStream.computeInt32SizeNoTag(v6);
                this.j = v6;
                if((this.b & 4) == 4) {
                    v7 += CodedOutputStream.computeBytesSize(6, this.getStringBytes());
                }
                int v8 = this.a.size() + v7;
                this.l = v8;
                return v8;
            }

            public String getString() {
                Object object0 = this.e;
                if(object0 instanceof String) {
                    return (String)object0;
                }
                String s = ((ByteString)object0).toStringUtf8();
                if(((ByteString)object0).isValidUtf8()) {
                    this.e = s;
                }
                return s;
            }

            public ByteString getStringBytes() {
                Object object0 = this.e;
                if(object0 instanceof String) {
                    ByteString byteString0 = ByteString.copyFromUtf8(((String)object0));
                    this.e = byteString0;
                    return byteString0;
                }
                return (ByteString)object0;
            }

            public int getSubstringIndexCount() {
                return this.g.size();
            }

            public List getSubstringIndexList() {
                return this.g;
            }

            public boolean hasOperation() {
                return (this.b & 8) == 8;
            }

            public boolean hasPredefinedIndex() {
                return (this.b & 2) == 2;
            }

            public boolean hasRange() {
                return (this.b & 1) == 1;
            }

            public boolean hasString() {
                return (this.b & 4) == 4;
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
                this.k = 1;
                return true;
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Builder newBuilder() {
                return new kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Builder();
            }

            public static kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Builder newBuilder(Record jvmProtoBuf$StringTableTypes$Record0) {
                return Record.newBuilder().mergeFrom(jvmProtoBuf$StringTableTypes$Record0);
            }

            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Builder newBuilderForType() {
                return Record.newBuilder();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder newBuilderForType() {
                return this.newBuilderForType();
            }

            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Builder toBuilder() {
                return Record.newBuilder(this);
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
                if((this.b & 8) == 8) {
                    codedOutputStream0.writeEnum(3, this.f.getNumber());
                }
                if(this.getSubstringIndexList().size() > 0) {
                    codedOutputStream0.writeRawVarint32(34);
                    codedOutputStream0.writeRawVarint32(this.h);
                }
                for(int v1 = 0; v1 < this.g.size(); ++v1) {
                    codedOutputStream0.writeInt32NoTag(((int)(((Integer)this.g.get(v1)))));
                }
                if(this.getReplaceCharList().size() > 0) {
                    codedOutputStream0.writeRawVarint32(42);
                    codedOutputStream0.writeRawVarint32(this.j);
                }
                for(int v = 0; v < this.i.size(); ++v) {
                    codedOutputStream0.writeInt32NoTag(((int)(((Integer)this.i.get(v)))));
                }
                if((this.b & 4) == 4) {
                    codedOutputStream0.writeBytes(6, this.getStringBytes());
                }
                codedOutputStream0.writeRawBytes(this.a);
            }
        }

        public static Parser PARSER;
        public final ByteString a;
        public List b;
        public List c;
        public int d;
        public byte e;
        public int f;
        public static final StringTableTypes g;

        static {
            StringTableTypes.PARSER = new d();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/protobuf/AbstractParser;-><init>()V
            StringTableTypes jvmProtoBuf$StringTableTypes0 = new StringTableTypes();
            StringTableTypes.g = jvmProtoBuf$StringTableTypes0;
            jvmProtoBuf$StringTableTypes0.b = Collections.emptyList();
            jvmProtoBuf$StringTableTypes0.c = Collections.emptyList();
        }

        public StringTableTypes() {
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.a = ByteString.EMPTY;
        }

        public StringTableTypes(kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Builder jvmProtoBuf$StringTableTypes$Builder0) {
            super(jvmProtoBuf$StringTableTypes$Builder0);
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.a = jvmProtoBuf$StringTableTypes$Builder0.getUnknownFields();
        }

        public StringTableTypes(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) {
            int v2;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.b = Collections.emptyList();
            this.c = Collections.emptyList();
            Output byteString$Output0 = ByteString.newOutput();
            CodedOutputStream codedOutputStream0 = CodedOutputStream.newInstance(byteString$Output0, 1);
            int v = 0;
            boolean z = false;
            while(!z) {
                try {
                    try {
                        int v1 = codedInputStream0.readTag();
                    alab1:
                        switch(v1) {
                            case 0: {
                            label_14:
                                z = true;
                                continue;
                            }
                            case 10: {
                                if((v & 1) != 1) {
                                    this.b = new ArrayList();
                                    v |= 1;
                                }
                                this.b.add(codedInputStream0.readMessage(Record.PARSER, extensionRegistryLite0));
                                continue;
                            }
                            case 40: {
                                if((v & 2) != 2) {
                                    this.c = new ArrayList();
                                    v |= 2;
                                }
                                this.c.add(codedInputStream0.readInt32());
                                continue;
                            }
                            case 42: {
                                v2 = codedInputStream0.pushLimit(codedInputStream0.readRawVarint32());
                                if((v & 2) != 2 && codedInputStream0.getBytesUntilLimit() > 0) {
                                    this.c = new ArrayList();
                                    v |= 2;
                                }
                                while(true) {
                                    if(codedInputStream0.getBytesUntilLimit() <= 0) {
                                        break alab1;
                                    }
                                    this.c.add(codedInputStream0.readInt32());
                                }
                            }
                            default: {
                                if(!this.parseUnknownField(codedInputStream0, codedOutputStream0, extensionRegistryLite0, v1)) {
                                    goto label_14;
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
                if((v & 1) == 1) {
                    this.b = Collections.unmodifiableList(this.b);
                }
                if((v & 2) == 2) {
                    this.c = Collections.unmodifiableList(this.c);
                }
                try {
                    codedOutputStream0.flush();
                    goto label_51;
                }
                catch(IOException unused_ex) {
                    goto label_51;
                }
                catch(Throwable throwable1) {
                }
                this.a = byteString$Output0.toByteString();
                throw throwable1;
            label_51:
                this.a = byteString$Output0.toByteString();
                this.makeExtensionsImmutable();
                throw throwable0;
            }
            if((v & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
            }
            if((v & 2) == 2) {
                this.c = Collections.unmodifiableList(this.c);
            }
            try {
                codedOutputStream0.flush();
                goto label_63;
            }
            catch(IOException unused_ex) {
                goto label_63;
            }
            catch(Throwable throwable2) {
            }
            this.a = byteString$Output0.toByteString();
            throw throwable2;
        label_63:
            this.a = byteString$Output0.toByteString();
            this.makeExtensionsImmutable();
        }

        public static StringTableTypes getDefaultInstance() {
            return StringTableTypes.g;
        }

        public StringTableTypes getDefaultInstanceForType() {
            return StringTableTypes.g;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public MessageLite getDefaultInstanceForType() {
            return this.getDefaultInstanceForType();
        }

        public List getLocalNameList() {
            return this.c;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser getParserForType() {
            return StringTableTypes.PARSER;
        }

        public List getRecordList() {
            return this.b;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int v = this.f;
            if(v != -1) {
                return v;
            }
            int v3 = 0;
            for(int v2 = 0; v2 < this.b.size(); ++v2) {
                v3 += CodedOutputStream.computeMessageSize(1, ((MessageLite)this.b.get(v2)));
            }
            int v4 = 0;
            for(int v1 = 0; v1 < this.c.size(); ++v1) {
                v4 += CodedOutputStream.computeInt32SizeNoTag(((int)(((Integer)this.c.get(v1)))));
            }
            this.d = v4;
            int v5 = this.a.size() + (this.getLocalNameList().isEmpty() ? v3 + v4 : v3 + v4 + 1 + CodedOutputStream.computeInt32SizeNoTag(v4));
            this.f = v5;
            return v5;
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
            this.e = 1;
            return true;
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Builder newBuilder() {
            return new kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Builder();
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Builder newBuilder(StringTableTypes jvmProtoBuf$StringTableTypes0) {
            return StringTableTypes.newBuilder().mergeFrom(jvmProtoBuf$StringTableTypes0);
        }

        public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Builder newBuilderForType() {
            return StringTableTypes.newBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder newBuilderForType() {
            return this.newBuilderForType();
        }

        public static StringTableTypes parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (StringTableTypes)StringTableTypes.PARSER.parseDelimitedFrom(inputStream0, extensionRegistryLite0);
        }

        public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Builder toBuilder() {
            return StringTableTypes.newBuilder(this);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder toBuilder() {
            return this.toBuilder();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream0) throws IOException {
            this.getSerializedSize();
            for(int v1 = 0; v1 < this.b.size(); ++v1) {
                codedOutputStream0.writeMessage(1, ((MessageLite)this.b.get(v1)));
            }
            if(this.getLocalNameList().size() > 0) {
                codedOutputStream0.writeRawVarint32(42);
                codedOutputStream0.writeRawVarint32(this.d);
            }
            for(int v = 0; v < this.c.size(); ++v) {
                codedOutputStream0.writeInt32NoTag(((int)(((Integer)this.c.get(v)))));
            }
            codedOutputStream0.writeRawBytes(this.a);
        }
    }

    public static final GeneratedExtension anonymousObjectOriginName;
    public static final GeneratedExtension classLocalVariable;
    public static final GeneratedExtension classModuleName;
    public static final GeneratedExtension constructorSignature;
    public static final GeneratedExtension flags;
    public static final GeneratedExtension isRaw;
    public static final GeneratedExtension jvmClassFlags;
    public static final GeneratedExtension lambdaClassOriginName;
    public static final GeneratedExtension methodSignature;
    public static final GeneratedExtension packageLocalVariable;
    public static final GeneratedExtension packageModuleName;
    public static final GeneratedExtension propertySignature;
    public static final GeneratedExtension typeAnnotation;
    public static final GeneratedExtension typeParameterAnnotation;

    static {
        JvmProtoBuf.constructorSignature = GeneratedMessageLite.newSingularGeneratedExtension(Constructor.getDefaultInstance(), JvmMethodSignature.getDefaultInstance(), JvmMethodSignature.getDefaultInstance(), null, 100, FieldType.MESSAGE, JvmMethodSignature.class);
        JvmProtoBuf.methodSignature = GeneratedMessageLite.newSingularGeneratedExtension(Function.getDefaultInstance(), JvmMethodSignature.getDefaultInstance(), JvmMethodSignature.getDefaultInstance(), null, 100, FieldType.MESSAGE, JvmMethodSignature.class);
        JvmProtoBuf.lambdaClassOriginName = GeneratedMessageLite.newSingularGeneratedExtension(Function.getDefaultInstance(), 0, null, null, 101, FieldType.INT32, Integer.class);
        JvmProtoBuf.propertySignature = GeneratedMessageLite.newSingularGeneratedExtension(Property.getDefaultInstance(), JvmPropertySignature.getDefaultInstance(), JvmPropertySignature.getDefaultInstance(), null, 100, FieldType.MESSAGE, JvmPropertySignature.class);
        JvmProtoBuf.flags = GeneratedMessageLite.newSingularGeneratedExtension(Property.getDefaultInstance(), 0, null, null, 101, FieldType.INT32, Integer.class);
        JvmProtoBuf.typeAnnotation = GeneratedMessageLite.newRepeatedGeneratedExtension(Type.getDefaultInstance(), Annotation.getDefaultInstance(), null, 100, FieldType.MESSAGE, false, Annotation.class);
        JvmProtoBuf.isRaw = GeneratedMessageLite.newSingularGeneratedExtension(Type.getDefaultInstance(), Boolean.FALSE, null, null, 101, FieldType.BOOL, Boolean.class);
        JvmProtoBuf.typeParameterAnnotation = GeneratedMessageLite.newRepeatedGeneratedExtension(TypeParameter.getDefaultInstance(), Annotation.getDefaultInstance(), null, 100, FieldType.MESSAGE, false, Annotation.class);
        JvmProtoBuf.classModuleName = GeneratedMessageLite.newSingularGeneratedExtension(Class.getDefaultInstance(), 0, null, null, 101, FieldType.INT32, Integer.class);
        JvmProtoBuf.classLocalVariable = GeneratedMessageLite.newRepeatedGeneratedExtension(Class.getDefaultInstance(), Property.getDefaultInstance(), null, 102, FieldType.MESSAGE, false, Property.class);
        JvmProtoBuf.anonymousObjectOriginName = GeneratedMessageLite.newSingularGeneratedExtension(Class.getDefaultInstance(), 0, null, null, 103, FieldType.INT32, Integer.class);
        JvmProtoBuf.jvmClassFlags = GeneratedMessageLite.newSingularGeneratedExtension(Class.getDefaultInstance(), 0, null, null, 104, FieldType.INT32, Integer.class);
        JvmProtoBuf.packageModuleName = GeneratedMessageLite.newSingularGeneratedExtension(Package.getDefaultInstance(), 0, null, null, 101, FieldType.INT32, Integer.class);
        JvmProtoBuf.packageLocalVariable = GeneratedMessageLite.newRepeatedGeneratedExtension(Package.getDefaultInstance(), Property.getDefaultInstance(), null, 102, FieldType.MESSAGE, false, Property.class);
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite0) {
        extensionRegistryLite0.add(JvmProtoBuf.constructorSignature);
        extensionRegistryLite0.add(JvmProtoBuf.methodSignature);
        extensionRegistryLite0.add(JvmProtoBuf.lambdaClassOriginName);
        extensionRegistryLite0.add(JvmProtoBuf.propertySignature);
        extensionRegistryLite0.add(JvmProtoBuf.flags);
        extensionRegistryLite0.add(JvmProtoBuf.typeAnnotation);
        extensionRegistryLite0.add(JvmProtoBuf.isRaw);
        extensionRegistryLite0.add(JvmProtoBuf.typeParameterAnnotation);
        extensionRegistryLite0.add(JvmProtoBuf.classModuleName);
        extensionRegistryLite0.add(JvmProtoBuf.classLocalVariable);
        extensionRegistryLite0.add(JvmProtoBuf.anonymousObjectOriginName);
        extensionRegistryLite0.add(JvmProtoBuf.jvmClassFlags);
        extensionRegistryLite0.add(JvmProtoBuf.packageModuleName);
        extensionRegistryLite0.add(JvmProtoBuf.packageLocalVariable);
    }
}

