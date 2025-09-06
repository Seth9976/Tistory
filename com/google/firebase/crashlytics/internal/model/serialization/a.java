package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.Base64;
import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread;

public final class a implements ObjectParser {
    public final int a;

    public a(int v) {
        this.a = v;
        super();
    }

    // This method was un-flattened
    @Override  // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$ObjectParser
    public final Object parse(JsonReader jsonReader0) {
        switch(this.a) {
            case 0: {
                Builder crashlyticsReport$FilesPayload$File$Builder0 = File.builder();
                jsonReader0.beginObject();
                while(jsonReader0.hasNext()) {
                    String s = jsonReader0.nextName();
                    s.getClass();
                    if(s.equals("filename")) {
                        crashlyticsReport$FilesPayload$File$Builder0.setFilename(jsonReader0.nextString());
                    }
                    else if(s.equals("contents")) {
                        crashlyticsReport$FilesPayload$File$Builder0.setContents(Base64.decode(jsonReader0.nextString(), 2));
                    }
                    else {
                        jsonReader0.skipValue();
                    }
                }
                jsonReader0.endObject();
                return crashlyticsReport$FilesPayload$File$Builder0.build();
            }
            case 1: {
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder crashlyticsReport$Session$Event$Application$Execution$Thread$Builder0 = Thread.builder();
                jsonReader0.beginObject();
                while(jsonReader0.hasNext()) {
                    String s1 = jsonReader0.nextName();
                    s1.getClass();
                    switch(s1) {
                        case "frames": {
                            crashlyticsReport$Session$Event$Application$Execution$Thread$Builder0.setFrames(CrashlyticsReportJsonTransform.d(jsonReader0, new a(3)));
                            break;
                        }
                        case "importance": {
                            crashlyticsReport$Session$Event$Application$Execution$Thread$Builder0.setImportance(jsonReader0.nextInt());
                            break;
                        }
                        case "name": {
                            crashlyticsReport$Session$Event$Application$Execution$Thread$Builder0.setName(jsonReader0.nextString());
                            break;
                        }
                        default: {
                            jsonReader0.skipValue();
                        }
                    }
                }
                jsonReader0.endObject();
                return crashlyticsReport$Session$Event$Application$Execution$Thread$Builder0.build();
            }
            case 2: {
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder crashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder0 = BinaryImage.builder();
                jsonReader0.beginObject();
                while(jsonReader0.hasNext()) {
                    String s2 = jsonReader0.nextName();
                    s2.getClass();
                    switch(s2) {
                        case "baseAddress": {
                            crashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder0.setBaseAddress(jsonReader0.nextLong());
                            break;
                        }
                        case "name": {
                            crashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder0.setName(jsonReader0.nextString());
                            break;
                        }
                        case "size": {
                            crashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder0.setSize(jsonReader0.nextLong());
                            break;
                        }
                        case "uuid": {
                            crashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder0.setUuidFromUtf8Bytes(Base64.decode(jsonReader0.nextString(), 2));
                            break;
                        }
                        default: {
                            jsonReader0.skipValue();
                        }
                    }
                }
                jsonReader0.endObject();
                return crashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder0.build();
            }
            default: {
                return CrashlyticsReportJsonTransform.a(jsonReader0);
            }
        }
    }
}

