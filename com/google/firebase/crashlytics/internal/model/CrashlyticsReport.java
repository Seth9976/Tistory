package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue.Builder;
import com.google.auto.value.AutoValue;
import com.google.firebase.encoders.annotations.Encodable.Field;
import com.google.firebase.encoders.annotations.Encodable.Ignore;
import com.google.firebase.encoders.annotations.Encodable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.charset.Charset;

@AutoValue
@Encodable
public abstract class CrashlyticsReport {
    @AutoValue
    public static abstract class ApplicationExitInfo {
        @AutoValue.Builder
        public static abstract class Builder {
            @NonNull
            public abstract ApplicationExitInfo build();

            @NonNull
            public abstract Builder setImportance(@NonNull int arg1);

            @NonNull
            public abstract Builder setPid(@NonNull int arg1);

            @NonNull
            public abstract Builder setProcessName(@NonNull String arg1);

            @NonNull
            public abstract Builder setPss(@NonNull long arg1);

            @NonNull
            public abstract Builder setReasonCode(@NonNull int arg1);

            @NonNull
            public abstract Builder setRss(@NonNull long arg1);

            @NonNull
            public abstract Builder setTimestamp(@NonNull long arg1);

            @NonNull
            public abstract Builder setTraceFile(@Nullable String arg1);
        }

        @NonNull
        public static Builder builder() {
            return new x();  // 初始化器: Lcom/google/firebase/crashlytics/internal/model/CrashlyticsReport$ApplicationExitInfo$Builder;-><init>()V
        }

        @NonNull
        public abstract int getImportance();

        @NonNull
        public abstract int getPid();

        @NonNull
        public abstract String getProcessName();

        @NonNull
        public abstract long getPss();

        @NonNull
        public abstract int getReasonCode();

        @NonNull
        public abstract long getRss();

        @NonNull
        public abstract long getTimestamp();

        @Nullable
        public abstract String getTraceFile();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Architecture {
        public static final int ARM64 = 9;
        public static final int ARMV6 = 5;
        public static final int ARMV7 = 6;
        public static final int UNKNOWN = 7;
        public static final int X86_32 = 0;
        public static final int X86_64 = 1;

    }

    @AutoValue.Builder
    public static abstract class com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder {
        @NonNull
        public abstract CrashlyticsReport build();

        @NonNull
        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setBuildVersion(@NonNull String arg1);

        @NonNull
        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setDisplayVersion(@NonNull String arg1);

        @NonNull
        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setGmpAppId(@NonNull String arg1);

        @NonNull
        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setInstallationUuid(@NonNull String arg1);

        @NonNull
        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setNdkPayload(FilesPayload arg1);

        @NonNull
        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setPlatform(int arg1);

        @NonNull
        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setSdkVersion(@NonNull String arg1);

        @NonNull
        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setSession(@NonNull Session arg1);
    }

    @AutoValue
    public static abstract class CustomAttribute {
        @AutoValue.Builder
        public static abstract class com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder {
            @NonNull
            public abstract CustomAttribute build();

            @NonNull
            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder setKey(@NonNull String arg1);

            @NonNull
            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder setValue(@NonNull String arg1);
        }

        @NonNull
        public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder builder() {
            return new z();  // 初始化器: Lcom/google/firebase/crashlytics/internal/model/CrashlyticsReport$CustomAttribute$Builder;-><init>()V
        }

        @NonNull
        public abstract String getKey();

        @NonNull
        public abstract String getValue();
    }

    @AutoValue
    public static abstract class FilesPayload {
        @AutoValue.Builder
        public static abstract class com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder {
            public abstract FilesPayload build();

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder setFiles(ImmutableList arg1);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder setOrgId(String arg1);
        }

        @AutoValue
        public static abstract class File {
            @AutoValue.Builder
            public static abstract class com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder {
                public abstract File build();

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder setContents(byte[] arg1);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder setFilename(String arg1);
            }

            @NonNull
            public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder builder() {
                return new d0();  // 初始化器: Lcom/google/firebase/crashlytics/internal/model/CrashlyticsReport$FilesPayload$File$Builder;-><init>()V
            }

