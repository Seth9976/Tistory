package com.google.gson.stream;

import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.bind.JsonTreeReader;

public final class a extends JsonReaderInternalAccess {
    @Override  // com.google.gson.internal.JsonReaderInternalAccess
    public final void promoteNameToValue(JsonReader jsonReader0) {
        if(jsonReader0 instanceof JsonTreeReader) {
            ((JsonTreeReader)jsonReader0).promoteNameToValue();
            return;
        }
        switch((jsonReader0.h == 0 ? jsonReader0.b() : jsonReader0.h)) {
            case 12: {
                jsonReader0.h = 8;
                return;
            }
            case 13: {
                jsonReader0.h = 9;
                return;
            }
            case 14: {
                jsonReader0.h = 10;
                return;
            }
            default: {
                throw new IllegalStateException("Expected a name but was " + jsonReader0.peek() + jsonReader0.f());
            }
        }
    }
}

