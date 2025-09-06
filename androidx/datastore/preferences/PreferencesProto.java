package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.AbstractMessageLite;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.CodedInputStream;
import androidx.datastore.preferences.protobuf.ExtensionRegistryLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal.ProtobufList;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.MapFieldLite;
import androidx.datastore.preferences.protobuf.MessageLiteOrBuilder;
import androidx.datastore.preferences.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import z3.b;

public final class PreferencesProto {
    public static final class PreferenceMap extends GeneratedMessageLite implements PreferenceMapOrBuilder {
        public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements PreferenceMapOrBuilder {
            public Builder clearPreferences() {
                this.copyOnWrite();
                PreferenceMap.q(((PreferenceMap)this.instance)).clear();
                return this;
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
            public boolean containsPreferences(String s) {
                s.getClass();
                return ((PreferenceMap)this.instance).getPreferencesMap().containsKey(s);
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
            @Deprecated
            public Map getPreferences() {
                return this.getPreferencesMap();
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
            public int getPreferencesCount() {
                return ((PreferenceMap)this.instance).getPreferencesMap().size();
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
            public Map getPreferencesMap() {
                return Collections.unmodifiableMap(((PreferenceMap)this.instance).getPreferencesMap());
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
            public Value getPreferencesOrDefault(String s, Value preferencesProto$Value0) {
                s.getClass();
                Map map0 = ((PreferenceMap)this.instance).getPreferencesMap();
                return map0.containsKey(s) ? ((Value)map0.get(s)) : preferencesProto$Value0;
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
            public Value getPreferencesOrThrow(String s) {
                s.getClass();
                Map map0 = ((PreferenceMap)this.instance).getPreferencesMap();
                if(!map0.containsKey(s)) {
                    throw new IllegalArgumentException();
                }
                return (Value)map0.get(s);
            }

            public Builder putAllPreferences(Map map0) {
                this.copyOnWrite();
                PreferenceMap.q(((PreferenceMap)this.instance)).putAll(map0);
                return this;
            }

            public Builder putPreferences(String s, Value preferencesProto$Value0) {
                s.getClass();
                preferencesProto$Value0.getClass();
                this.copyOnWrite();
                PreferenceMap.q(((PreferenceMap)this.instance)).put(s, preferencesProto$Value0);
                return this;
            }

            public Builder removePreferences(String s) {
                s.getClass();
                this.copyOnWrite();
                PreferenceMap.q(((PreferenceMap)this.instance)).remove(s);
                return this;
            }
        }

        private static final PreferenceMap DEFAULT_INSTANCE = null;
        private static volatile Parser PARSER = null;
        public static final int PREFERENCES_FIELD_NUMBER = 1;
        private MapFieldLite preferences_;

        static {
            PreferenceMap preferencesProto$PreferenceMap0 = new PreferenceMap();
            PreferenceMap.DEFAULT_INSTANCE = preferencesProto$PreferenceMap0;
            GeneratedMessageLite.registerDefaultInstance(PreferenceMap.class, preferencesProto$PreferenceMap0);
        }

        public PreferenceMap() {
            this.preferences_ = MapFieldLite.emptyMapField();
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
        public boolean containsPreferences(String s) {
            s.getClass();
            return this.preferences_.containsKey(s);
        }

        @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(b.a[generatedMessageLite$MethodToInvoke0.ordinal()]) {
                case 1: {
                    return new PreferenceMap();
                }
                case 2: {
                    return new Builder(PreferenceMap.DEFAULT_INSTANCE);  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite$Builder;-><init>(Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;)V
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(PreferenceMap.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", a.a});
                }
                case 4: {
                    return PreferenceMap.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = PreferenceMap.PARSER;
                    if(parser0 == null) {
                        Class class0 = PreferenceMap.class;
                        synchronized(class0) {
                            parser0 = PreferenceMap.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(PreferenceMap.DEFAULT_INSTANCE);
                                PreferenceMap.PARSER = parser0;
                            }
                        }
                    }
                    return parser0;
                }
                case 6: {
                    return (byte)1;
                }
                case 7: {
                    return null;
                }
                default: {
                    throw new UnsupportedOperationException();
                }
            }
        }

        public static PreferenceMap getDefaultInstance() {
            return PreferenceMap.DEFAULT_INSTANCE;
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
        @Deprecated
        public Map getPreferences() {
            return this.getPreferencesMap();
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
        public int getPreferencesCount() {
            return this.preferences_.size();
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
        public Map getPreferencesMap() {
            return Collections.unmodifiableMap(this.preferences_);
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
        public Value getPreferencesOrDefault(String s, Value preferencesProto$Value0) {
            s.getClass();
            MapFieldLite mapFieldLite0 = this.preferences_;
            return mapFieldLite0.containsKey(s) ? ((Value)mapFieldLite0.get(s)) : preferencesProto$Value0;
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
        public Value getPreferencesOrThrow(String s) {
            s.getClass();
            MapFieldLite mapFieldLite0 = this.preferences_;
            if(!mapFieldLite0.containsKey(s)) {
                throw new IllegalArgumentException();
            }
            return (Value)mapFieldLite0.get(s);
        }

        public static Builder newBuilder() {
            return (Builder)PreferenceMap.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(PreferenceMap preferencesProto$PreferenceMap0) {
            return (Builder)PreferenceMap.DEFAULT_INSTANCE.createBuilder(preferencesProto$PreferenceMap0);
        }

        public static PreferenceMap parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (PreferenceMap)GeneratedMessageLite.parseDelimitedFrom(PreferenceMap.DEFAULT_INSTANCE, inputStream0);
        }

        public static PreferenceMap parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (PreferenceMap)GeneratedMessageLite.parseDelimitedFrom(PreferenceMap.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static PreferenceMap parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (PreferenceMap)GeneratedMessageLite.parseFrom(PreferenceMap.DEFAULT_INSTANCE, byteString0);
        }

        public static PreferenceMap parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (PreferenceMap)GeneratedMessageLite.parseFrom(PreferenceMap.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static PreferenceMap parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (PreferenceMap)GeneratedMessageLite.parseFrom(PreferenceMap.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static PreferenceMap parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (PreferenceMap)GeneratedMessageLite.parseFrom(PreferenceMap.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static PreferenceMap parseFrom(InputStream inputStream0) throws IOException {
            return (PreferenceMap)GeneratedMessageLite.parseFrom(PreferenceMap.DEFAULT_INSTANCE, inputStream0);
        }

        public static PreferenceMap parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (PreferenceMap)GeneratedMessageLite.parseFrom(PreferenceMap.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static PreferenceMap parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (PreferenceMap)GeneratedMessageLite.parseFrom(PreferenceMap.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static PreferenceMap parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (PreferenceMap)GeneratedMessageLite.parseFrom(PreferenceMap.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static PreferenceMap parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (PreferenceMap)GeneratedMessageLite.parseFrom(PreferenceMap.DEFAULT_INSTANCE, arr_b);
        }

        public static PreferenceMap parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (PreferenceMap)GeneratedMessageLite.parseFrom(PreferenceMap.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return PreferenceMap.DEFAULT_INSTANCE.getParserForType();
        }

        public static MapFieldLite q(PreferenceMap preferencesProto$PreferenceMap0) {
            if(!preferencesProto$PreferenceMap0.preferences_.isMutable()) {
                preferencesProto$PreferenceMap0.preferences_ = preferencesProto$PreferenceMap0.preferences_.mutableCopy();
            }
            return preferencesProto$PreferenceMap0.preferences_;
        }
    }

    public interface PreferenceMapOrBuilder extends MessageLiteOrBuilder {
        boolean containsPreferences(String arg1);

        @Deprecated
        Map getPreferences();

        int getPreferencesCount();

        Map getPreferencesMap();

        Value getPreferencesOrDefault(String arg1, Value arg2);

        Value getPreferencesOrThrow(String arg1);
    }

    public static final class StringSet extends GeneratedMessageLite implements StringSetOrBuilder {
        public static final class androidx.datastore.preferences.PreferencesProto.StringSet.Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements StringSetOrBuilder {
            public androidx.datastore.preferences.PreferencesProto.StringSet.Builder addAllStrings(Iterable iterable0) {
                this.copyOnWrite();
                StringSet.s(((StringSet)this.instance), iterable0);
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.StringSet.Builder addStrings(String s) {
                this.copyOnWrite();
                StringSet.r(((StringSet)this.instance), s);
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.StringSet.Builder addStringsBytes(ByteString byteString0) {
                this.copyOnWrite();
                StringSet.u(((StringSet)this.instance), byteString0);
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.StringSet.Builder clearStrings() {
                this.copyOnWrite();
                StringSet.t(((StringSet)this.instance));
                return this;
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
            public String getStrings(int v) {
                return ((StringSet)this.instance).getStrings(v);
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
            public ByteString getStringsBytes(int v) {
                return ((StringSet)this.instance).getStringsBytes(v);
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
            public int getStringsCount() {
                return ((StringSet)this.instance).getStringsCount();
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
            public List getStringsList() {
                return Collections.unmodifiableList(((StringSet)this.instance).getStringsList());
            }

            public androidx.datastore.preferences.PreferencesProto.StringSet.Builder setStrings(int v, String s) {
                this.copyOnWrite();
                StringSet.q(((StringSet)this.instance), v, s);
                return this;
            }
        }

        private static final StringSet DEFAULT_INSTANCE = null;
        private static volatile Parser PARSER = null;
        public static final int STRINGS_FIELD_NUMBER = 1;
        private ProtobufList strings_;

        static {
            StringSet preferencesProto$StringSet0 = new StringSet();
            StringSet.DEFAULT_INSTANCE = preferencesProto$StringSet0;
            GeneratedMessageLite.registerDefaultInstance(StringSet.class, preferencesProto$StringSet0);
        }

        public StringSet() {
            this.strings_ = GeneratedMessageLite.emptyProtobufList();
        }

        @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(b.a[generatedMessageLite$MethodToInvoke0.ordinal()]) {
                case 1: {
                    return new StringSet();
                }
                case 2: {
                    return new androidx.datastore.preferences.PreferencesProto.StringSet.Builder(StringSet.DEFAULT_INSTANCE);  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite$Builder;-><init>(Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;)V
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(StringSet.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001A", new Object[]{"strings_"});
                }
                case 4: {
                    return StringSet.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = StringSet.PARSER;
                    if(parser0 == null) {
                        Class class0 = StringSet.class;
                        synchronized(class0) {
                            parser0 = StringSet.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(StringSet.DEFAULT_INSTANCE);
                                StringSet.PARSER = parser0;
                            }
                        }
                    }
                    return parser0;
                }
                case 6: {
                    return (byte)1;
                }
                case 7: {
                    return null;
                }
                default: {
                    throw new UnsupportedOperationException();
                }
            }
        }

        public static StringSet getDefaultInstance() {
            return StringSet.DEFAULT_INSTANCE;
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
        public String getStrings(int v) {
            return (String)this.strings_.get(v);
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
        public ByteString getStringsBytes(int v) {
            return ByteString.copyFromUtf8(((String)this.strings_.get(v)));
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
        public int getStringsCount() {
            return this.strings_.size();
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
        public List getStringsList() {
            return this.strings_;
        }

        public static androidx.datastore.preferences.PreferencesProto.StringSet.Builder newBuilder() {
            return (androidx.datastore.preferences.PreferencesProto.StringSet.Builder)StringSet.DEFAULT_INSTANCE.createBuilder();
        }

        public static androidx.datastore.preferences.PreferencesProto.StringSet.Builder newBuilder(StringSet preferencesProto$StringSet0) {
            return (androidx.datastore.preferences.PreferencesProto.StringSet.Builder)StringSet.DEFAULT_INSTANCE.createBuilder(preferencesProto$StringSet0);
        }

        public static StringSet parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (StringSet)GeneratedMessageLite.parseDelimitedFrom(StringSet.DEFAULT_INSTANCE, inputStream0);
        }

        public static StringSet parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (StringSet)GeneratedMessageLite.parseDelimitedFrom(StringSet.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static StringSet parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (StringSet)GeneratedMessageLite.parseFrom(StringSet.DEFAULT_INSTANCE, byteString0);
        }

        public static StringSet parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (StringSet)GeneratedMessageLite.parseFrom(StringSet.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static StringSet parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (StringSet)GeneratedMessageLite.parseFrom(StringSet.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static StringSet parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (StringSet)GeneratedMessageLite.parseFrom(StringSet.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static StringSet parseFrom(InputStream inputStream0) throws IOException {
            return (StringSet)GeneratedMessageLite.parseFrom(StringSet.DEFAULT_INSTANCE, inputStream0);
        }

        public static StringSet parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (StringSet)GeneratedMessageLite.parseFrom(StringSet.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static StringSet parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (StringSet)GeneratedMessageLite.parseFrom(StringSet.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static StringSet parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (StringSet)GeneratedMessageLite.parseFrom(StringSet.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static StringSet parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (StringSet)GeneratedMessageLite.parseFrom(StringSet.DEFAULT_INSTANCE, arr_b);
        }

        public static StringSet parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (StringSet)GeneratedMessageLite.parseFrom(StringSet.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return StringSet.DEFAULT_INSTANCE.getParserForType();
        }

        public static void q(StringSet preferencesProto$StringSet0, int v, String s) {
            preferencesProto$StringSet0.getClass();
            s.getClass();
            preferencesProto$StringSet0.v();
            preferencesProto$StringSet0.strings_.set(v, s);
        }

        public static void r(StringSet preferencesProto$StringSet0, String s) {
            preferencesProto$StringSet0.getClass();
            s.getClass();
            preferencesProto$StringSet0.v();
            preferencesProto$StringSet0.strings_.add(s);
        }

        public static void s(StringSet preferencesProto$StringSet0, Iterable iterable0) {
            preferencesProto$StringSet0.v();
            AbstractMessageLite.addAll(iterable0, preferencesProto$StringSet0.strings_);
        }

        public static void t(StringSet preferencesProto$StringSet0) {
            preferencesProto$StringSet0.getClass();
            preferencesProto$StringSet0.strings_ = GeneratedMessageLite.emptyProtobufList();
        }

        public static void u(StringSet preferencesProto$StringSet0, ByteString byteString0) {
            preferencesProto$StringSet0.v();
            preferencesProto$StringSet0.strings_.add(byteString0.toStringUtf8());
        }

        public final void v() {
            ProtobufList internal$ProtobufList0 = this.strings_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.strings_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }
    }

    public interface StringSetOrBuilder extends MessageLiteOrBuilder {
        String getStrings(int arg1);

        ByteString getStringsBytes(int arg1);

        int getStringsCount();

        List getStringsList();
    }

    public static final class Value extends GeneratedMessageLite implements ValueOrBuilder {
        public static final class androidx.datastore.preferences.PreferencesProto.Value.Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements ValueOrBuilder {
            public androidx.datastore.preferences.PreferencesProto.Value.Builder clearBoolean() {
                this.copyOnWrite();
                Value.F(((Value)this.instance));
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder clearBytes() {
                this.copyOnWrite();
                Value.B(((Value)this.instance));
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder clearDouble() {
                this.copyOnWrite();
                Value.z(((Value)this.instance));
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder clearFloat() {
                this.copyOnWrite();
                Value.H(((Value)this.instance));
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder clearInteger() {
                this.copyOnWrite();
                Value.p(((Value)this.instance));
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder clearLong() {
                this.copyOnWrite();
                Value.r(((Value)this.instance));
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder clearString() {
                this.copyOnWrite();
                Value.t(((Value)this.instance));
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder clearStringSet() {
                this.copyOnWrite();
                Value.x(((Value)this.instance));
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder clearValue() {
                this.copyOnWrite();
                Value.D(((Value)this.instance));
                return this;
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
            public boolean getBoolean() {
                return ((Value)this.instance).getBoolean();
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
            public ByteString getBytes() {
                return ((Value)this.instance).getBytes();
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
            public double getDouble() {
                return ((Value)this.instance).getDouble();
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
            public float getFloat() {
                return ((Value)this.instance).getFloat();
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
            public int getInteger() {
                return ((Value)this.instance).getInteger();
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
            public long getLong() {
                return ((Value)this.instance).getLong();
            }

            // 去混淆评级： 低(20)
            @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
            public String getString() {
                return "";
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
            public ByteString getStringBytes() {
                return ((Value)this.instance).getStringBytes();
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
            public StringSet getStringSet() {
                return ((Value)this.instance).getStringSet();
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
            public ValueCase getValueCase() {
                return ((Value)this.instance).getValueCase();
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
            public boolean hasBoolean() {
                return ((Value)this.instance).hasBoolean();
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
            public boolean hasBytes() {
                return ((Value)this.instance).hasBytes();
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
            public boolean hasDouble() {
                return ((Value)this.instance).hasDouble();
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
            public boolean hasFloat() {
                return ((Value)this.instance).hasFloat();
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
            public boolean hasInteger() {
                return ((Value)this.instance).hasInteger();
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
            public boolean hasLong() {
                return ((Value)this.instance).hasLong();
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
            public boolean hasString() {
                return ((Value)this.instance).hasString();
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
            public boolean hasStringSet() {
                return ((Value)this.instance).hasStringSet();
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder mergeStringSet(StringSet preferencesProto$StringSet0) {
                this.copyOnWrite();
                Value.w(((Value)this.instance), preferencesProto$StringSet0);
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder setBoolean(boolean z) {
                this.copyOnWrite();
                Value.E(((Value)this.instance), z);
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder setBytes(ByteString byteString0) {
                this.copyOnWrite();
                Value.A(((Value)this.instance), byteString0);
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder setDouble(double f) {
                this.copyOnWrite();
                Value.y(((Value)this.instance), f);
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder setFloat(float f) {
                this.copyOnWrite();
                Value.G(((Value)this.instance), f);
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder setInteger(int v) {
                this.copyOnWrite();
                Value.I(((Value)this.instance), v);
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder setLong(long v) {
                this.copyOnWrite();
                Value.q(((Value)this.instance), v);
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder setString(String s) {
                this.copyOnWrite();
                Value.s(s, ((Value)this.instance));
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder setStringBytes(ByteString byteString0) {
                this.copyOnWrite();
                Value.u(((Value)this.instance), byteString0);
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder setStringSet(androidx.datastore.preferences.PreferencesProto.StringSet.Builder preferencesProto$StringSet$Builder0) {
                this.copyOnWrite();
                Value.v(((Value)this.instance), ((StringSet)preferencesProto$StringSet$Builder0.build()));
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder setStringSet(StringSet preferencesProto$StringSet0) {
                this.copyOnWrite();
                Value.v(((Value)this.instance), preferencesProto$StringSet0);
                return this;
            }
        }

        public static enum ValueCase {
            BOOLEAN(1),
            FLOAT(2),
            INTEGER(3),
            LONG(4),
            STRING(5),
            STRING_SET(6),
            DOUBLE(7),
            BYTES(8),
            VALUE_NOT_SET(0);

            public final int a;

            public ValueCase(int v1) {
                this.a = v1;
            }

            public static ValueCase forNumber(int v) {
                switch(v) {
                    case 0: {
                        return ValueCase.VALUE_NOT_SET;
                    }
                    case 1: {
                        return ValueCase.BOOLEAN;
                    }
                    case 2: {
                        return ValueCase.FLOAT;
                    }
                    case 3: {
                        return ValueCase.INTEGER;
                    }
                    case 4: {
                        return ValueCase.LONG;
                    }
                    case 5: {
                        return ValueCase.STRING;
                    }
                    case 6: {
                        return ValueCase.STRING_SET;
                    }
                    case 7: {
                        return ValueCase.DOUBLE;
                    }
                    case 8: {
                        return ValueCase.BYTES;
                    }
                    default: {
                        return null;
                    }
                }
            }

            public int getNumber() {
                return this.a;
            }

            @Deprecated
            public static ValueCase valueOf(int v) {
                return ValueCase.forNumber(v);
            }
        }

        public static final int BOOLEAN_FIELD_NUMBER = 1;
        public static final int BYTES_FIELD_NUMBER = 8;
        private static final Value DEFAULT_INSTANCE = null;
        public static final int DOUBLE_FIELD_NUMBER = 7;
        public static final int FLOAT_FIELD_NUMBER = 2;
        public static final int INTEGER_FIELD_NUMBER = 3;
        public static final int LONG_FIELD_NUMBER = 4;
        private static volatile Parser PARSER = null;
        public static final int STRING_FIELD_NUMBER = 5;
        public static final int STRING_SET_FIELD_NUMBER = 6;
        private int bitField0_;
        private int valueCase_;
        private Object value_;

        static {
            Value preferencesProto$Value0 = new Value();
            Value.DEFAULT_INSTANCE = preferencesProto$Value0;
            GeneratedMessageLite.registerDefaultInstance(Value.class, preferencesProto$Value0);
        }

        public Value() {
            this.valueCase_ = 0;
        }

        public static void A(Value preferencesProto$Value0, ByteString byteString0) {
            preferencesProto$Value0.getClass();
            byteString0.getClass();
            preferencesProto$Value0.valueCase_ = 8;
            preferencesProto$Value0.value_ = byteString0;
        }

        public static void B(Value preferencesProto$Value0) {
            if(preferencesProto$Value0.valueCase_ == 8) {
                preferencesProto$Value0.valueCase_ = 0;
                preferencesProto$Value0.value_ = null;
            }
        }

        public static void D(Value preferencesProto$Value0) {
            preferencesProto$Value0.valueCase_ = 0;
            preferencesProto$Value0.value_ = null;
        }

        public static void E(Value preferencesProto$Value0, boolean z) {
            preferencesProto$Value0.valueCase_ = 1;
            preferencesProto$Value0.value_ = Boolean.valueOf(z);
        }

        public static void F(Value preferencesProto$Value0) {
            if(preferencesProto$Value0.valueCase_ == 1) {
                preferencesProto$Value0.valueCase_ = 0;
                preferencesProto$Value0.value_ = null;
            }
        }

        public static void G(Value preferencesProto$Value0, float f) {
            preferencesProto$Value0.valueCase_ = 2;
            preferencesProto$Value0.value_ = f;
        }

        public static void H(Value preferencesProto$Value0) {
            if(preferencesProto$Value0.valueCase_ == 2) {
                preferencesProto$Value0.valueCase_ = 0;
                preferencesProto$Value0.value_ = null;
            }
        }

        public static void I(Value preferencesProto$Value0, int v) {
            preferencesProto$Value0.valueCase_ = 3;
            preferencesProto$Value0.value_ = v;
        }

        @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(b.a[generatedMessageLite$MethodToInvoke0.ordinal()]) {
                case 1: {
                    return new Value();
                }
                case 2: {
                    return new androidx.datastore.preferences.PreferencesProto.Value.Builder(Value.DEFAULT_INSTANCE);  // 初始化器: Landroidx/datastore/preferences/protobuf/GeneratedMessageLite$Builder;-><init>(Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;)V
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(Value.DEFAULT_INSTANCE, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001်\u0000\u0002ဴ\u0000\u0003့\u0000\u0004ဵ\u0000\u0005ျ\u0000\u0006ြ\u0000\u0007ဳ\u0000\bွ\u0000", new Object[]{"value_", "valueCase_", "bitField0_", StringSet.class});
                }
                case 4: {
                    return Value.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = Value.PARSER;
                    if(parser0 == null) {
                        Class class0 = Value.class;
                        synchronized(class0) {
                            parser0 = Value.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(Value.DEFAULT_INSTANCE);
                                Value.PARSER = parser0;
                            }
                        }
                    }
                    return parser0;
                }
                case 6: {
                    return (byte)1;
                }
                case 7: {
                    return null;
                }
                default: {
                    throw new UnsupportedOperationException();
                }
            }
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public boolean getBoolean() {
            return this.valueCase_ == 1 ? ((Boolean)this.value_).booleanValue() : false;
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public ByteString getBytes() {
            return this.valueCase_ == 8 ? ((ByteString)this.value_) : ByteString.EMPTY;
        }

        public static Value getDefaultInstance() {
            return Value.DEFAULT_INSTANCE;
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public double getDouble() {
            return this.valueCase_ == 7 ? ((double)(((Double)this.value_))) : 0.0;
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public float getFloat() {
            return this.valueCase_ == 2 ? ((float)(((Float)this.value_))) : 0.0f;
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public int getInteger() {
            return this.valueCase_ == 3 ? ((int)(((Integer)this.value_))) : 0;
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public long getLong() {
            return this.valueCase_ == 4 ? ((long)(((Long)this.value_))) : 0L;
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public String getString() [...] // 潜在的解密器

        @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public ByteString getStringBytes() {
            return this.valueCase_ == 5 ? ByteString.copyFromUtf8(((String)this.value_)) : ByteString.copyFromUtf8("");
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public StringSet getStringSet() {
            return this.valueCase_ == 6 ? ((StringSet)this.value_) : StringSet.getDefaultInstance();
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public ValueCase getValueCase() {
            return ValueCase.forNumber(this.valueCase_);
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public boolean hasBoolean() {
            return this.valueCase_ == 1;
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public boolean hasBytes() {
            return this.valueCase_ == 8;
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public boolean hasDouble() {
            return this.valueCase_ == 7;
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public boolean hasFloat() {
            return this.valueCase_ == 2;
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public boolean hasInteger() {
            return this.valueCase_ == 3;
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public boolean hasLong() {
            return this.valueCase_ == 4;
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public boolean hasString() {
            return this.valueCase_ == 5;
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public boolean hasStringSet() {
            return this.valueCase_ == 6;
        }

        public static androidx.datastore.preferences.PreferencesProto.Value.Builder newBuilder() {
            return (androidx.datastore.preferences.PreferencesProto.Value.Builder)Value.DEFAULT_INSTANCE.createBuilder();
        }

        public static androidx.datastore.preferences.PreferencesProto.Value.Builder newBuilder(Value preferencesProto$Value0) {
            return (androidx.datastore.preferences.PreferencesProto.Value.Builder)Value.DEFAULT_INSTANCE.createBuilder(preferencesProto$Value0);
        }

        public static void p(Value preferencesProto$Value0) {
            if(preferencesProto$Value0.valueCase_ == 3) {
                preferencesProto$Value0.valueCase_ = 0;
                preferencesProto$Value0.value_ = null;
            }
        }

        public static Value parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (Value)GeneratedMessageLite.parseDelimitedFrom(Value.DEFAULT_INSTANCE, inputStream0);
        }

        public static Value parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (Value)GeneratedMessageLite.parseDelimitedFrom(Value.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static Value parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (Value)GeneratedMessageLite.parseFrom(Value.DEFAULT_INSTANCE, byteString0);
        }

        public static Value parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (Value)GeneratedMessageLite.parseFrom(Value.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static Value parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (Value)GeneratedMessageLite.parseFrom(Value.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static Value parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (Value)GeneratedMessageLite.parseFrom(Value.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static Value parseFrom(InputStream inputStream0) throws IOException {
            return (Value)GeneratedMessageLite.parseFrom(Value.DEFAULT_INSTANCE, inputStream0);
        }

        public static Value parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (Value)GeneratedMessageLite.parseFrom(Value.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static Value parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (Value)GeneratedMessageLite.parseFrom(Value.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static Value parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (Value)GeneratedMessageLite.parseFrom(Value.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static Value parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (Value)GeneratedMessageLite.parseFrom(Value.DEFAULT_INSTANCE, arr_b);
        }

        public static Value parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (Value)GeneratedMessageLite.parseFrom(Value.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return Value.DEFAULT_INSTANCE.getParserForType();
        }

        public static void q(Value preferencesProto$Value0, long v) {
            preferencesProto$Value0.valueCase_ = 4;
            preferencesProto$Value0.value_ = v;
        }

        public static void r(Value preferencesProto$Value0) {
            if(preferencesProto$Value0.valueCase_ == 4) {
                preferencesProto$Value0.valueCase_ = 0;
                preferencesProto$Value0.value_ = null;
            }
        }

        public static void s(String s, Value preferencesProto$Value0) {
            preferencesProto$Value0.getClass();
            s.getClass();
            preferencesProto$Value0.valueCase_ = 5;
            preferencesProto$Value0.value_ = s;
        }

        public static void t(Value preferencesProto$Value0) {
            if(preferencesProto$Value0.valueCase_ == 5) {
                preferencesProto$Value0.valueCase_ = 0;
                preferencesProto$Value0.value_ = null;
            }
        }

        public static void u(Value preferencesProto$Value0, ByteString byteString0) {
            preferencesProto$Value0.getClass();
            preferencesProto$Value0.value_ = byteString0.toStringUtf8();
            preferencesProto$Value0.valueCase_ = 5;
        }

        public static void v(Value preferencesProto$Value0, StringSet preferencesProto$StringSet0) {
            preferencesProto$Value0.getClass();
            preferencesProto$StringSet0.getClass();
            preferencesProto$Value0.value_ = preferencesProto$StringSet0;
            preferencesProto$Value0.valueCase_ = 6;
        }

        public static void w(Value preferencesProto$Value0, StringSet preferencesProto$StringSet0) {
            preferencesProto$Value0.getClass();
            preferencesProto$StringSet0.getClass();
            preferencesProto$Value0.value_ = preferencesProto$Value0.valueCase_ != 6 || preferencesProto$Value0.value_ == StringSet.getDefaultInstance() ? preferencesProto$StringSet0 : ((androidx.datastore.preferences.PreferencesProto.StringSet.Builder)StringSet.newBuilder(((StringSet)preferencesProto$Value0.value_)).mergeFrom(preferencesProto$StringSet0)).buildPartial();
            preferencesProto$Value0.valueCase_ = 6;
        }

        public static void x(Value preferencesProto$Value0) {
            if(preferencesProto$Value0.valueCase_ == 6) {
                preferencesProto$Value0.valueCase_ = 0;
                preferencesProto$Value0.value_ = null;
            }
        }

        public static void y(Value preferencesProto$Value0, double f) {
            preferencesProto$Value0.valueCase_ = 7;
            preferencesProto$Value0.value_ = f;
        }

        public static void z(Value preferencesProto$Value0) {
            if(preferencesProto$Value0.valueCase_ == 7) {
                preferencesProto$Value0.valueCase_ = 0;
                preferencesProto$Value0.value_ = null;
            }
        }
    }

    public interface ValueOrBuilder extends MessageLiteOrBuilder {
        boolean getBoolean();

        ByteString getBytes();

        double getDouble();

        float getFloat();

        int getInteger();

        long getLong();

        String getString();

        ByteString getStringBytes();

        StringSet getStringSet();

        ValueCase getValueCase();

        boolean hasBoolean();

        boolean hasBytes();

        boolean hasDouble();

        boolean hasFloat();

        boolean hasInteger();

        boolean hasLong();

        boolean hasString();

        boolean hasStringSet();
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite0) {
    }
}