            @NonNull
            public abstract byte[] getContents();

            @NonNull
            public abstract String getFilename();
        }

        public abstract b0 a();

        @NonNull
        public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder builder() {
            return new b0();  // 初始化器: Lcom/google/firebase/crashlytics/internal/model/CrashlyticsReport$FilesPayload$Builder;-><init>()V
        }

        @NonNull
        public abstract ImmutableList getFiles();

        @Nullable
        public abstract String getOrgId();
    }

    @AutoValue
    public static abstract class Session {
        @AutoValue
        public static abstract class Application {
            @AutoValue.Builder
            public static abstract class com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder {
                @NonNull
                public abstract Application build();

                @NonNull
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder setDevelopmentPlatform(@Nullable String arg1);

                @NonNull
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder setDevelopmentPlatformVersion(@Nullable String arg1);

                @NonNull
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder setDisplayVersion(@NonNull String arg1);

                @NonNull
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder setIdentifier(@NonNull String arg1);

                @NonNull
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder setInstallationUuid(@NonNull String arg1);

                @NonNull
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder setOrganization(@NonNull Organization arg1);

                @NonNull
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder setVersion(@NonNull String arg1);
            }

            @AutoValue
            public static abstract class Organization {
                @AutoValue.Builder
                public static abstract class com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization.Builder {
                    @NonNull
                    public abstract Organization build();

                    @NonNull
                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization.Builder setClsId(@NonNull String arg1);
                }

                @NonNull
                public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization.Builder builder() {
                    return new j0();  // 初始化器: Lcom/google/firebase/crashlytics/internal/model/CrashlyticsReport$Session$Application$Organization$Builder;-><init>()V
                }

                @NonNull
                public abstract String getClsId();

                @NonNull
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization.Builder toBuilder();
            }

            @NonNull
            public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder builder() {
                return new h0();  // 初始化器: Lcom/google/firebase/crashlytics/internal/model/CrashlyticsReport$Session$Application$Builder;-><init>()V
            }

            @Nullable
            public abstract String getDevelopmentPlatform();

            @Nullable
            public abstract String getDevelopmentPlatformVersion();

            @Nullable
            public abstract String getDisplayVersion();

            @NonNull
            public abstract String getIdentifier();

            @Nullable
            public abstract String getInstallationUuid();

            @Nullable
            public abstract Organization getOrganization();

            @NonNull
            public abstract String getVersion();

            @NonNull
            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder toBuilder();
        }

        @AutoValue.Builder
        public static abstract class com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder {
            @NonNull
            public abstract Session build();

            @NonNull
            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setApp(@NonNull Application arg1);

            @NonNull
            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setCrashed(boolean arg1);

            @NonNull
            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setDevice(@NonNull Device arg1);

            @NonNull
            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setEndedAt(@NonNull Long arg1);

            @NonNull
            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setEvents(@NonNull ImmutableList arg1);

            @NonNull
            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setGenerator(@NonNull String arg1);

            @NonNull
            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setGeneratorType(int arg1);

            @NonNull
            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setIdentifier(@NonNull String arg1);

            @NonNull
            public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setIdentifierFromUtf8Bytes(@NonNull byte[] arr_b) {
                return this.setIdentifier(new String(arr_b, CrashlyticsReport.a));
            }

            @NonNull
            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setOs(@NonNull OperatingSystem arg1);

            @NonNull
            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setStartedAt(long arg1);

            @NonNull
            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setUser(@NonNull User arg1);
        }

        @AutoValue
        public static abstract class Device {
            @AutoValue.Builder
            public static abstract class com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder {
                @NonNull
                public abstract Device build();

                @NonNull
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setArch(int arg1);

                @NonNull
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setCores(int arg1);

                @NonNull
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setDiskSpace(long arg1);

                @NonNull
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setManufacturer(@NonNull String arg1);

                @NonNull
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setModel(@NonNull String arg1);

                @NonNull
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setModelClass(@NonNull String arg1);

                @NonNull
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setRam(long arg1);

                @NonNull
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setSimulator(boolean arg1);

