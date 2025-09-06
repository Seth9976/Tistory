package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.Base64;
import android.util.JsonReader;
import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.ImmutableList;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

public class CrashlyticsReportJsonTransform {
    interface ObjectParser {
        Object parse(@NonNull JsonReader arg1) throws IOException;
    }

    public static final DataEncoder a;

    static {
        CrashlyticsReportJsonTransform.a = new JsonDataEncoderBuilder().configureWith(AutoCrashlyticsReportEncoder.CONFIG).ignoreNullValues(true).build();
    }

    public static Frame a(JsonReader jsonReader0) {
        Builder crashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder0 = Frame.builder();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.getClass();
            switch(s) {
                case "file": {
                    crashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder0.setFile(jsonReader0.nextString());
                    break;
                }
                case "importance": {
                    crashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder0.setImportance(jsonReader0.nextInt());
                    break;
                }
                case "offset": {
                    crashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder0.setOffset(jsonReader0.nextLong());
                    break;
                }
                case "pc": {
                    crashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder0.setPc(jsonReader0.nextLong());
                    break;
                }
                case "symbol": {
                    crashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder0.setSymbol(jsonReader0.nextString());
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return crashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder0.build();
    }

    @NonNull
    public ApplicationExitInfo applicationExitInfoFromJson(@NonNull String s) throws IOException {
        try(JsonReader jsonReader0 = new JsonReader(new StringReader(s))) {
            return CrashlyticsReportJsonTransform.c(jsonReader0);
        }
        catch(IllegalStateException illegalStateException0) {
            throw new IOException(illegalStateException0);
        }
    }

    @NonNull
    public String applicationExitInfoToJson(@NonNull ApplicationExitInfo crashlyticsReport$ApplicationExitInfo0) {
        return CrashlyticsReportJsonTransform.a.encode(crashlyticsReport$ApplicationExitInfo0);
    }

    public static CustomAttribute b(JsonReader jsonReader0) {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder crashlyticsReport$CustomAttribute$Builder0 = CustomAttribute.builder();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.getClass();
            if(s.equals("key")) {
                crashlyticsReport$CustomAttribute$Builder0.setKey(jsonReader0.nextString());
            }
            else if(s.equals("value")) {
                crashlyticsReport$CustomAttribute$Builder0.setValue(jsonReader0.nextString());
            }
            else {
                jsonReader0.skipValue();
            }
        }
        jsonReader0.endObject();
        return crashlyticsReport$CustomAttribute$Builder0.build();
    }

    public static ApplicationExitInfo c(JsonReader jsonReader0) {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder crashlyticsReport$ApplicationExitInfo$Builder0 = ApplicationExitInfo.builder();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.getClass();
            switch(s) {
                case "importance": {
                    crashlyticsReport$ApplicationExitInfo$Builder0.setImportance(jsonReader0.nextInt());
                    break;
                }
                case "pid": {
                    crashlyticsReport$ApplicationExitInfo$Builder0.setPid(jsonReader0.nextInt());
                    break;
                }
                case "processName": {
                    crashlyticsReport$ApplicationExitInfo$Builder0.setProcessName(jsonReader0.nextString());
                    break;
                }
                case "pss": {
                    crashlyticsReport$ApplicationExitInfo$Builder0.setPss(jsonReader0.nextLong());
                    break;
                }
                case "reasonCode": {
                    crashlyticsReport$ApplicationExitInfo$Builder0.setReasonCode(jsonReader0.nextInt());
                    break;
                }
                case "rss": {
                    crashlyticsReport$ApplicationExitInfo$Builder0.setRss(jsonReader0.nextLong());
                    break;
                }
                case "timestamp": {
                    crashlyticsReport$ApplicationExitInfo$Builder0.setTimestamp(jsonReader0.nextLong());
                    break;
                }
                case "traceFile": {
                    crashlyticsReport$ApplicationExitInfo$Builder0.setTraceFile(jsonReader0.nextString());
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return crashlyticsReport$ApplicationExitInfo$Builder0.build();
    }

    public static ImmutableList d(JsonReader jsonReader0, ObjectParser crashlyticsReportJsonTransform$ObjectParser0) {
        ArrayList arrayList0 = new ArrayList();
        jsonReader0.beginArray();
        while(jsonReader0.hasNext()) {
            arrayList0.add(crashlyticsReportJsonTransform$ObjectParser0.parse(jsonReader0));
        }
        jsonReader0.endArray();
        return ImmutableList.from(arrayList0);
    }

    // This method was un-flattened
    public static Event e(JsonReader jsonReader0) {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder crashlyticsReport$Session$Event$Builder0 = Event.builder();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.getClass();
            switch(s) {
                case "app": {
                    com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder crashlyticsReport$Session$Event$Application$Builder0 = Application.builder();
                    jsonReader0.beginObject();
                    while(jsonReader0.hasNext()) {
                        String s2 = jsonReader0.nextName();
                        s2.getClass();
                        switch(s2) {
                            case "background": {
                                crashlyticsReport$Session$Event$Application$Builder0.setBackground(Boolean.valueOf(jsonReader0.nextBoolean()));
                                break;
                            }
                            case "customAttributes": {
                                ArrayList arrayList1 = new ArrayList();
                                jsonReader0.beginArray();
                                while(jsonReader0.hasNext()) {
                                    arrayList1.add(CrashlyticsReportJsonTransform.b(jsonReader0));
                                }
                                jsonReader0.endArray();
                                crashlyticsReport$Session$Event$Application$Builder0.setCustomAttributes(ImmutableList.from(arrayList1));
                                break;
                            }
                            case "execution": {
                                com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder crashlyticsReport$Session$Event$Application$Execution$Builder0 = Execution.builder();
                                jsonReader0.beginObject();
                                while(jsonReader0.hasNext()) {
                                    String s3 = jsonReader0.nextName();
                                    s3.getClass();
                                    switch(s3) {
                                        case "appExitInfo": {
                                            crashlyticsReport$Session$Event$Application$Execution$Builder0.setAppExitInfo(CrashlyticsReportJsonTransform.c(jsonReader0));
                                            break;
                                        }
                                        case "binaries": {
                                            crashlyticsReport$Session$Event$Application$Execution$Builder0.setBinaries(CrashlyticsReportJsonTransform.d(jsonReader0, new a(2)));
                                            break;
                                        }
                                        case "exception": {
                                            crashlyticsReport$Session$Event$Application$Execution$Builder0.setException(CrashlyticsReportJsonTransform.f(jsonReader0));
                                            break;
                                        }
                                        case "signal": {
                                            com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder crashlyticsReport$Session$Event$Application$Execution$Signal$Builder0 = Signal.builder();
                                            jsonReader0.beginObject();
                                            while(jsonReader0.hasNext()) {
                                                String s4 = jsonReader0.nextName();
                                                s4.getClass();
                                                switch(s4) {
                                                    case "address": {
                                                        crashlyticsReport$Session$Event$Application$Execution$Signal$Builder0.setAddress(jsonReader0.nextLong());
                                                        break;
                                                    }
                                                    case "code": {
                                                        crashlyticsReport$Session$Event$Application$Execution$Signal$Builder0.setCode(jsonReader0.nextString());
                                                        break;
                                                    }
                                                    case "name": {
                                                        crashlyticsReport$Session$Event$Application$Execution$Signal$Builder0.setName(jsonReader0.nextString());
                                                        break;
                                                    }
                                                    default: {
                                                        jsonReader0.skipValue();
                                                    }
                                                }
                                            }
                                            jsonReader0.endObject();
                                            crashlyticsReport$Session$Event$Application$Execution$Builder0.setSignal(crashlyticsReport$Session$Event$Application$Execution$Signal$Builder0.build());
                                            break;
                                        }
                                        case "threads": {
                                            crashlyticsReport$Session$Event$Application$Execution$Builder0.setThreads(CrashlyticsReportJsonTransform.d(jsonReader0, new a(1)));
                                            break;
                                        }
                                        default: {
                                            jsonReader0.skipValue();
                                        }
                                    }
                                }
                                jsonReader0.endObject();
                                crashlyticsReport$Session$Event$Application$Builder0.setExecution(crashlyticsReport$Session$Event$Application$Execution$Builder0.build());
                                break;
                            }
                            case "internalKeys": {
                                ArrayList arrayList0 = new ArrayList();
                                jsonReader0.beginArray();
                                while(jsonReader0.hasNext()) {
                                    arrayList0.add(CrashlyticsReportJsonTransform.b(jsonReader0));
                                }
                                jsonReader0.endArray();
                                crashlyticsReport$Session$Event$Application$Builder0.setInternalKeys(ImmutableList.from(arrayList0));
                                break;
                            }
                            case "uiOrientation": {
                                crashlyticsReport$Session$Event$Application$Builder0.setUiOrientation(jsonReader0.nextInt());
                                break;
                            }
                            default: {
                                jsonReader0.skipValue();
                            }
                        }
                    }
                    jsonReader0.endObject();
                    crashlyticsReport$Session$Event$Builder0.setApp(crashlyticsReport$Session$Event$Application$Builder0.build());
                    break;
                }
                case "device": {
                    com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder crashlyticsReport$Session$Event$Device$Builder0 = Device.builder();
                    jsonReader0.beginObject();
                    while(jsonReader0.hasNext()) {
                        String s1 = jsonReader0.nextName();
                        s1.getClass();
                        switch(s1) {
                            case "batteryLevel": {
                                crashlyticsReport$Session$Event$Device$Builder0.setBatteryLevel(jsonReader0.nextDouble());
                                break;
                            }
                            case "batteryVelocity": {
                                crashlyticsReport$Session$Event$Device$Builder0.setBatteryVelocity(jsonReader0.nextInt());
                                break;
                            }
                            case "diskUsed": {
                                crashlyticsReport$Session$Event$Device$Builder0.setDiskUsed(jsonReader0.nextLong());
                                break;
                            }
                            case "orientation": {
                                crashlyticsReport$Session$Event$Device$Builder0.setOrientation(jsonReader0.nextInt());
                                break;
                            }
                            case "proximityOn": {
                                crashlyticsReport$Session$Event$Device$Builder0.setProximityOn(jsonReader0.nextBoolean());
                                break;
                            }
                            case "ramUsed": {
                                crashlyticsReport$Session$Event$Device$Builder0.setRamUsed(jsonReader0.nextLong());
                                break;
                            }
                            default: {
                                jsonReader0.skipValue();
                            }
                        }
                    }
                    jsonReader0.endObject();
                    crashlyticsReport$Session$Event$Builder0.setDevice(crashlyticsReport$Session$Event$Device$Builder0.build());
                    break;
                }
                case "log": {
                    com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.Builder crashlyticsReport$Session$Event$Log$Builder0 = Log.builder();
                    jsonReader0.beginObject();
                    while(jsonReader0.hasNext()) {
                        String s5 = jsonReader0.nextName();
                        s5.getClass();
                        if(s5.equals("content")) {
                            crashlyticsReport$Session$Event$Log$Builder0.setContent(jsonReader0.nextString());
                        }
                        else {
                            jsonReader0.skipValue();
                        }
                    }
                    jsonReader0.endObject();
                    crashlyticsReport$Session$Event$Builder0.setLog(crashlyticsReport$Session$Event$Log$Builder0.build());
                    break;
                }
                case "timestamp": {
                    crashlyticsReport$Session$Event$Builder0.setTimestamp(jsonReader0.nextLong());
                    break;
                }
                case "type": {
                    crashlyticsReport$Session$Event$Builder0.setType(jsonReader0.nextString());
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return crashlyticsReport$Session$Event$Builder0.build();
    }

    @NonNull
    public Event eventFromJson(@NonNull String s) throws IOException {
        try(JsonReader jsonReader0 = new JsonReader(new StringReader(s))) {
            return CrashlyticsReportJsonTransform.e(jsonReader0);
        }
        catch(IllegalStateException illegalStateException0) {
            throw new IOException(illegalStateException0);
        }
    }

    @NonNull
    public String eventToJson(@NonNull Event crashlyticsReport$Session$Event0) {
        return CrashlyticsReportJsonTransform.a.encode(crashlyticsReport$Session$Event0);
    }

    public static Exception f(JsonReader jsonReader0) {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder crashlyticsReport$Session$Event$Application$Execution$Exception$Builder0 = Exception.builder();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.getClass();
            switch(s) {
                case "causedBy": {
                    crashlyticsReport$Session$Event$Application$Execution$Exception$Builder0.setCausedBy(CrashlyticsReportJsonTransform.f(jsonReader0));
                    break;
                }
                case "frames": {
                    ArrayList arrayList0 = new ArrayList();
                    jsonReader0.beginArray();
                    while(jsonReader0.hasNext()) {
                        arrayList0.add(CrashlyticsReportJsonTransform.a(jsonReader0));
                    }
                    jsonReader0.endArray();
                    crashlyticsReport$Session$Event$Application$Execution$Exception$Builder0.setFrames(ImmutableList.from(arrayList0));
                    break;
                }
                case "overflowCount": {
                    crashlyticsReport$Session$Event$Application$Execution$Exception$Builder0.setOverflowCount(jsonReader0.nextInt());
                    break;
                }
                case "reason": {
                    crashlyticsReport$Session$Event$Application$Execution$Exception$Builder0.setReason(jsonReader0.nextString());
                    break;
                }
                case "type": {
                    crashlyticsReport$Session$Event$Application$Execution$Exception$Builder0.setType(jsonReader0.nextString());
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return crashlyticsReport$Session$Event$Application$Execution$Exception$Builder0.build();
    }

    // This method was un-flattened
    public static CrashlyticsReport g(JsonReader jsonReader0) {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder crashlyticsReport$Session$Builder0;
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder crashlyticsReport$Builder0 = CrashlyticsReport.builder();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.getClass();
        alab1:
            switch(s) {
                case "buildVersion": {
                    crashlyticsReport$Builder0.setBuildVersion(jsonReader0.nextString());
                    continue;
                }
                case "displayVersion": {
                    crashlyticsReport$Builder0.setDisplayVersion(jsonReader0.nextString());
                    continue;
                }
                case "gmpAppId": {
                    crashlyticsReport$Builder0.setGmpAppId(jsonReader0.nextString());
                    continue;
                }
                case "installationUuid": {
                    crashlyticsReport$Builder0.setInstallationUuid(jsonReader0.nextString());
                    continue;
                }
                case "ndkPayload": {
                    com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder crashlyticsReport$FilesPayload$Builder0 = FilesPayload.builder();
                    jsonReader0.beginObject();
                    while(jsonReader0.hasNext()) {
                        String s1 = jsonReader0.nextName();
                        s1.getClass();
                        if(s1.equals("files")) {
                            crashlyticsReport$FilesPayload$Builder0.setFiles(CrashlyticsReportJsonTransform.d(jsonReader0, new a(0)));
                        }
                        else if(s1.equals("orgId")) {
                            crashlyticsReport$FilesPayload$Builder0.setOrgId(jsonReader0.nextString());
                        }
                        else {
                            jsonReader0.skipValue();
                        }
                    }
                    jsonReader0.endObject();
                    crashlyticsReport$Builder0.setNdkPayload(crashlyticsReport$FilesPayload$Builder0.build());
                    continue;
                }
                case "platform": {
                    crashlyticsReport$Builder0.setPlatform(jsonReader0.nextInt());
                    continue;
                }
                case "sdkVersion": {
                    crashlyticsReport$Builder0.setSdkVersion(jsonReader0.nextString());
                    continue;
                }
                case "session": {
                    crashlyticsReport$Session$Builder0 = Session.builder();
                    jsonReader0.beginObject();
                    while(true) {
                        if(!jsonReader0.hasNext()) {
                            break alab1;
                        }
                        String s2 = jsonReader0.nextName();
                        s2.getClass();
                        switch(s2) {
                            case "app": {
                                com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder crashlyticsReport$Session$Application$Builder0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.builder();
                                jsonReader0.beginObject();
                                while(jsonReader0.hasNext()) {
                                    String s5 = jsonReader0.nextName();
                                    s5.getClass();
                                    switch(s5) {
                                        case "developmentPlatform": {
                                            crashlyticsReport$Session$Application$Builder0.setDevelopmentPlatform(jsonReader0.nextString());
                                            break;
                                        }
                                        case "developmentPlatformVersion": {
                                            crashlyticsReport$Session$Application$Builder0.setDevelopmentPlatformVersion(jsonReader0.nextString());
                                            break;
                                        }
                                        case "displayVersion": {
                                            crashlyticsReport$Session$Application$Builder0.setDisplayVersion(jsonReader0.nextString());
                                            break;
                                        }
                                        case "identifier": {
                                            crashlyticsReport$Session$Application$Builder0.setIdentifier(jsonReader0.nextString());
                                            break;
                                        }
                                        case "installationUuid": {
                                            crashlyticsReport$Session$Application$Builder0.setInstallationUuid(jsonReader0.nextString());
                                            break;
                                        }
                                        case "version": {
                                            crashlyticsReport$Session$Application$Builder0.setVersion(jsonReader0.nextString());
                                            break;
                                        }
                                        default: {
                                            jsonReader0.skipValue();
                                        }
                                    }
                                }
                                jsonReader0.endObject();
                                crashlyticsReport$Session$Builder0.setApp(crashlyticsReport$Session$Application$Builder0.build());
                                break;
                            }
                            case "crashed": {
                                crashlyticsReport$Session$Builder0.setCrashed(jsonReader0.nextBoolean());
                                break;
                            }
                            case "device": {
                                com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder crashlyticsReport$Session$Device$Builder0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.builder();
                                jsonReader0.beginObject();
                                while(jsonReader0.hasNext()) {
                                    String s3 = jsonReader0.nextName();
                                    s3.getClass();
                                    switch(s3) {
                                        case "arch": {
                                            crashlyticsReport$Session$Device$Builder0.setArch(jsonReader0.nextInt());
                                            break;
                                        }
                                        case "cores": {
                                            crashlyticsReport$Session$Device$Builder0.setCores(jsonReader0.nextInt());
                                            break;
                                        }
                                        case "diskSpace": {
                                            crashlyticsReport$Session$Device$Builder0.setDiskSpace(jsonReader0.nextLong());
                                            break;
                                        }
                                        case "manufacturer": {
                                            crashlyticsReport$Session$Device$Builder0.setManufacturer(jsonReader0.nextString());
                                            break;
                                        }
                                        case "model": {
                                            crashlyticsReport$Session$Device$Builder0.setModel(jsonReader0.nextString());
                                            break;
                                        }
                                        case "modelClass": {
                                            crashlyticsReport$Session$Device$Builder0.setModelClass(jsonReader0.nextString());
                                            break;
                                        }
                                        case "ram": {
                                            crashlyticsReport$Session$Device$Builder0.setRam(jsonReader0.nextLong());
                                            break;
                                        }
                                        case "simulator": {
                                            crashlyticsReport$Session$Device$Builder0.setSimulator(jsonReader0.nextBoolean());
                                            break;
                                        }
                                        case "state": {
                                            crashlyticsReport$Session$Device$Builder0.setState(jsonReader0.nextInt());
                                            break;
                                        }
                                        default: {
                                            jsonReader0.skipValue();
                                        }
                                    }
                                }
                                jsonReader0.endObject();
                                crashlyticsReport$Session$Builder0.setDevice(crashlyticsReport$Session$Device$Builder0.build());
                                break;
                            }
                            case "endedAt": {
                                crashlyticsReport$Session$Builder0.setEndedAt(jsonReader0.nextLong());
                                break;
                            }
                            case "events": {
                                ArrayList arrayList0 = new ArrayList();
                                jsonReader0.beginArray();
                                while(jsonReader0.hasNext()) {
                                    arrayList0.add(CrashlyticsReportJsonTransform.e(jsonReader0));
                                }
                                jsonReader0.endArray();
                                crashlyticsReport$Session$Builder0.setEvents(ImmutableList.from(arrayList0));
                                break;
                            }
                            case "generator": {
                                crashlyticsReport$Session$Builder0.setGenerator(jsonReader0.nextString());
                                break;
                            }
                            case "generatorType": {
                                crashlyticsReport$Session$Builder0.setGeneratorType(jsonReader0.nextInt());
                                break;
                            }
                            case "identifier": {
                                crashlyticsReport$Session$Builder0.setIdentifierFromUtf8Bytes(Base64.decode(jsonReader0.nextString(), 2));
                                break;
                            }
                            case "os": {
                                com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder crashlyticsReport$Session$OperatingSystem$Builder0 = OperatingSystem.builder();
                                jsonReader0.beginObject();
                                while(jsonReader0.hasNext()) {
                                    String s4 = jsonReader0.nextName();
                                    s4.getClass();
                                    switch(s4) {
                                        case "buildVersion": {
                                            crashlyticsReport$Session$OperatingSystem$Builder0.setBuildVersion(jsonReader0.nextString());
                                            break;
                                        }
                                        case "jailbroken": {
                                            crashlyticsReport$Session$OperatingSystem$Builder0.setJailbroken(jsonReader0.nextBoolean());
                                            break;
                                        }
                                        case "platform": {
                                            crashlyticsReport$Session$OperatingSystem$Builder0.setPlatform(jsonReader0.nextInt());
                                            break;
                                        }
                                        case "version": {
                                            crashlyticsReport$Session$OperatingSystem$Builder0.setVersion(jsonReader0.nextString());
                                            break;
                                        }
                                        default: {
                                            jsonReader0.skipValue();
                                        }
                                    }
                                }
                                jsonReader0.endObject();
                                crashlyticsReport$Session$Builder0.setOs(crashlyticsReport$Session$OperatingSystem$Builder0.build());
                                break;
                            }
                            case "startedAt": {
                                crashlyticsReport$Session$Builder0.setStartedAt(jsonReader0.nextLong());
                                break;
                            }
                            case "user": {
                                com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder crashlyticsReport$Session$User$Builder0 = User.builder();
                                jsonReader0.beginObject();
                                while(jsonReader0.hasNext()) {
                                    String s6 = jsonReader0.nextName();
                                    s6.getClass();
                                    if(s6.equals("identifier")) {
                                        crashlyticsReport$Session$User$Builder0.setIdentifier(jsonReader0.nextString());
                                    }
                                    else {
                                        jsonReader0.skipValue();
                                    }
                                }
                                jsonReader0.endObject();
                                crashlyticsReport$Session$Builder0.setUser(crashlyticsReport$Session$User$Builder0.build());
                                break;
                            }
                            default: {
                                jsonReader0.skipValue();
                            }
                        }
                    }
                }
                default: {
                    jsonReader0.skipValue();
                    continue;
                }
            }
            jsonReader0.endObject();
            crashlyticsReport$Builder0.setSession(crashlyticsReport$Session$Builder0.build());
        }
        jsonReader0.endObject();
        return crashlyticsReport$Builder0.build();
    }

    @NonNull
    public CrashlyticsReport reportFromJson(@NonNull String s) throws IOException {
        try(JsonReader jsonReader0 = new JsonReader(new StringReader(s))) {
            return CrashlyticsReportJsonTransform.g(jsonReader0);
        }
        catch(IllegalStateException illegalStateException0) {
            throw new IOException(illegalStateException0);
        }
    }

    @NonNull
    public String reportToJson(@NonNull CrashlyticsReport crashlyticsReport0) {
        return CrashlyticsReportJsonTransform.a.encode(crashlyticsReport0);
    }
}

