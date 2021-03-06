/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.eventbridge.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.eventbridge.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartReplayRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartReplayRequestMarshaller {

    private static final MarshallingInfo<String> REPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplayName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> EVENTSOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventSourceArn").build();
    private static final MarshallingInfo<java.util.Date> EVENTSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> EVENTENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventEndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> DESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Destination").build();

    private static final StartReplayRequestMarshaller instance = new StartReplayRequestMarshaller();

    public static StartReplayRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartReplayRequest startReplayRequest, ProtocolMarshaller protocolMarshaller) {

        if (startReplayRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startReplayRequest.getReplayName(), REPLAYNAME_BINDING);
            protocolMarshaller.marshall(startReplayRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(startReplayRequest.getEventSourceArn(), EVENTSOURCEARN_BINDING);
            protocolMarshaller.marshall(startReplayRequest.getEventStartTime(), EVENTSTARTTIME_BINDING);
            protocolMarshaller.marshall(startReplayRequest.getEventEndTime(), EVENTENDTIME_BINDING);
            protocolMarshaller.marshall(startReplayRequest.getDestination(), DESTINATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