                @NonNull
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setState(int arg1);
            }

            @NonNull
            public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder builder() {
                return new l0();  // 初始化器: Lcom/google/firebase/crashlytics/internal/model/CrashlyticsReport$Session$Device$Builder;-><init>()V
            }

            @NonNull
            public abstract int getArch();

            public abstract int getCores();

            public abstract long getDiskSpace();

            @NonNull
            public abstract String getManufacturer();

            @NonNull
            public abstract String getModel();

            @NonNull
            public abstract String getModelClass();

            public abstract long getRam();

            public abstract int getState();

            public abstract boolean isSimulator();
        }

        @AutoValue
        public static abstract class Event {
            @AutoValue
            public static abstract class com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application {
                @AutoValue.Builder
                public static abstract class com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder {
                    @NonNull
                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application build();

                    @NonNull
                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder setBackground(@Nullable Boolean arg1);

                    @NonNull
                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder setCustomAttributes(@NonNull ImmutableList arg1);

                    @NonNull
                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder setExecution(@NonNull Execution arg1);

                    @NonNull
                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder setInternalKeys(@NonNull ImmutableList arg1);

                    @NonNull
                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder setUiOrientation(int arg1);
                }

                @AutoValue
                public static abstract class Execution {
                    @AutoValue
                    public static abstract class BinaryImage {
                        @AutoValue.Builder
                        public static abstract class com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder {
                            @NonNull
                            public abstract BinaryImage build();

                            @NonNull
                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setBaseAddress(long arg1);

                            @NonNull
                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setName(@NonNull String arg1);

                            @NonNull
                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setSize(long arg1);

                            @NonNull
                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setUuid(@Nullable String arg1);

                            @NonNull
                            public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setUuidFromUtf8Bytes(@NonNull byte[] arr_b) {
                                return this.setUuid(new String(arr_b, CrashlyticsReport.a));
                            }
                        }

                        @NonNull
                        public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder builder() {
                            return new t0();  // 初始化器: Lcom/google/firebase/crashlytics/internal/model/CrashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder;-><init>()V
                        }

                        @NonNull
                        public abstract long getBaseAddress();

                        @NonNull
                        public abstract String getName();

                        public abstract long getSize();

                        @Nullable
                        @Ignore
                        public abstract String getUuid();

                        @Nullable
                        @Field(name = "uuid")
                        public byte[] getUuidUtf8Bytes() {
                            String s = this.getUuid();
                            return s == null ? null : s.getBytes(CrashlyticsReport.a);
                        }
                    }

                    @AutoValue.Builder
                    public static abstract class com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder {
                        @NonNull
                        public abstract Execution build();

                        @NonNull
                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder setAppExitInfo(@NonNull ApplicationExitInfo arg1);

                        @NonNull
                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder setBinaries(@NonNull ImmutableList arg1);

                        @NonNull
                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder setException(@NonNull Exception arg1);

                        @NonNull
                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder setSignal(@NonNull Signal arg1);

                        @NonNull
                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder setThreads(@NonNull ImmutableList arg1);
                    }

                    @AutoValue
                    public static abstract class Exception {
                        @AutoValue.Builder
                        public static abstract class com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder {
                            @NonNull
                            public abstract Exception build();

                            @NonNull
                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setCausedBy(@NonNull Exception arg1);

                            @NonNull
                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setFrames(@NonNull ImmutableList arg1);

                            @NonNull
                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setOverflowCount(int arg1);

                            @NonNull
                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setReason(@NonNull String arg1);

                            @NonNull
                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setType(@NonNull String arg1);
                        }

                        @NonNull
                        public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder builder() {
                            return new v0();  // 初始化器: Lcom/google/firebase/crashlytics/internal/model/CrashlyticsReport$Session$Event$Application$Execution$Exception$Builder;-><init>()V
                        }

                        @Nullable
                        public abstract Exception getCausedBy();

                        @NonNull
                        public abstract ImmutableList getFrames();

                        public abstract int getOverflowCount();

                        @Nullable
                        public abstract String getReason();

                        @NonNull
                        public abstract String getType();
                    }

