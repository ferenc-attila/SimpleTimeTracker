package datahandling.writedata;

import datahandling.data.Recording;
import datahandling.data.RecordingList;

import java.util.ArrayList;
import java.util.List;

public class CreateCsvData {

    public List<String> writeCsvData(RecordingList recordingList) {
        List<String> fileContent = new ArrayList<>();
        List<Recording> list = recordingList.getRecordings();
        for (Recording recording : list) {
            fileContent.add(recording.toCsvRow());
        }
        return fileContent;
    }
}
