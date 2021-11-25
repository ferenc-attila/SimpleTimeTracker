package service.recording;

import datahandling.data.Recording;

import java.time.LocalDateTime;

public class StopRecording {

    public void stopRecording(Recording recording) {
        recording.setEndTime(LocalDateTime.now());
    }

    public StringBuilder printStopMessage(Recording recording) {
        StringBuilder message = new StringBuilder();
        message.append("Recording ended with parameters below:\n");
        message.append(recording.toString());
        return message;
    }
}