                    @AutoValue
                    public static abstract class Signal {
                        @AutoValue.Builder
                        public static abstract class com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder {
                            @NonNull
                            public abstract Signal build();

                            @NonNull
                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setAddress(long arg1);

                            @NonNull
                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setCode(@NonNull String arg1);

                            @NonNull
                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setName(@NonNull String arg1);
                        }

                        @NonNull
                        public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder builder() {
                            return new x0();  // 初始化器: Lcom/google/firebase/crashlytics/internal/model/CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder;-><init>()V
                        }

                        @NonNull
                        public abstract long getAddress();

                        @NonNull
                        public abstract String getCode();

                        @NonNull
                        public abstract String getName();
                    }

                    @AutoValue
                    public static abstract class Thread {
                        @AutoValue.Builder
                        public static abstract class com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder {
                            @NonNull
                            public abstract Thread build();

                            @NonNull
                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setFrames(@NonNull ImmutableList arg1);

                            @NonNull
                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setImportance(int arg1);

                            @NonNull
                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setName(@NonNull String arg1);
                        }

                        @AutoValue
                        public static abstract class Frame {
                            @AutoValue.Builder
                            public static abstract class com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder {
                                @NonNull
                                public abstract Frame build();

                                @NonNull
                                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setFile(@NonNull String arg1);

                                @NonNull
                                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setImportance(int arg1);

                                @NonNull
                                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setOffset(long arg1);

                                @NonNull
                                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setPc(long arg1);

                                @NonNull
                                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setSymbol(@NonNull String arg1);
                            }

                            @NonNull
                            public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder() {
                                return new b1();  // 初始化器: Lcom/google/firebase/crashlytics/internal/model/CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder;-><init>()V
                            }

                            @Nullable
                            public abstract String getFile();

                            public abstract int getImportance();

                            public abstract long getOffset();

                            public abstract long getPc();

                            @NonNull
                            public abstract String getSymbol();
                        }

                        @NonNull
                        public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder builder() {
                            return new z0();  // 初始化器: Lcom/google/firebase/crashlytics/internal/model/CrashlyticsReport$Session$Event$Application$Execution$Thread$Builder;-><init>()V
                        }

                        @NonNull
                        public abstract ImmutableList getFrames();

                        public abstract int getImportance();

                        @NonNull
                        public abstract String getName();
                    }

                    @NonNull
                    public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder builder() {
                        return new r0();  // 初始化器: Lcom/google/firebase/crashlytics/internal/model/CrashlyticsReport$Session$Event$Application$Execution$Builder;-><init>()V
                    }

                    @Nullable
                    public abstract ApplicationExitInfo getAppExitInfo();

                    @NonNull
                    public abstract ImmutableList getBinaries();

                    @Nullable
                    public abstract Exception getException();

                    @NonNull
                    public abstract Signal getSignal();

                    @Nullable
                    public abstract ImmutableList getThreads();
                }

                @NonNull
                public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder builder() {
                    return new p0();  // 初始化器: Lcom/google/firebase/crashlytics/internal/model/CrashlyticsReport$Session$Event$Application$Builder;-><init>()V
                }

                @Nullable
                public abstract Boolean getBackground();

                @Nullable
                public abstract ImmutableList getCustomAttributes();

                @NonNull
                public abstract Execution getExecution();

                @Nullable
                public abstract ImmutableList getInternalKeys();

                public abstract int getUiOrientation();

                @NonNull
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder toBuilder();
            }

            @AutoValue.Builder
            public static abstract class com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder {
                @NonNull
                public abstract Event build();

                @NonNull
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder setApp(@NonNull com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application arg1);

                @NonNull
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder setDevice(@NonNull com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device arg1);

                @NonNull
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder setLog(@NonNull Log arg1);

                @NonNull
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder setTimestamp(long arg1);

                @NonNull
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder setType(@NonNull String arg1);
            }

            @AutoValue
            public static abstract class com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device {
                @AutoValue.Builder
                public static abstract class com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder {
                    @NonNull
                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device build();

                    @NonNull
                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder setBatteryLevel(Double arg1);

                    @NonNull
                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder setBatteryVelocity(int arg1);

                    @NonNull
                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder setDiskUsed(long arg1);

                    @NonNull
                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder setOrientation(int arg1);

                    @NonNull
                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder setProximityOn(boolean arg1);

                    @NonNull
                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder setRamUsed(long arg1);
                }

                @NonNull
                public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder builder() {
                    return new d1();  // 初始化器: Lcom/google/firebase/crashlytics/internal/model/CrashlyticsReport$Session$Event$Device$Builder;-><init>()V
                }

                @Nullable
                public abstract Double getBatteryLevel();

                public abstract int getBatteryVelocity();

                public abstract long getDiskUsed();

                public abstract int getOrientation();

                public abstract long getRamUsed();

                public abstract boolean isProximityOn();
            }

            @AutoValue
            public static abstract class Log {
                @AutoValue.Builder
                public static abstract class com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.Builder {
                    @NonNull
                    public abstract Log build();

                    @NonNull
                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.Builder setContent(@NonNull String arg1);
                }

                @NonNull
                public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.Builder builder() {
                    return new f1();  // 初始化器: Lcom/google/firebase/crashlytics/internal/model/CrashlyticsReport$Session$Event$Log$Builder;-><init>()V
                }

                @NonNull
                public abstract String getContent();
            }

            @NonNull
            public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder builder() {
                return new n0();  // 初始化器: Lcom/google/firebase/crashlytics/internal/model/CrashlyticsReport$Session$Event$Builder;-><init>()V
            }

            @NonNull
            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application getApp();

            @NonNull
            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device getDevice();

            @Nullable
            public abstract Log getLog();

            public abstract long getTimestamp();

            @NonNull
            public abstract String getType();

            @NonNull
            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder toBuilder();
        }

        @AutoValue
        public static abstract class OperatingSystem {
            @AutoValue.Builder
            public static abstract class com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder {
                @NonNull
                public abstract OperatingSystem build();

                @NonNull
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder setBuildVersion(@NonNull String arg1);

                @NonNull
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder setJailbroken(boolean arg1);

                @NonNull
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder setPlatform(int arg1);

                @NonNull
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder setVersion(@NonNull String arg1);
            }

            @NonNull
            public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder builder() {
                return new h1();  // 初始化器: Lcom/google/firebase/crashlytics/internal/model/CrashlyticsReport$Session$OperatingSystem$Builder;-><init>()V
            }

            @NonNull
            public abstract String getBuildVersion();

            public abstract int getPlatform();

            @NonNull
            public abstract String getVersion();

            public abstract boolean isJailbroken();
        }

        @AutoValue
        public static abstract class User {
            @AutoValue.Builder
            public static abstract class com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder {
                @NonNull
                public abstract User build();

                @NonNull
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder setIdentifier(@NonNull String arg1);
            }

            @NonNull
            public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder builder() {
                return new j1();  // 初始化器: Lcom/google/firebase/crashlytics/internal/model/CrashlyticsReport$Session$User$Builder;-><init>()V
            }

            @NonNull
            public abstract String getIdentifier();
        }

        @NonNull
        public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder builder() {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder crashlyticsReport$Session$Builder0 = new f0();  // 初始化器: Lcom/google/firebase/crashlytics/internal/model/CrashlyticsReport$Session$Builder;-><init>()V
            crashlyticsReport$Session$Builder0.e = Boolean.FALSE;
            return crashlyticsReport$Session$Builder0;
        }

        @NonNull
        public abstract Application getApp();

        @Nullable
        public abstract Device getDevice();

        @Nullable
        public abstract Long getEndedAt();

        @Nullable
        public abstract ImmutableList getEvents();

        @NonNull
        public abstract String getGenerator();

        public abstract int getGeneratorType();

        @NonNull
        @Ignore
        public abstract String getIdentifier();

        @NonNull
        @Field(name = "identifier")
        public byte[] getIdentifierUtf8Bytes() {
            return this.getIdentifier().getBytes(CrashlyticsReport.a);
        }

        @Nullable
        public abstract OperatingSystem getOs();

        public abstract long getStartedAt();

        @Nullable
        public abstract User getUser();

        public abstract boolean isCrashed();

        @NonNull
        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder toBuilder();
    }

    public static enum Type {
        INCOMPLETE,
        JAVA,
        NATIVE;

    }

    public static final Charset a;

    static {
        CrashlyticsReport.a = Charset.forName("UTF-8");
    }

    @NonNull
    public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder builder() {
        return new v();  // 初始化器: Lcom/google/firebase/crashlytics/internal/model/CrashlyticsReport$Builder;-><init>()V
    }

    @NonNull
    public abstract String getBuildVersion();

    @NonNull
    public abstract String getDisplayVersion();

    @NonNull
    public abstract String getGmpAppId();

    @NonNull
    public abstract String getInstallationUuid();

    @Nullable
    public abstract FilesPayload getNdkPayload();

    public abstract int getPlatform();

    @NonNull
    public abstract String getSdkVersion();

    @Nullable
    public abstract Session getSession();

    @Ignore
    public Type getType() {
        if(this.getSession() != null) {
            return Type.JAVA;
        }
        return this.getNdkPayload() == null ? Type.INCOMPLETE : Type.NATIVE;
    }

    @NonNull
    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder toBuilder();

    @NonNull
    public CrashlyticsReport withEvents(@NonNull ImmutableList immutableList0) {
        if(this.getSession() == null) {
            throw new IllegalStateException("Reports without sessions cannot have events added to them.");
        }
        return this.toBuilder().setSession(this.getSession().toBuilder().setEvents(immutableList0).build()).build();
    }

    @NonNull
    public CrashlyticsReport withNdkPayload(@NonNull FilesPayload crashlyticsReport$FilesPayload0) {
        return this.toBuilder().setSession(null).setNdkPayload(crashlyticsReport$FilesPayload0).build();
    }

    @NonNull
    public CrashlyticsReport withOrganizationId(@NonNull String s) {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder crashlyticsReport$Builder0 = this.toBuilder();
        FilesPayload crashlyticsReport$FilesPayload0 = this.getNdkPayload();
        if(crashlyticsReport$FilesPayload0 != null) {
            b0 b00 = crashlyticsReport$FilesPayload0.a();
            b00.b = s;
            crashlyticsReport$Builder0.setNdkPayload(b00.build());
        }
        Session crashlyticsReport$Session0 = this.getSession();
        if(crashlyticsReport$Session0 != null) {
            Application crashlyticsReport$Session$Application0 = crashlyticsReport$Session0.getApp();
            Organization crashlyticsReport$Session$Application$Organization0 = crashlyticsReport$Session$Application0.getOrganization();
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization.Builder crashlyticsReport$Session$Application$Organization$Builder0 = crashlyticsReport$Session$Application$Organization0 == null ? Organization.builder() : crashlyticsReport$Session$Application$Organization0.toBuilder();
            Application crashlyticsReport$Session$Application1 = crashlyticsReport$Session$Application0.toBuilder().setOrganization(crashlyticsReport$Session$Application$Organization$Builder0.setClsId(s).build()).build();
            crashlyticsReport$Builder0.setSession(crashlyticsReport$Session0.toBuilder().setApp(crashlyticsReport$Session$Application1).build());
        }
        return crashlyticsReport$Builder0.build();
    }

    @NonNull
    public CrashlyticsReport withSessionEndFields(long v, boolean z, @Nullable String s) {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder crashlyticsReport$Builder0 = this.toBuilder();
        if(this.getSession() != null) {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder crashlyticsReport$Session$Builder0 = this.getSession().toBuilder();
            crashlyticsReport$Session$Builder0.setEndedAt(v);
            crashlyticsReport$Session$Builder0.setCrashed(z);
            if(s != null) {
                crashlyticsReport$Session$Builder0.setUser(User.builder().setIdentifier(s).build());
            }
            crashlyticsReport$Builder0.setSession(crashlyticsReport$Session$Builder0.build());
        }
        return crashlyticsReport$Builder0.build();
    }
}

